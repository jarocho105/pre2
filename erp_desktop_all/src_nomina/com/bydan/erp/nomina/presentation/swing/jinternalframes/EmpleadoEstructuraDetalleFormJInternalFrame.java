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
import com.bydan.erp.nomina.util.EmpleadoEstructuraConstantesFunciones;

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
public class EmpleadoEstructuraDetalleFormJInternalFrame extends EmpleadoEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoEstructura;
	
	protected JMenuBar jmenuBarDetalleEmpleadoEstructura;
	
	protected JMenu jmenuDetalleEmpleadoEstructura;
	protected JMenu jmenuDetalleArchivoEmpleadoEstructura;
	protected JMenu jmenuDetalleAccionesEmpleadoEstructura;
	protected JMenu jmenuDetalleDatosEmpleadoEstructura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoEstructura;	
	protected GridBagConstraints gridBagConstraintsEmpleadoEstructura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoEstructuraBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoEstructura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";
	
	public EmpleadoEstructuraSessionBean empleadoestructuraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public CargoSessionBean cargoSessionBean;	
	
	public EmpleadoEstructuraLogic empleadoestructuraLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoEstructura;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoEstructura;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoEstructura;
	
	protected JPanel jPanelCamposEmpleadoEstructura;    
	protected JPanel jPanelCamposOcultosEmpleadoEstructura;    	
	protected JPanel jPanelAccionesEmpleadoEstructura;
	protected JPanel jPanelAccionesFormularioEmpleadoEstructura;
    
	
	
	protected Integer iXPanelCamposEmpleadoEstructura=0;
	protected Integer iYPanelCamposEmpleadoEstructura=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoEstructura=0;
	protected Integer iYPanelCamposOcultosEmpleadoEstructura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoEstructura;
	public JButton jButtonModificarEmpleadoEstructura;
	public JButton jButtonActualizarEmpleadoEstructura;
    public JButton jButtonEliminarEmpleadoEstructura;
	public JButton jButtonCancelarEmpleadoEstructura;
    public JButton jButtonGuardarCambiosEmpleadoEstructura;
	public JButton jButtonGuardarCambiosTablaEmpleadoEstructura;
	protected JButton jButtonCerrarEmpleadoEstructura;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoEstructura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoEstructura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoEstructura;
	protected JButton jButtonModificarToolBarEmpleadoEstructura;
	protected JButton jButtonActualizarToolBarEmpleadoEstructura;
    protected JButton jButtonEliminarToolBarEmpleadoEstructura;
	protected JButton jButtonCancelarToolBarEmpleadoEstructura;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoEstructura;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoEstructura;
	protected JButton jButtonCerrarToolBarEmpleadoEstructura;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoEstructura;
	protected JMenuItem jMenuItemModificarEmpleadoEstructura;
	protected JMenuItem jMenuItemActualizarEmpleadoEstructura;
    protected JMenuItem jMenuItemEliminarEmpleadoEstructura;
	protected JMenuItem jMenuItemCancelarEmpleadoEstructura;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoEstructura;
	protected JMenuItem jMenuItemCerrarEmpleadoEstructura;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoEstructura;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoEstructura;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoEstructura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoEstructura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoEstructura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoEstructura;
	public JLabel jLabelIdEmpleadoEstructura;
	public JLabel jLabelidEmpleadoEstructura;
	public JButton jButtonidEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ingresoEmpleadoEstructura;
	public JLabel jLabelfecha_ingresoEmpleadoEstructura;
	//public JFormattedTextField jDateChooserfecha_ingresoEmpleadoEstructura;

	public JDateChooser jDateChooserfecha_ingresoEmpleadoEstructura;
	public JButton jButtonfecha_ingresoEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_salidaEmpleadoEstructura;
	public JLabel jLabelfecha_salidaEmpleadoEstructura;
	//public JFormattedTextField jDateChooserfecha_salidaEmpleadoEstructura;

	public JDateChooser jDateChooserfecha_salidaEmpleadoEstructura;
	public JButton jButtonfecha_salidaEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_reingresoEmpleadoEstructura;
	public JLabel jLabelnumero_reingresoEmpleadoEstructura;
	public JTextField jTextFieldnumero_reingresoEmpleadoEstructura;
	public JButton jButtonnumero_reingresoEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEmpleadoEstructura;
	public JLabel jLabeldescripcionEmpleadoEstructura;
	public JTextArea jTextAreadescripcionEmpleadoEstructura;
	public JScrollPane jscrollPanedescripcionEmpleadoEstructura;
	public JButton jButtondescripcionEmpleadoEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoEstructura;
	public JLabel jLabelid_empresaEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoEstructura;
	public JButton jButtonid_empresaEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEmpleadoEstructura;
	public JLabel jLabelid_sucursalEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEmpleadoEstructura;
	public JButton jButtonid_sucursalEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_sucursalEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoEstructura;
	public JLabel jLabelid_empleadoEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoEstructura;
	public JButton jButtonid_empleadoEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEmpleadoEstructura;
	public JLabel jLabelid_estructuraEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEmpleadoEstructura;
	public JButton jButtonid_estructuraEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoEstructuraArbol= new JButtonMe();

	public JPanel jPanelid_cargoEmpleadoEstructura;
	public JLabel jLabelid_cargoEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoEmpleadoEstructura;
	public JButton jButtonid_cargoEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_cargoEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_cargoEmpleadoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_cargoEmpleadoEstructuraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoEstructura;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoEstructuraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoEstructura=new JPanel();
				this.jPanelAccionesFormularioEmpleadoEstructura=new JPanel();
				this.jmenuBarDetalleEmpleadoEstructura=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoEstructura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoEstructuraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoEstructura() {
		return this.jButtonActualizarToolBarEmpleadoEstructura;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoEstructura() {
		return this.jButtonEliminarToolBarEmpleadoEstructura;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoEstructura() {
		return this.jButtonCancelarToolBarEmpleadoEstructura;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoEstructura() {
		return this.jButtonProcesarInformacionEmpleadoEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoEstructura)	{
		this.jButtonProcesarInformacionEmpleadoEstructura = jButtonProcesarInformacionEmpleadoEstructura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoEstructura() {
		return this.jComboBoxTiposAccionesEmpleadoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoEstructura(
			JComboBox jComboBoxTiposRelacionesEmpleadoEstructura) {
		this.jComboBoxTiposRelacionesEmpleadoEstructura = jComboBoxTiposRelacionesEmpleadoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoEstructura(
			JComboBox jComboBoxTiposAccionesEmpleadoEstructura) {
		this.jComboBoxTiposAccionesEmpleadoEstructura = jComboBoxTiposAccionesEmpleadoEstructura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoEstructura() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoEstructura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoEstructura(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoEstructura) {
		this.jComboBoxTiposAccionesFormularioEmpleadoEstructura = jComboBoxTiposAccionesFormularioEmpleadoEstructura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		
		this.empleadoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoestructuraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoEstructura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoEstructura=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoEstructura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoEstructura,this.jTtoolBarDetalleEmpleadoEstructura,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoEstructura,this.jTtoolBarDetalleEmpleadoEstructura,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoEstructura,this.jTtoolBarDetalleEmpleadoEstructura,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoEstructura,this.jTtoolBarDetalleEmpleadoEstructura,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoEstructura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoEstructura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoEstructura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoEstructura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoEstructura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoEstructura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoEstructura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoEstructura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoEstructura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoEstructura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoEstructura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoEstructura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoEstructura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoEstructura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoEstructura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoEstructura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoEstructura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoEstructura.add(this.jMenuItemDetalleCerrarEmpleadoEstructura);
		
		this.jmenuDetalleAccionesEmpleadoEstructura.add(this.jMenuItemActualizarEmpleadoEstructura);
		this.jmenuDetalleAccionesEmpleadoEstructura.add(this.jMenuItemEliminarEmpleadoEstructura);
		this.jmenuDetalleAccionesEmpleadoEstructura.add(this.jMenuItemCancelarEmpleadoEstructura);		
		
		//this.jmenuDetalleDatosEmpleadoEstructura.add(this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura);				
		this.jmenuDetalleDatosEmpleadoEstructura.add(this.jMenuItemDetalleMostarOcultarEmpleadoEstructura);				
				
		//this.jmenuDetalleAccionesEmpleadoEstructura.add(this.jMenuItemGuardarCambiosEmpleadoEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoEstructura.add(this.jmenuDetalleArchivoEmpleadoEstructura);		
		this.jmenuBarDetalleEmpleadoEstructura.add(this.jmenuDetalleAccionesEmpleadoEstructura);		
		this.jmenuBarDetalleEmpleadoEstructura.add(this.jmenuDetalleDatosEmpleadoEstructura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoEstructura);				
	}
	
	
	public void inicializarElementosCamposEmpleadoEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoEstructura = new JLabelMe();
		jLabelIdEmpleadoEstructura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoEstructura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoEstructura= new GridBagLayout();

		this.jPanelidEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);

		jLabelidEmpleadoEstructura = new JLabel();
		jLabelidEmpleadoEstructura.setText("Id");

		jLabelidEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ingresoEmpleadoEstructura = new JLabelMe();
		this.jLabelfecha_ingresoEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO+" : *");
		this.jLabelfecha_ingresoEmpleadoEstructura.setToolTipText("Fecha Ingreso");
		this.jLabelfecha_ingresoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ingresoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ingresoEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ingresoEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelfecha_ingresoEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		//jFormattedTextFieldfecha_ingresoEmpleadoEstructura= new JFormattedTextFieldMe();

		jDateChooserfecha_ingresoEmpleadoEstructura= new JDateChooser();
		jDateChooserfecha_ingresoEmpleadoEstructura.setEnabled(false);
		jDateChooserfecha_ingresoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ingresoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ingresoEmpleadoEstructura.setDate(new Date());
		jDateChooserfecha_ingresoEmpleadoEstructura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ingresoEmpleadoEstructura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ingresoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ingresoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ingresoEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_salidaEmpleadoEstructura = new JLabelMe();
		this.jLabelfecha_salidaEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA+" : *");
		this.jLabelfecha_salidaEmpleadoEstructura.setToolTipText("Fecha Salida");
		this.jLabelfecha_salidaEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_salidaEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_salidaEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_salidaEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelfecha_salidaEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		//jFormattedTextFieldfecha_salidaEmpleadoEstructura= new JFormattedTextFieldMe();

		jDateChooserfecha_salidaEmpleadoEstructura= new JDateChooser();
		jDateChooserfecha_salidaEmpleadoEstructura.setEnabled(false);
		jDateChooserfecha_salidaEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_salidaEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_salidaEmpleadoEstructura.setDate(new Date());
		jDateChooserfecha_salidaEmpleadoEstructura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_salidaEmpleadoEstructura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_salidaEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_salidaEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_salidaEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_salidaEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_salidaEmpleadoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_reingresoEmpleadoEstructura = new JLabelMe();
		this.jLabelnumero_reingresoEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO+" : *");
		this.jLabelnumero_reingresoEmpleadoEstructura.setToolTipText("Numero Reingreso");
		this.jLabelnumero_reingresoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_reingresoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_reingresoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_reingresoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_reingresoEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_reingresoEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelnumero_reingresoEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jTextFieldnumero_reingresoEmpleadoEstructura= new JTextFieldMe();
		jTextFieldnumero_reingresoEmpleadoEstructura.setEnabled(false);
		jTextFieldnumero_reingresoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_reingresoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_reingresoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_reingresoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_reingresoEmpleadoEstructura.setText("0");

		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_reingresoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_reingresoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_reingresoEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEmpleadoEstructura = new JLabelMe();
		this.jLabeldescripcionEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEmpleadoEstructura.setToolTipText("Descripcion");
		this.jLabeldescripcionEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPaneldescripcionEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jTextAreadescripcionEmpleadoEstructura= new JTextAreaMe();
		jTextAreadescripcionEmpleadoEstructura.setEnabled(false);
		jTextAreadescripcionEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEstructura.setLineWrap(true);
		jTextAreadescripcionEmpleadoEstructura.setWrapStyleWord(true);
		jTextAreadescripcionEmpleadoEstructura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEmpleadoEstructura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEmpleadoEstructura = new JScrollPane(jTextAreadescripcionEmpleadoEstructura);
		jscrollPanedescripcionEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtondescripcionEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEmpleadoEstructuraBusqueda.setText("U");
		this.jButtondescripcionEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEmpleadoEstructuraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoEstructura = new JLabelMe();
		this.jLabelid_empresaEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoEstructura.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelid_empresaEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jComboBoxid_empresaEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoEstructura.setEnabled(false);

		this.jButtonid_empresaEmpleadoEstructura= new JButtonMe();
		this.jButtonid_empresaEmpleadoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEstructura.setText("Buscar");
		this.jButtonid_empresaEmpleadoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEstructura"));

		this.jButtonid_empresaEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoEstructuraUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoEstructuraUpdate.setText("U");
		this.jButtonid_empresaEmpleadoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEstructuraUpdate"));



					
		this.jLabelid_sucursalEmpleadoEstructura = new JLabelMe();
		this.jLabelid_sucursalEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEmpleadoEstructura.setToolTipText("Sucursal");
		this.jLabelid_sucursalEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelid_sucursalEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jComboBoxid_sucursalEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_sucursalEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEmpleadoEstructura.setEnabled(false);

		this.jButtonid_sucursalEmpleadoEstructura= new JButtonMe();
		this.jButtonid_sucursalEmpleadoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleadoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleadoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleadoEstructura.setText("Buscar");
		this.jButtonid_sucursalEmpleadoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEmpleadoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoEstructura"));

		this.jButtonid_sucursalEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEmpleadoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEmpleadoEstructuraUpdate= new JButtonMe();
		this.jButtonid_sucursalEmpleadoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEmpleadoEstructuraUpdate.setText("U");
		this.jButtonid_sucursalEmpleadoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEmpleadoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoEstructuraUpdate"));



					
		this.jLabelid_empleadoEmpleadoEstructura = new JLabelMe();
		this.jLabelid_empleadoEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoEstructura.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jComboBoxid_empleadoEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoEstructura= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEstructura.setText("Buscar");
		this.jButtonid_empleadoEmpleadoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEstructura"));

		this.jButtonid_empleadoEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoEstructuraUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoEstructuraUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEstructuraUpdate"));



					
		this.jLabelid_estructuraEmpleadoEstructura = new JLabelMe();
		this.jLabelid_estructuraEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEmpleadoEstructura.setToolTipText("Estructura");
		this.jLabelid_estructuraEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelid_estructuraEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jComboBoxid_estructuraEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_estructuraEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEmpleadoEstructura= new JButtonMe();
		this.jButtonid_estructuraEmpleadoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoEstructura.setText("Buscar");
		this.jButtonid_estructuraEmpleadoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEmpleadoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoEstructura"));

		this.jButtonid_estructuraEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEmpleadoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEmpleadoEstructuraUpdate= new JButtonMe();
		this.jButtonid_estructuraEmpleadoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoEstructuraUpdate.setText("U");
		this.jButtonid_estructuraEmpleadoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEmpleadoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoEstructuraUpdate"));


		jButtonid_estructuraEmpleadoEstructuraArbol= new JButtonMe();
		jButtonid_estructuraEmpleadoEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoEstructuraArbol.setText("Arbol");
		jButtonid_estructuraEmpleadoEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEmpleadoEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoEstructuraArbol"));



					
		this.jLabelid_cargoEmpleadoEstructura = new JLabelMe();
		this.jLabelid_cargoEmpleadoEstructura.setText(""+EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO+" : *");
		this.jLabelid_cargoEmpleadoEstructura.setToolTipText("A");
		this.jLabelid_cargoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargoEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargoEmpleadoEstructura.setToolTipText(EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO);
		this.gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		this.jPanelid_cargoEmpleadoEstructura.setLayout(this.gridaBagLayoutEmpleadoEstructura);


		jComboBoxid_cargoEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_cargoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargoEmpleadoEstructura= new JButtonMe();
		this.jButtonid_cargoEmpleadoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoEmpleadoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoEmpleadoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoEmpleadoEstructura.setText("Buscar");
		this.jButtonid_cargoEmpleadoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargoEmpleadoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoEstructura"));

		this.jButtonid_cargoEmpleadoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_cargoEmpleadoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoEmpleadoEstructuraBusqueda.setText("U");
		this.jButtonid_cargoEmpleadoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargoEmpleadoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoEstructuraBusqueda"));

		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargoEmpleadoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_cargoEmpleadoEstructuraUpdate= new JButtonMe();
		this.jButtonid_cargoEmpleadoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoEmpleadoEstructuraUpdate.setText("U");
		this.jButtonid_cargoEmpleadoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargoEmpleadoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoEstructuraUpdate"));


		jButtonid_cargoEmpleadoEstructuraArbol= new JButtonMe();
		jButtonid_cargoEmpleadoEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoEmpleadoEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoEmpleadoEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoEmpleadoEstructuraArbol.setText("Arbol");
		jButtonid_cargoEmpleadoEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cargoEmpleadoEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cargoEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoEstructuraArbol"));



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
		//this.jInternalFrameDetalleEmpleadoEstructura = new EmpleadoEstructuraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Estructura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoEstructura= new GridBagLayout();
		

		
		String sToolTipEmpleadoEstructura="";
		sToolTipEmpleadoEstructura=EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoEstructura+="(Nomina.EmpleadoEstructura)";
		}
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoEstructura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoEstructura = new JButtonMe();
		this.jButtonModificarEmpleadoEstructura = new JButtonMe();
        this.jButtonActualizarEmpleadoEstructura = new JButtonMe();
        this.jButtonEliminarEmpleadoEstructura = new JButtonMe();
        this.jButtonCancelarEmpleadoEstructura = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoEstructura = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoEstructura = new JButtonMe();
		this.jButtonCerrarEmpleadoEstructura = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoEstructura = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoEstructura = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoEstructura = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Estructura";
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoEstructura.setName("jPanelCamposEmpleadoEstructura"); 

		this.jPanelCamposOcultosEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoEstructura.setName("jPanelCamposOcultosEmpleadoEstructura"); 

        this.jPanelAccionesEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoEstructura.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoEstructura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoEstructura.setText("Nuevo");
		this.jButtonModificarEmpleadoEstructura.setText("Editar");
        this.jButtonActualizarEmpleadoEstructura.setText("Actualizar");
        this.jButtonEliminarEmpleadoEstructura.setText("Eliminar");
        this.jButtonCancelarEmpleadoEstructura.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoEstructura.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.setText("Guardar");
		this.jButtonCerrarEmpleadoEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoEstructura,"nuevo_button","Nuevo",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoEstructura,"modificar_button","Editar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoEstructura,"actualizar_button","Actualizar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoEstructura,"eliminar_button","Eliminar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoEstructura,"cancelar_button","Cancelar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoEstructura,"guardarcambios_button","Guardar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoEstructura,"guardarcambiostabla_button","Guardar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoEstructura,"cerrar_button","Salir",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoEstructura.setToolTipText("Nuevo"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoEstructura.setToolTipText("Editar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoEstructura.setToolTipText("Actualizar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoEstructura.setToolTipText("Eliminar)"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoEstructura.setToolTipText("Cancelar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoEstructura.setToolTipText("Guardar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.setToolTipText("Guardar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoEstructura.setToolTipText("Salir"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoEstructura";
		inputMap = this.jButtonNuevoEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoEstructura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoEstructura";
		inputMap = this.jButtonActualizarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoEstructura"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoEstructura";
		inputMap = this.jButtonEliminarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoEstructura"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoEstructura";
		inputMap = this.jButtonCancelarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoEstructura"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoEstructura";
		inputMap = this.jButtonCerrarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoEstructura";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoEstructura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoEstructura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoEstructura.setToolTipText("Nuevo EmpleadoEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoEstructura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoEstructura.setToolTipText("Sin Cerrar Ventana EmpleadoEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoEstructura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoEstructura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoEstructura.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoEstructura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoEstructura = new JLabelMe();
		
		this.jLabelAccionesEmpleadoEstructura.setText("Acciones");		
		this.jLabelAccionesEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoEstructura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoEstructura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoEstructura=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoEstructura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoEstructura = new GridBagLayout();
		
		this.jPanelCamposEmpleadoEstructura.setLayout(gridaBagLayoutCamposEmpleadoEstructura);
		this.jPanelCamposOcultosEmpleadoEstructura.setLayout(gridaBagLayoutCamposOcultosEmpleadoEstructura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoEstructura.add(jLabelIdEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoEstructura.add(jLabelidEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoEstructura.add(jLabelid_empresaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoEstructura.add(jButtonid_empresaEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 3;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoEstructura.add(jButtonid_empresaEmpleadoEstructuraUpdate, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoEstructura.add(jComboBoxid_empresaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEmpleadoEstructura.add(jLabelid_sucursalEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEmpleadoEstructura.add(jButtonid_sucursalEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 3;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEmpleadoEstructura.add(jButtonid_sucursalEmpleadoEstructuraUpdate, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEmpleadoEstructura.add(jComboBoxid_sucursalEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoEstructura.add(jLabelid_empleadoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmpleadoEstructura.add(jButtonid_empleadoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 3;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoEstructura.add(jButtonid_empleadoEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 4;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoEstructura.add(jButtonid_empleadoEmpleadoEstructuraUpdate, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoEstructura.add(jComboBoxid_empleadoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEmpleadoEstructura.add(jLabelid_estructuraEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoEstructura.add(jButtonid_estructuraEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 3;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoEstructura.add(jButtonid_estructuraEmpleadoEstructuraUpdate, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEmpleadoEstructura.add(jComboBoxid_estructuraEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargoEmpleadoEstructura.add(jLabelid_cargoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoEmpleadoEstructura.add(jButtonid_cargoEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 3;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoEmpleadoEstructura.add(jButtonid_cargoEmpleadoEstructuraUpdate, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargoEmpleadoEstructura.add(jComboBoxid_cargoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ingresoEmpleadoEstructura.add(jLabelfecha_ingresoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ingresoEmpleadoEstructura.add(jButtonfecha_ingresoEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ingresoEmpleadoEstructura.add(jDateChooserfecha_ingresoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_salidaEmpleadoEstructura.add(jLabelfecha_salidaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_salidaEmpleadoEstructura.add(jButtonfecha_salidaEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_salidaEmpleadoEstructura.add(jDateChooserfecha_salidaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_reingresoEmpleadoEstructura.add(jLabelnumero_reingresoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_reingresoEmpleadoEstructura.add(jButtonnumero_reingresoEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_reingresoEmpleadoEstructura.add(jTextFieldnumero_reingresoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEmpleadoEstructura.add(jLabeldescripcionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 2;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
		this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEmpleadoEstructura.add(jButtondescripcionEmpleadoEstructuraBusqueda, this.gridBagConstraintsEmpleadoEstructura);
	}

	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
	this.gridBagConstraintsEmpleadoEstructura.gridx = 1;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEmpleadoEstructura.add(jscrollPanedescripcionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelidEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelid_empleadoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelid_estructuraEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelid_cargoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelfecha_ingresoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelfecha_salidaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPanelnumero_reingresoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEstructura.add(this.jPaneldescripcionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposEmpleadoEstructura % 1==0) {
		iXPanelCamposEmpleadoEstructura=0;
		iYPanelCamposEmpleadoEstructura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposOcultosEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposOcultosEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoEstructura.add(this.jPanelid_empresaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposOcultosEmpleadoEstructura % 1==0) {
		iXPanelCamposOcultosEmpleadoEstructura=0;
		iYPanelCamposOcultosEmpleadoEstructura++;
	}
	this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEstructura.gridy = iYPanelCamposOcultosEmpleadoEstructura;
	this.gridBagConstraintsEmpleadoEstructura.gridx = iXPanelCamposOcultosEmpleadoEstructura++;
	this.gridBagConstraintsEmpleadoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoEstructura.add(this.jPanelid_sucursalEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);



	if(iXPanelCamposOcultosEmpleadoEstructura % 1==0) {
		iXPanelCamposOcultosEmpleadoEstructura=0;
		iYPanelCamposOcultosEmpleadoEstructura++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoEstructura= new GridBagLayout();
		this.jPanelAccionesEmpleadoEstructura.setLayout(gridaBagLayoutAccionesEmpleadoEstructura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoEstructura= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoEstructura.setLayout(gridaBagLayoutAccionesFormularioEmpleadoEstructura);
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoEstructura.add(this.jComboBoxTiposAccionesFormularioEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoEstructura.add(this.jCheckBoxPostAccionNuevoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoEstructura.add(this.jCheckBoxPostAccionSinCerrarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoEstructura.add(this.jCheckBoxPostAccionSinMensajeEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoEstructura.add(this.jButtonModificarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);							

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoEstructura.add(this.jButtonEliminarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
			
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEstructura.add(this.jButtonActualizarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);


		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEstructura.add(this.jButtonGuardarCambiosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);	
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;		
		this.gridBagConstraintsEmpleadoEstructura.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEstructura.add(this.jButtonCancelarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoEstructura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;		
			//this.gridBagConstraintsEmpleadoEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoEstructura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEstructura.gridx =0;
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoEstructura = new EmpleadoEstructuraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Estructura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Estructura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Estructura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoEstructuraModel empleadoestructuraModel=new EmpleadoEstructuraModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoEstructuraModel.EmpleadoEstructuraFocusTraversalPolicy empleadoestructuraFocusTraversalPolicy = empleadoestructuraModel.new EmpleadoEstructuraFocusTraversalPolicy(this);
			
			//empleadoestructuraFocusTraversalPolicy.setempleadoestructuraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoestructuraModel);
			
			
			this.jContentPaneDetalleEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoEstructura = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoEstructura.setLayout(gridaBagLayoutDetalleEmpleadoEstructura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoEstructura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoEstructura.add(jTtoolBarDetalleEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoEstructura=   new JScrollPane(jContentPaneDetalleEmpleadoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoEstructura.add(jPanelCamposEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);
			
			
			
			
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
						&& empleadoestructuraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoEstructura= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
						this.jContentPaneDetalleEmpleadoEstructura.add(this.jTabbedPaneRelacionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoEstructura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoEstructura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoEstructura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoEstructura.add(jPanelCamposOcultosEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);
				
					this.jPanelCamposOcultosEmpleadoEstructura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	        this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoEstructura.add(this.jPanelAccionesFormularioEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);							
			
			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoEstructura.add(this.jPanelAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoEstructura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoEstructura=   new JScrollPane(this.jPanelCamposEmpleadoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoEstructura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
			
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
			
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoEstructura;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoEstructura;
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
