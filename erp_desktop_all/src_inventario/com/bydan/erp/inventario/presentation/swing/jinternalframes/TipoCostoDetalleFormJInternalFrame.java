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
import com.bydan.erp.inventario.util.TipoCostoConstantesFunciones;

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
public class TipoCostoDetalleFormJInternalFrame extends TipoCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCosto;
	
	protected JMenuBar jmenuBarDetalleTipoCosto;
	
	protected JMenu jmenuDetalleTipoCosto;
	protected JMenu jmenuDetalleArchivoTipoCosto;
	protected JMenu jmenuDetalleAccionesTipoCosto;
	protected JMenu jmenuDetalleDatosTipoCosto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCosto;	
	protected GridBagConstraints gridBagConstraintsTipoCosto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCostoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCosto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCostoSessionBean tipocostoSessionBean;
	
	
	
		
	
	public TipoCostoLogic tipocostoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCosto;
	public JScrollPane jScrollPanelDatosEdicionTipoCosto;
	public JScrollPane jScrollPanelDatosGeneralTipoCosto;
	
	protected JPanel jPanelCamposTipoCosto;    
	protected JPanel jPanelCamposOcultosTipoCosto;    	
	protected JPanel jPanelAccionesTipoCosto;
	protected JPanel jPanelAccionesFormularioTipoCosto;
    
	
	
	protected Integer iXPanelCamposTipoCosto=0;
	protected Integer iYPanelCamposTipoCosto=0;
	
	protected Integer iXPanelCamposOcultosTipoCosto=0;
	protected Integer iYPanelCamposOcultosTipoCosto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCosto;
	public JButton jButtonModificarTipoCosto;
	public JButton jButtonActualizarTipoCosto;
    public JButton jButtonEliminarTipoCosto;
	public JButton jButtonCancelarTipoCosto;
    public JButton jButtonGuardarCambiosTipoCosto;
	public JButton jButtonGuardarCambiosTablaTipoCosto;
	protected JButton jButtonCerrarTipoCosto;
	
	
	protected JButton jButtonProcesarInformacionTipoCosto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCosto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCosto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCosto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCosto;
	protected JButton jButtonModificarToolBarTipoCosto;
	protected JButton jButtonActualizarToolBarTipoCosto;
    protected JButton jButtonEliminarToolBarTipoCosto;
	protected JButton jButtonCancelarToolBarTipoCosto;
    protected JButton jButtonGuardarCambiosToolBarTipoCosto;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCosto;
	protected JButton jButtonCerrarToolBarTipoCosto;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCosto;
	protected JMenuItem jMenuItemModificarTipoCosto;
	protected JMenuItem jMenuItemActualizarTipoCosto;
    protected JMenuItem jMenuItemEliminarTipoCosto;
	protected JMenuItem jMenuItemCancelarTipoCosto;
    protected JMenuItem jMenuItemGuardarCambiosTipoCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCosto;
	protected JMenuItem jMenuItemCerrarTipoCosto;
	protected JMenuItem jMenuItemDetalleCerrarTipoCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCosto;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCosto;
	protected JMenuItem jMenuItemMostrarOcultarTipoCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCosto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCosto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCosto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCosto;
	public JLabel jLabelIdTipoCosto;
	public JTextFieldMe jTextFieldidTipoCosto;
	public JButton jButtonidTipoCostoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCosto;
	public JLabel jLabelcodigoTipoCosto;
	public JTextField jTextFieldcodigoTipoCosto;
	public JButton jButtoncodigoTipoCostoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCosto;
	public JLabel jLabelnombreTipoCosto;
	public JTextField jTextFieldnombreTipoCosto;
	public JButton jButtonnombreTipoCostoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCosto;
	
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
	
	public TipoCostoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCosto=new JPanel();
				this.jPanelAccionesFormularioTipoCosto=new JPanel();
				this.jmenuBarDetalleTipoCosto=new JMenuBar();
				this.jTtoolBarDetalleTipoCosto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCostoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCosto() {
		return this.jButtonActualizarToolBarTipoCosto;
	}
	
	public JButton getjButtonEliminarToolBarTipoCosto() {
		return this.jButtonEliminarToolBarTipoCosto;
	}
	
	public JButton getjButtonCancelarToolBarTipoCosto() {
		return this.jButtonCancelarToolBarTipoCosto;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCosto() {
		return this.jButtonProcesarInformacionTipoCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCosto)	{
		this.jButtonProcesarInformacionTipoCosto = jButtonProcesarInformacionTipoCosto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCosto() {
		return this.jComboBoxTiposAccionesTipoCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCosto(
			JComboBox jComboBoxTiposRelacionesTipoCosto) {
		this.jComboBoxTiposRelacionesTipoCosto = jComboBoxTiposRelacionesTipoCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCosto(
			JComboBox jComboBoxTiposAccionesTipoCosto) {
		this.jComboBoxTiposAccionesTipoCosto = jComboBoxTiposAccionesTipoCosto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCosto() {
		return this.jComboBoxTiposAccionesFormularioTipoCosto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCosto(
			JComboBox jComboBoxTiposAccionesFormularioTipoCosto) {
		this.jComboBoxTiposAccionesFormularioTipoCosto = jComboBoxTiposAccionesFormularioTipoCosto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocostoSessionBean=new TipoCostoSessionBean();
		
		this.tipocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocostoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCosto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCosto=new JButtonMe();
				this.jButtonModificarToolBarTipoCosto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCosto,this.jTtoolBarDetalleTipoCosto,
							"actualizar","actualizar","Actualizar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCosto,this.jTtoolBarDetalleTipoCosto,
							"eliminar","eliminar","Eliminar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCosto,this.jTtoolBarDetalleTipoCosto,
							"cancelar","cancelar","Cancelar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCosto,this.jTtoolBarDetalleTipoCosto,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCosto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCosto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCosto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCosto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCosto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCosto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCosto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCosto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCosto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCosto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCosto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCosto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCosto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCosto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCosto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCosto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCosto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCosto.add(this.jMenuItemDetalleCerrarTipoCosto);
		
		this.jmenuDetalleAccionesTipoCosto.add(this.jMenuItemActualizarTipoCosto);
		this.jmenuDetalleAccionesTipoCosto.add(this.jMenuItemEliminarTipoCosto);
		this.jmenuDetalleAccionesTipoCosto.add(this.jMenuItemCancelarTipoCosto);		
		
		//this.jmenuDetalleDatosTipoCosto.add(this.jMenuItemDetalleAbrirOrderByTipoCosto);				
		this.jmenuDetalleDatosTipoCosto.add(this.jMenuItemDetalleMostarOcultarTipoCosto);				
				
		//this.jmenuDetalleAccionesTipoCosto.add(this.jMenuItemGuardarCambiosTipoCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCosto.add(this.jmenuDetalleArchivoTipoCosto);		
		this.jmenuBarDetalleTipoCosto.add(this.jmenuDetalleAccionesTipoCosto);		
		this.jmenuBarDetalleTipoCosto.add(this.jmenuDetalleDatosTipoCosto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCosto);				
	}
	
	
	public void inicializarElementosCamposTipoCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCosto = new JLabelMe();
		jLabelIdTipoCosto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCosto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCosto.setToolTipText(TipoCostoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCosto= new GridBagLayout();

		this.jPanelidTipoCosto.setLayout(this.gridaBagLayoutTipoCosto);

		jTextFieldidTipoCosto = new JTextFieldMe();
		jTextFieldidTipoCosto.setText("Id");

		jTextFieldidTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCosto = new JLabelMe();
		this.jLabelcodigoTipoCosto.setText(""+TipoCostoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCosto.setToolTipText("Codigo");
		this.jLabelcodigoTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCosto.setToolTipText(TipoCostoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCosto = new GridBagLayout();
		this.jPanelcodigoTipoCosto.setLayout(this.gridaBagLayoutTipoCosto);


		jTextFieldcodigoTipoCosto= new JTextFieldMe();

		jTextFieldcodigoTipoCosto.setEnabled(false);
		jTextFieldcodigoTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCostoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCostoBusqueda.setText("U");
		this.jButtoncodigoTipoCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCostoBusqueda"));

		if(this.tipocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCostoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCosto = new JLabelMe();
		this.jLabelnombreTipoCosto.setText(""+TipoCostoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCosto.setToolTipText("Nombre");
		this.jLabelnombreTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCosto.setToolTipText(TipoCostoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCosto = new GridBagLayout();
		this.jPanelnombreTipoCosto.setLayout(this.gridaBagLayoutTipoCosto);


		jTextFieldnombreTipoCosto= new JTextFieldMe();

		jTextFieldnombreTipoCosto.setEnabled(false);
		jTextFieldnombreTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoCostoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCostoBusqueda.setText("U");
		this.jButtonnombreTipoCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCostoBusqueda"));

		if(this.tipocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCostoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCosto() {
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
		//this.jInternalFrameDetalleTipoCosto = new TipoCostoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCosto= new GridBagLayout();
		

		
		String sToolTipTipoCosto="";
		sToolTipTipoCosto=TipoCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCosto+="(Inventario.TipoCosto)";
		}
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCosto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCosto = new JButtonMe();
		this.jButtonModificarTipoCosto = new JButtonMe();
        this.jButtonActualizarTipoCosto = new JButtonMe();
        this.jButtonEliminarTipoCosto = new JButtonMe();
        this.jButtonCancelarTipoCosto = new JButtonMe();
        this.jButtonGuardarCambiosTipoCosto = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCosto = new JButtonMe();
		this.jButtonCerrarTipoCosto = new JButtonMe();
		
		this.jScrollPanelDatosTipoCosto = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCosto = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCosto = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo";
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCosto.setName("jPanelCamposTipoCosto"); 

		this.jPanelCamposOcultosTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCosto.setName("jPanelCamposOcultosTipoCosto"); 

        this.jPanelAccionesTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCosto.setToolTipText("Acciones");
        this.jPanelAccionesTipoCosto.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCosto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCosto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCosto.setText("Nuevo");
		this.jButtonModificarTipoCosto.setText("Editar");
        this.jButtonActualizarTipoCosto.setText("Actualizar");
        this.jButtonEliminarTipoCosto.setText("Eliminar");
        this.jButtonCancelarTipoCosto.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCosto.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCosto.setText("Guardar");
		this.jButtonCerrarTipoCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCosto,"nuevo_button","Nuevo",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCosto,"modificar_button","Editar",this.tipocostoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCosto,"actualizar_button","Actualizar",this.tipocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCosto,"eliminar_button","Eliminar",this.tipocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCosto,"cancelar_button","Cancelar",this.tipocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCosto,"guardarcambios_button","Guardar",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCosto,"guardarcambiostabla_button","Guardar",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCosto,"cerrar_button","Salir",this.tipocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCosto.setToolTipText("Nuevo"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCosto.setToolTipText("Editar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCosto.setToolTipText("Actualizar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCosto.setToolTipText("Eliminar)"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCosto.setToolTipText("Cancelar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCosto.setToolTipText("Guardar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCosto.setToolTipText("Guardar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCosto.setToolTipText("Salir"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCosto";
		inputMap = this.jButtonNuevoTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCosto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCosto";
		inputMap = this.jButtonActualizarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCosto"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCosto";
		inputMap = this.jButtonEliminarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCosto"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCosto";
		inputMap = this.jButtonCancelarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCosto"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCosto";
		inputMap = this.jButtonCerrarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCosto";
		inputMap = this.jButtonGuardarCambiosTablaTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCosto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCosto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCosto.setToolTipText("Nuevo TipoCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCosto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCosto.setToolTipText("Sin Cerrar Ventana TipoCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCosto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCosto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCosto.setText("Accion");
		this.jComboBoxTiposAccionesTipoCosto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCosto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCosto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCosto = new JLabelMe();
		
		this.jLabelAccionesTipoCosto.setText("Acciones");		
		this.jLabelAccionesTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCosto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCosto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCosto=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCosto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCosto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCosto = new GridBagLayout();
		
		this.jPanelCamposTipoCosto.setLayout(gridaBagLayoutCamposTipoCosto);
		this.jPanelCamposOcultosTipoCosto.setLayout(gridaBagLayoutCamposOcultosTipoCosto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosto.gridy = 0;
	this.gridBagConstraintsTipoCosto.gridx = 0;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCosto.add(jLabelIdTipoCosto, this.gridBagConstraintsTipoCosto);



	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosto.gridy = 0;
	this.gridBagConstraintsTipoCosto.gridx = 1;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCosto.add(jTextFieldidTipoCosto, this.gridBagConstraintsTipoCosto);


	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosto.gridy = 0;
	this.gridBagConstraintsTipoCosto.gridx = 0;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCosto.add(jLabelcodigoTipoCosto, this.gridBagConstraintsTipoCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = 0;
		this.gridBagConstraintsTipoCosto.gridx = 2;
		this.gridBagConstraintsTipoCosto.ipadx = 0;
		this.gridBagConstraintsTipoCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCosto.add(jButtoncodigoTipoCostoBusqueda, this.gridBagConstraintsTipoCosto);
	}

	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosto.gridy = 0;
	this.gridBagConstraintsTipoCosto.gridx = 1;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCosto.add(jTextFieldcodigoTipoCosto, this.gridBagConstraintsTipoCosto);


	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosto.gridy = 0;
	this.gridBagConstraintsTipoCosto.gridx = 0;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCosto.add(jLabelnombreTipoCosto, this.gridBagConstraintsTipoCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = 0;
		this.gridBagConstraintsTipoCosto.gridx = 2;
		this.gridBagConstraintsTipoCosto.ipadx = 0;
		this.gridBagConstraintsTipoCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCosto.add(jButtonnombreTipoCostoBusqueda, this.gridBagConstraintsTipoCosto);
	}

	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosto.gridy = 0;
	this.gridBagConstraintsTipoCosto.gridx = 1;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCosto.add(jTextFieldnombreTipoCosto, this.gridBagConstraintsTipoCosto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosto.gridy = iYPanelCamposTipoCosto;
	this.gridBagConstraintsTipoCosto.gridx = iXPanelCamposTipoCosto++;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosto.add(this.jPanelidTipoCosto, this.gridBagConstraintsTipoCosto);



	if(iXPanelCamposTipoCosto % 1==0) {
		iXPanelCamposTipoCosto=0;
		iYPanelCamposTipoCosto++;
	}
	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosto.gridy = iYPanelCamposTipoCosto;
	this.gridBagConstraintsTipoCosto.gridx = iXPanelCamposTipoCosto++;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosto.add(this.jPanelcodigoTipoCosto, this.gridBagConstraintsTipoCosto);



	if(iXPanelCamposTipoCosto % 1==0) {
		iXPanelCamposTipoCosto=0;
		iYPanelCamposTipoCosto++;
	}
	this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosto.gridy = iYPanelCamposTipoCosto;
	this.gridBagConstraintsTipoCosto.gridx = iXPanelCamposTipoCosto++;
	this.gridBagConstraintsTipoCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosto.add(this.jPanelnombreTipoCosto, this.gridBagConstraintsTipoCosto);



	if(iXPanelCamposTipoCosto % 1==0) {
		iXPanelCamposTipoCosto=0;
		iYPanelCamposTipoCosto++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCosto= new GridBagLayout();
		this.jPanelAccionesTipoCosto.setLayout(gridaBagLayoutAccionesTipoCosto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCosto= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCosto.setLayout(gridaBagLayoutAccionesFormularioTipoCosto);
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCosto.add(this.jComboBoxTiposAccionesFormularioTipoCosto, this.gridBagConstraintsTipoCosto);

		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCosto.add(this.jCheckBoxPostAccionNuevoTipoCosto, this.gridBagConstraintsTipoCosto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCosto.add(this.jCheckBoxPostAccionSinCerrarTipoCosto, this.gridBagConstraintsTipoCosto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCosto.add(this.jCheckBoxPostAccionSinMensajeTipoCosto, this.gridBagConstraintsTipoCosto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = 0;
		this.gridBagConstraintsTipoCosto.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCosto.add(this.jButtonModificarTipoCosto, this.gridBagConstraintsTipoCosto);							

		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = 0;
		this.gridBagConstraintsTipoCosto.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCosto.add(this.jButtonEliminarTipoCosto, this.gridBagConstraintsTipoCosto);
		
			
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = 0;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCosto.add(this.jButtonActualizarTipoCosto, this.gridBagConstraintsTipoCosto);


		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = 0;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCosto.add(this.jButtonGuardarCambiosTipoCosto, this.gridBagConstraintsTipoCosto);	
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = 0;		
		this.gridBagConstraintsTipoCosto.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCosto.add(this.jButtonCancelarTipoCosto, this.gridBagConstraintsTipoCosto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCosto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();						
			this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosto.gridx = 0;		
			//this.gridBagConstraintsTipoCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCosto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCosto.gridx =0;
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCosto, this.gridBagConstraintsTipoCosto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCosto = new TipoCostoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCostoModel tipocostoModel=new TipoCostoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCostoModel.TipoCostoFocusTraversalPolicy tipocostoFocusTraversalPolicy = tipocostoModel.new TipoCostoFocusTraversalPolicy(this);
			
			//tipocostoFocusTraversalPolicy.settipocostoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocostoModel);
			
			
			this.jContentPaneDetalleTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCosto = new GridBagLayout();	
			this.jContentPaneDetalleTipoCosto.setLayout(gridaBagLayoutDetalleTipoCosto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCosto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCosto = new GridBagConstraints();
				this.gridBagConstraintsTipoCosto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCosto.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCosto.add(jTtoolBarDetalleTipoCosto, gridBagConstraintsTipoCosto);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCosto=   new JScrollPane(jContentPaneDetalleTipoCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCosto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCosto.gridx = 0;
	        
			this.jContentPaneDetalleTipoCosto.add(jPanelCamposTipoCosto, gridBagConstraintsTipoCosto);
			
			
			
			
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
						&& tipocostoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCosto= new GridBagConstraints();
						this.gridBagConstraintsTipoCosto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCosto.gridx = 0;
						this.jContentPaneDetalleTipoCosto.add(this.jTabbedPaneRelacionesTipoCosto, this.gridBagConstraintsTipoCosto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCosto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCosto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCosto = new GridBagConstraints();
					this.gridBagConstraintsTipoCosto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCosto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCosto.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCosto.add(jPanelCamposOcultosTipoCosto, gridBagConstraintsTipoCosto);
				
					this.jPanelCamposOcultosTipoCosto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCosto.gridx = 0;
	        this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCosto.add(this.jPanelAccionesFormularioTipoCosto, this.gridBagConstraintsTipoCosto);							
			
			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
	        this.gridBagConstraintsTipoCosto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCosto.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCosto.add(this.jPanelAccionesTipoCosto, this.gridBagConstraintsTipoCosto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCosto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCosto=   new JScrollPane(this.jPanelCamposTipoCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosto.gridx = 0;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCosto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCosto, this.gridBagConstraintsTipoCosto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCosto, this.gridBagConstraintsTipoCosto);			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCosto, this.gridBagConstraintsTipoCosto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCosto, this.gridBagConstraintsTipoCosto);
			
			
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCosto, this.gridBagConstraintsTipoCosto);
		
			
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCosto, this.gridBagConstraintsTipoCosto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCosto;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCosto;
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
