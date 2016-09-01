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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.EmpleadoPagoRubroConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class EmpleadoPagoRubroDetalleFormJInternalFrame extends EmpleadoPagoRubroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoPagoRubro;
	
	protected JMenuBar jmenuBarDetalleEmpleadoPagoRubro;
	
	protected JMenu jmenuDetalleEmpleadoPagoRubro;
	protected JMenu jmenuDetalleArchivoEmpleadoPagoRubro;
	protected JMenu jmenuDetalleAccionesEmpleadoPagoRubro;
	protected JMenu jmenuDetalleDatosEmpleadoPagoRubro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoPagoRubro;	
	protected GridBagConstraints gridBagConstraintsEmpleadoPagoRubro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoPagoRubroBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoPagoRubro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public EmpleadoPagoRubroLogic empleadopagorubroLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoPagoRubro;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoPagoRubro;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoPagoRubro;
	
	protected JPanel jPanelCamposEmpleadoPagoRubro;    
	protected JPanel jPanelCamposOcultosEmpleadoPagoRubro;    	
	protected JPanel jPanelAccionesEmpleadoPagoRubro;
	protected JPanel jPanelAccionesFormularioEmpleadoPagoRubro;
    
	
	
	protected Integer iXPanelCamposEmpleadoPagoRubro=0;
	protected Integer iYPanelCamposEmpleadoPagoRubro=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoPagoRubro=0;
	protected Integer iYPanelCamposOcultosEmpleadoPagoRubro=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoPagoRubro;
	public JButton jButtonModificarEmpleadoPagoRubro;
	public JButton jButtonActualizarEmpleadoPagoRubro;
    public JButton jButtonEliminarEmpleadoPagoRubro;
	public JButton jButtonCancelarEmpleadoPagoRubro;
    public JButton jButtonGuardarCambiosEmpleadoPagoRubro;
	public JButton jButtonGuardarCambiosTablaEmpleadoPagoRubro;
	protected JButton jButtonCerrarEmpleadoPagoRubro;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoPagoRubro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoPagoRubro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoPagoRubro;
	protected JButton jButtonModificarToolBarEmpleadoPagoRubro;
	protected JButton jButtonActualizarToolBarEmpleadoPagoRubro;
    protected JButton jButtonEliminarToolBarEmpleadoPagoRubro;
	protected JButton jButtonCancelarToolBarEmpleadoPagoRubro;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoPagoRubro;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoPagoRubro;
	protected JButton jButtonCerrarToolBarEmpleadoPagoRubro;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoPagoRubro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoPagoRubro;
	protected JMenuItem jMenuItemModificarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemActualizarEmpleadoPagoRubro;
    protected JMenuItem jMenuItemEliminarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemCancelarEmpleadoPagoRubro;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoPagoRubro;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoPagoRubro;
	protected JMenuItem jMenuItemCerrarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoPagoRubro;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoPagoRubro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoPagoRubro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoPagoRubro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoPagoRubro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoPagoRubro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoPagoRubro;
	public JLabel jLabelIdEmpleadoPagoRubro;
	public JLabel jLabelidEmpleadoPagoRubro;
	public JButton jButtonidEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pagoEmpleadoPagoRubro;
	public JLabel jLabelvalor_pagoEmpleadoPagoRubro;
	public JTextField jTextFieldvalor_pagoEmpleadoPagoRubro;
	public JButton jButtonvalor_pagoEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelfechaEmpleadoPagoRubro;
	public JLabel jLabelfechaEmpleadoPagoRubro;
	//public JFormattedTextField jDateChooserfechaEmpleadoPagoRubro;

	public JDateChooser jDateChooserfechaEmpleadoPagoRubro;
	public JButton jButtonfechaEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelfecha_liquidacionEmpleadoPagoRubro;
	public JLabel jLabelfecha_liquidacionEmpleadoPagoRubro;
	//public JFormattedTextField jDateChooserfecha_liquidacionEmpleadoPagoRubro;

	public JDateChooser jDateChooserfecha_liquidacionEmpleadoPagoRubro;
	public JButton jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoPagoRubro;
	public JLabel jLabelid_empresaEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoPagoRubro;
	public JButton jButtonid_empresaEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoPagoRubro;
	public JLabel jLabelid_empleadoEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoPagoRubro;
	public JButton jButtonid_empleadoEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEmpleadoPagoRubro;
	public JLabel jLabelid_estructuraEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEmpleadoPagoRubro;
	public JButton jButtonid_estructuraEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoPagoRubroBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoPagoRubroArbol= new JButtonMe();

	public JPanel jPanelid_rubro_empleaEmpleadoPagoRubro;
	public JLabel jLabelid_rubro_empleaEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaEmpleadoPagoRubro;
	public JButton jButtonid_rubro_empleaEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_rubro_empleaEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelid_anioEmpleadoPagoRubro;
	public JLabel jLabelid_anioEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioEmpleadoPagoRubro;
	public JButton jButtonid_anioEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_anioEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_anioEmpleadoPagoRubroBusqueda= new JButtonMe();

	public JPanel jPanelid_mesEmpleadoPagoRubro;
	public JLabel jLabelid_mesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesEmpleadoPagoRubro;
	public JButton jButtonid_mesEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_mesEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_mesEmpleadoPagoRubroBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoPagoRubro;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoPagoRubroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoPagoRubro=new JPanel();
				this.jPanelAccionesFormularioEmpleadoPagoRubro=new JPanel();
				this.jmenuBarDetalleEmpleadoPagoRubro=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoPagoRubro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoPagoRubroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoPagoRubro() {
		return this.jButtonActualizarToolBarEmpleadoPagoRubro;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoPagoRubro() {
		return this.jButtonEliminarToolBarEmpleadoPagoRubro;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoPagoRubro() {
		return this.jButtonCancelarToolBarEmpleadoPagoRubro;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoPagoRubro() {
		return this.jButtonProcesarInformacionEmpleadoPagoRubro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoPagoRubro)	{
		this.jButtonProcesarInformacionEmpleadoPagoRubro = jButtonProcesarInformacionEmpleadoPagoRubro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoPagoRubro() {
		return this.jComboBoxTiposAccionesEmpleadoPagoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposRelacionesEmpleadoPagoRubro) {
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro = jComboBoxTiposRelacionesEmpleadoPagoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposAccionesEmpleadoPagoRubro) {
		this.jComboBoxTiposAccionesEmpleadoPagoRubro = jComboBoxTiposAccionesEmpleadoPagoRubro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoPagoRubro() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoPagoRubro(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoPagoRubro) {
		this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro = jComboBoxTiposAccionesFormularioEmpleadoPagoRubro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		
		this.empleadopagorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadopagorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadopagorubroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoPagoRubroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Pago Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoPagoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoPagoRubro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoPagoRubro=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoPagoRubro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoPagoRubro,this.jTtoolBarDetalleEmpleadoPagoRubro,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoPagoRubro,this.jTtoolBarDetalleEmpleadoPagoRubro,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoPagoRubro,this.jTtoolBarDetalleEmpleadoPagoRubro,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoPagoRubro,this.jTtoolBarDetalleEmpleadoPagoRubro,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoPagoRubro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoPagoRubro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoPagoRubro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoPagoRubro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoPagoRubro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoPagoRubro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoPagoRubro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoPagoRubro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoPagoRubro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoPagoRubro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoPagoRubro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoPagoRubro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoPagoRubro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoPagoRubro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoPagoRubro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoPagoRubro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoPagoRubro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoPagoRubro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoPagoRubro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoPagoRubro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoPagoRubro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoPagoRubro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoPagoRubro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoPagoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoPagoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoPagoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoPagoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoPagoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoPagoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoPagoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoPagoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoPagoRubro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoPagoRubro.add(this.jMenuItemDetalleCerrarEmpleadoPagoRubro);
		
		this.jmenuDetalleAccionesEmpleadoPagoRubro.add(this.jMenuItemActualizarEmpleadoPagoRubro);
		this.jmenuDetalleAccionesEmpleadoPagoRubro.add(this.jMenuItemEliminarEmpleadoPagoRubro);
		this.jmenuDetalleAccionesEmpleadoPagoRubro.add(this.jMenuItemCancelarEmpleadoPagoRubro);		
		
		//this.jmenuDetalleDatosEmpleadoPagoRubro.add(this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro);				
		this.jmenuDetalleDatosEmpleadoPagoRubro.add(this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro);				
				
		//this.jmenuDetalleAccionesEmpleadoPagoRubro.add(this.jMenuItemGuardarCambiosEmpleadoPagoRubro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoPagoRubro.add(this.jmenuDetalleArchivoEmpleadoPagoRubro);		
		this.jmenuBarDetalleEmpleadoPagoRubro.add(this.jmenuDetalleAccionesEmpleadoPagoRubro);		
		this.jmenuBarDetalleEmpleadoPagoRubro.add(this.jmenuDetalleDatosEmpleadoPagoRubro);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoPagoRubro);				
	}
	
	
	public void inicializarElementosCamposEmpleadoPagoRubro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoPagoRubro = new JLabelMe();
		jLabelIdEmpleadoPagoRubro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoPagoRubro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoPagoRubro= new GridBagLayout();

		this.jPanelidEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);

		jLabelidEmpleadoPagoRubro = new JLabel();
		jLabelidEmpleadoPagoRubro.setText("Id");

		jLabelidEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_pagoEmpleadoPagoRubro = new JLabelMe();
		this.jLabelvalor_pagoEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO+" : *");
		this.jLabelvalor_pagoEmpleadoPagoRubro.setToolTipText("Valor Pago");
		this.jLabelvalor_pagoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pagoEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pagoEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pagoEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelvalor_pagoEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jTextFieldvalor_pagoEmpleadoPagoRubro= new JTextFieldMe();
		jTextFieldvalor_pagoEmpleadoPagoRubro.setEnabled(false);
		jTextFieldvalor_pagoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pagoEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pagoEmpleadoPagoRubro.setText("0.0");

		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pagoEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pagoEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pagoEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.setVisible(false);		}


					
		this.jLabelfechaEmpleadoPagoRubro = new JLabelMe();
		this.jLabelfechaEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaEmpleadoPagoRubro.setToolTipText("Fecha");
		this.jLabelfechaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelfechaEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		//jFormattedTextFieldfechaEmpleadoPagoRubro= new JFormattedTextFieldMe();

		jDateChooserfechaEmpleadoPagoRubro= new JDateChooser();
		jDateChooserfechaEmpleadoPagoRubro.setEnabled(false);
		jDateChooserfechaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaEmpleadoPagoRubro.setDate(new Date());
		jDateChooserfechaEmpleadoPagoRubro.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaEmpleadoPagoRubro.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonfechaEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonfechaEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaEmpleadoPagoRubroBusqueda.setVisible(false);		}


					
		this.jLabelfecha_liquidacionEmpleadoPagoRubro = new JLabelMe();
		this.jLabelfecha_liquidacionEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION+" : *");
		this.jLabelfecha_liquidacionEmpleadoPagoRubro.setToolTipText("Fecha Liquacion");
		this.jLabelfecha_liquidacionEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_liquidacionEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_liquidacionEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_liquidacionEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelfecha_liquidacionEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		//jFormattedTextFieldfecha_liquidacionEmpleadoPagoRubro= new JFormattedTextFieldMe();

		jDateChooserfecha_liquidacionEmpleadoPagoRubro= new JDateChooser();
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.setEnabled(false);
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_liquidacionEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.setDate(new Date());
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_liquidacionEmpleadoPagoRubro.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_liquidacionEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_liquidacionEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoPagoRubro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoPagoRubro = new JLabelMe();
		this.jLabelid_empresaEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoPagoRubro.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelid_empresaEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jComboBoxid_empresaEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoPagoRubro.setEnabled(false);

		this.jButtonid_empresaEmpleadoPagoRubro= new JButtonMe();
		this.jButtonid_empresaEmpleadoPagoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoPagoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoPagoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoPagoRubro.setText("Buscar");
		this.jButtonid_empresaEmpleadoPagoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoPagoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoPagoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoPagoRubro"));

		this.jButtonid_empresaEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoPagoRubroBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoPagoRubroUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoPagoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoPagoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoPagoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoPagoRubroUpdate.setText("U");
		this.jButtonid_empresaEmpleadoPagoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoPagoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoPagoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoPagoRubroUpdate"));



					
		this.jLabelid_empleadoEmpleadoPagoRubro = new JLabelMe();
		this.jLabelid_empleadoEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoPagoRubro.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jComboBoxid_empleadoEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoPagoRubro= new JButtonMe();
		this.jButtonid_empleadoEmpleadoPagoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoPagoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoPagoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoPagoRubro.setText("Buscar");
		this.jButtonid_empleadoEmpleadoPagoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoPagoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoPagoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoPagoRubro"));

		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoPagoRubroBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoPagoRubroUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoPagoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoPagoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoPagoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoPagoRubroUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoPagoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoPagoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoPagoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoPagoRubroUpdate"));



					
		this.jLabelid_estructuraEmpleadoPagoRubro = new JLabelMe();
		this.jLabelid_estructuraEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEmpleadoPagoRubro.setToolTipText("Estructura");
		this.jLabelid_estructuraEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelid_estructuraEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jComboBoxid_estructuraEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_estructuraEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEmpleadoPagoRubro= new JButtonMe();
		this.jButtonid_estructuraEmpleadoPagoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoPagoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoPagoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoPagoRubro.setText("Buscar");
		this.jButtonid_estructuraEmpleadoPagoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEmpleadoPagoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoPagoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoPagoRubro"));

		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEmpleadoPagoRubroBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEmpleadoPagoRubroUpdate= new JButtonMe();
		this.jButtonid_estructuraEmpleadoPagoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoPagoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoPagoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoPagoRubroUpdate.setText("U");
		this.jButtonid_estructuraEmpleadoPagoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEmpleadoPagoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoPagoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoPagoRubroUpdate"));


		jButtonid_estructuraEmpleadoPagoRubroArbol= new JButtonMe();
		jButtonid_estructuraEmpleadoPagoRubroArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoPagoRubroArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoPagoRubroArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoPagoRubroArbol.setText("Arbol");
		jButtonid_estructuraEmpleadoPagoRubroArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEmpleadoPagoRubroArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoPagoRubroArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoPagoRubroArbol"));



					
		this.jLabelid_rubro_empleaEmpleadoPagoRubro = new JLabelMe();
		this.jLabelid_rubro_empleaEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaEmpleadoPagoRubro.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelid_rubro_empleaEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jComboBoxid_rubro_empleaEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaEmpleadoPagoRubro= new JButtonMe();
		this.jButtonid_rubro_empleaEmpleadoPagoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaEmpleadoPagoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaEmpleadoPagoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaEmpleadoPagoRubro.setText("Buscar");
		this.jButtonid_rubro_empleaEmpleadoPagoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaEmpleadoPagoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaEmpleadoPagoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaEmpleadoPagoRubro"));

		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.setText("U");
		this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaEmpleadoPagoRubroUpdate"));



					
		this.jLabelid_anioEmpleadoPagoRubro = new JLabelMe();
		this.jLabelid_anioEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioEmpleadoPagoRubro.setToolTipText("Anio");
		this.jLabelid_anioEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelid_anioEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jComboBoxid_anioEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_anioEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioEmpleadoPagoRubro= new JButtonMe();
		this.jButtonid_anioEmpleadoPagoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEmpleadoPagoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEmpleadoPagoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEmpleadoPagoRubro.setText("Buscar");
		this.jButtonid_anioEmpleadoPagoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioEmpleadoPagoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEmpleadoPagoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEmpleadoPagoRubro"));

		this.jButtonid_anioEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonid_anioEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonid_anioEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioEmpleadoPagoRubroBusqueda.setVisible(false);		}

		this.jButtonid_anioEmpleadoPagoRubroUpdate= new JButtonMe();
		this.jButtonid_anioEmpleadoPagoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoPagoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoPagoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEmpleadoPagoRubroUpdate.setText("U");
		this.jButtonid_anioEmpleadoPagoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioEmpleadoPagoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEmpleadoPagoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEmpleadoPagoRubroUpdate"));



					
		this.jLabelid_mesEmpleadoPagoRubro = new JLabelMe();
		this.jLabelid_mesEmpleadoPagoRubro.setText(""+EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesEmpleadoPagoRubro.setToolTipText("Mes");
		this.jLabelid_mesEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesEmpleadoPagoRubro.setToolTipText(EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		this.jPanelid_mesEmpleadoPagoRubro.setLayout(this.gridaBagLayoutEmpleadoPagoRubro);


		jComboBoxid_mesEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_mesEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesEmpleadoPagoRubro= new JButtonMe();
		this.jButtonid_mesEmpleadoPagoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEmpleadoPagoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEmpleadoPagoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEmpleadoPagoRubro.setText("Buscar");
		this.jButtonid_mesEmpleadoPagoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesEmpleadoPagoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEmpleadoPagoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEmpleadoPagoRubro"));

		this.jButtonid_mesEmpleadoPagoRubroBusqueda= new JButtonMe();
		this.jButtonid_mesEmpleadoPagoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoPagoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoPagoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesEmpleadoPagoRubroBusqueda.setText("U");
		this.jButtonid_mesEmpleadoPagoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesEmpleadoPagoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEmpleadoPagoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEmpleadoPagoRubroBusqueda"));

		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesEmpleadoPagoRubroBusqueda.setVisible(false);		}

		this.jButtonid_mesEmpleadoPagoRubroUpdate= new JButtonMe();
		this.jButtonid_mesEmpleadoPagoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoPagoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoPagoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesEmpleadoPagoRubroUpdate.setText("U");
		this.jButtonid_mesEmpleadoPagoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesEmpleadoPagoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEmpleadoPagoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEmpleadoPagoRubroUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoPagoRubro = new EmpleadoPagoRubroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Pago Rubro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoPagoRubro= new GridBagLayout();
		

		
		String sToolTipEmpleadoPagoRubro="";
		sToolTipEmpleadoPagoRubro=EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoPagoRubro+="(Nomina.EmpleadoPagoRubro)";
		}
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoPagoRubro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoPagoRubro = new JButtonMe();
		this.jButtonModificarEmpleadoPagoRubro = new JButtonMe();
        this.jButtonActualizarEmpleadoPagoRubro = new JButtonMe();
        this.jButtonEliminarEmpleadoPagoRubro = new JButtonMe();
        this.jButtonCancelarEmpleadoPagoRubro = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoPagoRubro = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro = new JButtonMe();
		this.jButtonCerrarEmpleadoPagoRubro = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoPagoRubro = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoPagoRubro = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoPagoRubro = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Pago Rubro";
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Pago Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoPagoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoPagoRubro.setName("jPanelCamposEmpleadoPagoRubro"); 

		this.jPanelCamposOcultosEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoPagoRubro.setName("jPanelCamposOcultosEmpleadoPagoRubro"); 

        this.jPanelAccionesEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoPagoRubro.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoPagoRubro.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoPagoRubro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoPagoRubro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoPagoRubro.setText("Nuevo");
		this.jButtonModificarEmpleadoPagoRubro.setText("Editar");
        this.jButtonActualizarEmpleadoPagoRubro.setText("Actualizar");
        this.jButtonEliminarEmpleadoPagoRubro.setText("Eliminar");
        this.jButtonCancelarEmpleadoPagoRubro.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoPagoRubro.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.setText("Guardar");
		this.jButtonCerrarEmpleadoPagoRubro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoPagoRubro,"nuevo_button","Nuevo",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoPagoRubro,"modificar_button","Editar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoPagoRubro,"actualizar_button","Actualizar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoPagoRubro,"eliminar_button","Eliminar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoPagoRubro,"cancelar_button","Cancelar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoPagoRubro,"guardarcambios_button","Guardar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoPagoRubro,"guardarcambiostabla_button","Guardar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoPagoRubro,"cerrar_button","Salir",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoPagoRubro.setToolTipText("Nuevo"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoPagoRubro.setToolTipText("Editar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoPagoRubro.setToolTipText("Actualizar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoPagoRubro.setToolTipText("Eliminar)"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoPagoRubro.setToolTipText("Cancelar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoPagoRubro.setToolTipText("Guardar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.setToolTipText("Guardar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoPagoRubro.setToolTipText("Salir"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoPagoRubro";
		inputMap = this.jButtonNuevoEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoPagoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoPagoRubro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoPagoRubro";
		inputMap = this.jButtonActualizarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoPagoRubro"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoPagoRubro";
		inputMap = this.jButtonEliminarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoPagoRubro"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoPagoRubro";
		inputMap = this.jButtonCancelarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoPagoRubro"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoPagoRubro";
		inputMap = this.jButtonCerrarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoPagoRubro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoPagoRubro";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoPagoRubro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoPagoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoPagoRubro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoPagoRubro.setToolTipText("Nuevo EmpleadoPagoRubro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro.setToolTipText("Sin Cerrar Ventana EmpleadoPagoRubro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoPagoRubro.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoPagoRubro = new JLabelMe();
		
		this.jLabelAccionesEmpleadoPagoRubro.setText("Acciones");		
		this.jLabelAccionesEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoPagoRubro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoPagoRubro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoPagoRubro=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoPagoRubro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoPagoRubro = new GridBagLayout();
		
		this.jPanelCamposEmpleadoPagoRubro.setLayout(gridaBagLayoutCamposEmpleadoPagoRubro);
		this.jPanelCamposOcultosEmpleadoPagoRubro.setLayout(gridaBagLayoutCamposOcultosEmpleadoPagoRubro);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoPagoRubro.add(jLabelIdEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoPagoRubro.add(jLabelidEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoPagoRubro.add(jLabelid_empresaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoPagoRubro.add(jButtonid_empresaEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoPagoRubro.add(jButtonid_empresaEmpleadoPagoRubroUpdate, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoPagoRubro.add(jComboBoxid_empresaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoPagoRubro.add(jLabelid_empleadoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoPagoRubro.add(jButtonid_empleadoEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoPagoRubro.add(jButtonid_empleadoEmpleadoPagoRubroUpdate, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoPagoRubro.add(jComboBoxid_empleadoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEmpleadoPagoRubro.add(jLabelid_estructuraEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoPagoRubro.add(jButtonid_estructuraEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoPagoRubro.add(jButtonid_estructuraEmpleadoPagoRubroUpdate, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEmpleadoPagoRubro.add(jComboBoxid_estructuraEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaEmpleadoPagoRubro.add(jLabelid_rubro_empleaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaEmpleadoPagoRubro.add(jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaEmpleadoPagoRubro.add(jButtonid_rubro_empleaEmpleadoPagoRubroUpdate, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaEmpleadoPagoRubro.add(jComboBoxid_rubro_empleaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioEmpleadoPagoRubro.add(jLabelid_anioEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEmpleadoPagoRubro.add(jButtonid_anioEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEmpleadoPagoRubro.add(jButtonid_anioEmpleadoPagoRubroUpdate, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioEmpleadoPagoRubro.add(jComboBoxid_anioEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesEmpleadoPagoRubro.add(jLabelid_mesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesEmpleadoPagoRubro.add(jButtonid_mesEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesEmpleadoPagoRubro.add(jButtonid_mesEmpleadoPagoRubroUpdate, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesEmpleadoPagoRubro.add(jComboBoxid_mesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pagoEmpleadoPagoRubro.add(jLabelvalor_pagoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pagoEmpleadoPagoRubro.add(jButtonvalor_pagoEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pagoEmpleadoPagoRubro.add(jTextFieldvalor_pagoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaEmpleadoPagoRubro.add(jLabelfechaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaEmpleadoPagoRubro.add(jButtonfechaEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaEmpleadoPagoRubro.add(jDateChooserfechaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_liquidacionEmpleadoPagoRubro.add(jLabelfecha_liquidacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_liquidacionEmpleadoPagoRubro.add(jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda, this.gridBagConstraintsEmpleadoPagoRubro);
	}

	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_liquidacionEmpleadoPagoRubro.add(jDateChooserfecha_liquidacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelidEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelid_empleadoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelid_estructuraEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelid_rubro_empleaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelid_anioEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelid_mesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelvalor_pagoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelfechaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoPagoRubro.add(this.jPanelfecha_liquidacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposEmpleadoPagoRubro % 1==0) {
		iXPanelCamposEmpleadoPagoRubro=0;
		iYPanelCamposEmpleadoPagoRubro++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoPagoRubro.gridy = iYPanelCamposOcultosEmpleadoPagoRubro;
	this.gridBagConstraintsEmpleadoPagoRubro.gridx = iXPanelCamposOcultosEmpleadoPagoRubro++;
	this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoPagoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoPagoRubro.add(this.jPanelid_empresaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);



	if(iXPanelCamposOcultosEmpleadoPagoRubro % 1==0) {
		iXPanelCamposOcultosEmpleadoPagoRubro=0;
		iYPanelCamposOcultosEmpleadoPagoRubro++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoPagoRubro= new GridBagLayout();
		this.jPanelAccionesEmpleadoPagoRubro.setLayout(gridaBagLayoutAccionesEmpleadoPagoRubro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoPagoRubro= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoPagoRubro.setLayout(gridaBagLayoutAccionesFormularioEmpleadoPagoRubro);
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoPagoRubro.add(this.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoPagoRubro.add(this.jCheckBoxPostAccionNuevoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoPagoRubro.add(this.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoPagoRubro.add(this.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoPagoRubro.add(this.jButtonModificarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);							

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoPagoRubro.add(this.jButtonEliminarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoPagoRubro.add(this.jButtonActualizarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoPagoRubro.add(this.jButtonGuardarCambiosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);	
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoPagoRubro.add(this.jButtonCancelarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoPagoRubro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;		
			//this.gridBagConstraintsEmpleadoPagoRubro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =0;
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoPagoRubro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoPagoRubro = new EmpleadoPagoRubroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Pago Rubro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Pago Rubro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Pago Rubro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoPagoRubroModel empleadopagorubroModel=new EmpleadoPagoRubroModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoPagoRubroModel.EmpleadoPagoRubroFocusTraversalPolicy empleadopagorubroFocusTraversalPolicy = empleadopagorubroModel.new EmpleadoPagoRubroFocusTraversalPolicy(this);
			
			//empleadopagorubroFocusTraversalPolicy.setempleadopagorubroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadopagorubroModel);
			
			
			this.jContentPaneDetalleEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoPagoRubro = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoPagoRubro.setLayout(gridaBagLayoutDetalleEmpleadoPagoRubro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoPagoRubro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoPagoRubro.add(jTtoolBarDetalleEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro=   new JScrollPane(jContentPaneDetalleEmpleadoPagoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoPagoRubro.add(jPanelCamposEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);
			
			
			
			
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
						&& empleadopagorubroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoPagoRubro= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
						this.jContentPaneDetalleEmpleadoPagoRubro.add(this.jTabbedPaneRelacionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoPagoRubro.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoPagoRubro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoPagoRubro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoPagoRubro.add(jPanelCamposOcultosEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);
				
					this.jPanelCamposOcultosEmpleadoPagoRubro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	        this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoPagoRubro.add(this.jPanelAccionesFormularioEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);							
			
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoPagoRubro.add(this.jPanelAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoPagoRubro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro=   new JScrollPane(this.jPanelCamposEmpleadoPagoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoPagoRubro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoPagoRubro;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoPagoRubro;
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
