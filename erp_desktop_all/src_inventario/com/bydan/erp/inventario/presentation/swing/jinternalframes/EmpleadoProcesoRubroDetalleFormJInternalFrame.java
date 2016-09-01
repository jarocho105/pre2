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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.EmpleadoProcesoRubroConstantesFunciones;

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
public class EmpleadoProcesoRubroDetalleFormJInternalFrame extends EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoProcesoRubro;
	
	protected JMenuBar jmenuBarDetalleEmpleadoProcesoRubro;
	
	protected JMenu jmenuDetalleEmpleadoProcesoRubro;
	protected JMenu jmenuDetalleArchivoEmpleadoProcesoRubro;
	protected JMenu jmenuDetalleAccionesEmpleadoProcesoRubro;
	protected JMenu jmenuDetalleDatosEmpleadoProcesoRubro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoProcesoRubro;	
	protected GridBagConstraints gridBagConstraintsEmpleadoProcesoRubro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoProcesoRubro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public EmpleadoProcesoRubroSessionBean empleadoprocesorubroSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public EmpleadoProcesoRubroLogic empleadoprocesorubroLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoProcesoRubro;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoProcesoRubro;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoProcesoRubro;
	
	protected JPanel jPanelCamposEmpleadoProcesoRubro;    
	protected JPanel jPanelCamposOcultosEmpleadoProcesoRubro;    	
	protected JPanel jPanelAccionesEmpleadoProcesoRubro;
	protected JPanel jPanelAccionesFormularioEmpleadoProcesoRubro;
    
	
	
	protected Integer iXPanelCamposEmpleadoProcesoRubro=0;
	protected Integer iYPanelCamposEmpleadoProcesoRubro=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoProcesoRubro=0;
	protected Integer iYPanelCamposOcultosEmpleadoProcesoRubro=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoProcesoRubro;
	public JButton jButtonModificarEmpleadoProcesoRubro;
	public JButton jButtonActualizarEmpleadoProcesoRubro;
    public JButton jButtonEliminarEmpleadoProcesoRubro;
	public JButton jButtonCancelarEmpleadoProcesoRubro;
    public JButton jButtonGuardarCambiosEmpleadoProcesoRubro;
	public JButton jButtonGuardarCambiosTablaEmpleadoProcesoRubro;
	protected JButton jButtonCerrarEmpleadoProcesoRubro;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoProcesoRubro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoProcesoRubro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoProcesoRubro;
	protected JButton jButtonModificarToolBarEmpleadoProcesoRubro;
	protected JButton jButtonActualizarToolBarEmpleadoProcesoRubro;
    protected JButton jButtonEliminarToolBarEmpleadoProcesoRubro;
	protected JButton jButtonCancelarToolBarEmpleadoProcesoRubro;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoProcesoRubro;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoProcesoRubro;
	protected JButton jButtonCerrarToolBarEmpleadoProcesoRubro;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoProcesoRubro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemModificarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemActualizarEmpleadoProcesoRubro;
    protected JMenuItem jMenuItemEliminarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemCancelarEmpleadoProcesoRubro;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemCerrarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoProcesoRubro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoProcesoRubro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoProcesoRubro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoProcesoRubro;
	public JLabel jLabelIdEmpleadoProcesoRubro;
	public JLabel jLabelidEmpleadoProcesoRubro;
	public JButton jButtonidEmpleadoProcesoRubroBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ingresoEmpleadoProcesoRubro;
	public JLabel jLabelfecha_ingresoEmpleadoProcesoRubro;
	//public JFormattedTextField jDateChooserfecha_ingresoEmpleadoProcesoRubro;

	public JDateChooser jDateChooserfecha_ingresoEmpleadoProcesoRubro;
	public JButton jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda= new JButtonMe();

	public JPanel jPanelfecha_salidaEmpleadoProcesoRubro;
	public JLabel jLabelfecha_salidaEmpleadoProcesoRubro;
	//public JFormattedTextField jDateChooserfecha_salidaEmpleadoProcesoRubro;

	public JDateChooser jDateChooserfecha_salidaEmpleadoProcesoRubro;
	public JButton jButtonfecha_salidaEmpleadoProcesoRubroBusqueda= new JButtonMe();

	public JPanel jPanelobservacionesEmpleadoProcesoRubro;
	public JLabel jLabelobservacionesEmpleadoProcesoRubro;
	public JTextArea jTextAreaobservacionesEmpleadoProcesoRubro;
	public JScrollPane jscrollPaneobservacionesEmpleadoProcesoRubro;
	public JButton jButtonobservacionesEmpleadoProcesoRubroBusqueda= new JButtonMe();

	public JPanel jPanelnumeros_reingresoEmpleadoProcesoRubro;
	public JLabel jLabelnumeros_reingresoEmpleadoProcesoRubro;
	public JTextField jTextFieldnumeros_reingresoEmpleadoProcesoRubro;
	public JButton jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoProcesoRubro;
	public JLabel jLabelid_empresaEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoProcesoRubro;
	public JButton jButtonid_empresaEmpleadoProcesoRubro= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoProcesoRubroUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoProcesoRubroBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEmpleadoProcesoRubro;
	public JLabel jLabelid_sucursalEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEmpleadoProcesoRubro;
	public JButton jButtonid_sucursalEmpleadoProcesoRubro= new JButtonMe();
	public JButton jButtonid_sucursalEmpleadoProcesoRubroUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEmpleadoProcesoRubroBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEmpleadoProcesoRubro;
	public JLabel jLabelid_estructuraEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEmpleadoProcesoRubro;
	public JButton jButtonid_estructuraEmpleadoProcesoRubro= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoProcesoRubroUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoProcesoRubroBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoProcesoRubroArbol= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoProcesoRubro;
	public JLabel jLabelid_empleadoEmpleadoProcesoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoProcesoRubro;
	public JButton jButtonid_empleadoEmpleadoProcesoRubro= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoProcesoRubroUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoProcesoRubroBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoProcesoRubro;
	
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
	
	public EmpleadoProcesoRubroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoProcesoRubro=new JPanel();
				this.jPanelAccionesFormularioEmpleadoProcesoRubro=new JPanel();
				this.jmenuBarDetalleEmpleadoProcesoRubro=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoProcesoRubro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoProcesoRubroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoProcesoRubroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoProcesoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoProcesoRubro() {
		return this.jButtonActualizarToolBarEmpleadoProcesoRubro;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoProcesoRubro() {
		return this.jButtonEliminarToolBarEmpleadoProcesoRubro;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoProcesoRubro() {
		return this.jButtonCancelarToolBarEmpleadoProcesoRubro;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoProcesoRubro() {
		return this.jButtonProcesarInformacionEmpleadoProcesoRubro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoProcesoRubro)	{
		this.jButtonProcesarInformacionEmpleadoProcesoRubro = jButtonProcesarInformacionEmpleadoProcesoRubro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoProcesoRubro() {
		return this.jComboBoxTiposAccionesEmpleadoProcesoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposRelacionesEmpleadoProcesoRubro) {
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro = jComboBoxTiposRelacionesEmpleadoProcesoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposAccionesEmpleadoProcesoRubro) {
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro = jComboBoxTiposAccionesEmpleadoProcesoRubro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoProcesoRubro() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoProcesoRubro(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro) {
		this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro = jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		
		this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoProcesoRubroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Proceso Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoProcesoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoProcesoRubro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoProcesoRubro=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoProcesoRubro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoProcesoRubro,this.jTtoolBarDetalleEmpleadoProcesoRubro,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoProcesoRubro,this.jTtoolBarDetalleEmpleadoProcesoRubro,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoProcesoRubro,this.jTtoolBarDetalleEmpleadoProcesoRubro,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro,this.jTtoolBarDetalleEmpleadoProcesoRubro,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoProcesoRubro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoProcesoRubro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoProcesoRubro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoProcesoRubro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoProcesoRubro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoProcesoRubro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoProcesoRubro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoProcesoRubro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoProcesoRubro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoProcesoRubro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoProcesoRubro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoProcesoRubro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoProcesoRubro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoProcesoRubro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoProcesoRubro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoProcesoRubro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoProcesoRubro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoProcesoRubro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoProcesoRubro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoProcesoRubro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoProcesoRubro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoProcesoRubro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoProcesoRubro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoProcesoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoProcesoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoProcesoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoProcesoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoProcesoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoProcesoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoProcesoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoProcesoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoProcesoRubro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoProcesoRubro.add(this.jMenuItemDetalleCerrarEmpleadoProcesoRubro);
		
		this.jmenuDetalleAccionesEmpleadoProcesoRubro.add(this.jMenuItemActualizarEmpleadoProcesoRubro);
		this.jmenuDetalleAccionesEmpleadoProcesoRubro.add(this.jMenuItemEliminarEmpleadoProcesoRubro);
		this.jmenuDetalleAccionesEmpleadoProcesoRubro.add(this.jMenuItemCancelarEmpleadoProcesoRubro);		
		
		//this.jmenuDetalleDatosEmpleadoProcesoRubro.add(this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro);				
		this.jmenuDetalleDatosEmpleadoProcesoRubro.add(this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro);				
				
		//this.jmenuDetalleAccionesEmpleadoProcesoRubro.add(this.jMenuItemGuardarCambiosEmpleadoProcesoRubro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoProcesoRubro.add(this.jmenuDetalleArchivoEmpleadoProcesoRubro);		
		this.jmenuBarDetalleEmpleadoProcesoRubro.add(this.jmenuDetalleAccionesEmpleadoProcesoRubro);		
		this.jmenuBarDetalleEmpleadoProcesoRubro.add(this.jmenuDetalleDatosEmpleadoProcesoRubro);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoProcesoRubro);				
	}
	
	
	public void inicializarElementosCamposEmpleadoProcesoRubro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoProcesoRubro = new JLabelMe();
		jLabelIdEmpleadoProcesoRubro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoProcesoRubro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoProcesoRubro= new GridBagLayout();

		this.jPanelidEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);

		jLabelidEmpleadoProcesoRubro = new JLabel();
		jLabelidEmpleadoProcesoRubro.setText("Id");

		jLabelidEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ingresoEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelfecha_ingresoEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO+" : *");
		this.jLabelfecha_ingresoEmpleadoProcesoRubro.setToolTipText("Fecha Ingreso");
		this.jLabelfecha_ingresoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ingresoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ingresoEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ingresoEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelfecha_ingresoEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		//jFormattedTextFieldfecha_ingresoEmpleadoProcesoRubro= new JFormattedTextFieldMe();

		jDateChooserfecha_ingresoEmpleadoProcesoRubro= new JDateChooser();
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.setEnabled(false);
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ingresoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.setDate(new Date());
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ingresoEmpleadoProcesoRubro.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ingresoEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ingresoEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.setVisible(false);		}


					
		this.jLabelfecha_salidaEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelfecha_salidaEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA+" : *");
		this.jLabelfecha_salidaEmpleadoProcesoRubro.setToolTipText("Fecha Sala");
		this.jLabelfecha_salidaEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_salidaEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_salidaEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_salidaEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelfecha_salidaEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		//jFormattedTextFieldfecha_salidaEmpleadoProcesoRubro= new JFormattedTextFieldMe();

		jDateChooserfecha_salidaEmpleadoProcesoRubro= new JDateChooser();
		jDateChooserfecha_salidaEmpleadoProcesoRubro.setEnabled(false);
		jDateChooserfecha_salidaEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_salidaEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_salidaEmpleadoProcesoRubro.setDate(new Date());
		jDateChooserfecha_salidaEmpleadoProcesoRubro.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_salidaEmpleadoProcesoRubro.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_salidaEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_salidaEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_salidaEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.setVisible(false);		}


					
		this.jLabelobservacionesEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelobservacionesEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES+" : *");
		this.jLabelobservacionesEmpleadoProcesoRubro.setToolTipText("Observaciones");
		this.jLabelobservacionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionesEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionesEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionesEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelobservacionesEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		jTextAreaobservacionesEmpleadoProcesoRubro= new JTextAreaMe();
		jTextAreaobservacionesEmpleadoProcesoRubro.setEnabled(false);
		jTextAreaobservacionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionesEmpleadoProcesoRubro.setLineWrap(true);
		jTextAreaobservacionesEmpleadoProcesoRubro.setWrapStyleWord(true);
		jTextAreaobservacionesEmpleadoProcesoRubro.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionesEmpleadoProcesoRubro.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionesEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionesEmpleadoProcesoRubro = new JScrollPane(jTextAreaobservacionesEmpleadoProcesoRubro);
		jscrollPaneobservacionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionesEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionesEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionesEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionesEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionesEmpleadoProcesoRubroBusqueda.setVisible(false);		}


					
		this.jLabelnumeros_reingresoEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelnumeros_reingresoEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO+" : *");
		this.jLabelnumeros_reingresoEmpleadoProcesoRubro.setToolTipText("Numeros Reingreso");
		this.jLabelnumeros_reingresoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumeros_reingresoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumeros_reingresoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeros_reingresoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeros_reingresoEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeros_reingresoEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelnumeros_reingresoEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		jTextFieldnumeros_reingresoEmpleadoProcesoRubro= new JTextFieldMe();
		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setEnabled(false);
		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeros_reingresoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setText("0");

		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeros_reingresoEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeros_reingresoEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoProcesoRubro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelid_empresaEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoProcesoRubro.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelid_empresaEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		jComboBoxid_empresaEmpleadoProcesoRubro= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoProcesoRubro.setEnabled(false);

		this.jButtonid_empresaEmpleadoProcesoRubro= new JButtonMe();
		this.jButtonid_empresaEmpleadoProcesoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoProcesoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoProcesoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoProcesoRubro.setText("Buscar");
		this.jButtonid_empresaEmpleadoProcesoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoProcesoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoProcesoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoProcesoRubro"));

		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoProcesoRubroBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoProcesoRubroUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoProcesoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoProcesoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoProcesoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoProcesoRubroUpdate.setText("U");
		this.jButtonid_empresaEmpleadoProcesoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoProcesoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoProcesoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoProcesoRubroUpdate"));



					
		this.jLabelid_sucursalEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelid_sucursalEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEmpleadoProcesoRubro.setToolTipText("Sucursal");
		this.jLabelid_sucursalEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelid_sucursalEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		jComboBoxid_sucursalEmpleadoProcesoRubro= new JComboBoxMe();
		jComboBoxid_sucursalEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEmpleadoProcesoRubro.setEnabled(false);

		this.jButtonid_sucursalEmpleadoProcesoRubro= new JButtonMe();
		this.jButtonid_sucursalEmpleadoProcesoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleadoProcesoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleadoProcesoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleadoProcesoRubro.setText("Buscar");
		this.jButtonid_sucursalEmpleadoProcesoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEmpleadoProcesoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoProcesoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoProcesoRubro"));

		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEmpleadoProcesoRubroUpdate= new JButtonMe();
		this.jButtonid_sucursalEmpleadoProcesoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoProcesoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoProcesoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEmpleadoProcesoRubroUpdate.setText("U");
		this.jButtonid_sucursalEmpleadoProcesoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEmpleadoProcesoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoProcesoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoProcesoRubroUpdate"));



					
		this.jLabelid_estructuraEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelid_estructuraEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEmpleadoProcesoRubro.setToolTipText("Estructura");
		this.jLabelid_estructuraEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelid_estructuraEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		jComboBoxid_estructuraEmpleadoProcesoRubro= new JComboBoxMe();
		jComboBoxid_estructuraEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEmpleadoProcesoRubro= new JButtonMe();
		this.jButtonid_estructuraEmpleadoProcesoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoProcesoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoProcesoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoProcesoRubro.setText("Buscar");
		this.jButtonid_estructuraEmpleadoProcesoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEmpleadoProcesoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoProcesoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoProcesoRubro"));

		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEmpleadoProcesoRubroUpdate= new JButtonMe();
		this.jButtonid_estructuraEmpleadoProcesoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoProcesoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoProcesoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoProcesoRubroUpdate.setText("U");
		this.jButtonid_estructuraEmpleadoProcesoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEmpleadoProcesoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoProcesoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoProcesoRubroUpdate"));


		jButtonid_estructuraEmpleadoProcesoRubroArbol= new JButtonMe();
		jButtonid_estructuraEmpleadoProcesoRubroArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoProcesoRubroArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoProcesoRubroArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoProcesoRubroArbol.setText("Arbol");
		jButtonid_estructuraEmpleadoProcesoRubroArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEmpleadoProcesoRubroArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoProcesoRubroArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoProcesoRubroArbol"));



					
		this.jLabelid_empleadoEmpleadoProcesoRubro = new JLabelMe();
		this.jLabelid_empleadoEmpleadoProcesoRubro.setText(""+EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoProcesoRubro.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoProcesoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoProcesoRubro.setToolTipText(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoProcesoRubro.setLayout(this.gridaBagLayoutEmpleadoProcesoRubro);


		jComboBoxid_empleadoEmpleadoProcesoRubro= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoProcesoRubro= new JButtonMe();
		this.jButtonid_empleadoEmpleadoProcesoRubro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoProcesoRubro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoProcesoRubro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoProcesoRubro.setText("Buscar");
		this.jButtonid_empleadoEmpleadoProcesoRubro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoProcesoRubro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoProcesoRubro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoProcesoRubro"));

		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoProcesoRubroBusqueda"));

		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoProcesoRubroUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoProcesoRubroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoProcesoRubroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoProcesoRubroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoProcesoRubroUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoProcesoRubroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoProcesoRubroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoProcesoRubroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoProcesoRubroUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoProcesoRubro = new EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Proceso Rubro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoProcesoRubro= new GridBagLayout();
		

		
		String sToolTipEmpleadoProcesoRubro="";
		sToolTipEmpleadoProcesoRubro=EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoProcesoRubro+="(Inventario.EmpleadoProcesoRubro)";
		}
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoProcesoRubro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonModificarEmpleadoProcesoRubro = new JButtonMe();
        this.jButtonActualizarEmpleadoProcesoRubro = new JButtonMe();
        this.jButtonEliminarEmpleadoProcesoRubro = new JButtonMe();
        this.jButtonCancelarEmpleadoProcesoRubro = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro = new JButtonMe();
		this.jButtonCerrarEmpleadoProcesoRubro = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoProcesoRubro = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoProcesoRubro = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoProcesoRubro = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Proceso Rubro";
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Proceso Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoProcesoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoProcesoRubro.setName("jPanelCamposEmpleadoProcesoRubro"); 

		this.jPanelCamposOcultosEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoProcesoRubro.setName("jPanelCamposOcultosEmpleadoProcesoRubro"); 

        this.jPanelAccionesEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoProcesoRubro.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoProcesoRubro.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoProcesoRubro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoProcesoRubro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoProcesoRubro.setText("Nuevo");
		this.jButtonModificarEmpleadoProcesoRubro.setText("Editar");
        this.jButtonActualizarEmpleadoProcesoRubro.setText("Actualizar");
        this.jButtonEliminarEmpleadoProcesoRubro.setText("Eliminar");
        this.jButtonCancelarEmpleadoProcesoRubro.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoProcesoRubro.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.setText("Guardar");
		this.jButtonCerrarEmpleadoProcesoRubro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoProcesoRubro,"nuevo_button","Nuevo",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoProcesoRubro,"modificar_button","Editar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoProcesoRubro,"actualizar_button","Actualizar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoProcesoRubro,"eliminar_button","Eliminar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoProcesoRubro,"cancelar_button","Cancelar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoProcesoRubro,"guardarcambios_button","Guardar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro,"guardarcambiostabla_button","Guardar",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoProcesoRubro,"cerrar_button","Salir",this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoProcesoRubro.setToolTipText("Nuevo"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoProcesoRubro.setToolTipText("Editar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoProcesoRubro.setToolTipText("Actualizar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoProcesoRubro.setToolTipText("Eliminar)"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoProcesoRubro.setToolTipText("Cancelar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoProcesoRubro.setToolTipText("Guardar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.setToolTipText("Guardar"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoProcesoRubro.setToolTipText("Salir"+" "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoProcesoRubro";
		inputMap = this.jButtonNuevoEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoProcesoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoProcesoRubro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoProcesoRubro";
		inputMap = this.jButtonActualizarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoProcesoRubro"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoProcesoRubro";
		inputMap = this.jButtonEliminarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoProcesoRubro"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoProcesoRubro";
		inputMap = this.jButtonCancelarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoProcesoRubro"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoProcesoRubro";
		inputMap = this.jButtonCerrarEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoProcesoRubro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoProcesoRubro";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoProcesoRubro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro.setToolTipText("Nuevo EmpleadoProcesoRubro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro.setToolTipText("Sin Cerrar Ventana EmpleadoProcesoRubro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoProcesoRubro = new JLabelMe();
		
		this.jLabelAccionesEmpleadoProcesoRubro.setText("Acciones");		
		this.jLabelAccionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoProcesoRubro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoProcesoRubro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoProcesoRubro=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoProcesoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoProcesoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoProcesoRubro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoProcesoRubro = new GridBagLayout();
		
		this.jPanelCamposEmpleadoProcesoRubro.setLayout(gridaBagLayoutCamposEmpleadoProcesoRubro);
		this.jPanelCamposOcultosEmpleadoProcesoRubro.setLayout(gridaBagLayoutCamposOcultosEmpleadoProcesoRubro);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoProcesoRubro.add(jLabelIdEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoProcesoRubro.add(jLabelidEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoProcesoRubro.add(jLabelid_empresaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoProcesoRubro.add(jButtonid_empresaEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoProcesoRubro.add(jButtonid_empresaEmpleadoProcesoRubroUpdate, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoProcesoRubro.add(jComboBoxid_empresaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEmpleadoProcesoRubro.add(jLabelid_sucursalEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEmpleadoProcesoRubro.add(jButtonid_sucursalEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEmpleadoProcesoRubro.add(jButtonid_sucursalEmpleadoProcesoRubroUpdate, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEmpleadoProcesoRubro.add(jComboBoxid_sucursalEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEmpleadoProcesoRubro.add(jLabelid_estructuraEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoProcesoRubro.add(jButtonid_estructuraEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoProcesoRubro.add(jButtonid_estructuraEmpleadoProcesoRubroUpdate, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEmpleadoProcesoRubro.add(jComboBoxid_estructuraEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoProcesoRubro.add(jLabelid_empleadoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoProcesoRubro.add(jButtonid_empleadoEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 3;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoProcesoRubro.add(jButtonid_empleadoEmpleadoProcesoRubroUpdate, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoProcesoRubro.add(jComboBoxid_empleadoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ingresoEmpleadoProcesoRubro.add(jLabelfecha_ingresoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ingresoEmpleadoProcesoRubro.add(jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ingresoEmpleadoProcesoRubro.add(jDateChooserfecha_ingresoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_salidaEmpleadoProcesoRubro.add(jLabelfecha_salidaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_salidaEmpleadoProcesoRubro.add(jButtonfecha_salidaEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_salidaEmpleadoProcesoRubro.add(jDateChooserfecha_salidaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionesEmpleadoProcesoRubro.add(jLabelobservacionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionesEmpleadoProcesoRubro.add(jButtonobservacionesEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionesEmpleadoProcesoRubro.add(jscrollPaneobservacionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeros_reingresoEmpleadoProcesoRubro.add(jLabelnumeros_reingresoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 2;
		this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeros_reingresoEmpleadoProcesoRubro.add(jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda, this.gridBagConstraintsEmpleadoProcesoRubro);
	}

	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 1;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeros_reingresoEmpleadoProcesoRubro.add(jTextFieldnumeros_reingresoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelidEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelid_estructuraEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelid_empleadoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelfecha_ingresoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelfecha_salidaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelobservacionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoProcesoRubro.add(this.jPanelnumeros_reingresoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposEmpleadoProcesoRubro=0;
		iYPanelCamposEmpleadoProcesoRubro++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposOcultosEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposOcultosEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoProcesoRubro.add(this.jPanelid_empresaEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposOcultosEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposOcultosEmpleadoProcesoRubro=0;
		iYPanelCamposOcultosEmpleadoProcesoRubro++;
	}
	this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iYPanelCamposOcultosEmpleadoProcesoRubro;
	this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iXPanelCamposOcultosEmpleadoProcesoRubro++;
	this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoProcesoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoProcesoRubro.add(this.jPanelid_sucursalEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);



	if(iXPanelCamposOcultosEmpleadoProcesoRubro % 1==0) {
		iXPanelCamposOcultosEmpleadoProcesoRubro=0;
		iYPanelCamposOcultosEmpleadoProcesoRubro++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoProcesoRubro= new GridBagLayout();
		this.jPanelAccionesEmpleadoProcesoRubro.setLayout(gridaBagLayoutAccionesEmpleadoProcesoRubro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoProcesoRubro= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoProcesoRubro.setLayout(gridaBagLayoutAccionesFormularioEmpleadoProcesoRubro);
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoProcesoRubro.add(this.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoProcesoRubro.add(this.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoProcesoRubro.add(this.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoProcesoRubro.add(this.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoProcesoRubro.add(this.jButtonModificarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);							

		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoProcesoRubro.add(this.jButtonEliminarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
			
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoProcesoRubro.add(this.jButtonActualizarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);


		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoProcesoRubro.add(this.jButtonGuardarCambiosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);	
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = 0;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoProcesoRubro.add(this.jButtonCancelarEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoProcesoRubro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoProcesoRubro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;		
			//this.gridBagConstraintsEmpleadoProcesoRubro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoProcesoRubro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =0;
		this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoProcesoRubro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoProcesoRubro = new EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Proceso Rubro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Proceso Rubro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Proceso Rubro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoProcesoRubroModel empleadoprocesorubroModel=new EmpleadoProcesoRubroModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoProcesoRubroModel.EmpleadoProcesoRubroFocusTraversalPolicy empleadoprocesorubroFocusTraversalPolicy = empleadoprocesorubroModel.new EmpleadoProcesoRubroFocusTraversalPolicy(this);
			
			//empleadoprocesorubroFocusTraversalPolicy.setempleadoprocesorubroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoprocesorubroModel);
			
			
			this.jContentPaneDetalleEmpleadoProcesoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoProcesoRubro = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoProcesoRubro.setLayout(gridaBagLayoutDetalleEmpleadoProcesoRubro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoProcesoRubro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoProcesoRubro.add(jTtoolBarDetalleEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro=   new JScrollPane(jContentPaneDetalleEmpleadoProcesoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoProcesoRubro.add(jPanelCamposEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);
			
			
			
			
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
						&& empleadoprocesorubroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoProcesoRubro= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
						this.jContentPaneDetalleEmpleadoProcesoRubro.add(this.jTabbedPaneRelacionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoProcesoRubro.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoProcesoRubro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoProcesoRubro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoProcesoRubro.add(jPanelCamposOcultosEmpleadoProcesoRubro, gridBagConstraintsEmpleadoProcesoRubro);
				
					this.jPanelCamposOcultosEmpleadoProcesoRubro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	        this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoProcesoRubro.add(this.jPanelAccionesFormularioEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);							
			
			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoProcesoRubro.add(this.jPanelAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoProcesoRubro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro=   new JScrollPane(this.jPanelCamposEmpleadoProcesoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
			this.gridBagConstraintsEmpleadoProcesoRubro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoProcesoRubro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoProcesoRubro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);			
			
			this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
			
			
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		
			
		this.gridBagConstraintsEmpleadoProcesoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoProcesoRubro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoProcesoRubro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoProcesoRubro, this.gridBagConstraintsEmpleadoProcesoRubro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoProcesoRubro;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoProcesoRubro;
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
