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
import com.bydan.erp.inventario.util.InventarioConstantesFunciones;

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
public class InventarioDetalleFormJInternalFrame extends InventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleInventario;
	
	protected JMenuBar jmenuBarDetalleInventario;
	
	protected JMenu jmenuDetalleInventario;
	protected JMenu jmenuDetalleArchivoInventario;
	protected JMenu jmenuDetalleAccionesInventario;
	protected JMenu jmenuDetalleDatosInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInventario;	
	protected GridBagConstraints gridBagConstraintsInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected InventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public InventarioSessionBean inventarioSessionBean;
	
	
	
		
	
	public InventarioLogic inventarioLogic;
	
	public JScrollPane jScrollPanelDatosInventario;
	public JScrollPane jScrollPanelDatosEdicionInventario;
	public JScrollPane jScrollPanelDatosGeneralInventario;
	
	protected JPanel jPanelCamposInventario;    
	protected JPanel jPanelCamposOcultosInventario;    	
	protected JPanel jPanelAccionesInventario;
	protected JPanel jPanelAccionesFormularioInventario;
    
	
	
	protected Integer iXPanelCamposInventario=0;
	protected Integer iYPanelCamposInventario=0;
	
	protected Integer iXPanelCamposOcultosInventario=0;
	protected Integer iYPanelCamposOcultosInventario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoInventario;
	public JButton jButtonModificarInventario;
	public JButton jButtonActualizarInventario;
    public JButton jButtonEliminarInventario;
	public JButton jButtonCancelarInventario;
    public JButton jButtonGuardarCambiosInventario;
	public JButton jButtonGuardarCambiosTablaInventario;
	protected JButton jButtonCerrarInventario;
	
	
	protected JButton jButtonProcesarInformacionInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInventario;
	protected JButton jButtonModificarToolBarInventario;
	protected JButton jButtonActualizarToolBarInventario;
    protected JButton jButtonEliminarToolBarInventario;
	protected JButton jButtonCancelarToolBarInventario;
    protected JButton jButtonGuardarCambiosToolBarInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarInventario;
	protected JButton jButtonCerrarToolBarInventario;
	
	protected JButton jButtonProcesarInformacionToolBarInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInventario;
	protected JMenuItem jMenuItemModificarInventario;
	protected JMenuItem jMenuItemActualizarInventario;
    protected JMenuItem jMenuItemEliminarInventario;
	protected JMenuItem jMenuItemCancelarInventario;
    protected JMenuItem jMenuItemGuardarCambiosInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaInventario;
	protected JMenuItem jMenuItemCerrarInventario;
	protected JMenuItem jMenuItemDetalleCerrarInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInventario;
	protected JMenuItem jMenuItemMostrarOcultarInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidInventario;
	public JLabel jLabelIdInventario;
	public JLabel jLabelidInventario;
	public JButton jButtonidInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoInventario;
	public JLabel jLabelcodigoInventario;
	public JTextField jTextFieldcodigoInventario;
	public JButton jButtoncodigoInventarioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesInventario;
	
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
	
	public InventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposInventario=new JPanel();
				this.jPanelAccionesFormularioInventario=new JPanel();
				this.jmenuBarDetalleInventario=new JMenuBar();
				this.jTtoolBarDetalleInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public InventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarInventario() {
		return this.jButtonActualizarToolBarInventario;
	}
	
	public JButton getjButtonEliminarToolBarInventario() {
		return this.jButtonEliminarToolBarInventario;
	}
	
	public JButton getjButtonCancelarToolBarInventario() {
		return this.jButtonCancelarToolBarInventario;
	}		
	
	public JButton getjButtonProcesarInformacionInventario() {
		return this.jButtonProcesarInformacionInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInventario)	{
		this.jButtonProcesarInformacionInventario = jButtonProcesarInformacionInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInventario() {
		return this.jComboBoxTiposAccionesInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInventario(
			JComboBox jComboBoxTiposRelacionesInventario) {
		this.jComboBoxTiposRelacionesInventario = jComboBoxTiposRelacionesInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInventario(
			JComboBox jComboBoxTiposAccionesInventario) {
		this.jComboBoxTiposAccionesInventario = jComboBoxTiposAccionesInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioInventario() {
		return this.jComboBoxTiposAccionesFormularioInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioInventario(
			JComboBox jComboBoxTiposAccionesFormularioInventario) {
		this.jComboBoxTiposAccionesFormularioInventario = jComboBoxTiposAccionesFormularioInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.inventarioSessionBean=new InventarioSessionBean();
		
		this.inventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.inventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.inventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		InventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarInventario=new JButtonMe();
				this.jButtonModificarToolBarInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarInventario,this.jTtoolBarDetalleInventario,
							"actualizar","actualizar","Actualizar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarInventario,this.jTtoolBarDetalleInventario,
							"eliminar","eliminar","Eliminar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarInventario,this.jTtoolBarDetalleInventario,
							"cancelar","cancelar","Cancelar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarInventario,this.jTtoolBarDetalleInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoInventario.add(this.jMenuItemDetalleCerrarInventario);
		
		this.jmenuDetalleAccionesInventario.add(this.jMenuItemActualizarInventario);
		this.jmenuDetalleAccionesInventario.add(this.jMenuItemEliminarInventario);
		this.jmenuDetalleAccionesInventario.add(this.jMenuItemCancelarInventario);		
		
		//this.jmenuDetalleDatosInventario.add(this.jMenuItemDetalleAbrirOrderByInventario);				
		this.jmenuDetalleDatosInventario.add(this.jMenuItemDetalleMostarOcultarInventario);				
				
		//this.jmenuDetalleAccionesInventario.add(this.jMenuItemGuardarCambiosInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleInventario.add(this.jmenuDetalleArchivoInventario);		
		this.jmenuBarDetalleInventario.add(this.jmenuDetalleAccionesInventario);		
		this.jmenuBarDetalleInventario.add(this.jmenuDetalleDatosInventario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleInventario);				
	}
	
	
	public void inicializarElementosCamposInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdInventario = new JLabelMe();
		jLabelIdInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidInventario.setToolTipText(InventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutInventario= new GridBagLayout();

		this.jPanelidInventario.setLayout(this.gridaBagLayoutInventario);

		jLabelidInventario = new JLabel();
		jLabelidInventario.setText("Id");

		jLabelidInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoInventario = new JLabelMe();
		this.jLabelcodigoInventario.setText(""+InventarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoInventario.setToolTipText("Codigo");
		this.jLabelcodigoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoInventario.setToolTipText(InventarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutInventario = new GridBagLayout();
		this.jPanelcodigoInventario.setLayout(this.gridaBagLayoutInventario);


		jTextFieldcodigoInventario= new JTextFieldMe();

		jTextFieldcodigoInventario.setEnabled(false);
		jTextFieldcodigoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoInventarioBusqueda= new JButtonMe();
		this.jButtoncodigoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoInventarioBusqueda.setText("U");
		this.jButtoncodigoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoInventarioBusqueda"));

		if(this.inventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysInventario() {
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
		//this.jInternalFrameDetalleInventario = new InventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInventario= new GridBagLayout();
		

		
		String sToolTipInventario="";
		sToolTipInventario=InventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInventario+="(Inventario.Inventario)";
		}
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoInventario = new JButtonMe();
		this.jButtonModificarInventario = new JButtonMe();
        this.jButtonActualizarInventario = new JButtonMe();
        this.jButtonEliminarInventario = new JButtonMe();
        this.jButtonCancelarInventario = new JButtonMe();
        this.jButtonGuardarCambiosInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaInventario = new JButtonMe();
		this.jButtonCerrarInventario = new JButtonMe();
		
		this.jScrollPanelDatosInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralInventario = new JScrollPane();
				
		
		
		this.jPanelCamposInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Inventario";
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposInventario.setName("jPanelCamposInventario"); 

		this.jPanelCamposOcultosInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosInventario.setName("jPanelCamposOcultosInventario"); 

        this.jPanelAccionesInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInventario.setToolTipText("Acciones");
        this.jPanelAccionesInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoInventario.setText("Nuevo");
		this.jButtonModificarInventario.setText("Editar");
        this.jButtonActualizarInventario.setText("Actualizar");
        this.jButtonEliminarInventario.setText("Eliminar");
        this.jButtonCancelarInventario.setText("Cancelar");
        this.jButtonGuardarCambiosInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaInventario.setText("Guardar");
		this.jButtonCerrarInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInventario,"nuevo_button","Nuevo",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarInventario,"modificar_button","Editar",this.inventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarInventario,"actualizar_button","Actualizar",this.inventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarInventario,"eliminar_button","Eliminar",this.inventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarInventario,"cancelar_button","Cancelar",this.inventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosInventario,"guardarcambios_button","Guardar",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInventario,"guardarcambiostabla_button","Guardar",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInventario,"cerrar_button","Salir",this.inventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoInventario.setToolTipText("Nuevo"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarInventario.setToolTipText("Editar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarInventario.setToolTipText("Actualizar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarInventario.setToolTipText("Eliminar)"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarInventario.setToolTipText("Cancelar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosInventario.setToolTipText("Guardar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaInventario.setToolTipText("Guardar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInventario.setToolTipText("Salir"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInventario";
		inputMap = this.jButtonNuevoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarInventario";
		inputMap = this.jButtonActualizarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarInventario";
		inputMap = this.jButtonEliminarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarInventario";
		inputMap = this.jButtonCancelarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarInventario"));
		
		//CERRAR		
		sMapKey = "CerrarInventario";
		inputMap = this.jButtonCerrarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInventario";
		inputMap = this.jButtonGuardarCambiosTablaInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoInventario.setToolTipText("Nuevo Inventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarInventario.setToolTipText("Sin Cerrar Ventana Inventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInventario.setText("Accion");
		this.jComboBoxTiposAccionesInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesInventario = new JLabelMe();
		
		this.jLabelAccionesInventario.setText("Acciones");		
		this.jLabelAccionesInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosInventario = new GridBagLayout();
		
		this.jPanelCamposInventario.setLayout(gridaBagLayoutCamposInventario);
		this.jPanelCamposOcultosInventario.setLayout(gridaBagLayoutCamposOcultosInventario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsInventario = new GridBagConstraints();
	this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInventario.gridy = 0;
	this.gridBagConstraintsInventario.gridx = 0;
	this.gridBagConstraintsInventario.ipadx = 0;
	this.gridBagConstraintsInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidInventario.add(jLabelIdInventario, this.gridBagConstraintsInventario);



	this.gridBagConstraintsInventario = new GridBagConstraints();
	this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInventario.gridy = 0;
	this.gridBagConstraintsInventario.gridx = 1;
	this.gridBagConstraintsInventario.ipadx = 0;
	this.gridBagConstraintsInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidInventario.add(jLabelidInventario, this.gridBagConstraintsInventario);


	this.gridBagConstraintsInventario = new GridBagConstraints();
	this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInventario.gridy = 0;
	this.gridBagConstraintsInventario.gridx = 0;
	this.gridBagConstraintsInventario.ipadx = 0;
	this.gridBagConstraintsInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoInventario.add(jLabelcodigoInventario, this.gridBagConstraintsInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInventario = new GridBagConstraints();
		//this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = 0;
		this.gridBagConstraintsInventario.gridx = 2;
		this.gridBagConstraintsInventario.ipadx = 0;
		this.gridBagConstraintsInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoInventario.add(jButtoncodigoInventarioBusqueda, this.gridBagConstraintsInventario);
	}

	this.gridBagConstraintsInventario = new GridBagConstraints();
	this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInventario.gridy = 0;
	this.gridBagConstraintsInventario.gridx = 1;
	this.gridBagConstraintsInventario.ipadx = 0;
	this.gridBagConstraintsInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoInventario.add(jTextFieldcodigoInventario, this.gridBagConstraintsInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsInventario = new GridBagConstraints();
	this.gridBagConstraintsInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInventario.gridy = iYPanelCamposInventario;
	this.gridBagConstraintsInventario.gridx = iXPanelCamposInventario++;
	this.gridBagConstraintsInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInventario.add(this.jPanelidInventario, this.gridBagConstraintsInventario);



	if(iXPanelCamposInventario % 1==0) {
		iXPanelCamposInventario=0;
		iYPanelCamposInventario++;
	}
	this.gridBagConstraintsInventario = new GridBagConstraints();
	this.gridBagConstraintsInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInventario.gridy = iYPanelCamposInventario;
	this.gridBagConstraintsInventario.gridx = iXPanelCamposInventario++;
	this.gridBagConstraintsInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInventario.add(this.jPanelcodigoInventario, this.gridBagConstraintsInventario);



	if(iXPanelCamposInventario % 1==0) {
		iXPanelCamposInventario=0;
		iYPanelCamposInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesInventario= new GridBagLayout();
		this.jPanelAccionesInventario.setLayout(gridaBagLayoutAccionesInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioInventario= new GridBagLayout();
		this.jPanelAccionesFormularioInventario.setLayout(gridaBagLayoutAccionesFormularioInventario);
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInventario.add(this.jComboBoxTiposAccionesFormularioInventario, this.gridBagConstraintsInventario);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = 0;
		this.gridBagConstraintsInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesInventario.add(this.jButtonModificarInventario, this.gridBagConstraintsInventario);							

		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = 0;
		this.gridBagConstraintsInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesInventario.add(this.jButtonEliminarInventario, this.gridBagConstraintsInventario);
		
			
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = 0;		
		this.gridBagConstraintsInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesInventario.add(this.jButtonActualizarInventario, this.gridBagConstraintsInventario);


		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = 0;		
		this.gridBagConstraintsInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesInventario.add(this.jButtonGuardarCambiosInventario, this.gridBagConstraintsInventario);	
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = 0;		
		this.gridBagConstraintsInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesInventario.add(this.jButtonCancelarInventario, this.gridBagConstraintsInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInventario = new GridBagConstraints();						
			this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInventario.gridx = 0;		
			//this.gridBagConstraintsInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInventario.gridx =0;
		this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInventario, this.gridBagConstraintsInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(InventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleInventario = new InventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			InventarioModel inventarioModel=new InventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//InventarioModel.InventarioFocusTraversalPolicy inventarioFocusTraversalPolicy = inventarioModel.new InventarioFocusTraversalPolicy(this);
			
			//inventarioFocusTraversalPolicy.setinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(inventarioModel);
			
			
			this.jContentPaneDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleInventario = new GridBagLayout();	
			this.jContentPaneDetalleInventario.setLayout(gridaBagLayoutDetalleInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsInventario = new GridBagConstraints();
				this.gridBagConstraintsInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsInventario.gridx = 0;
					
				
				this.jContentPaneDetalleInventario.add(jTtoolBarDetalleInventario, gridBagConstraintsInventario);								
				
}
			
			this.jScrollPanelDatosEdicionInventario=   new JScrollPane(jContentPaneDetalleInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsInventario.gridx = 0;
	        
			this.jContentPaneDetalleInventario.add(jPanelCamposInventario, gridBagConstraintsInventario);
			
			
			
			
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
						&& inventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.inventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsInventario= new GridBagConstraints();
						this.gridBagConstraintsInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsInventario.gridx = 0;
						this.jContentPaneDetalleInventario.add(this.jTabbedPaneRelacionesInventario, this.gridBagConstraintsInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesInventario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsInventario = new GridBagConstraints();
					this.gridBagConstraintsInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsInventario.gridx = 0;
					
				
					this.jContentPaneDetalleInventario.add(jPanelCamposOcultosInventario, gridBagConstraintsInventario);
				
					this.jPanelCamposOcultosInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsInventario.gridx = 0;
	        this.gridBagConstraintsInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleInventario.add(this.jPanelAccionesFormularioInventario, this.gridBagConstraintsInventario);							
			
			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
	        this.gridBagConstraintsInventario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleInventario.add(this.jPanelAccionesInventario, this.gridBagConstraintsInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionInventario=   new JScrollPane(this.jPanelCamposInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsInventario.gridx = 0;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionInventario, this.gridBagConstraintsInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioInventario, this.gridBagConstraintsInventario);			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesInventario, this.gridBagConstraintsInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInventario, this.gridBagConstraintsInventario);
			
			
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInventario, this.gridBagConstraintsInventario);
		
			
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInventario, this.gridBagConstraintsInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionInventario;
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
