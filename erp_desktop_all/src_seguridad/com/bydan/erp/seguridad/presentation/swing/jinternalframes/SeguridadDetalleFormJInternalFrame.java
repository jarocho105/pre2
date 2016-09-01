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
import com.bydan.erp.seguridad.util.SeguridadConstantesFunciones;

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
public class SeguridadDetalleFormJInternalFrame extends SeguridadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSeguridad;
	
	protected JMenuBar jmenuBarDetalleSeguridad;
	
	protected JMenu jmenuDetalleSeguridad;
	protected JMenu jmenuDetalleArchivoSeguridad;
	protected JMenu jmenuDetalleAccionesSeguridad;
	protected JMenu jmenuDetalleDatosSeguridad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSeguridad;	
	protected GridBagConstraints gridBagConstraintsSeguridad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SeguridadBeanSwingJInternalFrameAdditional jInternalFrameDetalleSeguridad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SeguridadSessionBean seguridadSessionBean;
	
	
	
		
	
	public SeguridadLogic seguridadLogic;
	
	public JScrollPane jScrollPanelDatosSeguridad;
	public JScrollPane jScrollPanelDatosEdicionSeguridad;
	public JScrollPane jScrollPanelDatosGeneralSeguridad;
	
	protected JPanel jPanelCamposSeguridad;    
	protected JPanel jPanelCamposOcultosSeguridad;    	
	protected JPanel jPanelAccionesSeguridad;
	protected JPanel jPanelAccionesFormularioSeguridad;
    
	
	
	protected Integer iXPanelCamposSeguridad=0;
	protected Integer iYPanelCamposSeguridad=0;
	
	protected Integer iXPanelCamposOcultosSeguridad=0;
	protected Integer iYPanelCamposOcultosSeguridad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSeguridad;
	public JButton jButtonModificarSeguridad;
	public JButton jButtonActualizarSeguridad;
    public JButton jButtonEliminarSeguridad;
	public JButton jButtonCancelarSeguridad;
    public JButton jButtonGuardarCambiosSeguridad;
	public JButton jButtonGuardarCambiosTablaSeguridad;
	protected JButton jButtonCerrarSeguridad;
	
	
	protected JButton jButtonProcesarInformacionSeguridad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSeguridad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSeguridad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSeguridad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSeguridad;
	protected JButton jButtonModificarToolBarSeguridad;
	protected JButton jButtonActualizarToolBarSeguridad;
    protected JButton jButtonEliminarToolBarSeguridad;
	protected JButton jButtonCancelarToolBarSeguridad;
    protected JButton jButtonGuardarCambiosToolBarSeguridad;
	protected JButton jButtonGuardarCambiosTablaToolBarSeguridad;
	protected JButton jButtonMostrarOcultarTablaToolBarSeguridad;
	protected JButton jButtonCerrarToolBarSeguridad;
	
	protected JButton jButtonProcesarInformacionToolBarSeguridad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSeguridad;
	protected JMenuItem jMenuItemModificarSeguridad;
	protected JMenuItem jMenuItemActualizarSeguridad;
    protected JMenuItem jMenuItemEliminarSeguridad;
	protected JMenuItem jMenuItemCancelarSeguridad;
    protected JMenuItem jMenuItemGuardarCambiosSeguridad;
	protected JMenuItem jMenuItemGuardarCambiosTablaSeguridad;
	protected JMenuItem jMenuItemCerrarSeguridad;
	protected JMenuItem jMenuItemDetalleCerrarSeguridad;
	protected JMenuItem jMenuItemDetalleMostarOcultarSeguridad;
	
	protected JMenuItem jMenuItemProcesarInformacionSeguridad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSeguridad;
	protected JMenuItem jMenuItemMostrarOcultarSeguridad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSeguridad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSeguridad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSeguridad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSeguridad;
	public JLabel jLabelIdSeguridad;
	public JLabel jLabelidSeguridad;
	public JButton jButtonidSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSeguridad;
	public JLabel jLabelcodigoSeguridad;
	public JTextField jTextFieldcodigoSeguridad;
	public JButton jButtoncodigoSeguridadBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSeguridad;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SeguridadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSeguridad=new JPanel();
				this.jPanelAccionesFormularioSeguridad=new JPanel();
				this.jmenuBarDetalleSeguridad=new JMenuBar();
				this.jTtoolBarDetalleSeguridad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SeguridadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSeguridad() {
		return this.jButtonActualizarToolBarSeguridad;
	}
	
	public JButton getjButtonEliminarToolBarSeguridad() {
		return this.jButtonEliminarToolBarSeguridad;
	}
	
	public JButton getjButtonCancelarToolBarSeguridad() {
		return this.jButtonCancelarToolBarSeguridad;
	}		
	
	public JButton getjButtonProcesarInformacionSeguridad() {
		return this.jButtonProcesarInformacionSeguridad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSeguridad)	{
		this.jButtonProcesarInformacionSeguridad = jButtonProcesarInformacionSeguridad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSeguridad() {
		return this.jComboBoxTiposAccionesSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSeguridad(
			JComboBox jComboBoxTiposRelacionesSeguridad) {
		this.jComboBoxTiposRelacionesSeguridad = jComboBoxTiposRelacionesSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSeguridad(
			JComboBox jComboBoxTiposAccionesSeguridad) {
		this.jComboBoxTiposAccionesSeguridad = jComboBoxTiposAccionesSeguridad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSeguridad() {
		return this.jComboBoxTiposAccionesFormularioSeguridad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSeguridad(
			JComboBox jComboBoxTiposAccionesFormularioSeguridad) {
		this.jComboBoxTiposAccionesFormularioSeguridad = jComboBoxTiposAccionesFormularioSeguridad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.seguridadSessionBean=new SeguridadSessionBean();
		
		this.seguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.seguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.seguridadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SeguridadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SeguridadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SeguridadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Seguridad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
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
	
		SeguridadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSeguridad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSeguridad=new JButtonMe();
				this.jButtonModificarToolBarSeguridad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSeguridad,this.jTtoolBarDetalleSeguridad,
							"actualizar","actualizar","Actualizar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSeguridad,this.jTtoolBarDetalleSeguridad,
							"eliminar","eliminar","Eliminar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSeguridad,this.jTtoolBarDetalleSeguridad,
							"cancelar","cancelar","Cancelar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSeguridad,this.jTtoolBarDetalleSeguridad,
							"guardarcambios","guardarcambios","Guardar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSeguridad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSeguridad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSeguridad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSeguridad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSeguridad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSeguridad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSeguridad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSeguridad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSeguridad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSeguridad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSeguridad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSeguridad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSeguridad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSeguridad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSeguridad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSeguridad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSeguridad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSeguridad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSeguridad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSeguridad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSeguridad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSeguridad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSeguridad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSeguridad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSeguridad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSeguridad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSeguridad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSeguridad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSeguridad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSeguridad.add(this.jMenuItemDetalleCerrarSeguridad);
		
		this.jmenuDetalleAccionesSeguridad.add(this.jMenuItemActualizarSeguridad);
		this.jmenuDetalleAccionesSeguridad.add(this.jMenuItemEliminarSeguridad);
		this.jmenuDetalleAccionesSeguridad.add(this.jMenuItemCancelarSeguridad);		
		
		//this.jmenuDetalleDatosSeguridad.add(this.jMenuItemDetalleAbrirOrderBySeguridad);				
		this.jmenuDetalleDatosSeguridad.add(this.jMenuItemDetalleMostarOcultarSeguridad);				
				
		//this.jmenuDetalleAccionesSeguridad.add(this.jMenuItemGuardarCambiosSeguridad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSeguridad.add(this.jmenuDetalleArchivoSeguridad);		
		this.jmenuBarDetalleSeguridad.add(this.jmenuDetalleAccionesSeguridad);		
		this.jmenuBarDetalleSeguridad.add(this.jmenuDetalleDatosSeguridad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSeguridad);				
	}
	
	
	public void inicializarElementosCamposSeguridad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSeguridad = new JLabelMe();
		jLabelIdSeguridad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSeguridad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSeguridad.setToolTipText(SeguridadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSeguridad= new GridBagLayout();

		this.jPanelidSeguridad.setLayout(this.gridaBagLayoutSeguridad);

		jLabelidSeguridad = new JLabel();
		jLabelidSeguridad.setText("Id");

		jLabelidSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSeguridad = new JLabelMe();
		this.jLabelcodigoSeguridad.setText(""+SeguridadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSeguridad.setToolTipText("Codigo");
		this.jLabelcodigoSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSeguridad.setToolTipText(SeguridadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSeguridad = new GridBagLayout();
		this.jPanelcodigoSeguridad.setLayout(this.gridaBagLayoutSeguridad);


		jTextFieldcodigoSeguridad= new JTextFieldMe();

		jTextFieldcodigoSeguridad.setEnabled(false);
		jTextFieldcodigoSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSeguridadBusqueda= new JButtonMe();
		this.jButtoncodigoSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSeguridadBusqueda.setText("U");
		this.jButtoncodigoSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSeguridadBusqueda"));

		if(this.seguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSeguridadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSeguridad() {
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
		//this.jInternalFrameDetalleSeguridad = new SeguridadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Seguridad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSeguridad= new GridBagLayout();
		

		
		String sToolTipSeguridad="";
		sToolTipSeguridad=SeguridadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSeguridad+="(Seguridad.Seguridad)";
		}
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			sToolTipSeguridad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSeguridad = new JButtonMe();
		this.jButtonModificarSeguridad = new JButtonMe();
        this.jButtonActualizarSeguridad = new JButtonMe();
        this.jButtonEliminarSeguridad = new JButtonMe();
        this.jButtonCancelarSeguridad = new JButtonMe();
        this.jButtonGuardarCambiosSeguridad = new JButtonMe();
		this.jButtonGuardarCambiosTablaSeguridad = new JButtonMe();
		this.jButtonCerrarSeguridad = new JButtonMe();
		
		this.jScrollPanelDatosSeguridad = new JScrollPane();   
        this.jScrollPanelDatosEdicionSeguridad = new JScrollPane();
		this.jScrollPanelDatosGeneralSeguridad = new JScrollPane();
				
		
		
		this.jPanelCamposSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Seguridad";
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguridades" + this.sPath));
		} else {
			this.jScrollPanelDatosSeguridad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSeguridad.setName("jPanelCamposSeguridad"); 

		this.jPanelCamposOcultosSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSeguridad.setName("jPanelCamposOcultosSeguridad"); 

        this.jPanelAccionesSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSeguridad.setToolTipText("Acciones");
        this.jPanelAccionesSeguridad.setName("Acciones"); 

		this.jPanelAccionesFormularioSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSeguridad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSeguridad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSeguridad.setText("Nuevo");
		this.jButtonModificarSeguridad.setText("Editar");
        this.jButtonActualizarSeguridad.setText("Actualizar");
        this.jButtonEliminarSeguridad.setText("Eliminar");
        this.jButtonCancelarSeguridad.setText("Cancelar");
        this.jButtonGuardarCambiosSeguridad.setText("Guardar");
		this.jButtonGuardarCambiosTablaSeguridad.setText("Guardar");
		this.jButtonCerrarSeguridad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSeguridad,"nuevo_button","Nuevo",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSeguridad,"modificar_button","Editar",this.seguridadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSeguridad,"actualizar_button","Actualizar",this.seguridadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSeguridad,"eliminar_button","Eliminar",this.seguridadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSeguridad,"cancelar_button","Cancelar",this.seguridadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSeguridad,"guardarcambios_button","Guardar",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSeguridad,"guardarcambiostabla_button","Guardar",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSeguridad,"cerrar_button","Salir",this.seguridadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSeguridad.setToolTipText("Nuevo"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSeguridad.setToolTipText("Editar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSeguridad.setToolTipText("Actualizar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSeguridad.setToolTipText("Eliminar)"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSeguridad.setToolTipText("Cancelar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSeguridad.setToolTipText("Guardar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSeguridad.setToolTipText("Guardar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSeguridad.setToolTipText("Salir"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSeguridad";
		inputMap = this.jButtonNuevoSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSeguridad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSeguridad";
		inputMap = this.jButtonActualizarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSeguridad"));
		
		//ELIMINAR
		sMapKey = "EliminarSeguridad";
		inputMap = this.jButtonEliminarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSeguridad"));
		
		//CANCELAR	
		sMapKey = "CancelarSeguridad";
		inputMap = this.jButtonCancelarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSeguridad"));
		
		//CERRAR		
		sMapKey = "CerrarSeguridad";
		inputMap = this.jButtonCerrarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSeguridad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSeguridad";
		inputMap = this.jButtonGuardarCambiosTablaSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSeguridad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSeguridad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSeguridad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSeguridad.setToolTipText("Nuevo Seguridad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSeguridad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSeguridad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSeguridad.setToolTipText("Sin Cerrar Ventana Seguridad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSeguridad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSeguridad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSeguridad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSeguridad.setText("Accion");
		this.jComboBoxTiposAccionesSeguridad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSeguridad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSeguridad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSeguridad = new JLabelMe();
		
		this.jLabelAccionesSeguridad.setText("Acciones");		
		this.jLabelAccionesSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSeguridad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSeguridad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSeguridad=new JTabbedPane();
		this.jTabbedPaneRelacionesSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSeguridad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSeguridad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSeguridad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSeguridad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSeguridad = new GridBagLayout();
		
		this.jPanelCamposSeguridad.setLayout(gridaBagLayoutCamposSeguridad);
		this.jPanelCamposOcultosSeguridad.setLayout(gridaBagLayoutCamposOcultosSeguridad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSeguridad = new GridBagConstraints();
	this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguridad.gridy = 0;
	this.gridBagConstraintsSeguridad.gridx = 0;
	this.gridBagConstraintsSeguridad.ipadx = 0;
	this.gridBagConstraintsSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSeguridad.add(jLabelIdSeguridad, this.gridBagConstraintsSeguridad);



	this.gridBagConstraintsSeguridad = new GridBagConstraints();
	this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguridad.gridy = 0;
	this.gridBagConstraintsSeguridad.gridx = 1;
	this.gridBagConstraintsSeguridad.ipadx = 0;
	this.gridBagConstraintsSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSeguridad.add(jLabelidSeguridad, this.gridBagConstraintsSeguridad);


	this.gridBagConstraintsSeguridad = new GridBagConstraints();
	this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguridad.gridy = 0;
	this.gridBagConstraintsSeguridad.gridx = 0;
	this.gridBagConstraintsSeguridad.ipadx = 0;
	this.gridBagConstraintsSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSeguridad.add(jLabelcodigoSeguridad, this.gridBagConstraintsSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = 0;
		this.gridBagConstraintsSeguridad.gridx = 2;
		this.gridBagConstraintsSeguridad.ipadx = 0;
		this.gridBagConstraintsSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSeguridad.add(jButtoncodigoSeguridadBusqueda, this.gridBagConstraintsSeguridad);
	}

	this.gridBagConstraintsSeguridad = new GridBagConstraints();
	this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguridad.gridy = 0;
	this.gridBagConstraintsSeguridad.gridx = 1;
	this.gridBagConstraintsSeguridad.ipadx = 0;
	this.gridBagConstraintsSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSeguridad.add(jTextFieldcodigoSeguridad, this.gridBagConstraintsSeguridad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSeguridad = new GridBagConstraints();
	this.gridBagConstraintsSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSeguridad.gridy = iYPanelCamposSeguridad;
	this.gridBagConstraintsSeguridad.gridx = iXPanelCamposSeguridad++;
	this.gridBagConstraintsSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSeguridad.add(this.jPanelidSeguridad, this.gridBagConstraintsSeguridad);



	if(iXPanelCamposSeguridad % 1==0) {
		iXPanelCamposSeguridad=0;
		iYPanelCamposSeguridad++;
	}
	this.gridBagConstraintsSeguridad = new GridBagConstraints();
	this.gridBagConstraintsSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSeguridad.gridy = iYPanelCamposSeguridad;
	this.gridBagConstraintsSeguridad.gridx = iXPanelCamposSeguridad++;
	this.gridBagConstraintsSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSeguridad.add(this.jPanelcodigoSeguridad, this.gridBagConstraintsSeguridad);



	if(iXPanelCamposSeguridad % 1==0) {
		iXPanelCamposSeguridad=0;
		iYPanelCamposSeguridad++;
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
			
		GridBagLayout gridaBagLayoutAccionesSeguridad= new GridBagLayout();
		this.jPanelAccionesSeguridad.setLayout(gridaBagLayoutAccionesSeguridad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSeguridad= new GridBagLayout();
		this.jPanelAccionesFormularioSeguridad.setLayout(gridaBagLayoutAccionesFormularioSeguridad);
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSeguridad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSeguridad.add(this.jComboBoxTiposAccionesFormularioSeguridad, this.gridBagConstraintsSeguridad);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = 0;
		this.gridBagConstraintsSeguridad.gridx = iPosXAccion++;
			
		this.jPanelAccionesSeguridad.add(this.jButtonModificarSeguridad, this.gridBagConstraintsSeguridad);							

		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = 0;
		this.gridBagConstraintsSeguridad.gridx =iPosXAccion++;
			
		this.jPanelAccionesSeguridad.add(this.jButtonEliminarSeguridad, this.gridBagConstraintsSeguridad);
		
			
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = 0;		
		this.gridBagConstraintsSeguridad.gridx = iPosXAccion++;
		
		this.jPanelAccionesSeguridad.add(this.jButtonActualizarSeguridad, this.gridBagConstraintsSeguridad);


		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = 0;		
		this.gridBagConstraintsSeguridad.gridx = iPosXAccion++;
		
		this.jPanelAccionesSeguridad.add(this.jButtonGuardarCambiosSeguridad, this.gridBagConstraintsSeguridad);	
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = 0;		
		this.gridBagConstraintsSeguridad.gridx =iPosXAccion++;
		
		this.jPanelAccionesSeguridad.add(this.jButtonCancelarSeguridad, this.gridBagConstraintsSeguridad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSeguridad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSeguridad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSeguridad = new GridBagConstraints();						
			this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSeguridad.gridx = 0;		
			//this.gridBagConstraintsSeguridad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSeguridad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSeguridad.gridx =0;
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSeguridad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSeguridad, this.gridBagConstraintsSeguridad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SeguridadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSeguridad = new SeguridadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Seguridad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Seguridad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Seguridad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SeguridadModel seguridadModel=new SeguridadModel(this);
			
			//SI USARA CLASE INTERNA
			//SeguridadModel.SeguridadFocusTraversalPolicy seguridadFocusTraversalPolicy = seguridadModel.new SeguridadFocusTraversalPolicy(this);
			
			//seguridadFocusTraversalPolicy.setseguridadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(seguridadModel);
			
			
			this.jContentPaneDetalleSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSeguridad = new GridBagLayout();	
			this.jContentPaneDetalleSeguridad.setLayout(gridaBagLayoutDetalleSeguridad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSeguridad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSeguridad = new GridBagConstraints();
				this.gridBagConstraintsSeguridad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSeguridad.gridx = 0;
					
				
				this.jContentPaneDetalleSeguridad.add(jTtoolBarDetalleSeguridad, gridBagConstraintsSeguridad);								
				
}
			
			this.jScrollPanelDatosEdicionSeguridad=   new JScrollPane(jContentPaneDetalleSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSeguridad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSeguridad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSeguridad.gridx = 0;
	        
			this.jContentPaneDetalleSeguridad.add(jPanelCamposSeguridad, gridBagConstraintsSeguridad);
			
			
			
			
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
						&& seguridadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.seguridadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSeguridad= new GridBagConstraints();
						this.gridBagConstraintsSeguridad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSeguridad.gridx = 0;
						this.jContentPaneDetalleSeguridad.add(this.jTabbedPaneRelacionesSeguridad, this.gridBagConstraintsSeguridad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSeguridad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSeguridad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSeguridad = new GridBagConstraints();
					this.gridBagConstraintsSeguridad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSeguridad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSeguridad.gridx = 0;
					
				
					this.jContentPaneDetalleSeguridad.add(jPanelCamposOcultosSeguridad, gridBagConstraintsSeguridad);
				
					this.jPanelCamposOcultosSeguridad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSeguridad.gridx = 0;
	        this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSeguridad.add(this.jPanelAccionesFormularioSeguridad, this.gridBagConstraintsSeguridad);							
			
			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
	        this.gridBagConstraintsSeguridad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSeguridad.gridx = 0;
	        
			
			this.jContentPaneDetalleSeguridad.add(this.jPanelAccionesSeguridad, this.gridBagConstraintsSeguridad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSeguridad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSeguridad=   new JScrollPane(this.jPanelCamposSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSeguridad.gridx = 0;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSeguridad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSeguridad, this.gridBagConstraintsSeguridad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSeguridad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSeguridad, this.gridBagConstraintsSeguridad);			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSeguridad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSeguridad, this.gridBagConstraintsSeguridad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSeguridad, this.gridBagConstraintsSeguridad);
			
			
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSeguridad, this.gridBagConstraintsSeguridad);
		
			
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSeguridad, this.gridBagConstraintsSeguridad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSeguridad;//jContentPane;
		
		return jScrollPanelDatosEdicionSeguridad;
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
