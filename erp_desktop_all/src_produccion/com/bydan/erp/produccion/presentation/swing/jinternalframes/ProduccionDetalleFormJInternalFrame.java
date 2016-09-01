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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;



import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProduccionConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProduccionDetalleFormJInternalFrame extends ProduccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProduccion;
	
	protected JMenuBar jmenuBarDetalleProduccion;
	
	protected JMenu jmenuDetalleProduccion;
	protected JMenu jmenuDetalleArchivoProduccion;
	protected JMenu jmenuDetalleAccionesProduccion;
	protected JMenu jmenuDetalleDatosProduccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProduccion;	
	protected GridBagConstraints gridBagConstraintsProduccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProduccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleProduccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProduccionSessionBean produccionSessionBean;
	
	
	
		
	
	public ProduccionLogic produccionLogic;
	
	public JScrollPane jScrollPanelDatosProduccion;
	public JScrollPane jScrollPanelDatosEdicionProduccion;
	public JScrollPane jScrollPanelDatosGeneralProduccion;
	
	protected JPanel jPanelCamposProduccion;    
	protected JPanel jPanelCamposOcultosProduccion;    	
	protected JPanel jPanelAccionesProduccion;
	protected JPanel jPanelAccionesFormularioProduccion;
    
	
	
	protected Integer iXPanelCamposProduccion=0;
	protected Integer iYPanelCamposProduccion=0;
	
	protected Integer iXPanelCamposOcultosProduccion=0;
	protected Integer iYPanelCamposOcultosProduccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProduccion;
	public JButton jButtonModificarProduccion;
	public JButton jButtonActualizarProduccion;
    public JButton jButtonEliminarProduccion;
	public JButton jButtonCancelarProduccion;
    public JButton jButtonGuardarCambiosProduccion;
	public JButton jButtonGuardarCambiosTablaProduccion;
	protected JButton jButtonCerrarProduccion;
	
	
	protected JButton jButtonProcesarInformacionProduccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProduccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProduccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProduccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProduccion;
	protected JButton jButtonModificarToolBarProduccion;
	protected JButton jButtonActualizarToolBarProduccion;
    protected JButton jButtonEliminarToolBarProduccion;
	protected JButton jButtonCancelarToolBarProduccion;
    protected JButton jButtonGuardarCambiosToolBarProduccion;
	protected JButton jButtonGuardarCambiosTablaToolBarProduccion;
	protected JButton jButtonMostrarOcultarTablaToolBarProduccion;
	protected JButton jButtonCerrarToolBarProduccion;
	
	protected JButton jButtonProcesarInformacionToolBarProduccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProduccion;
	protected JMenuItem jMenuItemModificarProduccion;
	protected JMenuItem jMenuItemActualizarProduccion;
    protected JMenuItem jMenuItemEliminarProduccion;
	protected JMenuItem jMenuItemCancelarProduccion;
    protected JMenuItem jMenuItemGuardarCambiosProduccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProduccion;
	protected JMenuItem jMenuItemCerrarProduccion;
	protected JMenuItem jMenuItemDetalleCerrarProduccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProduccion;
	
	protected JMenuItem jMenuItemProcesarInformacionProduccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProduccion;
	protected JMenuItem jMenuItemMostrarOcultarProduccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProduccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProduccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProduccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProduccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProduccion;
	public JLabel jLabelIdProduccion;
	public JLabel jLabelidProduccion;
	public JButton jButtonidProduccionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProduccion;
	public JLabel jLabelcodigoProduccion;
	public JTextField jTextFieldcodigoProduccion;
	public JButton jButtoncodigoProduccionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProduccion;
	
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
	
	public ProduccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProduccion=new JPanel();
				this.jPanelAccionesFormularioProduccion=new JPanel();
				this.jmenuBarDetalleProduccion=new JMenuBar();
				this.jTtoolBarDetalleProduccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProduccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProduccion() {
		return this.jButtonActualizarToolBarProduccion;
	}
	
	public JButton getjButtonEliminarToolBarProduccion() {
		return this.jButtonEliminarToolBarProduccion;
	}
	
	public JButton getjButtonCancelarToolBarProduccion() {
		return this.jButtonCancelarToolBarProduccion;
	}		
	
	public JButton getjButtonProcesarInformacionProduccion() {
		return this.jButtonProcesarInformacionProduccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProduccion)	{
		this.jButtonProcesarInformacionProduccion = jButtonProcesarInformacionProduccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProduccion() {
		return this.jComboBoxTiposAccionesProduccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProduccion(
			JComboBox jComboBoxTiposRelacionesProduccion) {
		this.jComboBoxTiposRelacionesProduccion = jComboBoxTiposRelacionesProduccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProduccion(
			JComboBox jComboBoxTiposAccionesProduccion) {
		this.jComboBoxTiposAccionesProduccion = jComboBoxTiposAccionesProduccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProduccion() {
		return this.jComboBoxTiposAccionesFormularioProduccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProduccion(
			JComboBox jComboBoxTiposAccionesFormularioProduccion) {
		this.jComboBoxTiposAccionesFormularioProduccion = jComboBoxTiposAccionesFormularioProduccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.produccionSessionBean=new ProduccionSessionBean();
		
		this.produccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.produccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.produccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProduccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProduccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProduccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
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
	
		ProduccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProduccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProduccion=new JButtonMe();
				this.jButtonModificarToolBarProduccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProduccion,this.jTtoolBarDetalleProduccion,
							"actualizar","actualizar","Actualizar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProduccion,this.jTtoolBarDetalleProduccion,
							"eliminar","eliminar","Eliminar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProduccion,this.jTtoolBarDetalleProduccion,
							"cancelar","cancelar","Cancelar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProduccion,this.jTtoolBarDetalleProduccion,
							"guardarcambios","guardarcambios","Guardar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProduccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProduccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProduccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProduccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProduccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProduccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProduccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProduccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProduccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProduccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProduccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProduccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProduccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProduccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProduccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProduccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProduccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProduccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProduccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProduccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProduccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProduccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProduccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProduccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProduccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProduccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProduccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProduccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProduccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProduccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProduccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProduccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProduccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProduccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProduccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProduccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProduccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProduccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProduccion.add(this.jMenuItemDetalleCerrarProduccion);
		
		this.jmenuDetalleAccionesProduccion.add(this.jMenuItemActualizarProduccion);
		this.jmenuDetalleAccionesProduccion.add(this.jMenuItemEliminarProduccion);
		this.jmenuDetalleAccionesProduccion.add(this.jMenuItemCancelarProduccion);		
		
		//this.jmenuDetalleDatosProduccion.add(this.jMenuItemDetalleAbrirOrderByProduccion);				
		this.jmenuDetalleDatosProduccion.add(this.jMenuItemDetalleMostarOcultarProduccion);				
				
		//this.jmenuDetalleAccionesProduccion.add(this.jMenuItemGuardarCambiosProduccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProduccion.add(this.jmenuDetalleArchivoProduccion);		
		this.jmenuBarDetalleProduccion.add(this.jmenuDetalleAccionesProduccion);		
		this.jmenuBarDetalleProduccion.add(this.jmenuDetalleDatosProduccion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProduccion);				
	}
	
	
	public void inicializarElementosCamposProduccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProduccion = new JLabelMe();
		jLabelIdProduccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProduccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProduccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProduccion.setToolTipText(ProduccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProduccion= new GridBagLayout();

		this.jPanelidProduccion.setLayout(this.gridaBagLayoutProduccion);

		jLabelidProduccion = new JLabel();
		jLabelidProduccion.setText("Id");

		jLabelidProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProduccion = new JLabelMe();
		this.jLabelcodigoProduccion.setText(""+ProduccionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProduccion.setToolTipText("Codigo");
		this.jLabelcodigoProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProduccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProduccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProduccion.setToolTipText(ProduccionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProduccion = new GridBagLayout();
		this.jPanelcodigoProduccion.setLayout(this.gridaBagLayoutProduccion);


		jTextFieldcodigoProduccion= new JTextFieldMe();

		jTextFieldcodigoProduccion.setEnabled(false);
		jTextFieldcodigoProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProduccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProduccionBusqueda= new JButtonMe();
		this.jButtoncodigoProduccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProduccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProduccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProduccionBusqueda.setText("U");
		this.jButtoncodigoProduccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProduccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProduccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProduccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProduccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProduccionBusqueda"));

		if(this.produccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProduccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProduccion() {
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
		//this.jInternalFrameDetalleProduccion = new ProduccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProduccion= new GridBagLayout();
		

		
		String sToolTipProduccion="";
		sToolTipProduccion=ProduccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProduccion+="(Produccion.Produccion)";
		}
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProduccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProduccion = new JButtonMe();
		this.jButtonModificarProduccion = new JButtonMe();
        this.jButtonActualizarProduccion = new JButtonMe();
        this.jButtonEliminarProduccion = new JButtonMe();
        this.jButtonCancelarProduccion = new JButtonMe();
        this.jButtonGuardarCambiosProduccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaProduccion = new JButtonMe();
		this.jButtonCerrarProduccion = new JButtonMe();
		
		this.jScrollPanelDatosProduccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionProduccion = new JScrollPane();
		this.jScrollPanelDatosGeneralProduccion = new JScrollPane();
				
		
		
		this.jPanelCamposProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Produccion";
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProduccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProduccion.setName("jPanelCamposProduccion"); 

		this.jPanelCamposOcultosProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProduccion.setName("jPanelCamposOcultosProduccion"); 

        this.jPanelAccionesProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProduccion.setToolTipText("Acciones");
        this.jPanelAccionesProduccion.setName("Acciones"); 

		this.jPanelAccionesFormularioProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProduccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProduccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProduccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProduccion.setText("Nuevo");
		this.jButtonModificarProduccion.setText("Editar");
        this.jButtonActualizarProduccion.setText("Actualizar");
        this.jButtonEliminarProduccion.setText("Eliminar");
        this.jButtonCancelarProduccion.setText("Cancelar");
        this.jButtonGuardarCambiosProduccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaProduccion.setText("Guardar");
		this.jButtonCerrarProduccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProduccion,"nuevo_button","Nuevo",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProduccion,"modificar_button","Editar",this.produccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProduccion,"actualizar_button","Actualizar",this.produccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProduccion,"eliminar_button","Eliminar",this.produccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProduccion,"cancelar_button","Cancelar",this.produccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProduccion,"guardarcambios_button","Guardar",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProduccion,"guardarcambiostabla_button","Guardar",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProduccion,"cerrar_button","Salir",this.produccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProduccion.setToolTipText("Nuevo"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProduccion.setToolTipText("Editar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProduccion.setToolTipText("Actualizar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProduccion.setToolTipText("Eliminar)"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProduccion.setToolTipText("Cancelar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProduccion.setToolTipText("Guardar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProduccion.setToolTipText("Guardar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProduccion.setToolTipText("Salir"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProduccion";
		inputMap = this.jButtonNuevoProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProduccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProduccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProduccion";
		inputMap = this.jButtonActualizarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProduccion"));
		
		//ELIMINAR
		sMapKey = "EliminarProduccion";
		inputMap = this.jButtonEliminarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProduccion"));
		
		//CANCELAR	
		sMapKey = "CancelarProduccion";
		inputMap = this.jButtonCancelarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProduccion"));
		
		//CERRAR		
		sMapKey = "CerrarProduccion";
		inputMap = this.jButtonCerrarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProduccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProduccion";
		inputMap = this.jButtonGuardarCambiosTablaProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProduccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProduccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProduccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProduccion.setToolTipText("Nuevo Produccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProduccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProduccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProduccion.setToolTipText("Sin Cerrar Ventana Produccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProduccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProduccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProduccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProduccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProduccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProduccion.setText("Accion");
		this.jComboBoxTiposAccionesProduccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProduccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProduccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProduccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProduccion = new JLabelMe();
		
		this.jLabelAccionesProduccion.setText("Acciones");		
		this.jLabelAccionesProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProduccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProduccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProduccion=new JTabbedPane();
		this.jTabbedPaneRelacionesProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProduccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProduccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProduccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProduccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProduccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProduccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProduccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProduccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProduccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProduccion = new GridBagLayout();
		
		this.jPanelCamposProduccion.setLayout(gridaBagLayoutCamposProduccion);
		this.jPanelCamposOcultosProduccion.setLayout(gridaBagLayoutCamposOcultosProduccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProduccion = new GridBagConstraints();
	this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProduccion.gridy = 0;
	this.gridBagConstraintsProduccion.gridx = 0;
	this.gridBagConstraintsProduccion.ipadx = 0;
	this.gridBagConstraintsProduccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProduccion.add(jLabelIdProduccion, this.gridBagConstraintsProduccion);



	this.gridBagConstraintsProduccion = new GridBagConstraints();
	this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProduccion.gridy = 0;
	this.gridBagConstraintsProduccion.gridx = 1;
	this.gridBagConstraintsProduccion.ipadx = 0;
	this.gridBagConstraintsProduccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProduccion.add(jLabelidProduccion, this.gridBagConstraintsProduccion);


	this.gridBagConstraintsProduccion = new GridBagConstraints();
	this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProduccion.gridy = 0;
	this.gridBagConstraintsProduccion.gridx = 0;
	this.gridBagConstraintsProduccion.ipadx = 0;
	this.gridBagConstraintsProduccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProduccion.add(jLabelcodigoProduccion, this.gridBagConstraintsProduccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProduccion = new GridBagConstraints();
		//this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = 0;
		this.gridBagConstraintsProduccion.gridx = 2;
		this.gridBagConstraintsProduccion.ipadx = 0;
		this.gridBagConstraintsProduccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProduccion.add(jButtoncodigoProduccionBusqueda, this.gridBagConstraintsProduccion);
	}

	this.gridBagConstraintsProduccion = new GridBagConstraints();
	this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProduccion.gridy = 0;
	this.gridBagConstraintsProduccion.gridx = 1;
	this.gridBagConstraintsProduccion.ipadx = 0;
	this.gridBagConstraintsProduccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProduccion.add(jTextFieldcodigoProduccion, this.gridBagConstraintsProduccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProduccion = new GridBagConstraints();
	this.gridBagConstraintsProduccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProduccion.gridy = iYPanelCamposProduccion;
	this.gridBagConstraintsProduccion.gridx = iXPanelCamposProduccion++;
	this.gridBagConstraintsProduccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProduccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProduccion.add(this.jPanelidProduccion, this.gridBagConstraintsProduccion);



	if(iXPanelCamposProduccion % 1==0) {
		iXPanelCamposProduccion=0;
		iYPanelCamposProduccion++;
	}
	this.gridBagConstraintsProduccion = new GridBagConstraints();
	this.gridBagConstraintsProduccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProduccion.gridy = iYPanelCamposProduccion;
	this.gridBagConstraintsProduccion.gridx = iXPanelCamposProduccion++;
	this.gridBagConstraintsProduccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProduccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProduccion.add(this.jPanelcodigoProduccion, this.gridBagConstraintsProduccion);



	if(iXPanelCamposProduccion % 1==0) {
		iXPanelCamposProduccion=0;
		iYPanelCamposProduccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesProduccion= new GridBagLayout();
		this.jPanelAccionesProduccion.setLayout(gridaBagLayoutAccionesProduccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProduccion= new GridBagLayout();
		this.jPanelAccionesFormularioProduccion.setLayout(gridaBagLayoutAccionesFormularioProduccion);
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProduccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProduccion.add(this.jComboBoxTiposAccionesFormularioProduccion, this.gridBagConstraintsProduccion);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = 0;
		this.gridBagConstraintsProduccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesProduccion.add(this.jButtonModificarProduccion, this.gridBagConstraintsProduccion);							

		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = 0;
		this.gridBagConstraintsProduccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesProduccion.add(this.jButtonEliminarProduccion, this.gridBagConstraintsProduccion);
		
			
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = 0;		
		this.gridBagConstraintsProduccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProduccion.add(this.jButtonActualizarProduccion, this.gridBagConstraintsProduccion);


		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = 0;		
		this.gridBagConstraintsProduccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProduccion.add(this.jButtonGuardarCambiosProduccion, this.gridBagConstraintsProduccion);	
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = 0;		
		this.gridBagConstraintsProduccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesProduccion.add(this.jButtonCancelarProduccion, this.gridBagConstraintsProduccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProduccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProduccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.produccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProduccion = new GridBagConstraints();						
			this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProduccion.gridx = 0;		
			//this.gridBagConstraintsProduccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProduccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProduccion.gridx =0;
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProduccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProduccion, this.gridBagConstraintsProduccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProduccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProduccion = new ProduccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProduccionModel produccionModel=new ProduccionModel(this);
			
			//SI USARA CLASE INTERNA
			//ProduccionModel.ProduccionFocusTraversalPolicy produccionFocusTraversalPolicy = produccionModel.new ProduccionFocusTraversalPolicy(this);
			
			//produccionFocusTraversalPolicy.setproduccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(produccionModel);
			
			
			this.jContentPaneDetalleProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProduccion = new GridBagLayout();	
			this.jContentPaneDetalleProduccion.setLayout(gridaBagLayoutDetalleProduccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProduccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProduccion = new GridBagConstraints();
				this.gridBagConstraintsProduccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProduccion.gridx = 0;
					
				
				this.jContentPaneDetalleProduccion.add(jTtoolBarDetalleProduccion, gridBagConstraintsProduccion);								
				
}
			
			this.jScrollPanelDatosEdicionProduccion=   new JScrollPane(jContentPaneDetalleProduccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProduccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProduccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProduccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProduccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProduccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProduccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProduccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProduccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProduccion.gridx = 0;
	        
			this.jContentPaneDetalleProduccion.add(jPanelCamposProduccion, gridBagConstraintsProduccion);
			
			
			
			
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
						&& produccionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.produccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProduccion= new GridBagConstraints();
						this.gridBagConstraintsProduccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProduccion.gridx = 0;
						this.jContentPaneDetalleProduccion.add(this.jTabbedPaneRelacionesProduccion, this.gridBagConstraintsProduccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProduccion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProduccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProduccion = new GridBagConstraints();
					this.gridBagConstraintsProduccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProduccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProduccion.gridx = 0;
					
				
					this.jContentPaneDetalleProduccion.add(jPanelCamposOcultosProduccion, gridBagConstraintsProduccion);
				
					this.jPanelCamposOcultosProduccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProduccion.gridx = 0;
	        this.gridBagConstraintsProduccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProduccion.add(this.jPanelAccionesFormularioProduccion, this.gridBagConstraintsProduccion);							
			
			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
	        this.gridBagConstraintsProduccion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProduccion.gridx = 0;
	        
			
			this.jContentPaneDetalleProduccion.add(this.jPanelAccionesProduccion, this.gridBagConstraintsProduccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProduccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProduccion=   new JScrollPane(this.jPanelCamposProduccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProduccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProduccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProduccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProduccion.gridx = 0;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProduccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProduccion, this.gridBagConstraintsProduccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProduccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProduccion, this.gridBagConstraintsProduccion);			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProduccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProduccion, this.gridBagConstraintsProduccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProduccion, this.gridBagConstraintsProduccion);
			
			
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProduccion, this.gridBagConstraintsProduccion);
		
			
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProduccion, this.gridBagConstraintsProduccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProduccion;//jContentPane;
		
		return jScrollPanelDatosEdicionProduccion;
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
