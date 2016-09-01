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
import com.bydan.erp.seguridad.util.TipoVisualConstantesFunciones;

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
public class TipoVisualDetalleFormJInternalFrame extends TipoVisualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoVisual;
	
	protected JMenuBar jmenuBarDetalleTipoVisual;
	
	protected JMenu jmenuDetalleTipoVisual;
	protected JMenu jmenuDetalleArchivoTipoVisual;
	protected JMenu jmenuDetalleAccionesTipoVisual;
	protected JMenu jmenuDetalleDatosTipoVisual;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVisual;	
	protected GridBagConstraints gridBagConstraintsTipoVisual;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoVisualBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoVisual;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoVisualSessionBean tipovisualSessionBean;
	
	
	
		
	
	public TipoVisualLogic tipovisualLogic;
	
	public JScrollPane jScrollPanelDatosTipoVisual;
	public JScrollPane jScrollPanelDatosEdicionTipoVisual;
	public JScrollPane jScrollPanelDatosGeneralTipoVisual;
	
	protected JPanel jPanelCamposTipoVisual;    
	protected JPanel jPanelCamposOcultosTipoVisual;    	
	protected JPanel jPanelAccionesTipoVisual;
	protected JPanel jPanelAccionesFormularioTipoVisual;
    
	
	
	protected Integer iXPanelCamposTipoVisual=0;
	protected Integer iYPanelCamposTipoVisual=0;
	
	protected Integer iXPanelCamposOcultosTipoVisual=0;
	protected Integer iYPanelCamposOcultosTipoVisual=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoVisual;
	public JButton jButtonModificarTipoVisual;
	public JButton jButtonActualizarTipoVisual;
    public JButton jButtonEliminarTipoVisual;
	public JButton jButtonCancelarTipoVisual;
    public JButton jButtonGuardarCambiosTipoVisual;
	public JButton jButtonGuardarCambiosTablaTipoVisual;
	protected JButton jButtonCerrarTipoVisual;
	
	
	protected JButton jButtonProcesarInformacionTipoVisual;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoVisual;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoVisual;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoVisual;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVisual;
	protected JButton jButtonModificarToolBarTipoVisual;
	protected JButton jButtonActualizarToolBarTipoVisual;
    protected JButton jButtonEliminarToolBarTipoVisual;
	protected JButton jButtonCancelarToolBarTipoVisual;
    protected JButton jButtonGuardarCambiosToolBarTipoVisual;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoVisual;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVisual;
	protected JButton jButtonCerrarToolBarTipoVisual;
	
	protected JButton jButtonProcesarInformacionToolBarTipoVisual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVisual;
	protected JMenuItem jMenuItemModificarTipoVisual;
	protected JMenuItem jMenuItemActualizarTipoVisual;
    protected JMenuItem jMenuItemEliminarTipoVisual;
	protected JMenuItem jMenuItemCancelarTipoVisual;
    protected JMenuItem jMenuItemGuardarCambiosTipoVisual;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVisual;
	protected JMenuItem jMenuItemCerrarTipoVisual;
	protected JMenuItem jMenuItemDetalleCerrarTipoVisual;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVisual;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoVisual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVisual;
	protected JMenuItem jMenuItemMostrarOcultarTipoVisual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVisual;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVisual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVisual;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoVisual;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoVisual;
	public JLabel jLabelIdTipoVisual;
	public JTextFieldMe jTextFieldidTipoVisual;
	public JButton jButtonidTipoVisualBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoVisual;
	public JLabel jLabelcodigoTipoVisual;
	public JTextField jTextFieldcodigoTipoVisual;
	public JButton jButtoncodigoTipoVisualBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoVisual;
	public JLabel jLabelnombreTipoVisual;
	public JTextArea jTextAreanombreTipoVisual;
	public JScrollPane jscrollPanenombreTipoVisual;
	public JButton jButtonnombreTipoVisualBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoVisual;
	
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
	
	public TipoVisualDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoVisual=new JPanel();
				this.jPanelAccionesFormularioTipoVisual=new JPanel();
				this.jmenuBarDetalleTipoVisual=new JMenuBar();
				this.jTtoolBarDetalleTipoVisual=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoVisualDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVisualDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVisual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoVisual() {
		return this.jButtonActualizarToolBarTipoVisual;
	}
	
	public JButton getjButtonEliminarToolBarTipoVisual() {
		return this.jButtonEliminarToolBarTipoVisual;
	}
	
	public JButton getjButtonCancelarToolBarTipoVisual() {
		return this.jButtonCancelarToolBarTipoVisual;
	}		
	
	public JButton getjButtonProcesarInformacionTipoVisual() {
		return this.jButtonProcesarInformacionTipoVisual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVisual)	{
		this.jButtonProcesarInformacionTipoVisual = jButtonProcesarInformacionTipoVisual;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVisual() {
		return this.jComboBoxTiposAccionesTipoVisual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVisual(
			JComboBox jComboBoxTiposRelacionesTipoVisual) {
		this.jComboBoxTiposRelacionesTipoVisual = jComboBoxTiposRelacionesTipoVisual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVisual(
			JComboBox jComboBoxTiposAccionesTipoVisual) {
		this.jComboBoxTiposAccionesTipoVisual = jComboBoxTiposAccionesTipoVisual;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoVisual() {
		return this.jComboBoxTiposAccionesFormularioTipoVisual;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoVisual(
			JComboBox jComboBoxTiposAccionesFormularioTipoVisual) {
		this.jComboBoxTiposAccionesFormularioTipoVisual = jComboBoxTiposAccionesFormularioTipoVisual;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipovisualSessionBean=new TipoVisualSessionBean();
		
		this.tipovisualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovisualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovisualSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVisualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVisualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVisualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Visual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoVisualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoVisual= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoVisual=new JButtonMe();
				this.jButtonModificarToolBarTipoVisual=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoVisual,this.jTtoolBarDetalleTipoVisual,
							"actualizar","actualizar","Actualizar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoVisual,this.jTtoolBarDetalleTipoVisual,
							"eliminar","eliminar","Eliminar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoVisual,this.jTtoolBarDetalleTipoVisual,
							"cancelar","cancelar","Cancelar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoVisual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoVisual,this.jTtoolBarDetalleTipoVisual,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoVisual=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoVisual=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoVisual=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoVisual=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoVisual=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVisual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVisual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVisual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoVisual= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoVisual.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoVisual,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoVisual= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoVisual.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoVisual,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoVisual= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoVisual.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoVisual,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoVisual= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoVisual.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoVisual,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoVisual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVisual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVisual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVisual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVisual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVisual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoVisual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoVisual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoVisual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVisual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVisual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVisual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVisual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVisual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVisual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoVisual.add(this.jMenuItemDetalleCerrarTipoVisual);
		
		this.jmenuDetalleAccionesTipoVisual.add(this.jMenuItemActualizarTipoVisual);
		this.jmenuDetalleAccionesTipoVisual.add(this.jMenuItemEliminarTipoVisual);
		this.jmenuDetalleAccionesTipoVisual.add(this.jMenuItemCancelarTipoVisual);		
		
		//this.jmenuDetalleDatosTipoVisual.add(this.jMenuItemDetalleAbrirOrderByTipoVisual);				
		this.jmenuDetalleDatosTipoVisual.add(this.jMenuItemDetalleMostarOcultarTipoVisual);				
				
		//this.jmenuDetalleAccionesTipoVisual.add(this.jMenuItemGuardarCambiosTipoVisual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoVisual.add(this.jmenuDetalleArchivoTipoVisual);		
		this.jmenuBarDetalleTipoVisual.add(this.jmenuDetalleAccionesTipoVisual);		
		this.jmenuBarDetalleTipoVisual.add(this.jmenuDetalleDatosTipoVisual);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoVisual);				
	}
	
	
	public void inicializarElementosCamposTipoVisual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoVisual = new JLabelMe();
		jLabelIdTipoVisual.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoVisual = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoVisual.setToolTipText(TipoVisualConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoVisual= new GridBagLayout();

		this.jPanelidTipoVisual.setLayout(this.gridaBagLayoutTipoVisual);

		jTextFieldidTipoVisual = new JTextFieldMe();
		jTextFieldidTipoVisual.setText("Id");

		jTextFieldidTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoVisual = new JLabelMe();
		this.jLabelcodigoTipoVisual.setText(""+TipoVisualConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoVisual.setToolTipText("Código");
		this.jLabelcodigoTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoVisual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoVisual.setToolTipText(TipoVisualConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoVisual = new GridBagLayout();
		this.jPanelcodigoTipoVisual.setLayout(this.gridaBagLayoutTipoVisual);


		jTextFieldcodigoTipoVisual= new JTextFieldMe();

		jTextFieldcodigoTipoVisual.setEnabled(false);
		jTextFieldcodigoTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoVisualBusqueda= new JButtonMe();
		this.jButtoncodigoTipoVisualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVisualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVisualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoVisualBusqueda.setText("U");
		this.jButtoncodigoTipoVisualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoVisualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoVisualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoVisual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoVisual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoVisualBusqueda"));

		if(this.tipovisualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoVisualBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoVisual = new JLabelMe();
		this.jLabelnombreTipoVisual.setText(""+TipoVisualConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoVisual.setToolTipText("Nombre");
		this.jLabelnombreTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoVisual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoVisual.setToolTipText(TipoVisualConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoVisual = new GridBagLayout();
		this.jPanelnombreTipoVisual.setLayout(this.gridaBagLayoutTipoVisual);


		jTextAreanombreTipoVisual= new JTextAreaMe();
		jTextAreanombreTipoVisual.setEnabled(false);
		jTextAreanombreTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVisual.setLineWrap(true);
		jTextAreanombreTipoVisual.setWrapStyleWord(true);
		jTextAreanombreTipoVisual.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoVisual.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoVisual = new JScrollPane(jTextAreanombreTipoVisual);
		jscrollPanenombreTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoVisualBusqueda= new JButtonMe();
		this.jButtonnombreTipoVisualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVisualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVisualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoVisualBusqueda.setText("U");
		this.jButtonnombreTipoVisualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoVisualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoVisualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoVisual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoVisual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoVisualBusqueda"));

		if(this.tipovisualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoVisualBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoVisual() {
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
		//this.jInternalFrameDetalleTipoVisual = new TipoVisualBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Visual DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVisual= new GridBagLayout();
		

		
		String sToolTipTipoVisual="";
		sToolTipTipoVisual=TipoVisualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVisual+="(Seguridad.TipoVisual)";
		}
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVisual+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoVisual = new JButtonMe();
		this.jButtonModificarTipoVisual = new JButtonMe();
        this.jButtonActualizarTipoVisual = new JButtonMe();
        this.jButtonEliminarTipoVisual = new JButtonMe();
        this.jButtonCancelarTipoVisual = new JButtonMe();
        this.jButtonGuardarCambiosTipoVisual = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoVisual = new JButtonMe();
		this.jButtonCerrarTipoVisual = new JButtonMe();
		
		this.jScrollPanelDatosTipoVisual = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoVisual = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoVisual = new JScrollPane();
				
		
		
		this.jPanelCamposTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Visual";
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVisual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoVisual.setName("jPanelCamposTipoVisual"); 

		this.jPanelCamposOcultosTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoVisual.setName("jPanelCamposOcultosTipoVisual"); 

        this.jPanelAccionesTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVisual.setToolTipText("Acciones");
        this.jPanelAccionesTipoVisual.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoVisual.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoVisual.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoVisual.setText("Nuevo");
		this.jButtonModificarTipoVisual.setText("Editar");
        this.jButtonActualizarTipoVisual.setText("Actualizar");
        this.jButtonEliminarTipoVisual.setText("Eliminar");
        this.jButtonCancelarTipoVisual.setText("Cancelar");
        this.jButtonGuardarCambiosTipoVisual.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoVisual.setText("Guardar");
		this.jButtonCerrarTipoVisual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVisual,"nuevo_button","Nuevo",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoVisual,"modificar_button","Editar",this.tipovisualSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoVisual,"actualizar_button","Actualizar",this.tipovisualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoVisual,"eliminar_button","Eliminar",this.tipovisualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoVisual,"cancelar_button","Cancelar",this.tipovisualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoVisual,"guardarcambios_button","Guardar",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVisual,"guardarcambiostabla_button","Guardar",this.tipovisualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVisual,"cerrar_button","Salir",this.tipovisualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoVisual.setToolTipText("Nuevo"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoVisual.setToolTipText("Editar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoVisual.setToolTipText("Actualizar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoVisual.setToolTipText("Eliminar)"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoVisual.setToolTipText("Cancelar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoVisual.setToolTipText("Guardar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoVisual.setToolTipText("Guardar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVisual.setToolTipText("Salir"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVisual";
		inputMap = this.jButtonNuevoTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVisual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVisual"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoVisual";
		inputMap = this.jButtonActualizarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoVisual"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoVisual";
		inputMap = this.jButtonEliminarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoVisual"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoVisual";
		inputMap = this.jButtonCancelarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoVisual"));
		
		//CERRAR		
		sMapKey = "CerrarTipoVisual";
		inputMap = this.jButtonCerrarTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVisual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVisual";
		inputMap = this.jButtonGuardarCambiosTablaTipoVisual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVisual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVisual"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoVisual = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoVisual.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoVisual.setToolTipText("Nuevo TipoVisual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoVisual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoVisual.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoVisual.setToolTipText("Sin Cerrar Ventana TipoVisual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoVisual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoVisual.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoVisual.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVisual.setText("Accion");
		this.jComboBoxTiposAccionesTipoVisual.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoVisual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoVisual.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoVisual.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoVisual = new JLabelMe();
		
		this.jLabelAccionesTipoVisual.setText("Acciones");		
		this.jLabelAccionesTipoVisual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVisual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVisual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoVisual();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoVisual();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoVisual=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoVisual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoVisual,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoVisual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVisual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVisual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVisual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoVisual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVisual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVisual.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoVisual, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoVisual = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoVisual = new GridBagLayout();
		
		this.jPanelCamposTipoVisual.setLayout(gridaBagLayoutCamposTipoVisual);
		this.jPanelCamposOcultosTipoVisual.setLayout(gridaBagLayoutCamposOcultosTipoVisual);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVisual.gridy = 0;
	this.gridBagConstraintsTipoVisual.gridx = 0;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoVisual.add(jLabelIdTipoVisual, this.gridBagConstraintsTipoVisual);



	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVisual.gridy = 0;
	this.gridBagConstraintsTipoVisual.gridx = 1;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoVisual.add(jTextFieldidTipoVisual, this.gridBagConstraintsTipoVisual);


	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVisual.gridy = 0;
	this.gridBagConstraintsTipoVisual.gridx = 0;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoVisual.add(jLabelcodigoTipoVisual, this.gridBagConstraintsTipoVisual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		//this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = 0;
		this.gridBagConstraintsTipoVisual.gridx = 2;
		this.gridBagConstraintsTipoVisual.ipadx = 0;
		this.gridBagConstraintsTipoVisual.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoVisual.add(jButtoncodigoTipoVisualBusqueda, this.gridBagConstraintsTipoVisual);
	}

	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVisual.gridy = 0;
	this.gridBagConstraintsTipoVisual.gridx = 1;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoVisual.add(jTextFieldcodigoTipoVisual, this.gridBagConstraintsTipoVisual);


	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVisual.gridy = 0;
	this.gridBagConstraintsTipoVisual.gridx = 0;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoVisual.add(jLabelnombreTipoVisual, this.gridBagConstraintsTipoVisual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		//this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVisual.gridy = 0;
		this.gridBagConstraintsTipoVisual.gridx = 2;
		this.gridBagConstraintsTipoVisual.ipadx = 0;
		this.gridBagConstraintsTipoVisual.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoVisual.add(jButtonnombreTipoVisualBusqueda, this.gridBagConstraintsTipoVisual);
	}

	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVisual.gridy = 0;
	this.gridBagConstraintsTipoVisual.gridx = 1;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoVisual.add(jscrollPanenombreTipoVisual, this.gridBagConstraintsTipoVisual);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVisual.gridy = iYPanelCamposTipoVisual;
	this.gridBagConstraintsTipoVisual.gridx = iXPanelCamposTipoVisual++;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVisual.add(this.jPanelidTipoVisual, this.gridBagConstraintsTipoVisual);



	if(iXPanelCamposTipoVisual % 1==0) {
		iXPanelCamposTipoVisual=0;
		iYPanelCamposTipoVisual++;
	}
	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVisual.gridy = iYPanelCamposTipoVisual;
	this.gridBagConstraintsTipoVisual.gridx = iXPanelCamposTipoVisual++;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVisual.add(this.jPanelcodigoTipoVisual, this.gridBagConstraintsTipoVisual);



	if(iXPanelCamposTipoVisual % 1==0) {
		iXPanelCamposTipoVisual=0;
		iYPanelCamposTipoVisual++;
	}
	this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVisual.gridy = iYPanelCamposTipoVisual;
	this.gridBagConstraintsTipoVisual.gridx = iXPanelCamposTipoVisual++;
	this.gridBagConstraintsTipoVisual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVisual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVisual.add(this.jPanelnombreTipoVisual, this.gridBagConstraintsTipoVisual);



	if(iXPanelCamposTipoVisual % 1==0) {
		iXPanelCamposTipoVisual=0;
		iYPanelCamposTipoVisual++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoVisual= new GridBagLayout();
		this.jPanelAccionesTipoVisual.setLayout(gridaBagLayoutAccionesTipoVisual);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoVisual= new GridBagLayout();
		this.jPanelAccionesFormularioTipoVisual.setLayout(gridaBagLayoutAccionesFormularioTipoVisual);
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVisual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVisual.add(this.jComboBoxTiposAccionesFormularioTipoVisual, this.gridBagConstraintsTipoVisual);

		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVisual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVisual.add(this.jCheckBoxPostAccionNuevoTipoVisual, this.gridBagConstraintsTipoVisual);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipovisualSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVisual.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVisual.add(this.jCheckBoxPostAccionSinCerrarTipoVisual, this.gridBagConstraintsTipoVisual);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipovisualSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVisual.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVisual.add(this.jCheckBoxPostAccionSinMensajeTipoVisual, this.gridBagConstraintsTipoVisual);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = 0;
		this.gridBagConstraintsTipoVisual.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoVisual.add(this.jButtonModificarTipoVisual, this.gridBagConstraintsTipoVisual);							

		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVisual.gridy = 0;
		this.gridBagConstraintsTipoVisual.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoVisual.add(this.jButtonEliminarTipoVisual, this.gridBagConstraintsTipoVisual);
		
			
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = 0;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVisual.add(this.jButtonActualizarTipoVisual, this.gridBagConstraintsTipoVisual);


		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = 0;		
		this.gridBagConstraintsTipoVisual.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVisual.add(this.jButtonGuardarCambiosTipoVisual, this.gridBagConstraintsTipoVisual);	
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = 0;		
		this.gridBagConstraintsTipoVisual.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoVisual.add(this.jButtonCancelarTipoVisual, this.gridBagConstraintsTipoVisual);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVisual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVisual);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();						
			this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVisual.gridx = 0;		
			//this.gridBagConstraintsTipoVisual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVisual.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVisual.gridx =0;
		this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVisual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVisual, this.gridBagConstraintsTipoVisual);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoVisual = new TipoVisualBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Visual DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Visual DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Visual Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoVisualModel tipovisualModel=new TipoVisualModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoVisualModel.TipoVisualFocusTraversalPolicy tipovisualFocusTraversalPolicy = tipovisualModel.new TipoVisualFocusTraversalPolicy(this);
			
			//tipovisualFocusTraversalPolicy.settipovisualJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipovisualModel);
			
			
			this.jContentPaneDetalleTipoVisual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoVisual = new GridBagLayout();	
			this.jContentPaneDetalleTipoVisual.setLayout(gridaBagLayoutDetalleTipoVisual);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVisual = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoVisual = new GridBagConstraints();
				this.gridBagConstraintsTipoVisual.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoVisual.gridx = 0;
					
				
				this.jContentPaneDetalleTipoVisual.add(jTtoolBarDetalleTipoVisual, gridBagConstraintsTipoVisual);								
				
}
			
			this.jScrollPanelDatosEdicionTipoVisual=   new JScrollPane(jContentPaneDetalleTipoVisual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVisual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVisual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVisual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoVisual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVisual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVisual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVisual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoVisual.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoVisual.gridx = 0;
	        
			this.jContentPaneDetalleTipoVisual.add(jPanelCamposTipoVisual, gridBagConstraintsTipoVisual);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipovisualSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoVisual= new GridBagConstraints();
						this.gridBagConstraintsTipoVisual.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoVisual.gridx = 0;
						this.jContentPaneDetalleTipoVisual.add(this.jTabbedPaneRelacionesTipoVisual, this.gridBagConstraintsTipoVisual);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoVisual.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoVisual.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoVisual = new GridBagConstraints();
					this.gridBagConstraintsTipoVisual.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoVisual.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoVisual.gridx = 0;
					
				
					this.jContentPaneDetalleTipoVisual.add(jPanelCamposOcultosTipoVisual, gridBagConstraintsTipoVisual);
				
					this.jPanelCamposOcultosTipoVisual.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoVisual.gridx = 0;
	        this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoVisual.add(this.jPanelAccionesFormularioTipoVisual, this.gridBagConstraintsTipoVisual);							
			
			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
	        this.gridBagConstraintsTipoVisual.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoVisual.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoVisual.add(this.jPanelAccionesTipoVisual, this.gridBagConstraintsTipoVisual);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoVisual);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoVisual=   new JScrollPane(this.jPanelCamposTipoVisual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVisual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVisual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVisual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoVisual.gridx = 0;
			this.gridBagConstraintsTipoVisual.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoVisual.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoVisual.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoVisual, this.gridBagConstraintsTipoVisual);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVisual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoVisual, this.gridBagConstraintsTipoVisual);			
			
			this.gridBagConstraintsTipoVisual = new GridBagConstraints();
			this.gridBagConstraintsTipoVisual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVisual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoVisual, this.gridBagConstraintsTipoVisual);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVisual, this.gridBagConstraintsTipoVisual);
			
			
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVisual, this.gridBagConstraintsTipoVisual);
		
			
		this.gridBagConstraintsTipoVisual = new GridBagConstraints();
		this.gridBagConstraintsTipoVisual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVisual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVisual, this.gridBagConstraintsTipoVisual);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoVisual;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoVisual;
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
