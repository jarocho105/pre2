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
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;

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
public class SistemaDetalleFormJInternalFrame extends SistemaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSistema;
	
	protected JMenuBar jmenuBarDetalleSistema;
	
	protected JMenu jmenuDetalleSistema;
	protected JMenu jmenuDetalleArchivoSistema;
	protected JMenu jmenuDetalleAccionesSistema;
	protected JMenu jmenuDetalleDatosSistema;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSistema;	
	protected GridBagConstraints gridBagConstraintsSistema;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SistemaBeanSwingJInternalFrameAdditional jInternalFrameDetalleSistema;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SistemaSessionBean sistemaSessionBean;
	
	

	public PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame=null;
	public PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfil=false;
	public PerfilSessionBean perfilSessionBean;

	public OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;
	public OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOpcion=false;
	public OpcionSessionBean opcionSessionBean;

	public PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrame=null;
	public PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePaquete=false;
	public PaqueteSessionBean paqueteSessionBean;

	public ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame=null;
	public ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteModulo=false;
	public ModuloSessionBean moduloSessionBean;
	
		
	
	public SistemaLogic sistemaLogic;
	
	public JScrollPane jScrollPanelDatosSistema;
	public JScrollPane jScrollPanelDatosEdicionSistema;
	public JScrollPane jScrollPanelDatosGeneralSistema;
	
	protected JPanel jPanelCamposSistema;    
	protected JPanel jPanelCamposOcultosSistema;    	
	protected JPanel jPanelAccionesSistema;
	protected JPanel jPanelAccionesFormularioSistema;
    
	
	
	protected Integer iXPanelCamposSistema=0;
	protected Integer iYPanelCamposSistema=0;
	
	protected Integer iXPanelCamposOcultosSistema=0;
	protected Integer iYPanelCamposOcultosSistema=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSistema;
	public JButton jButtonModificarSistema;
	public JButton jButtonActualizarSistema;
    public JButton jButtonEliminarSistema;
	public JButton jButtonCancelarSistema;
    public JButton jButtonGuardarCambiosSistema;
	public JButton jButtonGuardarCambiosTablaSistema;
	protected JButton jButtonCerrarSistema;
	
	
	protected JButton jButtonProcesarInformacionSistema;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSistema;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSistema;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSistema;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSistema;
	protected JButton jButtonModificarToolBarSistema;
	protected JButton jButtonActualizarToolBarSistema;
    protected JButton jButtonEliminarToolBarSistema;
	protected JButton jButtonCancelarToolBarSistema;
    protected JButton jButtonGuardarCambiosToolBarSistema;
	protected JButton jButtonGuardarCambiosTablaToolBarSistema;
	protected JButton jButtonMostrarOcultarTablaToolBarSistema;
	protected JButton jButtonCerrarToolBarSistema;
	
	protected JButton jButtonProcesarInformacionToolBarSistema;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSistema;
	protected JMenuItem jMenuItemModificarSistema;
	protected JMenuItem jMenuItemActualizarSistema;
    protected JMenuItem jMenuItemEliminarSistema;
	protected JMenuItem jMenuItemCancelarSistema;
    protected JMenuItem jMenuItemGuardarCambiosSistema;
	protected JMenuItem jMenuItemGuardarCambiosTablaSistema;
	protected JMenuItem jMenuItemCerrarSistema;
	protected JMenuItem jMenuItemDetalleCerrarSistema;
	protected JMenuItem jMenuItemDetalleMostarOcultarSistema;
	
	protected JMenuItem jMenuItemProcesarInformacionSistema;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSistema;
	protected JMenuItem jMenuItemMostrarOcultarSistema;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSistema;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSistema;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSistema;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSistema;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSistema;
	public JLabel jLabelIdSistema;
	public JLabel jLabelidSistema;
	public JButton jButtonidSistemaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSistema;
	public JLabel jLabelcodigoSistema;
	public JTextField jTextFieldcodigoSistema;
	public JButton jButtoncodigoSistemaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_principalSistema;
	public JLabel jLabelnombre_principalSistema;
	public JTextArea jTextAreanombre_principalSistema;
	public JScrollPane jscrollPanenombre_principalSistema;
	public JButton jButtonnombre_principalSistemaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_secundarioSistema;
	public JLabel jLabelnombre_secundarioSistema;
	public JTextArea jTextAreanombre_secundarioSistema;
	public JScrollPane jscrollPanenombre_secundarioSistema;
	public JButton jButtonnombre_secundarioSistemaBusqueda= new JButtonMe();

	public JPanel jPanelestadoSistema;
	public JLabel jLabelestadoSistema;
	public JCheckBox jCheckBoxestadoSistema;
	public JButton jButtonestadoSistemaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSistema;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SistemaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSistema=new JPanel();
				this.jPanelAccionesFormularioSistema=new JPanel();
				this.jmenuBarDetalleSistema=new JMenuBar();
				this.jTtoolBarDetalleSistema=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SistemaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarSistema() {
		return this.jButtonActualizarToolBarSistema;
	}
	
	public JButton getjButtonEliminarToolBarSistema() {
		return this.jButtonEliminarToolBarSistema;
	}
	
	public JButton getjButtonCancelarToolBarSistema() {
		return this.jButtonCancelarToolBarSistema;
	}		
	
	public JButton getjButtonProcesarInformacionSistema() {
		return this.jButtonProcesarInformacionSistema;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSistema)	{
		this.jButtonProcesarInformacionSistema = jButtonProcesarInformacionSistema;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSistema() {
		return this.jComboBoxTiposAccionesSistema;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSistema(
			JComboBox jComboBoxTiposRelacionesSistema) {
		this.jComboBoxTiposRelacionesSistema = jComboBoxTiposRelacionesSistema;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSistema(
			JComboBox jComboBoxTiposAccionesSistema) {
		this.jComboBoxTiposAccionesSistema = jComboBoxTiposAccionesSistema;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSistema() {
		return this.jComboBoxTiposAccionesFormularioSistema;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSistema(
			JComboBox jComboBoxTiposAccionesFormularioSistema) {
		this.jComboBoxTiposAccionesFormularioSistema = jComboBoxTiposAccionesFormularioSistema;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sistemaSessionBean=new SistemaSessionBean();
		
		this.sistemaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sistemaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sistemaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.perfilSessionBean=new PerfilSessionBean();
		//this.opcionSessionBean=new OpcionSessionBean();
		//this.paqueteSessionBean=new PaqueteSessionBean();
		//this.moduloSessionBean=new ModuloSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SistemaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SistemaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SistemaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sistema MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
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
	
		SistemaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSistema= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSistema=new JButtonMe();
				this.jButtonModificarToolBarSistema=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSistema,this.jTtoolBarDetalleSistema,
							"actualizar","actualizar","Actualizar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSistema,this.jTtoolBarDetalleSistema,
							"eliminar","eliminar","Eliminar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSistema,this.jTtoolBarDetalleSistema,
							"cancelar","cancelar","Cancelar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSistema,this.jTtoolBarDetalleSistema,
							"guardarcambios","guardarcambios","Guardar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSistema,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSistema,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSistema,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSistema=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSistema=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSistema=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSistema=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSistema=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSistema= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSistema.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSistema,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSistema= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSistema.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSistema,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSistema= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSistema.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSistema,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSistema= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSistema.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSistema,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSistema= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSistema.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSistema,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSistema= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSistema.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSistema,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSistema= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSistema.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSistema,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSistema= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSistema.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSistema,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSistema= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSistema.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSistema,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSistema= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSistema.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSistema,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSistema, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSistema.add(this.jMenuItemDetalleCerrarSistema);
		
		this.jmenuDetalleAccionesSistema.add(this.jMenuItemActualizarSistema);
		this.jmenuDetalleAccionesSistema.add(this.jMenuItemEliminarSistema);
		this.jmenuDetalleAccionesSistema.add(this.jMenuItemCancelarSistema);		
		
		//this.jmenuDetalleDatosSistema.add(this.jMenuItemDetalleAbrirOrderBySistema);				
		this.jmenuDetalleDatosSistema.add(this.jMenuItemDetalleMostarOcultarSistema);				
				
		//this.jmenuDetalleAccionesSistema.add(this.jMenuItemGuardarCambiosSistema);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSistema.add(this.jmenuDetalleArchivoSistema);		
		this.jmenuBarDetalleSistema.add(this.jmenuDetalleAccionesSistema);		
		this.jmenuBarDetalleSistema.add(this.jmenuDetalleDatosSistema);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSistema, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSistema.add(this.jmenuDetalleSistema);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSistema);				
	}
	
	
	public void inicializarElementosCamposSistema() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSistema = new JLabelMe();
		jLabelIdSistema.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSistema = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSistema.setToolTipText(SistemaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSistema= new GridBagLayout();

		this.jPanelidSistema.setLayout(this.gridaBagLayoutSistema);

		jLabelidSistema = new JLabel();
		jLabelidSistema.setText("Id");

		jLabelidSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSistema = new JLabelMe();
		this.jLabelcodigoSistema.setText(""+SistemaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSistema.setToolTipText("Codigo");
		this.jLabelcodigoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSistema=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSistema.setToolTipText(SistemaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSistema = new GridBagLayout();
		this.jPanelcodigoSistema.setLayout(this.gridaBagLayoutSistema);


		jTextFieldcodigoSistema= new JTextFieldMe();

		jTextFieldcodigoSistema.setEnabled(false);
		jTextFieldcodigoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSistemaBusqueda= new JButtonMe();
		this.jButtoncodigoSistemaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSistemaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSistemaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSistemaBusqueda.setText("U");
		this.jButtoncodigoSistemaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSistemaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSistemaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSistemaBusqueda"));

		if(this.sistemaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSistemaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_principalSistema = new JLabelMe();
		this.jLabelnombre_principalSistema.setText(""+SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL+" : *");
		this.jLabelnombre_principalSistema.setToolTipText("Nombre Principal");
		this.jLabelnombre_principalSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_principalSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_principalSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_principalSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_principalSistema=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_principalSistema.setToolTipText(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL);
		this.gridaBagLayoutSistema = new GridBagLayout();
		this.jPanelnombre_principalSistema.setLayout(this.gridaBagLayoutSistema);


		jTextAreanombre_principalSistema= new JTextAreaMe();
		jTextAreanombre_principalSistema.setEnabled(false);
		jTextAreanombre_principalSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalSistema.setLineWrap(true);
		jTextAreanombre_principalSistema.setWrapStyleWord(true);
		jTextAreanombre_principalSistema.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_principalSistema.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_principalSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_principalSistema = new JScrollPane(jTextAreanombre_principalSistema);
		jscrollPanenombre_principalSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_principalSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_principalSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_principalSistemaBusqueda= new JButtonMe();
		this.jButtonnombre_principalSistemaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_principalSistemaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_principalSistemaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_principalSistemaBusqueda.setText("U");
		this.jButtonnombre_principalSistemaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_principalSistemaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_principalSistemaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_principalSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_principalSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_principalSistemaBusqueda"));

		if(this.sistemaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_principalSistemaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_secundarioSistema = new JLabelMe();
		this.jLabelnombre_secundarioSistema.setText(""+SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO+" :");
		this.jLabelnombre_secundarioSistema.setToolTipText("Nombre Secundario");
		this.jLabelnombre_secundarioSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_secundarioSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_secundarioSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_secundarioSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_secundarioSistema=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_secundarioSistema.setToolTipText(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO);
		this.gridaBagLayoutSistema = new GridBagLayout();
		this.jPanelnombre_secundarioSistema.setLayout(this.gridaBagLayoutSistema);


		jTextAreanombre_secundarioSistema= new JTextAreaMe();
		jTextAreanombre_secundarioSistema.setEnabled(false);
		jTextAreanombre_secundarioSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_secundarioSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_secundarioSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_secundarioSistema.setLineWrap(true);
		jTextAreanombre_secundarioSistema.setWrapStyleWord(true);
		jTextAreanombre_secundarioSistema.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_secundarioSistema.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_secundarioSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_secundarioSistema = new JScrollPane(jTextAreanombre_secundarioSistema);
		jscrollPanenombre_secundarioSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_secundarioSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_secundarioSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_secundarioSistemaBusqueda= new JButtonMe();
		this.jButtonnombre_secundarioSistemaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_secundarioSistemaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_secundarioSistemaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_secundarioSistemaBusqueda.setText("U");
		this.jButtonnombre_secundarioSistemaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_secundarioSistemaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_secundarioSistemaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_secundarioSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_secundarioSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_secundarioSistemaBusqueda"));

		if(this.sistemaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_secundarioSistemaBusqueda.setVisible(false);		}


					
		this.jLabelestadoSistema = new JLabelMe();
		this.jLabelestadoSistema.setText(""+SistemaConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoSistema.setToolTipText("Estado");
		this.jLabelestadoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoSistema=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoSistema.setToolTipText(SistemaConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutSistema = new GridBagLayout();
		this.jPanelestadoSistema.setLayout(this.gridaBagLayoutSistema);


		jCheckBoxestadoSistema= new JCheckBoxMe();
		jCheckBoxestadoSistema.setEnabled(false);

		jCheckBoxestadoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoSistema,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoSistemaBusqueda= new JButtonMe();
		this.jButtonestadoSistemaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoSistemaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoSistemaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoSistemaBusqueda.setText("U");
		this.jButtonestadoSistemaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoSistemaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoSistemaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoSistemaBusqueda"));

		if(this.sistemaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoSistemaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSistema() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleSistema = new SistemaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sistema DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSistema= new GridBagLayout();
		

		
		String sToolTipSistema="";
		sToolTipSistema=SistemaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSistema+="(Seguridad.Sistema)";
		}
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			sToolTipSistema+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSistema = new JButtonMe();
		this.jButtonModificarSistema = new JButtonMe();
        this.jButtonActualizarSistema = new JButtonMe();
        this.jButtonEliminarSistema = new JButtonMe();
        this.jButtonCancelarSistema = new JButtonMe();
        this.jButtonGuardarCambiosSistema = new JButtonMe();
		this.jButtonGuardarCambiosTablaSistema = new JButtonMe();
		this.jButtonCerrarSistema = new JButtonMe();
		
		this.jScrollPanelDatosSistema = new JScrollPane();   
        this.jScrollPanelDatosEdicionSistema = new JScrollPane();
		this.jScrollPanelDatosGeneralSistema = new JScrollPane();
				
		
		
		this.jPanelCamposSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sistema";
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas" + this.sPath));
		} else {
			this.jScrollPanelDatosSistema.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposSistema.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposSistema.setName("jPanelCamposSistema"); 

		this.jPanelCamposOcultosSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSistema.setName("jPanelCamposOcultosSistema"); 

        this.jPanelAccionesSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSistema.setToolTipText("Acciones");
        this.jPanelAccionesSistema.setName("Acciones"); 

		this.jPanelAccionesFormularioSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSistema.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSistema.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSistema, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSistema, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSistema, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSistema.setText("Nuevo");
		this.jButtonModificarSistema.setText("Editar");
        this.jButtonActualizarSistema.setText("Actualizar");
        this.jButtonEliminarSistema.setText("Eliminar");
        this.jButtonCancelarSistema.setText("Cancelar");
        this.jButtonGuardarCambiosSistema.setText("Guardar");
		this.jButtonGuardarCambiosTablaSistema.setText("Guardar");
		this.jButtonCerrarSistema.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSistema,"nuevo_button","Nuevo",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSistema,"modificar_button","Editar",this.sistemaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSistema,"actualizar_button","Actualizar",this.sistemaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSistema,"eliminar_button","Eliminar",this.sistemaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSistema,"cancelar_button","Cancelar",this.sistemaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSistema,"guardarcambios_button","Guardar",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSistema,"guardarcambiostabla_button","Guardar",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSistema,"cerrar_button","Salir",this.sistemaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSistema.setToolTipText("Nuevo"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSistema.setToolTipText("Editar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSistema.setToolTipText("Actualizar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSistema.setToolTipText("Eliminar)"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSistema.setToolTipText("Cancelar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSistema.setToolTipText("Guardar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSistema.setToolTipText("Guardar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSistema.setToolTipText("Salir"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSistema";
		inputMap = this.jButtonNuevoSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSistema.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSistema"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSistema";
		inputMap = this.jButtonActualizarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSistema"));
		
		//ELIMINAR
		sMapKey = "EliminarSistema";
		inputMap = this.jButtonEliminarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSistema"));
		
		//CANCELAR	
		sMapKey = "CancelarSistema";
		inputMap = this.jButtonCancelarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSistema"));
		
		//CERRAR		
		sMapKey = "CerrarSistema";
		inputMap = this.jButtonCerrarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSistema"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSistema";
		inputMap = this.jButtonGuardarCambiosTablaSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSistema"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSistema = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSistema.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSistema.setToolTipText("Nuevo Sistema");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSistema, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSistema = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSistema.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSistema.setToolTipText("Sin Cerrar Ventana Sistema");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSistema, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSistema = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSistema.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSistema.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSistema, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSistema = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSistema.setText("Accion");
		this.jComboBoxTiposAccionesSistema.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSistema = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSistema.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSistema.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSistema = new JLabelMe();
		
		this.jLabelAccionesSistema.setText("Acciones");		
		this.jLabelAccionesSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSistema();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSistema();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSistema=new JTabbedPane();
		this.jTabbedPaneRelacionesSistema.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSistema,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSistema.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSistema.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSistema.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSistema.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSistema.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSistema.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSistema, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSistema = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSistema = new GridBagLayout();
		
		this.jPanelCamposSistema.setLayout(gridaBagLayoutCamposSistema);
		this.jPanelCamposOcultosSistema.setLayout(gridaBagLayoutCamposOcultosSistema);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 0;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSistema.add(jLabelIdSistema, this.gridBagConstraintsSistema);



	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 1;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSistema.add(jLabelidSistema, this.gridBagConstraintsSistema);


	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 0;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSistema.add(jLabelcodigoSistema, this.gridBagConstraintsSistema);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSistema = new GridBagConstraints();
		//this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx = 2;
		this.gridBagConstraintsSistema.ipadx = 0;
		this.gridBagConstraintsSistema.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSistema.add(jButtoncodigoSistemaBusqueda, this.gridBagConstraintsSistema);
	}

	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 1;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSistema.add(jTextFieldcodigoSistema, this.gridBagConstraintsSistema);


	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 0;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_principalSistema.add(jLabelnombre_principalSistema, this.gridBagConstraintsSistema);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSistema = new GridBagConstraints();
		//this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx = 2;
		this.gridBagConstraintsSistema.ipadx = 0;
		this.gridBagConstraintsSistema.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_principalSistema.add(jButtonnombre_principalSistemaBusqueda, this.gridBagConstraintsSistema);
	}

	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 1;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_principalSistema.add(jscrollPanenombre_principalSistema, this.gridBagConstraintsSistema);


	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 0;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_secundarioSistema.add(jLabelnombre_secundarioSistema, this.gridBagConstraintsSistema);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSistema = new GridBagConstraints();
		//this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx = 2;
		this.gridBagConstraintsSistema.ipadx = 0;
		this.gridBagConstraintsSistema.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_secundarioSistema.add(jButtonnombre_secundarioSistemaBusqueda, this.gridBagConstraintsSistema);
	}

	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 1;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_secundarioSistema.add(jscrollPanenombre_secundarioSistema, this.gridBagConstraintsSistema);


	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 0;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoSistema.add(jLabelestadoSistema, this.gridBagConstraintsSistema);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSistema = new GridBagConstraints();
		//this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx = 2;
		this.gridBagConstraintsSistema.ipadx = 0;
		this.gridBagConstraintsSistema.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoSistema.add(jButtonestadoSistemaBusqueda, this.gridBagConstraintsSistema);
	}

	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSistema.gridy = 0;
	this.gridBagConstraintsSistema.gridx = 1;
	this.gridBagConstraintsSistema.ipadx = 0;
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoSistema.add(jCheckBoxestadoSistema, this.gridBagConstraintsSistema);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSistema.gridy = iYPanelCamposSistema;
	this.gridBagConstraintsSistema.gridx = iXPanelCamposSistema++;
	this.gridBagConstraintsSistema.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSistema.add(this.jPanelidSistema, this.gridBagConstraintsSistema);



	if(iXPanelCamposSistema % 1==0) {
		iXPanelCamposSistema=0;
		iYPanelCamposSistema++;
	}
	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSistema.gridy = iYPanelCamposSistema;
	this.gridBagConstraintsSistema.gridx = iXPanelCamposSistema++;
	this.gridBagConstraintsSistema.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSistema.add(this.jPanelcodigoSistema, this.gridBagConstraintsSistema);



	if(iXPanelCamposSistema % 1==0) {
		iXPanelCamposSistema=0;
		iYPanelCamposSistema++;
	}
	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSistema.gridy = iYPanelCamposSistema;
	this.gridBagConstraintsSistema.gridx = iXPanelCamposSistema++;
	this.gridBagConstraintsSistema.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSistema.add(this.jPanelnombre_principalSistema, this.gridBagConstraintsSistema);



	if(iXPanelCamposSistema % 1==0) {
		iXPanelCamposSistema=0;
		iYPanelCamposSistema++;
	}
	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSistema.gridy = iYPanelCamposSistema;
	this.gridBagConstraintsSistema.gridx = iXPanelCamposSistema++;
	this.gridBagConstraintsSistema.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSistema.add(this.jPanelnombre_secundarioSistema, this.gridBagConstraintsSistema);



	if(iXPanelCamposSistema % 1==0) {
		iXPanelCamposSistema=0;
		iYPanelCamposSistema++;
	}
	this.gridBagConstraintsSistema = new GridBagConstraints();
	this.gridBagConstraintsSistema.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSistema.gridy = iYPanelCamposSistema;
	this.gridBagConstraintsSistema.gridx = iXPanelCamposSistema++;
	this.gridBagConstraintsSistema.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSistema.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSistema.add(this.jPanelestadoSistema, this.gridBagConstraintsSistema);



	if(iXPanelCamposSistema % 1==0) {
		iXPanelCamposSistema=0;
		iYPanelCamposSistema++;
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
			
		GridBagLayout gridaBagLayoutAccionesSistema= new GridBagLayout();
		this.jPanelAccionesSistema.setLayout(gridaBagLayoutAccionesSistema);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSistema= new GridBagLayout();
		this.jPanelAccionesFormularioSistema.setLayout(gridaBagLayoutAccionesFormularioSistema);
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSistema.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSistema.add(this.jComboBoxTiposAccionesFormularioSistema, this.gridBagConstraintsSistema);

		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSistema.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSistema.add(this.jCheckBoxPostAccionNuevoSistema, this.gridBagConstraintsSistema);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSistema.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSistema.add(this.jCheckBoxPostAccionSinCerrarSistema, this.gridBagConstraintsSistema);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSistema.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSistema.add(this.jCheckBoxPostAccionSinMensajeSistema, this.gridBagConstraintsSistema);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx = iPosXAccion++;
			
		this.jPanelAccionesSistema.add(this.jButtonModificarSistema, this.gridBagConstraintsSistema);							

		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx =iPosXAccion++;
			
		this.jPanelAccionesSistema.add(this.jButtonEliminarSistema, this.gridBagConstraintsSistema);
		
			
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = 0;		
		this.gridBagConstraintsSistema.gridx = iPosXAccion++;
		
		this.jPanelAccionesSistema.add(this.jButtonActualizarSistema, this.gridBagConstraintsSistema);


		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = 0;		
		this.gridBagConstraintsSistema.gridx = iPosXAccion++;
		
		this.jPanelAccionesSistema.add(this.jButtonGuardarCambiosSistema, this.gridBagConstraintsSistema);	
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = 0;		
		this.gridBagConstraintsSistema.gridx =iPosXAccion++;
		
		this.jPanelAccionesSistema.add(this.jButtonCancelarSistema, this.gridBagConstraintsSistema);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSistema = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSistema);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSistema = new GridBagConstraints();						
			this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSistema.gridx = 0;		
			//this.gridBagConstraintsSistema.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSistema.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSistema.gridx =0;
		this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSistema.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSistema, this.gridBagConstraintsSistema);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SistemaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSistema = new SistemaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sistema DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sistema DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sistema Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SistemaModel sistemaModel=new SistemaModel(this);
			
			//SI USARA CLASE INTERNA
			//SistemaModel.SistemaFocusTraversalPolicy sistemaFocusTraversalPolicy = sistemaModel.new SistemaFocusTraversalPolicy(this);
			
			//sistemaFocusTraversalPolicy.setsistemaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sistemaModel);
			
			
			this.jContentPaneDetalleSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSistema = new GridBagLayout();	
			this.jContentPaneDetalleSistema.setLayout(gridaBagLayoutDetalleSistema);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSistema = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSistema = new GridBagConstraints();
				this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSistema.gridx = 0;
					
				
				this.jContentPaneDetalleSistema.add(jTtoolBarDetalleSistema, gridBagConstraintsSistema);								
				
}
			
			this.jScrollPanelDatosEdicionSistema=   new JScrollPane(jContentPaneDetalleSistema,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSistema.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSistema.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSistema.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSistema=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSistema.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSistema.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSistema.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSistema.gridx = 0;
	        
			this.jContentPaneDetalleSistema.add(jPanelCamposSistema, gridBagConstraintsSistema);
			
			
			
			
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
						&& sistemaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameModulo(this.puedeCargarPorParteModulo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameOpcion(this.puedeCargarPorParteOpcion,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePaquete(this.puedeCargarPorPartePaquete,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfil(this.puedeCargarPorPartePerfil,false,-1);
					
					if(this.sistemaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSistema= new GridBagConstraints();
						this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSistema.gridx = 0;
						this.jContentPaneDetalleSistema.add(this.jTabbedPaneRelacionesSistema, this.gridBagConstraintsSistema);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSistema.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameModulo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePaquete(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfil(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSistema.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSistema = new GridBagConstraints();
					this.gridBagConstraintsSistema.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSistema.gridx = 0;
					
				
					this.jContentPaneDetalleSistema.add(jPanelCamposOcultosSistema, gridBagConstraintsSistema);
				
					this.jPanelCamposOcultosSistema.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsSistema.gridx = 0;
	        this.gridBagConstraintsSistema.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSistema.add(this.jPanelAccionesFormularioSistema, this.gridBagConstraintsSistema);							
			
			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsSistema.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsSistema.gridx = 0;
	        
			
			this.jContentPaneDetalleSistema.add(this.jPanelAccionesSistema, this.gridBagConstraintsSistema);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSistema);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSistema=   new JScrollPane(this.jPanelCamposSistema,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSistema.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSistema.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSistema.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSistema.gridx = 0;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSistema.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSistema, this.gridBagConstraintsSistema);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSistema.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSistema, this.gridBagConstraintsSistema);			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSistema.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSistema, this.gridBagConstraintsSistema);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSistema, this.gridBagConstraintsSistema);
			
			
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSistema, this.gridBagConstraintsSistema);
		
			
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSistema, this.gridBagConstraintsSistema);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSistema;//jContentPane;
		
		return jScrollPanelDatosEdicionSistema;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameModulo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.moduloSessionBean=new ModuloSessionBean();
		this.moduloSessionBean.setConGuardarRelaciones(false);
		this.moduloSessionBean.setEsGuardarRelacionado(true);

		this.moduloBeanSwingJInternalFrame=null;//new ModuloBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.moduloBeanSwingJInternalFramePopup=new ModuloBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.moduloBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.moduloSessionBean.getEsGuardarRelacionado()) {

				ModuloJInternalFrame.STIPO_TAMANIO_GENERAL=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.moduloSessionBean.setEsGuardarRelacionado(true);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.moduloBeanSwingJInternalFrame.setmoduloSessionBean(this.moduloSessionBean);

				//this.gridBagConstraintsSistema = new GridBagConstraints();
				//this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSistema.gridx = 0;
				//this.jContentPaneDetalleSistema.add(this.moduloBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSistema);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSistema.add("Modulos",this.moduloBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSistema.setComponentAt(iIndexTab,this.moduloBeanSwingJInternalFrame.getContentPane());
				}

				//ModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.moduloSessionBean.setEsGuardarRelacionado(false);
				this.moduloBeanSwingJInternalFrame=null;//new ModuloBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.moduloSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteModulo) {
					this.jTabbedPaneRelacionesSistema.add("Modulos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.opcionSessionBean=new OpcionSessionBean();
		this.opcionSessionBean.setConGuardarRelaciones(false);
		this.opcionSessionBean.setEsGuardarRelacionado(true);

		this.opcionBeanSwingJInternalFrame=null;//new OpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.opcionBeanSwingJInternalFramePopup=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.opcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.opcionSessionBean.getEsGuardarRelacionado()) {

				OpcionJInternalFrame.STIPO_TAMANIO_GENERAL=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;
				OpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.opcionSessionBean.setEsGuardarRelacionado(true);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.opcionBeanSwingJInternalFrame.setopcionSessionBean(this.opcionSessionBean);

				//this.gridBagConstraintsSistema = new GridBagConstraints();
				//this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSistema.gridx = 0;
				//this.jContentPaneDetalleSistema.add(this.opcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSistema);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSistema.add("Opciones",this.opcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSistema.setComponentAt(iIndexTab,this.opcionBeanSwingJInternalFrame.getContentPane());
				}

				//OpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.opcionSessionBean.setEsGuardarRelacionado(false);
				this.opcionBeanSwingJInternalFrame=null;//new OpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOpcion) {
					this.jTabbedPaneRelacionesSistema.add("Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePaquete(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.paqueteSessionBean=new PaqueteSessionBean();
		this.paqueteSessionBean.setConGuardarRelaciones(false);
		this.paqueteSessionBean.setEsGuardarRelacionado(true);

		this.paqueteBeanSwingJInternalFrame=null;//new PaqueteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.paqueteBeanSwingJInternalFramePopup=new PaqueteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.paqueteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.paqueteSessionBean.getEsGuardarRelacionado()) {

				PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.paqueteSessionBean.setEsGuardarRelacionado(true);

				this.paqueteBeanSwingJInternalFrame=new PaqueteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.paqueteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.paqueteBeanSwingJInternalFrame.setpaqueteSessionBean(this.paqueteSessionBean);

				//this.gridBagConstraintsSistema = new GridBagConstraints();
				//this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSistema.gridx = 0;
				//this.jContentPaneDetalleSistema.add(this.paqueteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSistema);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSistema.add("Paquetes",this.paqueteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSistema.setComponentAt(iIndexTab,this.paqueteBeanSwingJInternalFrame.getContentPane());
				}

				//PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.paqueteSessionBean.setEsGuardarRelacionado(false);
				this.paqueteBeanSwingJInternalFrame=null;//new PaqueteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePaquete) {
					this.jTabbedPaneRelacionesSistema.add("Paquetes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePerfil(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilSessionBean=new PerfilSessionBean();
		this.perfilSessionBean.setConGuardarRelaciones(false);
		this.perfilSessionBean.setEsGuardarRelacionado(true);

		this.perfilBeanSwingJInternalFrame=null;//new PerfilBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilBeanSwingJInternalFramePopup=new PerfilBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilSessionBean.getEsGuardarRelacionado()) {

				PerfilJInternalFrame.STIPO_TAMANIO_GENERAL=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilSessionBean.setEsGuardarRelacionado(true);

				this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilBeanSwingJInternalFrame.setperfilSessionBean(this.perfilSessionBean);

				//this.gridBagConstraintsSistema = new GridBagConstraints();
				//this.gridBagConstraintsSistema.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSistema.gridx = 0;
				//this.jContentPaneDetalleSistema.add(this.perfilBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSistema);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSistema.add("Perfiles",this.perfilBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSistema.setComponentAt(iIndexTab,this.perfilBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilSessionBean.setEsGuardarRelacionado(false);
				this.perfilBeanSwingJInternalFrame=null;//new PerfilBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfil) {
					this.jTabbedPaneRelacionesSistema.add("Perfiles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPerfilBeanSwingJInternalFrame(List<Sistema> sistemas,Sistema sistema,PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilBeanSwingJInternalFrame.getPerfilLogic().setConnexion(this.sistemaLogic.getConnexion());

					perfilBeanSwingJInternalFrame.setsistemasForeignKey(sistemas);
					perfilBeanSwingJInternalFrame.setsistemaForeignKey(sistema);
					perfilBeanSwingJInternalFrame.perfilSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
					perfilBeanSwingJInternalFrame.perfilSessionBean.setlidSistemaActual(sistema.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilBeanSwingJInternalFrame.cargarCombosForeignKeyPerfil(perfilBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilBeanSwingJInternalFrame.setVisibilidadBusquedasParaSistema(true);
					perfilBeanSwingJInternalFrame.setid_sistemaFK_IdSistema(sistema.getId());

					if(!this.conCargarFormDetalle) {
						perfilBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilBeanSwingJInternalFrame.setSelectedItemCombosFrameSistemaForeignKey(sistema,1,false,true,true);
					perfilBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilBeanSwingJInternalFrame.procesarBusqueda("FK_IdSistema");
					perfilBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSistema");
					perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil(true);
					perfilBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfil("n",perfilBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilBeanSwingJInternalFrame.actualizarEstadoPanelsPerfil("relacionado");
					} else {
						perfilBeanSwingJInternalFrame.actualizarEstadoPanelsPerfil("no_relacionado");
					}

					perfilBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfil().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarOpcionBeanSwingJInternalFrame(List<Sistema> sistemas,Sistema sistema,OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.sistemaLogic.getConnexion());

					opcionBeanSwingJInternalFrame.setsistemasForeignKey(sistemas);
					opcionBeanSwingJInternalFrame.setsistemaForeignKey(sistema);
					opcionBeanSwingJInternalFrame.opcionSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
					opcionBeanSwingJInternalFrame.opcionSessionBean.setlidSistemaActual(sistema.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					opcionBeanSwingJInternalFrame.cargarCombosForeignKeyOpcion(opcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					opcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaSistema(true);
					opcionBeanSwingJInternalFrame.setid_sistemaFK_IdSistema(sistema.getId());

					if(!this.conCargarFormDetalle) {
						opcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					opcionBeanSwingJInternalFrame.setSelectedItemCombosFrameSistemaForeignKey(sistema,1,false,true,true);
					opcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					opcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdSistema");
					opcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSistema");
					opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(true);
					opcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOpcion("n",opcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, opcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					opcionBeanSwingJInternalFrame.setAutoscrolls(true);
					opcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("relacionado");
					} else {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("no_relacionado");
					}

					opcionBeanSwingJInternalFrame.getjButtonRecargarInformacionOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPaqueteBeanSwingJInternalFrame(List<Sistema> sistemas,Sistema sistema,PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//paqueteBeanSwingJInternalFrame=new PaqueteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					paqueteBeanSwingJInternalFrame.getPaqueteLogic().setConnexion(this.sistemaLogic.getConnexion());

					paqueteBeanSwingJInternalFrame.setsistemasForeignKey(sistemas);
					paqueteBeanSwingJInternalFrame.setsistemaForeignKey(sistema);
					paqueteBeanSwingJInternalFrame.paqueteSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
					paqueteBeanSwingJInternalFrame.paqueteSessionBean.setlidSistemaActual(sistema.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					paqueteBeanSwingJInternalFrame.cargarCombosForeignKeyPaquete(paqueteBeanSwingJInternalFrame.isCargarCombosDependencia);
					paqueteBeanSwingJInternalFrame.setVisibilidadBusquedasParaSistema(true);
					paqueteBeanSwingJInternalFrame.setid_sistemaFK_IdSistema(sistema.getId());

					if(!this.conCargarFormDetalle) {
						paqueteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					paqueteBeanSwingJInternalFrame.setSelectedItemCombosFrameSistemaForeignKey(sistema,1,false,true,true);
					paqueteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					paqueteBeanSwingJInternalFrame.procesarBusqueda("FK_IdSistema");
					paqueteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSistema");
					paqueteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPaquete(true);
					paqueteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPaquete("n",paqueteBeanSwingJInternalFrame.isGuardarCambiosEnLote, paqueteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					paqueteBeanSwingJInternalFrame.setAutoscrolls(true);
					paqueteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						paqueteBeanSwingJInternalFrame.actualizarEstadoPanelsPaquete("relacionado");
					} else {
						paqueteBeanSwingJInternalFrame.actualizarEstadoPanelsPaquete("no_relacionado");
					}

					paqueteBeanSwingJInternalFrame.getjButtonRecargarInformacionPaquete().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarModuloBeanSwingJInternalFrame(List<Sistema> sistemas,Sistema sistema,ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.sistemaLogic.getConnexion());

					moduloBeanSwingJInternalFrame.setsistemasForeignKey(sistemas);
					moduloBeanSwingJInternalFrame.setsistemaForeignKey(sistema);
					moduloBeanSwingJInternalFrame.moduloSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
					moduloBeanSwingJInternalFrame.moduloSessionBean.setlidSistemaActual(sistema.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					moduloBeanSwingJInternalFrame.cargarCombosForeignKeyModulo(moduloBeanSwingJInternalFrame.isCargarCombosDependencia);
					moduloBeanSwingJInternalFrame.setVisibilidadBusquedasParaSistema(true);
					moduloBeanSwingJInternalFrame.setid_sistemaFK_IdSistema(sistema.getId());

					if(!this.conCargarFormDetalle) {
						moduloBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					moduloBeanSwingJInternalFrame.setSelectedItemCombosFrameSistemaForeignKey(sistema,1,false,true,true);
					moduloBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					moduloBeanSwingJInternalFrame.procesarBusqueda("FK_IdSistema");
					moduloBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSistema");
					moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo(true);
					moduloBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesModulo("n",moduloBeanSwingJInternalFrame.isGuardarCambiosEnLote, moduloBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					moduloBeanSwingJInternalFrame.setAutoscrolls(true);
					moduloBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						moduloBeanSwingJInternalFrame.actualizarEstadoPanelsModulo("relacionado");
					} else {
						moduloBeanSwingJInternalFrame.actualizarEstadoPanelsModulo("no_relacionado");
					}

					moduloBeanSwingJInternalFrame.getjButtonRecargarInformacionModulo().setVisible(false);

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
