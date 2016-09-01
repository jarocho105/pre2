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
import com.bydan.erp.seguridad.util.PerfilConstantesFunciones;

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
public class PerfilDetalleFormJInternalFrame extends PerfilBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePerfil;
	
	protected JMenuBar jmenuBarDetallePerfil;
	
	protected JMenu jmenuDetallePerfil;
	protected JMenu jmenuDetalleArchivoPerfil;
	protected JMenu jmenuDetalleAccionesPerfil;
	protected JMenu jmenuDetalleDatosPerfil;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfil;	
	protected GridBagConstraints gridBagConstraintsPerfil;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PerfilBeanSwingJInternalFrameAdditional jInternalFrameDetallePerfil;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";
	
	public PerfilSessionBean perfilSessionBean;
	
	

	public PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;
	public PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilOpcion=false;
	public PerfilOpcionSessionBean perfilopcionSessionBean;

	public PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFrame=null;
	public PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilUsuario=false;
	public PerfilUsuarioSessionBean perfilusuarioSessionBean;

	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;
	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUsuarioOpcion=false;
	public UsuarioOpcionSessionBean usuarioopcionSessionBean;
	
	
	public SistemaSessionBean sistemaSessionBean;	
	
	public PerfilLogic perfilLogic;
	
	public JScrollPane jScrollPanelDatosPerfil;
	public JScrollPane jScrollPanelDatosEdicionPerfil;
	public JScrollPane jScrollPanelDatosGeneralPerfil;
	
	protected JPanel jPanelCamposPerfil;    
	protected JPanel jPanelCamposOcultosPerfil;    	
	protected JPanel jPanelAccionesPerfil;
	protected JPanel jPanelAccionesFormularioPerfil;
    
	
	
	protected Integer iXPanelCamposPerfil=0;
	protected Integer iYPanelCamposPerfil=0;
	
	protected Integer iXPanelCamposOcultosPerfil=0;
	protected Integer iYPanelCamposOcultosPerfil=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPerfil;
	public JButton jButtonModificarPerfil;
	public JButton jButtonActualizarPerfil;
    public JButton jButtonEliminarPerfil;
	public JButton jButtonCancelarPerfil;
    public JButton jButtonGuardarCambiosPerfil;
	public JButton jButtonGuardarCambiosTablaPerfil;
	protected JButton jButtonCerrarPerfil;
	
	
	protected JButton jButtonProcesarInformacionPerfil;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPerfil;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPerfil;
	protected JCheckBox jCheckBoxPostAccionSinMensajePerfil;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfil;
	protected JButton jButtonModificarToolBarPerfil;
	protected JButton jButtonActualizarToolBarPerfil;
    protected JButton jButtonEliminarToolBarPerfil;
	protected JButton jButtonCancelarToolBarPerfil;
    protected JButton jButtonGuardarCambiosToolBarPerfil;
	protected JButton jButtonGuardarCambiosTablaToolBarPerfil;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfil;
	protected JButton jButtonCerrarToolBarPerfil;
	
	protected JButton jButtonProcesarInformacionToolBarPerfil;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfil;
	protected JMenuItem jMenuItemModificarPerfil;
	protected JMenuItem jMenuItemActualizarPerfil;
    protected JMenuItem jMenuItemEliminarPerfil;
	protected JMenuItem jMenuItemCancelarPerfil;
    protected JMenuItem jMenuItemGuardarCambiosPerfil;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfil;
	protected JMenuItem jMenuItemCerrarPerfil;
	protected JMenuItem jMenuItemDetalleCerrarPerfil;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfil;
	
	protected JMenuItem jMenuItemProcesarInformacionPerfil;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfil;
	protected JMenuItem jMenuItemMostrarOcultarPerfil;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfil;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfil;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPerfil;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPerfil;
	public JLabel jLabelIdPerfil;
	public JLabel jLabelidPerfil;
	public JButton jButtonidPerfilBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPerfil;
	public JLabel jLabelcodigoPerfil;
	public JTextField jTextFieldcodigoPerfil;
	public JButton jButtoncodigoPerfilBusqueda= new JButtonMe();

	public JPanel jPanelnombrePerfil;
	public JLabel jLabelnombrePerfil;
	public JTextField jTextFieldnombrePerfil;
	public JButton jButtonnombrePerfilBusqueda= new JButtonMe();

	public JPanel jPanelnombre2Perfil;
	public JLabel jLabelnombre2Perfil;
	public JTextArea jTextAreanombre2Perfil;
	public JScrollPane jscrollPanenombre2Perfil;
	public JButton jButtonnombre2PerfilBusqueda= new JButtonMe();

	public JPanel jPanelestadoPerfil;
	public JLabel jLabelestadoPerfil;
	public JCheckBox jCheckBoxestadoPerfil;
	public JButton jButtonestadoPerfilBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaPerfil;
	public JLabel jLabelid_sistemaPerfil;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaPerfil;
	public JButton jButtonid_sistemaPerfil= new JButtonMe();
	public JButton jButtonid_sistemaPerfilUpdate= new JButtonMe();
	public JButton jButtonid_sistemaPerfilBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPerfil;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PerfilDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPerfil=new JPanel();
				this.jPanelAccionesFormularioPerfil=new JPanel();
				this.jmenuBarDetallePerfil=new JMenuBar();
				this.jTtoolBarDetallePerfil=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PerfilDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPerfil() {
		return this.jButtonActualizarToolBarPerfil;
	}
	
	public JButton getjButtonEliminarToolBarPerfil() {
		return this.jButtonEliminarToolBarPerfil;
	}
	
	public JButton getjButtonCancelarToolBarPerfil() {
		return this.jButtonCancelarToolBarPerfil;
	}		
	
	public JButton getjButtonProcesarInformacionPerfil() {
		return this.jButtonProcesarInformacionPerfil;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfil)	{
		this.jButtonProcesarInformacionPerfil = jButtonProcesarInformacionPerfil;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfil() {
		return this.jComboBoxTiposAccionesPerfil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfil(
			JComboBox jComboBoxTiposRelacionesPerfil) {
		this.jComboBoxTiposRelacionesPerfil = jComboBoxTiposRelacionesPerfil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfil(
			JComboBox jComboBoxTiposAccionesPerfil) {
		this.jComboBoxTiposAccionesPerfil = jComboBoxTiposAccionesPerfil;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPerfil() {
		return this.jComboBoxTiposAccionesFormularioPerfil;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPerfil(
			JComboBox jComboBoxTiposAccionesFormularioPerfil) {
		this.jComboBoxTiposAccionesFormularioPerfil = jComboBoxTiposAccionesFormularioPerfil;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfilSessionBean=new PerfilSessionBean();
		
		this.perfilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		//this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		//this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
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
	
		PerfilJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePerfil= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPerfil=new JButtonMe();
				this.jButtonModificarToolBarPerfil=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPerfil,this.jTtoolBarDetallePerfil,
							"actualizar","actualizar","Actualizar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPerfil,this.jTtoolBarDetallePerfil,
							"eliminar","eliminar","Eliminar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPerfil,this.jTtoolBarDetallePerfil,
							"cancelar","cancelar","Cancelar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPerfil,this.jTtoolBarDetallePerfil,
							"guardarcambios","guardarcambios","Guardar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPerfil,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPerfil,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPerfil,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePerfil=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePerfil=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPerfil=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPerfil=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPerfil=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfil= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfil.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfil,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPerfil= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPerfil.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPerfil,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPerfil= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPerfil.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPerfil,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPerfil= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPerfil.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPerfil,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPerfil= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPerfil.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPerfil,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPerfil= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfil.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfil,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfil= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfil.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfil,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPerfil= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPerfil.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPerfil,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfil,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfil,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPerfil.add(this.jMenuItemDetalleCerrarPerfil);
		
		this.jmenuDetalleAccionesPerfil.add(this.jMenuItemActualizarPerfil);
		this.jmenuDetalleAccionesPerfil.add(this.jMenuItemEliminarPerfil);
		this.jmenuDetalleAccionesPerfil.add(this.jMenuItemCancelarPerfil);		
		
		//this.jmenuDetalleDatosPerfil.add(this.jMenuItemDetalleAbrirOrderByPerfil);				
		this.jmenuDetalleDatosPerfil.add(this.jMenuItemDetalleMostarOcultarPerfil);				
				
		//this.jmenuDetalleAccionesPerfil.add(this.jMenuItemGuardarCambiosPerfil);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePerfil.add(this.jmenuDetalleArchivoPerfil);		
		this.jmenuBarDetallePerfil.add(this.jmenuDetalleAccionesPerfil);		
		this.jmenuBarDetallePerfil.add(this.jmenuDetalleDatosPerfil);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePerfil, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePerfil.add(this.jmenuDetallePerfil);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePerfil);				
	}
	
	
	public void inicializarElementosCamposPerfil() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPerfil = new JLabelMe();
		jLabelIdPerfil.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPerfil = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPerfil.setToolTipText(PerfilConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPerfil= new GridBagLayout();

		this.jPanelidPerfil.setLayout(this.gridaBagLayoutPerfil);

		jLabelidPerfil = new JLabel();
		jLabelidPerfil.setText("Id");

		jLabelidPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPerfil = new JLabelMe();
		this.jLabelcodigoPerfil.setText(""+PerfilConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPerfil.setToolTipText("Codigo");
		this.jLabelcodigoPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPerfil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPerfil.setToolTipText(PerfilConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPerfil = new GridBagLayout();
		this.jPanelcodigoPerfil.setLayout(this.gridaBagLayoutPerfil);


		jTextFieldcodigoPerfil= new JTextFieldMe();

		jTextFieldcodigoPerfil.setEnabled(false);
		jTextFieldcodigoPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPerfilBusqueda= new JButtonMe();
		this.jButtoncodigoPerfilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPerfilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPerfilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPerfilBusqueda.setText("U");
		this.jButtoncodigoPerfilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPerfilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPerfilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPerfilBusqueda"));

		if(this.perfilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPerfilBusqueda.setVisible(false);		}


					
		this.jLabelnombrePerfil = new JLabelMe();
		this.jLabelnombrePerfil.setText(""+PerfilConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePerfil.setToolTipText("Nombre");
		this.jLabelnombrePerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePerfil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePerfil.setToolTipText(PerfilConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPerfil = new GridBagLayout();
		this.jPanelnombrePerfil.setLayout(this.gridaBagLayoutPerfil);


		jTextFieldnombrePerfil= new JTextFieldMe();

		jTextFieldnombrePerfil.setEnabled(false);
		jTextFieldnombrePerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombrePerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombrePerfilBusqueda= new JButtonMe();
		this.jButtonnombrePerfilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePerfilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePerfilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePerfilBusqueda.setText("U");
		this.jButtonnombrePerfilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePerfilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePerfilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombrePerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombrePerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePerfilBusqueda"));

		if(this.perfilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePerfilBusqueda.setVisible(false);		}


					
		this.jLabelnombre2Perfil = new JLabelMe();
		this.jLabelnombre2Perfil.setText(""+PerfilConstantesFunciones.LABEL_NOMBRE2+" : *");
		this.jLabelnombre2Perfil.setToolTipText("Nombre Alterno");
		this.jLabelnombre2Perfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre2Perfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre2Perfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre2Perfil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre2Perfil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre2Perfil.setToolTipText(PerfilConstantesFunciones.LABEL_NOMBRE2);
		this.gridaBagLayoutPerfil = new GridBagLayout();
		this.jPanelnombre2Perfil.setLayout(this.gridaBagLayoutPerfil);


		jTextAreanombre2Perfil= new JTextAreaMe();
		jTextAreanombre2Perfil.setEnabled(false);
		jTextAreanombre2Perfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre2Perfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre2Perfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre2Perfil.setLineWrap(true);
		jTextAreanombre2Perfil.setWrapStyleWord(true);
		jTextAreanombre2Perfil.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre2Perfil.setRows(12);

		FuncionesSwing.setBoldTextArea(jTextAreanombre2Perfil,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre2Perfil = new JScrollPane(jTextAreanombre2Perfil);
		jscrollPanenombre2Perfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre2Perfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre2Perfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre2PerfilBusqueda= new JButtonMe();
		this.jButtonnombre2PerfilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre2PerfilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre2PerfilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre2PerfilBusqueda.setText("U");
		this.jButtonnombre2PerfilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre2PerfilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre2PerfilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre2Perfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre2Perfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre2PerfilBusqueda"));

		if(this.perfilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre2PerfilBusqueda.setVisible(false);		}


					
		this.jLabelestadoPerfil = new JLabelMe();
		this.jLabelestadoPerfil.setText(""+PerfilConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPerfil.setToolTipText("Estado");
		this.jLabelestadoPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPerfil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPerfil.setToolTipText(PerfilConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPerfil = new GridBagLayout();
		this.jPanelestadoPerfil.setLayout(this.gridaBagLayoutPerfil);


		jCheckBoxestadoPerfil= new JCheckBoxMe();
		jCheckBoxestadoPerfil.setEnabled(false);

		jCheckBoxestadoPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoPerfilBusqueda= new JButtonMe();
		this.jButtonestadoPerfilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPerfilBusqueda.setText("U");
		this.jButtonestadoPerfilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPerfilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPerfilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPerfilBusqueda"));

		if(this.perfilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPerfilBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPerfil() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_sistemaPerfil = new JLabelMe();
		this.jLabelid_sistemaPerfil.setText(""+PerfilConstantesFunciones.LABEL_IDSISTEMA+" : *");
		this.jLabelid_sistemaPerfil.setToolTipText("Sistema");
		this.jLabelid_sistemaPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sistemaPerfil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sistemaPerfil.setToolTipText(PerfilConstantesFunciones.LABEL_IDSISTEMA);
		this.gridaBagLayoutPerfil = new GridBagLayout();
		this.jPanelid_sistemaPerfil.setLayout(this.gridaBagLayoutPerfil);


		jComboBoxid_sistemaPerfil= new JComboBoxMe();
		jComboBoxid_sistemaPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaPerfil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sistemaPerfil= new JButtonMe();
		this.jButtonid_sistemaPerfil.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPerfil.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPerfil.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPerfil.setText("Buscar");
		this.jButtonid_sistemaPerfil.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sistemaPerfil.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPerfil,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sistemaPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPerfil"));

		this.jButtonid_sistemaPerfilBusqueda= new JButtonMe();
		this.jButtonid_sistemaPerfilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaPerfilBusqueda.setText("U");
		this.jButtonid_sistemaPerfilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sistemaPerfilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPerfilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sistemaPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPerfilBusqueda"));

		if(this.perfilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sistemaPerfilBusqueda.setVisible(false);		}

		this.jButtonid_sistemaPerfilUpdate= new JButtonMe();
		this.jButtonid_sistemaPerfilUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaPerfilUpdate.setText("U");
		this.jButtonid_sistemaPerfilUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sistemaPerfilUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPerfilUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sistemaPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPerfilUpdate"));



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
		//this.jInternalFrameDetallePerfil = new PerfilBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Perfil DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfil= new GridBagLayout();
		

		
		String sToolTipPerfil="";
		sToolTipPerfil=PerfilConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfil+="(Seguridad.Perfil)";
		}
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfil+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPerfil = new JButtonMe();
		this.jButtonModificarPerfil = new JButtonMe();
        this.jButtonActualizarPerfil = new JButtonMe();
        this.jButtonEliminarPerfil = new JButtonMe();
        this.jButtonCancelarPerfil = new JButtonMe();
        this.jButtonGuardarCambiosPerfil = new JButtonMe();
		this.jButtonGuardarCambiosTablaPerfil = new JButtonMe();
		this.jButtonCerrarPerfil = new JButtonMe();
		
		this.jScrollPanelDatosPerfil = new JScrollPane();   
        this.jScrollPanelDatosEdicionPerfil = new JScrollPane();
		this.jScrollPanelDatosGeneralPerfil = new JScrollPane();
				
		
		
		this.jPanelCamposPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil";
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfil.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPerfil.setName("jPanelCamposPerfil"); 

		this.jPanelCamposOcultosPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPerfil.setName("jPanelCamposOcultosPerfil"); 

        this.jPanelAccionesPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfil.setToolTipText("Acciones");
        this.jPanelAccionesPerfil.setName("Acciones"); 

		this.jPanelAccionesFormularioPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPerfil.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPerfil.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfil, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPerfil.setText("Nuevo");
		this.jButtonModificarPerfil.setText("Editar");
        this.jButtonActualizarPerfil.setText("Actualizar");
        this.jButtonEliminarPerfil.setText("Eliminar");
        this.jButtonCancelarPerfil.setText("Cancelar");
        this.jButtonGuardarCambiosPerfil.setText("Guardar");
		this.jButtonGuardarCambiosTablaPerfil.setText("Guardar");
		this.jButtonCerrarPerfil.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfil,"nuevo_button","Nuevo",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPerfil,"modificar_button","Editar",this.perfilSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPerfil,"actualizar_button","Actualizar",this.perfilSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPerfil,"eliminar_button","Eliminar",this.perfilSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPerfil,"cancelar_button","Cancelar",this.perfilSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPerfil,"guardarcambios_button","Guardar",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfil,"guardarcambiostabla_button","Guardar",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfil,"cerrar_button","Salir",this.perfilSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPerfil.setToolTipText("Nuevo"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPerfil.setToolTipText("Editar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPerfil.setToolTipText("Actualizar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPerfil.setToolTipText("Eliminar)"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPerfil.setToolTipText("Cancelar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPerfil.setToolTipText("Guardar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPerfil.setToolTipText("Guardar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfil.setToolTipText("Salir"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfil";
		inputMap = this.jButtonNuevoPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfil"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPerfil";
		inputMap = this.jButtonActualizarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPerfil"));
		
		//ELIMINAR
		sMapKey = "EliminarPerfil";
		inputMap = this.jButtonEliminarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPerfil"));
		
		//CANCELAR	
		sMapKey = "CancelarPerfil";
		inputMap = this.jButtonCancelarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPerfil"));
		
		//CERRAR		
		sMapKey = "CerrarPerfil";
		inputMap = this.jButtonCerrarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfil"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfil";
		inputMap = this.jButtonGuardarCambiosTablaPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfil"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPerfil = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPerfil.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPerfil.setToolTipText("Nuevo Perfil");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPerfil = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPerfil.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPerfil.setToolTipText("Sin Cerrar Ventana Perfil");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePerfil = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePerfil.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePerfil.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePerfil, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPerfil = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfil.setText("Accion");
		this.jComboBoxTiposAccionesPerfil.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPerfil = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPerfil.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPerfil.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPerfil = new JLabelMe();
		
		this.jLabelAccionesPerfil.setText("Acciones");		
		this.jLabelAccionesPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPerfil();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPerfil();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPerfil=new JTabbedPane();
		this.jTabbedPaneRelacionesPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPerfil,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPerfil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPerfil.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfil.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfil.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPerfil, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPerfil = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPerfil = new GridBagLayout();
		
		this.jPanelCamposPerfil.setLayout(gridaBagLayoutCamposPerfil);
		this.jPanelCamposOcultosPerfil.setLayout(gridaBagLayoutCamposOcultosPerfil);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 0;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPerfil.add(jLabelIdPerfil, this.gridBagConstraintsPerfil);



	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 1;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPerfil.add(jLabelidPerfil, this.gridBagConstraintsPerfil);


	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 0;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sistemaPerfil.add(jLabelid_sistemaPerfil, this.gridBagConstraintsPerfil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 2;
		this.gridBagConstraintsPerfil.ipadx = 0;
		this.gridBagConstraintsPerfil.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaPerfil.add(jButtonid_sistemaPerfilBusqueda, this.gridBagConstraintsPerfil);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 3;
		this.gridBagConstraintsPerfil.ipadx = 0;
		this.gridBagConstraintsPerfil.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaPerfil.add(jButtonid_sistemaPerfilUpdate, this.gridBagConstraintsPerfil);
	}

	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 1;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sistemaPerfil.add(jComboBoxid_sistemaPerfil, this.gridBagConstraintsPerfil);


	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 0;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPerfil.add(jLabelcodigoPerfil, this.gridBagConstraintsPerfil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 2;
		this.gridBagConstraintsPerfil.ipadx = 0;
		this.gridBagConstraintsPerfil.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPerfil.add(jButtoncodigoPerfilBusqueda, this.gridBagConstraintsPerfil);
	}

	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 1;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPerfil.add(jTextFieldcodigoPerfil, this.gridBagConstraintsPerfil);


	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 0;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePerfil.add(jLabelnombrePerfil, this.gridBagConstraintsPerfil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 2;
		this.gridBagConstraintsPerfil.ipadx = 0;
		this.gridBagConstraintsPerfil.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePerfil.add(jButtonnombrePerfilBusqueda, this.gridBagConstraintsPerfil);
	}

	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 1;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePerfil.add(jTextFieldnombrePerfil, this.gridBagConstraintsPerfil);


	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 0;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre2Perfil.add(jLabelnombre2Perfil, this.gridBagConstraintsPerfil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 2;
		this.gridBagConstraintsPerfil.ipadx = 0;
		this.gridBagConstraintsPerfil.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre2Perfil.add(jButtonnombre2PerfilBusqueda, this.gridBagConstraintsPerfil);
	}

	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 1;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre2Perfil.add(jscrollPanenombre2Perfil, this.gridBagConstraintsPerfil);


	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 0;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPerfil.add(jLabelestadoPerfil, this.gridBagConstraintsPerfil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 2;
		this.gridBagConstraintsPerfil.ipadx = 0;
		this.gridBagConstraintsPerfil.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPerfil.add(jButtonestadoPerfilBusqueda, this.gridBagConstraintsPerfil);
	}

	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfil.gridy = 0;
	this.gridBagConstraintsPerfil.gridx = 1;
	this.gridBagConstraintsPerfil.ipadx = 0;
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPerfil.add(jCheckBoxestadoPerfil, this.gridBagConstraintsPerfil);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfil.gridy = iYPanelCamposPerfil;
	this.gridBagConstraintsPerfil.gridx = iXPanelCamposPerfil++;
	this.gridBagConstraintsPerfil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfil.add(this.jPanelidPerfil, this.gridBagConstraintsPerfil);



	if(iXPanelCamposPerfil % 1==0) {
		iXPanelCamposPerfil=0;
		iYPanelCamposPerfil++;
	}
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfil.gridy = iYPanelCamposPerfil;
	this.gridBagConstraintsPerfil.gridx = iXPanelCamposPerfil++;
	this.gridBagConstraintsPerfil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfil.add(this.jPanelid_sistemaPerfil, this.gridBagConstraintsPerfil);



	if(iXPanelCamposPerfil % 1==0) {
		iXPanelCamposPerfil=0;
		iYPanelCamposPerfil++;
	}
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfil.gridy = iYPanelCamposPerfil;
	this.gridBagConstraintsPerfil.gridx = iXPanelCamposPerfil++;
	this.gridBagConstraintsPerfil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfil.add(this.jPanelcodigoPerfil, this.gridBagConstraintsPerfil);



	if(iXPanelCamposPerfil % 1==0) {
		iXPanelCamposPerfil=0;
		iYPanelCamposPerfil++;
	}
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfil.gridy = iYPanelCamposPerfil;
	this.gridBagConstraintsPerfil.gridx = iXPanelCamposPerfil++;
	this.gridBagConstraintsPerfil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfil.add(this.jPanelnombrePerfil, this.gridBagConstraintsPerfil);



	if(iXPanelCamposPerfil % 1==0) {
		iXPanelCamposPerfil=0;
		iYPanelCamposPerfil++;
	}
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfil.gridy = iYPanelCamposPerfil;
	this.gridBagConstraintsPerfil.gridx = iXPanelCamposPerfil++;
	this.gridBagConstraintsPerfil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfil.add(this.jPanelnombre2Perfil, this.gridBagConstraintsPerfil);



	if(iXPanelCamposPerfil % 1==0) {
		iXPanelCamposPerfil=0;
		iYPanelCamposPerfil++;
	}
	this.gridBagConstraintsPerfil = new GridBagConstraints();
	this.gridBagConstraintsPerfil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfil.gridy = iYPanelCamposPerfil;
	this.gridBagConstraintsPerfil.gridx = iXPanelCamposPerfil++;
	this.gridBagConstraintsPerfil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfil.add(this.jPanelestadoPerfil, this.gridBagConstraintsPerfil);



	if(iXPanelCamposPerfil % 1==0) {
		iXPanelCamposPerfil=0;
		iYPanelCamposPerfil++;
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
			
		GridBagLayout gridaBagLayoutAccionesPerfil= new GridBagLayout();
		this.jPanelAccionesPerfil.setLayout(gridaBagLayoutAccionesPerfil);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPerfil= new GridBagLayout();
		this.jPanelAccionesFormularioPerfil.setLayout(gridaBagLayoutAccionesFormularioPerfil);
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfil.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfil.add(this.jComboBoxTiposAccionesFormularioPerfil, this.gridBagConstraintsPerfil);

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfil.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfil.add(this.jCheckBoxPostAccionNuevoPerfil, this.gridBagConstraintsPerfil);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.perfilSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfil.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfil.add(this.jCheckBoxPostAccionSinCerrarPerfil, this.gridBagConstraintsPerfil);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.perfilSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.perfilSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfil.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfil.add(this.jCheckBoxPostAccionSinMensajePerfil, this.gridBagConstraintsPerfil);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = iPosXAccion++;
			
		this.jPanelAccionesPerfil.add(this.jButtonModificarPerfil, this.gridBagConstraintsPerfil);							

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx =iPosXAccion++;
			
		this.jPanelAccionesPerfil.add(this.jButtonEliminarPerfil, this.gridBagConstraintsPerfil);
		
			
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = 0;		
		this.gridBagConstraintsPerfil.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfil.add(this.jButtonActualizarPerfil, this.gridBagConstraintsPerfil);


		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = 0;		
		this.gridBagConstraintsPerfil.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfil.add(this.jButtonGuardarCambiosPerfil, this.gridBagConstraintsPerfil);	
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = 0;		
		this.gridBagConstraintsPerfil.gridx =iPosXAccion++;
		
		this.jPanelAccionesPerfil.add(this.jButtonCancelarPerfil, this.gridBagConstraintsPerfil);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfil = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfil);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfil = new GridBagConstraints();						
			this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfil.gridx = 0;		
			//this.gridBagConstraintsPerfil.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfil.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfil.gridx =0;
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfil.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfil, this.gridBagConstraintsPerfil);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PerfilJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePerfil = new PerfilBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Perfil DATOS");
			
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
			
	        //this.setTitle("[FOR] - Perfil DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PerfilModel perfilModel=new PerfilModel(this);
			
			//SI USARA CLASE INTERNA
			//PerfilModel.PerfilFocusTraversalPolicy perfilFocusTraversalPolicy = perfilModel.new PerfilFocusTraversalPolicy(this);
			
			//perfilFocusTraversalPolicy.setperfilJInternalFrame(this);
			
			this.setFocusTraversalPolicy(perfilModel);
			
			
			this.jContentPaneDetallePerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePerfil = new GridBagLayout();	
			this.jContentPaneDetallePerfil.setLayout(gridaBagLayoutDetallePerfil);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfil = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPerfil = new GridBagConstraints();
				this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPerfil.gridx = 0;
					
				
				this.jContentPaneDetallePerfil.add(jTtoolBarDetallePerfil, gridBagConstraintsPerfil);								
				
}
			
			this.jScrollPanelDatosEdicionPerfil=   new JScrollPane(jContentPaneDetallePerfil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPerfil=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPerfil.gridx = 0;
	        
			this.jContentPaneDetallePerfil.add(jPanelCamposPerfil, gridBagConstraintsPerfil);
			
			
			
			
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
						&& perfilSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePerfilOpcion(this.puedeCargarPorPartePerfilOpcion,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilUsuario(this.puedeCargarPorPartePerfilUsuario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(this.puedeCargarPorParteUsuarioOpcion,false,-1);
					
					if(this.perfilSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPerfil= new GridBagConstraints();
						this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPerfil.gridx = 0;
						this.jContentPaneDetallePerfil.add(this.jTabbedPaneRelacionesPerfil, this.gridBagConstraintsPerfil);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPerfil.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePerfilOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPerfil.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPerfil = new GridBagConstraints();
					this.gridBagConstraintsPerfil.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPerfil.gridx = 0;
					
				
					this.jContentPaneDetallePerfil.add(jPanelCamposOcultosPerfil, gridBagConstraintsPerfil);
				
					this.jPanelCamposOcultosPerfil.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsPerfil.gridx = 0;
	        this.gridBagConstraintsPerfil.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePerfil.add(this.jPanelAccionesFormularioPerfil, this.gridBagConstraintsPerfil);							
			
			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
	        this.gridBagConstraintsPerfil.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsPerfil.gridx = 0;
	        
			
			this.jContentPaneDetallePerfil.add(this.jPanelAccionesPerfil, this.gridBagConstraintsPerfil);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPerfil);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPerfil=   new JScrollPane(this.jPanelCamposPerfil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPerfil.gridx = 0;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPerfil.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPerfil, this.gridBagConstraintsPerfil);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfil.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPerfil, this.gridBagConstraintsPerfil);			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfil.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPerfil, this.gridBagConstraintsPerfil);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfil, this.gridBagConstraintsPerfil);
			
			
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfil, this.gridBagConstraintsPerfil);
		
			
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfil, this.gridBagConstraintsPerfil);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPerfil;//jContentPane;
		
		return jScrollPanelDatosEdicionPerfil;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePerfilOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		this.perfilopcionSessionBean.setConGuardarRelaciones(false);
		this.perfilopcionSessionBean.setEsGuardarRelacionado(true);

		this.perfilopcionBeanSwingJInternalFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilopcionBeanSwingJInternalFramePopup=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {

				PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilopcionSessionBean.setEsGuardarRelacionado(true);

				this.perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilopcionBeanSwingJInternalFrame.setperfilopcionSessionBean(this.perfilopcionSessionBean);

				//this.gridBagConstraintsPerfil = new GridBagConstraints();
				//this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPerfil.gridx = 0;
				//this.jContentPaneDetallePerfil.add(this.perfilopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPerfil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPerfil.add("Perfil Opciones",this.perfilopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPerfil.setComponentAt(iIndexTab,this.perfilopcionBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilopcionSessionBean.setEsGuardarRelacionado(false);
				this.perfilopcionBeanSwingJInternalFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilOpcion) {
					this.jTabbedPaneRelacionesPerfil.add("Perfil Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePerfilUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		this.perfilusuarioSessionBean.setConGuardarRelaciones(false);
		this.perfilusuarioSessionBean.setEsGuardarRelacionado(true);

		this.perfilusuarioBeanSwingJInternalFrame=null;//new PerfilUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilusuarioBeanSwingJInternalFramePopup=new PerfilUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilusuarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {

				PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilusuarioSessionBean.setEsGuardarRelacionado(true);

				this.perfilusuarioBeanSwingJInternalFrame=new PerfilUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilusuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilusuarioBeanSwingJInternalFrame.setperfilusuarioSessionBean(this.perfilusuarioSessionBean);

				//this.gridBagConstraintsPerfil = new GridBagConstraints();
				//this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPerfil.gridx = 0;
				//this.jContentPaneDetallePerfil.add(this.perfilusuarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPerfil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPerfil.add("Usuarios Perfiles s",this.perfilusuarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPerfil.setComponentAt(iIndexTab,this.perfilusuarioBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilusuarioSessionBean.setEsGuardarRelacionado(false);
				this.perfilusuarioBeanSwingJInternalFrame=null;//new PerfilUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilUsuario) {
					this.jTabbedPaneRelacionesPerfil.add("Usuarios Perfiles s",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		this.usuarioopcionSessionBean.setConGuardarRelaciones(false);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

		this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.usuarioopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {

				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;
				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

				this.usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.usuarioopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.usuarioopcionBeanSwingJInternalFrame.setusuarioopcionSessionBean(this.usuarioopcionSessionBean);

				//this.gridBagConstraintsPerfil = new GridBagConstraints();
				//this.gridBagConstraintsPerfil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPerfil.gridx = 0;
				//this.jContentPaneDetallePerfil.add(this.usuarioopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPerfil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPerfil.add("Usuario Opciones",this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPerfil.setComponentAt(iIndexTab,this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				}

				//UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUsuarioOpcion) {
					this.jTabbedPaneRelacionesPerfil.add("Usuario Opciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPerfilOpcionBeanSwingJInternalFrame(List<Perfil> perfils,Perfil perfil,PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilopcionBeanSwingJInternalFrame.getPerfilOpcionLogic().setConnexion(this.perfilLogic.getConnexion());

					perfilopcionBeanSwingJInternalFrame.setperfilsForeignKey(perfils);
					perfilopcionBeanSwingJInternalFrame.setperfilForeignKey(perfil);
					perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionPerfil(true);
					perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setlidPerfilActual(perfil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilopcionBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilOpcion(perfilopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaPerfil(true);
					perfilopcionBeanSwingJInternalFrame.setid_perfilFK_IdPerfil(perfil.getId());

					if(!this.conCargarFormDetalle) {
						perfilopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilopcionBeanSwingJInternalFrame.setSelectedItemCombosFramePerfilForeignKey(perfil,1,false,true,true);
					perfilopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdPerfil");
					perfilopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPerfil");
					perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(true);
					perfilopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilOpcion("n",perfilopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("relacionado");
					} else {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("no_relacionado");
					}

					perfilopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPerfilUsuarioBeanSwingJInternalFrame(List<Perfil> perfils,Perfil perfil,PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilusuarioBeanSwingJInternalFrame=new PerfilUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilusuarioBeanSwingJInternalFrame.getPerfilUsuarioLogic().setConnexion(this.perfilLogic.getConnexion());

					perfilusuarioBeanSwingJInternalFrame.setperfilsForeignKey(perfils);
					perfilusuarioBeanSwingJInternalFrame.setperfilForeignKey(perfil);
					perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setisBusquedaDesdeForeignKeySesionPerfil(true);
					perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setlidPerfilActual(perfil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilusuarioBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilUsuario(perfilusuarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilusuarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaPerfil(true);
					perfilusuarioBeanSwingJInternalFrame.setid_perfilFK_IdPerfil(perfil.getId());

					if(!this.conCargarFormDetalle) {
						perfilusuarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilusuarioBeanSwingJInternalFrame.setSelectedItemCombosFramePerfilForeignKey(perfil,1,false,true,true);
					perfilusuarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilusuarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdPerfil");
					perfilusuarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPerfil");
					perfilusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilUsuario(true);
					perfilusuarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilUsuario("n",perfilusuarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilusuarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilusuarioBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilusuarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilUsuario("relacionado");
					} else {
						perfilusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilUsuario("no_relacionado");
					}

					perfilusuarioBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilUsuario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarUsuarioOpcionBeanSwingJInternalFrame(List<Perfil> perfils,Perfil perfil,UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					usuarioopcionBeanSwingJInternalFrame.getUsuarioOpcionLogic().setConnexion(this.perfilLogic.getConnexion());

					usuarioopcionBeanSwingJInternalFrame.setperfilsForeignKey(perfils);
					usuarioopcionBeanSwingJInternalFrame.setperfilForeignKey(perfil);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionPerfil(true);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setlidPerfilActual(perfil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					usuarioopcionBeanSwingJInternalFrame.cargarCombosForeignKeyUsuarioOpcion(usuarioopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					usuarioopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaPerfil(true);
					usuarioopcionBeanSwingJInternalFrame.setid_perfilFK_IdPerfil(perfil.getId());

					if(!this.conCargarFormDetalle) {
						usuarioopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					usuarioopcionBeanSwingJInternalFrame.setSelectedItemCombosFramePerfilForeignKey(perfil,1,false,true,true);
					usuarioopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					usuarioopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdPerfil");
					usuarioopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPerfil");
					usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUsuarioOpcion("n",usuarioopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, usuarioopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					usuarioopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					usuarioopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("relacionado");
					} else {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");
					}

					usuarioopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionUsuarioOpcion().setVisible(false);

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
