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
import com.bydan.erp.seguridad.util.PerfilAccionConstantesFunciones;

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
public class PerfilAccionDetalleFormJInternalFrame extends PerfilAccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePerfilAccion;
	
	protected JMenuBar jmenuBarDetallePerfilAccion;
	
	protected JMenu jmenuDetallePerfilAccion;
	protected JMenu jmenuDetalleArchivoPerfilAccion;
	protected JMenu jmenuDetalleAccionesPerfilAccion;
	protected JMenu jmenuDetalleDatosPerfilAccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilAccion;	
	protected GridBagConstraints gridBagConstraintsPerfilAccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PerfilAccionBeanSwingJInternalFrameAdditional jInternalFrameDetallePerfilAccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_accion="";
	
	public PerfilAccionSessionBean perfilaccionSessionBean;
	
	
	
	
	public PerfilSessionBean perfilSessionBean;
	public AccionSessionBean accionSessionBean;	
	
	public PerfilAccionLogic perfilaccionLogic;
	
	public JScrollPane jScrollPanelDatosPerfilAccion;
	public JScrollPane jScrollPanelDatosEdicionPerfilAccion;
	public JScrollPane jScrollPanelDatosGeneralPerfilAccion;
	
	protected JPanel jPanelCamposPerfilAccion;    
	protected JPanel jPanelCamposOcultosPerfilAccion;    	
	protected JPanel jPanelAccionesPerfilAccion;
	protected JPanel jPanelAccionesFormularioPerfilAccion;
    
	
	
	protected Integer iXPanelCamposPerfilAccion=0;
	protected Integer iYPanelCamposPerfilAccion=0;
	
	protected Integer iXPanelCamposOcultosPerfilAccion=0;
	protected Integer iYPanelCamposOcultosPerfilAccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPerfilAccion;
	public JButton jButtonModificarPerfilAccion;
	public JButton jButtonActualizarPerfilAccion;
    public JButton jButtonEliminarPerfilAccion;
	public JButton jButtonCancelarPerfilAccion;
    public JButton jButtonGuardarCambiosPerfilAccion;
	public JButton jButtonGuardarCambiosTablaPerfilAccion;
	protected JButton jButtonCerrarPerfilAccion;
	
	
	protected JButton jButtonProcesarInformacionPerfilAccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPerfilAccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPerfilAccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajePerfilAccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilAccion;
	protected JButton jButtonModificarToolBarPerfilAccion;
	protected JButton jButtonActualizarToolBarPerfilAccion;
    protected JButton jButtonEliminarToolBarPerfilAccion;
	protected JButton jButtonCancelarToolBarPerfilAccion;
    protected JButton jButtonGuardarCambiosToolBarPerfilAccion;
	protected JButton jButtonGuardarCambiosTablaToolBarPerfilAccion;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilAccion;
	protected JButton jButtonCerrarToolBarPerfilAccion;
	
	protected JButton jButtonProcesarInformacionToolBarPerfilAccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilAccion;
	protected JMenuItem jMenuItemModificarPerfilAccion;
	protected JMenuItem jMenuItemActualizarPerfilAccion;
    protected JMenuItem jMenuItemEliminarPerfilAccion;
	protected JMenuItem jMenuItemCancelarPerfilAccion;
    protected JMenuItem jMenuItemGuardarCambiosPerfilAccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilAccion;
	protected JMenuItem jMenuItemCerrarPerfilAccion;
	protected JMenuItem jMenuItemDetalleCerrarPerfilAccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilAccion;
	
	protected JMenuItem jMenuItemProcesarInformacionPerfilAccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilAccion;
	protected JMenuItem jMenuItemMostrarOcultarPerfilAccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilAccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilAccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPerfilAccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPerfilAccion;
	public JLabel jLabelIdPerfilAccion;
	public JLabel jLabelidPerfilAccion;
	public JButton jButtonidPerfilAccionBusqueda= new JButtonMe();

	public JPanel jPanelejecusionPerfilAccion;
	public JLabel jLabelejecusionPerfilAccion;
	public JCheckBox jCheckBoxejecusionPerfilAccion;
	public JButton jButtonejecusionPerfilAccionBusqueda= new JButtonMe();

	public JPanel jPanelestadoPerfilAccion;
	public JLabel jLabelestadoPerfilAccion;
	public JCheckBox jCheckBoxestadoPerfilAccion;
	public JButton jButtonestadoPerfilAccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilPerfilAccion;
	public JLabel jLabelid_perfilPerfilAccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilPerfilAccion;
	public JButton jButtonid_perfilPerfilAccion= new JButtonMe();
	public JButton jButtonid_perfilPerfilAccionUpdate= new JButtonMe();
	public JButton jButtonid_perfilPerfilAccionBusqueda= new JButtonMe();

	public JPanel jPanelid_accionPerfilAccion;
	public JLabel jLabelid_accionPerfilAccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_accionPerfilAccion;
	public JButton jButtonid_accionPerfilAccion= new JButtonMe();
	public JButton jButtonid_accionPerfilAccionUpdate= new JButtonMe();
	public JButton jButtonid_accionPerfilAccionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPerfilAccion;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PerfilAccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPerfilAccion=new JPanel();
				this.jPanelAccionesFormularioPerfilAccion=new JPanel();
				this.jmenuBarDetallePerfilAccion=new JMenuBar();
				this.jTtoolBarDetallePerfilAccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PerfilAccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPerfilAccion() {
		return this.jButtonActualizarToolBarPerfilAccion;
	}
	
	public JButton getjButtonEliminarToolBarPerfilAccion() {
		return this.jButtonEliminarToolBarPerfilAccion;
	}
	
	public JButton getjButtonCancelarToolBarPerfilAccion() {
		return this.jButtonCancelarToolBarPerfilAccion;
	}		
	
	public JButton getjButtonProcesarInformacionPerfilAccion() {
		return this.jButtonProcesarInformacionPerfilAccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilAccion)	{
		this.jButtonProcesarInformacionPerfilAccion = jButtonProcesarInformacionPerfilAccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilAccion() {
		return this.jComboBoxTiposAccionesPerfilAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilAccion(
			JComboBox jComboBoxTiposRelacionesPerfilAccion) {
		this.jComboBoxTiposRelacionesPerfilAccion = jComboBoxTiposRelacionesPerfilAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilAccion(
			JComboBox jComboBoxTiposAccionesPerfilAccion) {
		this.jComboBoxTiposAccionesPerfilAccion = jComboBoxTiposAccionesPerfilAccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPerfilAccion() {
		return this.jComboBoxTiposAccionesFormularioPerfilAccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPerfilAccion(
			JComboBox jComboBoxTiposAccionesFormularioPerfilAccion) {
		this.jComboBoxTiposAccionesFormularioPerfilAccion = jComboBoxTiposAccionesFormularioPerfilAccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfilaccionSessionBean=new PerfilAccionSessionBean();
		
		this.perfilaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilaccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilAccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Accion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
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
	
		PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePerfilAccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPerfilAccion=new JButtonMe();
				this.jButtonModificarToolBarPerfilAccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPerfilAccion,this.jTtoolBarDetallePerfilAccion,
							"actualizar","actualizar","Actualizar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPerfilAccion,this.jTtoolBarDetallePerfilAccion,
							"eliminar","eliminar","Eliminar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPerfilAccion,this.jTtoolBarDetallePerfilAccion,
							"cancelar","cancelar","Cancelar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPerfilAccion,this.jTtoolBarDetallePerfilAccion,
							"guardarcambios","guardarcambios","Guardar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePerfilAccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePerfilAccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPerfilAccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPerfilAccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPerfilAccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilAccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilAccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilAccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPerfilAccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPerfilAccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPerfilAccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPerfilAccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPerfilAccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPerfilAccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPerfilAccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPerfilAccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPerfilAccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPerfilAccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPerfilAccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPerfilAccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPerfilAccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilAccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilAccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilAccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilAccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilAccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPerfilAccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPerfilAccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPerfilAccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilAccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilAccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPerfilAccion.add(this.jMenuItemDetalleCerrarPerfilAccion);
		
		this.jmenuDetalleAccionesPerfilAccion.add(this.jMenuItemActualizarPerfilAccion);
		this.jmenuDetalleAccionesPerfilAccion.add(this.jMenuItemEliminarPerfilAccion);
		this.jmenuDetalleAccionesPerfilAccion.add(this.jMenuItemCancelarPerfilAccion);		
		
		//this.jmenuDetalleDatosPerfilAccion.add(this.jMenuItemDetalleAbrirOrderByPerfilAccion);				
		this.jmenuDetalleDatosPerfilAccion.add(this.jMenuItemDetalleMostarOcultarPerfilAccion);				
				
		//this.jmenuDetalleAccionesPerfilAccion.add(this.jMenuItemGuardarCambiosPerfilAccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePerfilAccion.add(this.jmenuDetalleArchivoPerfilAccion);		
		this.jmenuBarDetallePerfilAccion.add(this.jmenuDetalleAccionesPerfilAccion);		
		this.jmenuBarDetallePerfilAccion.add(this.jmenuDetalleDatosPerfilAccion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePerfilAccion);				
	}
	
	
	public void inicializarElementosCamposPerfilAccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPerfilAccion = new JLabelMe();
		jLabelIdPerfilAccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPerfilAccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPerfilAccion.setToolTipText(PerfilAccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPerfilAccion= new GridBagLayout();

		this.jPanelidPerfilAccion.setLayout(this.gridaBagLayoutPerfilAccion);

		jLabelidPerfilAccion = new JLabel();
		jLabelidPerfilAccion.setText("Id");

		jLabelidPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelejecusionPerfilAccion = new JLabelMe();
		this.jLabelejecusionPerfilAccion.setText(""+PerfilAccionConstantesFunciones.LABEL_EJECUSION+" : *");
		this.jLabelejecusionPerfilAccion.setToolTipText("Ejecusion");
		this.jLabelejecusionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelejecusionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelejecusionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelejecusionPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelejecusionPerfilAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelejecusionPerfilAccion.setToolTipText(PerfilAccionConstantesFunciones.LABEL_EJECUSION);
		this.gridaBagLayoutPerfilAccion = new GridBagLayout();
		this.jPanelejecusionPerfilAccion.setLayout(this.gridaBagLayoutPerfilAccion);


		jCheckBoxejecusionPerfilAccion= new JCheckBoxMe();
		jCheckBoxejecusionPerfilAccion.setEnabled(false);

		jCheckBoxejecusionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxejecusionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxejecusionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxejecusionPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonejecusionPerfilAccionBusqueda= new JButtonMe();
		this.jButtonejecusionPerfilAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonejecusionPerfilAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonejecusionPerfilAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonejecusionPerfilAccionBusqueda.setText("U");
		this.jButtonejecusionPerfilAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonejecusionPerfilAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonejecusionPerfilAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxejecusionPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxejecusionPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ejecusionPerfilAccionBusqueda"));

		if(this.perfilaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonejecusionPerfilAccionBusqueda.setVisible(false);		}


					
		this.jLabelestadoPerfilAccion = new JLabelMe();
		this.jLabelestadoPerfilAccion.setText(""+PerfilAccionConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPerfilAccion.setToolTipText("Estado");
		this.jLabelestadoPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPerfilAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPerfilAccion.setToolTipText(PerfilAccionConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPerfilAccion = new GridBagLayout();
		this.jPanelestadoPerfilAccion.setLayout(this.gridaBagLayoutPerfilAccion);


		jCheckBoxestadoPerfilAccion= new JCheckBoxMe();
		jCheckBoxestadoPerfilAccion.setEnabled(false);

		jCheckBoxestadoPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoPerfilAccionBusqueda= new JButtonMe();
		this.jButtonestadoPerfilAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPerfilAccionBusqueda.setText("U");
		this.jButtonestadoPerfilAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPerfilAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPerfilAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPerfilAccionBusqueda"));

		if(this.perfilaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPerfilAccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPerfilAccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_perfilPerfilAccion = new JLabelMe();
		this.jLabelid_perfilPerfilAccion.setText(""+PerfilAccionConstantesFunciones.LABEL_IDPERFIL+" : *");
		this.jLabelid_perfilPerfilAccion.setToolTipText("Perfil");
		this.jLabelid_perfilPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_perfilPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_perfilPerfilAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_perfilPerfilAccion.setToolTipText(PerfilAccionConstantesFunciones.LABEL_IDPERFIL);
		this.gridaBagLayoutPerfilAccion = new GridBagLayout();
		this.jPanelid_perfilPerfilAccion.setLayout(this.gridaBagLayoutPerfilAccion);


		jComboBoxid_perfilPerfilAccion= new JComboBoxMe();
		jComboBoxid_perfilPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_perfilPerfilAccion= new JButtonMe();
		this.jButtonid_perfilPerfilAccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilAccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilAccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilAccion.setText("Buscar");
		this.jButtonid_perfilPerfilAccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_perfilPerfilAccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilAccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_perfilPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilAccion"));

		this.jButtonid_perfilPerfilAccionBusqueda= new JButtonMe();
		this.jButtonid_perfilPerfilAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilAccionBusqueda.setText("U");
		this.jButtonid_perfilPerfilAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_perfilPerfilAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_perfilPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilAccionBusqueda"));

		if(this.perfilaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_perfilPerfilAccionBusqueda.setVisible(false);		}

		this.jButtonid_perfilPerfilAccionUpdate= new JButtonMe();
		this.jButtonid_perfilPerfilAccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilAccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilAccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilAccionUpdate.setText("U");
		this.jButtonid_perfilPerfilAccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_perfilPerfilAccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilAccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_perfilPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilAccionUpdate"));



					
		this.jLabelid_accionPerfilAccion = new JLabelMe();
		this.jLabelid_accionPerfilAccion.setText(""+PerfilAccionConstantesFunciones.LABEL_IDACCION+" : *");
		this.jLabelid_accionPerfilAccion.setToolTipText("Accion");
		this.jLabelid_accionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_accionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_accionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_accionPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_accionPerfilAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_accionPerfilAccion.setToolTipText(PerfilAccionConstantesFunciones.LABEL_IDACCION);
		this.gridaBagLayoutPerfilAccion = new GridBagLayout();
		this.jPanelid_accionPerfilAccion.setLayout(this.gridaBagLayoutPerfilAccion);


		jComboBoxid_accionPerfilAccion= new JComboBoxMe();
		jComboBoxid_accionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_accionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_accionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_accionPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_accionPerfilAccion= new JButtonMe();
		this.jButtonid_accionPerfilAccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_accionPerfilAccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_accionPerfilAccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_accionPerfilAccion.setText("Buscar");
		this.jButtonid_accionPerfilAccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_accionPerfilAccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_accionPerfilAccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_accionPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_accionPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_accionPerfilAccion"));

		this.jButtonid_accionPerfilAccionBusqueda= new JButtonMe();
		this.jButtonid_accionPerfilAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_accionPerfilAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_accionPerfilAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_accionPerfilAccionBusqueda.setText("U");
		this.jButtonid_accionPerfilAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_accionPerfilAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_accionPerfilAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_accionPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_accionPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_accionPerfilAccionBusqueda"));

		if(this.perfilaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_accionPerfilAccionBusqueda.setVisible(false);		}

		this.jButtonid_accionPerfilAccionUpdate= new JButtonMe();
		this.jButtonid_accionPerfilAccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_accionPerfilAccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_accionPerfilAccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_accionPerfilAccionUpdate.setText("U");
		this.jButtonid_accionPerfilAccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_accionPerfilAccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_accionPerfilAccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_accionPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_accionPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_accionPerfilAccionUpdate"));



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
		//this.jInternalFrameDetallePerfilAccion = new PerfilAccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Perfil Accion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilAccion= new GridBagLayout();
		

		
		String sToolTipPerfilAccion="";
		sToolTipPerfilAccion=PerfilAccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilAccion+="(Seguridad.PerfilAccion)";
		}
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilAccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPerfilAccion = new JButtonMe();
		this.jButtonModificarPerfilAccion = new JButtonMe();
        this.jButtonActualizarPerfilAccion = new JButtonMe();
        this.jButtonEliminarPerfilAccion = new JButtonMe();
        this.jButtonCancelarPerfilAccion = new JButtonMe();
        this.jButtonGuardarCambiosPerfilAccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaPerfilAccion = new JButtonMe();
		this.jButtonCerrarPerfilAccion = new JButtonMe();
		
		this.jScrollPanelDatosPerfilAccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionPerfilAccion = new JScrollPane();
		this.jScrollPanelDatosGeneralPerfilAccion = new JScrollPane();
				
		
		
		this.jPanelCamposPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil Accion";
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Acciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPerfilAccion.setName("jPanelCamposPerfilAccion"); 

		this.jPanelCamposOcultosPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPerfilAccion.setName("jPanelCamposOcultosPerfilAccion"); 

        this.jPanelAccionesPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilAccion.setToolTipText("Acciones");
        this.jPanelAccionesPerfilAccion.setName("Acciones"); 

		this.jPanelAccionesFormularioPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPerfilAccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPerfilAccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPerfilAccion.setText("Nuevo");
		this.jButtonModificarPerfilAccion.setText("Editar");
        this.jButtonActualizarPerfilAccion.setText("Actualizar");
        this.jButtonEliminarPerfilAccion.setText("Eliminar");
        this.jButtonCancelarPerfilAccion.setText("Cancelar");
        this.jButtonGuardarCambiosPerfilAccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaPerfilAccion.setText("Guardar");
		this.jButtonCerrarPerfilAccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilAccion,"nuevo_button","Nuevo",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPerfilAccion,"modificar_button","Editar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPerfilAccion,"actualizar_button","Actualizar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPerfilAccion,"eliminar_button","Eliminar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPerfilAccion,"cancelar_button","Cancelar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPerfilAccion,"guardarcambios_button","Guardar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilAccion,"guardarcambiostabla_button","Guardar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilAccion,"cerrar_button","Salir",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPerfilAccion.setToolTipText("Nuevo"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPerfilAccion.setToolTipText("Editar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPerfilAccion.setToolTipText("Actualizar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPerfilAccion.setToolTipText("Eliminar)"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPerfilAccion.setToolTipText("Cancelar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPerfilAccion.setToolTipText("Guardar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPerfilAccion.setToolTipText("Guardar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilAccion.setToolTipText("Salir"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilAccion";
		inputMap = this.jButtonNuevoPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilAccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPerfilAccion";
		inputMap = this.jButtonActualizarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPerfilAccion"));
		
		//ELIMINAR
		sMapKey = "EliminarPerfilAccion";
		inputMap = this.jButtonEliminarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPerfilAccion"));
		
		//CANCELAR	
		sMapKey = "CancelarPerfilAccion";
		inputMap = this.jButtonCancelarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPerfilAccion"));
		
		//CERRAR		
		sMapKey = "CerrarPerfilAccion";
		inputMap = this.jButtonCerrarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilAccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilAccion";
		inputMap = this.jButtonGuardarCambiosTablaPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilAccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPerfilAccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPerfilAccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPerfilAccion.setToolTipText("Nuevo PerfilAccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPerfilAccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPerfilAccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPerfilAccion.setToolTipText("Sin Cerrar Ventana PerfilAccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePerfilAccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePerfilAccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePerfilAccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilAccion.setText("Accion");
		this.jComboBoxTiposAccionesPerfilAccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPerfilAccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPerfilAccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPerfilAccion = new JLabelMe();
		
		this.jLabelAccionesPerfilAccion.setText("Acciones");		
		this.jLabelAccionesPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPerfilAccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPerfilAccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPerfilAccion=new JTabbedPane();
		this.jTabbedPaneRelacionesPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPerfilAccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPerfilAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPerfilAccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilAccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilAccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPerfilAccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPerfilAccion = new GridBagLayout();
		
		this.jPanelCamposPerfilAccion.setLayout(gridaBagLayoutCamposPerfilAccion);
		this.jPanelCamposOcultosPerfilAccion.setLayout(gridaBagLayoutCamposOcultosPerfilAccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 0;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPerfilAccion.add(jLabelIdPerfilAccion, this.gridBagConstraintsPerfilAccion);



	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 1;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPerfilAccion.add(jLabelidPerfilAccion, this.gridBagConstraintsPerfilAccion);


	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 0;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_perfilPerfilAccion.add(jLabelid_perfilPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 2;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_perfilPerfilAccion.add(jButtonid_perfilPerfilAccion, this.gridBagConstraintsPerfilAccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 3;
		this.gridBagConstraintsPerfilAccion.ipadx = 0;
		this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilAccion.add(jButtonid_perfilPerfilAccionBusqueda, this.gridBagConstraintsPerfilAccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 4;
		this.gridBagConstraintsPerfilAccion.ipadx = 0;
		this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilAccion.add(jButtonid_perfilPerfilAccionUpdate, this.gridBagConstraintsPerfilAccion);
	}

	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 1;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_perfilPerfilAccion.add(jComboBoxid_perfilPerfilAccion, this.gridBagConstraintsPerfilAccion);


	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 0;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_accionPerfilAccion.add(jLabelid_accionPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 2;
		this.gridBagConstraintsPerfilAccion.ipadx = 0;
		this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_accionPerfilAccion.add(jButtonid_accionPerfilAccionBusqueda, this.gridBagConstraintsPerfilAccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 3;
		this.gridBagConstraintsPerfilAccion.ipadx = 0;
		this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_accionPerfilAccion.add(jButtonid_accionPerfilAccionUpdate, this.gridBagConstraintsPerfilAccion);
	}

	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 1;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_accionPerfilAccion.add(jComboBoxid_accionPerfilAccion, this.gridBagConstraintsPerfilAccion);


	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 0;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelejecusionPerfilAccion.add(jLabelejecusionPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 2;
		this.gridBagConstraintsPerfilAccion.ipadx = 0;
		this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelejecusionPerfilAccion.add(jButtonejecusionPerfilAccionBusqueda, this.gridBagConstraintsPerfilAccion);
	}

	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 1;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelejecusionPerfilAccion.add(jCheckBoxejecusionPerfilAccion, this.gridBagConstraintsPerfilAccion);


	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 0;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPerfilAccion.add(jLabelestadoPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 2;
		this.gridBagConstraintsPerfilAccion.ipadx = 0;
		this.gridBagConstraintsPerfilAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPerfilAccion.add(jButtonestadoPerfilAccionBusqueda, this.gridBagConstraintsPerfilAccion);
	}

	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilAccion.gridy = 0;
	this.gridBagConstraintsPerfilAccion.gridx = 1;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPerfilAccion.add(jCheckBoxestadoPerfilAccion, this.gridBagConstraintsPerfilAccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilAccion.gridy = iYPanelCamposPerfilAccion;
	this.gridBagConstraintsPerfilAccion.gridx = iXPanelCamposPerfilAccion++;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilAccion.add(this.jPanelidPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(iXPanelCamposPerfilAccion % 1==0) {
		iXPanelCamposPerfilAccion=0;
		iYPanelCamposPerfilAccion++;
	}
	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilAccion.gridy = iYPanelCamposPerfilAccion;
	this.gridBagConstraintsPerfilAccion.gridx = iXPanelCamposPerfilAccion++;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilAccion.add(this.jPanelid_perfilPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(iXPanelCamposPerfilAccion % 1==0) {
		iXPanelCamposPerfilAccion=0;
		iYPanelCamposPerfilAccion++;
	}
	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilAccion.gridy = iYPanelCamposPerfilAccion;
	this.gridBagConstraintsPerfilAccion.gridx = iXPanelCamposPerfilAccion++;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilAccion.add(this.jPanelid_accionPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(iXPanelCamposPerfilAccion % 1==0) {
		iXPanelCamposPerfilAccion=0;
		iYPanelCamposPerfilAccion++;
	}
	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilAccion.gridy = iYPanelCamposPerfilAccion;
	this.gridBagConstraintsPerfilAccion.gridx = iXPanelCamposPerfilAccion++;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilAccion.add(this.jPanelejecusionPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(iXPanelCamposPerfilAccion % 1==0) {
		iXPanelCamposPerfilAccion=0;
		iYPanelCamposPerfilAccion++;
	}
	this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilAccion.gridy = iYPanelCamposPerfilAccion;
	this.gridBagConstraintsPerfilAccion.gridx = iXPanelCamposPerfilAccion++;
	this.gridBagConstraintsPerfilAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilAccion.add(this.jPanelestadoPerfilAccion, this.gridBagConstraintsPerfilAccion);



	if(iXPanelCamposPerfilAccion % 1==0) {
		iXPanelCamposPerfilAccion=0;
		iYPanelCamposPerfilAccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesPerfilAccion= new GridBagLayout();
		this.jPanelAccionesPerfilAccion.setLayout(gridaBagLayoutAccionesPerfilAccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPerfilAccion= new GridBagLayout();
		this.jPanelAccionesFormularioPerfilAccion.setLayout(gridaBagLayoutAccionesFormularioPerfilAccion);
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilAccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilAccion.add(this.jComboBoxTiposAccionesFormularioPerfilAccion, this.gridBagConstraintsPerfilAccion);

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilAccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilAccion.add(this.jCheckBoxPostAccionNuevoPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilAccion.add(this.jCheckBoxPostAccionSinCerrarPerfilAccion, this.gridBagConstraintsPerfilAccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilAccion.add(this.jCheckBoxPostAccionSinMensajePerfilAccion, this.gridBagConstraintsPerfilAccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesPerfilAccion.add(this.jButtonModificarPerfilAccion, this.gridBagConstraintsPerfilAccion);							

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesPerfilAccion.add(this.jButtonEliminarPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
			
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = 0;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilAccion.add(this.jButtonActualizarPerfilAccion, this.gridBagConstraintsPerfilAccion);


		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = 0;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilAccion.add(this.jButtonGuardarCambiosPerfilAccion, this.gridBagConstraintsPerfilAccion);	
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = 0;		
		this.gridBagConstraintsPerfilAccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesPerfilAccion.add(this.jButtonCancelarPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilAccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilAccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();						
			this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilAccion.gridx = 0;		
			//this.gridBagConstraintsPerfilAccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilAccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilAccion.gridx =0;
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilAccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilAccion, this.gridBagConstraintsPerfilAccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePerfilAccion = new PerfilAccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Perfil Accion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Perfil Accion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Accion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PerfilAccionModel perfilaccionModel=new PerfilAccionModel(this);
			
			//SI USARA CLASE INTERNA
			//PerfilAccionModel.PerfilAccionFocusTraversalPolicy perfilaccionFocusTraversalPolicy = perfilaccionModel.new PerfilAccionFocusTraversalPolicy(this);
			
			//perfilaccionFocusTraversalPolicy.setperfilaccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(perfilaccionModel);
			
			
			this.jContentPaneDetallePerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePerfilAccion = new GridBagLayout();	
			this.jContentPaneDetallePerfilAccion.setLayout(gridaBagLayoutDetallePerfilAccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilAccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
				this.gridBagConstraintsPerfilAccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPerfilAccion.gridx = 0;
					
				
				this.jContentPaneDetallePerfilAccion.add(jTtoolBarDetallePerfilAccion, gridBagConstraintsPerfilAccion);								
				
}
			
			this.jScrollPanelDatosEdicionPerfilAccion=   new JScrollPane(jContentPaneDetallePerfilAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPerfilAccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPerfilAccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPerfilAccion.gridx = 0;
	        
			this.jContentPaneDetallePerfilAccion.add(jPanelCamposPerfilAccion, gridBagConstraintsPerfilAccion);
			
			
			
			
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
						&& perfilaccionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPerfilAccion= new GridBagConstraints();
						this.gridBagConstraintsPerfilAccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPerfilAccion.gridx = 0;
						this.jContentPaneDetallePerfilAccion.add(this.jTabbedPaneRelacionesPerfilAccion, this.gridBagConstraintsPerfilAccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPerfilAccion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPerfilAccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
					this.gridBagConstraintsPerfilAccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPerfilAccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPerfilAccion.gridx = 0;
					
				
					this.jContentPaneDetallePerfilAccion.add(jPanelCamposOcultosPerfilAccion, gridBagConstraintsPerfilAccion);
				
					this.jPanelCamposOcultosPerfilAccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPerfilAccion.gridx = 0;
	        this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePerfilAccion.add(this.jPanelAccionesFormularioPerfilAccion, this.gridBagConstraintsPerfilAccion);							
			
			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
	        this.gridBagConstraintsPerfilAccion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPerfilAccion.gridx = 0;
	        
			
			this.jContentPaneDetallePerfilAccion.add(this.jPanelAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPerfilAccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPerfilAccion=   new JScrollPane(this.jPanelCamposPerfilAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPerfilAccion.gridx = 0;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPerfilAccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilAccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPerfilAccion, this.gridBagConstraintsPerfilAccion);			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilAccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
			
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
			
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPerfilAccion;//jContentPane;
		
		return jScrollPanelDatosEdicionPerfilAccion;
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
