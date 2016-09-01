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
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.ServicioTransporteConstantesFunciones;

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
public class ServicioTransporteDetalleFormJInternalFrame extends ServicioTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleServicioTransporte;
	
	protected JMenuBar jmenuBarDetalleServicioTransporte;
	
	protected JMenu jmenuDetalleServicioTransporte;
	protected JMenu jmenuDetalleArchivoServicioTransporte;
	protected JMenu jmenuDetalleAccionesServicioTransporte;
	protected JMenu jmenuDetalleDatosServicioTransporte;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutServicioTransporte;	
	protected GridBagConstraints gridBagConstraintsServicioTransporte;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ServicioTransporteBeanSwingJInternalFrameAdditional jInternalFrameDetalleServicioTransporte;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedor="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vehiculo="";

	protected RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rutatransporte="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";
	
	public ServicioTransporteSessionBean serviciotransporteSessionBean;
	
	

	public DetalleServicioTransporteBeanSwingJInternalFrame detalleserviciotransporteBeanSwingJInternalFrame=null;
	public DetalleServicioTransporteBeanSwingJInternalFrame detalleserviciotransporteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleServicioTransporte=false;
	public DetalleServicioTransporteSessionBean detalleserviciotransporteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public VehiculoSessionBean vehiculoSessionBean;
	public RutaTransporteSessionBean rutatransporteSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;	
	
	public ServicioTransporteLogic serviciotransporteLogic;
	
	public JScrollPane jScrollPanelDatosServicioTransporte;
	public JScrollPane jScrollPanelDatosEdicionServicioTransporte;
	public JScrollPane jScrollPanelDatosGeneralServicioTransporte;
	
	protected JPanel jPanelCamposServicioTransporte;    
	protected JPanel jPanelCamposOcultosServicioTransporte;    	
	protected JPanel jPanelAccionesServicioTransporte;
	protected JPanel jPanelAccionesFormularioServicioTransporte;
    
	
	
	protected Integer iXPanelCamposServicioTransporte=0;
	protected Integer iYPanelCamposServicioTransporte=0;
	
	protected Integer iXPanelCamposOcultosServicioTransporte=0;
	protected Integer iYPanelCamposOcultosServicioTransporte=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoServicioTransporte;
	public JButton jButtonModificarServicioTransporte;
	public JButton jButtonActualizarServicioTransporte;
    public JButton jButtonEliminarServicioTransporte;
	public JButton jButtonCancelarServicioTransporte;
    public JButton jButtonGuardarCambiosServicioTransporte;
	public JButton jButtonGuardarCambiosTablaServicioTransporte;
	protected JButton jButtonCerrarServicioTransporte;
	
	
	protected JButton jButtonProcesarInformacionServicioTransporte;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoServicioTransporte;
	protected JCheckBox jCheckBoxPostAccionSinCerrarServicioTransporte;
	protected JCheckBox jCheckBoxPostAccionSinMensajeServicioTransporte;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarServicioTransporte;
	protected JButton jButtonModificarToolBarServicioTransporte;
	protected JButton jButtonActualizarToolBarServicioTransporte;
    protected JButton jButtonEliminarToolBarServicioTransporte;
	protected JButton jButtonCancelarToolBarServicioTransporte;
    protected JButton jButtonGuardarCambiosToolBarServicioTransporte;
	protected JButton jButtonGuardarCambiosTablaToolBarServicioTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarServicioTransporte;
	protected JButton jButtonCerrarToolBarServicioTransporte;
	
	protected JButton jButtonProcesarInformacionToolBarServicioTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoServicioTransporte;
	protected JMenuItem jMenuItemModificarServicioTransporte;
	protected JMenuItem jMenuItemActualizarServicioTransporte;
    protected JMenuItem jMenuItemEliminarServicioTransporte;
	protected JMenuItem jMenuItemCancelarServicioTransporte;
    protected JMenuItem jMenuItemGuardarCambiosServicioTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaServicioTransporte;
	protected JMenuItem jMenuItemCerrarServicioTransporte;
	protected JMenuItem jMenuItemDetalleCerrarServicioTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarServicioTransporte;
	
	protected JMenuItem jMenuItemProcesarInformacionServicioTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosServicioTransporte;
	protected JMenuItem jMenuItemMostrarOcultarServicioTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesServicioTransporte;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesServicioTransporte;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioServicioTransporte;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidServicioTransporte;
	public JLabel jLabelIdServicioTransporte;
	public JLabel jLabelidServicioTransporte;
	public JButton jButtonidServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ingresoServicioTransporte;
	public JLabel jLabelfecha_ingresoServicioTransporte;
	//public JFormattedTextField jDateChooserfecha_ingresoServicioTransporte;

	public JDateChooser jDateChooserfecha_ingresoServicioTransporte;
	public JButton jButtonfecha_ingresoServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaServicioTransporte;
	public JLabel jLabelfecha_entregaServicioTransporte;
	//public JFormattedTextField jDateChooserfecha_entregaServicioTransporte;

	public JDateChooser jDateChooserfecha_entregaServicioTransporte;
	public JButton jButtonfecha_entregaServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_guia1ServicioTransporte;
	public JLabel jLabelcodigo_guia1ServicioTransporte;
	public JTextArea jTextAreacodigo_guia1ServicioTransporte;
	public JScrollPane jscrollPanecodigo_guia1ServicioTransporte;
	public JButton jButtoncodigo_guia1ServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_guia2ServicioTransporte;
	public JLabel jLabelcodigo_guia2ServicioTransporte;
	public JTextArea jTextAreacodigo_guia2ServicioTransporte;
	public JScrollPane jscrollPanecodigo_guia2ServicioTransporte;
	public JButton jButtoncodigo_guia2ServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelprecioServicioTransporte;
	public JLabel jLabelprecioServicioTransporte;
	public JTextField jTextFieldprecioServicioTransporte;
	public JButton jButtonprecioServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_ivaServicioTransporte;
	public JLabel jLabelvalor_ivaServicioTransporte;
	public JTextField jTextFieldvalor_ivaServicioTransporte;
	public JButton jButtonvalor_ivaServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_totalServicioTransporte;
	public JLabel jLabelvalor_totalServicioTransporte;
	public JTextField jTextFieldvalor_totalServicioTransporte;
	public JButton jButtonvalor_totalServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionServicioTransporte;
	public JLabel jLabeldescripcionServicioTransporte;
	public JTextArea jTextAreadescripcionServicioTransporte;
	public JScrollPane jscrollPanedescripcionServicioTransporte;
	public JButton jButtondescripcionServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaServicioTransporte;
	public JLabel jLabelid_empresaServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaServicioTransporte;
	public JButton jButtonid_empresaServicioTransporte= new JButtonMe();
	public JButton jButtonid_empresaServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_empresaServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalServicioTransporte;
	public JLabel jLabelid_sucursalServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalServicioTransporte;
	public JButton jButtonid_sucursalServicioTransporte= new JButtonMe();
	public JButton jButtonid_sucursalServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioServicioTransporte;
	public JLabel jLabelid_ejercicioServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioServicioTransporte;
	public JButton jButtonid_ejercicioServicioTransporte= new JButtonMe();
	public JButton jButtonid_ejercicioServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoServicioTransporte;
	public JLabel jLabelid_periodoServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoServicioTransporte;
	public JButton jButtonid_periodoServicioTransporte= new JButtonMe();
	public JButton jButtonid_periodoServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_periodoServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteServicioTransporte;
	public JLabel jLabelid_clienteServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteServicioTransporte;
	public JButton jButtonid_clienteServicioTransporte= new JButtonMe();
	public JButton jButtonid_clienteServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_clienteServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_cliente_proveedorServicioTransporte;
	public JLabel jLabelid_cliente_proveedorServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorServicioTransporte;
	public JButton jButtonid_cliente_proveedorServicioTransporte= new JButtonMe();
	public JButton jButtonid_cliente_proveedorServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaServicioTransporte;
	public JLabel jLabelid_transportistaServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaServicioTransporte;
	public JButton jButtonid_transportistaServicioTransporte= new JButtonMe();
	public JButton jButtonid_transportistaServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_transportistaServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_vehiculoServicioTransporte;
	public JLabel jLabelid_vehiculoServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vehiculoServicioTransporte;
	public JButton jButtonid_vehiculoServicioTransporte= new JButtonMe();
	public JButton jButtonid_vehiculoServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_vehiculoServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_ruta_transporteServicioTransporte;
	public JLabel jLabelid_ruta_transporteServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ruta_transporteServicioTransporte;
	public JButton jButtonid_ruta_transporteServicioTransporte= new JButtonMe();
	public JButton jButtonid_ruta_transporteServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_ruta_transporteServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoServicioTransporte;
	public JLabel jLabelid_detalle_activo_fijoServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoServicioTransporte;
	public JButton jButtonid_detalle_activo_fijoServicioTransporte= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoServicioTransporteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesServicioTransporte;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ServicioTransporteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposServicioTransporte=new JPanel();
				this.jPanelAccionesFormularioServicioTransporte=new JPanel();
				this.jmenuBarDetalleServicioTransporte=new JMenuBar();
				this.jTtoolBarDetalleServicioTransporte=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ServicioTransporteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarServicioTransporte() {
		return this.jButtonActualizarToolBarServicioTransporte;
	}
	
	public JButton getjButtonEliminarToolBarServicioTransporte() {
		return this.jButtonEliminarToolBarServicioTransporte;
	}
	
	public JButton getjButtonCancelarToolBarServicioTransporte() {
		return this.jButtonCancelarToolBarServicioTransporte;
	}		
	
	public JButton getjButtonProcesarInformacionServicioTransporte() {
		return this.jButtonProcesarInformacionServicioTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionServicioTransporte)	{
		this.jButtonProcesarInformacionServicioTransporte = jButtonProcesarInformacionServicioTransporte;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesServicioTransporte() {
		return this.jComboBoxTiposAccionesServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesServicioTransporte(
			JComboBox jComboBoxTiposRelacionesServicioTransporte) {
		this.jComboBoxTiposRelacionesServicioTransporte = jComboBoxTiposRelacionesServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesServicioTransporte(
			JComboBox jComboBoxTiposAccionesServicioTransporte) {
		this.jComboBoxTiposAccionesServicioTransporte = jComboBoxTiposAccionesServicioTransporte;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioServicioTransporte() {
		return this.jComboBoxTiposAccionesFormularioServicioTransporte;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioServicioTransporte(
			JComboBox jComboBoxTiposAccionesFormularioServicioTransporte) {
		this.jComboBoxTiposAccionesFormularioServicioTransporte = jComboBoxTiposAccionesFormularioServicioTransporte;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		
		this.serviciotransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.serviciotransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.serviciotransporteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ServicioTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Servicio Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
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
	
		ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleServicioTransporte= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarServicioTransporte=new JButtonMe();
				this.jButtonModificarToolBarServicioTransporte=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"actualizar","actualizar","Actualizar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"eliminar","eliminar","Eliminar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"cancelar","cancelar","Cancelar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"guardarcambios","guardarcambios","Guardar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleServicioTransporte=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleServicioTransporte=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoServicioTransporte=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesServicioTransporte=new JMenuMe("Acciones");
		this.jmenuDetalleDatosServicioTransporte=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoServicioTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoServicioTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoServicioTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarServicioTransporte= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarServicioTransporte.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarServicioTransporte,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarServicioTransporte= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarServicioTransporte.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarServicioTransporte,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarServicioTransporte= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarServicioTransporte.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarServicioTransporte,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarServicioTransporte= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarServicioTransporte.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarServicioTransporte,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosServicioTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosServicioTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosServicioTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarServicioTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarServicioTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarServicioTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarServicioTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarServicioTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarServicioTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoServicioTransporte.add(this.jMenuItemDetalleCerrarServicioTransporte);
		
		this.jmenuDetalleAccionesServicioTransporte.add(this.jMenuItemActualizarServicioTransporte);
		this.jmenuDetalleAccionesServicioTransporte.add(this.jMenuItemEliminarServicioTransporte);
		this.jmenuDetalleAccionesServicioTransporte.add(this.jMenuItemCancelarServicioTransporte);		
		
		//this.jmenuDetalleDatosServicioTransporte.add(this.jMenuItemDetalleAbrirOrderByServicioTransporte);				
		this.jmenuDetalleDatosServicioTransporte.add(this.jMenuItemDetalleMostarOcultarServicioTransporte);				
				
		//this.jmenuDetalleAccionesServicioTransporte.add(this.jMenuItemGuardarCambiosServicioTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleServicioTransporte.add(this.jmenuDetalleArchivoServicioTransporte);		
		this.jmenuBarDetalleServicioTransporte.add(this.jmenuDetalleAccionesServicioTransporte);		
		this.jmenuBarDetalleServicioTransporte.add(this.jmenuDetalleDatosServicioTransporte);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleServicioTransporte.add(this.jmenuDetalleServicioTransporte);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleServicioTransporte);				
	}
	
	
	public void inicializarElementosCamposServicioTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdServicioTransporte = new JLabelMe();
		jLabelIdServicioTransporte.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidServicioTransporte = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutServicioTransporte= new GridBagLayout();

		this.jPanelidServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);

		jLabelidServicioTransporte = new JLabel();
		jLabelidServicioTransporte.setText("Id");

		jLabelidServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ingresoServicioTransporte = new JLabelMe();
		this.jLabelfecha_ingresoServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_FECHAINGRESO+" : *");
		this.jLabelfecha_ingresoServicioTransporte.setToolTipText("Fecha Ingreso");
		this.jLabelfecha_ingresoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ingresoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ingresoServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ingresoServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_FECHAINGRESO);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelfecha_ingresoServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		//jFormattedTextFieldfecha_ingresoServicioTransporte= new JFormattedTextFieldMe();

		jDateChooserfecha_ingresoServicioTransporte= new JDateChooser();
		jDateChooserfecha_ingresoServicioTransporte.setEnabled(false);
		jDateChooserfecha_ingresoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ingresoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ingresoServicioTransporte.setDate(new Date());
		jDateChooserfecha_ingresoServicioTransporte.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ingresoServicioTransporte.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ingresoServicioTransporteBusqueda= new JButtonMe();
		this.jButtonfecha_ingresoServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ingresoServicioTransporteBusqueda.setText("U");
		this.jButtonfecha_ingresoServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ingresoServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ingresoServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ingresoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ingresoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ingresoServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ingresoServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaServicioTransporte = new JLabelMe();
		this.jLabelfecha_entregaServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaServicioTransporte.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelfecha_entregaServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		//jFormattedTextFieldfecha_entregaServicioTransporte= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaServicioTransporte= new JDateChooser();
		jDateChooserfecha_entregaServicioTransporte.setEnabled(false);
		jDateChooserfecha_entregaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaServicioTransporte.setDate(new Date());
		jDateChooserfecha_entregaServicioTransporte.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaServicioTransporte.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaServicioTransporteBusqueda= new JButtonMe();
		this.jButtonfecha_entregaServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaServicioTransporteBusqueda.setText("U");
		this.jButtonfecha_entregaServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_guia1ServicioTransporte = new JLabelMe();
		this.jLabelcodigo_guia1ServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_CODIGOGUIA1+" : *");
		this.jLabelcodigo_guia1ServicioTransporte.setToolTipText("Codigo Guia1");
		this.jLabelcodigo_guia1ServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_guia1ServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_guia1ServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_guia1ServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_guia1ServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_guia1ServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_CODIGOGUIA1);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelcodigo_guia1ServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jTextAreacodigo_guia1ServicioTransporte= new JTextAreaMe();
		jTextAreacodigo_guia1ServicioTransporte.setEnabled(false);
		jTextAreacodigo_guia1ServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_guia1ServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_guia1ServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_guia1ServicioTransporte.setLineWrap(true);
		jTextAreacodigo_guia1ServicioTransporte.setWrapStyleWord(true);
		jTextAreacodigo_guia1ServicioTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigo_guia1ServicioTransporte.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigo_guia1ServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigo_guia1ServicioTransporte = new JScrollPane(jTextAreacodigo_guia1ServicioTransporte);
		jscrollPanecodigo_guia1ServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_guia1ServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_guia1ServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigo_guia1ServicioTransporteBusqueda= new JButtonMe();
		this.jButtoncodigo_guia1ServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_guia1ServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_guia1ServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_guia1ServicioTransporteBusqueda.setText("U");
		this.jButtoncodigo_guia1ServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_guia1ServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_guia1ServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigo_guia1ServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigo_guia1ServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_guia1ServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_guia1ServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_guia2ServicioTransporte = new JLabelMe();
		this.jLabelcodigo_guia2ServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_CODIGOGUIA2+" : *");
		this.jLabelcodigo_guia2ServicioTransporte.setToolTipText("Codigo Guia2");
		this.jLabelcodigo_guia2ServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_guia2ServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_guia2ServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_guia2ServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_guia2ServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_guia2ServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_CODIGOGUIA2);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelcodigo_guia2ServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jTextAreacodigo_guia2ServicioTransporte= new JTextAreaMe();
		jTextAreacodigo_guia2ServicioTransporte.setEnabled(false);
		jTextAreacodigo_guia2ServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_guia2ServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_guia2ServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_guia2ServicioTransporte.setLineWrap(true);
		jTextAreacodigo_guia2ServicioTransporte.setWrapStyleWord(true);
		jTextAreacodigo_guia2ServicioTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigo_guia2ServicioTransporte.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigo_guia2ServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigo_guia2ServicioTransporte = new JScrollPane(jTextAreacodigo_guia2ServicioTransporte);
		jscrollPanecodigo_guia2ServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_guia2ServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_guia2ServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigo_guia2ServicioTransporteBusqueda= new JButtonMe();
		this.jButtoncodigo_guia2ServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_guia2ServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_guia2ServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_guia2ServicioTransporteBusqueda.setText("U");
		this.jButtoncodigo_guia2ServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_guia2ServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_guia2ServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigo_guia2ServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigo_guia2ServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_guia2ServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_guia2ServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelprecioServicioTransporte = new JLabelMe();
		this.jLabelprecioServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioServicioTransporte.setToolTipText("Precio");
		this.jLabelprecioServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelprecioServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jTextFieldprecioServicioTransporte= new JTextFieldMe();
		jTextFieldprecioServicioTransporte.setEnabled(false);
		jTextFieldprecioServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioServicioTransporte.setText("0.0");

		this.jButtonprecioServicioTransporteBusqueda= new JButtonMe();
		this.jButtonprecioServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioServicioTransporteBusqueda.setText("U");
		this.jButtonprecioServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_ivaServicioTransporte = new JLabelMe();
		this.jLabelvalor_ivaServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_VALORIVA+" : *");
		this.jLabelvalor_ivaServicioTransporte.setToolTipText("Valor Iva");
		this.jLabelvalor_ivaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ivaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ivaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_ivaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_ivaServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_ivaServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_VALORIVA);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelvalor_ivaServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jTextFieldvalor_ivaServicioTransporte= new JTextFieldMe();
		jTextFieldvalor_ivaServicioTransporte.setEnabled(false);
		jTextFieldvalor_ivaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ivaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ivaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_ivaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_ivaServicioTransporte.setText("0.0");

		this.jButtonvalor_ivaServicioTransporteBusqueda= new JButtonMe();
		this.jButtonvalor_ivaServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ivaServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ivaServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_ivaServicioTransporteBusqueda.setText("U");
		this.jButtonvalor_ivaServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_ivaServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_ivaServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_ivaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_ivaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_ivaServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_ivaServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_totalServicioTransporte = new JLabelMe();
		this.jLabelvalor_totalServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_VALORTOTAL+" : *");
		this.jLabelvalor_totalServicioTransporte.setToolTipText("Valor Total");
		this.jLabelvalor_totalServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_totalServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_totalServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_totalServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_VALORTOTAL);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelvalor_totalServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jTextFieldvalor_totalServicioTransporte= new JTextFieldMe();
		jTextFieldvalor_totalServicioTransporte.setEnabled(false);
		jTextFieldvalor_totalServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_totalServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_totalServicioTransporte.setText("0.0");

		this.jButtonvalor_totalServicioTransporteBusqueda= new JButtonMe();
		this.jButtonvalor_totalServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_totalServicioTransporteBusqueda.setText("U");
		this.jButtonvalor_totalServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_totalServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_totalServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_totalServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_totalServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_totalServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_totalServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionServicioTransporte = new JLabelMe();
		this.jLabeldescripcionServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionServicioTransporte.setToolTipText("Descripcion");
		this.jLabeldescripcionServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPaneldescripcionServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jTextAreadescripcionServicioTransporte= new JTextAreaMe();
		jTextAreadescripcionServicioTransporte.setEnabled(false);
		jTextAreadescripcionServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicioTransporte.setLineWrap(true);
		jTextAreadescripcionServicioTransporte.setWrapStyleWord(true);
		jTextAreadescripcionServicioTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionServicioTransporte.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionServicioTransporte = new JScrollPane(jTextAreadescripcionServicioTransporte);
		jscrollPanedescripcionServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionServicioTransporteBusqueda= new JButtonMe();
		this.jButtondescripcionServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionServicioTransporteBusqueda.setText("U");
		this.jButtondescripcionServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionServicioTransporteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysServicioTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaServicioTransporte = new JLabelMe();
		this.jLabelid_empresaServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaServicioTransporte.setToolTipText("Empresa");
		this.jLabelid_empresaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_empresaServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_empresaServicioTransporte= new JComboBoxMe();
		jComboBoxid_empresaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaServicioTransporte.setEnabled(false);

		this.jButtonid_empresaServicioTransporte= new JButtonMe();
		this.jButtonid_empresaServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicioTransporte.setText("Buscar");
		this.jButtonid_empresaServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioTransporte"));

		this.jButtonid_empresaServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_empresaServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaServicioTransporteBusqueda.setText("U");
		this.jButtonid_empresaServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_empresaServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_empresaServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaServicioTransporteUpdate.setText("U");
		this.jButtonid_empresaServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioTransporteUpdate"));



					
		this.jLabelid_sucursalServicioTransporte = new JLabelMe();
		this.jLabelid_sucursalServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalServicioTransporte.setToolTipText("Sucursal");
		this.jLabelid_sucursalServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_sucursalServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_sucursalServicioTransporte= new JComboBoxMe();
		jComboBoxid_sucursalServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalServicioTransporte.setEnabled(false);

		this.jButtonid_sucursalServicioTransporte= new JButtonMe();
		this.jButtonid_sucursalServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalServicioTransporte.setText("Buscar");
		this.jButtonid_sucursalServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalServicioTransporte"));

		this.jButtonid_sucursalServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_sucursalServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalServicioTransporteBusqueda.setText("U");
		this.jButtonid_sucursalServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_sucursalServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalServicioTransporteUpdate.setText("U");
		this.jButtonid_sucursalServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalServicioTransporteUpdate"));



					
		this.jLabelid_ejercicioServicioTransporte = new JLabelMe();
		this.jLabelid_ejercicioServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioServicioTransporte.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_ejercicioServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_ejercicioServicioTransporte= new JComboBoxMe();
		jComboBoxid_ejercicioServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioServicioTransporte.setEnabled(false);

		this.jButtonid_ejercicioServicioTransporte= new JButtonMe();
		this.jButtonid_ejercicioServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioServicioTransporte.setText("Buscar");
		this.jButtonid_ejercicioServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioServicioTransporte"));

		this.jButtonid_ejercicioServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_ejercicioServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioServicioTransporteBusqueda.setText("U");
		this.jButtonid_ejercicioServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_ejercicioServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioServicioTransporteUpdate.setText("U");
		this.jButtonid_ejercicioServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioServicioTransporteUpdate"));



					
		this.jLabelid_periodoServicioTransporte = new JLabelMe();
		this.jLabelid_periodoServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoServicioTransporte.setToolTipText("Periodo");
		this.jLabelid_periodoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_periodoServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_periodoServicioTransporte= new JComboBoxMe();
		jComboBoxid_periodoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoServicioTransporte.setEnabled(false);

		this.jButtonid_periodoServicioTransporte= new JButtonMe();
		this.jButtonid_periodoServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoServicioTransporte.setText("Buscar");
		this.jButtonid_periodoServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoServicioTransporte"));

		this.jButtonid_periodoServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_periodoServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoServicioTransporteBusqueda.setText("U");
		this.jButtonid_periodoServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_periodoServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_periodoServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoServicioTransporteUpdate.setText("U");
		this.jButtonid_periodoServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoServicioTransporteUpdate"));



					
		this.jLabelid_clienteServicioTransporte = new JLabelMe();
		this.jLabelid_clienteServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteServicioTransporte.setToolTipText("Cliente");
		this.jLabelid_clienteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_clienteServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_clienteServicioTransporte= new JComboBoxMe();
		jComboBoxid_clienteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteServicioTransporte= new JButtonMe();
		this.jButtonid_clienteServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteServicioTransporte.setText("Buscar");
		this.jButtonid_clienteServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteServicioTransporte"));

		this.jButtonid_clienteServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_clienteServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteServicioTransporteBusqueda.setText("U");
		this.jButtonid_clienteServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_clienteServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_clienteServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteServicioTransporteUpdate.setText("U");
		this.jButtonid_clienteServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteServicioTransporteUpdate"));



					
		this.jLabelid_cliente_proveedorServicioTransporte = new JLabelMe();
		this.jLabelid_cliente_proveedorServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR+" : *");
		this.jLabelid_cliente_proveedorServicioTransporte.setToolTipText("Cliente Proveedor");
		this.jLabelid_cliente_proveedorServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_proveedorServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_proveedorServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_cliente_proveedorServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_cliente_proveedorServicioTransporte= new JComboBoxMe();
		jComboBoxid_cliente_proveedorServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_proveedorServicioTransporte= new JButtonMe();
		this.jButtonid_cliente_proveedorServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorServicioTransporte.setText("Buscar");
		this.jButtonid_cliente_proveedorServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_proveedorServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_proveedorServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorServicioTransporte"));

		this.jButtonid_cliente_proveedorServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setText("U");
		this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_proveedorServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_proveedorServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_cliente_proveedorServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_cliente_proveedorServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorServicioTransporteUpdate.setText("U");
		this.jButtonid_cliente_proveedorServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_proveedorServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_proveedorServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorServicioTransporteUpdate"));



					
		this.jLabelid_transportistaServicioTransporte = new JLabelMe();
		this.jLabelid_transportistaServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDTRANSPORTISTA+" : *");
		this.jLabelid_transportistaServicioTransporte.setToolTipText("Transportista");
		this.jLabelid_transportistaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_transportistaServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_transportistaServicioTransporte= new JComboBoxMe();
		jComboBoxid_transportistaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaServicioTransporte= new JButtonMe();
		this.jButtonid_transportistaServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaServicioTransporte.setText("Buscar");
		this.jButtonid_transportistaServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaServicioTransporte"));

		this.jButtonid_transportistaServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_transportistaServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaServicioTransporteBusqueda.setText("U");
		this.jButtonid_transportistaServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_transportistaServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_transportistaServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaServicioTransporteUpdate.setText("U");
		this.jButtonid_transportistaServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaServicioTransporteUpdate"));



					
		this.jLabelid_vehiculoServicioTransporte = new JLabelMe();
		this.jLabelid_vehiculoServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDVEHICULO+" : *");
		this.jLabelid_vehiculoServicioTransporte.setToolTipText("Vehiculo");
		this.jLabelid_vehiculoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vehiculoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vehiculoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vehiculoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vehiculoServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vehiculoServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDVEHICULO);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_vehiculoServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_vehiculoServicioTransporte= new JComboBoxMe();
		jComboBoxid_vehiculoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vehiculoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vehiculoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vehiculoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vehiculoServicioTransporte= new JButtonMe();
		this.jButtonid_vehiculoServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vehiculoServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vehiculoServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vehiculoServicioTransporte.setText("Buscar");
		this.jButtonid_vehiculoServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vehiculoServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vehiculoServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vehiculoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vehiculoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vehiculoServicioTransporte"));

		this.jButtonid_vehiculoServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_vehiculoServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vehiculoServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vehiculoServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vehiculoServicioTransporteBusqueda.setText("U");
		this.jButtonid_vehiculoServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vehiculoServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vehiculoServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vehiculoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vehiculoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vehiculoServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vehiculoServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_vehiculoServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_vehiculoServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vehiculoServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vehiculoServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vehiculoServicioTransporteUpdate.setText("U");
		this.jButtonid_vehiculoServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vehiculoServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vehiculoServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vehiculoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vehiculoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vehiculoServicioTransporteUpdate"));



					
		this.jLabelid_ruta_transporteServicioTransporte = new JLabelMe();
		this.jLabelid_ruta_transporteServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDRUTATRANSPORTE+" : *");
		this.jLabelid_ruta_transporteServicioTransporte.setToolTipText("Ruta Transporte");
		this.jLabelid_ruta_transporteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_ruta_transporteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_ruta_transporteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ruta_transporteServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ruta_transporteServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ruta_transporteServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDRUTATRANSPORTE);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_ruta_transporteServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_ruta_transporteServicioTransporte= new JComboBoxMe();
		jComboBoxid_ruta_transporteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ruta_transporteServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ruta_transporteServicioTransporte= new JButtonMe();
		this.jButtonid_ruta_transporteServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transporteServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transporteServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transporteServicioTransporte.setText("Buscar");
		this.jButtonid_ruta_transporteServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ruta_transporteServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transporteServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ruta_transporteServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transporteServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transporteServicioTransporte"));

		this.jButtonid_ruta_transporteServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_ruta_transporteServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ruta_transporteServicioTransporteBusqueda.setText("U");
		this.jButtonid_ruta_transporteServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ruta_transporteServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transporteServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ruta_transporteServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transporteServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transporteServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ruta_transporteServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_ruta_transporteServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_ruta_transporteServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ruta_transporteServicioTransporteUpdate.setText("U");
		this.jButtonid_ruta_transporteServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ruta_transporteServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transporteServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ruta_transporteServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transporteServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transporteServicioTransporteUpdate"));



					
		this.jLabelid_detalle_activo_fijoServicioTransporte = new JLabelMe();
		this.jLabelid_detalle_activo_fijoServicioTransporte.setText(""+ServicioTransporteConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoServicioTransporte.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoServicioTransporte.setToolTipText(ServicioTransporteConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutServicioTransporte = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoServicioTransporte.setLayout(this.gridaBagLayoutServicioTransporte);


		jComboBoxid_detalle_activo_fijoServicioTransporte= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoServicioTransporte= new JButtonMe();
		this.jButtonid_detalle_activo_fijoServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoServicioTransporte.setText("Buscar");
		this.jButtonid_detalle_activo_fijoServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoServicioTransporte"));

		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoServicioTransporteBusqueda"));

		if(this.serviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoServicioTransporteUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoServicioTransporteUpdate"));



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
		//this.jInternalFrameDetalleServicioTransporte = new ServicioTransporteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Servicio Transporte DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutServicioTransporte= new GridBagLayout();
		

		
		String sToolTipServicioTransporte="";
		sToolTipServicioTransporte=ServicioTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipServicioTransporte+="(Cartera.ServicioTransporte)";
		}
		
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipServicioTransporte+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoServicioTransporte = new JButtonMe();
		this.jButtonModificarServicioTransporte = new JButtonMe();
        this.jButtonActualizarServicioTransporte = new JButtonMe();
        this.jButtonEliminarServicioTransporte = new JButtonMe();
        this.jButtonCancelarServicioTransporte = new JButtonMe();
        this.jButtonGuardarCambiosServicioTransporte = new JButtonMe();
		this.jButtonGuardarCambiosTablaServicioTransporte = new JButtonMe();
		this.jButtonCerrarServicioTransporte = new JButtonMe();
		
		this.jScrollPanelDatosServicioTransporte = new JScrollPane();   
        this.jScrollPanelDatosEdicionServicioTransporte = new JScrollPane();
		this.jScrollPanelDatosGeneralServicioTransporte = new JScrollPane();
				
		
		
		this.jPanelCamposServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Servicio Transporte";
		
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosServicioTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposServicioTransporte.setName("jPanelCamposServicioTransporte"); 

		this.jPanelCamposOcultosServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosServicioTransporte.setName("jPanelCamposOcultosServicioTransporte"); 

        this.jPanelAccionesServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesServicioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesServicioTransporte.setName("Acciones"); 

		this.jPanelAccionesFormularioServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioServicioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesFormularioServicioTransporte.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoServicioTransporte.setText("Nuevo");
		this.jButtonModificarServicioTransporte.setText("Editar");
        this.jButtonActualizarServicioTransporte.setText("Actualizar");
        this.jButtonEliminarServicioTransporte.setText("Eliminar");
        this.jButtonCancelarServicioTransporte.setText("Cancelar");
        this.jButtonGuardarCambiosServicioTransporte.setText("Guardar");
		this.jButtonGuardarCambiosTablaServicioTransporte.setText("Guardar");
		this.jButtonCerrarServicioTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoServicioTransporte,"nuevo_button","Nuevo",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarServicioTransporte,"modificar_button","Editar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarServicioTransporte,"actualizar_button","Actualizar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarServicioTransporte,"eliminar_button","Eliminar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarServicioTransporte,"cancelar_button","Cancelar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosServicioTransporte,"guardarcambios_button","Guardar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaServicioTransporte,"guardarcambiostabla_button","Guardar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarServicioTransporte,"cerrar_button","Salir",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoServicioTransporte.setToolTipText("Nuevo"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarServicioTransporte.setToolTipText("Editar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarServicioTransporte.setToolTipText("Actualizar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarServicioTransporte.setToolTipText("Eliminar)"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarServicioTransporte.setToolTipText("Cancelar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosServicioTransporte.setToolTipText("Guardar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaServicioTransporte.setToolTipText("Guardar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarServicioTransporte.setToolTipText("Salir"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoServicioTransporte";
		inputMap = this.jButtonNuevoServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoServicioTransporte"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarServicioTransporte";
		inputMap = this.jButtonActualizarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarServicioTransporte"));
		
		//ELIMINAR
		sMapKey = "EliminarServicioTransporte";
		inputMap = this.jButtonEliminarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarServicioTransporte"));
		
		//CANCELAR	
		sMapKey = "CancelarServicioTransporte";
		inputMap = this.jButtonCancelarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarServicioTransporte"));
		
		//CERRAR		
		sMapKey = "CerrarServicioTransporte";
		inputMap = this.jButtonCerrarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarServicioTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaServicioTransporte";
		inputMap = this.jButtonGuardarCambiosTablaServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaServicioTransporte"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoServicioTransporte.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoServicioTransporte.setToolTipText("Nuevo ServicioTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarServicioTransporte.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarServicioTransporte.setToolTipText("Sin Cerrar Ventana ServicioTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeServicioTransporte.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeServicioTransporte.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesServicioTransporte.setText("Accion");
		this.jComboBoxTiposAccionesServicioTransporte.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioServicioTransporte.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioServicioTransporte.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesServicioTransporte = new JLabelMe();
		
		this.jLabelAccionesServicioTransporte.setText("Acciones");		
		this.jLabelAccionesServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposServicioTransporte();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysServicioTransporte();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesServicioTransporte=new JTabbedPane();
		this.jTabbedPaneRelacionesServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioServicioTransporte.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposServicioTransporte = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosServicioTransporte = new GridBagLayout();
		
		this.jPanelCamposServicioTransporte.setLayout(gridaBagLayoutCamposServicioTransporte);
		this.jPanelCamposOcultosServicioTransporte.setLayout(gridaBagLayoutCamposOcultosServicioTransporte);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidServicioTransporte.add(jLabelIdServicioTransporte, this.gridBagConstraintsServicioTransporte);



	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidServicioTransporte.add(jLabelidServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaServicioTransporte.add(jLabelid_empresaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaServicioTransporte.add(jButtonid_empresaServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaServicioTransporte.add(jButtonid_empresaServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaServicioTransporte.add(jComboBoxid_empresaServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalServicioTransporte.add(jLabelid_sucursalServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalServicioTransporte.add(jButtonid_sucursalServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalServicioTransporte.add(jButtonid_sucursalServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalServicioTransporte.add(jComboBoxid_sucursalServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioServicioTransporte.add(jLabelid_ejercicioServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioServicioTransporte.add(jButtonid_ejercicioServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioServicioTransporte.add(jButtonid_ejercicioServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioServicioTransporte.add(jComboBoxid_ejercicioServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoServicioTransporte.add(jLabelid_periodoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoServicioTransporte.add(jButtonid_periodoServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoServicioTransporte.add(jButtonid_periodoServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoServicioTransporte.add(jComboBoxid_periodoServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteServicioTransporte.add(jLabelid_clienteServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 2;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteServicioTransporte.add(jButtonid_clienteServicioTransporte, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteServicioTransporte.add(jButtonid_clienteServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 4;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteServicioTransporte.add(jButtonid_clienteServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteServicioTransporte.add(jComboBoxid_clienteServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_proveedorServicioTransporte.add(jLabelid_cliente_proveedorServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 2;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_proveedorServicioTransporte.add(jButtonid_cliente_proveedorServicioTransporte, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorServicioTransporte.add(jButtonid_cliente_proveedorServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 4;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorServicioTransporte.add(jButtonid_cliente_proveedorServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_proveedorServicioTransporte.add(jComboBoxid_cliente_proveedorServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaServicioTransporte.add(jLabelid_transportistaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaServicioTransporte.add(jButtonid_transportistaServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaServicioTransporte.add(jButtonid_transportistaServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaServicioTransporte.add(jComboBoxid_transportistaServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vehiculoServicioTransporte.add(jLabelid_vehiculoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vehiculoServicioTransporte.add(jButtonid_vehiculoServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vehiculoServicioTransporte.add(jButtonid_vehiculoServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vehiculoServicioTransporte.add(jComboBoxid_vehiculoServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ruta_transporteServicioTransporte.add(jLabelid_ruta_transporteServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ruta_transporteServicioTransporte.add(jButtonid_ruta_transporteServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ruta_transporteServicioTransporte.add(jButtonid_ruta_transporteServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ruta_transporteServicioTransporte.add(jComboBoxid_ruta_transporteServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoServicioTransporte.add(jLabelid_detalle_activo_fijoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoServicioTransporte.add(jButtonid_detalle_activo_fijoServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 3;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoServicioTransporte.add(jButtonid_detalle_activo_fijoServicioTransporteUpdate, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoServicioTransporte.add(jComboBoxid_detalle_activo_fijoServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ingresoServicioTransporte.add(jLabelfecha_ingresoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ingresoServicioTransporte.add(jButtonfecha_ingresoServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ingresoServicioTransporte.add(jDateChooserfecha_ingresoServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaServicioTransporte.add(jLabelfecha_entregaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaServicioTransporte.add(jButtonfecha_entregaServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaServicioTransporte.add(jDateChooserfecha_entregaServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_guia1ServicioTransporte.add(jLabelcodigo_guia1ServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_guia1ServicioTransporte.add(jButtoncodigo_guia1ServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_guia1ServicioTransporte.add(jscrollPanecodigo_guia1ServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_guia2ServicioTransporte.add(jLabelcodigo_guia2ServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_guia2ServicioTransporte.add(jButtoncodigo_guia2ServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_guia2ServicioTransporte.add(jscrollPanecodigo_guia2ServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioServicioTransporte.add(jLabelprecioServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioServicioTransporte.add(jButtonprecioServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioServicioTransporte.add(jTextFieldprecioServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_ivaServicioTransporte.add(jLabelvalor_ivaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_ivaServicioTransporte.add(jButtonvalor_ivaServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_ivaServicioTransporte.add(jTextFieldvalor_ivaServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_totalServicioTransporte.add(jLabelvalor_totalServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_totalServicioTransporte.add(jButtonvalor_totalServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_totalServicioTransporte.add(jTextFieldvalor_totalServicioTransporte, this.gridBagConstraintsServicioTransporte);


	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 0;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionServicioTransporte.add(jLabeldescripcionServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 2;
		this.gridBagConstraintsServicioTransporte.ipadx = 0;
		this.gridBagConstraintsServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionServicioTransporte.add(jButtondescripcionServicioTransporteBusqueda, this.gridBagConstraintsServicioTransporte);
	}

	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioTransporte.gridy = 0;
	this.gridBagConstraintsServicioTransporte.gridx = 1;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionServicioTransporte.add(jscrollPanedescripcionServicioTransporte, this.gridBagConstraintsServicioTransporte);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelidServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelid_clienteServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelid_cliente_proveedorServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelid_transportistaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelid_vehiculoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelid_ruta_transporteServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelid_detalle_activo_fijoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelfecha_ingresoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelfecha_entregaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelcodigo_guia1ServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelcodigo_guia2ServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelprecioServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelvalor_ivaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPanelvalor_totalServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioTransporte.add(this.jPaneldescripcionServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposServicioTransporte % 2==0) {
		iXPanelCamposServicioTransporte=0;
		iYPanelCamposServicioTransporte++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposOcultosServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposOcultosServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosServicioTransporte.add(this.jPanelid_empresaServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposOcultosServicioTransporte % 2==0) {
		iXPanelCamposOcultosServicioTransporte=0;
		iYPanelCamposOcultosServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposOcultosServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposOcultosServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosServicioTransporte.add(this.jPanelid_sucursalServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposOcultosServicioTransporte % 2==0) {
		iXPanelCamposOcultosServicioTransporte=0;
		iYPanelCamposOcultosServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposOcultosServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposOcultosServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosServicioTransporte.add(this.jPanelid_ejercicioServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposOcultosServicioTransporte % 2==0) {
		iXPanelCamposOcultosServicioTransporte=0;
		iYPanelCamposOcultosServicioTransporte++;
	}
	this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioTransporte.gridy = iYPanelCamposOcultosServicioTransporte;
	this.gridBagConstraintsServicioTransporte.gridx = iXPanelCamposOcultosServicioTransporte++;
	this.gridBagConstraintsServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosServicioTransporte.add(this.jPanelid_periodoServicioTransporte, this.gridBagConstraintsServicioTransporte);



	if(iXPanelCamposOcultosServicioTransporte % 2==0) {
		iXPanelCamposOcultosServicioTransporte=0;
		iYPanelCamposOcultosServicioTransporte++;
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
			
		GridBagLayout gridaBagLayoutAccionesServicioTransporte= new GridBagLayout();
		this.jPanelAccionesServicioTransporte.setLayout(gridaBagLayoutAccionesServicioTransporte);
		
		GridBagLayout gridaBagLayoutAccionesFormularioServicioTransporte= new GridBagLayout();
		this.jPanelAccionesFormularioServicioTransporte.setLayout(gridaBagLayoutAccionesFormularioServicioTransporte);
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioServicioTransporte.add(this.jComboBoxTiposAccionesFormularioServicioTransporte, this.gridBagConstraintsServicioTransporte);

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioServicioTransporte.add(this.jCheckBoxPostAccionNuevoServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.serviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioServicioTransporte.add(this.jCheckBoxPostAccionSinCerrarServicioTransporte, this.gridBagConstraintsServicioTransporte);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.serviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioServicioTransporte.add(this.jCheckBoxPostAccionSinMensajeServicioTransporte, this.gridBagConstraintsServicioTransporte);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXAccion++;
			
		this.jPanelAccionesServicioTransporte.add(this.jButtonModificarServicioTransporte, this.gridBagConstraintsServicioTransporte);							

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx =iPosXAccion++;
			
		this.jPanelAccionesServicioTransporte.add(this.jButtonEliminarServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = 0;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesServicioTransporte.add(this.jButtonActualizarServicioTransporte, this.gridBagConstraintsServicioTransporte);


		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = 0;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesServicioTransporte.add(this.jButtonGuardarCambiosServicioTransporte, this.gridBagConstraintsServicioTransporte);	
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = 0;		
		this.gridBagConstraintsServicioTransporte.gridx =iPosXAccion++;
		
		this.jPanelAccionesServicioTransporte.add(this.jButtonCancelarServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutServicioTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutServicioTransporte);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();						
			this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicioTransporte.gridx = 0;		
			//this.gridBagConstraintsServicioTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsServicioTransporte.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsServicioTransporte.gridx =0;
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsServicioTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosServicioTransporte, this.gridBagConstraintsServicioTransporte);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ServicioTransporteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleServicioTransporte = new ServicioTransporteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Servicio Transporte DATOS");
			
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
			
	        //this.setTitle("[FOR] - Servicio Transporte DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Servicio Transporte Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ServicioTransporteModel serviciotransporteModel=new ServicioTransporteModel(this);
			
			//SI USARA CLASE INTERNA
			//ServicioTransporteModel.ServicioTransporteFocusTraversalPolicy serviciotransporteFocusTraversalPolicy = serviciotransporteModel.new ServicioTransporteFocusTraversalPolicy(this);
			
			//serviciotransporteFocusTraversalPolicy.setserviciotransporteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(serviciotransporteModel);
			
			
			this.jContentPaneDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();	
			this.jContentPaneDetalleServicioTransporte.setLayout(gridaBagLayoutDetalleServicioTransporte);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosServicioTransporte = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsServicioTransporte.gridx = 0;
					
				
				this.jContentPaneDetalleServicioTransporte.add(jTtoolBarDetalleServicioTransporte, gridBagConstraintsServicioTransporte);								
				
}
			
			this.jScrollPanelDatosEdicionServicioTransporte=   new JScrollPane(jContentPaneDetalleServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralServicioTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			
			
	        this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsServicioTransporte.gridx = 0;
	        
			this.jContentPaneDetalleServicioTransporte.add(jPanelCamposServicioTransporte, gridBagConstraintsServicioTransporte);
			
			
			
			
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
						&& serviciotransporteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleServicioTransporte(this.puedeCargarPorParteDetalleServicioTransporte,false,-1);
					
					if(this.serviciotransporteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsServicioTransporte= new GridBagConstraints();
						this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones++;
						this.gridBagConstraintsServicioTransporte.gridx = 0;
						this.jContentPaneDetalleServicioTransporte.add(this.jTabbedPaneRelacionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesServicioTransporte.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleServicioTransporte(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosServicioTransporte.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
					this.gridBagConstraintsServicioTransporte.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsServicioTransporte.gridx = 0;
					
				
					this.jContentPaneDetalleServicioTransporte.add(jPanelCamposOcultosServicioTransporte, gridBagConstraintsServicioTransporte);
				
					this.jPanelCamposOcultosServicioTransporte.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsServicioTransporte.gridx = 0;
	        this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleServicioTransporte.add(this.jPanelAccionesFormularioServicioTransporte, this.gridBagConstraintsServicioTransporte);							
			
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
	        this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsServicioTransporte.gridx = 0;
	        
			
			this.jContentPaneDetalleServicioTransporte.add(this.jPanelAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionServicioTransporte);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionServicioTransporte=   new JScrollPane(this.jPanelCamposServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsServicioTransporte.gridx = 0;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsServicioTransporte.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsServicioTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioServicioTransporte, this.gridBagConstraintsServicioTransporte);			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsServicioTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralServicioTransporte;//jContentPane;
		
		return jScrollPanelDatosEdicionServicioTransporte;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleServicioTransporte(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(false);
		this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(true);

		this.detalleserviciotransporteBeanSwingJInternalFrame=null;//new DetalleServicioTransporteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleserviciotransporteBeanSwingJInternalFramePopup=new DetalleServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleserviciotransporteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {

				DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(true);

				this.detalleserviciotransporteBeanSwingJInternalFrame=new DetalleServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleserviciotransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleserviciotransporteBeanSwingJInternalFrame.setdetalleserviciotransporteSessionBean(this.detalleserviciotransporteSessionBean);

				//this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
				//this.gridBagConstraintsServicioTransporte.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsServicioTransporte.gridx = 0;
				//this.jContentPaneDetalleServicioTransporte.add(this.detalleserviciotransporteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsServicioTransporte);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesServicioTransporte.add("Detalle Servicio Transportes",this.detalleserviciotransporteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesServicioTransporte.setComponentAt(iIndexTab,this.detalleserviciotransporteBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(false);
				this.detalleserviciotransporteBeanSwingJInternalFrame=null;//new DetalleServicioTransporteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleServicioTransporte) {
					this.jTabbedPaneRelacionesServicioTransporte.add("Detalle Servicio Transportes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleServicioTransporteBeanSwingJInternalFrame(List<ServicioTransporte> serviciotransportes,ServicioTransporte serviciotransporte,DetalleServicioTransporteBeanSwingJInternalFrame detalleserviciotransporteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleserviciotransporteBeanSwingJInternalFrame=new DetalleServicioTransporteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleserviciotransporteBeanSwingJInternalFrame.getDetalleServicioTransporteLogic().setConnexion(this.serviciotransporteLogic.getConnexion());

					detalleserviciotransporteBeanSwingJInternalFrame.setserviciotransportesForeignKey(serviciotransportes);
					detalleserviciotransporteBeanSwingJInternalFrame.setserviciotransporteForeignKey(serviciotransporte);
					detalleserviciotransporteBeanSwingJInternalFrame.detalleserviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionServicioTransporte(true);
					detalleserviciotransporteBeanSwingJInternalFrame.detalleserviciotransporteSessionBean.setlidServicioTransporteActual(serviciotransporte.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleserviciotransporteBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleServicioTransporte(detalleserviciotransporteBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleserviciotransporteBeanSwingJInternalFrame.setVisibilidadBusquedasParaServicioTransporte(true);
					detalleserviciotransporteBeanSwingJInternalFrame.setid_servicio_transporteFK_IdServicioTransporte(serviciotransporte.getId());

					if(!this.conCargarFormDetalle) {
						detalleserviciotransporteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleserviciotransporteBeanSwingJInternalFrame.setSelectedItemCombosFrameServicioTransporteForeignKey(serviciotransporte,1,false,true,true);
					detalleserviciotransporteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleserviciotransporteBeanSwingJInternalFrame.procesarBusqueda("FK_IdServicioTransporte");
					detalleserviciotransporteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdServicioTransporte");
					detalleserviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleServicioTransporte(true);
					detalleserviciotransporteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n",detalleserviciotransporteBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleserviciotransporteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleserviciotransporteBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleserviciotransporteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleserviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleServicioTransporte("relacionado");
					} else {
						detalleserviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleServicioTransporte("no_relacionado");
					}

					detalleserviciotransporteBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleServicioTransporte().setVisible(false);

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
