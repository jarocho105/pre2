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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.AnalisisTransaClienteConstantesFunciones;

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
public class AnalisisTransaClienteDetalleFormJInternalFrame extends AnalisisTransaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAnalisisTransaCliente;
	
	protected JMenuBar jmenuBarDetalleAnalisisTransaCliente;
	
	protected JMenu jmenuDetalleAnalisisTransaCliente;
	protected JMenu jmenuDetalleArchivoAnalisisTransaCliente;
	protected JMenu jmenuDetalleAccionesAnalisisTransaCliente;
	protected JMenu jmenuDetalleDatosAnalisisTransaCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnalisisTransaCliente;	
	protected GridBagConstraints gridBagConstraintsAnalisisTransaCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AnalisisTransaClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleAnalisisTransaCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TransaccionBeanSwingJInternalFrame transaccion1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion1="";

	protected TransaccionBeanSwingJInternalFrame transaccion2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion2="";

	protected TransaccionBeanSwingJInternalFrame transaccion3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion3="";

	protected TransaccionBeanSwingJInternalFrame transaccion4BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion4="";

	protected TransaccionBeanSwingJInternalFrame transaccion5BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion5="";

	protected TransaccionBeanSwingJInternalFrame transaccion6BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion6="";

	protected TransaccionBeanSwingJInternalFrame transaccion7BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion7="";

	protected TransaccionBeanSwingJInternalFrame transaccion8BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion8="";

	protected TransaccionBeanSwingJInternalFrame transaccion9BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion9="";

	protected TransaccionBeanSwingJInternalFrame transaccion10BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion10="";
	
	public AnalisisTransaClienteSessionBean analisistransaclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TransaccionSessionBean transaccion1SessionBean;
	public TransaccionSessionBean transaccion2SessionBean;
	public TransaccionSessionBean transaccion3SessionBean;
	public TransaccionSessionBean transaccion4SessionBean;
	public TransaccionSessionBean transaccion5SessionBean;
	public TransaccionSessionBean transaccion6SessionBean;
	public TransaccionSessionBean transaccion7SessionBean;
	public TransaccionSessionBean transaccion8SessionBean;
	public TransaccionSessionBean transaccion9SessionBean;
	public TransaccionSessionBean transaccion10SessionBean;	
	
	public AnalisisTransaClienteLogic analisistransaclienteLogic;
	
	public JScrollPane jScrollPanelDatosAnalisisTransaCliente;
	public JScrollPane jScrollPanelDatosEdicionAnalisisTransaCliente;
	public JScrollPane jScrollPanelDatosGeneralAnalisisTransaCliente;
	
	protected JPanel jPanelCamposAnalisisTransaCliente;    
	protected JPanel jPanelCamposOcultosAnalisisTransaCliente;    	
	protected JPanel jPanelAccionesAnalisisTransaCliente;
	protected JPanel jPanelAccionesFormularioAnalisisTransaCliente;
    
	
	
	protected Integer iXPanelCamposAnalisisTransaCliente=0;
	protected Integer iYPanelCamposAnalisisTransaCliente=0;
	
	protected Integer iXPanelCamposOcultosAnalisisTransaCliente=0;
	protected Integer iYPanelCamposOcultosAnalisisTransaCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAnalisisTransaCliente;
	public JButton jButtonModificarAnalisisTransaCliente;
	public JButton jButtonActualizarAnalisisTransaCliente;
    public JButton jButtonEliminarAnalisisTransaCliente;
	public JButton jButtonCancelarAnalisisTransaCliente;
    public JButton jButtonGuardarCambiosAnalisisTransaCliente;
	public JButton jButtonGuardarCambiosTablaAnalisisTransaCliente;
	protected JButton jButtonCerrarAnalisisTransaCliente;
	
	
	protected JButton jButtonProcesarInformacionAnalisisTransaCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAnalisisTransaCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAnalisisTransaCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAnalisisTransaCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnalisisTransaCliente;
	protected JButton jButtonModificarToolBarAnalisisTransaCliente;
	protected JButton jButtonActualizarToolBarAnalisisTransaCliente;
    protected JButton jButtonEliminarToolBarAnalisisTransaCliente;
	protected JButton jButtonCancelarToolBarAnalisisTransaCliente;
    protected JButton jButtonGuardarCambiosToolBarAnalisisTransaCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarAnalisisTransaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarAnalisisTransaCliente;
	protected JButton jButtonCerrarToolBarAnalisisTransaCliente;
	
	protected JButton jButtonProcesarInformacionToolBarAnalisisTransaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnalisisTransaCliente;
	protected JMenuItem jMenuItemModificarAnalisisTransaCliente;
	protected JMenuItem jMenuItemActualizarAnalisisTransaCliente;
    protected JMenuItem jMenuItemEliminarAnalisisTransaCliente;
	protected JMenuItem jMenuItemCancelarAnalisisTransaCliente;
    protected JMenuItem jMenuItemGuardarCambiosAnalisisTransaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnalisisTransaCliente;
	protected JMenuItem jMenuItemCerrarAnalisisTransaCliente;
	protected JMenuItem jMenuItemDetalleCerrarAnalisisTransaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnalisisTransaCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionAnalisisTransaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnalisisTransaCliente;
	protected JMenuItem jMenuItemMostrarOcultarAnalisisTransaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnalisisTransaCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnalisisTransaCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAnalisisTransaCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAnalisisTransaCliente;
	public JLabel jLabelIdAnalisisTransaCliente;
	public JLabel jLabelidAnalisisTransaCliente;
	public JButton jButtonidAnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreAnalisisTransaCliente;
	public JLabel jLabelnombreAnalisisTransaCliente;
	public JTextArea jTextAreanombreAnalisisTransaCliente;
	public JScrollPane jscrollPanenombreAnalisisTransaCliente;
	public JButton jButtonnombreAnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAnalisisTransaCliente;
	public JLabel jLabeldescripcionAnalisisTransaCliente;
	public JTextArea jTextAreadescripcionAnalisisTransaCliente;
	public JScrollPane jscrollPanedescripcionAnalisisTransaCliente;
	public JButton jButtondescripcionAnalisisTransaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAnalisisTransaCliente;
	public JLabel jLabelid_empresaAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAnalisisTransaCliente;
	public JButton jButtonid_empresaAnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_empresaAnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaAnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloAnalisisTransaCliente;
	public JLabel jLabelid_moduloAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloAnalisisTransaCliente;
	public JButton jButtonid_moduloAnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_moduloAnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_moduloAnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionAnalisisTransaCliente;
	public JLabel jLabelid_transaccionAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionAnalisisTransaCliente;
	public JButton jButtonid_transaccionAnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccionAnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccionAnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion1AnalisisTransaCliente;
	public JLabel jLabelid_transaccion1AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion1AnalisisTransaCliente;
	public JButton jButtonid_transaccion1AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion1AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion1AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion2AnalisisTransaCliente;
	public JLabel jLabelid_transaccion2AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion2AnalisisTransaCliente;
	public JButton jButtonid_transaccion2AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion2AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion2AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion3AnalisisTransaCliente;
	public JLabel jLabelid_transaccion3AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion3AnalisisTransaCliente;
	public JButton jButtonid_transaccion3AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion3AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion3AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion4AnalisisTransaCliente;
	public JLabel jLabelid_transaccion4AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion4AnalisisTransaCliente;
	public JButton jButtonid_transaccion4AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion4AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion4AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion5AnalisisTransaCliente;
	public JLabel jLabelid_transaccion5AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion5AnalisisTransaCliente;
	public JButton jButtonid_transaccion5AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion5AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion5AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion6AnalisisTransaCliente;
	public JLabel jLabelid_transaccion6AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion6AnalisisTransaCliente;
	public JButton jButtonid_transaccion6AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion6AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion6AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion7AnalisisTransaCliente;
	public JLabel jLabelid_transaccion7AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion7AnalisisTransaCliente;
	public JButton jButtonid_transaccion7AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion7AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion7AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion8AnalisisTransaCliente;
	public JLabel jLabelid_transaccion8AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion8AnalisisTransaCliente;
	public JButton jButtonid_transaccion8AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion8AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion8AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion9AnalisisTransaCliente;
	public JLabel jLabelid_transaccion9AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion9AnalisisTransaCliente;
	public JButton jButtonid_transaccion9AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion9AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion9AnalisisTransaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion10AnalisisTransaCliente;
	public JLabel jLabelid_transaccion10AnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion10AnalisisTransaCliente;
	public JButton jButtonid_transaccion10AnalisisTransaCliente= new JButtonMe();
	public JButton jButtonid_transaccion10AnalisisTransaClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion10AnalisisTransaClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAnalisisTransaCliente;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AnalisisTransaClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAnalisisTransaCliente=new JPanel();
				this.jPanelAccionesFormularioAnalisisTransaCliente=new JPanel();
				this.jmenuBarDetalleAnalisisTransaCliente=new JMenuBar();
				this.jTtoolBarDetalleAnalisisTransaCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AnalisisTransaClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAnalisisTransaCliente() {
		return this.jButtonActualizarToolBarAnalisisTransaCliente;
	}
	
	public JButton getjButtonEliminarToolBarAnalisisTransaCliente() {
		return this.jButtonEliminarToolBarAnalisisTransaCliente;
	}
	
	public JButton getjButtonCancelarToolBarAnalisisTransaCliente() {
		return this.jButtonCancelarToolBarAnalisisTransaCliente;
	}		
	
	public JButton getjButtonProcesarInformacionAnalisisTransaCliente() {
		return this.jButtonProcesarInformacionAnalisisTransaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnalisisTransaCliente)	{
		this.jButtonProcesarInformacionAnalisisTransaCliente = jButtonProcesarInformacionAnalisisTransaCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnalisisTransaCliente() {
		return this.jComboBoxTiposAccionesAnalisisTransaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnalisisTransaCliente(
			JComboBox jComboBoxTiposRelacionesAnalisisTransaCliente) {
		this.jComboBoxTiposRelacionesAnalisisTransaCliente = jComboBoxTiposRelacionesAnalisisTransaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnalisisTransaCliente(
			JComboBox jComboBoxTiposAccionesAnalisisTransaCliente) {
		this.jComboBoxTiposAccionesAnalisisTransaCliente = jComboBoxTiposAccionesAnalisisTransaCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAnalisisTransaCliente() {
		return this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAnalisisTransaCliente(
			JComboBox jComboBoxTiposAccionesFormularioAnalisisTransaCliente) {
		this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente = jComboBoxTiposAccionesFormularioAnalisisTransaCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.analisistransaclienteSessionBean=new AnalisisTransaClienteSessionBean();
		
		this.analisistransaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.analisistransaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.analisistransaclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnalisisTransaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnalisisTransaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnalisisTransaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Analisis Transaccion Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		AnalisisTransaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAnalisisTransaCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAnalisisTransaCliente=new JButtonMe();
				this.jButtonModificarToolBarAnalisisTransaCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAnalisisTransaCliente,this.jTtoolBarDetalleAnalisisTransaCliente,
							"actualizar","actualizar","Actualizar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAnalisisTransaCliente,this.jTtoolBarDetalleAnalisisTransaCliente,
							"eliminar","eliminar","Eliminar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAnalisisTransaCliente,this.jTtoolBarDetalleAnalisisTransaCliente,
							"cancelar","cancelar","Cancelar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAnalisisTransaCliente,this.jTtoolBarDetalleAnalisisTransaCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAnalisisTransaCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAnalisisTransaCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAnalisisTransaCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAnalisisTransaCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAnalisisTransaCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnalisisTransaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnalisisTransaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnalisisTransaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAnalisisTransaCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAnalisisTransaCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAnalisisTransaCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAnalisisTransaCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAnalisisTransaCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAnalisisTransaCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAnalisisTransaCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAnalisisTransaCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAnalisisTransaCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAnalisisTransaCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAnalisisTransaCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAnalisisTransaCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAnalisisTransaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnalisisTransaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnalisisTransaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnalisisTransaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnalisisTransaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnalisisTransaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAnalisisTransaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAnalisisTransaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAnalisisTransaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnalisisTransaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnalisisTransaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnalisisTransaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAnalisisTransaCliente.add(this.jMenuItemDetalleCerrarAnalisisTransaCliente);
		
		this.jmenuDetalleAccionesAnalisisTransaCliente.add(this.jMenuItemActualizarAnalisisTransaCliente);
		this.jmenuDetalleAccionesAnalisisTransaCliente.add(this.jMenuItemEliminarAnalisisTransaCliente);
		this.jmenuDetalleAccionesAnalisisTransaCliente.add(this.jMenuItemCancelarAnalisisTransaCliente);		
		
		//this.jmenuDetalleDatosAnalisisTransaCliente.add(this.jMenuItemDetalleAbrirOrderByAnalisisTransaCliente);				
		this.jmenuDetalleDatosAnalisisTransaCliente.add(this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente);				
				
		//this.jmenuDetalleAccionesAnalisisTransaCliente.add(this.jMenuItemGuardarCambiosAnalisisTransaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAnalisisTransaCliente.add(this.jmenuDetalleArchivoAnalisisTransaCliente);		
		this.jmenuBarDetalleAnalisisTransaCliente.add(this.jmenuDetalleAccionesAnalisisTransaCliente);		
		this.jmenuBarDetalleAnalisisTransaCliente.add(this.jmenuDetalleDatosAnalisisTransaCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAnalisisTransaCliente);				
	}
	
	
	public void inicializarElementosCamposAnalisisTransaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAnalisisTransaCliente = new JLabelMe();
		jLabelIdAnalisisTransaCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAnalisisTransaCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAnalisisTransaCliente= new GridBagLayout();

		this.jPanelidAnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);

		jLabelidAnalisisTransaCliente = new JLabel();
		jLabelidAnalisisTransaCliente.setText("Id");

		jLabelidAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreAnalisisTransaCliente = new JLabelMe();
		this.jLabelnombreAnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAnalisisTransaCliente.setToolTipText("Nombre");
		this.jLabelnombreAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelnombreAnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jTextAreanombreAnalisisTransaCliente= new JTextAreaMe();
		jTextAreanombreAnalisisTransaCliente.setEnabled(false);
		jTextAreanombreAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAnalisisTransaCliente.setLineWrap(true);
		jTextAreanombreAnalisisTransaCliente.setWrapStyleWord(true);
		jTextAreanombreAnalisisTransaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreAnalisisTransaCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreAnalisisTransaCliente = new JScrollPane(jTextAreanombreAnalisisTransaCliente);
		jscrollPanenombreAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonnombreAnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAnalisisTransaClienteBusqueda.setText("U");
		this.jButtonnombreAnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAnalisisTransaClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAnalisisTransaCliente = new JLabelMe();
		this.jLabeldescripcionAnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionAnalisisTransaCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPaneldescripcionAnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jTextAreadescripcionAnalisisTransaCliente= new JTextAreaMe();
		jTextAreadescripcionAnalisisTransaCliente.setEnabled(false);
		jTextAreadescripcionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAnalisisTransaCliente.setLineWrap(true);
		jTextAreadescripcionAnalisisTransaCliente.setWrapStyleWord(true);
		jTextAreadescripcionAnalisisTransaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionAnalisisTransaCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionAnalisisTransaCliente = new JScrollPane(jTextAreadescripcionAnalisisTransaCliente);
		jscrollPanedescripcionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionAnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtondescripcionAnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAnalisisTransaClienteBusqueda.setText("U");
		this.jButtondescripcionAnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAnalisisTransaClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAnalisisTransaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAnalisisTransaCliente = new JLabelMe();
		this.jLabelid_empresaAnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAnalisisTransaCliente.setToolTipText("Empresa");
		this.jLabelid_empresaAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_empresaAnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_empresaAnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_empresaAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAnalisisTransaCliente.setEnabled(false);

		this.jButtonid_empresaAnalisisTransaCliente= new JButtonMe();
		this.jButtonid_empresaAnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnalisisTransaCliente.setText("Buscar");
		this.jButtonid_empresaAnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnalisisTransaCliente"));

		this.jButtonid_empresaAnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaAnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_empresaAnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaAnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_empresaAnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_empresaAnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnalisisTransaClienteUpdate"));



					
		this.jLabelid_moduloAnalisisTransaCliente = new JLabelMe();
		this.jLabelid_moduloAnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloAnalisisTransaCliente.setToolTipText("Modulo");
		this.jLabelid_moduloAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloAnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloAnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_moduloAnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_moduloAnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_moduloAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloAnalisisTransaCliente.setEnabled(false);

		this.jButtonid_moduloAnalisisTransaCliente= new JButtonMe();
		this.jButtonid_moduloAnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAnalisisTransaCliente.setText("Buscar");
		this.jButtonid_moduloAnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloAnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAnalisisTransaCliente"));

		this.jButtonid_moduloAnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_moduloAnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_moduloAnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloAnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloAnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_moduloAnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_moduloAnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_moduloAnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloAnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccionAnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccionAnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionAnalisisTransaCliente.setToolTipText("Transaccion");
		this.jLabelid_transaccionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionAnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionAnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccionAnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccionAnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionAnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccionAnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccionAnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionAnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAnalisisTransaCliente"));

		this.jButtonid_transaccionAnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionAnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccionAnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccionAnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccionAnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionAnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionAnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion1AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion1AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION1+" :");
		this.jLabelid_transaccion1AnalisisTransaCliente.setToolTipText("Transaccion 1");
		this.jLabelid_transaccion1AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion1AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion1AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion1AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion1AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion1AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION1);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion1AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion1AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion1AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion1AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion1AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion1AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion1AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion1AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion1AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion1AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion1AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion1AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion1AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion1AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion1AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion1AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion1AnalisisTransaCliente"));

		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion1AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion1AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion1AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion1AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion1AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion1AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion1AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion1AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion1AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion1AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion1AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion1AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion1AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion1AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion2AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion2AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION2+" :");
		this.jLabelid_transaccion2AnalisisTransaCliente.setToolTipText("Transaccion 2");
		this.jLabelid_transaccion2AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion2AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion2AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion2AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion2AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion2AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION2);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion2AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion2AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion2AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion2AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion2AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion2AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion2AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion2AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion2AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion2AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion2AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion2AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion2AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion2AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion2AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion2AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion2AnalisisTransaCliente"));

		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion2AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion2AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion2AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion2AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion2AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion2AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion2AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion2AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion2AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion2AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion2AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion2AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion2AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion2AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion3AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion3AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION3+" :");
		this.jLabelid_transaccion3AnalisisTransaCliente.setToolTipText("Transaccion 3");
		this.jLabelid_transaccion3AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion3AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion3AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion3AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion3AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion3AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION3);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion3AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion3AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion3AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion3AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion3AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion3AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion3AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion3AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion3AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion3AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion3AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion3AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion3AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion3AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion3AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion3AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion3AnalisisTransaCliente"));

		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion3AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion3AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion3AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion3AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion3AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion3AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion3AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion3AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion3AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion3AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion3AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion3AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion3AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion3AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion4AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion4AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION4+" :");
		this.jLabelid_transaccion4AnalisisTransaCliente.setToolTipText("Transaccion 4");
		this.jLabelid_transaccion4AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion4AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion4AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion4AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion4AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion4AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION4);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion4AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion4AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion4AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion4AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion4AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion4AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion4AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion4AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion4AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion4AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion4AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion4AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion4AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion4AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion4AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion4AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion4AnalisisTransaCliente"));

		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion4AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion4AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion4AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion4AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion4AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion4AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion4AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion4AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion4AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion4AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion4AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion4AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion4AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion4AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion5AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion5AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION5+" :");
		this.jLabelid_transaccion5AnalisisTransaCliente.setToolTipText("Transaccion 5");
		this.jLabelid_transaccion5AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion5AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion5AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion5AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion5AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion5AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION5);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion5AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion5AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion5AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion5AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion5AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion5AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion5AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion5AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion5AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion5AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion5AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion5AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion5AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion5AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion5AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion5AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion5AnalisisTransaCliente"));

		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion5AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion5AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion5AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion5AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion5AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion5AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion5AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion5AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion5AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion5AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion5AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion5AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion5AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion5AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion6AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion6AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION6+" :");
		this.jLabelid_transaccion6AnalisisTransaCliente.setToolTipText("Transaccion 6");
		this.jLabelid_transaccion6AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion6AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion6AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion6AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion6AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion6AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION6);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion6AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion6AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion6AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion6AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion6AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion6AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion6AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion6AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion6AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion6AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion6AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion6AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion6AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion6AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion6AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion6AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion6AnalisisTransaCliente"));

		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion6AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion6AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion6AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion6AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion6AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion6AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion6AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion6AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion6AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion6AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion6AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion6AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion6AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion6AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion6AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion6AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion7AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion7AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION7+" :");
		this.jLabelid_transaccion7AnalisisTransaCliente.setToolTipText("Transaccion 7");
		this.jLabelid_transaccion7AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion7AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion7AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion7AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion7AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion7AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION7);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion7AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion7AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion7AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion7AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion7AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion7AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion7AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion7AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion7AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion7AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion7AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion7AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion7AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion7AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion7AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion7AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion7AnalisisTransaCliente"));

		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion7AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion7AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion7AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion7AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion7AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion7AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion7AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion7AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion7AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion7AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion7AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion7AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion7AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion7AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion7AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion7AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion8AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion8AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION8+" :");
		this.jLabelid_transaccion8AnalisisTransaCliente.setToolTipText("Transaccion 8");
		this.jLabelid_transaccion8AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion8AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion8AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion8AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion8AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion8AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION8);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion8AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion8AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion8AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion8AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion8AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion8AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion8AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion8AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion8AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion8AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion8AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion8AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion8AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion8AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion8AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion8AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion8AnalisisTransaCliente"));

		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion8AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion8AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion8AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion8AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion8AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion8AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion8AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion8AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion8AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion8AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion8AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion8AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion8AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion8AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion8AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion8AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion9AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion9AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION9+" :");
		this.jLabelid_transaccion9AnalisisTransaCliente.setToolTipText("Transaccion 9");
		this.jLabelid_transaccion9AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion9AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion9AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion9AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion9AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion9AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION9);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion9AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion9AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion9AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion9AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion9AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion9AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion9AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion9AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion9AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion9AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion9AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion9AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion9AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion9AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion9AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion9AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion9AnalisisTransaCliente"));

		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion9AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion9AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion9AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion9AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion9AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion9AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion9AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion9AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion9AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion9AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion9AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion9AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion9AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion9AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion9AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion9AnalisisTransaClienteUpdate"));



					
		this.jLabelid_transaccion10AnalisisTransaCliente = new JLabelMe();
		this.jLabelid_transaccion10AnalisisTransaCliente.setText(""+AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION10+" :");
		this.jLabelid_transaccion10AnalisisTransaCliente.setToolTipText("Transaccion 10");
		this.jLabelid_transaccion10AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion10AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion10AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion10AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion10AnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion10AnalisisTransaCliente.setToolTipText(AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION10);
		this.gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		this.jPanelid_transaccion10AnalisisTransaCliente.setLayout(this.gridaBagLayoutAnalisisTransaCliente);


		jComboBoxid_transaccion10AnalisisTransaCliente= new JComboBoxMe();
		jComboBoxid_transaccion10AnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion10AnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion10AnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion10AnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion10AnalisisTransaCliente= new JButtonMe();
		this.jButtonid_transaccion10AnalisisTransaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion10AnalisisTransaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion10AnalisisTransaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion10AnalisisTransaCliente.setText("Buscar");
		this.jButtonid_transaccion10AnalisisTransaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion10AnalisisTransaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion10AnalisisTransaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion10AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion10AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion10AnalisisTransaCliente"));

		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setText("U");
		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion10AnalisisTransaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion10AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion10AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion10AnalisisTransaClienteBusqueda"));

		if(this.analisistransaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion10AnalisisTransaClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion10AnalisisTransaClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion10AnalisisTransaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion10AnalisisTransaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion10AnalisisTransaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion10AnalisisTransaClienteUpdate.setText("U");
		this.jButtonid_transaccion10AnalisisTransaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion10AnalisisTransaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion10AnalisisTransaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion10AnalisisTransaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion10AnalisisTransaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion10AnalisisTransaClienteUpdate"));



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
		//this.jInternalFrameDetalleAnalisisTransaCliente = new AnalisisTransaClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Analisis Transaccion Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnalisisTransaCliente= new GridBagLayout();
		

		
		String sToolTipAnalisisTransaCliente="";
		sToolTipAnalisisTransaCliente=AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnalisisTransaCliente+="(Cartera.AnalisisTransaCliente)";
		}
		
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnalisisTransaCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAnalisisTransaCliente = new JButtonMe();
		this.jButtonModificarAnalisisTransaCliente = new JButtonMe();
        this.jButtonActualizarAnalisisTransaCliente = new JButtonMe();
        this.jButtonEliminarAnalisisTransaCliente = new JButtonMe();
        this.jButtonCancelarAnalisisTransaCliente = new JButtonMe();
        this.jButtonGuardarCambiosAnalisisTransaCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente = new JButtonMe();
		this.jButtonCerrarAnalisisTransaCliente = new JButtonMe();
		
		this.jScrollPanelDatosAnalisisTransaCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionAnalisisTransaCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralAnalisisTransaCliente = new JScrollPane();
				
		
		
		this.jPanelCamposAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Analisis Transaccion Cliente";
		
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientees" + this.sPath));
		} else {
			this.jScrollPanelDatosAnalisisTransaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAnalisisTransaCliente.setName("jPanelCamposAnalisisTransaCliente"); 

		this.jPanelCamposOcultosAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAnalisisTransaCliente.setName("jPanelCamposOcultosAnalisisTransaCliente"); 

        this.jPanelAccionesAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnalisisTransaCliente.setToolTipText("Acciones");
        this.jPanelAccionesAnalisisTransaCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAnalisisTransaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAnalisisTransaCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAnalisisTransaCliente.setText("Nuevo");
		this.jButtonModificarAnalisisTransaCliente.setText("Editar");
        this.jButtonActualizarAnalisisTransaCliente.setText("Actualizar");
        this.jButtonEliminarAnalisisTransaCliente.setText("Eliminar");
        this.jButtonCancelarAnalisisTransaCliente.setText("Cancelar");
        this.jButtonGuardarCambiosAnalisisTransaCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente.setText("Guardar");
		this.jButtonCerrarAnalisisTransaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnalisisTransaCliente,"nuevo_button","Nuevo",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAnalisisTransaCliente,"modificar_button","Editar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAnalisisTransaCliente,"actualizar_button","Actualizar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAnalisisTransaCliente,"eliminar_button","Eliminar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAnalisisTransaCliente,"cancelar_button","Cancelar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAnalisisTransaCliente,"guardarcambios_button","Guardar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnalisisTransaCliente,"guardarcambiostabla_button","Guardar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnalisisTransaCliente,"cerrar_button","Salir",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAnalisisTransaCliente.setToolTipText("Nuevo"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAnalisisTransaCliente.setToolTipText("Editar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAnalisisTransaCliente.setToolTipText("Actualizar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAnalisisTransaCliente.setToolTipText("Eliminar)"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAnalisisTransaCliente.setToolTipText("Cancelar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAnalisisTransaCliente.setToolTipText("Guardar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente.setToolTipText("Guardar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnalisisTransaCliente.setToolTipText("Salir"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnalisisTransaCliente";
		inputMap = this.jButtonNuevoAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnalisisTransaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnalisisTransaCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAnalisisTransaCliente";
		inputMap = this.jButtonActualizarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAnalisisTransaCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarAnalisisTransaCliente";
		inputMap = this.jButtonEliminarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAnalisisTransaCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarAnalisisTransaCliente";
		inputMap = this.jButtonCancelarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAnalisisTransaCliente"));
		
		//CERRAR		
		sMapKey = "CerrarAnalisisTransaCliente";
		inputMap = this.jButtonCerrarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnalisisTransaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnalisisTransaCliente";
		inputMap = this.jButtonGuardarCambiosTablaAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnalisisTransaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAnalisisTransaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAnalisisTransaCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAnalisisTransaCliente.setToolTipText("Nuevo AnalisisTransaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAnalisisTransaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAnalisisTransaCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAnalisisTransaCliente.setToolTipText("Sin Cerrar Ventana AnalisisTransaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAnalisisTransaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAnalisisTransaCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAnalisisTransaCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnalisisTransaCliente.setText("Accion");
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAnalisisTransaCliente = new JLabelMe();
		
		this.jLabelAccionesAnalisisTransaCliente.setText("Acciones");		
		this.jLabelAccionesAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAnalisisTransaCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAnalisisTransaCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAnalisisTransaCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAnalisisTransaCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAnalisisTransaCliente = new GridBagLayout();
		
		this.jPanelCamposAnalisisTransaCliente.setLayout(gridaBagLayoutCamposAnalisisTransaCliente);
		this.jPanelCamposOcultosAnalisisTransaCliente.setLayout(gridaBagLayoutCamposOcultosAnalisisTransaCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAnalisisTransaCliente.add(jLabelIdAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAnalisisTransaCliente.add(jLabelidAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAnalisisTransaCliente.add(jLabelid_empresaAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAnalisisTransaCliente.add(jButtonid_empresaAnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAnalisisTransaCliente.add(jButtonid_empresaAnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAnalisisTransaCliente.add(jComboBoxid_empresaAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloAnalisisTransaCliente.add(jLabelid_moduloAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAnalisisTransaCliente.add(jButtonid_moduloAnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAnalisisTransaCliente.add(jButtonid_moduloAnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloAnalisisTransaCliente.add(jComboBoxid_moduloAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAnalisisTransaCliente.add(jLabelnombreAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAnalisisTransaCliente.add(jButtonnombreAnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAnalisisTransaCliente.add(jscrollPanenombreAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionAnalisisTransaCliente.add(jLabeldescripcionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAnalisisTransaCliente.add(jButtondescripcionAnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionAnalisisTransaCliente.add(jscrollPanedescripcionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionAnalisisTransaCliente.add(jLabelid_transaccionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAnalisisTransaCliente.add(jButtonid_transaccionAnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAnalisisTransaCliente.add(jButtonid_transaccionAnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionAnalisisTransaCliente.add(jComboBoxid_transaccionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion1AnalisisTransaCliente.add(jLabelid_transaccion1AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion1AnalisisTransaCliente.add(jButtonid_transaccion1AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion1AnalisisTransaCliente.add(jButtonid_transaccion1AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion1AnalisisTransaCliente.add(jComboBoxid_transaccion1AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion2AnalisisTransaCliente.add(jLabelid_transaccion2AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion2AnalisisTransaCliente.add(jButtonid_transaccion2AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion2AnalisisTransaCliente.add(jButtonid_transaccion2AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion2AnalisisTransaCliente.add(jComboBoxid_transaccion2AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion3AnalisisTransaCliente.add(jLabelid_transaccion3AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion3AnalisisTransaCliente.add(jButtonid_transaccion3AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion3AnalisisTransaCliente.add(jButtonid_transaccion3AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion3AnalisisTransaCliente.add(jComboBoxid_transaccion3AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion4AnalisisTransaCliente.add(jLabelid_transaccion4AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion4AnalisisTransaCliente.add(jButtonid_transaccion4AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion4AnalisisTransaCliente.add(jButtonid_transaccion4AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion4AnalisisTransaCliente.add(jComboBoxid_transaccion4AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion5AnalisisTransaCliente.add(jLabelid_transaccion5AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion5AnalisisTransaCliente.add(jButtonid_transaccion5AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion5AnalisisTransaCliente.add(jButtonid_transaccion5AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion5AnalisisTransaCliente.add(jComboBoxid_transaccion5AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion6AnalisisTransaCliente.add(jLabelid_transaccion6AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion6AnalisisTransaCliente.add(jButtonid_transaccion6AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion6AnalisisTransaCliente.add(jButtonid_transaccion6AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion6AnalisisTransaCliente.add(jComboBoxid_transaccion6AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion7AnalisisTransaCliente.add(jLabelid_transaccion7AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion7AnalisisTransaCliente.add(jButtonid_transaccion7AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion7AnalisisTransaCliente.add(jButtonid_transaccion7AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion7AnalisisTransaCliente.add(jComboBoxid_transaccion7AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion8AnalisisTransaCliente.add(jLabelid_transaccion8AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion8AnalisisTransaCliente.add(jButtonid_transaccion8AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion8AnalisisTransaCliente.add(jButtonid_transaccion8AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion8AnalisisTransaCliente.add(jComboBoxid_transaccion8AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion9AnalisisTransaCliente.add(jLabelid_transaccion9AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion9AnalisisTransaCliente.add(jButtonid_transaccion9AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion9AnalisisTransaCliente.add(jButtonid_transaccion9AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion9AnalisisTransaCliente.add(jComboBoxid_transaccion9AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion10AnalisisTransaCliente.add(jLabelid_transaccion10AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 2;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion10AnalisisTransaCliente.add(jButtonid_transaccion10AnalisisTransaClienteBusqueda, this.gridBagConstraintsAnalisisTransaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 3;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
		this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion10AnalisisTransaCliente.add(jButtonid_transaccion10AnalisisTransaClienteUpdate, this.gridBagConstraintsAnalisisTransaCliente);
	}

	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = 1;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion10AnalisisTransaCliente.add(jComboBoxid_transaccion10AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelidAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelnombreAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPaneldescripcionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion1AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion2AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion3AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion4AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion5AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion6AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion7AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion8AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion9AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnalisisTransaCliente.add(this.jPanelid_transaccion10AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposAnalisisTransaCliente % 1==0) {
		iXPanelCamposAnalisisTransaCliente=0;
		iYPanelCamposAnalisisTransaCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposOcultosAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposOcultosAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAnalisisTransaCliente.add(this.jPanelid_empresaAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposOcultosAnalisisTransaCliente % 1==0) {
		iXPanelCamposOcultosAnalisisTransaCliente=0;
		iYPanelCamposOcultosAnalisisTransaCliente++;
	}
	this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnalisisTransaCliente.gridy = iYPanelCamposOcultosAnalisisTransaCliente;
	this.gridBagConstraintsAnalisisTransaCliente.gridx = iXPanelCamposOcultosAnalisisTransaCliente++;
	this.gridBagConstraintsAnalisisTransaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnalisisTransaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAnalisisTransaCliente.add(this.jPanelid_moduloAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);



	if(iXPanelCamposOcultosAnalisisTransaCliente % 1==0) {
		iXPanelCamposOcultosAnalisisTransaCliente=0;
		iYPanelCamposOcultosAnalisisTransaCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesAnalisisTransaCliente= new GridBagLayout();
		this.jPanelAccionesAnalisisTransaCliente.setLayout(gridaBagLayoutAccionesAnalisisTransaCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAnalisisTransaCliente= new GridBagLayout();
		this.jPanelAccionesFormularioAnalisisTransaCliente.setLayout(gridaBagLayoutAccionesFormularioAnalisisTransaCliente);
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnalisisTransaCliente.add(this.jComboBoxTiposAccionesFormularioAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnalisisTransaCliente.add(this.jCheckBoxPostAccionNuevoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.analisistransaclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAnalisisTransaCliente.add(this.jCheckBoxPostAccionSinCerrarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.analisistransaclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAnalisisTransaCliente.add(this.jCheckBoxPostAccionSinMensajeAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesAnalisisTransaCliente.add(this.jButtonModificarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);							

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesAnalisisTransaCliente.add(this.jButtonEliminarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
			
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnalisisTransaCliente.add(this.jButtonActualizarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);


		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnalisisTransaCliente.add(this.jButtonGuardarCambiosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);	
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesAnalisisTransaCliente.add(this.jButtonCancelarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnalisisTransaCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();						
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;		
			//this.gridBagConstraintsAnalisisTransaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnalisisTransaCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnalisisTransaCliente.gridx =0;
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnalisisTransaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AnalisisTransaClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAnalisisTransaCliente = new AnalisisTransaClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Analisis Transaccion Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Analisis Transaccion Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Analisis Transaccion Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AnalisisTransaClienteModel analisistransaclienteModel=new AnalisisTransaClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//AnalisisTransaClienteModel.AnalisisTransaClienteFocusTraversalPolicy analisistransaclienteFocusTraversalPolicy = analisistransaclienteModel.new AnalisisTransaClienteFocusTraversalPolicy(this);
			
			//analisistransaclienteFocusTraversalPolicy.setanalisistransaclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(analisistransaclienteModel);
			
			
			this.jContentPaneDetalleAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAnalisisTransaCliente = new GridBagLayout();	
			this.jContentPaneDetalleAnalisisTransaCliente.setLayout(gridaBagLayoutDetalleAnalisisTransaCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnalisisTransaCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
				this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
					
				
				this.jContentPaneDetalleAnalisisTransaCliente.add(jTtoolBarDetalleAnalisisTransaCliente, gridBagConstraintsAnalisisTransaCliente);								
				
}
			
			this.jScrollPanelDatosEdicionAnalisisTransaCliente=   new JScrollPane(jContentPaneDetalleAnalisisTransaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAnalisisTransaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	        
			this.jContentPaneDetalleAnalisisTransaCliente.add(jPanelCamposAnalisisTransaCliente, gridBagConstraintsAnalisisTransaCliente);
			
			
			
			
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
						&& analisistransaclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.analisistransaclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAnalisisTransaCliente= new GridBagConstraints();
						this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
						this.jContentPaneDetalleAnalisisTransaCliente.add(this.jTabbedPaneRelacionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAnalisisTransaCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAnalisisTransaCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
					this.gridBagConstraintsAnalisisTransaCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
					
				
					this.jContentPaneDetalleAnalisisTransaCliente.add(jPanelCamposOcultosAnalisisTransaCliente, gridBagConstraintsAnalisisTransaCliente);
				
					this.jPanelCamposOcultosAnalisisTransaCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	        this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAnalisisTransaCliente.add(this.jPanelAccionesFormularioAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);							
			
			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
	        this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleAnalisisTransaCliente.add(this.jPanelAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAnalisisTransaCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAnalisisTransaCliente=   new JScrollPane(this.jPanelCamposAnalisisTransaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAnalisisTransaCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
			
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
			
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAnalisisTransaCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionAnalisisTransaCliente;
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
