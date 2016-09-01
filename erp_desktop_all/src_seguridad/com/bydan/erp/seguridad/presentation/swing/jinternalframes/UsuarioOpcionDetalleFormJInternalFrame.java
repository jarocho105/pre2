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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.UsuarioOpcionConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class UsuarioOpcionDetalleFormJInternalFrame extends UsuarioOpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUsuarioOpcion;
	
	protected JMenuBar jmenuBarDetalleUsuarioOpcion;
	
	protected JMenu jmenuDetalleUsuarioOpcion;
	protected JMenu jmenuDetalleArchivoUsuarioOpcion;
	protected JMenu jmenuDetalleAccionesUsuarioOpcion;
	protected JMenu jmenuDetalleDatosUsuarioOpcion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUsuarioOpcion;	
	protected GridBagConstraints gridBagConstraintsUsuarioOpcion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UsuarioOpcionBeanSwingJInternalFrameAdditional jInternalFrameDetalleUsuarioOpcion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoopcion="";

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public UsuarioOpcionSessionBean usuarioopcionSessionBean;
	
	
	
	
	public SistemaSessionBean sistemaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	public OpcionSessionBean opcionSessionBean;
	public PerfilSessionBean perfilSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public UsuarioOpcionLogic usuarioopcionLogic;
	
	public JScrollPane jScrollPanelDatosUsuarioOpcion;
	public JScrollPane jScrollPanelDatosEdicionUsuarioOpcion;
	public JScrollPane jScrollPanelDatosGeneralUsuarioOpcion;
	
	protected JPanel jPanelCamposUsuarioOpcion;    
	protected JPanel jPanelCamposOcultosUsuarioOpcion;    	
	protected JPanel jPanelAccionesUsuarioOpcion;
	protected JPanel jPanelAccionesFormularioUsuarioOpcion;
    
	
	
	protected Integer iXPanelCamposUsuarioOpcion=0;
	protected Integer iYPanelCamposUsuarioOpcion=0;
	
	protected Integer iXPanelCamposOcultosUsuarioOpcion=0;
	protected Integer iYPanelCamposOcultosUsuarioOpcion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUsuarioOpcion;
	public JButton jButtonModificarUsuarioOpcion;
	public JButton jButtonActualizarUsuarioOpcion;
    public JButton jButtonEliminarUsuarioOpcion;
	public JButton jButtonCancelarUsuarioOpcion;
    public JButton jButtonGuardarCambiosUsuarioOpcion;
	public JButton jButtonGuardarCambiosTablaUsuarioOpcion;
	protected JButton jButtonCerrarUsuarioOpcion;
	
	
	protected JButton jButtonProcesarInformacionUsuarioOpcion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUsuarioOpcion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUsuarioOpcion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUsuarioOpcion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUsuarioOpcion;
	protected JButton jButtonModificarToolBarUsuarioOpcion;
	protected JButton jButtonActualizarToolBarUsuarioOpcion;
    protected JButton jButtonEliminarToolBarUsuarioOpcion;
	protected JButton jButtonCancelarToolBarUsuarioOpcion;
    protected JButton jButtonGuardarCambiosToolBarUsuarioOpcion;
	protected JButton jButtonGuardarCambiosTablaToolBarUsuarioOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarUsuarioOpcion;
	protected JButton jButtonCerrarToolBarUsuarioOpcion;
	
	protected JButton jButtonProcesarInformacionToolBarUsuarioOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUsuarioOpcion;
	protected JMenuItem jMenuItemModificarUsuarioOpcion;
	protected JMenuItem jMenuItemActualizarUsuarioOpcion;
    protected JMenuItem jMenuItemEliminarUsuarioOpcion;
	protected JMenuItem jMenuItemCancelarUsuarioOpcion;
    protected JMenuItem jMenuItemGuardarCambiosUsuarioOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaUsuarioOpcion;
	protected JMenuItem jMenuItemCerrarUsuarioOpcion;
	protected JMenuItem jMenuItemDetalleCerrarUsuarioOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarUsuarioOpcion;
	
	protected JMenuItem jMenuItemProcesarInformacionUsuarioOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUsuarioOpcion;
	protected JMenuItem jMenuItemMostrarOcultarUsuarioOpcion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUsuarioOpcion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUsuarioOpcion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUsuarioOpcion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUsuarioOpcion;
	public JLabel jLabelIdUsuarioOpcion;
	public JLabel jLabelidUsuarioOpcion;
	public JButton jButtonidUsuarioOpcionBusqueda= new JButtonMe();

	public JPanel jPanelcon_precargarUsuarioOpcion;
	public JLabel jLabelcon_precargarUsuarioOpcion;
	public JCheckBox jCheckBoxcon_precargarUsuarioOpcion;
	public JButton jButtoncon_precargarUsuarioOpcionBusqueda= new JButtonMe();

	public JPanel jPanelestadoUsuarioOpcion;
	public JLabel jLabelestadoUsuarioOpcion;
	public JCheckBox jCheckBoxestadoUsuarioOpcion;
	public JButton jButtonestadoUsuarioOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaUsuarioOpcion;
	public JLabel jLabelid_sistemaUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaUsuarioOpcion;
	public JButton jButtonid_sistemaUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_sistemaUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaUsuarioOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloUsuarioOpcion;
	public JLabel jLabelid_moduloUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloUsuarioOpcion;
	public JButton jButtonid_moduloUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_moduloUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloUsuarioOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_opcionUsuarioOpcion;
	public JLabel jLabelid_grupo_opcionUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionUsuarioOpcion;
	public JButton jButtonid_grupo_opcionUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionUsuarioOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_opcionUsuarioOpcion;
	public JLabel jLabelid_opcionUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionUsuarioOpcion;
	public JButton jButtonid_opcionUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_opcionUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_opcionUsuarioOpcionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionUsuarioOpcionArbol= new JButtonMe();

	public JPanel jPanelid_perfilUsuarioOpcion;
	public JLabel jLabelid_perfilUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilUsuarioOpcion;
	public JButton jButtonid_perfilUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_perfilUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_perfilUsuarioOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioUsuarioOpcion;
	public JLabel jLabelid_usuarioUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioUsuarioOpcion;
	public JButton jButtonid_usuarioUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_usuarioUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_usuarioUsuarioOpcionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUsuarioOpcion;
	
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
	
	public UsuarioOpcionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUsuarioOpcion=new JPanel();
				this.jPanelAccionesFormularioUsuarioOpcion=new JPanel();
				this.jmenuBarDetalleUsuarioOpcion=new JMenuBar();
				this.jTtoolBarDetalleUsuarioOpcion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UsuarioOpcionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUsuarioOpcion() {
		return this.jButtonActualizarToolBarUsuarioOpcion;
	}
	
	public JButton getjButtonEliminarToolBarUsuarioOpcion() {
		return this.jButtonEliminarToolBarUsuarioOpcion;
	}
	
	public JButton getjButtonCancelarToolBarUsuarioOpcion() {
		return this.jButtonCancelarToolBarUsuarioOpcion;
	}		
	
	public JButton getjButtonProcesarInformacionUsuarioOpcion() {
		return this.jButtonProcesarInformacionUsuarioOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUsuarioOpcion)	{
		this.jButtonProcesarInformacionUsuarioOpcion = jButtonProcesarInformacionUsuarioOpcion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUsuarioOpcion() {
		return this.jComboBoxTiposAccionesUsuarioOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUsuarioOpcion(
			JComboBox jComboBoxTiposRelacionesUsuarioOpcion) {
		this.jComboBoxTiposRelacionesUsuarioOpcion = jComboBoxTiposRelacionesUsuarioOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUsuarioOpcion(
			JComboBox jComboBoxTiposAccionesUsuarioOpcion) {
		this.jComboBoxTiposAccionesUsuarioOpcion = jComboBoxTiposAccionesUsuarioOpcion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUsuarioOpcion() {
		return this.jComboBoxTiposAccionesFormularioUsuarioOpcion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUsuarioOpcion(
			JComboBox jComboBoxTiposAccionesFormularioUsuarioOpcion) {
		this.jComboBoxTiposAccionesFormularioUsuarioOpcion = jComboBoxTiposAccionesFormularioUsuarioOpcion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		
		this.usuarioopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.usuarioopcionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UsuarioOpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuario Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
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
	
		UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUsuarioOpcion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUsuarioOpcion=new JButtonMe();
				this.jButtonModificarToolBarUsuarioOpcion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUsuarioOpcion,this.jTtoolBarDetalleUsuarioOpcion,
							"actualizar","actualizar","Actualizar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUsuarioOpcion,this.jTtoolBarDetalleUsuarioOpcion,
							"eliminar","eliminar","Eliminar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUsuarioOpcion,this.jTtoolBarDetalleUsuarioOpcion,
							"cancelar","cancelar","Cancelar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUsuarioOpcion,this.jTtoolBarDetalleUsuarioOpcion,
							"guardarcambios","guardarcambios","Guardar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUsuarioOpcion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUsuarioOpcion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUsuarioOpcion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUsuarioOpcion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUsuarioOpcion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUsuarioOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUsuarioOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUsuarioOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUsuarioOpcion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUsuarioOpcion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUsuarioOpcion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUsuarioOpcion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUsuarioOpcion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUsuarioOpcion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUsuarioOpcion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUsuarioOpcion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUsuarioOpcion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUsuarioOpcion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUsuarioOpcion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUsuarioOpcion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUsuarioOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUsuarioOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUsuarioOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUsuarioOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUsuarioOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUsuarioOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUsuarioOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUsuarioOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUsuarioOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUsuarioOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUsuarioOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUsuarioOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUsuarioOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUsuarioOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUsuarioOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUsuarioOpcion.add(this.jMenuItemDetalleCerrarUsuarioOpcion);
		
		this.jmenuDetalleAccionesUsuarioOpcion.add(this.jMenuItemActualizarUsuarioOpcion);
		this.jmenuDetalleAccionesUsuarioOpcion.add(this.jMenuItemEliminarUsuarioOpcion);
		this.jmenuDetalleAccionesUsuarioOpcion.add(this.jMenuItemCancelarUsuarioOpcion);		
		
		//this.jmenuDetalleDatosUsuarioOpcion.add(this.jMenuItemDetalleAbrirOrderByUsuarioOpcion);				
		this.jmenuDetalleDatosUsuarioOpcion.add(this.jMenuItemDetalleMostarOcultarUsuarioOpcion);				
				
		//this.jmenuDetalleAccionesUsuarioOpcion.add(this.jMenuItemGuardarCambiosUsuarioOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUsuarioOpcion.add(this.jmenuDetalleArchivoUsuarioOpcion);		
		this.jmenuBarDetalleUsuarioOpcion.add(this.jmenuDetalleAccionesUsuarioOpcion);		
		this.jmenuBarDetalleUsuarioOpcion.add(this.jmenuDetalleDatosUsuarioOpcion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUsuarioOpcion);				
	}
	
	
	public void inicializarElementosCamposUsuarioOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUsuarioOpcion = new JLabelMe();
		jLabelIdUsuarioOpcion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUsuarioOpcion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUsuarioOpcion= new GridBagLayout();

		this.jPanelidUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);

		jLabelidUsuarioOpcion = new JLabel();
		jLabelidUsuarioOpcion.setText("Id");

		jLabelidUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_precargarUsuarioOpcion = new JLabelMe();
		this.jLabelcon_precargarUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR+" : *");
		this.jLabelcon_precargarUsuarioOpcion.setToolTipText("Con Precargar");
		this.jLabelcon_precargarUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_precargarUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_precargarUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precargarUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precargarUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precargarUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelcon_precargarUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jCheckBoxcon_precargarUsuarioOpcion= new JCheckBoxMe();
		jCheckBoxcon_precargarUsuarioOpcion.setEnabled(false);

		jCheckBoxcon_precargarUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargarUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargarUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precargarUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precargarUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtoncon_precargarUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargarUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargarUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precargarUsuarioOpcionBusqueda.setText("U");
		this.jButtoncon_precargarUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precargarUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precargarUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precargarUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precargarUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precargarUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precargarUsuarioOpcionBusqueda.setVisible(false);		}


					
		this.jLabelestadoUsuarioOpcion = new JLabelMe();
		this.jLabelestadoUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoUsuarioOpcion.setToolTipText("Estado");
		this.jLabelestadoUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelestadoUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jCheckBoxestadoUsuarioOpcion= new JCheckBoxMe();
		jCheckBoxestadoUsuarioOpcion.setEnabled(false);

		jCheckBoxestadoUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonestadoUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoUsuarioOpcionBusqueda.setText("U");
		this.jButtonestadoUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoUsuarioOpcionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUsuarioOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_sistemaUsuarioOpcion = new JLabelMe();
		this.jLabelid_sistemaUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA+" : *");
		this.jLabelid_sistemaUsuarioOpcion.setToolTipText("Sistema");
		this.jLabelid_sistemaUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sistemaUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sistemaUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelid_sistemaUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jComboBoxid_sistemaUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_sistemaUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sistemaUsuarioOpcion= new JButtonMe();
		this.jButtonid_sistemaUsuarioOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaUsuarioOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaUsuarioOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaUsuarioOpcion.setText("Buscar");
		this.jButtonid_sistemaUsuarioOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sistemaUsuarioOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaUsuarioOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sistemaUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaUsuarioOpcion"));

		this.jButtonid_sistemaUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonid_sistemaUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaUsuarioOpcionBusqueda.setText("U");
		this.jButtonid_sistemaUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sistemaUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sistemaUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sistemaUsuarioOpcionBusqueda.setVisible(false);		}

		this.jButtonid_sistemaUsuarioOpcionUpdate= new JButtonMe();
		this.jButtonid_sistemaUsuarioOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaUsuarioOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaUsuarioOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaUsuarioOpcionUpdate.setText("U");
		this.jButtonid_sistemaUsuarioOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sistemaUsuarioOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaUsuarioOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sistemaUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaUsuarioOpcionUpdate"));



					
		this.jLabelid_moduloUsuarioOpcion = new JLabelMe();
		this.jLabelid_moduloUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloUsuarioOpcion.setToolTipText("Modulo");
		this.jLabelid_moduloUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelid_moduloUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jComboBoxid_moduloUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_moduloUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloUsuarioOpcion= new JButtonMe();
		this.jButtonid_moduloUsuarioOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloUsuarioOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloUsuarioOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloUsuarioOpcion.setText("Buscar");
		this.jButtonid_moduloUsuarioOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloUsuarioOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloUsuarioOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloUsuarioOpcion"));

		this.jButtonid_moduloUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonid_moduloUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloUsuarioOpcionBusqueda.setText("U");
		this.jButtonid_moduloUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloUsuarioOpcionBusqueda.setVisible(false);		}

		this.jButtonid_moduloUsuarioOpcionUpdate= new JButtonMe();
		this.jButtonid_moduloUsuarioOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloUsuarioOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloUsuarioOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloUsuarioOpcionUpdate.setText("U");
		this.jButtonid_moduloUsuarioOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloUsuarioOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloUsuarioOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloUsuarioOpcionUpdate"));



					
		this.jLabelid_grupo_opcionUsuarioOpcion = new JLabelMe();
		this.jLabelid_grupo_opcionUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION+" : *");
		this.jLabelid_grupo_opcionUsuarioOpcion.setToolTipText("Grupo Opcion");
		this.jLabelid_grupo_opcionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_opcionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_opcionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_opcionUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_opcionUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelid_grupo_opcionUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jComboBoxid_grupo_opcionUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_opcionUsuarioOpcion= new JButtonMe();
		this.jButtonid_grupo_opcionUsuarioOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionUsuarioOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionUsuarioOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionUsuarioOpcion.setText("Buscar");
		this.jButtonid_grupo_opcionUsuarioOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_opcionUsuarioOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionUsuarioOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionUsuarioOpcion"));

		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setText("U");
		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_opcionUsuarioOpcionBusqueda.setVisible(false);		}

		this.jButtonid_grupo_opcionUsuarioOpcionUpdate= new JButtonMe();
		this.jButtonid_grupo_opcionUsuarioOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionUsuarioOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionUsuarioOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_opcionUsuarioOpcionUpdate.setText("U");
		this.jButtonid_grupo_opcionUsuarioOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_opcionUsuarioOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionUsuarioOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionUsuarioOpcionUpdate"));



					
		this.jLabelid_opcionUsuarioOpcion = new JLabelMe();
		this.jLabelid_opcionUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_IDOPCION+" : *");
		this.jLabelid_opcionUsuarioOpcion.setToolTipText("Opcion");
		this.jLabelid_opcionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_opcionUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_opcionUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_opcionUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_IDOPCION);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelid_opcionUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jComboBoxid_opcionUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_opcionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_opcionUsuarioOpcion= new JButtonMe();
		this.jButtonid_opcionUsuarioOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionUsuarioOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionUsuarioOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionUsuarioOpcion.setText("Buscar");
		this.jButtonid_opcionUsuarioOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_opcionUsuarioOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionUsuarioOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionUsuarioOpcion"));

		this.jButtonid_opcionUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonid_opcionUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionUsuarioOpcionBusqueda.setText("U");
		this.jButtonid_opcionUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_opcionUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_opcionUsuarioOpcionBusqueda.setVisible(false);		}

		this.jButtonid_opcionUsuarioOpcionUpdate= new JButtonMe();
		this.jButtonid_opcionUsuarioOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionUsuarioOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionUsuarioOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionUsuarioOpcionUpdate.setText("U");
		this.jButtonid_opcionUsuarioOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_opcionUsuarioOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionUsuarioOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionUsuarioOpcionUpdate"));


		jButtonid_opcionUsuarioOpcionArbol= new JButtonMe();
		jButtonid_opcionUsuarioOpcionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionUsuarioOpcionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionUsuarioOpcionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionUsuarioOpcionArbol.setText("Arbol");
		jButtonid_opcionUsuarioOpcionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_opcionUsuarioOpcionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionUsuarioOpcionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_opcionUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionUsuarioOpcionArbol"));



					
		this.jLabelid_perfilUsuarioOpcion = new JLabelMe();
		this.jLabelid_perfilUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL+" : *");
		this.jLabelid_perfilUsuarioOpcion.setToolTipText("Perfil");
		this.jLabelid_perfilUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_perfilUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_perfilUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_perfilUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelid_perfilUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jComboBoxid_perfilUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_perfilUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_perfilUsuarioOpcion= new JButtonMe();
		this.jButtonid_perfilUsuarioOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilUsuarioOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilUsuarioOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilUsuarioOpcion.setText("Buscar");
		this.jButtonid_perfilUsuarioOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_perfilUsuarioOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilUsuarioOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_perfilUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilUsuarioOpcion"));

		this.jButtonid_perfilUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonid_perfilUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilUsuarioOpcionBusqueda.setText("U");
		this.jButtonid_perfilUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_perfilUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_perfilUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_perfilUsuarioOpcionBusqueda.setVisible(false);		}

		this.jButtonid_perfilUsuarioOpcionUpdate= new JButtonMe();
		this.jButtonid_perfilUsuarioOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilUsuarioOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilUsuarioOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilUsuarioOpcionUpdate.setText("U");
		this.jButtonid_perfilUsuarioOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_perfilUsuarioOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilUsuarioOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_perfilUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilUsuarioOpcionUpdate"));



					
		this.jLabelid_usuarioUsuarioOpcion = new JLabelMe();
		this.jLabelid_usuarioUsuarioOpcion.setText(""+UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioUsuarioOpcion.setToolTipText("Usuario");
		this.jLabelid_usuarioUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioUsuarioOpcion.setToolTipText(UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		this.jPanelid_usuarioUsuarioOpcion.setLayout(this.gridaBagLayoutUsuarioOpcion);


		jComboBoxid_usuarioUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_usuarioUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_usuarioUsuarioOpcion= new JButtonMe();
		this.jButtonid_usuarioUsuarioOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioUsuarioOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioUsuarioOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioUsuarioOpcion.setText("Buscar");
		this.jButtonid_usuarioUsuarioOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioUsuarioOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioUsuarioOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioUsuarioOpcion"));

		this.jButtonid_usuarioUsuarioOpcionBusqueda= new JButtonMe();
		this.jButtonid_usuarioUsuarioOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioUsuarioOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioUsuarioOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioUsuarioOpcionBusqueda.setText("U");
		this.jButtonid_usuarioUsuarioOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioUsuarioOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioUsuarioOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioUsuarioOpcionBusqueda"));

		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioUsuarioOpcionBusqueda.setVisible(false);		}

		this.jButtonid_usuarioUsuarioOpcionUpdate= new JButtonMe();
		this.jButtonid_usuarioUsuarioOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioUsuarioOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioUsuarioOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioUsuarioOpcionUpdate.setText("U");
		this.jButtonid_usuarioUsuarioOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioUsuarioOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioUsuarioOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioUsuarioOpcionUpdate"));



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
		//this.jInternalFrameDetalleUsuarioOpcion = new UsuarioOpcionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Usuario Opcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUsuarioOpcion= new GridBagLayout();
		

		
		String sToolTipUsuarioOpcion="";
		sToolTipUsuarioOpcion=UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUsuarioOpcion+="(Seguridad.UsuarioOpcion)";
		}
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipUsuarioOpcion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUsuarioOpcion = new JButtonMe();
		this.jButtonModificarUsuarioOpcion = new JButtonMe();
        this.jButtonActualizarUsuarioOpcion = new JButtonMe();
        this.jButtonEliminarUsuarioOpcion = new JButtonMe();
        this.jButtonCancelarUsuarioOpcion = new JButtonMe();
        this.jButtonGuardarCambiosUsuarioOpcion = new JButtonMe();
		this.jButtonGuardarCambiosTablaUsuarioOpcion = new JButtonMe();
		this.jButtonCerrarUsuarioOpcion = new JButtonMe();
		
		this.jScrollPanelDatosUsuarioOpcion = new JScrollPane();   
        this.jScrollPanelDatosEdicionUsuarioOpcion = new JScrollPane();
		this.jScrollPanelDatosGeneralUsuarioOpcion = new JScrollPane();
				
		
		
		this.jPanelCamposUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Usuario Opcion";
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario Opciones" + this.sPath));
		} else {
			this.jScrollPanelDatosUsuarioOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUsuarioOpcion.setName("jPanelCamposUsuarioOpcion"); 

		this.jPanelCamposOcultosUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUsuarioOpcion.setName("jPanelCamposOcultosUsuarioOpcion"); 

        this.jPanelAccionesUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUsuarioOpcion.setToolTipText("Acciones");
        this.jPanelAccionesUsuarioOpcion.setName("Acciones"); 

		this.jPanelAccionesFormularioUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUsuarioOpcion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUsuarioOpcion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUsuarioOpcion.setText("Nuevo");
		this.jButtonModificarUsuarioOpcion.setText("Editar");
        this.jButtonActualizarUsuarioOpcion.setText("Actualizar");
        this.jButtonEliminarUsuarioOpcion.setText("Eliminar");
        this.jButtonCancelarUsuarioOpcion.setText("Cancelar");
        this.jButtonGuardarCambiosUsuarioOpcion.setText("Guardar");
		this.jButtonGuardarCambiosTablaUsuarioOpcion.setText("Guardar");
		this.jButtonCerrarUsuarioOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUsuarioOpcion,"nuevo_button","Nuevo",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUsuarioOpcion,"modificar_button","Editar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUsuarioOpcion,"actualizar_button","Actualizar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUsuarioOpcion,"eliminar_button","Eliminar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUsuarioOpcion,"cancelar_button","Cancelar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUsuarioOpcion,"guardarcambios_button","Guardar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUsuarioOpcion,"guardarcambiostabla_button","Guardar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUsuarioOpcion,"cerrar_button","Salir",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUsuarioOpcion.setToolTipText("Nuevo"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUsuarioOpcion.setToolTipText("Editar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUsuarioOpcion.setToolTipText("Actualizar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUsuarioOpcion.setToolTipText("Eliminar)"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUsuarioOpcion.setToolTipText("Cancelar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUsuarioOpcion.setToolTipText("Guardar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUsuarioOpcion.setToolTipText("Guardar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUsuarioOpcion.setToolTipText("Salir"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUsuarioOpcion";
		inputMap = this.jButtonNuevoUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUsuarioOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUsuarioOpcion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUsuarioOpcion";
		inputMap = this.jButtonActualizarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUsuarioOpcion"));
		
		//ELIMINAR
		sMapKey = "EliminarUsuarioOpcion";
		inputMap = this.jButtonEliminarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUsuarioOpcion"));
		
		//CANCELAR	
		sMapKey = "CancelarUsuarioOpcion";
		inputMap = this.jButtonCancelarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUsuarioOpcion"));
		
		//CERRAR		
		sMapKey = "CerrarUsuarioOpcion";
		inputMap = this.jButtonCerrarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUsuarioOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUsuarioOpcion";
		inputMap = this.jButtonGuardarCambiosTablaUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUsuarioOpcion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUsuarioOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUsuarioOpcion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUsuarioOpcion.setToolTipText("Nuevo UsuarioOpcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUsuarioOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUsuarioOpcion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUsuarioOpcion.setToolTipText("Sin Cerrar Ventana UsuarioOpcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUsuarioOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUsuarioOpcion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUsuarioOpcion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUsuarioOpcion.setText("Accion");
		this.jComboBoxTiposAccionesUsuarioOpcion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUsuarioOpcion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUsuarioOpcion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUsuarioOpcion = new JLabelMe();
		
		this.jLabelAccionesUsuarioOpcion.setText("Acciones");		
		this.jLabelAccionesUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUsuarioOpcion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUsuarioOpcion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUsuarioOpcion=new JTabbedPane();
		this.jTabbedPaneRelacionesUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUsuarioOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuarioOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuarioOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUsuarioOpcion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUsuarioOpcion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUsuarioOpcion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUsuarioOpcion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUsuarioOpcion = new GridBagLayout();
		
		this.jPanelCamposUsuarioOpcion.setLayout(gridaBagLayoutCamposUsuarioOpcion);
		this.jPanelCamposOcultosUsuarioOpcion.setLayout(gridaBagLayoutCamposOcultosUsuarioOpcion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUsuarioOpcion.add(jLabelIdUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUsuarioOpcion.add(jLabelidUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sistemaUsuarioOpcion.add(jLabelid_sistemaUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaUsuarioOpcion.add(jButtonid_sistemaUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 3;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaUsuarioOpcion.add(jButtonid_sistemaUsuarioOpcionUpdate, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sistemaUsuarioOpcion.add(jComboBoxid_sistemaUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloUsuarioOpcion.add(jLabelid_moduloUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloUsuarioOpcion.add(jButtonid_moduloUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 3;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloUsuarioOpcion.add(jButtonid_moduloUsuarioOpcionUpdate, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloUsuarioOpcion.add(jComboBoxid_moduloUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_opcionUsuarioOpcion.add(jLabelid_grupo_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_opcionUsuarioOpcion.add(jButtonid_grupo_opcionUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 3;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_opcionUsuarioOpcion.add(jButtonid_grupo_opcionUsuarioOpcionUpdate, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_opcionUsuarioOpcion.add(jComboBoxid_grupo_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_opcionUsuarioOpcion.add(jLabelid_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 2;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_opcionUsuarioOpcion.add(jButtonid_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 3;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_opcionUsuarioOpcion.add(jButtonid_opcionUsuarioOpcionArbol, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 4;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionUsuarioOpcion.add(jButtonid_opcionUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 5;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionUsuarioOpcion.add(jButtonid_opcionUsuarioOpcionUpdate, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_opcionUsuarioOpcion.add(jComboBoxid_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_perfilUsuarioOpcion.add(jLabelid_perfilUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilUsuarioOpcion.add(jButtonid_perfilUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 3;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilUsuarioOpcion.add(jButtonid_perfilUsuarioOpcionUpdate, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_perfilUsuarioOpcion.add(jComboBoxid_perfilUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioUsuarioOpcion.add(jLabelid_usuarioUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioUsuarioOpcion.add(jButtonid_usuarioUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 3;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioUsuarioOpcion.add(jButtonid_usuarioUsuarioOpcionUpdate, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioUsuarioOpcion.add(jComboBoxid_usuarioUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_precargarUsuarioOpcion.add(jLabelcon_precargarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precargarUsuarioOpcion.add(jButtoncon_precargarUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_precargarUsuarioOpcion.add(jCheckBoxcon_precargarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoUsuarioOpcion.add(jLabelestadoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 2;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
		this.gridBagConstraintsUsuarioOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoUsuarioOpcion.add(jButtonestadoUsuarioOpcionBusqueda, this.gridBagConstraintsUsuarioOpcion);
	}

	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuarioOpcion.gridy = 0;
	this.gridBagConstraintsUsuarioOpcion.gridx = 1;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoUsuarioOpcion.add(jCheckBoxestadoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelidUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelid_sistemaUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelid_moduloUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelid_grupo_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelid_opcionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelid_perfilUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelid_usuarioUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelcon_precargarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
	}
	this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuarioOpcion.gridy = iYPanelCamposUsuarioOpcion;
	this.gridBagConstraintsUsuarioOpcion.gridx = iXPanelCamposUsuarioOpcion++;
	this.gridBagConstraintsUsuarioOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuarioOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuarioOpcion.add(this.jPanelestadoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);



	if(iXPanelCamposUsuarioOpcion % 1==0) {
		iXPanelCamposUsuarioOpcion=0;
		iYPanelCamposUsuarioOpcion++;
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
			
		GridBagLayout gridaBagLayoutAccionesUsuarioOpcion= new GridBagLayout();
		this.jPanelAccionesUsuarioOpcion.setLayout(gridaBagLayoutAccionesUsuarioOpcion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUsuarioOpcion= new GridBagLayout();
		this.jPanelAccionesFormularioUsuarioOpcion.setLayout(gridaBagLayoutAccionesFormularioUsuarioOpcion);
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUsuarioOpcion.add(this.jComboBoxTiposAccionesFormularioUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUsuarioOpcion.add(this.jCheckBoxPostAccionNuevoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUsuarioOpcion.add(this.jCheckBoxPostAccionSinCerrarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUsuarioOpcion.add(this.jCheckBoxPostAccionSinMensajeUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccion++;
			
		this.jPanelAccionesUsuarioOpcion.add(this.jButtonModificarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);							

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx =iPosXAccion++;
			
		this.jPanelAccionesUsuarioOpcion.add(this.jButtonEliminarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
			
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesUsuarioOpcion.add(this.jButtonActualizarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);


		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesUsuarioOpcion.add(this.jButtonGuardarCambiosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);	
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;		
		this.gridBagConstraintsUsuarioOpcion.gridx =iPosXAccion++;
		
		this.jPanelAccionesUsuarioOpcion.add(this.jButtonCancelarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUsuarioOpcion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();						
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;		
			//this.gridBagConstraintsUsuarioOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUsuarioOpcion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUsuarioOpcion.gridx =0;
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUsuarioOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUsuarioOpcion = new UsuarioOpcionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Usuario Opcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Usuario Opcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuario Opcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UsuarioOpcionModel usuarioopcionModel=new UsuarioOpcionModel(this);
			
			//SI USARA CLASE INTERNA
			//UsuarioOpcionModel.UsuarioOpcionFocusTraversalPolicy usuarioopcionFocusTraversalPolicy = usuarioopcionModel.new UsuarioOpcionFocusTraversalPolicy(this);
			
			//usuarioopcionFocusTraversalPolicy.setusuarioopcionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(usuarioopcionModel);
			
			
			this.jContentPaneDetalleUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUsuarioOpcion = new GridBagLayout();	
			this.jContentPaneDetalleUsuarioOpcion.setLayout(gridaBagLayoutDetalleUsuarioOpcion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUsuarioOpcion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
				this.gridBagConstraintsUsuarioOpcion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUsuarioOpcion.gridx = 0;
					
				
				this.jContentPaneDetalleUsuarioOpcion.add(jTtoolBarDetalleUsuarioOpcion, gridBagConstraintsUsuarioOpcion);								
				
}
			
			this.jScrollPanelDatosEdicionUsuarioOpcion=   new JScrollPane(jContentPaneDetalleUsuarioOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUsuarioOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuarioOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuarioOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUsuarioOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUsuarioOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuarioOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuarioOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUsuarioOpcion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	        
			this.jContentPaneDetalleUsuarioOpcion.add(jPanelCamposUsuarioOpcion, gridBagConstraintsUsuarioOpcion);
			
			
			
			
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
						&& usuarioopcionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUsuarioOpcion= new GridBagConstraints();
						this.gridBagConstraintsUsuarioOpcion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUsuarioOpcion.gridx = 0;
						this.jContentPaneDetalleUsuarioOpcion.add(this.jTabbedPaneRelacionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUsuarioOpcion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUsuarioOpcion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
					this.gridBagConstraintsUsuarioOpcion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUsuarioOpcion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUsuarioOpcion.gridx = 0;
					
				
					this.jContentPaneDetalleUsuarioOpcion.add(jPanelCamposOcultosUsuarioOpcion, gridBagConstraintsUsuarioOpcion);
				
					this.jPanelCamposOcultosUsuarioOpcion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	        this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUsuarioOpcion.add(this.jPanelAccionesFormularioUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);							
			
			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
	        this.gridBagConstraintsUsuarioOpcion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUsuarioOpcion.gridx = 0;
	        
			
			this.jContentPaneDetalleUsuarioOpcion.add(this.jPanelAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUsuarioOpcion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUsuarioOpcion=   new JScrollPane(this.jPanelCamposUsuarioOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUsuarioOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuarioOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuarioOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUsuarioOpcion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
			
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
			
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUsuarioOpcion;//jContentPane;
		
		return jScrollPanelDatosEdicionUsuarioOpcion;
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
