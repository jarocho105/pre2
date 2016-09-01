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
import com.bydan.erp.seguridad.util.AccionConstantesFunciones;

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
public class AccionDetalleFormJInternalFrame extends AccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAccion;
	
	protected JMenuBar jmenuBarDetalleAccion;
	
	protected JMenu jmenuDetalleAccion;
	protected JMenu jmenuDetalleArchivoAccion;
	protected JMenu jmenuDetalleAccionesAccion;
	protected JMenu jmenuDetalleDatosAccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAccion;	
	protected GridBagConstraints gridBagConstraintsAccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleAccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public AccionSessionBean accionSessionBean;
	
	

	public PerfilAccionBeanSwingJInternalFrame perfilaccionBeanSwingJInternalFrame=null;
	public PerfilAccionBeanSwingJInternalFrame perfilaccionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilAccion=false;
	public PerfilAccionSessionBean perfilaccionSessionBean;
	
	
	public OpcionSessionBean opcionSessionBean;	
	
	public AccionLogic accionLogic;
	
	public JScrollPane jScrollPanelDatosAccion;
	public JScrollPane jScrollPanelDatosEdicionAccion;
	public JScrollPane jScrollPanelDatosGeneralAccion;
	
	protected JPanel jPanelCamposAccion;    
	protected JPanel jPanelCamposOcultosAccion;    	
	protected JPanel jPanelAccionesAccion;
	protected JPanel jPanelAccionesFormularioAccion;
    
	
	
	protected Integer iXPanelCamposAccion=0;
	protected Integer iYPanelCamposAccion=0;
	
	protected Integer iXPanelCamposOcultosAccion=0;
	protected Integer iYPanelCamposOcultosAccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAccion;
	public JButton jButtonModificarAccion;
	public JButton jButtonActualizarAccion;
    public JButton jButtonEliminarAccion;
	public JButton jButtonCancelarAccion;
    public JButton jButtonGuardarCambiosAccion;
	public JButton jButtonGuardarCambiosTablaAccion;
	protected JButton jButtonCerrarAccion;
	
	
	protected JButton jButtonProcesarInformacionAccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAccion;
	protected JButton jButtonModificarToolBarAccion;
	protected JButton jButtonActualizarToolBarAccion;
    protected JButton jButtonEliminarToolBarAccion;
	protected JButton jButtonCancelarToolBarAccion;
    protected JButton jButtonGuardarCambiosToolBarAccion;
	protected JButton jButtonGuardarCambiosTablaToolBarAccion;
	protected JButton jButtonMostrarOcultarTablaToolBarAccion;
	protected JButton jButtonCerrarToolBarAccion;
	
	protected JButton jButtonProcesarInformacionToolBarAccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAccion;
	protected JMenuItem jMenuItemModificarAccion;
	protected JMenuItem jMenuItemActualizarAccion;
    protected JMenuItem jMenuItemEliminarAccion;
	protected JMenuItem jMenuItemCancelarAccion;
    protected JMenuItem jMenuItemGuardarCambiosAccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaAccion;
	protected JMenuItem jMenuItemCerrarAccion;
	protected JMenuItem jMenuItemDetalleCerrarAccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarAccion;
	
	protected JMenuItem jMenuItemProcesarInformacionAccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAccion;
	protected JMenuItem jMenuItemMostrarOcultarAccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAccion;
	public JLabel jLabelIdAccion;
	public JLabel jLabelidAccion;
	public JButton jButtonidAccionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAccion;
	public JLabel jLabelcodigoAccion;
	public JTextField jTextFieldcodigoAccion;
	public JButton jButtoncodigoAccionBusqueda= new JButtonMe();

	public JPanel jPanelnombreAccion;
	public JLabel jLabelnombreAccion;
	public JTextArea jTextAreanombreAccion;
	public JScrollPane jscrollPanenombreAccion;
	public JButton jButtonnombreAccionBusqueda= new JButtonMe();

	public JPanel jPanelsolo_formAccion;
	public JLabel jLabelsolo_formAccion;
	public JCheckBox jCheckBoxsolo_formAccion;
	public JButton jButtonsolo_formAccionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAccion;
	public JLabel jLabeldescripcionAccion;
	public JTextArea jTextAreadescripcionAccion;
	public JScrollPane jscrollPanedescripcionAccion;
	public JButton jButtondescripcionAccionBusqueda= new JButtonMe();

	public JPanel jPanelordenAccion;
	public JLabel jLabelordenAccion;
	public JTextField jTextFieldordenAccion;
	public JButton jButtonordenAccionBusqueda= new JButtonMe();

	public JPanel jPanelestadoAccion;
	public JLabel jLabelestadoAccion;
	public JCheckBox jCheckBoxestadoAccion;
	public JButton jButtonestadoAccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_opcionAccion;
	public JLabel jLabelid_opcionAccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionAccion;
	public JButton jButtonid_opcionAccion= new JButtonMe();
	public JButton jButtonid_opcionAccionUpdate= new JButtonMe();
	public JButton jButtonid_opcionAccionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionAccionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAccion;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAccion=new JPanel();
				this.jPanelAccionesFormularioAccion=new JPanel();
				this.jmenuBarDetalleAccion=new JMenuBar();
				this.jTtoolBarDetalleAccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAccion() {
		return this.jButtonActualizarToolBarAccion;
	}
	
	public JButton getjButtonEliminarToolBarAccion() {
		return this.jButtonEliminarToolBarAccion;
	}
	
	public JButton getjButtonCancelarToolBarAccion() {
		return this.jButtonCancelarToolBarAccion;
	}		
	
	public JButton getjButtonProcesarInformacionAccion() {
		return this.jButtonProcesarInformacionAccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAccion)	{
		this.jButtonProcesarInformacionAccion = jButtonProcesarInformacionAccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAccion() {
		return this.jComboBoxTiposAccionesAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAccion(
			JComboBox jComboBoxTiposRelacionesAccion) {
		this.jComboBoxTiposRelacionesAccion = jComboBoxTiposRelacionesAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAccion(
			JComboBox jComboBoxTiposAccionesAccion) {
		this.jComboBoxTiposAccionesAccion = jComboBoxTiposAccionesAccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAccion() {
		return this.jComboBoxTiposAccionesFormularioAccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAccion(
			JComboBox jComboBoxTiposAccionesFormularioAccion) {
		this.jComboBoxTiposAccionesFormularioAccion = jComboBoxTiposAccionesFormularioAccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.accionSessionBean=new AccionSessionBean();
		
		this.accionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.accionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.accionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.perfilaccionSessionBean=new PerfilAccionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Accion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
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
	
		AccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAccion=new JButtonMe();
				this.jButtonModificarToolBarAccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAccion,this.jTtoolBarDetalleAccion,
							"actualizar","actualizar","Actualizar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAccion,this.jTtoolBarDetalleAccion,
							"eliminar","eliminar","Eliminar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAccion,this.jTtoolBarDetalleAccion,
							"cancelar","cancelar","Cancelar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAccion,this.jTtoolBarDetalleAccion,
							"guardarcambios","guardarcambios","Guardar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAccion.add(this.jMenuItemDetalleCerrarAccion);
		
		this.jmenuDetalleAccionesAccion.add(this.jMenuItemActualizarAccion);
		this.jmenuDetalleAccionesAccion.add(this.jMenuItemEliminarAccion);
		this.jmenuDetalleAccionesAccion.add(this.jMenuItemCancelarAccion);		
		
		//this.jmenuDetalleDatosAccion.add(this.jMenuItemDetalleAbrirOrderByAccion);				
		this.jmenuDetalleDatosAccion.add(this.jMenuItemDetalleMostarOcultarAccion);				
				
		//this.jmenuDetalleAccionesAccion.add(this.jMenuItemGuardarCambiosAccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAccion.add(this.jmenuDetalleArchivoAccion);		
		this.jmenuBarDetalleAccion.add(this.jmenuDetalleAccionesAccion);		
		this.jmenuBarDetalleAccion.add(this.jmenuDetalleDatosAccion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAccion.add(this.jmenuDetalleAccion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAccion);				
	}
	
	
	public void inicializarElementosCamposAccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAccion = new JLabelMe();
		jLabelIdAccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAccion.setToolTipText(AccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAccion= new GridBagLayout();

		this.jPanelidAccion.setLayout(this.gridaBagLayoutAccion);

		jLabelidAccion = new JLabel();
		jLabelidAccion.setText("Id");

		jLabelidAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoAccion = new JLabelMe();
		this.jLabelcodigoAccion.setText(""+AccionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoAccion.setToolTipText("Codigo");
		this.jLabelcodigoAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAccion.setToolTipText(AccionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPanelcodigoAccion.setLayout(this.gridaBagLayoutAccion);


		jTextFieldcodigoAccion= new JTextFieldMe();

		jTextFieldcodigoAccion.setEnabled(false);
		jTextFieldcodigoAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAccionBusqueda= new JButtonMe();
		this.jButtoncodigoAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAccionBusqueda.setText("U");
		this.jButtoncodigoAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAccionBusqueda.setVisible(false);		}


					
		this.jLabelnombreAccion = new JLabelMe();
		this.jLabelnombreAccion.setText(""+AccionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAccion.setToolTipText("Nombre");
		this.jLabelnombreAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAccion.setToolTipText(AccionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPanelnombreAccion.setLayout(this.gridaBagLayoutAccion);


		jTextAreanombreAccion= new JTextAreaMe();
		jTextAreanombreAccion.setEnabled(false);
		jTextAreanombreAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAccion.setLineWrap(true);
		jTextAreanombreAccion.setWrapStyleWord(true);
		jTextAreanombreAccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreAccion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreAccion = new JScrollPane(jTextAreanombreAccion);
		jscrollPanenombreAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAccionBusqueda= new JButtonMe();
		this.jButtonnombreAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAccionBusqueda.setText("U");
		this.jButtonnombreAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAccionBusqueda.setVisible(false);		}


					
		this.jLabelsolo_formAccion = new JLabelMe();
		this.jLabelsolo_formAccion.setText(""+AccionConstantesFunciones.LABEL_SOLOFORM+" : *");
		this.jLabelsolo_formAccion.setToolTipText("Solo Form");
		this.jLabelsolo_formAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsolo_formAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsolo_formAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsolo_formAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsolo_formAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsolo_formAccion.setToolTipText(AccionConstantesFunciones.LABEL_SOLOFORM);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPanelsolo_formAccion.setLayout(this.gridaBagLayoutAccion);


		jCheckBoxsolo_formAccion= new JCheckBoxMe();
		jCheckBoxsolo_formAccion.setEnabled(false);

		jCheckBoxsolo_formAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxsolo_formAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxsolo_formAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxsolo_formAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsolo_formAccionBusqueda= new JButtonMe();
		this.jButtonsolo_formAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsolo_formAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsolo_formAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsolo_formAccionBusqueda.setText("U");
		this.jButtonsolo_formAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsolo_formAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsolo_formAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxsolo_formAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxsolo_formAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"solo_formAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsolo_formAccionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAccion = new JLabelMe();
		this.jLabeldescripcionAccion.setText(""+AccionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionAccion.setToolTipText("Descripcion");
		this.jLabeldescripcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAccion.setToolTipText(AccionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPaneldescripcionAccion.setLayout(this.gridaBagLayoutAccion);


		jTextAreadescripcionAccion= new JTextAreaMe();
		jTextAreadescripcionAccion.setEnabled(false);
		jTextAreadescripcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAccion.setLineWrap(true);
		jTextAreadescripcionAccion.setWrapStyleWord(true);
		jTextAreadescripcionAccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionAccion.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionAccion = new JScrollPane(jTextAreadescripcionAccion);
		jscrollPanedescripcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionAccionBusqueda= new JButtonMe();
		this.jButtondescripcionAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAccionBusqueda.setText("U");
		this.jButtondescripcionAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAccionBusqueda.setVisible(false);		}


					
		this.jLabelordenAccion = new JLabelMe();
		this.jLabelordenAccion.setText(""+AccionConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenAccion.setToolTipText("Orden");
		this.jLabelordenAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenAccion.setToolTipText(AccionConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPanelordenAccion.setLayout(this.gridaBagLayoutAccion);


		jTextFieldordenAccion= new JTextFieldMe();
		jTextFieldordenAccion.setEnabled(false);
		jTextFieldordenAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenAccion.setText("0");

		this.jButtonordenAccionBusqueda= new JButtonMe();
		this.jButtonordenAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenAccionBusqueda.setText("U");
		this.jButtonordenAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenAccionBusqueda.setVisible(false);		}


					
		this.jLabelestadoAccion = new JLabelMe();
		this.jLabelestadoAccion.setText(""+AccionConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoAccion.setToolTipText("Estado");
		this.jLabelestadoAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoAccion.setToolTipText(AccionConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPanelestadoAccion.setLayout(this.gridaBagLayoutAccion);


		jCheckBoxestadoAccion= new JCheckBoxMe();
		jCheckBoxestadoAccion.setEnabled(false);

		jCheckBoxestadoAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoAccionBusqueda= new JButtonMe();
		this.jButtonestadoAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoAccionBusqueda.setText("U");
		this.jButtonestadoAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoAccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_opcionAccion = new JLabelMe();
		this.jLabelid_opcionAccion.setText(""+AccionConstantesFunciones.LABEL_IDOPCION+" : *");
		this.jLabelid_opcionAccion.setToolTipText("Opcion");
		this.jLabelid_opcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_opcionAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_opcionAccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_opcionAccion.setToolTipText(AccionConstantesFunciones.LABEL_IDOPCION);
		this.gridaBagLayoutAccion = new GridBagLayout();
		this.jPanelid_opcionAccion.setLayout(this.gridaBagLayoutAccion);


		jComboBoxid_opcionAccion= new JComboBoxMe();
		jComboBoxid_opcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionAccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_opcionAccion= new JButtonMe();
		this.jButtonid_opcionAccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionAccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionAccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionAccion.setText("Buscar");
		this.jButtonid_opcionAccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_opcionAccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionAccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_opcionAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionAccion"));

		this.jButtonid_opcionAccionBusqueda= new JButtonMe();
		this.jButtonid_opcionAccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionAccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionAccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionAccionBusqueda.setText("U");
		this.jButtonid_opcionAccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_opcionAccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionAccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_opcionAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionAccionBusqueda"));

		if(this.accionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_opcionAccionBusqueda.setVisible(false);		}

		this.jButtonid_opcionAccionUpdate= new JButtonMe();
		this.jButtonid_opcionAccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionAccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionAccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionAccionUpdate.setText("U");
		this.jButtonid_opcionAccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_opcionAccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionAccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_opcionAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionAccionUpdate"));


		jButtonid_opcionAccionArbol= new JButtonMe();
		jButtonid_opcionAccionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionAccionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionAccionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionAccionArbol.setText("Arbol");
		jButtonid_opcionAccionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_opcionAccionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionAccionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_opcionAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionAccionArbol"));



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
		//this.jInternalFrameDetalleAccion = new AccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Accion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAccion= new GridBagLayout();
		

		
		String sToolTipAccion="";
		sToolTipAccion=AccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAccion+="(Seguridad.Accion)";
		}
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			sToolTipAccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAccion = new JButtonMe();
		this.jButtonModificarAccion = new JButtonMe();
        this.jButtonActualizarAccion = new JButtonMe();
        this.jButtonEliminarAccion = new JButtonMe();
        this.jButtonCancelarAccion = new JButtonMe();
        this.jButtonGuardarCambiosAccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaAccion = new JButtonMe();
		this.jButtonCerrarAccion = new JButtonMe();
		
		this.jScrollPanelDatosAccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionAccion = new JScrollPane();
		this.jScrollPanelDatosGeneralAccion = new JScrollPane();
				
		
		
		this.jPanelCamposAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Accion";
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acciones" + this.sPath));
		} else {
			this.jScrollPanelDatosAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAccion.setName("jPanelCamposAccion"); 

		this.jPanelCamposOcultosAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAccion.setName("jPanelCamposOcultosAccion"); 

        this.jPanelAccionesAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAccion.setToolTipText("Acciones");
        this.jPanelAccionesAccion.setName("Acciones"); 

		this.jPanelAccionesFormularioAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAccion.setText("Nuevo");
		this.jButtonModificarAccion.setText("Editar");
        this.jButtonActualizarAccion.setText("Actualizar");
        this.jButtonEliminarAccion.setText("Eliminar");
        this.jButtonCancelarAccion.setText("Cancelar");
        this.jButtonGuardarCambiosAccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaAccion.setText("Guardar");
		this.jButtonCerrarAccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAccion,"nuevo_button","Nuevo",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAccion,"modificar_button","Editar",this.accionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAccion,"actualizar_button","Actualizar",this.accionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAccion,"eliminar_button","Eliminar",this.accionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAccion,"cancelar_button","Cancelar",this.accionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAccion,"guardarcambios_button","Guardar",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAccion,"guardarcambiostabla_button","Guardar",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAccion,"cerrar_button","Salir",this.accionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAccion.setToolTipText("Nuevo"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAccion.setToolTipText("Editar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAccion.setToolTipText("Actualizar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAccion.setToolTipText("Eliminar)"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAccion.setToolTipText("Cancelar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAccion.setToolTipText("Guardar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAccion.setToolTipText("Guardar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAccion.setToolTipText("Salir"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAccion";
		inputMap = this.jButtonNuevoAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAccion";
		inputMap = this.jButtonActualizarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAccion"));
		
		//ELIMINAR
		sMapKey = "EliminarAccion";
		inputMap = this.jButtonEliminarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAccion"));
		
		//CANCELAR	
		sMapKey = "CancelarAccion";
		inputMap = this.jButtonCancelarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAccion"));
		
		//CERRAR		
		sMapKey = "CerrarAccion";
		inputMap = this.jButtonCerrarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAccion";
		inputMap = this.jButtonGuardarCambiosTablaAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAccion.setToolTipText("Nuevo Accion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAccion.setToolTipText("Sin Cerrar Ventana Accion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAccion.setText("Accion");
		this.jComboBoxTiposAccionesAccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAccion = new JLabelMe();
		
		this.jLabelAccionesAccion.setText("Acciones");		
		this.jLabelAccionesAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAccion=new JTabbedPane();
		this.jTabbedPaneRelacionesAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAccion = new GridBagLayout();
		
		this.jPanelCamposAccion.setLayout(gridaBagLayoutCamposAccion);
		this.jPanelCamposOcultosAccion.setLayout(gridaBagLayoutCamposOcultosAccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAccion.add(jLabelIdAccion, this.gridBagConstraintsAccion);



	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAccion.add(jLabelidAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_opcionAccion.add(jLabelid_opcionAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionAccion.add(jButtonid_opcionAccionBusqueda, this.gridBagConstraintsAccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 3;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionAccion.add(jButtonid_opcionAccionUpdate, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_opcionAccion.add(jComboBoxid_opcionAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoAccion.add(jLabelcodigoAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAccion.add(jButtoncodigoAccionBusqueda, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoAccion.add(jTextFieldcodigoAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAccion.add(jLabelnombreAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAccion.add(jButtonnombreAccionBusqueda, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAccion.add(jscrollPanenombreAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsolo_formAccion.add(jLabelsolo_formAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsolo_formAccion.add(jButtonsolo_formAccionBusqueda, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsolo_formAccion.add(jCheckBoxsolo_formAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionAccion.add(jLabeldescripcionAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAccion.add(jButtondescripcionAccionBusqueda, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionAccion.add(jscrollPanedescripcionAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenAccion.add(jLabelordenAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenAccion.add(jButtonordenAccionBusqueda, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenAccion.add(jTextFieldordenAccion, this.gridBagConstraintsAccion);


	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 0;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoAccion.add(jLabelestadoAccion, this.gridBagConstraintsAccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 2;
		this.gridBagConstraintsAccion.ipadx = 0;
		this.gridBagConstraintsAccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoAccion.add(jButtonestadoAccionBusqueda, this.gridBagConstraintsAccion);
	}

	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAccion.gridy = 0;
	this.gridBagConstraintsAccion.gridx = 1;
	this.gridBagConstraintsAccion.ipadx = 0;
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoAccion.add(jCheckBoxestadoAccion, this.gridBagConstraintsAccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelidAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelid_opcionAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelcodigoAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelnombreAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelsolo_formAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPaneldescripcionAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelordenAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
	}
	this.gridBagConstraintsAccion = new GridBagConstraints();
	this.gridBagConstraintsAccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAccion.gridy = iYPanelCamposAccion;
	this.gridBagConstraintsAccion.gridx = iXPanelCamposAccion++;
	this.gridBagConstraintsAccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAccion.add(this.jPanelestadoAccion, this.gridBagConstraintsAccion);



	if(iXPanelCamposAccion % 1==0) {
		iXPanelCamposAccion=0;
		iYPanelCamposAccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesAccion= new GridBagLayout();
		this.jPanelAccionesAccion.setLayout(gridaBagLayoutAccionesAccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAccion= new GridBagLayout();
		this.jPanelAccionesFormularioAccion.setLayout(gridaBagLayoutAccionesFormularioAccion);
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAccion.add(this.jComboBoxTiposAccionesFormularioAccion, this.gridBagConstraintsAccion);

		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAccion.add(this.jCheckBoxPostAccionNuevoAccion, this.gridBagConstraintsAccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.accionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAccion.add(this.jCheckBoxPostAccionSinCerrarAccion, this.gridBagConstraintsAccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.accionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.accionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAccion.add(this.jCheckBoxPostAccionSinMensajeAccion, this.gridBagConstraintsAccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesAccion.add(this.jButtonModificarAccion, this.gridBagConstraintsAccion);							

		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesAccion.add(this.jButtonEliminarAccion, this.gridBagConstraintsAccion);
		
			
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = 0;		
		this.gridBagConstraintsAccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesAccion.add(this.jButtonActualizarAccion, this.gridBagConstraintsAccion);


		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = 0;		
		this.gridBagConstraintsAccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesAccion.add(this.jButtonGuardarCambiosAccion, this.gridBagConstraintsAccion);	
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = 0;		
		this.gridBagConstraintsAccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesAccion.add(this.jButtonCancelarAccion, this.gridBagConstraintsAccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.accionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAccion = new GridBagConstraints();						
			this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAccion.gridx = 0;		
			//this.gridBagConstraintsAccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAccion.gridx =0;
		this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAccion, this.gridBagConstraintsAccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAccion = new AccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Accion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Accion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Accion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AccionModel accionModel=new AccionModel(this);
			
			//SI USARA CLASE INTERNA
			//AccionModel.AccionFocusTraversalPolicy accionFocusTraversalPolicy = accionModel.new AccionFocusTraversalPolicy(this);
			
			//accionFocusTraversalPolicy.setaccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(accionModel);
			
			
			this.jContentPaneDetalleAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAccion = new GridBagLayout();	
			this.jContentPaneDetalleAccion.setLayout(gridaBagLayoutDetalleAccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAccion = new GridBagConstraints();
				this.gridBagConstraintsAccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAccion.gridx = 0;
					
				
				this.jContentPaneDetalleAccion.add(jTtoolBarDetalleAccion, gridBagConstraintsAccion);								
				
}
			
			this.jScrollPanelDatosEdicionAccion=   new JScrollPane(jContentPaneDetalleAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAccion.gridx = 0;
	        
			this.jContentPaneDetalleAccion.add(jPanelCamposAccion, gridBagConstraintsAccion);
			
			
			
			
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
						&& accionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePerfilAccion(this.puedeCargarPorPartePerfilAccion,false,-1);
					
					if(this.accionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAccion= new GridBagConstraints();
						this.gridBagConstraintsAccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAccion.gridx = 0;
						this.jContentPaneDetalleAccion.add(this.jTabbedPaneRelacionesAccion, this.gridBagConstraintsAccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAccion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePerfilAccion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAccion = new GridBagConstraints();
					this.gridBagConstraintsAccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAccion.gridx = 0;
					
				
					this.jContentPaneDetalleAccion.add(jPanelCamposOcultosAccion, gridBagConstraintsAccion);
				
					this.jPanelCamposOcultosAccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsAccion.gridx = 0;
	        this.gridBagConstraintsAccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAccion.add(this.jPanelAccionesFormularioAccion, this.gridBagConstraintsAccion);							
			
			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
	        this.gridBagConstraintsAccion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsAccion.gridx = 0;
	        
			
			this.jContentPaneDetalleAccion.add(this.jPanelAccionesAccion, this.gridBagConstraintsAccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAccion=   new JScrollPane(this.jPanelCamposAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAccion.gridx = 0;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAccion, this.gridBagConstraintsAccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAccion, this.gridBagConstraintsAccion);			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAccion, this.gridBagConstraintsAccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAccion, this.gridBagConstraintsAccion);
			
			
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAccion, this.gridBagConstraintsAccion);
		
			
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAccion, this.gridBagConstraintsAccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAccion;//jContentPane;
		
		return jScrollPanelDatosEdicionAccion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePerfilAccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilaccionSessionBean=new PerfilAccionSessionBean();
		this.perfilaccionSessionBean.setConGuardarRelaciones(false);
		this.perfilaccionSessionBean.setEsGuardarRelacionado(true);

		this.perfilaccionBeanSwingJInternalFrame=null;//new PerfilAccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilaccionBeanSwingJInternalFramePopup=new PerfilAccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilaccionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {

				PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL=AccionJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AccionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilaccionSessionBean.setEsGuardarRelacionado(true);

				this.perfilaccionBeanSwingJInternalFrame=new PerfilAccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilaccionBeanSwingJInternalFrame.setperfilaccionSessionBean(this.perfilaccionSessionBean);

				//this.gridBagConstraintsAccion = new GridBagConstraints();
				//this.gridBagConstraintsAccion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAccion.gridx = 0;
				//this.jContentPaneDetalleAccion.add(this.perfilaccionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAccion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAccion.add("Perfil Acciones",this.perfilaccionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAccion.setComponentAt(iIndexTab,this.perfilaccionBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilaccionSessionBean.setEsGuardarRelacionado(false);
				this.perfilaccionBeanSwingJInternalFrame=null;//new PerfilAccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilAccion) {
					this.jTabbedPaneRelacionesAccion.add("Perfil Acciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPerfilAccionBeanSwingJInternalFrame(List<Accion> accions,Accion accion,PerfilAccionBeanSwingJInternalFrame perfilaccionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilaccionBeanSwingJInternalFrame=new PerfilAccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilaccionBeanSwingJInternalFrame.getPerfilAccionLogic().setConnexion(this.accionLogic.getConnexion());

					perfilaccionBeanSwingJInternalFrame.setaccionsForeignKey(accions);
					perfilaccionBeanSwingJInternalFrame.setaccionForeignKey(accion);
					perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.setisBusquedaDesdeForeignKeySesionAccion(true);
					perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.setlidAccionActual(accion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilaccionBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilAccion(perfilaccionBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilaccionBeanSwingJInternalFrame.setVisibilidadBusquedasParaAccion(true);
					perfilaccionBeanSwingJInternalFrame.setid_accionFK_IdAccion(accion.getId());

					if(!this.conCargarFormDetalle) {
						perfilaccionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilaccionBeanSwingJInternalFrame.setSelectedItemCombosFrameAccionForeignKey(accion,1,false,true,true);
					perfilaccionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilaccionBeanSwingJInternalFrame.procesarBusqueda("FK_IdAccion");
					perfilaccionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAccion");
					perfilaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilAccion(true);
					perfilaccionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilAccion("n",perfilaccionBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilaccionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilaccionBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilaccionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilaccionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilAccion("relacionado");
					} else {
						perfilaccionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilAccion("no_relacionado");
					}

					perfilaccionBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilAccion().setVisible(false);

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
