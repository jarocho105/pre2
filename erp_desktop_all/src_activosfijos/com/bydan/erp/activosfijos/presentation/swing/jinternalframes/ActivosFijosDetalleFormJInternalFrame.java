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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;



import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.ActivosFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class ActivosFijosDetalleFormJInternalFrame extends ActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleActivosFijos;
	
	protected JMenuBar jmenuBarDetalleActivosFijos;
	
	protected JMenu jmenuDetalleActivosFijos;
	protected JMenu jmenuDetalleArchivoActivosFijos;
	protected JMenu jmenuDetalleAccionesActivosFijos;
	protected JMenu jmenuDetalleDatosActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActivosFijos;	
	protected GridBagConstraints gridBagConstraintsActivosFijos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ActivosFijosBeanSwingJInternalFrameAdditional jInternalFrameDetalleActivosFijos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ActivosFijosSessionBean activosfijosSessionBean;
	
	
	
		
	
	public ActivosFijosLogic activosfijosLogic;
	
	public JScrollPane jScrollPanelDatosActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralActivosFijos;
	
	protected JPanel jPanelCamposActivosFijos;    
	protected JPanel jPanelCamposOcultosActivosFijos;    	
	protected JPanel jPanelAccionesActivosFijos;
	protected JPanel jPanelAccionesFormularioActivosFijos;
    
	
	
	protected Integer iXPanelCamposActivosFijos=0;
	protected Integer iYPanelCamposActivosFijos=0;
	
	protected Integer iXPanelCamposOcultosActivosFijos=0;
	protected Integer iYPanelCamposOcultosActivosFijos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoActivosFijos;
	public JButton jButtonModificarActivosFijos;
	public JButton jButtonActualizarActivosFijos;
    public JButton jButtonEliminarActivosFijos;
	public JButton jButtonCancelarActivosFijos;
    public JButton jButtonGuardarCambiosActivosFijos;
	public JButton jButtonGuardarCambiosTablaActivosFijos;
	protected JButton jButtonCerrarActivosFijos;
	
	
	protected JButton jButtonProcesarInformacionActivosFijos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeActivosFijos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActivosFijos;
	protected JButton jButtonModificarToolBarActivosFijos;
	protected JButton jButtonActualizarToolBarActivosFijos;
    protected JButton jButtonEliminarToolBarActivosFijos;
	protected JButton jButtonCancelarToolBarActivosFijos;
    protected JButton jButtonGuardarCambiosToolBarActivosFijos;
	protected JButton jButtonGuardarCambiosTablaToolBarActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarActivosFijos;
	protected JButton jButtonCerrarToolBarActivosFijos;
	
	protected JButton jButtonProcesarInformacionToolBarActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActivosFijos;
	protected JMenuItem jMenuItemModificarActivosFijos;
	protected JMenuItem jMenuItemActualizarActivosFijos;
    protected JMenuItem jMenuItemEliminarActivosFijos;
	protected JMenuItem jMenuItemCancelarActivosFijos;
    protected JMenuItem jMenuItemGuardarCambiosActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaActivosFijos;
	protected JMenuItem jMenuItemCerrarActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarActivosFijos;
	
	protected JMenuItem jMenuItemProcesarInformacionActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActivosFijos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActivosFijos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioActivosFijos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidActivosFijos;
	public JLabel jLabelIdActivosFijos;
	public JLabel jLabelidActivosFijos;
	public JButton jButtonidActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoActivosFijos;
	public JLabel jLabelcodigoActivosFijos;
	public JTextField jTextFieldcodigoActivosFijos;
	public JButton jButtoncodigoActivosFijosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesActivosFijos;
	
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
	
	public ActivosFijosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposActivosFijos=new JPanel();
				this.jPanelAccionesFormularioActivosFijos=new JPanel();
				this.jmenuBarDetalleActivosFijos=new JMenuBar();
				this.jTtoolBarDetalleActivosFijos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ActivosFijosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarActivosFijos() {
		return this.jButtonActualizarToolBarActivosFijos;
	}
	
	public JButton getjButtonEliminarToolBarActivosFijos() {
		return this.jButtonEliminarToolBarActivosFijos;
	}
	
	public JButton getjButtonCancelarToolBarActivosFijos() {
		return this.jButtonCancelarToolBarActivosFijos;
	}		
	
	public JButton getjButtonProcesarInformacionActivosFijos() {
		return this.jButtonProcesarInformacionActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActivosFijos)	{
		this.jButtonProcesarInformacionActivosFijos = jButtonProcesarInformacionActivosFijos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActivosFijos() {
		return this.jComboBoxTiposAccionesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActivosFijos(
			JComboBox jComboBoxTiposRelacionesActivosFijos) {
		this.jComboBoxTiposRelacionesActivosFijos = jComboBoxTiposRelacionesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActivosFijos(
			JComboBox jComboBoxTiposAccionesActivosFijos) {
		this.jComboBoxTiposAccionesActivosFijos = jComboBoxTiposAccionesActivosFijos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioActivosFijos() {
		return this.jComboBoxTiposAccionesFormularioActivosFijos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioActivosFijos(
			JComboBox jComboBoxTiposAccionesFormularioActivosFijos) {
		this.jComboBoxTiposAccionesFormularioActivosFijos = jComboBoxTiposAccionesFormularioActivosFijos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.activosfijosSessionBean=new ActivosFijosSessionBean();
		
		this.activosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.activosfijosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
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
	
		ActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleActivosFijos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarActivosFijos=new JButtonMe();
				this.jButtonModificarToolBarActivosFijos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarActivosFijos,this.jTtoolBarDetalleActivosFijos,
							"actualizar","actualizar","Actualizar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarActivosFijos,this.jTtoolBarDetalleActivosFijos,
							"eliminar","eliminar","Eliminar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarActivosFijos,this.jTtoolBarDetalleActivosFijos,
							"cancelar","cancelar","Cancelar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarActivosFijos,this.jTtoolBarDetalleActivosFijos,
							"guardarcambios","guardarcambios","Guardar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleActivosFijos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleActivosFijos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoActivosFijos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesActivosFijos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosActivosFijos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarActivosFijos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarActivosFijos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarActivosFijos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarActivosFijos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarActivosFijos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarActivosFijos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarActivosFijos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarActivosFijos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarActivosFijos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarActivosFijos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarActivosFijos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarActivosFijos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoActivosFijos.add(this.jMenuItemDetalleCerrarActivosFijos);
		
		this.jmenuDetalleAccionesActivosFijos.add(this.jMenuItemActualizarActivosFijos);
		this.jmenuDetalleAccionesActivosFijos.add(this.jMenuItemEliminarActivosFijos);
		this.jmenuDetalleAccionesActivosFijos.add(this.jMenuItemCancelarActivosFijos);		
		
		//this.jmenuDetalleDatosActivosFijos.add(this.jMenuItemDetalleAbrirOrderByActivosFijos);				
		this.jmenuDetalleDatosActivosFijos.add(this.jMenuItemDetalleMostarOcultarActivosFijos);				
				
		//this.jmenuDetalleAccionesActivosFijos.add(this.jMenuItemGuardarCambiosActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleActivosFijos.add(this.jmenuDetalleArchivoActivosFijos);		
		this.jmenuBarDetalleActivosFijos.add(this.jmenuDetalleAccionesActivosFijos);		
		this.jmenuBarDetalleActivosFijos.add(this.jmenuDetalleDatosActivosFijos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleActivosFijos);				
	}
	
	
	public void inicializarElementosCamposActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdActivosFijos = new JLabelMe();
		jLabelIdActivosFijos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidActivosFijos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidActivosFijos.setToolTipText(ActivosFijosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutActivosFijos= new GridBagLayout();

		this.jPanelidActivosFijos.setLayout(this.gridaBagLayoutActivosFijos);

		jLabelidActivosFijos = new JLabel();
		jLabelidActivosFijos.setText("Id");

		jLabelidActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoActivosFijos = new JLabelMe();
		this.jLabelcodigoActivosFijos.setText(""+ActivosFijosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoActivosFijos.setToolTipText("Codigo");
		this.jLabelcodigoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoActivosFijos.setToolTipText(ActivosFijosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutActivosFijos = new GridBagLayout();
		this.jPanelcodigoActivosFijos.setLayout(this.gridaBagLayoutActivosFijos);


		jTextFieldcodigoActivosFijos= new JTextFieldMe();

		jTextFieldcodigoActivosFijos.setEnabled(false);
		jTextFieldcodigoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoActivosFijosBusqueda.setText("U");
		this.jButtoncodigoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoActivosFijosBusqueda"));

		if(this.activosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoActivosFijosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysActivosFijos() {
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
		//this.jInternalFrameDetalleActivosFijos = new ActivosFijosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Activos Fijos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActivosFijos= new GridBagLayout();
		

		
		String sToolTipActivosFijos="";
		sToolTipActivosFijos=ActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActivosFijos+="(ActivosFijos.ActivosFijos)";
		}
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipActivosFijos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoActivosFijos = new JButtonMe();
		this.jButtonModificarActivosFijos = new JButtonMe();
        this.jButtonActualizarActivosFijos = new JButtonMe();
        this.jButtonEliminarActivosFijos = new JButtonMe();
        this.jButtonCancelarActivosFijos = new JButtonMe();
        this.jButtonGuardarCambiosActivosFijos = new JButtonMe();
		this.jButtonGuardarCambiosTablaActivosFijos = new JButtonMe();
		this.jButtonCerrarActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosEdicionActivosFijos = new JScrollPane();
		this.jScrollPanelDatosGeneralActivosFijos = new JScrollPane();
				
		
		
		this.jPanelCamposActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Activos Fijos";
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposActivosFijos.setName("jPanelCamposActivosFijos"); 

		this.jPanelCamposOcultosActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosActivosFijos.setName("jPanelCamposOcultosActivosFijos"); 

        this.jPanelAccionesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesActivosFijos.setName("Acciones"); 

		this.jPanelAccionesFormularioActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioActivosFijos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoActivosFijos.setText("Nuevo");
		this.jButtonModificarActivosFijos.setText("Editar");
        this.jButtonActualizarActivosFijos.setText("Actualizar");
        this.jButtonEliminarActivosFijos.setText("Eliminar");
        this.jButtonCancelarActivosFijos.setText("Cancelar");
        this.jButtonGuardarCambiosActivosFijos.setText("Guardar");
		this.jButtonGuardarCambiosTablaActivosFijos.setText("Guardar");
		this.jButtonCerrarActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActivosFijos,"nuevo_button","Nuevo",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarActivosFijos,"modificar_button","Editar",this.activosfijosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarActivosFijos,"actualizar_button","Actualizar",this.activosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarActivosFijos,"eliminar_button","Eliminar",this.activosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarActivosFijos,"cancelar_button","Cancelar",this.activosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosActivosFijos,"guardarcambios_button","Guardar",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActivosFijos,"guardarcambiostabla_button","Guardar",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActivosFijos,"cerrar_button","Salir",this.activosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoActivosFijos.setToolTipText("Nuevo"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarActivosFijos.setToolTipText("Editar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarActivosFijos.setToolTipText("Actualizar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarActivosFijos.setToolTipText("Eliminar)"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarActivosFijos.setToolTipText("Cancelar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosActivosFijos.setToolTipText("Guardar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaActivosFijos.setToolTipText("Guardar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActivosFijos.setToolTipText("Salir"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActivosFijos";
		inputMap = this.jButtonNuevoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActivosFijos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarActivosFijos";
		inputMap = this.jButtonActualizarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarActivosFijos"));
		
		//ELIMINAR
		sMapKey = "EliminarActivosFijos";
		inputMap = this.jButtonEliminarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarActivosFijos"));
		
		//CANCELAR	
		sMapKey = "CancelarActivosFijos";
		inputMap = this.jButtonCancelarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarActivosFijos"));
		
		//CERRAR		
		sMapKey = "CerrarActivosFijos";
		inputMap = this.jButtonCerrarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActivosFijos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoActivosFijos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoActivosFijos.setToolTipText("Nuevo ActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarActivosFijos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarActivosFijos.setToolTipText("Sin Cerrar Ventana ActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeActivosFijos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeActivosFijos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesActivosFijos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioActivosFijos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioActivosFijos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesActivosFijos = new JLabelMe();
		
		this.jLabelAccionesActivosFijos.setText("Acciones");		
		this.jLabelAccionesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposActivosFijos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysActivosFijos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesActivosFijos=new JTabbedPane();
		this.jTabbedPaneRelacionesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActivosFijos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposActivosFijos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosActivosFijos = new GridBagLayout();
		
		this.jPanelCamposActivosFijos.setLayout(gridaBagLayoutCamposActivosFijos);
		this.jPanelCamposOcultosActivosFijos.setLayout(gridaBagLayoutCamposOcultosActivosFijos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijos.gridy = 0;
	this.gridBagConstraintsActivosFijos.gridx = 0;
	this.gridBagConstraintsActivosFijos.ipadx = 0;
	this.gridBagConstraintsActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidActivosFijos.add(jLabelIdActivosFijos, this.gridBagConstraintsActivosFijos);



	this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijos.gridy = 0;
	this.gridBagConstraintsActivosFijos.gridx = 1;
	this.gridBagConstraintsActivosFijos.ipadx = 0;
	this.gridBagConstraintsActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidActivosFijos.add(jLabelidActivosFijos, this.gridBagConstraintsActivosFijos);


	this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijos.gridy = 0;
	this.gridBagConstraintsActivosFijos.gridx = 0;
	this.gridBagConstraintsActivosFijos.ipadx = 0;
	this.gridBagConstraintsActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoActivosFijos.add(jLabelcodigoActivosFijos, this.gridBagConstraintsActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = 0;
		this.gridBagConstraintsActivosFijos.gridx = 2;
		this.gridBagConstraintsActivosFijos.ipadx = 0;
		this.gridBagConstraintsActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoActivosFijos.add(jButtoncodigoActivosFijosBusqueda, this.gridBagConstraintsActivosFijos);
	}

	this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijos.gridy = 0;
	this.gridBagConstraintsActivosFijos.gridx = 1;
	this.gridBagConstraintsActivosFijos.ipadx = 0;
	this.gridBagConstraintsActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoActivosFijos.add(jTextFieldcodigoActivosFijos, this.gridBagConstraintsActivosFijos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijos.gridy = iYPanelCamposActivosFijos;
	this.gridBagConstraintsActivosFijos.gridx = iXPanelCamposActivosFijos++;
	this.gridBagConstraintsActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijos.add(this.jPanelidActivosFijos, this.gridBagConstraintsActivosFijos);



	if(iXPanelCamposActivosFijos % 1==0) {
		iXPanelCamposActivosFijos=0;
		iYPanelCamposActivosFijos++;
	}
	this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijos.gridy = iYPanelCamposActivosFijos;
	this.gridBagConstraintsActivosFijos.gridx = iXPanelCamposActivosFijos++;
	this.gridBagConstraintsActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijos.add(this.jPanelcodigoActivosFijos, this.gridBagConstraintsActivosFijos);



	if(iXPanelCamposActivosFijos % 1==0) {
		iXPanelCamposActivosFijos=0;
		iYPanelCamposActivosFijos++;
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
			
		GridBagLayout gridaBagLayoutAccionesActivosFijos= new GridBagLayout();
		this.jPanelAccionesActivosFijos.setLayout(gridaBagLayoutAccionesActivosFijos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioActivosFijos= new GridBagLayout();
		this.jPanelAccionesFormularioActivosFijos.setLayout(gridaBagLayoutAccionesFormularioActivosFijos);
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsActivosFijos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioActivosFijos.add(this.jComboBoxTiposAccionesFormularioActivosFijos, this.gridBagConstraintsActivosFijos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = 0;
		this.gridBagConstraintsActivosFijos.gridx = iPosXAccion++;
			
		this.jPanelAccionesActivosFijos.add(this.jButtonModificarActivosFijos, this.gridBagConstraintsActivosFijos);							

		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = 0;
		this.gridBagConstraintsActivosFijos.gridx =iPosXAccion++;
			
		this.jPanelAccionesActivosFijos.add(this.jButtonEliminarActivosFijos, this.gridBagConstraintsActivosFijos);
		
			
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = 0;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesActivosFijos.add(this.jButtonActualizarActivosFijos, this.gridBagConstraintsActivosFijos);


		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = 0;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesActivosFijos.add(this.jButtonGuardarCambiosActivosFijos, this.gridBagConstraintsActivosFijos);	
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = 0;		
		this.gridBagConstraintsActivosFijos.gridx =iPosXAccion++;
		
		this.jPanelAccionesActivosFijos.add(this.jButtonCancelarActivosFijos, this.gridBagConstraintsActivosFijos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActivosFijos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijos.gridx = 0;		
			//this.gridBagConstraintsActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActivosFijos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActivosFijos.gridx =0;
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActivosFijos, this.gridBagConstraintsActivosFijos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleActivosFijos = new ActivosFijosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Activos Fijos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Activos Fijos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Activos Fijos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ActivosFijosModel activosfijosModel=new ActivosFijosModel(this);
			
			//SI USARA CLASE INTERNA
			//ActivosFijosModel.ActivosFijosFocusTraversalPolicy activosfijosFocusTraversalPolicy = activosfijosModel.new ActivosFijosFocusTraversalPolicy(this);
			
			//activosfijosFocusTraversalPolicy.setactivosfijosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(activosfijosModel);
			
			
			this.jContentPaneDetalleActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleActivosFijos = new GridBagLayout();	
			this.jContentPaneDetalleActivosFijos.setLayout(gridaBagLayoutDetalleActivosFijos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActivosFijos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsActivosFijos.gridx = 0;
					
				
				this.jContentPaneDetalleActivosFijos.add(jTtoolBarDetalleActivosFijos, gridBagConstraintsActivosFijos);								
				
}
			
			this.jScrollPanelDatosEdicionActivosFijos=   new JScrollPane(jContentPaneDetalleActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsActivosFijos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsActivosFijos.gridx = 0;
	        
			this.jContentPaneDetalleActivosFijos.add(jPanelCamposActivosFijos, gridBagConstraintsActivosFijos);
			
			
			
			
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
						&& activosfijosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsActivosFijos= new GridBagConstraints();
						this.gridBagConstraintsActivosFijos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsActivosFijos.gridx = 0;
						this.jContentPaneDetalleActivosFijos.add(this.jTabbedPaneRelacionesActivosFijos, this.gridBagConstraintsActivosFijos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesActivosFijos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosActivosFijos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsActivosFijos = new GridBagConstraints();
					this.gridBagConstraintsActivosFijos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsActivosFijos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsActivosFijos.gridx = 0;
					
				
					this.jContentPaneDetalleActivosFijos.add(jPanelCamposOcultosActivosFijos, gridBagConstraintsActivosFijos);
				
					this.jPanelCamposOcultosActivosFijos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsActivosFijos.gridx = 0;
	        this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleActivosFijos.add(this.jPanelAccionesFormularioActivosFijos, this.gridBagConstraintsActivosFijos);							
			
			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
	        this.gridBagConstraintsActivosFijos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsActivosFijos.gridx = 0;
	        
			
			this.jContentPaneDetalleActivosFijos.add(this.jPanelAccionesActivosFijos, this.gridBagConstraintsActivosFijos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionActivosFijos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionActivosFijos=   new JScrollPane(this.jPanelCamposActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijos.gridx = 0;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsActivosFijos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionActivosFijos, this.gridBagConstraintsActivosFijos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioActivosFijos, this.gridBagConstraintsActivosFijos);			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesActivosFijos, this.gridBagConstraintsActivosFijos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActivosFijos, this.gridBagConstraintsActivosFijos);
			
			
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActivosFijos, this.gridBagConstraintsActivosFijos);
		
			
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActivosFijos, this.gridBagConstraintsActivosFijos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralActivosFijos;//jContentPane;
		
		return jScrollPanelDatosEdicionActivosFijos;
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
