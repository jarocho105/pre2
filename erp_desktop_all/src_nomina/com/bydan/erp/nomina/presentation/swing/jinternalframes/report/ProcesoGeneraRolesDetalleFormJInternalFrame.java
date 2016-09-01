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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoGeneraRolesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoGeneraRolesDetalleFormJInternalFrame extends ProcesoGeneraRolesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoGeneraRoles;
	
	protected JMenuBar jmenuBarDetalleProcesoGeneraRoles;
	
	protected JMenu jmenuDetalleProcesoGeneraRoles;
	protected JMenu jmenuDetalleArchivoProcesoGeneraRoles;
	protected JMenu jmenuDetalleAccionesProcesoGeneraRoles;
	protected JMenu jmenuDetalleDatosProcesoGeneraRoles;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoGeneraRoles;	
	protected GridBagConstraints gridBagConstraintsProcesoGeneraRoles;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoGeneraRolesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoGeneraRoles;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public ProcesoGeneraRolesSessionBean procesogenerarolesSessionBean;
	
	
	
	
	public MesSessionBean mesSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public ProcesoGeneraRolesLogic procesogenerarolesLogic;
	
	public JScrollPane jScrollPanelDatosProcesoGeneraRoles;
	public JScrollPane jScrollPanelDatosEdicionProcesoGeneraRoles;
	public JScrollPane jScrollPanelDatosGeneralProcesoGeneraRoles;
	
	protected JPanel jPanelCamposProcesoGeneraRoles;    
	protected JPanel jPanelCamposOcultosProcesoGeneraRoles;    	
	protected JPanel jPanelAccionesProcesoGeneraRoles;
	protected JPanel jPanelAccionesFormularioProcesoGeneraRoles;
    
	
	
	protected Integer iXPanelCamposProcesoGeneraRoles=0;
	protected Integer iYPanelCamposProcesoGeneraRoles=0;
	
	protected Integer iXPanelCamposOcultosProcesoGeneraRoles=0;
	protected Integer iYPanelCamposOcultosProcesoGeneraRoles=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoGeneraRoles;
	public JButton jButtonModificarProcesoGeneraRoles;
	public JButton jButtonActualizarProcesoGeneraRoles;
    public JButton jButtonEliminarProcesoGeneraRoles;
	public JButton jButtonCancelarProcesoGeneraRoles;
    public JButton jButtonGuardarCambiosProcesoGeneraRoles;
	public JButton jButtonGuardarCambiosTablaProcesoGeneraRoles;
	protected JButton jButtonCerrarProcesoGeneraRoles;
	
	
	protected JButton jButtonProcesarInformacionProcesoGeneraRoles;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoGeneraRoles;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoGeneraRoles;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoGeneraRoles;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoGeneraRoles;
	protected JButton jButtonModificarToolBarProcesoGeneraRoles;
	protected JButton jButtonActualizarToolBarProcesoGeneraRoles;
    protected JButton jButtonEliminarToolBarProcesoGeneraRoles;
	protected JButton jButtonCancelarToolBarProcesoGeneraRoles;
    protected JButton jButtonGuardarCambiosToolBarProcesoGeneraRoles;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoGeneraRoles;
	protected JButton jButtonCerrarToolBarProcesoGeneraRoles;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoGeneraRoles;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoGeneraRoles;
	protected JMenuItem jMenuItemModificarProcesoGeneraRoles;
	protected JMenuItem jMenuItemActualizarProcesoGeneraRoles;
    protected JMenuItem jMenuItemEliminarProcesoGeneraRoles;
	protected JMenuItem jMenuItemCancelarProcesoGeneraRoles;
    protected JMenuItem jMenuItemGuardarCambiosProcesoGeneraRoles;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoGeneraRoles;
	protected JMenuItem jMenuItemCerrarProcesoGeneraRoles;
	protected JMenuItem jMenuItemDetalleCerrarProcesoGeneraRoles;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoGeneraRoles;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoGeneraRoles;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoGeneraRoles;
	protected JMenuItem jMenuItemMostrarOcultarProcesoGeneraRoles;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoGeneraRoles;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoGeneraRoles;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoGeneraRoles;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoGeneraRoles;
	public JLabel jLabelIdProcesoGeneraRoles;
	public JLabel jLabelidProcesoGeneraRoles;
	public JButton jButtonidProcesoGeneraRolesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesProcesoGeneraRoles;
	public JLabel jLabelid_mesProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProcesoGeneraRoles;
	public JButton jButtonid_mesProcesoGeneraRoles= new JButtonMe();
	public JButton jButtonid_mesProcesoGeneraRolesUpdate= new JButtonMe();
	public JButton jButtonid_mesProcesoGeneraRolesBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraProcesoGeneraRoles;
	public JLabel jLabelid_estructuraProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraProcesoGeneraRoles;
	public JButton jButtonid_estructuraProcesoGeneraRoles= new JButtonMe();
	public JButton jButtonid_estructuraProcesoGeneraRolesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraProcesoGeneraRolesBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoProcesoGeneraRoles;
	public JLabel jLabelid_empleadoProcesoGeneraRoles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoProcesoGeneraRoles;
	public JButton jButtonid_empleadoProcesoGeneraRoles= new JButtonMe();
	public JButton jButtonid_empleadoProcesoGeneraRolesUpdate= new JButtonMe();
	public JButton jButtonid_empleadoProcesoGeneraRolesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoGeneraRoles;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoGeneraRolesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoGeneraRoles=new JPanel();
				this.jPanelAccionesFormularioProcesoGeneraRoles=new JPanel();
				this.jmenuBarDetalleProcesoGeneraRoles=new JMenuBar();
				this.jTtoolBarDetalleProcesoGeneraRoles=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoGeneraRolesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraRolesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoGeneraRoles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoGeneraRoles() {
		return this.jButtonActualizarToolBarProcesoGeneraRoles;
	}
	
	public JButton getjButtonEliminarToolBarProcesoGeneraRoles() {
		return this.jButtonEliminarToolBarProcesoGeneraRoles;
	}
	
	public JButton getjButtonCancelarToolBarProcesoGeneraRoles() {
		return this.jButtonCancelarToolBarProcesoGeneraRoles;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoGeneraRoles() {
		return this.jButtonProcesarInformacionProcesoGeneraRoles;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoGeneraRoles)	{
		this.jButtonProcesarInformacionProcesoGeneraRoles = jButtonProcesarInformacionProcesoGeneraRoles;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoGeneraRoles() {
		return this.jComboBoxTiposAccionesProcesoGeneraRoles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoGeneraRoles(
			JComboBox jComboBoxTiposRelacionesProcesoGeneraRoles) {
		this.jComboBoxTiposRelacionesProcesoGeneraRoles = jComboBoxTiposRelacionesProcesoGeneraRoles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoGeneraRoles(
			JComboBox jComboBoxTiposAccionesProcesoGeneraRoles) {
		this.jComboBoxTiposAccionesProcesoGeneraRoles = jComboBoxTiposAccionesProcesoGeneraRoles;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoGeneraRoles() {
		return this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoGeneraRoles(
			JComboBox jComboBoxTiposAccionesFormularioProcesoGeneraRoles) {
		this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles = jComboBoxTiposAccionesFormularioProcesoGeneraRoles;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
		
		this.procesogenerarolesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogenerarolesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesogenerarolesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoGeneraRolesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoGeneraRolesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoGeneraRolesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Genera Roles MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoGeneraRolesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoGeneraRoles= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoGeneraRoles=new JButtonMe();
				this.jButtonModificarToolBarProcesoGeneraRoles=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoGeneraRoles,this.jTtoolBarDetalleProcesoGeneraRoles,
							"actualizar","actualizar","Actualizar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoGeneraRoles,this.jTtoolBarDetalleProcesoGeneraRoles,
							"eliminar","eliminar","Eliminar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoGeneraRoles,this.jTtoolBarDetalleProcesoGeneraRoles,
							"cancelar","cancelar","Cancelar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoGeneraRoles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoGeneraRoles,this.jTtoolBarDetalleProcesoGeneraRoles,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoGeneraRoles=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoGeneraRoles=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoGeneraRoles=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoGeneraRoles=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoGeneraRoles=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoGeneraRoles= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoGeneraRoles.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoGeneraRoles,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoGeneraRoles= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoGeneraRoles.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoGeneraRoles,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoGeneraRoles= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoGeneraRoles.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoGeneraRoles,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoGeneraRoles= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoGeneraRoles.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoGeneraRoles,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoGeneraRoles= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoGeneraRoles.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoGeneraRoles,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoGeneraRoles= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoGeneraRoles.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoGeneraRoles,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoGeneraRoles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoGeneraRoles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoGeneraRoles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoGeneraRoles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoGeneraRoles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoGeneraRoles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoGeneraRoles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoGeneraRoles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoGeneraRoles,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoGeneraRoles.add(this.jMenuItemDetalleCerrarProcesoGeneraRoles);
		
		this.jmenuDetalleAccionesProcesoGeneraRoles.add(this.jMenuItemActualizarProcesoGeneraRoles);
		this.jmenuDetalleAccionesProcesoGeneraRoles.add(this.jMenuItemEliminarProcesoGeneraRoles);
		this.jmenuDetalleAccionesProcesoGeneraRoles.add(this.jMenuItemCancelarProcesoGeneraRoles);		
		
		//this.jmenuDetalleDatosProcesoGeneraRoles.add(this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles);				
		this.jmenuDetalleDatosProcesoGeneraRoles.add(this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles);				
				
		//this.jmenuDetalleAccionesProcesoGeneraRoles.add(this.jMenuItemGuardarCambiosProcesoGeneraRoles);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoGeneraRoles.add(this.jmenuDetalleArchivoProcesoGeneraRoles);		
		this.jmenuBarDetalleProcesoGeneraRoles.add(this.jmenuDetalleAccionesProcesoGeneraRoles);		
		this.jmenuBarDetalleProcesoGeneraRoles.add(this.jmenuDetalleDatosProcesoGeneraRoles);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoGeneraRoles);				
	}
	
	
	public void inicializarElementosCamposProcesoGeneraRoles() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoGeneraRoles = new JLabelMe();
		jLabelIdProcesoGeneraRoles.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoGeneraRoles = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoGeneraRoles.setToolTipText(ProcesoGeneraRolesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoGeneraRoles= new GridBagLayout();

		this.jPanelidProcesoGeneraRoles.setLayout(this.gridaBagLayoutProcesoGeneraRoles);

		jLabelidProcesoGeneraRoles = new JLabel();
		jLabelidProcesoGeneraRoles.setText("Id");

		jLabelidProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoGeneraRoles() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_mesProcesoGeneraRoles = new JLabelMe();
		this.jLabelid_mesProcesoGeneraRoles.setText(""+ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProcesoGeneraRoles.setToolTipText("Mes");
		this.jLabelid_mesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProcesoGeneraRoles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProcesoGeneraRoles.setToolTipText(ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProcesoGeneraRoles = new GridBagLayout();
		this.jPanelid_mesProcesoGeneraRoles.setLayout(this.gridaBagLayoutProcesoGeneraRoles);


		jComboBoxid_mesProcesoGeneraRoles= new JComboBoxMe();
		jComboBoxid_mesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProcesoGeneraRoles= new JButtonMe();
		this.jButtonid_mesProcesoGeneraRoles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoGeneraRoles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoGeneraRoles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoGeneraRoles.setText("Procesar");
		this.jButtonid_mesProcesoGeneraRoles.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProcesoGeneraRoles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoGeneraRoles,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoGeneraRoles"));

		this.jButtonid_mesProcesoGeneraRolesBusqueda= new JButtonMe();
		this.jButtonid_mesProcesoGeneraRolesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoGeneraRolesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoGeneraRolesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoGeneraRolesBusqueda.setText("U");
		this.jButtonid_mesProcesoGeneraRolesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProcesoGeneraRolesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoGeneraRolesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoGeneraRolesBusqueda"));

		if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProcesoGeneraRolesBusqueda.setVisible(false);		}

		this.jButtonid_mesProcesoGeneraRolesUpdate= new JButtonMe();
		this.jButtonid_mesProcesoGeneraRolesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoGeneraRolesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoGeneraRolesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoGeneraRolesUpdate.setText("U");
		this.jButtonid_mesProcesoGeneraRolesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProcesoGeneraRolesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoGeneraRolesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoGeneraRolesUpdate"));



					
		this.jLabelid_estructuraProcesoGeneraRoles = new JLabelMe();
		this.jLabelid_estructuraProcesoGeneraRoles.setText(""+ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraProcesoGeneraRoles.setToolTipText("Estructura");
		this.jLabelid_estructuraProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraProcesoGeneraRoles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraProcesoGeneraRoles.setToolTipText(ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutProcesoGeneraRoles = new GridBagLayout();
		this.jPanelid_estructuraProcesoGeneraRoles.setLayout(this.gridaBagLayoutProcesoGeneraRoles);


		jComboBoxid_estructuraProcesoGeneraRoles= new JComboBoxMe();
		jComboBoxid_estructuraProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraProcesoGeneraRoles= new JButtonMe();
		this.jButtonid_estructuraProcesoGeneraRoles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoGeneraRoles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoGeneraRoles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoGeneraRoles.setText("Procesar");
		this.jButtonid_estructuraProcesoGeneraRoles.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraProcesoGeneraRoles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoGeneraRoles,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoGeneraRoles"));

		this.jButtonid_estructuraProcesoGeneraRolesBusqueda= new JButtonMe();
		this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setText("U");
		this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoGeneraRolesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoGeneraRolesBusqueda"));

		if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraProcesoGeneraRolesBusqueda.setVisible(false);		}

		this.jButtonid_estructuraProcesoGeneraRolesUpdate= new JButtonMe();
		this.jButtonid_estructuraProcesoGeneraRolesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoGeneraRolesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoGeneraRolesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProcesoGeneraRolesUpdate.setText("U");
		this.jButtonid_estructuraProcesoGeneraRolesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraProcesoGeneraRolesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoGeneraRolesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoGeneraRolesUpdate"));



					
		this.jLabelid_empleadoProcesoGeneraRoles = new JLabelMe();
		this.jLabelid_empleadoProcesoGeneraRoles.setText(""+ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoProcesoGeneraRoles.setToolTipText("Empleado");
		this.jLabelid_empleadoProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoProcesoGeneraRoles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoProcesoGeneraRoles.setToolTipText(ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutProcesoGeneraRoles = new GridBagLayout();
		this.jPanelid_empleadoProcesoGeneraRoles.setLayout(this.gridaBagLayoutProcesoGeneraRoles);


		jComboBoxid_empleadoProcesoGeneraRoles= new JComboBoxMe();
		jComboBoxid_empleadoProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoProcesoGeneraRoles= new JButtonMe();
		this.jButtonid_empleadoProcesoGeneraRoles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProcesoGeneraRoles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProcesoGeneraRoles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProcesoGeneraRoles.setText("Procesar");
		this.jButtonid_empleadoProcesoGeneraRoles.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoProcesoGeneraRoles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProcesoGeneraRoles,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProcesoGeneraRoles"));

		this.jButtonid_empleadoProcesoGeneraRolesBusqueda= new JButtonMe();
		this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setText("U");
		this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProcesoGeneraRolesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProcesoGeneraRolesBusqueda"));

		if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoProcesoGeneraRolesBusqueda.setVisible(false);		}

		this.jButtonid_empleadoProcesoGeneraRolesUpdate= new JButtonMe();
		this.jButtonid_empleadoProcesoGeneraRolesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoGeneraRolesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoGeneraRolesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProcesoGeneraRolesUpdate.setText("U");
		this.jButtonid_empleadoProcesoGeneraRolesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoProcesoGeneraRolesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProcesoGeneraRolesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProcesoGeneraRolesUpdate"));



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
		//this.jInternalFrameDetalleProcesoGeneraRoles = new ProcesoGeneraRolesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Genera Roles DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoGeneraRoles= new GridBagLayout();
		

		
		String sToolTipProcesoGeneraRoles="";
		sToolTipProcesoGeneraRoles=ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoGeneraRoles+="(Nomina.ProcesoGeneraRoles)";
		}
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoGeneraRoles+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoGeneraRoles = new JButtonMe();
		this.jButtonModificarProcesoGeneraRoles = new JButtonMe();
        this.jButtonActualizarProcesoGeneraRoles = new JButtonMe();
        this.jButtonEliminarProcesoGeneraRoles = new JButtonMe();
        this.jButtonCancelarProcesoGeneraRoles = new JButtonMe();
        this.jButtonGuardarCambiosProcesoGeneraRoles = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles = new JButtonMe();
		this.jButtonCerrarProcesoGeneraRoles = new JButtonMe();
		
		this.jScrollPanelDatosProcesoGeneraRoles = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoGeneraRoles = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoGeneraRoles = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Genera Roles";
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Roleses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoGeneraRoles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoGeneraRoles.setName("jPanelCamposProcesoGeneraRoles"); 

		this.jPanelCamposOcultosProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoGeneraRoles.setName("jPanelCamposOcultosProcesoGeneraRoles"); 

        this.jPanelAccionesProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoGeneraRoles.setToolTipText("Acciones");
        this.jPanelAccionesProcesoGeneraRoles.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoGeneraRoles.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoGeneraRoles.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoGeneraRoles.setText("Nuevo");
		this.jButtonModificarProcesoGeneraRoles.setText("Editar");
        this.jButtonActualizarProcesoGeneraRoles.setText("Actualizar");
        this.jButtonEliminarProcesoGeneraRoles.setText("Eliminar");
        this.jButtonCancelarProcesoGeneraRoles.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoGeneraRoles.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.setText("Guardar");
		this.jButtonCerrarProcesoGeneraRoles.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoGeneraRoles,"nuevo_button","Nuevo",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoGeneraRoles,"modificar_button","Editar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoGeneraRoles,"actualizar_button","Actualizar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoGeneraRoles,"eliminar_button","Eliminar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoGeneraRoles,"cancelar_button","Cancelar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoGeneraRoles,"guardarcambios_button","Guardar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoGeneraRoles,"guardarcambiostabla_button","Guardar",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoGeneraRoles,"cerrar_button","Salir",this.procesogenerarolesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoGeneraRoles.setToolTipText("Nuevo"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoGeneraRoles.setToolTipText("Editar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoGeneraRoles.setToolTipText("Actualizar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoGeneraRoles.setToolTipText("Eliminar)"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoGeneraRoles.setToolTipText("Cancelar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoGeneraRoles.setToolTipText("Guardar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.setToolTipText("Guardar"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoGeneraRoles.setToolTipText("Salir"+" "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoGeneraRoles";
		inputMap = this.jButtonNuevoProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoGeneraRoles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoGeneraRoles"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoGeneraRoles";
		inputMap = this.jButtonActualizarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoGeneraRoles"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoGeneraRoles";
		inputMap = this.jButtonEliminarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoGeneraRoles"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoGeneraRoles";
		inputMap = this.jButtonCancelarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoGeneraRoles"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoGeneraRoles";
		inputMap = this.jButtonCerrarProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoGeneraRoles"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoGeneraRoles";
		inputMap = this.jButtonGuardarCambiosTablaProcesoGeneraRoles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoGeneraRoles"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoGeneraRoles = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoGeneraRoles.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoGeneraRoles.setToolTipText("Nuevo ProcesoGeneraRoles");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoGeneraRoles = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoGeneraRoles.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoGeneraRoles.setToolTipText("Sin Cerrar Ventana ProcesoGeneraRoles");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoGeneraRoles = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoGeneraRoles.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoGeneraRoles.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoGeneraRoles.setText("Accion");
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoGeneraRoles = new JLabelMe();
		
		this.jLabelAccionesProcesoGeneraRoles.setText("Acciones");		
		this.jLabelAccionesProcesoGeneraRoles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraRoles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraRoles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoGeneraRoles();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoGeneraRoles();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoGeneraRoles=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoGeneraRoles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoGeneraRoles,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoGeneraRoles = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoGeneraRoles = new GridBagLayout();
		
		this.jPanelCamposProcesoGeneraRoles.setLayout(gridaBagLayoutCamposProcesoGeneraRoles);
		this.jPanelCamposOcultosProcesoGeneraRoles.setLayout(gridaBagLayoutCamposOcultosProcesoGeneraRoles);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoGeneraRoles.add(jLabelIdProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 1;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoGeneraRoles.add(jLabelidProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);


	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProcesoGeneraRoles.add(jLabelid_mesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 2;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoGeneraRoles.add(jButtonid_mesProcesoGeneraRolesBusqueda, this.gridBagConstraintsProcesoGeneraRoles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 3;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoGeneraRoles.add(jButtonid_mesProcesoGeneraRolesUpdate, this.gridBagConstraintsProcesoGeneraRoles);
	}

	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 1;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProcesoGeneraRoles.add(jComboBoxid_mesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);


	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraProcesoGeneraRoles.add(jLabelid_estructuraProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 2;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProcesoGeneraRoles.add(jButtonid_estructuraProcesoGeneraRolesBusqueda, this.gridBagConstraintsProcesoGeneraRoles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 3;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProcesoGeneraRoles.add(jButtonid_estructuraProcesoGeneraRolesUpdate, this.gridBagConstraintsProcesoGeneraRoles);
	}

	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 1;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraProcesoGeneraRoles.add(jComboBoxid_estructuraProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);


	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoProcesoGeneraRoles.add(jLabelid_empleadoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 2;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProcesoGeneraRoles.add(jButtonid_empleadoProcesoGeneraRolesBusqueda, this.gridBagConstraintsProcesoGeneraRoles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 3;
		this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProcesoGeneraRoles.add(jButtonid_empleadoProcesoGeneraRolesUpdate, this.gridBagConstraintsProcesoGeneraRoles);
	}

	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = 1;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoProcesoGeneraRoles.add(jComboBoxid_empleadoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = iYPanelCamposProcesoGeneraRoles;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = iXPanelCamposProcesoGeneraRoles++;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGeneraRoles.add(this.jPanelidProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(iXPanelCamposProcesoGeneraRoles % 1==0) {
		iXPanelCamposProcesoGeneraRoles=0;
		iYPanelCamposProcesoGeneraRoles++;
	}
	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = iYPanelCamposProcesoGeneraRoles;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = iXPanelCamposProcesoGeneraRoles++;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGeneraRoles.add(this.jPanelid_mesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(iXPanelCamposProcesoGeneraRoles % 1==0) {
		iXPanelCamposProcesoGeneraRoles=0;
		iYPanelCamposProcesoGeneraRoles++;
	}
	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = iYPanelCamposProcesoGeneraRoles;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = iXPanelCamposProcesoGeneraRoles++;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGeneraRoles.add(this.jPanelid_estructuraProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(iXPanelCamposProcesoGeneraRoles % 1==0) {
		iXPanelCamposProcesoGeneraRoles=0;
		iYPanelCamposProcesoGeneraRoles++;
	}
	this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGeneraRoles.gridy = iYPanelCamposProcesoGeneraRoles;
	this.gridBagConstraintsProcesoGeneraRoles.gridx = iXPanelCamposProcesoGeneraRoles++;
	this.gridBagConstraintsProcesoGeneraRoles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGeneraRoles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGeneraRoles.add(this.jPanelid_empleadoProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);



	if(iXPanelCamposProcesoGeneraRoles % 1==0) {
		iXPanelCamposProcesoGeneraRoles=0;
		iYPanelCamposProcesoGeneraRoles++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoGeneraRoles= new GridBagLayout();
		this.jPanelAccionesProcesoGeneraRoles.setLayout(gridaBagLayoutAccionesProcesoGeneraRoles);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoGeneraRoles= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoGeneraRoles.setLayout(gridaBagLayoutAccionesFormularioProcesoGeneraRoles);
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoGeneraRoles.add(this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoGeneraRoles.add(this.jButtonModificarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);							

		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;
		this.gridBagConstraintsProcesoGeneraRoles.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoGeneraRoles.add(this.jButtonEliminarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
			
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoGeneraRoles.add(this.jButtonActualizarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);


		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoGeneraRoles.add(this.jButtonGuardarCambiosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);	
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = 0;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoGeneraRoles.add(this.jButtonCancelarProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoGeneraRoles = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoGeneraRoles);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();						
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;		
			//this.gridBagConstraintsProcesoGeneraRoles.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoGeneraRoles.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoGeneraRoles.gridx =0;
		this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoGeneraRoles.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoGeneraRoles = new ProcesoGeneraRolesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Genera Roles DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Genera Roles DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Genera Roles Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoGeneraRolesModel procesogenerarolesModel=new ProcesoGeneraRolesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoGeneraRolesModel.ProcesoGeneraRolesFocusTraversalPolicy procesogenerarolesFocusTraversalPolicy = procesogenerarolesModel.new ProcesoGeneraRolesFocusTraversalPolicy(this);
			
			//procesogenerarolesFocusTraversalPolicy.setprocesogenerarolesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesogenerarolesModel);
			
			
			this.jContentPaneDetalleProcesoGeneraRoles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoGeneraRoles = new GridBagLayout();	
			this.jContentPaneDetalleProcesoGeneraRoles.setLayout(gridaBagLayoutDetalleProcesoGeneraRoles);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoGeneraRoles = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
				this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoGeneraRoles.add(jTtoolBarDetalleProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoGeneraRoles=   new JScrollPane(jContentPaneDetalleProcesoGeneraRoles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoGeneraRoles=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	        
			this.jContentPaneDetalleProcesoGeneraRoles.add(jPanelCamposProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);
			
			
			
			
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
						//&& procesogenerarolesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoGeneraRoles= new GridBagConstraints();
						this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
						this.jContentPaneDetalleProcesoGeneraRoles.add(this.jTabbedPaneRelacionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoGeneraRoles.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoGeneraRoles.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
					this.gridBagConstraintsProcesoGeneraRoles.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoGeneraRoles.add(jPanelCamposOcultosProcesoGeneraRoles, gridBagConstraintsProcesoGeneraRoles);
				
					this.jPanelCamposOcultosProcesoGeneraRoles.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	        this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoGeneraRoles.add(this.jPanelAccionesFormularioProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);							
			
			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
	        this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoGeneraRoles.add(this.jPanelAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoGeneraRoles);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoGeneraRoles=   new JScrollPane(this.jPanelCamposProcesoGeneraRoles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoGeneraRoles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraRoles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraRoles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
			this.gridBagConstraintsProcesoGeneraRoles.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoGeneraRoles.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoGeneraRoles.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);			
			
			this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
			
			
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		
			
		this.gridBagConstraintsProcesoGeneraRoles = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraRoles.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraRoles.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoGeneraRoles, this.gridBagConstraintsProcesoGeneraRoles);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoGeneraRoles.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoGeneraRoles.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoGeneraRoles.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoGeneraRoles.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoGeneraRoles;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoGeneraRoles;
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
