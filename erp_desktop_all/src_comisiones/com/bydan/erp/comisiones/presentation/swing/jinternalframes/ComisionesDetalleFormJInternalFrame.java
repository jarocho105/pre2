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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;



import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionesConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionesDetalleFormJInternalFrame extends ComisionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisiones;
	
	protected JMenuBar jmenuBarDetalleComisiones;
	
	protected JMenu jmenuDetalleComisiones;
	protected JMenu jmenuDetalleArchivoComisiones;
	protected JMenu jmenuDetalleAccionesComisiones;
	protected JMenu jmenuDetalleDatosComisiones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisiones;	
	protected GridBagConstraints gridBagConstraintsComisiones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisiones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ComisionesSessionBean comisionesSessionBean;
	
	
	
		
	
	public ComisionesLogic comisionesLogic;
	
	public JScrollPane jScrollPanelDatosComisiones;
	public JScrollPane jScrollPanelDatosEdicionComisiones;
	public JScrollPane jScrollPanelDatosGeneralComisiones;
	
	protected JPanel jPanelCamposComisiones;    
	protected JPanel jPanelCamposOcultosComisiones;    	
	protected JPanel jPanelAccionesComisiones;
	protected JPanel jPanelAccionesFormularioComisiones;
    
	
	
	protected Integer iXPanelCamposComisiones=0;
	protected Integer iYPanelCamposComisiones=0;
	
	protected Integer iXPanelCamposOcultosComisiones=0;
	protected Integer iYPanelCamposOcultosComisiones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisiones;
	public JButton jButtonModificarComisiones;
	public JButton jButtonActualizarComisiones;
    public JButton jButtonEliminarComisiones;
	public JButton jButtonCancelarComisiones;
    public JButton jButtonGuardarCambiosComisiones;
	public JButton jButtonGuardarCambiosTablaComisiones;
	protected JButton jButtonCerrarComisiones;
	
	
	protected JButton jButtonProcesarInformacionComisiones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisiones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisiones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisiones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisiones;
	protected JButton jButtonModificarToolBarComisiones;
	protected JButton jButtonActualizarToolBarComisiones;
    protected JButton jButtonEliminarToolBarComisiones;
	protected JButton jButtonCancelarToolBarComisiones;
    protected JButton jButtonGuardarCambiosToolBarComisiones;
	protected JButton jButtonGuardarCambiosTablaToolBarComisiones;
	protected JButton jButtonMostrarOcultarTablaToolBarComisiones;
	protected JButton jButtonCerrarToolBarComisiones;
	
	protected JButton jButtonProcesarInformacionToolBarComisiones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisiones;
	protected JMenuItem jMenuItemModificarComisiones;
	protected JMenuItem jMenuItemActualizarComisiones;
    protected JMenuItem jMenuItemEliminarComisiones;
	protected JMenuItem jMenuItemCancelarComisiones;
    protected JMenuItem jMenuItemGuardarCambiosComisiones;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisiones;
	protected JMenuItem jMenuItemCerrarComisiones;
	protected JMenuItem jMenuItemDetalleCerrarComisiones;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisiones;
	
	protected JMenuItem jMenuItemProcesarInformacionComisiones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisiones;
	protected JMenuItem jMenuItemMostrarOcultarComisiones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisiones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisiones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisiones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisiones;
	public JLabel jLabelIdComisiones;
	public JLabel jLabelidComisiones;
	public JButton jButtonidComisionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoComisiones;
	public JLabel jLabelcodigoComisiones;
	public JTextField jTextFieldcodigoComisiones;
	public JButton jButtoncodigoComisionesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisiones;
	
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
	
	public ComisionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisiones=new JPanel();
				this.jPanelAccionesFormularioComisiones=new JPanel();
				this.jmenuBarDetalleComisiones=new JMenuBar();
				this.jTtoolBarDetalleComisiones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisiones() {
		return this.jButtonActualizarToolBarComisiones;
	}
	
	public JButton getjButtonEliminarToolBarComisiones() {
		return this.jButtonEliminarToolBarComisiones;
	}
	
	public JButton getjButtonCancelarToolBarComisiones() {
		return this.jButtonCancelarToolBarComisiones;
	}		
	
	public JButton getjButtonProcesarInformacionComisiones() {
		return this.jButtonProcesarInformacionComisiones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisiones)	{
		this.jButtonProcesarInformacionComisiones = jButtonProcesarInformacionComisiones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisiones() {
		return this.jComboBoxTiposAccionesComisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisiones(
			JComboBox jComboBoxTiposRelacionesComisiones) {
		this.jComboBoxTiposRelacionesComisiones = jComboBoxTiposRelacionesComisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisiones(
			JComboBox jComboBoxTiposAccionesComisiones) {
		this.jComboBoxTiposAccionesComisiones = jComboBoxTiposAccionesComisiones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisiones() {
		return this.jComboBoxTiposAccionesFormularioComisiones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisiones(
			JComboBox jComboBoxTiposAccionesFormularioComisiones) {
		this.jComboBoxTiposAccionesFormularioComisiones = jComboBoxTiposAccionesFormularioComisiones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisionesSessionBean=new ComisionesSessionBean();
		
		this.comisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comisiones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisiones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisiones=new JButtonMe();
				this.jButtonModificarToolBarComisiones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisiones,this.jTtoolBarDetalleComisiones,
							"actualizar","actualizar","Actualizar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisiones,this.jTtoolBarDetalleComisiones,
							"eliminar","eliminar","Eliminar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisiones,this.jTtoolBarDetalleComisiones,
							"cancelar","cancelar","Cancelar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisiones,this.jTtoolBarDetalleComisiones,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisiones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisiones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisiones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisiones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisiones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisiones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisiones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisiones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisiones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisiones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisiones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisiones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisiones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisiones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisiones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisiones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisiones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisiones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisiones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisiones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisiones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisiones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisiones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisiones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisiones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisiones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisiones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisiones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisiones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisiones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisiones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisiones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisiones.add(this.jMenuItemDetalleCerrarComisiones);
		
		this.jmenuDetalleAccionesComisiones.add(this.jMenuItemActualizarComisiones);
		this.jmenuDetalleAccionesComisiones.add(this.jMenuItemEliminarComisiones);
		this.jmenuDetalleAccionesComisiones.add(this.jMenuItemCancelarComisiones);		
		
		//this.jmenuDetalleDatosComisiones.add(this.jMenuItemDetalleAbrirOrderByComisiones);				
		this.jmenuDetalleDatosComisiones.add(this.jMenuItemDetalleMostarOcultarComisiones);				
				
		//this.jmenuDetalleAccionesComisiones.add(this.jMenuItemGuardarCambiosComisiones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisiones.add(this.jmenuDetalleArchivoComisiones);		
		this.jmenuBarDetalleComisiones.add(this.jmenuDetalleAccionesComisiones);		
		this.jmenuBarDetalleComisiones.add(this.jmenuDetalleDatosComisiones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisiones);				
	}
	
	
	public void inicializarElementosCamposComisiones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisiones = new JLabelMe();
		jLabelIdComisiones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisiones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisiones.setToolTipText(ComisionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisiones= new GridBagLayout();

		this.jPanelidComisiones.setLayout(this.gridaBagLayoutComisiones);

		jLabelidComisiones = new JLabel();
		jLabelidComisiones.setText("Id");

		jLabelidComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoComisiones = new JLabelMe();
		this.jLabelcodigoComisiones.setText(""+ComisionesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoComisiones.setToolTipText("Codigo");
		this.jLabelcodigoComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoComisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoComisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoComisiones.setToolTipText(ComisionesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutComisiones = new GridBagLayout();
		this.jPanelcodigoComisiones.setLayout(this.gridaBagLayoutComisiones);


		jTextFieldcodigoComisiones= new JTextFieldMe();

		jTextFieldcodigoComisiones.setEnabled(false);
		jTextFieldcodigoComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoComisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoComisionesBusqueda= new JButtonMe();
		this.jButtoncodigoComisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoComisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoComisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoComisionesBusqueda.setText("U");
		this.jButtoncodigoComisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoComisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoComisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoComisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoComisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoComisionesBusqueda"));

		if(this.comisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoComisionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisiones() {
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
		//this.jInternalFrameDetalleComisiones = new ComisionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comisiones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisiones= new GridBagLayout();
		

		
		String sToolTipComisiones="";
		sToolTipComisiones=ComisionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisiones+="(Comisiones.Comisiones)";
		}
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisiones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisiones = new JButtonMe();
		this.jButtonModificarComisiones = new JButtonMe();
        this.jButtonActualizarComisiones = new JButtonMe();
        this.jButtonEliminarComisiones = new JButtonMe();
        this.jButtonCancelarComisiones = new JButtonMe();
        this.jButtonGuardarCambiosComisiones = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisiones = new JButtonMe();
		this.jButtonCerrarComisiones = new JButtonMe();
		
		this.jScrollPanelDatosComisiones = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisiones = new JScrollPane();
		this.jScrollPanelDatosGeneralComisiones = new JScrollPane();
				
		
		
		this.jPanelCamposComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comisiones";
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comisioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosComisiones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisiones.setName("jPanelCamposComisiones"); 

		this.jPanelCamposOcultosComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisiones.setName("jPanelCamposOcultosComisiones"); 

        this.jPanelAccionesComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisiones.setToolTipText("Acciones");
        this.jPanelAccionesComisiones.setName("Acciones"); 

		this.jPanelAccionesFormularioComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisiones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisiones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisiones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisiones.setText("Nuevo");
		this.jButtonModificarComisiones.setText("Editar");
        this.jButtonActualizarComisiones.setText("Actualizar");
        this.jButtonEliminarComisiones.setText("Eliminar");
        this.jButtonCancelarComisiones.setText("Cancelar");
        this.jButtonGuardarCambiosComisiones.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisiones.setText("Guardar");
		this.jButtonCerrarComisiones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisiones,"nuevo_button","Nuevo",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisiones,"modificar_button","Editar",this.comisionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisiones,"actualizar_button","Actualizar",this.comisionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisiones,"eliminar_button","Eliminar",this.comisionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisiones,"cancelar_button","Cancelar",this.comisionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisiones,"guardarcambios_button","Guardar",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisiones,"guardarcambiostabla_button","Guardar",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisiones,"cerrar_button","Salir",this.comisionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisiones.setToolTipText("Nuevo"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisiones.setToolTipText("Editar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisiones.setToolTipText("Actualizar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisiones.setToolTipText("Eliminar)"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisiones.setToolTipText("Cancelar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisiones.setToolTipText("Guardar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisiones.setToolTipText("Guardar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisiones.setToolTipText("Salir"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisiones";
		inputMap = this.jButtonNuevoComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisiones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisiones";
		inputMap = this.jButtonActualizarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisiones"));
		
		//ELIMINAR
		sMapKey = "EliminarComisiones";
		inputMap = this.jButtonEliminarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisiones"));
		
		//CANCELAR	
		sMapKey = "CancelarComisiones";
		inputMap = this.jButtonCancelarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisiones"));
		
		//CERRAR		
		sMapKey = "CerrarComisiones";
		inputMap = this.jButtonCerrarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisiones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisiones";
		inputMap = this.jButtonGuardarCambiosTablaComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisiones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisiones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisiones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisiones.setToolTipText("Nuevo Comisiones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisiones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisiones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisiones.setToolTipText("Sin Cerrar Ventana Comisiones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisiones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisiones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisiones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisiones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisiones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisiones.setText("Accion");
		this.jComboBoxTiposAccionesComisiones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisiones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisiones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisiones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisiones = new JLabelMe();
		
		this.jLabelAccionesComisiones.setText("Acciones");		
		this.jLabelAccionesComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisiones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisiones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisiones=new JTabbedPane();
		this.jTabbedPaneRelacionesComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisiones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisiones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisiones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisiones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisiones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisiones = new GridBagLayout();
		
		this.jPanelCamposComisiones.setLayout(gridaBagLayoutCamposComisiones);
		this.jPanelCamposOcultosComisiones.setLayout(gridaBagLayoutCamposOcultosComisiones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisiones = new GridBagConstraints();
	this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisiones.gridy = 0;
	this.gridBagConstraintsComisiones.gridx = 0;
	this.gridBagConstraintsComisiones.ipadx = 0;
	this.gridBagConstraintsComisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisiones.add(jLabelIdComisiones, this.gridBagConstraintsComisiones);



	this.gridBagConstraintsComisiones = new GridBagConstraints();
	this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisiones.gridy = 0;
	this.gridBagConstraintsComisiones.gridx = 1;
	this.gridBagConstraintsComisiones.ipadx = 0;
	this.gridBagConstraintsComisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisiones.add(jLabelidComisiones, this.gridBagConstraintsComisiones);


	this.gridBagConstraintsComisiones = new GridBagConstraints();
	this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisiones.gridy = 0;
	this.gridBagConstraintsComisiones.gridx = 0;
	this.gridBagConstraintsComisiones.ipadx = 0;
	this.gridBagConstraintsComisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoComisiones.add(jLabelcodigoComisiones, this.gridBagConstraintsComisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisiones = new GridBagConstraints();
		//this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = 0;
		this.gridBagConstraintsComisiones.gridx = 2;
		this.gridBagConstraintsComisiones.ipadx = 0;
		this.gridBagConstraintsComisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoComisiones.add(jButtoncodigoComisionesBusqueda, this.gridBagConstraintsComisiones);
	}

	this.gridBagConstraintsComisiones = new GridBagConstraints();
	this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisiones.gridy = 0;
	this.gridBagConstraintsComisiones.gridx = 1;
	this.gridBagConstraintsComisiones.ipadx = 0;
	this.gridBagConstraintsComisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoComisiones.add(jTextFieldcodigoComisiones, this.gridBagConstraintsComisiones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisiones = new GridBagConstraints();
	this.gridBagConstraintsComisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisiones.gridy = iYPanelCamposComisiones;
	this.gridBagConstraintsComisiones.gridx = iXPanelCamposComisiones++;
	this.gridBagConstraintsComisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisiones.add(this.jPanelidComisiones, this.gridBagConstraintsComisiones);



	if(iXPanelCamposComisiones % 1==0) {
		iXPanelCamposComisiones=0;
		iYPanelCamposComisiones++;
	}
	this.gridBagConstraintsComisiones = new GridBagConstraints();
	this.gridBagConstraintsComisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisiones.gridy = iYPanelCamposComisiones;
	this.gridBagConstraintsComisiones.gridx = iXPanelCamposComisiones++;
	this.gridBagConstraintsComisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisiones.add(this.jPanelcodigoComisiones, this.gridBagConstraintsComisiones);



	if(iXPanelCamposComisiones % 1==0) {
		iXPanelCamposComisiones=0;
		iYPanelCamposComisiones++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisiones= new GridBagLayout();
		this.jPanelAccionesComisiones.setLayout(gridaBagLayoutAccionesComisiones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisiones= new GridBagLayout();
		this.jPanelAccionesFormularioComisiones.setLayout(gridaBagLayoutAccionesFormularioComisiones);
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisiones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisiones.add(this.jComboBoxTiposAccionesFormularioComisiones, this.gridBagConstraintsComisiones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = 0;
		this.gridBagConstraintsComisiones.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisiones.add(this.jButtonModificarComisiones, this.gridBagConstraintsComisiones);							

		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = 0;
		this.gridBagConstraintsComisiones.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisiones.add(this.jButtonEliminarComisiones, this.gridBagConstraintsComisiones);
		
			
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = 0;		
		this.gridBagConstraintsComisiones.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisiones.add(this.jButtonActualizarComisiones, this.gridBagConstraintsComisiones);


		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = 0;		
		this.gridBagConstraintsComisiones.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisiones.add(this.jButtonGuardarCambiosComisiones, this.gridBagConstraintsComisiones);	
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = 0;		
		this.gridBagConstraintsComisiones.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisiones.add(this.jButtonCancelarComisiones, this.gridBagConstraintsComisiones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisiones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisiones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisiones = new GridBagConstraints();						
			this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisiones.gridx = 0;		
			//this.gridBagConstraintsComisiones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisiones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisiones.gridx =0;
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisiones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisiones, this.gridBagConstraintsComisiones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisiones = new ComisionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comisiones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comisiones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comisiones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionesModel comisionesModel=new ComisionesModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionesModel.ComisionesFocusTraversalPolicy comisionesFocusTraversalPolicy = comisionesModel.new ComisionesFocusTraversalPolicy(this);
			
			//comisionesFocusTraversalPolicy.setcomisionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisionesModel);
			
			
			this.jContentPaneDetalleComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisiones = new GridBagLayout();	
			this.jContentPaneDetalleComisiones.setLayout(gridaBagLayoutDetalleComisiones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisiones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisiones = new GridBagConstraints();
				this.gridBagConstraintsComisiones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisiones.gridx = 0;
					
				
				this.jContentPaneDetalleComisiones.add(jTtoolBarDetalleComisiones, gridBagConstraintsComisiones);								
				
}
			
			this.jScrollPanelDatosEdicionComisiones=   new JScrollPane(jContentPaneDetalleComisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisiones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisiones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisiones.gridx = 0;
	        
			this.jContentPaneDetalleComisiones.add(jPanelCamposComisiones, gridBagConstraintsComisiones);
			
			
			
			
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
						&& comisionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisiones= new GridBagConstraints();
						this.gridBagConstraintsComisiones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisiones.gridx = 0;
						this.jContentPaneDetalleComisiones.add(this.jTabbedPaneRelacionesComisiones, this.gridBagConstraintsComisiones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisiones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisiones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisiones = new GridBagConstraints();
					this.gridBagConstraintsComisiones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisiones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisiones.gridx = 0;
					
				
					this.jContentPaneDetalleComisiones.add(jPanelCamposOcultosComisiones, gridBagConstraintsComisiones);
				
					this.jPanelCamposOcultosComisiones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisiones.gridx = 0;
	        this.gridBagConstraintsComisiones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisiones.add(this.jPanelAccionesFormularioComisiones, this.gridBagConstraintsComisiones);							
			
			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
	        this.gridBagConstraintsComisiones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisiones.gridx = 0;
	        
			
			this.jContentPaneDetalleComisiones.add(this.jPanelAccionesComisiones, this.gridBagConstraintsComisiones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisiones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisiones=   new JScrollPane(this.jPanelCamposComisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisiones.gridx = 0;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisiones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisiones, this.gridBagConstraintsComisiones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisiones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisiones, this.gridBagConstraintsComisiones);			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisiones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisiones, this.gridBagConstraintsComisiones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisiones, this.gridBagConstraintsComisiones);
			
			
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisiones, this.gridBagConstraintsComisiones);
		
			
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisiones, this.gridBagConstraintsComisiones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisiones;//jContentPane;
		
		return jScrollPanelDatosEdicionComisiones;
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
