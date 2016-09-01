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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.inventario.util.TipoDefinicionConstantesFunciones;

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
public class TipoDefinicionDetalleFormJInternalFrame extends TipoDefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDefinicion;
	
	protected JMenuBar jmenuBarDetalleTipoDefinicion;
	
	protected JMenu jmenuDetalleTipoDefinicion;
	protected JMenu jmenuDetalleArchivoTipoDefinicion;
	protected JMenu jmenuDetalleAccionesTipoDefinicion;
	protected JMenu jmenuDetalleDatosTipoDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDefinicion;	
	protected GridBagConstraints gridBagConstraintsTipoDefinicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDefinicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDefinicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDefinicionSessionBean tipodefinicionSessionBean;
	
	

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
		
	
	public TipoDefinicionLogic tipodefinicionLogic;
	
	public JScrollPane jScrollPanelDatosTipoDefinicion;
	public JScrollPane jScrollPanelDatosEdicionTipoDefinicion;
	public JScrollPane jScrollPanelDatosGeneralTipoDefinicion;
	
	protected JPanel jPanelCamposTipoDefinicion;    
	protected JPanel jPanelCamposOcultosTipoDefinicion;    	
	protected JPanel jPanelAccionesTipoDefinicion;
	protected JPanel jPanelAccionesFormularioTipoDefinicion;
    
	
	
	protected Integer iXPanelCamposTipoDefinicion=0;
	protected Integer iYPanelCamposTipoDefinicion=0;
	
	protected Integer iXPanelCamposOcultosTipoDefinicion=0;
	protected Integer iYPanelCamposOcultosTipoDefinicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDefinicion;
	public JButton jButtonModificarTipoDefinicion;
	public JButton jButtonActualizarTipoDefinicion;
    public JButton jButtonEliminarTipoDefinicion;
	public JButton jButtonCancelarTipoDefinicion;
    public JButton jButtonGuardarCambiosTipoDefinicion;
	public JButton jButtonGuardarCambiosTablaTipoDefinicion;
	protected JButton jButtonCerrarTipoDefinicion;
	
	
	protected JButton jButtonProcesarInformacionTipoDefinicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDefinicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDefinicion;
	protected JButton jButtonModificarToolBarTipoDefinicion;
	protected JButton jButtonActualizarToolBarTipoDefinicion;
    protected JButton jButtonEliminarToolBarTipoDefinicion;
	protected JButton jButtonCancelarToolBarTipoDefinicion;
    protected JButton jButtonGuardarCambiosToolBarTipoDefinicion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDefinicion;
	protected JButton jButtonCerrarToolBarTipoDefinicion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDefinicion;
	protected JMenuItem jMenuItemModificarTipoDefinicion;
	protected JMenuItem jMenuItemActualizarTipoDefinicion;
    protected JMenuItem jMenuItemEliminarTipoDefinicion;
	protected JMenuItem jMenuItemCancelarTipoDefinicion;
    protected JMenuItem jMenuItemGuardarCambiosTipoDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDefinicion;
	protected JMenuItem jMenuItemCerrarTipoDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDefinicion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDefinicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDefinicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDefinicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDefinicion;
	public JLabel jLabelIdTipoDefinicion;
	public JTextFieldMe jTextFieldidTipoDefinicion;
	public JButton jButtonidTipoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDefinicion;
	public JLabel jLabelcodigoTipoDefinicion;
	public JTextField jTextFieldcodigoTipoDefinicion;
	public JButton jButtoncodigoTipoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDefinicion;
	public JLabel jLabelnombreTipoDefinicion;
	public JTextField jTextFieldnombreTipoDefinicion;
	public JButton jButtonnombreTipoDefinicionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDefinicion;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoDefinicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDefinicion=new JPanel();
				this.jPanelAccionesFormularioTipoDefinicion=new JPanel();
				this.jmenuBarDetalleTipoDefinicion=new JMenuBar();
				this.jTtoolBarDetalleTipoDefinicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDefinicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDefinicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDefinicion() {
		return this.jButtonActualizarToolBarTipoDefinicion;
	}
	
	public JButton getjButtonEliminarToolBarTipoDefinicion() {
		return this.jButtonEliminarToolBarTipoDefinicion;
	}
	
	public JButton getjButtonCancelarToolBarTipoDefinicion() {
		return this.jButtonCancelarToolBarTipoDefinicion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDefinicion() {
		return this.jButtonProcesarInformacionTipoDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDefinicion)	{
		this.jButtonProcesarInformacionTipoDefinicion = jButtonProcesarInformacionTipoDefinicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDefinicion() {
		return this.jComboBoxTiposAccionesTipoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDefinicion(
			JComboBox jComboBoxTiposRelacionesTipoDefinicion) {
		this.jComboBoxTiposRelacionesTipoDefinicion = jComboBoxTiposRelacionesTipoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDefinicion(
			JComboBox jComboBoxTiposAccionesTipoDefinicion) {
		this.jComboBoxTiposAccionesTipoDefinicion = jComboBoxTiposAccionesTipoDefinicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDefinicion() {
		return this.jComboBoxTiposAccionesFormularioTipoDefinicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDefinicion(
			JComboBox jComboBoxTiposAccionesFormularioTipoDefinicion) {
		this.jComboBoxTiposAccionesFormularioTipoDefinicion = jComboBoxTiposAccionesFormularioTipoDefinicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
		
		this.tipodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodefinicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDefinicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDefinicion=new JButtonMe();
				this.jButtonModificarToolBarTipoDefinicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDefinicion,this.jTtoolBarDetalleTipoDefinicion,
							"actualizar","actualizar","Actualizar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDefinicion,this.jTtoolBarDetalleTipoDefinicion,
							"eliminar","eliminar","Eliminar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDefinicion,this.jTtoolBarDetalleTipoDefinicion,
							"cancelar","cancelar","Cancelar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDefinicion,this.jTtoolBarDetalleTipoDefinicion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDefinicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDefinicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDefinicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDefinicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDefinicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDefinicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDefinicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDefinicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDefinicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDefinicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDefinicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDefinicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDefinicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDefinicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDefinicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDefinicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDefinicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDefinicion.add(this.jMenuItemDetalleCerrarTipoDefinicion);
		
		this.jmenuDetalleAccionesTipoDefinicion.add(this.jMenuItemActualizarTipoDefinicion);
		this.jmenuDetalleAccionesTipoDefinicion.add(this.jMenuItemEliminarTipoDefinicion);
		this.jmenuDetalleAccionesTipoDefinicion.add(this.jMenuItemCancelarTipoDefinicion);		
		
		//this.jmenuDetalleDatosTipoDefinicion.add(this.jMenuItemDetalleAbrirOrderByTipoDefinicion);				
		this.jmenuDetalleDatosTipoDefinicion.add(this.jMenuItemDetalleMostarOcultarTipoDefinicion);				
				
		//this.jmenuDetalleAccionesTipoDefinicion.add(this.jMenuItemGuardarCambiosTipoDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDefinicion.add(this.jmenuDetalleArchivoTipoDefinicion);		
		this.jmenuBarDetalleTipoDefinicion.add(this.jmenuDetalleAccionesTipoDefinicion);		
		this.jmenuBarDetalleTipoDefinicion.add(this.jmenuDetalleDatosTipoDefinicion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDefinicion.add(this.jmenuDetalleTipoDefinicion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDefinicion);				
	}
	
	
	public void inicializarElementosCamposTipoDefinicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDefinicion = new JLabelMe();
		jLabelIdTipoDefinicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDefinicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDefinicion.setToolTipText(TipoDefinicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDefinicion= new GridBagLayout();

		this.jPanelidTipoDefinicion.setLayout(this.gridaBagLayoutTipoDefinicion);

		jTextFieldidTipoDefinicion = new JTextFieldMe();
		jTextFieldidTipoDefinicion.setText("Id");

		jTextFieldidTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDefinicion = new JLabelMe();
		this.jLabelcodigoTipoDefinicion.setText(""+TipoDefinicionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDefinicion.setToolTipText("Codigo");
		this.jLabelcodigoTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDefinicion.setToolTipText(TipoDefinicionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDefinicion = new GridBagLayout();
		this.jPanelcodigoTipoDefinicion.setLayout(this.gridaBagLayoutTipoDefinicion);


		jTextFieldcodigoTipoDefinicion= new JTextFieldMe();

		jTextFieldcodigoTipoDefinicion.setEnabled(false);
		jTextFieldcodigoTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDefinicionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDefinicionBusqueda.setText("U");
		this.jButtoncodigoTipoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDefinicionBusqueda"));

		if(this.tipodefinicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDefinicion = new JLabelMe();
		this.jLabelnombreTipoDefinicion.setText(""+TipoDefinicionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDefinicion.setToolTipText("Nombre");
		this.jLabelnombreTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDefinicion.setToolTipText(TipoDefinicionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDefinicion = new GridBagLayout();
		this.jPanelnombreTipoDefinicion.setLayout(this.gridaBagLayoutTipoDefinicion);


		jTextFieldnombreTipoDefinicion= new JTextFieldMe();

		jTextFieldnombreTipoDefinicion.setEnabled(false);
		jTextFieldnombreTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoDefinicionBusqueda= new JButtonMe();
		this.jButtonnombreTipoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDefinicionBusqueda.setText("U");
		this.jButtonnombreTipoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDefinicionBusqueda"));

		if(this.tipodefinicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDefinicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDefinicion() {
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
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleTipoDefinicion = new TipoDefinicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Definicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDefinicion= new GridBagLayout();
		

		
		String sToolTipTipoDefinicion="";
		sToolTipTipoDefinicion=TipoDefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDefinicion+="(Inventario.TipoDefinicion)";
		}
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDefinicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDefinicion = new JButtonMe();
		this.jButtonModificarTipoDefinicion = new JButtonMe();
        this.jButtonActualizarTipoDefinicion = new JButtonMe();
        this.jButtonEliminarTipoDefinicion = new JButtonMe();
        this.jButtonCancelarTipoDefinicion = new JButtonMe();
        this.jButtonGuardarCambiosTipoDefinicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDefinicion = new JButtonMe();
		this.jButtonCerrarTipoDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoDefinicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDefinicion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDefinicion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Definicion";
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDefinicion.setName("jPanelCamposTipoDefinicion"); 

		this.jPanelCamposOcultosTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDefinicion.setName("jPanelCamposOcultosTipoDefinicion"); 

        this.jPanelAccionesTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoDefinicion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDefinicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDefinicion.setText("Nuevo");
		this.jButtonModificarTipoDefinicion.setText("Editar");
        this.jButtonActualizarTipoDefinicion.setText("Actualizar");
        this.jButtonEliminarTipoDefinicion.setText("Eliminar");
        this.jButtonCancelarTipoDefinicion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDefinicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDefinicion.setText("Guardar");
		this.jButtonCerrarTipoDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDefinicion,"nuevo_button","Nuevo",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDefinicion,"modificar_button","Editar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDefinicion,"actualizar_button","Actualizar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDefinicion,"eliminar_button","Eliminar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDefinicion,"cancelar_button","Cancelar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDefinicion,"guardarcambios_button","Guardar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDefinicion,"guardarcambiostabla_button","Guardar",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDefinicion,"cerrar_button","Salir",this.tipodefinicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDefinicion.setToolTipText("Nuevo"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDefinicion.setToolTipText("Editar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDefinicion.setToolTipText("Actualizar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDefinicion.setToolTipText("Eliminar)"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDefinicion.setToolTipText("Cancelar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDefinicion.setToolTipText("Guardar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDefinicion.setToolTipText("Guardar"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDefinicion.setToolTipText("Salir"+" "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDefinicion";
		inputMap = this.jButtonNuevoTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDefinicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDefinicion";
		inputMap = this.jButtonActualizarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDefinicion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDefinicion";
		inputMap = this.jButtonEliminarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDefinicion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDefinicion";
		inputMap = this.jButtonCancelarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDefinicion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDefinicion";
		inputMap = this.jButtonCerrarTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDefinicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDefinicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDefinicion.setToolTipText("Nuevo TipoDefinicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDefinicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDefinicion.setToolTipText("Sin Cerrar Ventana TipoDefinicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDefinicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDefinicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoDefinicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDefinicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDefinicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDefinicion = new JLabelMe();
		
		this.jLabelAccionesTipoDefinicion.setText("Acciones");		
		this.jLabelAccionesTipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDefinicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDefinicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDefinicion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDefinicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDefinicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDefinicion = new GridBagLayout();
		
		this.jPanelCamposTipoDefinicion.setLayout(gridaBagLayoutCamposTipoDefinicion);
		this.jPanelCamposOcultosTipoDefinicion.setLayout(gridaBagLayoutCamposOcultosTipoDefinicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDefinicion.add(jLabelIdTipoDefinicion, this.gridBagConstraintsTipoDefinicion);



	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDefinicion.add(jTextFieldidTipoDefinicion, this.gridBagConstraintsTipoDefinicion);


	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDefinicion.add(jLabelcodigoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoDefinicion.gridx = 2;
		this.gridBagConstraintsTipoDefinicion.ipadx = 0;
		this.gridBagConstraintsTipoDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDefinicion.add(jButtoncodigoTipoDefinicionBusqueda, this.gridBagConstraintsTipoDefinicion);
	}

	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDefinicion.add(jTextFieldcodigoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);


	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDefinicion.add(jLabelnombreTipoDefinicion, this.gridBagConstraintsTipoDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoDefinicion.gridx = 2;
		this.gridBagConstraintsTipoDefinicion.ipadx = 0;
		this.gridBagConstraintsTipoDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDefinicion.add(jButtonnombreTipoDefinicionBusqueda, this.gridBagConstraintsTipoDefinicion);
	}

	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDefinicion.add(jTextFieldnombreTipoDefinicion, this.gridBagConstraintsTipoDefinicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDefinicion.gridy = iYPanelCamposTipoDefinicion;
	this.gridBagConstraintsTipoDefinicion.gridx = iXPanelCamposTipoDefinicion++;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDefinicion.add(this.jPanelidTipoDefinicion, this.gridBagConstraintsTipoDefinicion);



	if(iXPanelCamposTipoDefinicion % 1==0) {
		iXPanelCamposTipoDefinicion=0;
		iYPanelCamposTipoDefinicion++;
	}
	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDefinicion.gridy = iYPanelCamposTipoDefinicion;
	this.gridBagConstraintsTipoDefinicion.gridx = iXPanelCamposTipoDefinicion++;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDefinicion.add(this.jPanelcodigoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);



	if(iXPanelCamposTipoDefinicion % 1==0) {
		iXPanelCamposTipoDefinicion=0;
		iYPanelCamposTipoDefinicion++;
	}
	this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDefinicion.gridy = iYPanelCamposTipoDefinicion;
	this.gridBagConstraintsTipoDefinicion.gridx = iXPanelCamposTipoDefinicion++;
	this.gridBagConstraintsTipoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDefinicion.add(this.jPanelnombreTipoDefinicion, this.gridBagConstraintsTipoDefinicion);



	if(iXPanelCamposTipoDefinicion % 1==0) {
		iXPanelCamposTipoDefinicion=0;
		iYPanelCamposTipoDefinicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDefinicion= new GridBagLayout();
		this.jPanelAccionesTipoDefinicion.setLayout(gridaBagLayoutAccionesTipoDefinicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDefinicion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDefinicion.setLayout(gridaBagLayoutAccionesFormularioTipoDefinicion);
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDefinicion.add(this.jComboBoxTiposAccionesFormularioTipoDefinicion, this.gridBagConstraintsTipoDefinicion);

		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDefinicion.add(this.jCheckBoxPostAccionNuevoTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDefinicion.add(this.jCheckBoxPostAccionSinCerrarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDefinicion.add(this.jCheckBoxPostAccionSinMensajeTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDefinicion.add(this.jButtonModificarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);							

		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoDefinicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDefinicion.add(this.jButtonEliminarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
			
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDefinicion.add(this.jButtonActualizarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);


		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDefinicion.add(this.jButtonGuardarCambiosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);	
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoDefinicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDefinicion.add(this.jButtonCancelarTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDefinicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDefinicion.gridx = 0;		
			//this.gridBagConstraintsTipoDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDefinicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDefinicion.gridx =0;
		this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDefinicion = new TipoDefinicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Definicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Definicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Definicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDefinicionModel tipodefinicionModel=new TipoDefinicionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDefinicionModel.TipoDefinicionFocusTraversalPolicy tipodefinicionFocusTraversalPolicy = tipodefinicionModel.new TipoDefinicionFocusTraversalPolicy(this);
			
			//tipodefinicionFocusTraversalPolicy.settipodefinicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodefinicionModel);
			
			
			this.jContentPaneDetalleTipoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDefinicion = new GridBagLayout();	
			this.jContentPaneDetalleTipoDefinicion.setLayout(gridaBagLayoutDetalleTipoDefinicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDefinicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDefinicion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDefinicion.add(jTtoolBarDetalleTipoDefinicion, gridBagConstraintsTipoDefinicion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDefinicion=   new JScrollPane(jContentPaneDetalleTipoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDefinicion.gridx = 0;
	        
			this.jContentPaneDetalleTipoDefinicion.add(jPanelCamposTipoDefinicion, gridBagConstraintsTipoDefinicion);
			
			
			
			
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
						&& tipodefinicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					
					if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDefinicion= new GridBagConstraints();
						this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDefinicion.gridx = 0;
						this.jContentPaneDetalleTipoDefinicion.add(this.jTabbedPaneRelacionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDefinicion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDefinicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
					this.gridBagConstraintsTipoDefinicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDefinicion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDefinicion.add(jPanelCamposOcultosTipoDefinicion, gridBagConstraintsTipoDefinicion);
				
					this.jPanelCamposOcultosTipoDefinicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoDefinicion.gridx = 0;
	        this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDefinicion.add(this.jPanelAccionesFormularioTipoDefinicion, this.gridBagConstraintsTipoDefinicion);							
			
			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
	        this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoDefinicion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDefinicion.add(this.jPanelAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDefinicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDefinicion=   new JScrollPane(this.jPanelCamposTipoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDefinicion.gridx = 0;
			this.gridBagConstraintsTipoDefinicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDefinicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDefinicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDefinicion, this.gridBagConstraintsTipoDefinicion);			
			
			this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
			
			
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		
			
		this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDefinicion, this.gridBagConstraintsTipoDefinicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDefinicion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDefinicion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDefinicion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.definicionSessionBean=new DefinicionSessionBean();
		this.definicionSessionBean.setConGuardarRelaciones(false);
		this.definicionSessionBean.setEsGuardarRelacionado(true);

		this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.definicionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.definicionSessionBean.getEsGuardarRelacionado()) {

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsTipoDefinicion = new GridBagConstraints();
				//this.gridBagConstraintsTipoDefinicion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDefinicion.gridx = 0;
				//this.jContentPaneDetalleTipoDefinicion.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDefinicion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDefinicion.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDefinicion.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesTipoDefinicion.add("Definiciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDefinicionBeanSwingJInternalFrame(List<TipoDefinicion> tipodefinicions,TipoDefinicion tipodefinicion,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.tipodefinicionLogic.getConnexion());

					definicionBeanSwingJInternalFrame.settipodefinicionsForeignKey(tipodefinicions);
					definicionBeanSwingJInternalFrame.settipodefinicionForeignKey(tipodefinicion);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoDefinicion(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidTipoDefinicionActual(tipodefinicion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDefinicion(true);
					definicionBeanSwingJInternalFrame.setid_tipo_definicionFK_IdTipoDefinicion(tipodefinicion.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoDefinicionForeignKey(tipodefinicion,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDefinicion");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDefinicion");
					definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(true);
					definicionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDefinicion("n",definicionBeanSwingJInternalFrame.isGuardarCambiosEnLote, definicionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					definicionBeanSwingJInternalFrame.setAutoscrolls(true);
					definicionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("relacionado");
					} else {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");
					}

					definicionBeanSwingJInternalFrame.getjButtonRecargarInformacionDefinicion().setVisible(false);

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
