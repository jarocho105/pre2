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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.PedidoProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class PedidoProduDetalleFormJInternalFrame extends PedidoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidoProdu;
	
	protected JMenuBar jmenuBarDetallePedidoProdu;
	
	protected JMenu jmenuDetallePedidoProdu;
	protected JMenu jmenuDetalleArchivoPedidoProdu;
	protected JMenu jmenuDetalleAccionesPedidoProdu;
	protected JMenu jmenuDetalleDatosPedidoProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoProdu;	
	protected GridBagConstraints gridBagConstraintsPedidoProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoProduBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidoProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprioridadempresaprodu="";

	protected EmpleadoBeanSwingJInternalFrame empleadoresponsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoresponsable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoordenprodu="";
	
	public PedidoProduSessionBean pedidoproduSessionBean;
	
	

	public PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame=null;
	public PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoDetaProdu=false;
	public PedidoDetaProduSessionBean pedidodetaproduSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean;
	public EmpleadoSessionBean empleadoresponsableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EstadoOrdenProduSessionBean estadoordenproduSessionBean;	
	
	public PedidoProduLogic pedidoproduLogic;
	
	public JScrollPane jScrollPanelDatosPedidoProdu;
	public JScrollPane jScrollPanelDatosEdicionPedidoProdu;
	public JScrollPane jScrollPanelDatosGeneralPedidoProdu;
	
	protected JPanel jPanelCamposPedidoProdu;    
	protected JPanel jPanelCamposOcultosPedidoProdu;    	
	protected JPanel jPanelAccionesPedidoProdu;
	protected JPanel jPanelAccionesFormularioPedidoProdu;
    
	
	
	protected Integer iXPanelCamposPedidoProdu=0;
	protected Integer iYPanelCamposPedidoProdu=0;
	
	protected Integer iXPanelCamposOcultosPedidoProdu=0;
	protected Integer iYPanelCamposOcultosPedidoProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidoProdu;
	public JButton jButtonModificarPedidoProdu;
	public JButton jButtonActualizarPedidoProdu;
    public JButton jButtonEliminarPedidoProdu;
	public JButton jButtonCancelarPedidoProdu;
    public JButton jButtonGuardarCambiosPedidoProdu;
	public JButton jButtonGuardarCambiosTablaPedidoProdu;
	protected JButton jButtonCerrarPedidoProdu;
	
	
	protected JButton jButtonProcesarInformacionPedidoProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidoProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidoProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidoProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoProdu;
	protected JButton jButtonModificarToolBarPedidoProdu;
	protected JButton jButtonActualizarToolBarPedidoProdu;
    protected JButton jButtonEliminarToolBarPedidoProdu;
	protected JButton jButtonCancelarToolBarPedidoProdu;
    protected JButton jButtonGuardarCambiosToolBarPedidoProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoProdu;
	protected JButton jButtonCerrarToolBarPedidoProdu;
	
	protected JButton jButtonProcesarInformacionToolBarPedidoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoProdu;
	protected JMenuItem jMenuItemModificarPedidoProdu;
	protected JMenuItem jMenuItemActualizarPedidoProdu;
    protected JMenuItem jMenuItemEliminarPedidoProdu;
	protected JMenuItem jMenuItemCancelarPedidoProdu;
    protected JMenuItem jMenuItemGuardarCambiosPedidoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoProdu;
	protected JMenuItem jMenuItemCerrarPedidoProdu;
	protected JMenuItem jMenuItemDetalleCerrarPedidoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoProdu;
	protected JMenuItem jMenuItemMostrarOcultarPedidoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidoProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidoProdu;
	public JLabel jLabelIdPedidoProdu;
	public JLabel jLabelidPedidoProdu;
	public JButton jButtonidPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialPedidoProdu;
	public JLabel jLabelsecuencialPedidoProdu;
	public JTextField jTextFieldsecuencialPedidoProdu;
	public JButton jButtonsecuencialPedidoProduBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_clientePedidoProdu;
	public JLabel jLabeldireccion_clientePedidoProdu;
	public JTextArea jTextAreadireccion_clientePedidoProdu;
	public JScrollPane jscrollPanedireccion_clientePedidoProdu;
	public JButton jButtondireccion_clientePedidoProduBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_clientePedidoProdu;
	public JLabel jLabeltelefono_clientePedidoProdu;
	public JTextField jTextFieldtelefono_clientePedidoProdu;
	public JButton jButtontelefono_clientePedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelruc_clientePedidoProdu;
	public JLabel jLabelruc_clientePedidoProdu;
	public JTextField jTextFieldruc_clientePedidoProdu;
	public JButton jButtonruc_clientePedidoProduBusqueda= new JButtonMe();

	public JPanel jPanellotePedidoProdu;
	public JLabel jLabellotePedidoProdu;
	public JTextField jTextFieldlotePedidoProdu;
	public JButton jButtonlotePedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pedidoPedidoProdu;
	public JLabel jLabelfecha_pedidoPedidoProdu;
	//public JFormattedTextField jDateChooserfecha_pedidoPedidoProdu;

	public JDateChooser jDateChooserfecha_pedidoPedidoProdu;
	public JButton jButtonfecha_pedidoPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaPedidoProdu;
	public JLabel jLabelfecha_entregaPedidoProdu;
	//public JFormattedTextField jDateChooserfecha_entregaPedidoProdu;

	public JDateChooser jDateChooserfecha_entregaPedidoProdu;
	public JButton jButtonfecha_entregaPedidoProduBusqueda= new JButtonMe();

	public JPanel jPaneles_uso_internoPedidoProdu;
	public JLabel jLabeles_uso_internoPedidoProdu;
	public JCheckBox jCheckBoxes_uso_internoPedidoProdu;
	public JButton jButtones_uso_internoPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelfechaPedidoProdu;
	public JLabel jLabelfechaPedidoProdu;
	//public JFormattedTextField jDateChooserfechaPedidoProdu;

	public JDateChooser jDateChooserfechaPedidoProdu;
	public JButton jButtonfechaPedidoProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPedidoProdu;
	public JLabel jLabeldescripcionPedidoProdu;
	public JTextArea jTextAreadescripcionPedidoProdu;
	public JScrollPane jscrollPanedescripcionPedidoProdu;
	public JButton jButtondescripcionPedidoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidoProdu;
	public JLabel jLabelid_empresaPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidoProdu;
	public JButton jButtonid_empresaPedidoProdu= new JButtonMe();
	public JButton jButtonid_empresaPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidoProdu;
	public JLabel jLabelid_sucursalPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidoProdu;
	public JButton jButtonid_sucursalPedidoProdu= new JButtonMe();
	public JButton jButtonid_sucursalPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPedidoProdu;
	public JLabel jLabelid_ejercicioPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPedidoProdu;
	public JButton jButtonid_ejercicioPedidoProdu= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPedidoProdu;
	public JLabel jLabelid_periodoPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPedidoProdu;
	public JButton jButtonid_periodoPedidoProdu= new JButtonMe();
	public JButton jButtonid_periodoPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_periodoPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoPedidoProdu;
	public JLabel jLabelid_formatoPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoPedidoProdu;
	public JButton jButtonid_formatoPedidoProdu= new JButtonMe();
	public JButton jButtonid_formatoPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_formatoPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_prioridad_empresa_produPedidoProdu;
	public JLabel jLabelid_tipo_prioridad_empresa_produPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prioridad_empresa_produPedidoProdu;
	public JButton jButtonid_tipo_prioridad_empresa_produPedidoProdu= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_responsablePedidoProdu;
	public JLabel jLabelid_empleado_responsablePedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_responsablePedidoProdu;
	public JButton jButtonid_empleado_responsablePedidoProdu= new JButtonMe();
	public JButton jButtonid_empleado_responsablePedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_empleado_responsablePedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePedidoProdu;
	public JLabel jLabelid_clientePedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePedidoProdu;
	public JButton jButtonid_clientePedidoProdu= new JButtonMe();
	public JButton jButtonid_clientePedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_clientePedidoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_orden_produPedidoProdu;
	public JLabel jLabelid_estado_orden_produPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_orden_produPedidoProdu;
	public JButton jButtonid_estado_orden_produPedidoProdu= new JButtonMe();
	public JButton jButtonid_estado_orden_produPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_estado_orden_produPedidoProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidoProdu;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidoProdu=new JPanel();
				this.jPanelAccionesFormularioPedidoProdu=new JPanel();
				this.jmenuBarDetallePedidoProdu=new JMenuBar();
				this.jTtoolBarDetallePedidoProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedidoProdu() {
		return this.jButtonActualizarToolBarPedidoProdu;
	}
	
	public JButton getjButtonEliminarToolBarPedidoProdu() {
		return this.jButtonEliminarToolBarPedidoProdu;
	}
	
	public JButton getjButtonCancelarToolBarPedidoProdu() {
		return this.jButtonCancelarToolBarPedidoProdu;
	}		
	
	public JButton getjButtonProcesarInformacionPedidoProdu() {
		return this.jButtonProcesarInformacionPedidoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoProdu)	{
		this.jButtonProcesarInformacionPedidoProdu = jButtonProcesarInformacionPedidoProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoProdu() {
		return this.jComboBoxTiposAccionesPedidoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoProdu(
			JComboBox jComboBoxTiposRelacionesPedidoProdu) {
		this.jComboBoxTiposRelacionesPedidoProdu = jComboBoxTiposRelacionesPedidoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoProdu(
			JComboBox jComboBoxTiposAccionesPedidoProdu) {
		this.jComboBoxTiposAccionesPedidoProdu = jComboBoxTiposAccionesPedidoProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidoProdu() {
		return this.jComboBoxTiposAccionesFormularioPedidoProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidoProdu(
			JComboBox jComboBoxTiposAccionesFormularioPedidoProdu) {
		this.jComboBoxTiposAccionesFormularioPedidoProdu = jComboBoxTiposAccionesFormularioPedidoProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidoproduSessionBean=new PedidoProduSessionBean();
		
		this.pedidoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidoProdu=new JButtonMe();
				this.jButtonModificarToolBarPedidoProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidoProdu,this.jTtoolBarDetallePedidoProdu,
							"actualizar","actualizar","Actualizar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidoProdu,this.jTtoolBarDetallePedidoProdu,
							"eliminar","eliminar","Eliminar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidoProdu,this.jTtoolBarDetallePedidoProdu,
							"cancelar","cancelar","Cancelar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidoProdu,this.jTtoolBarDetallePedidoProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidoProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidoProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidoProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidoProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidoProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidoProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidoProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidoProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidoProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidoProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidoProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidoProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidoProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidoProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidoProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidoProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidoProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidoProdu.add(this.jMenuItemDetalleCerrarPedidoProdu);
		
		this.jmenuDetalleAccionesPedidoProdu.add(this.jMenuItemActualizarPedidoProdu);
		this.jmenuDetalleAccionesPedidoProdu.add(this.jMenuItemEliminarPedidoProdu);
		this.jmenuDetalleAccionesPedidoProdu.add(this.jMenuItemCancelarPedidoProdu);		
		
		//this.jmenuDetalleDatosPedidoProdu.add(this.jMenuItemDetalleAbrirOrderByPedidoProdu);				
		this.jmenuDetalleDatosPedidoProdu.add(this.jMenuItemDetalleMostarOcultarPedidoProdu);				
				
		//this.jmenuDetalleAccionesPedidoProdu.add(this.jMenuItemGuardarCambiosPedidoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidoProdu.add(this.jmenuDetalleArchivoPedidoProdu);		
		this.jmenuBarDetallePedidoProdu.add(this.jmenuDetalleAccionesPedidoProdu);		
		this.jmenuBarDetallePedidoProdu.add(this.jmenuDetalleDatosPedidoProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoProdu.add(this.jmenuDetallePedidoProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePedidoProdu);				
	}
	
	
	public void inicializarElementosCamposPedidoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidoProdu = new JLabelMe();
		jLabelIdPedidoProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidoProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidoProdu= new GridBagLayout();

		this.jPanelidPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);

		jLabelidPedidoProdu = new JLabel();
		jLabelidPedidoProdu.setText("Id");

		jLabelidPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialPedidoProdu = new JLabelMe();
		this.jLabelsecuencialPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialPedidoProdu.setToolTipText("Secuencial");
		this.jLabelsecuencialPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelsecuencialPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jTextFieldsecuencialPedidoProdu= new JTextFieldMe();

		jTextFieldsecuencialPedidoProdu.setEnabled(false);
		jTextFieldsecuencialPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialPedidoProduBusqueda= new JButtonMe();
		this.jButtonsecuencialPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialPedidoProduBusqueda.setText("U");
		this.jButtonsecuencialPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialPedidoProduBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_clientePedidoProdu = new JLabelMe();
		this.jLabeldireccion_clientePedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE+" : *");
		this.jLabeldireccion_clientePedidoProdu.setToolTipText("Direccion Cliente");
		this.jLabeldireccion_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_clientePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_clientePedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPaneldireccion_clientePedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jTextAreadireccion_clientePedidoProdu= new JTextAreaMe();
		jTextAreadireccion_clientePedidoProdu.setEnabled(false);
		jTextAreadireccion_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clientePedidoProdu.setLineWrap(true);
		jTextAreadireccion_clientePedidoProdu.setWrapStyleWord(true);
		jTextAreadireccion_clientePedidoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_clientePedidoProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_clientePedidoProdu = new JScrollPane(jTextAreadireccion_clientePedidoProdu);
		jscrollPanedireccion_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_clientePedidoProduBusqueda= new JButtonMe();
		this.jButtondireccion_clientePedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clientePedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clientePedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_clientePedidoProduBusqueda.setText("U");
		this.jButtondireccion_clientePedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_clientePedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_clientePedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_clientePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_clientePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_clientePedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_clientePedidoProduBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_clientePedidoProdu = new JLabelMe();
		this.jLabeltelefono_clientePedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE+" : *");
		this.jLabeltelefono_clientePedidoProdu.setToolTipText("Telefono Cliente");
		this.jLabeltelefono_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_clientePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_clientePedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPaneltelefono_clientePedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jTextFieldtelefono_clientePedidoProdu= new JTextFieldMe();

		jTextFieldtelefono_clientePedidoProdu.setEnabled(false);
		jTextFieldtelefono_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefono_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefono_clientePedidoProduBusqueda= new JButtonMe();
		this.jButtontelefono_clientePedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clientePedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clientePedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_clientePedidoProduBusqueda.setText("U");
		this.jButtontelefono_clientePedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_clientePedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_clientePedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefono_clientePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefono_clientePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_clientePedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_clientePedidoProduBusqueda.setVisible(false);		}


					
		this.jLabelruc_clientePedidoProdu = new JLabelMe();
		this.jLabelruc_clientePedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_RUCCLIENTE+" : *");
		this.jLabelruc_clientePedidoProdu.setToolTipText("Ruc Cliente");
		this.jLabelruc_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clientePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clientePedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelruc_clientePedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jTextFieldruc_clientePedidoProdu= new JTextFieldMe();

		jTextFieldruc_clientePedidoProdu.setEnabled(false);
		jTextFieldruc_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clientePedidoProduBusqueda= new JButtonMe();
		this.jButtonruc_clientePedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clientePedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clientePedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clientePedidoProduBusqueda.setText("U");
		this.jButtonruc_clientePedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clientePedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clientePedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clientePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clientePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clientePedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clientePedidoProduBusqueda.setVisible(false);		}


					
		this.jLabellotePedidoProdu = new JLabelMe();
		this.jLabellotePedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabellotePedidoProdu.setToolTipText("Lote");
		this.jLabellotePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellotePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellotePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellotePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellotePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellotePedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanellotePedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jTextFieldlotePedidoProdu= new JTextFieldMe();

		jTextFieldlotePedidoProdu.setEnabled(false);
		jTextFieldlotePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlotePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlotePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlotePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlotePedidoProduBusqueda= new JButtonMe();
		this.jButtonlotePedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlotePedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlotePedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlotePedidoProduBusqueda.setText("U");
		this.jButtonlotePedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlotePedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlotePedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlotePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlotePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lotePedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlotePedidoProduBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pedidoPedidoProdu = new JLabelMe();
		this.jLabelfecha_pedidoPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO+" : *");
		this.jLabelfecha_pedidoPedidoProdu.setToolTipText("Fecha Pedo");
		this.jLabelfecha_pedidoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pedidoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pedidoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pedidoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pedidoPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pedidoPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelfecha_pedidoPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		//jFormattedTextFieldfecha_pedidoPedidoProdu= new JFormattedTextFieldMe();

		jDateChooserfecha_pedidoPedidoProdu= new JDateChooser();
		jDateChooserfecha_pedidoPedidoProdu.setEnabled(false);
		jDateChooserfecha_pedidoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pedidoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pedidoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pedidoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pedidoPedidoProdu.setDate(new Date());
		jDateChooserfecha_pedidoPedidoProdu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pedidoPedidoProdu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pedidoPedidoProduBusqueda= new JButtonMe();
		this.jButtonfecha_pedidoPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pedidoPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pedidoPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pedidoPedidoProduBusqueda.setText("U");
		this.jButtonfecha_pedidoPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pedidoPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pedidoPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pedidoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pedidoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pedidoPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pedidoPedidoProduBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaPedidoProdu = new JLabelMe();
		this.jLabelfecha_entregaPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaPedidoProdu.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelfecha_entregaPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		//jFormattedTextFieldfecha_entregaPedidoProdu= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaPedidoProdu= new JDateChooser();
		jDateChooserfecha_entregaPedidoProdu.setEnabled(false);
		jDateChooserfecha_entregaPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaPedidoProdu.setDate(new Date());
		jDateChooserfecha_entregaPedidoProdu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaPedidoProdu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaPedidoProduBusqueda= new JButtonMe();
		this.jButtonfecha_entregaPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaPedidoProduBusqueda.setText("U");
		this.jButtonfecha_entregaPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaPedidoProduBusqueda.setVisible(false);		}


					
		this.jLabeles_uso_internoPedidoProdu = new JLabelMe();
		this.jLabeles_uso_internoPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO+" : *");
		this.jLabeles_uso_internoPedidoProdu.setToolTipText("Es Uso Interno");
		this.jLabeles_uso_internoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_uso_internoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_uso_internoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_uso_internoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_uso_internoPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_uso_internoPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPaneles_uso_internoPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jCheckBoxes_uso_internoPedidoProdu= new JCheckBoxMe();
		jCheckBoxes_uso_internoPedidoProdu.setEnabled(false);

		jCheckBoxes_uso_internoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_uso_internoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_uso_internoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_uso_internoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_uso_internoPedidoProduBusqueda= new JButtonMe();
		this.jButtones_uso_internoPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_uso_internoPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_uso_internoPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_uso_internoPedidoProduBusqueda.setText("U");
		this.jButtones_uso_internoPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_uso_internoPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_uso_internoPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_uso_internoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_uso_internoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_uso_internoPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_uso_internoPedidoProduBusqueda.setVisible(false);		}


					
		this.jLabelfechaPedidoProdu = new JLabelMe();
		this.jLabelfechaPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPedidoProdu.setToolTipText("Fecha");
		this.jLabelfechaPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelfechaPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		//jFormattedTextFieldfechaPedidoProdu= new JFormattedTextFieldMe();

		jDateChooserfechaPedidoProdu= new JDateChooser();
		jDateChooserfechaPedidoProdu.setEnabled(false);
		jDateChooserfechaPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPedidoProdu.setDate(new Date());
		jDateChooserfechaPedidoProdu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPedidoProdu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPedidoProduBusqueda= new JButtonMe();
		this.jButtonfechaPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPedidoProduBusqueda.setText("U");
		this.jButtonfechaPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPedidoProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPedidoProdu = new JLabelMe();
		this.jLabeldescripcionPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPedidoProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPaneldescripcionPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jTextAreadescripcionPedidoProdu= new JTextAreaMe();
		jTextAreadescripcionPedidoProdu.setEnabled(false);
		jTextAreadescripcionPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoProdu.setLineWrap(true);
		jTextAreadescripcionPedidoProdu.setWrapStyleWord(true);
		jTextAreadescripcionPedidoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPedidoProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPedidoProdu = new JScrollPane(jTextAreadescripcionPedidoProdu);
		jscrollPanedescripcionPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPedidoProduBusqueda= new JButtonMe();
		this.jButtondescripcionPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPedidoProduBusqueda.setText("U");
		this.jButtondescripcionPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPedidoProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidoProdu = new JLabelMe();
		this.jLabelid_empresaPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidoProdu.setToolTipText("Empresa");
		this.jLabelid_empresaPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_empresaPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_empresaPedidoProdu= new JComboBoxMe();
		jComboBoxid_empresaPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidoProdu.setEnabled(false);

		this.jButtonid_empresaPedidoProdu= new JButtonMe();
		this.jButtonid_empresaPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoProdu.setText("Buscar");
		this.jButtonid_empresaPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoProdu"));

		this.jButtonid_empresaPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoProduBusqueda.setText("U");
		this.jButtonid_empresaPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoProduUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoProduUpdate.setText("U");
		this.jButtonid_empresaPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoProduUpdate"));



					
		this.jLabelid_sucursalPedidoProdu = new JLabelMe();
		this.jLabelid_sucursalPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidoProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_sucursalPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_sucursalPedidoProdu= new JComboBoxMe();
		jComboBoxid_sucursalPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidoProdu.setEnabled(false);

		this.jButtonid_sucursalPedidoProdu= new JButtonMe();
		this.jButtonid_sucursalPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoProdu.setText("Buscar");
		this.jButtonid_sucursalPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoProdu"));

		this.jButtonid_sucursalPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoProduBusqueda.setText("U");
		this.jButtonid_sucursalPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoProduUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoProduUpdate.setText("U");
		this.jButtonid_sucursalPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoProduUpdate"));



					
		this.jLabelid_ejercicioPedidoProdu = new JLabelMe();
		this.jLabelid_ejercicioPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPedidoProdu.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_ejercicioPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_ejercicioPedidoProdu= new JComboBoxMe();
		jComboBoxid_ejercicioPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPedidoProdu.setEnabled(false);

		this.jButtonid_ejercicioPedidoProdu= new JButtonMe();
		this.jButtonid_ejercicioPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoProdu.setText("Buscar");
		this.jButtonid_ejercicioPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoProdu"));

		this.jButtonid_ejercicioPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoProduBusqueda.setText("U");
		this.jButtonid_ejercicioPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPedidoProduUpdate= new JButtonMe();
		this.jButtonid_ejercicioPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoProduUpdate.setText("U");
		this.jButtonid_ejercicioPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoProduUpdate"));



					
		this.jLabelid_periodoPedidoProdu = new JLabelMe();
		this.jLabelid_periodoPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPedidoProdu.setToolTipText("Periodo");
		this.jLabelid_periodoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_periodoPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_periodoPedidoProdu= new JComboBoxMe();
		jComboBoxid_periodoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPedidoProdu.setEnabled(false);

		this.jButtonid_periodoPedidoProdu= new JButtonMe();
		this.jButtonid_periodoPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoProdu.setText("Buscar");
		this.jButtonid_periodoPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoProdu"));

		this.jButtonid_periodoPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_periodoPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoProduBusqueda.setText("U");
		this.jButtonid_periodoPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_periodoPedidoProduUpdate= new JButtonMe();
		this.jButtonid_periodoPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoProduUpdate.setText("U");
		this.jButtonid_periodoPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoProduUpdate"));



					
		this.jLabelid_formatoPedidoProdu = new JLabelMe();
		this.jLabelid_formatoPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoPedidoProdu.setToolTipText("Formato");
		this.jLabelid_formatoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_formatoPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_formatoPedidoProdu= new JComboBoxMe();
		jComboBoxid_formatoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoPedidoProdu= new JButtonMe();
		this.jButtonid_formatoPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoProdu.setText("Buscar");
		this.jButtonid_formatoPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoProdu"));

		this.jButtonid_formatoPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_formatoPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoProduBusqueda.setText("U");
		this.jButtonid_formatoPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_formatoPedidoProduUpdate= new JButtonMe();
		this.jButtonid_formatoPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoProduUpdate.setText("U");
		this.jButtonid_formatoPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoProduUpdate"));



					
		this.jLabelid_tipo_prioridad_empresa_produPedidoProdu = new JLabelMe();
		this.jLabelid_tipo_prioridad_empresa_produPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU+" : *");
		this.jLabelid_tipo_prioridad_empresa_produPedidoProdu.setToolTipText("Tipo Priorad Empresa Produ");
		this.jLabelid_tipo_prioridad_empresa_produPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_prioridad_empresa_produPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_prioridad_empresa_produPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prioridad_empresa_produPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_prioridad_empresa_produPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_prioridad_empresa_produPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_tipo_prioridad_empresa_produPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu= new JComboBoxMe();
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prioridad_empresa_produPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu= new JButtonMe();
		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu.setText("Buscar");
		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_prioridad_empresa_produPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prioridad_empresa_produPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prioridad_empresa_produPedidoProdu"));

		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setText("U");
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prioridad_empresa_produPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate= new JButtonMe();
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.setText("U");
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prioridad_empresa_produPedidoProduUpdate"));



					
		this.jLabelid_empleado_responsablePedidoProdu = new JLabelMe();
		this.jLabelid_empleado_responsablePedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE+" : *");
		this.jLabelid_empleado_responsablePedidoProdu.setToolTipText("Empleado Responsable");
		this.jLabelid_empleado_responsablePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_empleado_responsablePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_empleado_responsablePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_responsablePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_responsablePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_responsablePedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_empleado_responsablePedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_empleado_responsablePedidoProdu= new JComboBoxMe();
		jComboBoxid_empleado_responsablePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsablePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsablePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_responsablePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_responsablePedidoProdu= new JButtonMe();
		this.jButtonid_empleado_responsablePedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_responsablePedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_responsablePedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_responsablePedidoProdu.setText("Buscar");
		this.jButtonid_empleado_responsablePedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_responsablePedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_responsablePedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_responsablePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_responsablePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_responsablePedidoProdu"));

		this.jButtonid_empleado_responsablePedidoProduBusqueda= new JButtonMe();
		this.jButtonid_empleado_responsablePedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsablePedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsablePedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_responsablePedidoProduBusqueda.setText("U");
		this.jButtonid_empleado_responsablePedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_responsablePedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_responsablePedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_responsablePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_responsablePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_responsablePedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_responsablePedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_empleado_responsablePedidoProduUpdate= new JButtonMe();
		this.jButtonid_empleado_responsablePedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsablePedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsablePedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_responsablePedidoProduUpdate.setText("U");
		this.jButtonid_empleado_responsablePedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_responsablePedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_responsablePedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_responsablePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_responsablePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_responsablePedidoProduUpdate"));



					
		this.jLabelid_clientePedidoProdu = new JLabelMe();
		this.jLabelid_clientePedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePedidoProdu.setToolTipText("Cliente");
		this.jLabelid_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_clientePedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_clientePedidoProdu= new JComboBoxMe();
		jComboBoxid_clientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePedidoProdu= new JButtonMe();
		this.jButtonid_clientePedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoProdu.setText("Buscar");
		this.jButtonid_clientePedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoProdu"));

		this.jButtonid_clientePedidoProduBusqueda= new JButtonMe();
		this.jButtonid_clientePedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoProduBusqueda.setText("U");
		this.jButtonid_clientePedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_clientePedidoProduUpdate= new JButtonMe();
		this.jButtonid_clientePedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoProduUpdate.setText("U");
		this.jButtonid_clientePedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoProduUpdate"));



					
		this.jLabelid_estado_orden_produPedidoProdu = new JLabelMe();
		this.jLabelid_estado_orden_produPedidoProdu.setText(""+PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU+" : *");
		this.jLabelid_estado_orden_produPedidoProdu.setToolTipText("Estado Orden Produ");
		this.jLabelid_estado_orden_produPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_orden_produPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_orden_produPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_orden_produPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_orden_produPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_orden_produPedidoProdu.setToolTipText(PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
		this.gridaBagLayoutPedidoProdu = new GridBagLayout();
		this.jPanelid_estado_orden_produPedidoProdu.setLayout(this.gridaBagLayoutPedidoProdu);


		jComboBoxid_estado_orden_produPedidoProdu= new JComboBoxMe();
		jComboBoxid_estado_orden_produPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_orden_produPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_orden_produPedidoProdu= new JButtonMe();
		this.jButtonid_estado_orden_produPedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_produPedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_produPedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_produPedidoProdu.setText("Buscar");
		this.jButtonid_estado_orden_produPedidoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_orden_produPedidoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_produPedidoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_orden_produPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_produPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_produPedidoProdu"));

		this.jButtonid_estado_orden_produPedidoProduBusqueda= new JButtonMe();
		this.jButtonid_estado_orden_produPedidoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produPedidoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produPedidoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_orden_produPedidoProduBusqueda.setText("U");
		this.jButtonid_estado_orden_produPedidoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_orden_produPedidoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_produPedidoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_orden_produPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_produPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_produPedidoProduBusqueda"));

		if(this.pedidoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_orden_produPedidoProduBusqueda.setVisible(false);		}

		this.jButtonid_estado_orden_produPedidoProduUpdate= new JButtonMe();
		this.jButtonid_estado_orden_produPedidoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produPedidoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produPedidoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_orden_produPedidoProduUpdate.setText("U");
		this.jButtonid_estado_orden_produPedidoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_orden_produPedidoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_produPedidoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_orden_produPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_produPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_produPedidoProduUpdate"));



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
		//this.jInternalFrameDetallePedidoProdu = new PedidoProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoProdu= new GridBagLayout();
		

		
		String sToolTipPedidoProdu="";
		sToolTipPedidoProdu=PedidoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoProdu+="(Produccion.PedidoProdu)";
		}
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidoProdu = new JButtonMe();
		this.jButtonModificarPedidoProdu = new JButtonMe();
        this.jButtonActualizarPedidoProdu = new JButtonMe();
        this.jButtonEliminarPedidoProdu = new JButtonMe();
        this.jButtonCancelarPedidoProdu = new JButtonMe();
        this.jButtonGuardarCambiosPedidoProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidoProdu = new JButtonMe();
		this.jButtonCerrarPedidoProdu = new JButtonMe();
		
		this.jScrollPanelDatosPedidoProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidoProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidoProdu = new JScrollPane();
				
		
		
		this.jPanelCamposPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Produccion";
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPedidoProdu.setName("jPanelCamposPedidoProdu"); 

		this.jPanelCamposOcultosPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidoProdu.setName("jPanelCamposOcultosPedidoProdu"); 

        this.jPanelAccionesPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoProdu.setToolTipText("Acciones");
        this.jPanelAccionesPedidoProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidoProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidoProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidoProdu.setText("Nuevo");
		this.jButtonModificarPedidoProdu.setText("Editar");
        this.jButtonActualizarPedidoProdu.setText("Actualizar");
        this.jButtonEliminarPedidoProdu.setText("Eliminar");
        this.jButtonCancelarPedidoProdu.setText("Cancelar");
        this.jButtonGuardarCambiosPedidoProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidoProdu.setText("Guardar");
		this.jButtonCerrarPedidoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoProdu,"nuevo_button","Nuevo",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidoProdu,"modificar_button","Editar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidoProdu,"actualizar_button","Actualizar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidoProdu,"eliminar_button","Eliminar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidoProdu,"cancelar_button","Cancelar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidoProdu,"guardarcambios_button","Guardar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoProdu,"guardarcambiostabla_button","Guardar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoProdu,"cerrar_button","Salir",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidoProdu.setToolTipText("Nuevo"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidoProdu.setToolTipText("Editar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidoProdu.setToolTipText("Actualizar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidoProdu.setToolTipText("Eliminar)"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidoProdu.setToolTipText("Cancelar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidoProdu.setToolTipText("Guardar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidoProdu.setToolTipText("Guardar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoProdu.setToolTipText("Salir"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoProdu";
		inputMap = this.jButtonNuevoPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidoProdu";
		inputMap = this.jButtonActualizarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidoProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidoProdu";
		inputMap = this.jButtonEliminarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidoProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidoProdu";
		inputMap = this.jButtonCancelarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidoProdu"));
		
		//CERRAR		
		sMapKey = "CerrarPedidoProdu";
		inputMap = this.jButtonCerrarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoProdu";
		inputMap = this.jButtonGuardarCambiosTablaPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidoProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidoProdu.setToolTipText("Nuevo PedidoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidoProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidoProdu.setToolTipText("Sin Cerrar Ventana PedidoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidoProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidoProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoProdu.setText("Accion");
		this.jComboBoxTiposAccionesPedidoProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidoProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidoProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidoProdu = new JLabelMe();
		
		this.jLabelAccionesPedidoProdu.setText("Acciones");		
		this.jLabelAccionesPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidoProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidoProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidoProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidoProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidoProdu = new GridBagLayout();
		
		this.jPanelCamposPedidoProdu.setLayout(gridaBagLayoutCamposPedidoProdu);
		this.jPanelCamposOcultosPedidoProdu.setLayout(gridaBagLayoutCamposOcultosPedidoProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidoProdu.add(jLabelIdPedidoProdu, this.gridBagConstraintsPedidoProdu);



	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidoProdu.add(jLabelidPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidoProdu.add(jLabelid_empresaPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoProdu.add(jButtonid_empresaPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoProdu.add(jButtonid_empresaPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidoProdu.add(jComboBoxid_empresaPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedidoProdu.add(jLabelid_sucursalPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoProdu.add(jButtonid_sucursalPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoProdu.add(jButtonid_sucursalPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedidoProdu.add(jComboBoxid_sucursalPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPedidoProdu.add(jLabelid_ejercicioPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoProdu.add(jButtonid_ejercicioPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoProdu.add(jButtonid_ejercicioPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPedidoProdu.add(jComboBoxid_ejercicioPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPedidoProdu.add(jLabelid_periodoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoProdu.add(jButtonid_periodoPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoProdu.add(jButtonid_periodoPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPedidoProdu.add(jComboBoxid_periodoPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoPedidoProdu.add(jLabelid_formatoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoProdu.add(jButtonid_formatoPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoProdu.add(jButtonid_formatoPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoPedidoProdu.add(jComboBoxid_formatoPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_prioridad_empresa_produPedidoProdu.add(jLabelid_tipo_prioridad_empresa_produPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prioridad_empresa_produPedidoProdu.add(jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prioridad_empresa_produPedidoProdu.add(jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_prioridad_empresa_produPedidoProdu.add(jComboBoxid_tipo_prioridad_empresa_produPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_responsablePedidoProdu.add(jLabelid_empleado_responsablePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_responsablePedidoProdu.add(jButtonid_empleado_responsablePedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_responsablePedidoProdu.add(jButtonid_empleado_responsablePedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_responsablePedidoProdu.add(jComboBoxid_empleado_responsablePedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialPedidoProdu.add(jLabelsecuencialPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialPedidoProdu.add(jButtonsecuencialPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialPedidoProdu.add(jTextFieldsecuencialPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePedidoProdu.add(jLabelid_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 2;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePedidoProdu.add(jButtonid_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoProdu.add(jButtonid_clientePedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 4;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoProdu.add(jButtonid_clientePedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePedidoProdu.add(jComboBoxid_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_clientePedidoProdu.add(jLabeldireccion_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_clientePedidoProdu.add(jButtondireccion_clientePedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_clientePedidoProdu.add(jscrollPanedireccion_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_clientePedidoProdu.add(jLabeltelefono_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_clientePedidoProdu.add(jButtontelefono_clientePedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_clientePedidoProdu.add(jTextFieldtelefono_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clientePedidoProdu.add(jLabelruc_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clientePedidoProdu.add(jButtonruc_clientePedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clientePedidoProdu.add(jTextFieldruc_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellotePedidoProdu.add(jLabellotePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanellotePedidoProdu.add(jButtonlotePedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellotePedidoProdu.add(jTextFieldlotePedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pedidoPedidoProdu.add(jLabelfecha_pedidoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pedidoPedidoProdu.add(jButtonfecha_pedidoPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pedidoPedidoProdu.add(jDateChooserfecha_pedidoPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaPedidoProdu.add(jLabelfecha_entregaPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaPedidoProdu.add(jButtonfecha_entregaPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaPedidoProdu.add(jDateChooserfecha_entregaPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_uso_internoPedidoProdu.add(jLabeles_uso_internoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_uso_internoPedidoProdu.add(jButtones_uso_internoPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_uso_internoPedidoProdu.add(jCheckBoxes_uso_internoPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPedidoProdu.add(jLabelfechaPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPedidoProdu.add(jButtonfechaPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPedidoProdu.add(jDateChooserfechaPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPedidoProdu.add(jLabeldescripcionPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPedidoProdu.add(jButtondescripcionPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPedidoProdu.add(jscrollPanedescripcionPedidoProdu, this.gridBagConstraintsPedidoProdu);


	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 0;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_orden_produPedidoProdu.add(jLabelid_estado_orden_produPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 2;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_orden_produPedidoProdu.add(jButtonid_estado_orden_produPedidoProduBusqueda, this.gridBagConstraintsPedidoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 3;
		this.gridBagConstraintsPedidoProdu.ipadx = 0;
		this.gridBagConstraintsPedidoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_orden_produPedidoProdu.add(jButtonid_estado_orden_produPedidoProduUpdate, this.gridBagConstraintsPedidoProdu);
	}

	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoProdu.gridy = 0;
	this.gridBagConstraintsPedidoProdu.gridx = 1;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_orden_produPedidoProdu.add(jComboBoxid_estado_orden_produPedidoProdu, this.gridBagConstraintsPedidoProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelidPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelid_formatoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelid_tipo_prioridad_empresa_produPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelid_empleado_responsablePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelsecuencialPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelid_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPaneldireccion_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPaneltelefono_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelruc_clientePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanellotePedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelfecha_pedidoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelfecha_entregaPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPaneles_uso_internoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelfechaPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPaneldescripcionPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoProdu.add(this.jPanelid_estado_orden_produPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposPedidoProdu % 2==0) {
		iXPanelCamposPedidoProdu=0;
		iYPanelCamposPedidoProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposOcultosPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposOcultosPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoProdu.add(this.jPanelid_empresaPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposOcultosPedidoProdu % 2==0) {
		iXPanelCamposOcultosPedidoProdu=0;
		iYPanelCamposOcultosPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposOcultosPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposOcultosPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoProdu.add(this.jPanelid_sucursalPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposOcultosPedidoProdu % 2==0) {
		iXPanelCamposOcultosPedidoProdu=0;
		iYPanelCamposOcultosPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposOcultosPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposOcultosPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoProdu.add(this.jPanelid_ejercicioPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposOcultosPedidoProdu % 2==0) {
		iXPanelCamposOcultosPedidoProdu=0;
		iYPanelCamposOcultosPedidoProdu++;
	}
	this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoProdu.gridy = iYPanelCamposOcultosPedidoProdu;
	this.gridBagConstraintsPedidoProdu.gridx = iXPanelCamposOcultosPedidoProdu++;
	this.gridBagConstraintsPedidoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoProdu.add(this.jPanelid_periodoPedidoProdu, this.gridBagConstraintsPedidoProdu);



	if(iXPanelCamposOcultosPedidoProdu % 2==0) {
		iXPanelCamposOcultosPedidoProdu=0;
		iYPanelCamposOcultosPedidoProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesPedidoProdu= new GridBagLayout();
		this.jPanelAccionesPedidoProdu.setLayout(gridaBagLayoutAccionesPedidoProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidoProdu= new GridBagLayout();
		this.jPanelAccionesFormularioPedidoProdu.setLayout(gridaBagLayoutAccionesFormularioPedidoProdu);
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoProdu.add(this.jComboBoxTiposAccionesFormularioPedidoProdu, this.gridBagConstraintsPedidoProdu);

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoProdu.add(this.jCheckBoxPostAccionNuevoPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoProdu.add(this.jCheckBoxPostAccionSinCerrarPedidoProdu, this.gridBagConstraintsPedidoProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoProdu.add(this.jCheckBoxPostAccionSinMensajePedidoProdu, this.gridBagConstraintsPedidoProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidoProdu.add(this.jButtonModificarPedidoProdu, this.gridBagConstraintsPedidoProdu);							

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidoProdu.add(this.jButtonEliminarPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
			
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = 0;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoProdu.add(this.jButtonActualizarPedidoProdu, this.gridBagConstraintsPedidoProdu);


		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = 0;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoProdu.add(this.jButtonGuardarCambiosPedidoProdu, this.gridBagConstraintsPedidoProdu);	
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = 0;		
		this.gridBagConstraintsPedidoProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidoProdu.add(this.jButtonCancelarPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();						
			this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoProdu.gridx = 0;		
			//this.gridBagConstraintsPedidoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoProdu.gridx =0;
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoProdu, this.gridBagConstraintsPedidoProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidoProdu = new PedidoProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoProduModel pedidoproduModel=new PedidoProduModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoProduModel.PedidoProduFocusTraversalPolicy pedidoproduFocusTraversalPolicy = pedidoproduModel.new PedidoProduFocusTraversalPolicy(this);
			
			//pedidoproduFocusTraversalPolicy.setpedidoproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidoproduModel);
			
			
			this.jContentPaneDetallePedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidoProdu = new GridBagLayout();	
			this.jContentPaneDetallePedidoProdu.setLayout(gridaBagLayoutDetallePedidoProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPedidoProdu.gridx = 0;
					
				
				this.jContentPaneDetallePedidoProdu.add(jTtoolBarDetallePedidoProdu, gridBagConstraintsPedidoProdu);								
				
}
			
			this.jScrollPanelDatosEdicionPedidoProdu=   new JScrollPane(jContentPaneDetallePedidoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidoProdu.gridx = 0;
	        
			this.jContentPaneDetallePedidoProdu.add(jPanelCamposPedidoProdu, gridBagConstraintsPedidoProdu);
			
			
			
			
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
						&& pedidoproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(this.puedeCargarPorPartePedidoDetaProdu,false,-1);
					
					if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidoProdu= new GridBagConstraints();
						this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidoProdu.gridx = 0;
						this.jContentPaneDetallePedidoProdu.add(this.jTabbedPaneRelacionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidoProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidoProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
					this.gridBagConstraintsPedidoProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidoProdu.gridx = 0;
					
				
					this.jContentPaneDetallePedidoProdu.add(jPanelCamposOcultosPedidoProdu, gridBagConstraintsPedidoProdu);
				
					this.jPanelCamposOcultosPedidoProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPedidoProdu.gridx = 0;
	        this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidoProdu.add(this.jPanelAccionesFormularioPedidoProdu, this.gridBagConstraintsPedidoProdu);							
			
			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
	        this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPedidoProdu.gridx = 0;
	        
			
			this.jContentPaneDetallePedidoProdu.add(this.jPanelAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidoProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidoProdu=   new JScrollPane(this.jPanelCamposPedidoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidoProdu.gridx = 0;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidoProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidoProdu, this.gridBagConstraintsPedidoProdu);			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
			
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
			
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidoProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidoProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		this.pedidodetaproduSessionBean.setConGuardarRelaciones(false);
		this.pedidodetaproduSessionBean.setEsGuardarRelacionado(true);

		this.pedidodetaproduBeanSwingJInternalFrame=null;//new PedidoDetaProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidodetaproduBeanSwingJInternalFramePopup=new PedidoDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidodetaproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {

				PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidodetaproduSessionBean.setEsGuardarRelacionado(true);

				this.pedidodetaproduBeanSwingJInternalFrame=new PedidoDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pedidodetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidodetaproduBeanSwingJInternalFrame.setpedidodetaproduSessionBean(this.pedidodetaproduSessionBean);

				//this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
				//this.gridBagConstraintsPedidoProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedidoProdu.gridx = 0;
				//this.jContentPaneDetallePedidoProdu.add(this.pedidodetaproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedidoProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedidoProdu.add("Pedido Detalle Producciones",this.pedidodetaproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedidoProdu.setComponentAt(iIndexTab,this.pedidodetaproduBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidodetaproduSessionBean.setEsGuardarRelacionado(false);
				this.pedidodetaproduBeanSwingJInternalFrame=null;//new PedidoDetaProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoDetaProdu) {
					this.jTabbedPaneRelacionesPedidoProdu.add("Pedido Detalle Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoDetaProduBeanSwingJInternalFrame(List<PedidoProdu> pedidoprodus,PedidoProdu pedidoprodu,PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidodetaproduBeanSwingJInternalFrame=new PedidoDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidodetaproduBeanSwingJInternalFrame.getPedidoDetaProduLogic().setConnexion(this.pedidoproduLogic.getConnexion());

					pedidodetaproduBeanSwingJInternalFrame.setpedidoprodusForeignKey(pedidoprodus);
					pedidodetaproduBeanSwingJInternalFrame.setpedidoproduForeignKey(pedidoprodu);
					pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setisBusquedaDesdeForeignKeySesionPedidoProdu(true);
					pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setlidPedidoProduActual(pedidoprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidodetaproduBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoDetaProdu(pedidodetaproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidodetaproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedidoProdu(true);
					pedidodetaproduBeanSwingJInternalFrame.setid_pedido_produFK_IdPedidoProdu(pedidoprodu.getId());

					if(!this.conCargarFormDetalle) {
						pedidodetaproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidodetaproduBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoProduForeignKey(pedidoprodu,1,false,true,true);
					pedidodetaproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidodetaproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedidoProdu");
					pedidodetaproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedidoProdu");
					pedidodetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoDetaProdu(true);
					pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoDetaProdu("n",pedidodetaproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidodetaproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidodetaproduBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidodetaproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoDetaProdu("relacionado");
					} else {
						pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoDetaProdu("no_relacionado");
					}

					pedidodetaproduBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoDetaProdu().setVisible(false);

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
