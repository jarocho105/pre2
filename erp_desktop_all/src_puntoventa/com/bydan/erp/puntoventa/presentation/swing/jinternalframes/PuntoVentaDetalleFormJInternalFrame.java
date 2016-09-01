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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.PuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class PuntoVentaDetalleFormJInternalFrame extends PuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePuntoVenta;
	
	protected JMenuBar jmenuBarDetallePuntoVenta;
	
	protected JMenu jmenuDetallePuntoVenta;
	protected JMenu jmenuDetalleArchivoPuntoVenta;
	protected JMenu jmenuDetalleAccionesPuntoVenta;
	protected JMenu jmenuDetalleDatosPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetallePuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public PuntoVentaSessionBean puntoventaSessionBean;
	
	
	
		
	
	public PuntoVentaLogic puntoventaLogic;
	
	public JScrollPane jScrollPanelDatosPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralPuntoVenta;
	
	protected JPanel jPanelCamposPuntoVenta;    
	protected JPanel jPanelCamposOcultosPuntoVenta;    	
	protected JPanel jPanelAccionesPuntoVenta;
	protected JPanel jPanelAccionesFormularioPuntoVenta;
    
	
	
	protected Integer iXPanelCamposPuntoVenta=0;
	protected Integer iYPanelCamposPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosPuntoVenta=0;
	protected Integer iYPanelCamposOcultosPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPuntoVenta;
	public JButton jButtonModificarPuntoVenta;
	public JButton jButtonActualizarPuntoVenta;
    public JButton jButtonEliminarPuntoVenta;
	public JButton jButtonCancelarPuntoVenta;
    public JButton jButtonGuardarCambiosPuntoVenta;
	public JButton jButtonGuardarCambiosTablaPuntoVenta;
	protected JButton jButtonCerrarPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajePuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPuntoVenta;
	protected JButton jButtonModificarToolBarPuntoVenta;
	protected JButton jButtonActualizarToolBarPuntoVenta;
    protected JButton jButtonEliminarToolBarPuntoVenta;
	protected JButton jButtonCancelarToolBarPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarPuntoVenta;
	protected JButton jButtonCerrarToolBarPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPuntoVenta;
	protected JMenuItem jMenuItemModificarPuntoVenta;
	protected JMenuItem jMenuItemActualizarPuntoVenta;
    protected JMenuItem jMenuItemEliminarPuntoVenta;
	protected JMenuItem jMenuItemCancelarPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaPuntoVenta;
	protected JMenuItem jMenuItemCerrarPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPuntoVenta;
	public JLabel jLabelIdPuntoVenta;
	public JLabel jLabelidPuntoVenta;
	public JButton jButtonidPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPuntoVenta;
	public JLabel jLabelcodigoPuntoVenta;
	public JTextField jTextFieldcodigoPuntoVenta;
	public JButton jButtoncodigoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPuntoVenta;
	
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
	
	public PuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioPuntoVenta=new JPanel();
				this.jmenuBarDetallePuntoVenta=new JMenuBar();
				this.jTtoolBarDetallePuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPuntoVenta() {
		return this.jButtonActualizarToolBarPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarPuntoVenta() {
		return this.jButtonEliminarToolBarPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarPuntoVenta() {
		return this.jButtonCancelarToolBarPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionPuntoVenta() {
		return this.jButtonProcesarInformacionPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPuntoVenta)	{
		this.jButtonProcesarInformacionPuntoVenta = jButtonProcesarInformacionPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPuntoVenta() {
		return this.jComboBoxTiposAccionesPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPuntoVenta(
			JComboBox jComboBoxTiposRelacionesPuntoVenta) {
		this.jComboBoxTiposRelacionesPuntoVenta = jComboBoxTiposRelacionesPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPuntoVenta(
			JComboBox jComboBoxTiposAccionesPuntoVenta) {
		this.jComboBoxTiposAccionesPuntoVenta = jComboBoxTiposAccionesPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioPuntoVenta = jComboBoxTiposAccionesFormularioPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.puntoventaSessionBean=new PuntoVentaSessionBean();
		
		this.puntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.puntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		PuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPuntoVenta,this.jTtoolBarDetallePuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPuntoVenta,this.jTtoolBarDetallePuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPuntoVenta,this.jTtoolBarDetallePuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPuntoVenta,this.jTtoolBarDetallePuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPuntoVenta.add(this.jMenuItemDetalleCerrarPuntoVenta);
		
		this.jmenuDetalleAccionesPuntoVenta.add(this.jMenuItemActualizarPuntoVenta);
		this.jmenuDetalleAccionesPuntoVenta.add(this.jMenuItemEliminarPuntoVenta);
		this.jmenuDetalleAccionesPuntoVenta.add(this.jMenuItemCancelarPuntoVenta);		
		
		//this.jmenuDetalleDatosPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByPuntoVenta);				
		this.jmenuDetalleDatosPuntoVenta.add(this.jMenuItemDetalleMostarOcultarPuntoVenta);				
				
		//this.jmenuDetalleAccionesPuntoVenta.add(this.jMenuItemGuardarCambiosPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePuntoVenta.add(this.jmenuDetalleArchivoPuntoVenta);		
		this.jmenuBarDetallePuntoVenta.add(this.jmenuDetalleAccionesPuntoVenta);		
		this.jmenuBarDetallePuntoVenta.add(this.jmenuDetalleDatosPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePuntoVenta);				
	}
	
	
	public void inicializarElementosCamposPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPuntoVenta = new JLabelMe();
		jLabelIdPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPuntoVenta.setToolTipText(PuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPuntoVenta= new GridBagLayout();

		this.jPanelidPuntoVenta.setLayout(this.gridaBagLayoutPuntoVenta);

		jLabelidPuntoVenta = new JLabel();
		jLabelidPuntoVenta.setText("Id");

		jLabelidPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPuntoVenta = new JLabelMe();
		this.jLabelcodigoPuntoVenta.setText(""+PuntoVentaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPuntoVenta.setToolTipText("Codigo");
		this.jLabelcodigoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPuntoVenta.setToolTipText(PuntoVentaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPuntoVenta = new GridBagLayout();
		this.jPanelcodigoPuntoVenta.setLayout(this.gridaBagLayoutPuntoVenta);


		jTextFieldcodigoPuntoVenta= new JTextFieldMe();

		jTextFieldcodigoPuntoVenta.setEnabled(false);
		jTextFieldcodigoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncodigoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPuntoVentaBusqueda.setText("U");
		this.jButtoncodigoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPuntoVentaBusqueda"));

		if(this.puntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPuntoVenta() {
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
		//this.jInternalFrameDetallePuntoVenta = new PuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPuntoVenta= new GridBagLayout();
		

		
		String sToolTipPuntoVenta="";
		sToolTipPuntoVenta=PuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPuntoVenta+="(PuntoVenta.PuntoVenta)";
		}
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPuntoVenta = new JButtonMe();
		this.jButtonModificarPuntoVenta = new JButtonMe();
        this.jButtonActualizarPuntoVenta = new JButtonMe();
        this.jButtonEliminarPuntoVenta = new JButtonMe();
        this.jButtonCancelarPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaPuntoVenta = new JButtonMe();
		this.jButtonCerrarPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Punto Venta";
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPuntoVenta.setName("jPanelCamposPuntoVenta"); 

		this.jPanelCamposOcultosPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPuntoVenta.setName("jPanelCamposOcultosPuntoVenta"); 

        this.jPanelAccionesPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPuntoVenta.setText("Nuevo");
		this.jButtonModificarPuntoVenta.setText("Editar");
        this.jButtonActualizarPuntoVenta.setText("Actualizar");
        this.jButtonEliminarPuntoVenta.setText("Eliminar");
        this.jButtonCancelarPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaPuntoVenta.setText("Guardar");
		this.jButtonCerrarPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPuntoVenta,"nuevo_button","Nuevo",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPuntoVenta,"modificar_button","Editar",this.puntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPuntoVenta,"actualizar_button","Actualizar",this.puntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPuntoVenta,"eliminar_button","Eliminar",this.puntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPuntoVenta,"cancelar_button","Cancelar",this.puntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPuntoVenta,"guardarcambios_button","Guardar",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPuntoVenta,"guardarcambiostabla_button","Guardar",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPuntoVenta,"cerrar_button","Salir",this.puntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPuntoVenta.setToolTipText("Nuevo"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPuntoVenta.setToolTipText("Editar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPuntoVenta.setToolTipText("Actualizar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPuntoVenta.setToolTipText("Eliminar)"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPuntoVenta.setToolTipText("Cancelar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPuntoVenta.setToolTipText("Guardar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPuntoVenta.setToolTipText("Guardar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPuntoVenta.setToolTipText("Salir"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPuntoVenta";
		inputMap = this.jButtonNuevoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPuntoVenta";
		inputMap = this.jButtonActualizarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarPuntoVenta";
		inputMap = this.jButtonEliminarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarPuntoVenta";
		inputMap = this.jButtonCancelarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarPuntoVenta";
		inputMap = this.jButtonCerrarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPuntoVenta.setToolTipText("Nuevo PuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPuntoVenta.setToolTipText("Sin Cerrar Ventana PuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesPuntoVenta.setText("Acciones");		
		this.jLabelAccionesPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposPuntoVenta.setLayout(gridaBagLayoutCamposPuntoVenta);
		this.jPanelCamposOcultosPuntoVenta.setLayout(gridaBagLayoutCamposOcultosPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntoVenta.gridy = 0;
	this.gridBagConstraintsPuntoVenta.gridx = 0;
	this.gridBagConstraintsPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPuntoVenta.add(jLabelIdPuntoVenta, this.gridBagConstraintsPuntoVenta);



	this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntoVenta.gridy = 0;
	this.gridBagConstraintsPuntoVenta.gridx = 1;
	this.gridBagConstraintsPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPuntoVenta.add(jLabelidPuntoVenta, this.gridBagConstraintsPuntoVenta);


	this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntoVenta.gridy = 0;
	this.gridBagConstraintsPuntoVenta.gridx = 0;
	this.gridBagConstraintsPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPuntoVenta.add(jLabelcodigoPuntoVenta, this.gridBagConstraintsPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = 0;
		this.gridBagConstraintsPuntoVenta.gridx = 2;
		this.gridBagConstraintsPuntoVenta.ipadx = 0;
		this.gridBagConstraintsPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPuntoVenta.add(jButtoncodigoPuntoVentaBusqueda, this.gridBagConstraintsPuntoVenta);
	}

	this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntoVenta.gridy = 0;
	this.gridBagConstraintsPuntoVenta.gridx = 1;
	this.gridBagConstraintsPuntoVenta.ipadx = 0;
	this.gridBagConstraintsPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPuntoVenta.add(jTextFieldcodigoPuntoVenta, this.gridBagConstraintsPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuntoVenta.gridy = iYPanelCamposPuntoVenta;
	this.gridBagConstraintsPuntoVenta.gridx = iXPanelCamposPuntoVenta++;
	this.gridBagConstraintsPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuntoVenta.add(this.jPanelidPuntoVenta, this.gridBagConstraintsPuntoVenta);



	if(iXPanelCamposPuntoVenta % 1==0) {
		iXPanelCamposPuntoVenta=0;
		iYPanelCamposPuntoVenta++;
	}
	this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuntoVenta.gridy = iYPanelCamposPuntoVenta;
	this.gridBagConstraintsPuntoVenta.gridx = iXPanelCamposPuntoVenta++;
	this.gridBagConstraintsPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuntoVenta.add(this.jPanelcodigoPuntoVenta, this.gridBagConstraintsPuntoVenta);



	if(iXPanelCamposPuntoVenta % 1==0) {
		iXPanelCamposPuntoVenta=0;
		iYPanelCamposPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesPuntoVenta= new GridBagLayout();
		this.jPanelAccionesPuntoVenta.setLayout(gridaBagLayoutAccionesPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioPuntoVenta);
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPuntoVenta.add(this.jComboBoxTiposAccionesFormularioPuntoVenta, this.gridBagConstraintsPuntoVenta);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = 0;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesPuntoVenta.add(this.jButtonModificarPuntoVenta, this.gridBagConstraintsPuntoVenta);							

		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = 0;
		this.gridBagConstraintsPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesPuntoVenta.add(this.jButtonEliminarPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
			
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = 0;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesPuntoVenta.add(this.jButtonActualizarPuntoVenta, this.gridBagConstraintsPuntoVenta);


		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = 0;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesPuntoVenta.add(this.jButtonGuardarCambiosPuntoVenta, this.gridBagConstraintsPuntoVenta);	
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = 0;		
		this.gridBagConstraintsPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesPuntoVenta.add(this.jButtonCancelarPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPuntoVenta.gridx =0;
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPuntoVenta, this.gridBagConstraintsPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePuntoVenta = new PuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PuntoVentaModel puntoventaModel=new PuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//PuntoVentaModel.PuntoVentaFocusTraversalPolicy puntoventaFocusTraversalPolicy = puntoventaModel.new PuntoVentaFocusTraversalPolicy(this);
			
			//puntoventaFocusTraversalPolicy.setpuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(puntoventaModel);
			
			
			this.jContentPaneDetallePuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePuntoVenta = new GridBagLayout();	
			this.jContentPaneDetallePuntoVenta.setLayout(gridaBagLayoutDetallePuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetallePuntoVenta.add(jTtoolBarDetallePuntoVenta, gridBagConstraintsPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionPuntoVenta=   new JScrollPane(jContentPaneDetallePuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetallePuntoVenta.add(jPanelCamposPuntoVenta, gridBagConstraintsPuntoVenta);
			
			
			
			
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
						&& puntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPuntoVenta.gridx = 0;
						this.jContentPaneDetallePuntoVenta.add(this.jTabbedPaneRelacionesPuntoVenta, this.gridBagConstraintsPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetallePuntoVenta.add(jPanelCamposOcultosPuntoVenta, gridBagConstraintsPuntoVenta);
				
					this.jPanelCamposOcultosPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPuntoVenta.gridx = 0;
	        this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePuntoVenta.add(this.jPanelAccionesFormularioPuntoVenta, this.gridBagConstraintsPuntoVenta);							
			
			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetallePuntoVenta.add(this.jPanelAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPuntoVenta=   new JScrollPane(this.jPanelCamposPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPuntoVenta.gridx = 0;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPuntoVenta, this.gridBagConstraintsPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPuntoVenta, this.gridBagConstraintsPuntoVenta);			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPuntoVenta, this.gridBagConstraintsPuntoVenta);
			
			
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
			
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionPuntoVenta;
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
