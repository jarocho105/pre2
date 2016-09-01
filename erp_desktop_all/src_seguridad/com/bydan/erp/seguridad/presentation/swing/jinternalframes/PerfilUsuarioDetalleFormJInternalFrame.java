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
import com.bydan.erp.seguridad.util.PerfilUsuarioConstantesFunciones;

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
public class PerfilUsuarioDetalleFormJInternalFrame extends PerfilUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePerfilUsuario;
	
	protected JMenuBar jmenuBarDetallePerfilUsuario;
	
	protected JMenu jmenuDetallePerfilUsuario;
	protected JMenu jmenuDetalleArchivoPerfilUsuario;
	protected JMenu jmenuDetalleAccionesPerfilUsuario;
	protected JMenu jmenuDetalleDatosPerfilUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilUsuario;	
	protected GridBagConstraints gridBagConstraintsPerfilUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PerfilUsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetallePerfilUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public PerfilUsuarioSessionBean perfilusuarioSessionBean;
	
	
	
	
	public PerfilSessionBean perfilSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public PerfilUsuarioLogic perfilusuarioLogic;
	
	public JScrollPane jScrollPanelDatosPerfilUsuario;
	public JScrollPane jScrollPanelDatosEdicionPerfilUsuario;
	public JScrollPane jScrollPanelDatosGeneralPerfilUsuario;
	
	protected JPanel jPanelCamposPerfilUsuario;    
	protected JPanel jPanelCamposOcultosPerfilUsuario;    	
	protected JPanel jPanelAccionesPerfilUsuario;
	protected JPanel jPanelAccionesFormularioPerfilUsuario;
    
	
	
	protected Integer iXPanelCamposPerfilUsuario=0;
	protected Integer iYPanelCamposPerfilUsuario=0;
	
	protected Integer iXPanelCamposOcultosPerfilUsuario=0;
	protected Integer iYPanelCamposOcultosPerfilUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPerfilUsuario;
	public JButton jButtonModificarPerfilUsuario;
	public JButton jButtonActualizarPerfilUsuario;
    public JButton jButtonEliminarPerfilUsuario;
	public JButton jButtonCancelarPerfilUsuario;
    public JButton jButtonGuardarCambiosPerfilUsuario;
	public JButton jButtonGuardarCambiosTablaPerfilUsuario;
	protected JButton jButtonCerrarPerfilUsuario;
	
	
	protected JButton jButtonProcesarInformacionPerfilUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPerfilUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPerfilUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajePerfilUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilUsuario;
	protected JButton jButtonModificarToolBarPerfilUsuario;
	protected JButton jButtonActualizarToolBarPerfilUsuario;
    protected JButton jButtonEliminarToolBarPerfilUsuario;
	protected JButton jButtonCancelarToolBarPerfilUsuario;
    protected JButton jButtonGuardarCambiosToolBarPerfilUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarPerfilUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilUsuario;
	protected JButton jButtonCerrarToolBarPerfilUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarPerfilUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilUsuario;
	protected JMenuItem jMenuItemModificarPerfilUsuario;
	protected JMenuItem jMenuItemActualizarPerfilUsuario;
    protected JMenuItem jMenuItemEliminarPerfilUsuario;
	protected JMenuItem jMenuItemCancelarPerfilUsuario;
    protected JMenuItem jMenuItemGuardarCambiosPerfilUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilUsuario;
	protected JMenuItem jMenuItemCerrarPerfilUsuario;
	protected JMenuItem jMenuItemDetalleCerrarPerfilUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionPerfilUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilUsuario;
	protected JMenuItem jMenuItemMostrarOcultarPerfilUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPerfilUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPerfilUsuario;
	public JLabel jLabelIdPerfilUsuario;
	public JLabel jLabelidPerfilUsuario;
	public JButton jButtonidPerfilUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelestadoPerfilUsuario;
	public JLabel jLabelestadoPerfilUsuario;
	public JCheckBox jCheckBoxestadoPerfilUsuario;
	public JButton jButtonestadoPerfilUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilPerfilUsuario;
	public JLabel jLabelid_perfilPerfilUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilPerfilUsuario;
	public JButton jButtonid_perfilPerfilUsuario= new JButtonMe();
	public JButton jButtonid_perfilPerfilUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_perfilPerfilUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPerfilUsuario;
	public JLabel jLabelid_usuarioPerfilUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPerfilUsuario;
	public JButton jButtonid_usuarioPerfilUsuario= new JButtonMe();
	public JButton jButtonid_usuarioPerfilUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPerfilUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPerfilUsuario;
	
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
	
	public PerfilUsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPerfilUsuario=new JPanel();
				this.jPanelAccionesFormularioPerfilUsuario=new JPanel();
				this.jmenuBarDetallePerfilUsuario=new JMenuBar();
				this.jTtoolBarDetallePerfilUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PerfilUsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPerfilUsuario() {
		return this.jButtonActualizarToolBarPerfilUsuario;
	}
	
	public JButton getjButtonEliminarToolBarPerfilUsuario() {
		return this.jButtonEliminarToolBarPerfilUsuario;
	}
	
	public JButton getjButtonCancelarToolBarPerfilUsuario() {
		return this.jButtonCancelarToolBarPerfilUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionPerfilUsuario() {
		return this.jButtonProcesarInformacionPerfilUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilUsuario)	{
		this.jButtonProcesarInformacionPerfilUsuario = jButtonProcesarInformacionPerfilUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilUsuario() {
		return this.jComboBoxTiposAccionesPerfilUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilUsuario(
			JComboBox jComboBoxTiposRelacionesPerfilUsuario) {
		this.jComboBoxTiposRelacionesPerfilUsuario = jComboBoxTiposRelacionesPerfilUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilUsuario(
			JComboBox jComboBoxTiposAccionesPerfilUsuario) {
		this.jComboBoxTiposAccionesPerfilUsuario = jComboBoxTiposAccionesPerfilUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPerfilUsuario() {
		return this.jComboBoxTiposAccionesFormularioPerfilUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPerfilUsuario(
			JComboBox jComboBoxTiposAccionesFormularioPerfilUsuario) {
		this.jComboBoxTiposAccionesFormularioPerfilUsuario = jComboBoxTiposAccionesFormularioPerfilUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		
		this.perfilusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilusuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuarios Perfiles  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePerfilUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPerfilUsuario=new JButtonMe();
				this.jButtonModificarToolBarPerfilUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPerfilUsuario,this.jTtoolBarDetallePerfilUsuario,
							"actualizar","actualizar","Actualizar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPerfilUsuario,this.jTtoolBarDetallePerfilUsuario,
							"eliminar","eliminar","Eliminar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPerfilUsuario,this.jTtoolBarDetallePerfilUsuario,
							"cancelar","cancelar","Cancelar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPerfilUsuario,this.jTtoolBarDetallePerfilUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePerfilUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePerfilUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPerfilUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPerfilUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPerfilUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPerfilUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPerfilUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPerfilUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPerfilUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPerfilUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPerfilUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPerfilUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPerfilUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPerfilUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPerfilUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPerfilUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPerfilUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPerfilUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPerfilUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPerfilUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPerfilUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPerfilUsuario.add(this.jMenuItemDetalleCerrarPerfilUsuario);
		
		this.jmenuDetalleAccionesPerfilUsuario.add(this.jMenuItemActualizarPerfilUsuario);
		this.jmenuDetalleAccionesPerfilUsuario.add(this.jMenuItemEliminarPerfilUsuario);
		this.jmenuDetalleAccionesPerfilUsuario.add(this.jMenuItemCancelarPerfilUsuario);		
		
		//this.jmenuDetalleDatosPerfilUsuario.add(this.jMenuItemDetalleAbrirOrderByPerfilUsuario);				
		this.jmenuDetalleDatosPerfilUsuario.add(this.jMenuItemDetalleMostarOcultarPerfilUsuario);				
				
		//this.jmenuDetalleAccionesPerfilUsuario.add(this.jMenuItemGuardarCambiosPerfilUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePerfilUsuario.add(this.jmenuDetalleArchivoPerfilUsuario);		
		this.jmenuBarDetallePerfilUsuario.add(this.jmenuDetalleAccionesPerfilUsuario);		
		this.jmenuBarDetallePerfilUsuario.add(this.jmenuDetalleDatosPerfilUsuario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePerfilUsuario);				
	}
	
	
	public void inicializarElementosCamposPerfilUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPerfilUsuario = new JLabelMe();
		jLabelIdPerfilUsuario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPerfilUsuario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPerfilUsuario.setToolTipText(PerfilUsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPerfilUsuario= new GridBagLayout();

		this.jPanelidPerfilUsuario.setLayout(this.gridaBagLayoutPerfilUsuario);

		jLabelidPerfilUsuario = new JLabel();
		jLabelidPerfilUsuario.setText("Id");

		jLabelidPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelestadoPerfilUsuario = new JLabelMe();
		this.jLabelestadoPerfilUsuario.setText(""+PerfilUsuarioConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPerfilUsuario.setToolTipText("Estado");
		this.jLabelestadoPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPerfilUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPerfilUsuario.setToolTipText(PerfilUsuarioConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPerfilUsuario = new GridBagLayout();
		this.jPanelestadoPerfilUsuario.setLayout(this.gridaBagLayoutPerfilUsuario);


		jCheckBoxestadoPerfilUsuario= new JCheckBoxMe();
		jCheckBoxestadoPerfilUsuario.setEnabled(false);

		jCheckBoxestadoPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoPerfilUsuarioBusqueda= new JButtonMe();
		this.jButtonestadoPerfilUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPerfilUsuarioBusqueda.setText("U");
		this.jButtonestadoPerfilUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPerfilUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPerfilUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPerfilUsuarioBusqueda"));

		if(this.perfilusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPerfilUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPerfilUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_perfilPerfilUsuario = new JLabelMe();
		this.jLabelid_perfilPerfilUsuario.setText(""+PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL+" : *");
		this.jLabelid_perfilPerfilUsuario.setToolTipText("Perfil");
		this.jLabelid_perfilPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_perfilPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_perfilPerfilUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_perfilPerfilUsuario.setToolTipText(PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL);
		this.gridaBagLayoutPerfilUsuario = new GridBagLayout();
		this.jPanelid_perfilPerfilUsuario.setLayout(this.gridaBagLayoutPerfilUsuario);


		jComboBoxid_perfilPerfilUsuario= new JComboBoxMe();
		jComboBoxid_perfilPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_perfilPerfilUsuario= new JButtonMe();
		this.jButtonid_perfilPerfilUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilUsuario.setText("Buscar");
		this.jButtonid_perfilPerfilUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_perfilPerfilUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_perfilPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilUsuario"));

		this.jButtonid_perfilPerfilUsuarioBusqueda= new JButtonMe();
		this.jButtonid_perfilPerfilUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilUsuarioBusqueda.setText("U");
		this.jButtonid_perfilPerfilUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_perfilPerfilUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_perfilPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilUsuarioBusqueda"));

		if(this.perfilusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_perfilPerfilUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_perfilPerfilUsuarioUpdate= new JButtonMe();
		this.jButtonid_perfilPerfilUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilUsuarioUpdate.setText("U");
		this.jButtonid_perfilPerfilUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_perfilPerfilUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_perfilPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilUsuarioUpdate"));



					
		this.jLabelid_usuarioPerfilUsuario = new JLabelMe();
		this.jLabelid_usuarioPerfilUsuario.setText(""+PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPerfilUsuario.setToolTipText("Usuario");
		this.jLabelid_usuarioPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPerfilUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPerfilUsuario.setToolTipText(PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPerfilUsuario = new GridBagLayout();
		this.jPanelid_usuarioPerfilUsuario.setLayout(this.gridaBagLayoutPerfilUsuario);


		jComboBoxid_usuarioPerfilUsuario= new JComboBoxMe();
		jComboBoxid_usuarioPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPerfilUsuario.setEnabled(false);

		this.jButtonid_usuarioPerfilUsuario= new JButtonMe();
		this.jButtonid_usuarioPerfilUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPerfilUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPerfilUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPerfilUsuario.setText("Buscar");
		this.jButtonid_usuarioPerfilUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPerfilUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPerfilUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPerfilUsuario"));

		this.jButtonid_usuarioPerfilUsuarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioPerfilUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPerfilUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPerfilUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPerfilUsuarioBusqueda.setText("U");
		this.jButtonid_usuarioPerfilUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPerfilUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPerfilUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPerfilUsuarioBusqueda"));

		if(this.perfilusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPerfilUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPerfilUsuarioUpdate= new JButtonMe();
		this.jButtonid_usuarioPerfilUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPerfilUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPerfilUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPerfilUsuarioUpdate.setText("U");
		this.jButtonid_usuarioPerfilUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPerfilUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPerfilUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPerfilUsuarioUpdate"));



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
		//this.jInternalFrameDetallePerfilUsuario = new PerfilUsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Usuarios Perfiles  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilUsuario= new GridBagLayout();
		

		
		String sToolTipPerfilUsuario="";
		sToolTipPerfilUsuario=PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilUsuario+="(Seguridad.PerfilUsuario)";
		}
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPerfilUsuario = new JButtonMe();
		this.jButtonModificarPerfilUsuario = new JButtonMe();
        this.jButtonActualizarPerfilUsuario = new JButtonMe();
        this.jButtonEliminarPerfilUsuario = new JButtonMe();
        this.jButtonCancelarPerfilUsuario = new JButtonMe();
        this.jButtonGuardarCambiosPerfilUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaPerfilUsuario = new JButtonMe();
		this.jButtonCerrarPerfilUsuario = new JButtonMe();
		
		this.jScrollPanelDatosPerfilUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionPerfilUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralPerfilUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Usuarios Perfiles ";
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios Perfiles s" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPerfilUsuario.setName("jPanelCamposPerfilUsuario"); 

		this.jPanelCamposOcultosPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPerfilUsuario.setName("jPanelCamposOcultosPerfilUsuario"); 

        this.jPanelAccionesPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilUsuario.setToolTipText("Acciones");
        this.jPanelAccionesPerfilUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPerfilUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPerfilUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPerfilUsuario.setText("Nuevo");
		this.jButtonModificarPerfilUsuario.setText("Editar");
        this.jButtonActualizarPerfilUsuario.setText("Actualizar");
        this.jButtonEliminarPerfilUsuario.setText("Eliminar");
        this.jButtonCancelarPerfilUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosPerfilUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaPerfilUsuario.setText("Guardar");
		this.jButtonCerrarPerfilUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilUsuario,"nuevo_button","Nuevo",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPerfilUsuario,"modificar_button","Editar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPerfilUsuario,"actualizar_button","Actualizar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPerfilUsuario,"eliminar_button","Eliminar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPerfilUsuario,"cancelar_button","Cancelar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPerfilUsuario,"guardarcambios_button","Guardar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilUsuario,"guardarcambiostabla_button","Guardar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilUsuario,"cerrar_button","Salir",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPerfilUsuario.setToolTipText("Nuevo"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPerfilUsuario.setToolTipText("Editar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPerfilUsuario.setToolTipText("Actualizar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPerfilUsuario.setToolTipText("Eliminar)"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPerfilUsuario.setToolTipText("Cancelar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPerfilUsuario.setToolTipText("Guardar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPerfilUsuario.setToolTipText("Guardar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilUsuario.setToolTipText("Salir"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilUsuario";
		inputMap = this.jButtonNuevoPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPerfilUsuario";
		inputMap = this.jButtonActualizarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPerfilUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarPerfilUsuario";
		inputMap = this.jButtonEliminarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPerfilUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarPerfilUsuario";
		inputMap = this.jButtonCancelarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPerfilUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarPerfilUsuario";
		inputMap = this.jButtonCerrarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilUsuario";
		inputMap = this.jButtonGuardarCambiosTablaPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPerfilUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPerfilUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPerfilUsuario.setToolTipText("Nuevo PerfilUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPerfilUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPerfilUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPerfilUsuario.setToolTipText("Sin Cerrar Ventana PerfilUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePerfilUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePerfilUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePerfilUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilUsuario.setText("Accion");
		this.jComboBoxTiposAccionesPerfilUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPerfilUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPerfilUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPerfilUsuario = new JLabelMe();
		
		this.jLabelAccionesPerfilUsuario.setText("Acciones");		
		this.jLabelAccionesPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPerfilUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPerfilUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPerfilUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPerfilUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPerfilUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPerfilUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPerfilUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPerfilUsuario = new GridBagLayout();
		
		this.jPanelCamposPerfilUsuario.setLayout(gridaBagLayoutCamposPerfilUsuario);
		this.jPanelCamposOcultosPerfilUsuario.setLayout(gridaBagLayoutCamposOcultosPerfilUsuario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 0;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPerfilUsuario.add(jLabelIdPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 1;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPerfilUsuario.add(jLabelidPerfilUsuario, this.gridBagConstraintsPerfilUsuario);


	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 0;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_perfilPerfilUsuario.add(jLabelid_perfilPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = 2;
		this.gridBagConstraintsPerfilUsuario.ipadx = 0;
		this.gridBagConstraintsPerfilUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilUsuario.add(jButtonid_perfilPerfilUsuarioBusqueda, this.gridBagConstraintsPerfilUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = 3;
		this.gridBagConstraintsPerfilUsuario.ipadx = 0;
		this.gridBagConstraintsPerfilUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilUsuario.add(jButtonid_perfilPerfilUsuarioUpdate, this.gridBagConstraintsPerfilUsuario);
	}

	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 1;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_perfilPerfilUsuario.add(jComboBoxid_perfilPerfilUsuario, this.gridBagConstraintsPerfilUsuario);


	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 0;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPerfilUsuario.add(jLabelid_usuarioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 2;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_usuarioPerfilUsuario.add(jButtonid_usuarioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = 3;
		this.gridBagConstraintsPerfilUsuario.ipadx = 0;
		this.gridBagConstraintsPerfilUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPerfilUsuario.add(jButtonid_usuarioPerfilUsuarioBusqueda, this.gridBagConstraintsPerfilUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = 4;
		this.gridBagConstraintsPerfilUsuario.ipadx = 0;
		this.gridBagConstraintsPerfilUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPerfilUsuario.add(jButtonid_usuarioPerfilUsuarioUpdate, this.gridBagConstraintsPerfilUsuario);
	}

	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 1;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPerfilUsuario.add(jComboBoxid_usuarioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);


	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 0;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPerfilUsuario.add(jLabelestadoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = 2;
		this.gridBagConstraintsPerfilUsuario.ipadx = 0;
		this.gridBagConstraintsPerfilUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPerfilUsuario.add(jButtonestadoPerfilUsuarioBusqueda, this.gridBagConstraintsPerfilUsuario);
	}

	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilUsuario.gridy = 0;
	this.gridBagConstraintsPerfilUsuario.gridx = 1;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPerfilUsuario.add(jCheckBoxestadoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilUsuario.gridy = iYPanelCamposPerfilUsuario;
	this.gridBagConstraintsPerfilUsuario.gridx = iXPanelCamposPerfilUsuario++;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilUsuario.add(this.jPanelidPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(iXPanelCamposPerfilUsuario % 1==0) {
		iXPanelCamposPerfilUsuario=0;
		iYPanelCamposPerfilUsuario++;
	}
	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilUsuario.gridy = iYPanelCamposPerfilUsuario;
	this.gridBagConstraintsPerfilUsuario.gridx = iXPanelCamposPerfilUsuario++;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilUsuario.add(this.jPanelid_perfilPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(iXPanelCamposPerfilUsuario % 1==0) {
		iXPanelCamposPerfilUsuario=0;
		iYPanelCamposPerfilUsuario++;
	}
	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilUsuario.gridy = iYPanelCamposPerfilUsuario;
	this.gridBagConstraintsPerfilUsuario.gridx = iXPanelCamposPerfilUsuario++;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilUsuario.add(this.jPanelestadoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(iXPanelCamposPerfilUsuario % 1==0) {
		iXPanelCamposPerfilUsuario=0;
		iYPanelCamposPerfilUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilUsuario.gridy = iYPanelCamposOcultosPerfilUsuario;
	this.gridBagConstraintsPerfilUsuario.gridx = iXPanelCamposOcultosPerfilUsuario++;
	this.gridBagConstraintsPerfilUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPerfilUsuario.add(this.jPanelid_usuarioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);



	if(iXPanelCamposOcultosPerfilUsuario % 1==0) {
		iXPanelCamposOcultosPerfilUsuario=0;
		iYPanelCamposOcultosPerfilUsuario++;
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
			
		GridBagLayout gridaBagLayoutAccionesPerfilUsuario= new GridBagLayout();
		this.jPanelAccionesPerfilUsuario.setLayout(gridaBagLayoutAccionesPerfilUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPerfilUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioPerfilUsuario.setLayout(gridaBagLayoutAccionesFormularioPerfilUsuario);
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilUsuario.add(this.jComboBoxTiposAccionesFormularioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilUsuario.add(this.jCheckBoxPostAccionNuevoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilUsuario.add(this.jCheckBoxPostAccionSinCerrarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilUsuario.add(this.jCheckBoxPostAccionSinMensajePerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesPerfilUsuario.add(this.jButtonModificarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);							

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesPerfilUsuario.add(this.jButtonEliminarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
			
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = 0;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilUsuario.add(this.jButtonActualizarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);


		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = 0;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilUsuario.add(this.jButtonGuardarCambiosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);	
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = 0;		
		this.gridBagConstraintsPerfilUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesPerfilUsuario.add(this.jButtonCancelarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();						
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilUsuario.gridx = 0;		
			//this.gridBagConstraintsPerfilUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilUsuario.gridx =0;
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePerfilUsuario = new PerfilUsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Usuarios Perfiles  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Usuarios Perfiles  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuarios Perfiles  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PerfilUsuarioModel perfilusuarioModel=new PerfilUsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//PerfilUsuarioModel.PerfilUsuarioFocusTraversalPolicy perfilusuarioFocusTraversalPolicy = perfilusuarioModel.new PerfilUsuarioFocusTraversalPolicy(this);
			
			//perfilusuarioFocusTraversalPolicy.setperfilusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(perfilusuarioModel);
			
			
			this.jContentPaneDetallePerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePerfilUsuario = new GridBagLayout();	
			this.jContentPaneDetallePerfilUsuario.setLayout(gridaBagLayoutDetallePerfilUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
				this.gridBagConstraintsPerfilUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPerfilUsuario.gridx = 0;
					
				
				this.jContentPaneDetallePerfilUsuario.add(jTtoolBarDetallePerfilUsuario, gridBagConstraintsPerfilUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionPerfilUsuario=   new JScrollPane(jContentPaneDetallePerfilUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPerfilUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPerfilUsuario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPerfilUsuario.gridx = 0;
	        
			this.jContentPaneDetallePerfilUsuario.add(jPanelCamposPerfilUsuario, gridBagConstraintsPerfilUsuario);
			
			
			
			
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
						&& perfilusuarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPerfilUsuario= new GridBagConstraints();
						this.gridBagConstraintsPerfilUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPerfilUsuario.gridx = 0;
						this.jContentPaneDetallePerfilUsuario.add(this.jTabbedPaneRelacionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPerfilUsuario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPerfilUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
					this.gridBagConstraintsPerfilUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPerfilUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPerfilUsuario.gridx = 0;
					
				
					this.jContentPaneDetallePerfilUsuario.add(jPanelCamposOcultosPerfilUsuario, gridBagConstraintsPerfilUsuario);
				
					this.jPanelCamposOcultosPerfilUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPerfilUsuario.gridx = 0;
	        this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePerfilUsuario.add(this.jPanelAccionesFormularioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);							
			
			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
	        this.gridBagConstraintsPerfilUsuario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPerfilUsuario.gridx = 0;
	        
			
			this.jContentPaneDetallePerfilUsuario.add(this.jPanelAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPerfilUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPerfilUsuario=   new JScrollPane(this.jPanelCamposPerfilUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPerfilUsuario.gridx = 0;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPerfilUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
			
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
			
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPerfilUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionPerfilUsuario;
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
