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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.CarteraConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class CarteraDetalleFormJInternalFrame extends CarteraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCartera;
	
	protected JMenuBar jmenuBarDetalleCartera;
	
	protected JMenu jmenuDetalleCartera;
	protected JMenu jmenuDetalleArchivoCartera;
	protected JMenu jmenuDetalleAccionesCartera;
	protected JMenu jmenuDetalleDatosCartera;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCartera;	
	protected GridBagConstraints gridBagConstraintsCartera;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CarteraBeanSwingJInternalFrameAdditional jInternalFrameDetalleCartera;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CarteraSessionBean carteraSessionBean;
	
	
	
		
	
	public CarteraLogic carteraLogic;
	
	public JScrollPane jScrollPanelDatosCartera;
	public JScrollPane jScrollPanelDatosEdicionCartera;
	public JScrollPane jScrollPanelDatosGeneralCartera;
	
	protected JPanel jPanelCamposCartera;    
	protected JPanel jPanelCamposOcultosCartera;    	
	protected JPanel jPanelAccionesCartera;
	protected JPanel jPanelAccionesFormularioCartera;
    
	
	
	protected Integer iXPanelCamposCartera=0;
	protected Integer iYPanelCamposCartera=0;
	
	protected Integer iXPanelCamposOcultosCartera=0;
	protected Integer iYPanelCamposOcultosCartera=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCartera;
	public JButton jButtonModificarCartera;
	public JButton jButtonActualizarCartera;
    public JButton jButtonEliminarCartera;
	public JButton jButtonCancelarCartera;
    public JButton jButtonGuardarCambiosCartera;
	public JButton jButtonGuardarCambiosTablaCartera;
	protected JButton jButtonCerrarCartera;
	
	
	protected JButton jButtonProcesarInformacionCartera;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCartera;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCartera;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCartera;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCartera;
	protected JButton jButtonModificarToolBarCartera;
	protected JButton jButtonActualizarToolBarCartera;
    protected JButton jButtonEliminarToolBarCartera;
	protected JButton jButtonCancelarToolBarCartera;
    protected JButton jButtonGuardarCambiosToolBarCartera;
	protected JButton jButtonGuardarCambiosTablaToolBarCartera;
	protected JButton jButtonMostrarOcultarTablaToolBarCartera;
	protected JButton jButtonCerrarToolBarCartera;
	
	protected JButton jButtonProcesarInformacionToolBarCartera;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCartera;
	protected JMenuItem jMenuItemModificarCartera;
	protected JMenuItem jMenuItemActualizarCartera;
    protected JMenuItem jMenuItemEliminarCartera;
	protected JMenuItem jMenuItemCancelarCartera;
    protected JMenuItem jMenuItemGuardarCambiosCartera;
	protected JMenuItem jMenuItemGuardarCambiosTablaCartera;
	protected JMenuItem jMenuItemCerrarCartera;
	protected JMenuItem jMenuItemDetalleCerrarCartera;
	protected JMenuItem jMenuItemDetalleMostarOcultarCartera;
	
	protected JMenuItem jMenuItemProcesarInformacionCartera;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCartera;
	protected JMenuItem jMenuItemMostrarOcultarCartera;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCartera;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCartera;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCartera;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCartera;
	public JLabel jLabelIdCartera;
	public JLabel jLabelidCartera;
	public JButton jButtonidCarteraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCartera;
	public JLabel jLabelcodigoCartera;
	public JTextField jTextFieldcodigoCartera;
	public JButton jButtoncodigoCarteraBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCartera;
	
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
	
	public CarteraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCartera=new JPanel();
				this.jPanelAccionesFormularioCartera=new JPanel();
				this.jmenuBarDetalleCartera=new JMenuBar();
				this.jTtoolBarDetalleCartera=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CarteraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCartera() {
		return this.jButtonActualizarToolBarCartera;
	}
	
	public JButton getjButtonEliminarToolBarCartera() {
		return this.jButtonEliminarToolBarCartera;
	}
	
	public JButton getjButtonCancelarToolBarCartera() {
		return this.jButtonCancelarToolBarCartera;
	}		
	
	public JButton getjButtonProcesarInformacionCartera() {
		return this.jButtonProcesarInformacionCartera;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCartera)	{
		this.jButtonProcesarInformacionCartera = jButtonProcesarInformacionCartera;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCartera() {
		return this.jComboBoxTiposAccionesCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCartera(
			JComboBox jComboBoxTiposRelacionesCartera) {
		this.jComboBoxTiposRelacionesCartera = jComboBoxTiposRelacionesCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCartera(
			JComboBox jComboBoxTiposAccionesCartera) {
		this.jComboBoxTiposAccionesCartera = jComboBoxTiposAccionesCartera;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCartera() {
		return this.jComboBoxTiposAccionesFormularioCartera;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCartera(
			JComboBox jComboBoxTiposAccionesFormularioCartera) {
		this.jComboBoxTiposAccionesFormularioCartera = jComboBoxTiposAccionesFormularioCartera;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.carteraSessionBean=new CarteraSessionBean();
		
		this.carteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.carteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.carteraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CarteraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CarteraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CarteraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cartera MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
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
	
		CarteraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCartera= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCartera=new JButtonMe();
				this.jButtonModificarToolBarCartera=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCartera,this.jTtoolBarDetalleCartera,
							"actualizar","actualizar","Actualizar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCartera,this.jTtoolBarDetalleCartera,
							"eliminar","eliminar","Eliminar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCartera,this.jTtoolBarDetalleCartera,
							"cancelar","cancelar","Cancelar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCartera,this.jTtoolBarDetalleCartera,
							"guardarcambios","guardarcambios","Guardar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCartera,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCartera=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCartera=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCartera=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCartera=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCartera=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCartera= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCartera.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCartera,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCartera= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCartera.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCartera,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCartera= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCartera.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCartera,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCartera= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCartera.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCartera,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCartera= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCartera.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCartera,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCartera= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCartera.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCartera,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCartera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCartera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCartera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCartera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCartera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCartera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCartera,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCartera,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCartera, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCartera.add(this.jMenuItemDetalleCerrarCartera);
		
		this.jmenuDetalleAccionesCartera.add(this.jMenuItemActualizarCartera);
		this.jmenuDetalleAccionesCartera.add(this.jMenuItemEliminarCartera);
		this.jmenuDetalleAccionesCartera.add(this.jMenuItemCancelarCartera);		
		
		//this.jmenuDetalleDatosCartera.add(this.jMenuItemDetalleAbrirOrderByCartera);				
		this.jmenuDetalleDatosCartera.add(this.jMenuItemDetalleMostarOcultarCartera);				
				
		//this.jmenuDetalleAccionesCartera.add(this.jMenuItemGuardarCambiosCartera);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCartera.add(this.jmenuDetalleArchivoCartera);		
		this.jmenuBarDetalleCartera.add(this.jmenuDetalleAccionesCartera);		
		this.jmenuBarDetalleCartera.add(this.jmenuDetalleDatosCartera);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCartera);				
	}
	
	
	public void inicializarElementosCamposCartera() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCartera = new JLabelMe();
		jLabelIdCartera.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCartera = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCartera.setToolTipText(CarteraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCartera= new GridBagLayout();

		this.jPanelidCartera.setLayout(this.gridaBagLayoutCartera);

		jLabelidCartera = new JLabel();
		jLabelidCartera.setText("Id");

		jLabelidCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCartera = new JLabelMe();
		this.jLabelcodigoCartera.setText(""+CarteraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCartera.setToolTipText("Codigo");
		this.jLabelcodigoCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCartera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCartera.setToolTipText(CarteraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCartera = new GridBagLayout();
		this.jPanelcodigoCartera.setLayout(this.gridaBagLayoutCartera);


		jTextFieldcodigoCartera= new JTextFieldMe();

		jTextFieldcodigoCartera.setEnabled(false);
		jTextFieldcodigoCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCartera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCarteraBusqueda= new JButtonMe();
		this.jButtoncodigoCarteraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCarteraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCarteraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCarteraBusqueda.setText("U");
		this.jButtoncodigoCarteraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCarteraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCarteraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCarteraBusqueda"));

		if(this.carteraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCarteraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCartera() {
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
		//this.jInternalFrameDetalleCartera = new CarteraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cartera DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCartera= new GridBagLayout();
		

		
		String sToolTipCartera="";
		sToolTipCartera=CarteraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCartera+="(Cartera.Cartera)";
		}
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			sToolTipCartera+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCartera = new JButtonMe();
		this.jButtonModificarCartera = new JButtonMe();
        this.jButtonActualizarCartera = new JButtonMe();
        this.jButtonEliminarCartera = new JButtonMe();
        this.jButtonCancelarCartera = new JButtonMe();
        this.jButtonGuardarCambiosCartera = new JButtonMe();
		this.jButtonGuardarCambiosTablaCartera = new JButtonMe();
		this.jButtonCerrarCartera = new JButtonMe();
		
		this.jScrollPanelDatosCartera = new JScrollPane();   
        this.jScrollPanelDatosEdicionCartera = new JScrollPane();
		this.jScrollPanelDatosGeneralCartera = new JScrollPane();
				
		
		
		this.jPanelCamposCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cartera";
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carteras" + this.sPath));
		} else {
			this.jScrollPanelDatosCartera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCartera.setName("jPanelCamposCartera"); 

		this.jPanelCamposOcultosCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCartera.setName("jPanelCamposOcultosCartera"); 

        this.jPanelAccionesCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCartera.setToolTipText("Acciones");
        this.jPanelAccionesCartera.setName("Acciones"); 

		this.jPanelAccionesFormularioCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCartera.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCartera.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCartera, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCartera, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCartera, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCartera.setText("Nuevo");
		this.jButtonModificarCartera.setText("Editar");
        this.jButtonActualizarCartera.setText("Actualizar");
        this.jButtonEliminarCartera.setText("Eliminar");
        this.jButtonCancelarCartera.setText("Cancelar");
        this.jButtonGuardarCambiosCartera.setText("Guardar");
		this.jButtonGuardarCambiosTablaCartera.setText("Guardar");
		this.jButtonCerrarCartera.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCartera,"nuevo_button","Nuevo",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCartera,"modificar_button","Editar",this.carteraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCartera,"actualizar_button","Actualizar",this.carteraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCartera,"eliminar_button","Eliminar",this.carteraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCartera,"cancelar_button","Cancelar",this.carteraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCartera,"guardarcambios_button","Guardar",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCartera,"guardarcambiostabla_button","Guardar",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCartera,"cerrar_button","Salir",this.carteraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCartera.setToolTipText("Nuevo"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCartera.setToolTipText("Editar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCartera.setToolTipText("Actualizar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCartera.setToolTipText("Eliminar)"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCartera.setToolTipText("Cancelar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCartera.setToolTipText("Guardar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCartera.setToolTipText("Guardar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCartera.setToolTipText("Salir"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCartera";
		inputMap = this.jButtonNuevoCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCartera"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCartera";
		inputMap = this.jButtonActualizarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCartera"));
		
		//ELIMINAR
		sMapKey = "EliminarCartera";
		inputMap = this.jButtonEliminarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCartera"));
		
		//CANCELAR	
		sMapKey = "CancelarCartera";
		inputMap = this.jButtonCancelarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCartera"));
		
		//CERRAR		
		sMapKey = "CerrarCartera";
		inputMap = this.jButtonCerrarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCartera"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCartera";
		inputMap = this.jButtonGuardarCambiosTablaCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCartera"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCartera = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCartera.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCartera.setToolTipText("Nuevo Cartera");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCartera, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCartera = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCartera.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCartera.setToolTipText("Sin Cerrar Ventana Cartera");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCartera, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCartera = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCartera.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCartera.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCartera, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCartera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCartera.setText("Accion");
		this.jComboBoxTiposAccionesCartera.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCartera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCartera.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCartera.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCartera = new JLabelMe();
		
		this.jLabelAccionesCartera.setText("Acciones");		
		this.jLabelAccionesCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCartera();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCartera();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCartera=new JTabbedPane();
		this.jTabbedPaneRelacionesCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCartera,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCartera.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCartera.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCartera.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCartera, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCartera = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCartera = new GridBagLayout();
		
		this.jPanelCamposCartera.setLayout(gridaBagLayoutCamposCartera);
		this.jPanelCamposOcultosCartera.setLayout(gridaBagLayoutCamposOcultosCartera);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCartera = new GridBagConstraints();
	this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCartera.gridy = 0;
	this.gridBagConstraintsCartera.gridx = 0;
	this.gridBagConstraintsCartera.ipadx = 0;
	this.gridBagConstraintsCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCartera.add(jLabelIdCartera, this.gridBagConstraintsCartera);



	this.gridBagConstraintsCartera = new GridBagConstraints();
	this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCartera.gridy = 0;
	this.gridBagConstraintsCartera.gridx = 1;
	this.gridBagConstraintsCartera.ipadx = 0;
	this.gridBagConstraintsCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCartera.add(jLabelidCartera, this.gridBagConstraintsCartera);


	this.gridBagConstraintsCartera = new GridBagConstraints();
	this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCartera.gridy = 0;
	this.gridBagConstraintsCartera.gridx = 0;
	this.gridBagConstraintsCartera.ipadx = 0;
	this.gridBagConstraintsCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCartera.add(jLabelcodigoCartera, this.gridBagConstraintsCartera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCartera = new GridBagConstraints();
		//this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = 0;
		this.gridBagConstraintsCartera.gridx = 2;
		this.gridBagConstraintsCartera.ipadx = 0;
		this.gridBagConstraintsCartera.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCartera.add(jButtoncodigoCarteraBusqueda, this.gridBagConstraintsCartera);
	}

	this.gridBagConstraintsCartera = new GridBagConstraints();
	this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCartera.gridy = 0;
	this.gridBagConstraintsCartera.gridx = 1;
	this.gridBagConstraintsCartera.ipadx = 0;
	this.gridBagConstraintsCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCartera.add(jTextFieldcodigoCartera, this.gridBagConstraintsCartera);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCartera = new GridBagConstraints();
	this.gridBagConstraintsCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCartera.gridy = iYPanelCamposCartera;
	this.gridBagConstraintsCartera.gridx = iXPanelCamposCartera++;
	this.gridBagConstraintsCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCartera.add(this.jPanelidCartera, this.gridBagConstraintsCartera);



	if(iXPanelCamposCartera % 1==0) {
		iXPanelCamposCartera=0;
		iYPanelCamposCartera++;
	}
	this.gridBagConstraintsCartera = new GridBagConstraints();
	this.gridBagConstraintsCartera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCartera.gridy = iYPanelCamposCartera;
	this.gridBagConstraintsCartera.gridx = iXPanelCamposCartera++;
	this.gridBagConstraintsCartera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCartera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCartera.add(this.jPanelcodigoCartera, this.gridBagConstraintsCartera);



	if(iXPanelCamposCartera % 1==0) {
		iXPanelCamposCartera=0;
		iYPanelCamposCartera++;
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
			
		GridBagLayout gridaBagLayoutAccionesCartera= new GridBagLayout();
		this.jPanelAccionesCartera.setLayout(gridaBagLayoutAccionesCartera);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCartera= new GridBagLayout();
		this.jPanelAccionesFormularioCartera.setLayout(gridaBagLayoutAccionesFormularioCartera);
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCartera.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCartera.add(this.jComboBoxTiposAccionesFormularioCartera, this.gridBagConstraintsCartera);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = 0;
		this.gridBagConstraintsCartera.gridx = iPosXAccion++;
			
		this.jPanelAccionesCartera.add(this.jButtonModificarCartera, this.gridBagConstraintsCartera);							

		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = 0;
		this.gridBagConstraintsCartera.gridx =iPosXAccion++;
			
		this.jPanelAccionesCartera.add(this.jButtonEliminarCartera, this.gridBagConstraintsCartera);
		
			
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = 0;		
		this.gridBagConstraintsCartera.gridx = iPosXAccion++;
		
		this.jPanelAccionesCartera.add(this.jButtonActualizarCartera, this.gridBagConstraintsCartera);


		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = 0;		
		this.gridBagConstraintsCartera.gridx = iPosXAccion++;
		
		this.jPanelAccionesCartera.add(this.jButtonGuardarCambiosCartera, this.gridBagConstraintsCartera);	
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = 0;		
		this.gridBagConstraintsCartera.gridx =iPosXAccion++;
		
		this.jPanelAccionesCartera.add(this.jButtonCancelarCartera, this.gridBagConstraintsCartera);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCartera = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCartera);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.carteraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCartera = new GridBagConstraints();						
			this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCartera.gridx = 0;		
			//this.gridBagConstraintsCartera.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCartera.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCartera.gridx =0;
		this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCartera.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCartera, this.gridBagConstraintsCartera);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CarteraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCartera = new CarteraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cartera DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cartera DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cartera Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CarteraModel carteraModel=new CarteraModel(this);
			
			//SI USARA CLASE INTERNA
			//CarteraModel.CarteraFocusTraversalPolicy carteraFocusTraversalPolicy = carteraModel.new CarteraFocusTraversalPolicy(this);
			
			//carteraFocusTraversalPolicy.setcarteraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(carteraModel);
			
			
			this.jContentPaneDetalleCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCartera = new GridBagLayout();	
			this.jContentPaneDetalleCartera.setLayout(gridaBagLayoutDetalleCartera);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCartera = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCartera = new GridBagConstraints();
				this.gridBagConstraintsCartera.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCartera.gridx = 0;
					
				
				this.jContentPaneDetalleCartera.add(jTtoolBarDetalleCartera, gridBagConstraintsCartera);								
				
}
			
			this.jScrollPanelDatosEdicionCartera=   new JScrollPane(jContentPaneDetalleCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCartera=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCartera.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCartera.gridx = 0;
	        
			this.jContentPaneDetalleCartera.add(jPanelCamposCartera, gridBagConstraintsCartera);
			
			
			
			
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
						&& carteraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.carteraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCartera= new GridBagConstraints();
						this.gridBagConstraintsCartera.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCartera.gridx = 0;
						this.jContentPaneDetalleCartera.add(this.jTabbedPaneRelacionesCartera, this.gridBagConstraintsCartera);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCartera.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCartera.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCartera = new GridBagConstraints();
					this.gridBagConstraintsCartera.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCartera.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCartera.gridx = 0;
					
				
					this.jContentPaneDetalleCartera.add(jPanelCamposOcultosCartera, gridBagConstraintsCartera);
				
					this.jPanelCamposOcultosCartera.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCartera.gridx = 0;
	        this.gridBagConstraintsCartera.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCartera.add(this.jPanelAccionesFormularioCartera, this.gridBagConstraintsCartera);							
			
			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
	        this.gridBagConstraintsCartera.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCartera.gridx = 0;
	        
			
			this.jContentPaneDetalleCartera.add(this.jPanelAccionesCartera, this.gridBagConstraintsCartera);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCartera);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCartera=   new JScrollPane(this.jPanelCamposCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCartera.gridx = 0;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCartera.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCartera, this.gridBagConstraintsCartera);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCartera.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCartera, this.gridBagConstraintsCartera);			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCartera.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCartera, this.gridBagConstraintsCartera);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCartera, this.gridBagConstraintsCartera);
			
			
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCartera, this.gridBagConstraintsCartera);
		
			
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCartera, this.gridBagConstraintsCartera);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCartera;//jContentPane;
		
		return jScrollPanelDatosEdicionCartera;
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
