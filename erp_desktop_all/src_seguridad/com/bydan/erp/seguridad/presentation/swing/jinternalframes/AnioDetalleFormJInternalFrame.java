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
import com.bydan.erp.seguridad.util.AnioConstantesFunciones;

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
public class AnioDetalleFormJInternalFrame extends AnioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAnio;
	
	protected JMenuBar jmenuBarDetalleAnio;
	
	protected JMenu jmenuDetalleAnio;
	protected JMenu jmenuDetalleArchivoAnio;
	protected JMenu jmenuDetalleAccionesAnio;
	protected JMenu jmenuDetalleDatosAnio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnio;	
	protected GridBagConstraints gridBagConstraintsAnio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AnioBeanSwingJInternalFrameAdditional jInternalFrameDetalleAnio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public AnioSessionBean anioSessionBean;
	
	
	
		
	
	public AnioLogic anioLogic;
	
	public JScrollPane jScrollPanelDatosAnio;
	public JScrollPane jScrollPanelDatosEdicionAnio;
	public JScrollPane jScrollPanelDatosGeneralAnio;
	
	protected JPanel jPanelCamposAnio;    
	protected JPanel jPanelCamposOcultosAnio;    	
	protected JPanel jPanelAccionesAnio;
	protected JPanel jPanelAccionesFormularioAnio;
    
	
	
	protected Integer iXPanelCamposAnio=0;
	protected Integer iYPanelCamposAnio=0;
	
	protected Integer iXPanelCamposOcultosAnio=0;
	protected Integer iYPanelCamposOcultosAnio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAnio;
	public JButton jButtonModificarAnio;
	public JButton jButtonActualizarAnio;
    public JButton jButtonEliminarAnio;
	public JButton jButtonCancelarAnio;
    public JButton jButtonGuardarCambiosAnio;
	public JButton jButtonGuardarCambiosTablaAnio;
	protected JButton jButtonCerrarAnio;
	
	
	protected JButton jButtonProcesarInformacionAnio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAnio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAnio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAnio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnio;
	protected JButton jButtonModificarToolBarAnio;
	protected JButton jButtonActualizarToolBarAnio;
    protected JButton jButtonEliminarToolBarAnio;
	protected JButton jButtonCancelarToolBarAnio;
    protected JButton jButtonGuardarCambiosToolBarAnio;
	protected JButton jButtonGuardarCambiosTablaToolBarAnio;
	protected JButton jButtonMostrarOcultarTablaToolBarAnio;
	protected JButton jButtonCerrarToolBarAnio;
	
	protected JButton jButtonProcesarInformacionToolBarAnio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnio;
	protected JMenuItem jMenuItemModificarAnio;
	protected JMenuItem jMenuItemActualizarAnio;
    protected JMenuItem jMenuItemEliminarAnio;
	protected JMenuItem jMenuItemCancelarAnio;
    protected JMenuItem jMenuItemGuardarCambiosAnio;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnio;
	protected JMenuItem jMenuItemCerrarAnio;
	protected JMenuItem jMenuItemDetalleCerrarAnio;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnio;
	
	protected JMenuItem jMenuItemProcesarInformacionAnio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnio;
	protected JMenuItem jMenuItemMostrarOcultarAnio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAnio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAnio;
	public JLabel jLabelIdAnio;
	public JTextFieldMe jTextFieldidAnio;
	public JButton jButtonidAnioBusqueda= new JButtonMe();

	public JPanel jPanelnombreAnio;
	public JLabel jLabelnombreAnio;
	public JTextField jTextFieldnombreAnio;
	public JButton jButtonnombreAnioBusqueda= new JButtonMe();

	public JPanel jPanelvalorAnio;
	public JLabel jLabelvalorAnio;
	public JTextField jTextFieldvalorAnio;
	public JButton jButtonvalorAnioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAnio;
	
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
	
	public AnioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAnio=new JPanel();
				this.jPanelAccionesFormularioAnio=new JPanel();
				this.jmenuBarDetalleAnio=new JMenuBar();
				this.jTtoolBarDetalleAnio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AnioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAnio() {
		return this.jButtonActualizarToolBarAnio;
	}
	
	public JButton getjButtonEliminarToolBarAnio() {
		return this.jButtonEliminarToolBarAnio;
	}
	
	public JButton getjButtonCancelarToolBarAnio() {
		return this.jButtonCancelarToolBarAnio;
	}		
	
	public JButton getjButtonProcesarInformacionAnio() {
		return this.jButtonProcesarInformacionAnio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnio)	{
		this.jButtonProcesarInformacionAnio = jButtonProcesarInformacionAnio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnio() {
		return this.jComboBoxTiposAccionesAnio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnio(
			JComboBox jComboBoxTiposRelacionesAnio) {
		this.jComboBoxTiposRelacionesAnio = jComboBoxTiposRelacionesAnio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnio(
			JComboBox jComboBoxTiposAccionesAnio) {
		this.jComboBoxTiposAccionesAnio = jComboBoxTiposAccionesAnio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAnio() {
		return this.jComboBoxTiposAccionesFormularioAnio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAnio(
			JComboBox jComboBoxTiposAccionesFormularioAnio) {
		this.jComboBoxTiposAccionesFormularioAnio = jComboBoxTiposAccionesFormularioAnio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.anioSessionBean=new AnioSessionBean();
		
		this.anioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.anioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Anio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
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
	
		AnioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAnio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAnio=new JButtonMe();
				this.jButtonModificarToolBarAnio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAnio,this.jTtoolBarDetalleAnio,
							"actualizar","actualizar","Actualizar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAnio,this.jTtoolBarDetalleAnio,
							"eliminar","eliminar","Eliminar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAnio,this.jTtoolBarDetalleAnio,
							"cancelar","cancelar","Cancelar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAnio,this.jTtoolBarDetalleAnio,
							"guardarcambios","guardarcambios","Guardar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAnio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAnio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAnio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAnio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAnio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAnio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAnio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAnio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAnio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAnio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAnio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAnio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAnio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAnio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAnio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAnio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAnio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAnio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAnio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAnio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAnio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAnio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAnio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAnio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAnio.add(this.jMenuItemDetalleCerrarAnio);
		
		this.jmenuDetalleAccionesAnio.add(this.jMenuItemActualizarAnio);
		this.jmenuDetalleAccionesAnio.add(this.jMenuItemEliminarAnio);
		this.jmenuDetalleAccionesAnio.add(this.jMenuItemCancelarAnio);		
		
		//this.jmenuDetalleDatosAnio.add(this.jMenuItemDetalleAbrirOrderByAnio);				
		this.jmenuDetalleDatosAnio.add(this.jMenuItemDetalleMostarOcultarAnio);				
				
		//this.jmenuDetalleAccionesAnio.add(this.jMenuItemGuardarCambiosAnio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAnio.add(this.jmenuDetalleArchivoAnio);		
		this.jmenuBarDetalleAnio.add(this.jmenuDetalleAccionesAnio);		
		this.jmenuBarDetalleAnio.add(this.jmenuDetalleDatosAnio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAnio);				
	}
	
	
	public void inicializarElementosCamposAnio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAnio = new JLabelMe();
		jLabelIdAnio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAnio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAnio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAnio.setToolTipText(AnioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAnio= new GridBagLayout();

		this.jPanelidAnio.setLayout(this.gridaBagLayoutAnio);

		jTextFieldidAnio = new JTextFieldMe();
		jTextFieldidAnio.setText("Id");

		jTextFieldidAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreAnio = new JLabelMe();
		this.jLabelnombreAnio.setText(""+AnioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAnio.setToolTipText("Nombre");
		this.jLabelnombreAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAnio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAnio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAnio.setToolTipText(AnioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAnio = new GridBagLayout();
		this.jPanelnombreAnio.setLayout(this.gridaBagLayoutAnio);


		jTextFieldnombreAnio= new JTextFieldMe();

		jTextFieldnombreAnio.setEnabled(false);
		jTextFieldnombreAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreAnio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreAnioBusqueda= new JButtonMe();
		this.jButtonnombreAnioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAnioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAnioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAnioBusqueda.setText("U");
		this.jButtonnombreAnioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAnioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAnioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreAnio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreAnio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAnioBusqueda"));

		if(this.anioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAnioBusqueda.setVisible(false);		}


					
		this.jLabelvalorAnio = new JLabelMe();
		this.jLabelvalorAnio.setText(""+AnioConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorAnio.setToolTipText("Valor");
		this.jLabelvalorAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorAnio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorAnio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorAnio.setToolTipText(AnioConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutAnio = new GridBagLayout();
		this.jPanelvalorAnio.setLayout(this.gridaBagLayoutAnio);


		jTextFieldvalorAnio= new JTextFieldMe();
		jTextFieldvalorAnio.setEnabled(false);
		jTextFieldvalorAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorAnio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorAnio.setText("0.0");

		this.jButtonvalorAnioBusqueda= new JButtonMe();
		this.jButtonvalorAnioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAnioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAnioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorAnioBusqueda.setText("U");
		this.jButtonvalorAnioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorAnioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorAnioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorAnio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorAnio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorAnioBusqueda"));

		if(this.anioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorAnioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAnio() {
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
		//this.jInternalFrameDetalleAnio = new AnioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Anio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnio= new GridBagLayout();
		

		
		String sToolTipAnio="";
		sToolTipAnio=AnioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnio+="(Seguridad.Anio)";
		}
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAnio = new JButtonMe();
		this.jButtonModificarAnio = new JButtonMe();
        this.jButtonActualizarAnio = new JButtonMe();
        this.jButtonEliminarAnio = new JButtonMe();
        this.jButtonCancelarAnio = new JButtonMe();
        this.jButtonGuardarCambiosAnio = new JButtonMe();
		this.jButtonGuardarCambiosTablaAnio = new JButtonMe();
		this.jButtonCerrarAnio = new JButtonMe();
		
		this.jScrollPanelDatosAnio = new JScrollPane();   
        this.jScrollPanelDatosEdicionAnio = new JScrollPane();
		this.jScrollPanelDatosGeneralAnio = new JScrollPane();
				
		
		
		this.jPanelCamposAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Anio";
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anios" + this.sPath));
		} else {
			this.jScrollPanelDatosAnio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAnio.setName("jPanelCamposAnio"); 

		this.jPanelCamposOcultosAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAnio.setName("jPanelCamposOcultosAnio"); 

        this.jPanelAccionesAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnio.setToolTipText("Acciones");
        this.jPanelAccionesAnio.setName("Acciones"); 

		this.jPanelAccionesFormularioAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAnio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAnio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAnio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAnio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAnio.setText("Nuevo");
		this.jButtonModificarAnio.setText("Editar");
        this.jButtonActualizarAnio.setText("Actualizar");
        this.jButtonEliminarAnio.setText("Eliminar");
        this.jButtonCancelarAnio.setText("Cancelar");
        this.jButtonGuardarCambiosAnio.setText("Guardar");
		this.jButtonGuardarCambiosTablaAnio.setText("Guardar");
		this.jButtonCerrarAnio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnio,"nuevo_button","Nuevo",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAnio,"modificar_button","Editar",this.anioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAnio,"actualizar_button","Actualizar",this.anioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAnio,"eliminar_button","Eliminar",this.anioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAnio,"cancelar_button","Cancelar",this.anioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAnio,"guardarcambios_button","Guardar",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnio,"guardarcambiostabla_button","Guardar",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnio,"cerrar_button","Salir",this.anioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAnio.setToolTipText("Nuevo"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAnio.setToolTipText("Editar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAnio.setToolTipText("Actualizar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAnio.setToolTipText("Eliminar)"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAnio.setToolTipText("Cancelar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAnio.setToolTipText("Guardar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAnio.setToolTipText("Guardar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnio.setToolTipText("Salir"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnio";
		inputMap = this.jButtonNuevoAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAnio";
		inputMap = this.jButtonActualizarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAnio"));
		
		//ELIMINAR
		sMapKey = "EliminarAnio";
		inputMap = this.jButtonEliminarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAnio"));
		
		//CANCELAR	
		sMapKey = "CancelarAnio";
		inputMap = this.jButtonCancelarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAnio"));
		
		//CERRAR		
		sMapKey = "CerrarAnio";
		inputMap = this.jButtonCerrarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnio";
		inputMap = this.jButtonGuardarCambiosTablaAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAnio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAnio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAnio.setToolTipText("Nuevo Anio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAnio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAnio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAnio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAnio.setToolTipText("Sin Cerrar Ventana Anio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAnio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAnio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAnio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAnio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAnio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAnio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnio.setText("Accion");
		this.jComboBoxTiposAccionesAnio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAnio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAnio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAnio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAnio = new JLabelMe();
		
		this.jLabelAccionesAnio.setText("Acciones");		
		this.jLabelAccionesAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAnio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAnio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAnio=new JTabbedPane();
		this.jTabbedPaneRelacionesAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAnio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAnio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAnio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAnio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAnio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAnio = new GridBagLayout();
		
		this.jPanelCamposAnio.setLayout(gridaBagLayoutCamposAnio);
		this.jPanelCamposOcultosAnio.setLayout(gridaBagLayoutCamposOcultosAnio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnio.gridy = 0;
	this.gridBagConstraintsAnio.gridx = 0;
	this.gridBagConstraintsAnio.ipadx = 0;
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAnio.add(jLabelIdAnio, this.gridBagConstraintsAnio);



	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnio.gridy = 0;
	this.gridBagConstraintsAnio.gridx = 1;
	this.gridBagConstraintsAnio.ipadx = 0;
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAnio.add(jTextFieldidAnio, this.gridBagConstraintsAnio);


	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnio.gridy = 0;
	this.gridBagConstraintsAnio.gridx = 0;
	this.gridBagConstraintsAnio.ipadx = 0;
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAnio.add(jLabelnombreAnio, this.gridBagConstraintsAnio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnio = new GridBagConstraints();
		//this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = 0;
		this.gridBagConstraintsAnio.gridx = 2;
		this.gridBagConstraintsAnio.ipadx = 0;
		this.gridBagConstraintsAnio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAnio.add(jButtonnombreAnioBusqueda, this.gridBagConstraintsAnio);
	}

	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnio.gridy = 0;
	this.gridBagConstraintsAnio.gridx = 1;
	this.gridBagConstraintsAnio.ipadx = 0;
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAnio.add(jTextFieldnombreAnio, this.gridBagConstraintsAnio);


	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnio.gridy = 0;
	this.gridBagConstraintsAnio.gridx = 0;
	this.gridBagConstraintsAnio.ipadx = 0;
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorAnio.add(jLabelvalorAnio, this.gridBagConstraintsAnio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnio = new GridBagConstraints();
		//this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = 0;
		this.gridBagConstraintsAnio.gridx = 2;
		this.gridBagConstraintsAnio.ipadx = 0;
		this.gridBagConstraintsAnio.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorAnio.add(jButtonvalorAnioBusqueda, this.gridBagConstraintsAnio);
	}

	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnio.gridy = 0;
	this.gridBagConstraintsAnio.gridx = 1;
	this.gridBagConstraintsAnio.ipadx = 0;
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorAnio.add(jTextFieldvalorAnio, this.gridBagConstraintsAnio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnio.gridy = iYPanelCamposAnio;
	this.gridBagConstraintsAnio.gridx = iXPanelCamposAnio++;
	this.gridBagConstraintsAnio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnio.add(this.jPanelidAnio, this.gridBagConstraintsAnio);



	if(iXPanelCamposAnio % 1==0) {
		iXPanelCamposAnio=0;
		iYPanelCamposAnio++;
	}
	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnio.gridy = iYPanelCamposAnio;
	this.gridBagConstraintsAnio.gridx = iXPanelCamposAnio++;
	this.gridBagConstraintsAnio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnio.add(this.jPanelnombreAnio, this.gridBagConstraintsAnio);



	if(iXPanelCamposAnio % 1==0) {
		iXPanelCamposAnio=0;
		iYPanelCamposAnio++;
	}
	this.gridBagConstraintsAnio = new GridBagConstraints();
	this.gridBagConstraintsAnio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnio.gridy = iYPanelCamposAnio;
	this.gridBagConstraintsAnio.gridx = iXPanelCamposAnio++;
	this.gridBagConstraintsAnio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnio.add(this.jPanelvalorAnio, this.gridBagConstraintsAnio);



	if(iXPanelCamposAnio % 1==0) {
		iXPanelCamposAnio=0;
		iYPanelCamposAnio++;
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
			
		GridBagLayout gridaBagLayoutAccionesAnio= new GridBagLayout();
		this.jPanelAccionesAnio.setLayout(gridaBagLayoutAccionesAnio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAnio= new GridBagLayout();
		this.jPanelAccionesFormularioAnio.setLayout(gridaBagLayoutAccionesFormularioAnio);
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnio.add(this.jComboBoxTiposAccionesFormularioAnio, this.gridBagConstraintsAnio);

		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnio.add(this.jCheckBoxPostAccionNuevoAnio, this.gridBagConstraintsAnio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.anioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAnio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAnio.add(this.jCheckBoxPostAccionSinCerrarAnio, this.gridBagConstraintsAnio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.anioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.anioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAnio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAnio.add(this.jCheckBoxPostAccionSinMensajeAnio, this.gridBagConstraintsAnio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = 0;
		this.gridBagConstraintsAnio.gridx = iPosXAccion++;
			
		this.jPanelAccionesAnio.add(this.jButtonModificarAnio, this.gridBagConstraintsAnio);							

		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = 0;
		this.gridBagConstraintsAnio.gridx =iPosXAccion++;
			
		this.jPanelAccionesAnio.add(this.jButtonEliminarAnio, this.gridBagConstraintsAnio);
		
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = 0;		
		this.gridBagConstraintsAnio.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnio.add(this.jButtonActualizarAnio, this.gridBagConstraintsAnio);


		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = 0;		
		this.gridBagConstraintsAnio.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnio.add(this.jButtonGuardarCambiosAnio, this.gridBagConstraintsAnio);	
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = 0;		
		this.gridBagConstraintsAnio.gridx =iPosXAccion++;
		
		this.jPanelAccionesAnio.add(this.jButtonCancelarAnio, this.gridBagConstraintsAnio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.anioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnio = new GridBagConstraints();						
			this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnio.gridx = 0;		
			//this.gridBagConstraintsAnio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnio.gridx =0;
		this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnio, this.gridBagConstraintsAnio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AnioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAnio = new AnioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Anio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Anio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Anio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AnioModel anioModel=new AnioModel(this);
			
			//SI USARA CLASE INTERNA
			//AnioModel.AnioFocusTraversalPolicy anioFocusTraversalPolicy = anioModel.new AnioFocusTraversalPolicy(this);
			
			//anioFocusTraversalPolicy.setanioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(anioModel);
			
			
			this.jContentPaneDetalleAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAnio = new GridBagLayout();	
			this.jContentPaneDetalleAnio.setLayout(gridaBagLayoutDetalleAnio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAnio = new GridBagConstraints();
				this.gridBagConstraintsAnio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAnio.gridx = 0;
					
				
				this.jContentPaneDetalleAnio.add(jTtoolBarDetalleAnio, gridBagConstraintsAnio);								
				
}
			
			this.jScrollPanelDatosEdicionAnio=   new JScrollPane(jContentPaneDetalleAnio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAnio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAnio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAnio.gridx = 0;
	        
			this.jContentPaneDetalleAnio.add(jPanelCamposAnio, gridBagConstraintsAnio);
			
			
			
			
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
						&& anioSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.anioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAnio= new GridBagConstraints();
						this.gridBagConstraintsAnio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAnio.gridx = 0;
						this.jContentPaneDetalleAnio.add(this.jTabbedPaneRelacionesAnio, this.gridBagConstraintsAnio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAnio.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAnio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAnio = new GridBagConstraints();
					this.gridBagConstraintsAnio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAnio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAnio.gridx = 0;
					
				
					this.jContentPaneDetalleAnio.add(jPanelCamposOcultosAnio, gridBagConstraintsAnio);
				
					this.jPanelCamposOcultosAnio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAnio.gridx = 0;
	        this.gridBagConstraintsAnio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAnio.add(this.jPanelAccionesFormularioAnio, this.gridBagConstraintsAnio);							
			
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
	        this.gridBagConstraintsAnio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAnio.gridx = 0;
	        
			
			this.jContentPaneDetalleAnio.add(this.jPanelAccionesAnio, this.gridBagConstraintsAnio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAnio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAnio=   new JScrollPane(this.jPanelCamposAnio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAnio.gridx = 0;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAnio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAnio, this.gridBagConstraintsAnio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAnio, this.gridBagConstraintsAnio);			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAnio, this.gridBagConstraintsAnio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnio, this.gridBagConstraintsAnio);
			
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnio, this.gridBagConstraintsAnio);
		
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnio, this.gridBagConstraintsAnio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAnio;//jContentPane;
		
		return jScrollPanelDatosEdicionAnio;
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
