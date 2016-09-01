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
import com.bydan.erp.nomina.util.EmpleadoHobbyConstantesFunciones;

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
public class EmpleadoHobbyDetalleFormJInternalFrame extends EmpleadoHobbyBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoHobby;
	
	protected JMenuBar jmenuBarDetalleEmpleadoHobby;
	
	protected JMenu jmenuDetalleEmpleadoHobby;
	protected JMenu jmenuDetalleArchivoEmpleadoHobby;
	protected JMenu jmenuDetalleAccionesEmpleadoHobby;
	protected JMenu jmenuDetalleDatosEmpleadoHobby;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoHobby;	
	protected GridBagConstraints gridBagConstraintsEmpleadoHobby;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoHobbyBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoHobby;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_hobby="";
	
	public EmpleadoHobbySessionBean empleadohobbySessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public HobbySessionBean hobbySessionBean;	
	
	public EmpleadoHobbyLogic empleadohobbyLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoHobby;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoHobby;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoHobby;
	
	protected JPanel jPanelCamposEmpleadoHobby;    
	protected JPanel jPanelCamposOcultosEmpleadoHobby;    	
	protected JPanel jPanelAccionesEmpleadoHobby;
	protected JPanel jPanelAccionesFormularioEmpleadoHobby;
    
	
	
	protected Integer iXPanelCamposEmpleadoHobby=0;
	protected Integer iYPanelCamposEmpleadoHobby=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoHobby=0;
	protected Integer iYPanelCamposOcultosEmpleadoHobby=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoHobby;
	public JButton jButtonModificarEmpleadoHobby;
	public JButton jButtonActualizarEmpleadoHobby;
    public JButton jButtonEliminarEmpleadoHobby;
	public JButton jButtonCancelarEmpleadoHobby;
    public JButton jButtonGuardarCambiosEmpleadoHobby;
	public JButton jButtonGuardarCambiosTablaEmpleadoHobby;
	protected JButton jButtonCerrarEmpleadoHobby;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoHobby;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoHobby;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoHobby;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoHobby;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoHobby;
	protected JButton jButtonModificarToolBarEmpleadoHobby;
	protected JButton jButtonActualizarToolBarEmpleadoHobby;
    protected JButton jButtonEliminarToolBarEmpleadoHobby;
	protected JButton jButtonCancelarToolBarEmpleadoHobby;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoHobby;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoHobby;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoHobby;
	protected JButton jButtonCerrarToolBarEmpleadoHobby;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoHobby;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoHobby;
	protected JMenuItem jMenuItemModificarEmpleadoHobby;
	protected JMenuItem jMenuItemActualizarEmpleadoHobby;
    protected JMenuItem jMenuItemEliminarEmpleadoHobby;
	protected JMenuItem jMenuItemCancelarEmpleadoHobby;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoHobby;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoHobby;
	protected JMenuItem jMenuItemCerrarEmpleadoHobby;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoHobby;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoHobby;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoHobby;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoHobby;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoHobby;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoHobby;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoHobby;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoHobby;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoHobby;
	public JLabel jLabelIdEmpleadoHobby;
	public JLabel jLabelidEmpleadoHobby;
	public JButton jButtonidEmpleadoHobbyBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoHobby;
	public JLabel jLabelid_empresaEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoHobby;
	public JButton jButtonid_empresaEmpleadoHobby= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoHobbyUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoHobbyBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoHobby;
	public JLabel jLabelid_empleadoEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoHobby;
	public JButton jButtonid_empleadoEmpleadoHobby= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoHobbyUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoHobbyBusqueda= new JButtonMe();

	public JPanel jPanelid_hobbyEmpleadoHobby;
	public JLabel jLabelid_hobbyEmpleadoHobby;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_hobbyEmpleadoHobby;
	public JButton jButtonid_hobbyEmpleadoHobby= new JButtonMe();
	public JButton jButtonid_hobbyEmpleadoHobbyUpdate= new JButtonMe();
	public JButton jButtonid_hobbyEmpleadoHobbyBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoHobby;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoHobbyDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoHobby=new JPanel();
				this.jPanelAccionesFormularioEmpleadoHobby=new JPanel();
				this.jmenuBarDetalleEmpleadoHobby=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoHobby=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoHobbyDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHobbyDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoHobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoHobby() {
		return this.jButtonActualizarToolBarEmpleadoHobby;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoHobby() {
		return this.jButtonEliminarToolBarEmpleadoHobby;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoHobby() {
		return this.jButtonCancelarToolBarEmpleadoHobby;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoHobby() {
		return this.jButtonProcesarInformacionEmpleadoHobby;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoHobby)	{
		this.jButtonProcesarInformacionEmpleadoHobby = jButtonProcesarInformacionEmpleadoHobby;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoHobby() {
		return this.jComboBoxTiposAccionesEmpleadoHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoHobby(
			JComboBox jComboBoxTiposRelacionesEmpleadoHobby) {
		this.jComboBoxTiposRelacionesEmpleadoHobby = jComboBoxTiposRelacionesEmpleadoHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoHobby(
			JComboBox jComboBoxTiposAccionesEmpleadoHobby) {
		this.jComboBoxTiposAccionesEmpleadoHobby = jComboBoxTiposAccionesEmpleadoHobby;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoHobby() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoHobby;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoHobby(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoHobby) {
		this.jComboBoxTiposAccionesFormularioEmpleadoHobby = jComboBoxTiposAccionesFormularioEmpleadoHobby;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		
		this.empleadohobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadohobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadohobbySessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoHobbyJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Hobby MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoHobby= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoHobby=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoHobby=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoHobby,this.jTtoolBarDetalleEmpleadoHobby,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoHobby,this.jTtoolBarDetalleEmpleadoHobby,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoHobby,this.jTtoolBarDetalleEmpleadoHobby,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoHobby,this.jTtoolBarDetalleEmpleadoHobby,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoHobby=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoHobby=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoHobby=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoHobby=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoHobby=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoHobby= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoHobby.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoHobby,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoHobby= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoHobby.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoHobby,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoHobby= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoHobby.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoHobby,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoHobby= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoHobby.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoHobby,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoHobby= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoHobby.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoHobby,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoHobby= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoHobby.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoHobby,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoHobby= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoHobby.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoHobby,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoHobby= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoHobby.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoHobby,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoHobby,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoHobby,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoHobby.add(this.jMenuItemDetalleCerrarEmpleadoHobby);
		
		this.jmenuDetalleAccionesEmpleadoHobby.add(this.jMenuItemActualizarEmpleadoHobby);
		this.jmenuDetalleAccionesEmpleadoHobby.add(this.jMenuItemEliminarEmpleadoHobby);
		this.jmenuDetalleAccionesEmpleadoHobby.add(this.jMenuItemCancelarEmpleadoHobby);		
		
		//this.jmenuDetalleDatosEmpleadoHobby.add(this.jMenuItemDetalleAbrirOrderByEmpleadoHobby);				
		this.jmenuDetalleDatosEmpleadoHobby.add(this.jMenuItemDetalleMostarOcultarEmpleadoHobby);				
				
		//this.jmenuDetalleAccionesEmpleadoHobby.add(this.jMenuItemGuardarCambiosEmpleadoHobby);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoHobby.add(this.jmenuDetalleArchivoEmpleadoHobby);		
		this.jmenuBarDetalleEmpleadoHobby.add(this.jmenuDetalleAccionesEmpleadoHobby);		
		this.jmenuBarDetalleEmpleadoHobby.add(this.jmenuDetalleDatosEmpleadoHobby);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoHobby);				
	}
	
	
	public void inicializarElementosCamposEmpleadoHobby() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoHobby = new JLabelMe();
		jLabelIdEmpleadoHobby.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoHobby = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoHobby.setToolTipText(EmpleadoHobbyConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoHobby= new GridBagLayout();

		this.jPanelidEmpleadoHobby.setLayout(this.gridaBagLayoutEmpleadoHobby);

		jLabelidEmpleadoHobby = new JLabel();
		jLabelidEmpleadoHobby.setText("Id");

		jLabelidEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoHobby() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoHobby = new JLabelMe();
		this.jLabelid_empresaEmpleadoHobby.setText(""+EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoHobby.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoHobby.setToolTipText(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoHobby = new GridBagLayout();
		this.jPanelid_empresaEmpleadoHobby.setLayout(this.gridaBagLayoutEmpleadoHobby);


		jComboBoxid_empresaEmpleadoHobby= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoHobby.setEnabled(false);

		this.jButtonid_empresaEmpleadoHobby= new JButtonMe();
		this.jButtonid_empresaEmpleadoHobby.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoHobby.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoHobby.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoHobby.setText("Buscar");
		this.jButtonid_empresaEmpleadoHobby.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoHobby.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoHobby,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoHobby"));

		this.jButtonid_empresaEmpleadoHobbyBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoHobbyBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoHobbyBusqueda"));

		if(this.empleadohobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoHobbyBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoHobbyUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoHobbyUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHobbyUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHobbyUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoHobbyUpdate.setText("U");
		this.jButtonid_empresaEmpleadoHobbyUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoHobbyUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoHobbyUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoHobbyUpdate"));



					
		this.jLabelid_empleadoEmpleadoHobby = new JLabelMe();
		this.jLabelid_empleadoEmpleadoHobby.setText(""+EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoHobby.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoHobby.setToolTipText(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoHobby = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoHobby.setLayout(this.gridaBagLayoutEmpleadoHobby);


		jComboBoxid_empleadoEmpleadoHobby= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoHobby= new JButtonMe();
		this.jButtonid_empleadoEmpleadoHobby.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoHobby.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoHobby.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoHobby.setText("Buscar");
		this.jButtonid_empleadoEmpleadoHobby.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoHobby.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoHobby,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoHobby"));

		this.jButtonid_empleadoEmpleadoHobbyBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoHobbyBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoHobbyBusqueda"));

		if(this.empleadohobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoHobbyBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoHobbyUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoHobbyUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHobbyUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHobbyUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoHobbyUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoHobbyUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoHobbyUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoHobbyUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoHobbyUpdate"));



					
		this.jLabelid_hobbyEmpleadoHobby = new JLabelMe();
		this.jLabelid_hobbyEmpleadoHobby.setText(""+EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY+" : *");
		this.jLabelid_hobbyEmpleadoHobby.setToolTipText("Hobby");
		this.jLabelid_hobbyEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_hobbyEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_hobbyEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_hobbyEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_hobbyEmpleadoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_hobbyEmpleadoHobby.setToolTipText(EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY);
		this.gridaBagLayoutEmpleadoHobby = new GridBagLayout();
		this.jPanelid_hobbyEmpleadoHobby.setLayout(this.gridaBagLayoutEmpleadoHobby);


		jComboBoxid_hobbyEmpleadoHobby= new JComboBoxMe();
		jComboBoxid_hobbyEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_hobbyEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_hobbyEmpleadoHobby= new JButtonMe();
		this.jButtonid_hobbyEmpleadoHobby.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_hobbyEmpleadoHobby.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_hobbyEmpleadoHobby.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_hobbyEmpleadoHobby.setText("Buscar");
		this.jButtonid_hobbyEmpleadoHobby.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_hobbyEmpleadoHobby.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_hobbyEmpleadoHobby,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_hobbyEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_hobbyEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_hobbyEmpleadoHobby"));

		this.jButtonid_hobbyEmpleadoHobbyBusqueda= new JButtonMe();
		this.jButtonid_hobbyEmpleadoHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyEmpleadoHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyEmpleadoHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_hobbyEmpleadoHobbyBusqueda.setText("U");
		this.jButtonid_hobbyEmpleadoHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_hobbyEmpleadoHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_hobbyEmpleadoHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_hobbyEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_hobbyEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_hobbyEmpleadoHobbyBusqueda"));

		if(this.empleadohobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_hobbyEmpleadoHobbyBusqueda.setVisible(false);		}

		this.jButtonid_hobbyEmpleadoHobbyUpdate= new JButtonMe();
		this.jButtonid_hobbyEmpleadoHobbyUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyEmpleadoHobbyUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyEmpleadoHobbyUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_hobbyEmpleadoHobbyUpdate.setText("U");
		this.jButtonid_hobbyEmpleadoHobbyUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_hobbyEmpleadoHobbyUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_hobbyEmpleadoHobbyUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_hobbyEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_hobbyEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_hobbyEmpleadoHobbyUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoHobby = new EmpleadoHobbyBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Hobby DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoHobby= new GridBagLayout();
		

		
		String sToolTipEmpleadoHobby="";
		sToolTipEmpleadoHobby=EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoHobby+="(Nomina.EmpleadoHobby)";
		}
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoHobby+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoHobby = new JButtonMe();
		this.jButtonModificarEmpleadoHobby = new JButtonMe();
        this.jButtonActualizarEmpleadoHobby = new JButtonMe();
        this.jButtonEliminarEmpleadoHobby = new JButtonMe();
        this.jButtonCancelarEmpleadoHobby = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoHobby = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoHobby = new JButtonMe();
		this.jButtonCerrarEmpleadoHobby = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoHobby = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoHobby = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoHobby = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Hobby";
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Hobbyes" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoHobby.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoHobby.setName("jPanelCamposEmpleadoHobby"); 

		this.jPanelCamposOcultosEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoHobby.setName("jPanelCamposOcultosEmpleadoHobby"); 

        this.jPanelAccionesEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoHobby.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoHobby.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoHobby.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoHobby.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoHobby.setText("Nuevo");
		this.jButtonModificarEmpleadoHobby.setText("Editar");
        this.jButtonActualizarEmpleadoHobby.setText("Actualizar");
        this.jButtonEliminarEmpleadoHobby.setText("Eliminar");
        this.jButtonCancelarEmpleadoHobby.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoHobby.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoHobby.setText("Guardar");
		this.jButtonCerrarEmpleadoHobby.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoHobby,"nuevo_button","Nuevo",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoHobby,"modificar_button","Editar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoHobby,"actualizar_button","Actualizar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoHobby,"eliminar_button","Eliminar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoHobby,"cancelar_button","Cancelar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoHobby,"guardarcambios_button","Guardar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoHobby,"guardarcambiostabla_button","Guardar",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoHobby,"cerrar_button","Salir",this.empleadohobbySessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoHobby.setToolTipText("Nuevo"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoHobby.setToolTipText("Editar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoHobby.setToolTipText("Actualizar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoHobby.setToolTipText("Eliminar)"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoHobby.setToolTipText("Cancelar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoHobby.setToolTipText("Guardar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoHobby.setToolTipText("Guardar"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoHobby.setToolTipText("Salir"+" "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoHobby";
		inputMap = this.jButtonNuevoEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoHobby"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoHobby";
		inputMap = this.jButtonActualizarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoHobby"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoHobby";
		inputMap = this.jButtonEliminarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoHobby"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoHobby";
		inputMap = this.jButtonCancelarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoHobby"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoHobby";
		inputMap = this.jButtonCerrarEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoHobby"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoHobby";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoHobby"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoHobby = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoHobby.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoHobby.setToolTipText("Nuevo EmpleadoHobby");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoHobby = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoHobby.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoHobby.setToolTipText("Sin Cerrar Ventana EmpleadoHobby");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoHobby = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoHobby.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoHobby.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoHobby.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoHobby.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoHobby = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoHobby.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoHobby.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoHobby = new JLabelMe();
		
		this.jLabelAccionesEmpleadoHobby.setText("Acciones");		
		this.jLabelAccionesEmpleadoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoHobby();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoHobby();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoHobby=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoHobby.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoHobby.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoHobby.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoHobby, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoHobby = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoHobby = new GridBagLayout();
		
		this.jPanelCamposEmpleadoHobby.setLayout(gridaBagLayoutCamposEmpleadoHobby);
		this.jPanelCamposOcultosEmpleadoHobby.setLayout(gridaBagLayoutCamposOcultosEmpleadoHobby);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoHobby.add(jLabelIdEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 1;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoHobby.add(jLabelidEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);


	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoHobby.add(jLabelid_empresaEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 2;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
		this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoHobby.add(jButtonid_empresaEmpleadoHobbyBusqueda, this.gridBagConstraintsEmpleadoHobby);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 3;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
		this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoHobby.add(jButtonid_empresaEmpleadoHobbyUpdate, this.gridBagConstraintsEmpleadoHobby);
	}

	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 1;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoHobby.add(jComboBoxid_empresaEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);


	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoHobby.add(jLabelid_empleadoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 2;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmpleadoHobby.add(jButtonid_empleadoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 3;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
		this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoHobby.add(jButtonid_empleadoEmpleadoHobbyBusqueda, this.gridBagConstraintsEmpleadoHobby);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 4;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
		this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoHobby.add(jButtonid_empleadoEmpleadoHobbyUpdate, this.gridBagConstraintsEmpleadoHobby);
	}

	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 1;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoHobby.add(jComboBoxid_empleadoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);


	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_hobbyEmpleadoHobby.add(jLabelid_hobbyEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 2;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
		this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_hobbyEmpleadoHobby.add(jButtonid_hobbyEmpleadoHobbyBusqueda, this.gridBagConstraintsEmpleadoHobby);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = 3;
		this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
		this.gridBagConstraintsEmpleadoHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_hobbyEmpleadoHobby.add(jButtonid_hobbyEmpleadoHobbyUpdate, this.gridBagConstraintsEmpleadoHobby);
	}

	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHobby.gridy = 0;
	this.gridBagConstraintsEmpleadoHobby.gridx = 1;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_hobbyEmpleadoHobby.add(jComboBoxid_hobbyEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHobby.gridy = iYPanelCamposEmpleadoHobby;
	this.gridBagConstraintsEmpleadoHobby.gridx = iXPanelCamposEmpleadoHobby++;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHobby.add(this.jPanelidEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(iXPanelCamposEmpleadoHobby % 1==0) {
		iXPanelCamposEmpleadoHobby=0;
		iYPanelCamposEmpleadoHobby++;
	}
	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHobby.gridy = iYPanelCamposEmpleadoHobby;
	this.gridBagConstraintsEmpleadoHobby.gridx = iXPanelCamposEmpleadoHobby++;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHobby.add(this.jPanelid_empleadoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(iXPanelCamposEmpleadoHobby % 1==0) {
		iXPanelCamposEmpleadoHobby=0;
		iYPanelCamposEmpleadoHobby++;
	}
	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHobby.gridy = iYPanelCamposEmpleadoHobby;
	this.gridBagConstraintsEmpleadoHobby.gridx = iXPanelCamposEmpleadoHobby++;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHobby.add(this.jPanelid_hobbyEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(iXPanelCamposEmpleadoHobby % 1==0) {
		iXPanelCamposEmpleadoHobby=0;
		iYPanelCamposEmpleadoHobby++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHobby.gridy = iYPanelCamposOcultosEmpleadoHobby;
	this.gridBagConstraintsEmpleadoHobby.gridx = iXPanelCamposOcultosEmpleadoHobby++;
	this.gridBagConstraintsEmpleadoHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoHobby.add(this.jPanelid_empresaEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);



	if(iXPanelCamposOcultosEmpleadoHobby % 1==0) {
		iXPanelCamposOcultosEmpleadoHobby=0;
		iYPanelCamposOcultosEmpleadoHobby++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoHobby= new GridBagLayout();
		this.jPanelAccionesEmpleadoHobby.setLayout(gridaBagLayoutAccionesEmpleadoHobby);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoHobby= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoHobby.setLayout(gridaBagLayoutAccionesFormularioEmpleadoHobby);
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoHobby.add(this.jComboBoxTiposAccionesFormularioEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoHobby.add(this.jCheckBoxPostAccionNuevoEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoHobby.add(this.jCheckBoxPostAccionSinCerrarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoHobby.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoHobby.add(this.jCheckBoxPostAccionSinMensajeEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoHobby.add(this.jButtonModificarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);							

		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;
		this.gridBagConstraintsEmpleadoHobby.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoHobby.add(this.jButtonEliminarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
			
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoHobby.add(this.jButtonActualizarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);


		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;		
		this.gridBagConstraintsEmpleadoHobby.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoHobby.add(this.jButtonGuardarCambiosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);	
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = 0;		
		this.gridBagConstraintsEmpleadoHobby.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoHobby.add(this.jButtonCancelarEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoHobby = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoHobby);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;		
			//this.gridBagConstraintsEmpleadoHobby.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoHobby.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoHobby.gridx =0;
		this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoHobby.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoHobby = new EmpleadoHobbyBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Hobby DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Hobby DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Hobby Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoHobbyModel empleadohobbyModel=new EmpleadoHobbyModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoHobbyModel.EmpleadoHobbyFocusTraversalPolicy empleadohobbyFocusTraversalPolicy = empleadohobbyModel.new EmpleadoHobbyFocusTraversalPolicy(this);
			
			//empleadohobbyFocusTraversalPolicy.setempleadohobbyJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadohobbyModel);
			
			
			this.jContentPaneDetalleEmpleadoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoHobby = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoHobby.setLayout(gridaBagLayoutDetalleEmpleadoHobby);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoHobby = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoHobby.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoHobby.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoHobby.add(jTtoolBarDetalleEmpleadoHobby, gridBagConstraintsEmpleadoHobby);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoHobby=   new JScrollPane(jContentPaneDetalleEmpleadoHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoHobby=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoHobby.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoHobby.add(jPanelCamposEmpleadoHobby, gridBagConstraintsEmpleadoHobby);
			
			
			
			
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
						&& empleadohobbySessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoHobby= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoHobby.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoHobby.gridx = 0;
						this.jContentPaneDetalleEmpleadoHobby.add(this.jTabbedPaneRelacionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoHobby.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoHobby.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoHobby.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoHobby.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoHobby.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoHobby.add(jPanelCamposOcultosEmpleadoHobby, gridBagConstraintsEmpleadoHobby);
				
					this.jPanelCamposOcultosEmpleadoHobby.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	        this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoHobby.add(this.jPanelAccionesFormularioEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);							
			
			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoHobby.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoHobby.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoHobby.add(this.jPanelAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoHobby);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoHobby=   new JScrollPane(this.jPanelCamposEmpleadoHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;
			this.gridBagConstraintsEmpleadoHobby.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoHobby.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoHobby.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);			
			
			this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHobby.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoHobby.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
			
			
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		
			
		this.gridBagConstraintsEmpleadoHobby = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHobby.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHobby.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoHobby, this.gridBagConstraintsEmpleadoHobby);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoHobby;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoHobby;
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
