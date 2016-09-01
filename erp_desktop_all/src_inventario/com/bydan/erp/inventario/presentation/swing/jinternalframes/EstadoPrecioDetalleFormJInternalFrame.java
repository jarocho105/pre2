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
import com.bydan.erp.inventario.util.EstadoPrecioConstantesFunciones;

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
public class EstadoPrecioDetalleFormJInternalFrame extends EstadoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPrecio;
	
	protected JMenuBar jmenuBarDetalleEstadoPrecio;
	
	protected JMenu jmenuDetalleEstadoPrecio;
	protected JMenu jmenuDetalleArchivoEstadoPrecio;
	protected JMenu jmenuDetalleAccionesEstadoPrecio;
	protected JMenu jmenuDetalleDatosEstadoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPrecio;	
	protected GridBagConstraints gridBagConstraintsEstadoPrecio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPrecioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPrecio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPrecioSessionBean estadoprecioSessionBean;
	
	

	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;
	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrecio=false;
	public PrecioSessionBean precioSessionBean;
	
		
	
	public EstadoPrecioLogic estadoprecioLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPrecio;
	public JScrollPane jScrollPanelDatosEdicionEstadoPrecio;
	public JScrollPane jScrollPanelDatosGeneralEstadoPrecio;
	
	protected JPanel jPanelCamposEstadoPrecio;    
	protected JPanel jPanelCamposOcultosEstadoPrecio;    	
	protected JPanel jPanelAccionesEstadoPrecio;
	protected JPanel jPanelAccionesFormularioEstadoPrecio;
    
	
	
	protected Integer iXPanelCamposEstadoPrecio=0;
	protected Integer iYPanelCamposEstadoPrecio=0;
	
	protected Integer iXPanelCamposOcultosEstadoPrecio=0;
	protected Integer iYPanelCamposOcultosEstadoPrecio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPrecio;
	public JButton jButtonModificarEstadoPrecio;
	public JButton jButtonActualizarEstadoPrecio;
    public JButton jButtonEliminarEstadoPrecio;
	public JButton jButtonCancelarEstadoPrecio;
    public JButton jButtonGuardarCambiosEstadoPrecio;
	public JButton jButtonGuardarCambiosTablaEstadoPrecio;
	protected JButton jButtonCerrarEstadoPrecio;
	
	
	protected JButton jButtonProcesarInformacionEstadoPrecio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPrecio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPrecio;
	protected JButton jButtonModificarToolBarEstadoPrecio;
	protected JButton jButtonActualizarToolBarEstadoPrecio;
    protected JButton jButtonEliminarToolBarEstadoPrecio;
	protected JButton jButtonCancelarToolBarEstadoPrecio;
    protected JButton jButtonGuardarCambiosToolBarEstadoPrecio;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPrecio;
	protected JButton jButtonCerrarToolBarEstadoPrecio;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPrecio;
	protected JMenuItem jMenuItemModificarEstadoPrecio;
	protected JMenuItem jMenuItemActualizarEstadoPrecio;
    protected JMenuItem jMenuItemEliminarEstadoPrecio;
	protected JMenuItem jMenuItemCancelarEstadoPrecio;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPrecio;
	protected JMenuItem jMenuItemCerrarEstadoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPrecio;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPrecio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPrecio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPrecio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPrecio;
	public JLabel jLabelIdEstadoPrecio;
	public JTextFieldMe jTextFieldidEstadoPrecio;
	public JButton jButtonidEstadoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoPrecio;
	public JLabel jLabelcodigoEstadoPrecio;
	public JTextField jTextFieldcodigoEstadoPrecio;
	public JButton jButtoncodigoEstadoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPrecio;
	public JLabel jLabelnombreEstadoPrecio;
	public JTextField jTextFieldnombreEstadoPrecio;
	public JButton jButtonnombreEstadoPrecioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPrecio;
	
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
	
	public EstadoPrecioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPrecio=new JPanel();
				this.jPanelAccionesFormularioEstadoPrecio=new JPanel();
				this.jmenuBarDetalleEstadoPrecio=new JMenuBar();
				this.jTtoolBarDetalleEstadoPrecio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPrecioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPrecioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPrecio() {
		return this.jButtonActualizarToolBarEstadoPrecio;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPrecio() {
		return this.jButtonEliminarToolBarEstadoPrecio;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPrecio() {
		return this.jButtonCancelarToolBarEstadoPrecio;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPrecio() {
		return this.jButtonProcesarInformacionEstadoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPrecio)	{
		this.jButtonProcesarInformacionEstadoPrecio = jButtonProcesarInformacionEstadoPrecio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPrecio() {
		return this.jComboBoxTiposAccionesEstadoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPrecio(
			JComboBox jComboBoxTiposRelacionesEstadoPrecio) {
		this.jComboBoxTiposRelacionesEstadoPrecio = jComboBoxTiposRelacionesEstadoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPrecio(
			JComboBox jComboBoxTiposAccionesEstadoPrecio) {
		this.jComboBoxTiposAccionesEstadoPrecio = jComboBoxTiposAccionesEstadoPrecio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPrecio() {
		return this.jComboBoxTiposAccionesFormularioEstadoPrecio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPrecio(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPrecio) {
		this.jComboBoxTiposAccionesFormularioEstadoPrecio = jComboBoxTiposAccionesFormularioEstadoPrecio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
		
		this.estadoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoprecioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.precioSessionBean=new PrecioSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Precio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPrecio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPrecio=new JButtonMe();
				this.jButtonModificarToolBarEstadoPrecio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPrecio,this.jTtoolBarDetalleEstadoPrecio,
							"actualizar","actualizar","Actualizar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPrecio,this.jTtoolBarDetalleEstadoPrecio,
							"eliminar","eliminar","Eliminar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPrecio,this.jTtoolBarDetalleEstadoPrecio,
							"cancelar","cancelar","Cancelar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPrecio,this.jTtoolBarDetalleEstadoPrecio,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPrecio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPrecio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPrecio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPrecio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPrecio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPrecio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPrecio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPrecio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPrecio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPrecio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPrecio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPrecio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPrecio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPrecio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPrecio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPrecio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPrecio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPrecio.add(this.jMenuItemDetalleCerrarEstadoPrecio);
		
		this.jmenuDetalleAccionesEstadoPrecio.add(this.jMenuItemActualizarEstadoPrecio);
		this.jmenuDetalleAccionesEstadoPrecio.add(this.jMenuItemEliminarEstadoPrecio);
		this.jmenuDetalleAccionesEstadoPrecio.add(this.jMenuItemCancelarEstadoPrecio);		
		
		//this.jmenuDetalleDatosEstadoPrecio.add(this.jMenuItemDetalleAbrirOrderByEstadoPrecio);				
		this.jmenuDetalleDatosEstadoPrecio.add(this.jMenuItemDetalleMostarOcultarEstadoPrecio);				
				
		//this.jmenuDetalleAccionesEstadoPrecio.add(this.jMenuItemGuardarCambiosEstadoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPrecio.add(this.jmenuDetalleArchivoEstadoPrecio);		
		this.jmenuBarDetalleEstadoPrecio.add(this.jmenuDetalleAccionesEstadoPrecio);		
		this.jmenuBarDetalleEstadoPrecio.add(this.jmenuDetalleDatosEstadoPrecio);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoPrecio.add(this.jmenuDetalleEstadoPrecio);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPrecio);				
	}
	
	
	public void inicializarElementosCamposEstadoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPrecio = new JLabelMe();
		jLabelIdEstadoPrecio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPrecio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPrecio.setToolTipText(EstadoPrecioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPrecio= new GridBagLayout();

		this.jPanelidEstadoPrecio.setLayout(this.gridaBagLayoutEstadoPrecio);

		jTextFieldidEstadoPrecio = new JTextFieldMe();
		jTextFieldidEstadoPrecio.setText("Id");

		jTextFieldidEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoPrecio = new JLabelMe();
		this.jLabelcodigoEstadoPrecio.setText(""+EstadoPrecioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoPrecio.setToolTipText("Codigo");
		this.jLabelcodigoEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoPrecio.setToolTipText(EstadoPrecioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoPrecio = new GridBagLayout();
		this.jPanelcodigoEstadoPrecio.setLayout(this.gridaBagLayoutEstadoPrecio);


		jTextFieldcodigoEstadoPrecio= new JTextFieldMe();

		jTextFieldcodigoEstadoPrecio.setEnabled(false);
		jTextFieldcodigoEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoPrecioBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoPrecioBusqueda.setText("U");
		this.jButtoncodigoEstadoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoPrecioBusqueda"));

		if(this.estadoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoPrecio = new JLabelMe();
		this.jLabelnombreEstadoPrecio.setText(""+EstadoPrecioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPrecio.setToolTipText("Nombre");
		this.jLabelnombreEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPrecio.setToolTipText(EstadoPrecioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPrecio = new GridBagLayout();
		this.jPanelnombreEstadoPrecio.setLayout(this.gridaBagLayoutEstadoPrecio);


		jTextFieldnombreEstadoPrecio= new JTextFieldMe();

		jTextFieldnombreEstadoPrecio.setEnabled(false);
		jTextFieldnombreEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreEstadoPrecioBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPrecioBusqueda.setText("U");
		this.jButtonnombreEstadoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreEstadoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreEstadoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPrecioBusqueda"));

		if(this.estadoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPrecioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPrecio() {
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
		//this.jInternalFrameDetalleEstadoPrecio = new EstadoPrecioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Precio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPrecio= new GridBagLayout();
		

		
		String sToolTipEstadoPrecio="";
		sToolTipEstadoPrecio=EstadoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPrecio+="(Inventario.EstadoPrecio)";
		}
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPrecio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPrecio = new JButtonMe();
		this.jButtonModificarEstadoPrecio = new JButtonMe();
        this.jButtonActualizarEstadoPrecio = new JButtonMe();
        this.jButtonEliminarEstadoPrecio = new JButtonMe();
        this.jButtonCancelarEstadoPrecio = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPrecio = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPrecio = new JButtonMe();
		this.jButtonCerrarEstadoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPrecio = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPrecio = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPrecio = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Precio";
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPrecio.setName("jPanelCamposEstadoPrecio"); 

		this.jPanelCamposOcultosEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPrecio.setName("jPanelCamposOcultosEstadoPrecio"); 

        this.jPanelAccionesEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPrecio.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPrecio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPrecio.setText("Nuevo");
		this.jButtonModificarEstadoPrecio.setText("Editar");
        this.jButtonActualizarEstadoPrecio.setText("Actualizar");
        this.jButtonEliminarEstadoPrecio.setText("Eliminar");
        this.jButtonCancelarEstadoPrecio.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPrecio.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPrecio.setText("Guardar");
		this.jButtonCerrarEstadoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPrecio,"nuevo_button","Nuevo",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPrecio,"modificar_button","Editar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPrecio,"actualizar_button","Actualizar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPrecio,"eliminar_button","Eliminar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPrecio,"cancelar_button","Cancelar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPrecio,"guardarcambios_button","Guardar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPrecio,"guardarcambiostabla_button","Guardar",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPrecio,"cerrar_button","Salir",this.estadoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPrecio.setToolTipText("Nuevo"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPrecio.setToolTipText("Editar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPrecio.setToolTipText("Actualizar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPrecio.setToolTipText("Eliminar)"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPrecio.setToolTipText("Cancelar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPrecio.setToolTipText("Guardar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPrecio.setToolTipText("Guardar"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPrecio.setToolTipText("Salir"+" "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPrecio";
		inputMap = this.jButtonNuevoEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPrecio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPrecio";
		inputMap = this.jButtonActualizarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPrecio"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPrecio";
		inputMap = this.jButtonEliminarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPrecio"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPrecio";
		inputMap = this.jButtonCancelarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPrecio"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPrecio";
		inputMap = this.jButtonCerrarEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPrecio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPrecio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPrecio.setToolTipText("Nuevo EstadoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPrecio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPrecio.setToolTipText("Sin Cerrar Ventana EstadoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPrecio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPrecio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPrecio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPrecio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPrecio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPrecio = new JLabelMe();
		
		this.jLabelAccionesEstadoPrecio.setText("Acciones");		
		this.jLabelAccionesEstadoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPrecio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPrecio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPrecio=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPrecio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPrecio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPrecio = new GridBagLayout();
		
		this.jPanelCamposEstadoPrecio.setLayout(gridaBagLayoutCamposEstadoPrecio);
		this.jPanelCamposOcultosEstadoPrecio.setLayout(gridaBagLayoutCamposOcultosEstadoPrecio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPrecio.gridy = 0;
	this.gridBagConstraintsEstadoPrecio.gridx = 0;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPrecio.add(jLabelIdEstadoPrecio, this.gridBagConstraintsEstadoPrecio);



	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPrecio.gridy = 0;
	this.gridBagConstraintsEstadoPrecio.gridx = 1;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPrecio.add(jTextFieldidEstadoPrecio, this.gridBagConstraintsEstadoPrecio);


	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPrecio.gridy = 0;
	this.gridBagConstraintsEstadoPrecio.gridx = 0;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoPrecio.add(jLabelcodigoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = 0;
		this.gridBagConstraintsEstadoPrecio.gridx = 2;
		this.gridBagConstraintsEstadoPrecio.ipadx = 0;
		this.gridBagConstraintsEstadoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoPrecio.add(jButtoncodigoEstadoPrecioBusqueda, this.gridBagConstraintsEstadoPrecio);
	}

	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPrecio.gridy = 0;
	this.gridBagConstraintsEstadoPrecio.gridx = 1;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoPrecio.add(jTextFieldcodigoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);


	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPrecio.gridy = 0;
	this.gridBagConstraintsEstadoPrecio.gridx = 0;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPrecio.add(jLabelnombreEstadoPrecio, this.gridBagConstraintsEstadoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPrecio.gridy = 0;
		this.gridBagConstraintsEstadoPrecio.gridx = 2;
		this.gridBagConstraintsEstadoPrecio.ipadx = 0;
		this.gridBagConstraintsEstadoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPrecio.add(jButtonnombreEstadoPrecioBusqueda, this.gridBagConstraintsEstadoPrecio);
	}

	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPrecio.gridy = 0;
	this.gridBagConstraintsEstadoPrecio.gridx = 1;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPrecio.add(jTextFieldnombreEstadoPrecio, this.gridBagConstraintsEstadoPrecio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPrecio.gridy = iYPanelCamposEstadoPrecio;
	this.gridBagConstraintsEstadoPrecio.gridx = iXPanelCamposEstadoPrecio++;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPrecio.add(this.jPanelidEstadoPrecio, this.gridBagConstraintsEstadoPrecio);



	if(iXPanelCamposEstadoPrecio % 1==0) {
		iXPanelCamposEstadoPrecio=0;
		iYPanelCamposEstadoPrecio++;
	}
	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPrecio.gridy = iYPanelCamposEstadoPrecio;
	this.gridBagConstraintsEstadoPrecio.gridx = iXPanelCamposEstadoPrecio++;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPrecio.add(this.jPanelcodigoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);



	if(iXPanelCamposEstadoPrecio % 1==0) {
		iXPanelCamposEstadoPrecio=0;
		iYPanelCamposEstadoPrecio++;
	}
	this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPrecio.gridy = iYPanelCamposEstadoPrecio;
	this.gridBagConstraintsEstadoPrecio.gridx = iXPanelCamposEstadoPrecio++;
	this.gridBagConstraintsEstadoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPrecio.add(this.jPanelnombreEstadoPrecio, this.gridBagConstraintsEstadoPrecio);



	if(iXPanelCamposEstadoPrecio % 1==0) {
		iXPanelCamposEstadoPrecio=0;
		iYPanelCamposEstadoPrecio++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPrecio= new GridBagLayout();
		this.jPanelAccionesEstadoPrecio.setLayout(gridaBagLayoutAccionesEstadoPrecio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPrecio= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPrecio.setLayout(gridaBagLayoutAccionesFormularioEstadoPrecio);
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPrecio.add(this.jComboBoxTiposAccionesFormularioEstadoPrecio, this.gridBagConstraintsEstadoPrecio);

		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPrecio.add(this.jCheckBoxPostAccionNuevoEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPrecio.add(this.jCheckBoxPostAccionSinCerrarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPrecio.add(this.jCheckBoxPostAccionSinMensajeEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = 0;
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPrecio.add(this.jButtonModificarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);							

		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPrecio.gridy = 0;
		this.gridBagConstraintsEstadoPrecio.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPrecio.add(this.jButtonEliminarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
			
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = 0;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPrecio.add(this.jButtonActualizarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);


		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = 0;		
		this.gridBagConstraintsEstadoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPrecio.add(this.jButtonGuardarCambiosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);	
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = 0;		
		this.gridBagConstraintsEstadoPrecio.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPrecio.add(this.jButtonCancelarEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPrecio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPrecio.gridx = 0;		
			//this.gridBagConstraintsEstadoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPrecio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPrecio.gridx =0;
		this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPrecio = new EstadoPrecioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Precio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Precio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Precio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoPrecioModel estadoprecioModel=new EstadoPrecioModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPrecioModel.EstadoPrecioFocusTraversalPolicy estadoprecioFocusTraversalPolicy = estadoprecioModel.new EstadoPrecioFocusTraversalPolicy(this);
			
			//estadoprecioFocusTraversalPolicy.setestadoprecioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoprecioModel);
			
			
			this.jContentPaneDetalleEstadoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPrecio = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPrecio.setLayout(gridaBagLayoutDetalleEstadoPrecio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPrecio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
				this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPrecio.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPrecio.add(jTtoolBarDetalleEstadoPrecio, gridBagConstraintsEstadoPrecio);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPrecio=   new JScrollPane(jContentPaneDetalleEstadoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPrecio.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPrecio.add(jPanelCamposEstadoPrecio, gridBagConstraintsEstadoPrecio);
			
			
			
			
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
						&& estadoprecioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePrecio(this.puedeCargarPorPartePrecio,false,-1);
					
					if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPrecio= new GridBagConstraints();
						this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPrecio.gridx = 0;
						this.jContentPaneDetalleEstadoPrecio.add(this.jTabbedPaneRelacionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPrecio.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePrecio(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPrecio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
					this.gridBagConstraintsEstadoPrecio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPrecio.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPrecio.add(jPanelCamposOcultosEstadoPrecio, gridBagConstraintsEstadoPrecio);
				
					this.jPanelCamposOcultosEstadoPrecio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoPrecio.gridx = 0;
	        this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPrecio.add(this.jPanelAccionesFormularioEstadoPrecio, this.gridBagConstraintsEstadoPrecio);							
			
			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoPrecio.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPrecio.add(this.jPanelAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPrecio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPrecio=   new JScrollPane(this.jPanelCamposEstadoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPrecio.gridx = 0;
			this.gridBagConstraintsEstadoPrecio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPrecio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPrecio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPrecio, this.gridBagConstraintsEstadoPrecio);			
			
			this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
			this.gridBagConstraintsEstadoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
			
			
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		
			
		this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
		this.gridBagConstraintsEstadoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPrecio, this.gridBagConstraintsEstadoPrecio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPrecio;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPrecio;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.precioSessionBean=new PrecioSessionBean();
		this.precioSessionBean.setConGuardarRelaciones(false);
		this.precioSessionBean.setEsGuardarRelacionado(true);

		this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.precioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.precioSessionBean.getEsGuardarRelacionado()) {

				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.precioSessionBean.setEsGuardarRelacionado(true);

				this.precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.precioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.precioBeanSwingJInternalFrame.setprecioSessionBean(this.precioSessionBean);

				//this.gridBagConstraintsEstadoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsEstadoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoPrecio.gridx = 0;
				//this.jContentPaneDetalleEstadoPrecio.add(this.precioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoPrecio.add("Precios",this.precioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoPrecio.setComponentAt(iIndexTab,this.precioBeanSwingJInternalFrame.getContentPane());
				}

				//PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.precioSessionBean.setEsGuardarRelacionado(false);
				this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrecio) {
					this.jTabbedPaneRelacionesEstadoPrecio.add("Precios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPrecioBeanSwingJInternalFrame(List<EstadoPrecio> estadoprecios,EstadoPrecio estadoprecio,PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					precioBeanSwingJInternalFrame.getPrecioLogic().setConnexion(this.estadoprecioLogic.getConnexion());

					precioBeanSwingJInternalFrame.setestadopreciosForeignKey(estadoprecios);
					precioBeanSwingJInternalFrame.setestadoprecioForeignKey(estadoprecio);
					precioBeanSwingJInternalFrame.precioSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPrecio(true);
					precioBeanSwingJInternalFrame.precioSessionBean.setlidEstadoPrecioActual(estadoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					precioBeanSwingJInternalFrame.cargarCombosForeignKeyPrecio(precioBeanSwingJInternalFrame.isCargarCombosDependencia);
					precioBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoPrecio(true);
					precioBeanSwingJInternalFrame.setid_estado_precioFK_IdEstadoPrecio(estadoprecio.getId());

					if(!this.conCargarFormDetalle) {
						precioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					precioBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoPrecioForeignKey(estadoprecio,1,false,true,true);
					precioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					precioBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoPrecio");
					precioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoPrecio");
					precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(true);
					precioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrecio("n",precioBeanSwingJInternalFrame.isGuardarCambiosEnLote, precioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					precioBeanSwingJInternalFrame.setAutoscrolls(true);
					precioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("relacionado");
					} else {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");
					}

					precioBeanSwingJInternalFrame.getjButtonRecargarInformacionPrecio().setVisible(false);

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
