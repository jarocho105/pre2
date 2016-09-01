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
import com.bydan.erp.inventario.util.TipoCosteoDefinicionConstantesFunciones;

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
public class TipoCosteoDefinicionDetalleFormJInternalFrame extends TipoCosteoDefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCosteoDefinicion;
	
	protected JMenuBar jmenuBarDetalleTipoCosteoDefinicion;
	
	protected JMenu jmenuDetalleTipoCosteoDefinicion;
	protected JMenu jmenuDetalleArchivoTipoCosteoDefinicion;
	protected JMenu jmenuDetalleAccionesTipoCosteoDefinicion;
	protected JMenu jmenuDetalleDatosTipoCosteoDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCosteoDefinicion;	
	protected GridBagConstraints gridBagConstraintsTipoCosteoDefinicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCosteoDefinicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCosteoDefinicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean;
	
	

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
		
	
	public TipoCosteoDefinicionLogic tipocosteodefinicionLogic;
	
	public JScrollPane jScrollPanelDatosTipoCosteoDefinicion;
	public JScrollPane jScrollPanelDatosEdicionTipoCosteoDefinicion;
	public JScrollPane jScrollPanelDatosGeneralTipoCosteoDefinicion;
	
	protected JPanel jPanelCamposTipoCosteoDefinicion;    
	protected JPanel jPanelCamposOcultosTipoCosteoDefinicion;    	
	protected JPanel jPanelAccionesTipoCosteoDefinicion;
	protected JPanel jPanelAccionesFormularioTipoCosteoDefinicion;
    
	
	
	protected Integer iXPanelCamposTipoCosteoDefinicion=0;
	protected Integer iYPanelCamposTipoCosteoDefinicion=0;
	
	protected Integer iXPanelCamposOcultosTipoCosteoDefinicion=0;
	protected Integer iYPanelCamposOcultosTipoCosteoDefinicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCosteoDefinicion;
	public JButton jButtonModificarTipoCosteoDefinicion;
	public JButton jButtonActualizarTipoCosteoDefinicion;
    public JButton jButtonEliminarTipoCosteoDefinicion;
	public JButton jButtonCancelarTipoCosteoDefinicion;
    public JButton jButtonGuardarCambiosTipoCosteoDefinicion;
	public JButton jButtonGuardarCambiosTablaTipoCosteoDefinicion;
	protected JButton jButtonCerrarTipoCosteoDefinicion;
	
	
	protected JButton jButtonProcesarInformacionTipoCosteoDefinicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCosteoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCosteoDefinicion;
	protected JButton jButtonModificarToolBarTipoCosteoDefinicion;
	protected JButton jButtonActualizarToolBarTipoCosteoDefinicion;
    protected JButton jButtonEliminarToolBarTipoCosteoDefinicion;
	protected JButton jButtonCancelarToolBarTipoCosteoDefinicion;
    protected JButton jButtonGuardarCambiosToolBarTipoCosteoDefinicion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCosteoDefinicion;
	protected JButton jButtonCerrarToolBarTipoCosteoDefinicion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCosteoDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCosteoDefinicion;
	protected JMenuItem jMenuItemModificarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemActualizarTipoCosteoDefinicion;
    protected JMenuItem jMenuItemEliminarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemCancelarTipoCosteoDefinicion;
    protected JMenuItem jMenuItemGuardarCambiosTipoCosteoDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCosteoDefinicion;
	protected JMenuItem jMenuItemCerrarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCosteoDefinicion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCosteoDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoCosteoDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCosteoDefinicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCosteoDefinicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCosteoDefinicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCosteoDefinicion;
	public JLabel jLabelIdTipoCosteoDefinicion;
	public JTextFieldMe jTextFieldidTipoCosteoDefinicion;
	public JButton jButtonidTipoCosteoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCosteoDefinicion;
	public JLabel jLabelcodigoTipoCosteoDefinicion;
	public JTextField jTextFieldcodigoTipoCosteoDefinicion;
	public JButton jButtoncodigoTipoCosteoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCosteoDefinicion;
	public JLabel jLabelnombreTipoCosteoDefinicion;
	public JTextField jTextFieldnombreTipoCosteoDefinicion;
	public JButton jButtonnombreTipoCosteoDefinicionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCosteoDefinicion;
	
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
	
	public TipoCosteoDefinicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCosteoDefinicion=new JPanel();
				this.jPanelAccionesFormularioTipoCosteoDefinicion=new JPanel();
				this.jmenuBarDetalleTipoCosteoDefinicion=new JMenuBar();
				this.jTtoolBarDetalleTipoCosteoDefinicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCosteoDefinicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCosteoDefinicion() {
		return this.jButtonActualizarToolBarTipoCosteoDefinicion;
	}
	
	public JButton getjButtonEliminarToolBarTipoCosteoDefinicion() {
		return this.jButtonEliminarToolBarTipoCosteoDefinicion;
	}
	
	public JButton getjButtonCancelarToolBarTipoCosteoDefinicion() {
		return this.jButtonCancelarToolBarTipoCosteoDefinicion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCosteoDefinicion() {
		return this.jButtonProcesarInformacionTipoCosteoDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCosteoDefinicion)	{
		this.jButtonProcesarInformacionTipoCosteoDefinicion = jButtonProcesarInformacionTipoCosteoDefinicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCosteoDefinicion() {
		return this.jComboBoxTiposAccionesTipoCosteoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposRelacionesTipoCosteoDefinicion) {
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion = jComboBoxTiposRelacionesTipoCosteoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposAccionesTipoCosteoDefinicion) {
		this.jComboBoxTiposAccionesTipoCosteoDefinicion = jComboBoxTiposAccionesTipoCosteoDefinicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCosteoDefinicion() {
		return this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCosteoDefinicion(
			JComboBox jComboBoxTiposAccionesFormularioTipoCosteoDefinicion) {
		this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion = jComboBoxTiposAccionesFormularioTipoCosteoDefinicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
		
		this.tipocosteodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocosteodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCosteoDefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costeo Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCosteoDefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCosteoDefinicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCosteoDefinicion=new JButtonMe();
				this.jButtonModificarToolBarTipoCosteoDefinicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCosteoDefinicion,this.jTtoolBarDetalleTipoCosteoDefinicion,
							"actualizar","actualizar","Actualizar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCosteoDefinicion,this.jTtoolBarDetalleTipoCosteoDefinicion,
							"eliminar","eliminar","Eliminar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCosteoDefinicion,this.jTtoolBarDetalleTipoCosteoDefinicion,
							"cancelar","cancelar","Cancelar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCosteoDefinicion,this.jTtoolBarDetalleTipoCosteoDefinicion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCosteoDefinicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCosteoDefinicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCosteoDefinicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCosteoDefinicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCosteoDefinicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCosteoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCosteoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCosteoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCosteoDefinicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCosteoDefinicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCosteoDefinicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCosteoDefinicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCosteoDefinicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCosteoDefinicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCosteoDefinicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCosteoDefinicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCosteoDefinicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCosteoDefinicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCosteoDefinicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCosteoDefinicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCosteoDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCosteoDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCosteoDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCosteoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCosteoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCosteoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCosteoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCosteoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCosteoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCosteoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCosteoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCosteoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCosteoDefinicion.add(this.jMenuItemDetalleCerrarTipoCosteoDefinicion);
		
		this.jmenuDetalleAccionesTipoCosteoDefinicion.add(this.jMenuItemActualizarTipoCosteoDefinicion);
		this.jmenuDetalleAccionesTipoCosteoDefinicion.add(this.jMenuItemEliminarTipoCosteoDefinicion);
		this.jmenuDetalleAccionesTipoCosteoDefinicion.add(this.jMenuItemCancelarTipoCosteoDefinicion);		
		
		//this.jmenuDetalleDatosTipoCosteoDefinicion.add(this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion);				
		this.jmenuDetalleDatosTipoCosteoDefinicion.add(this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion);				
				
		//this.jmenuDetalleAccionesTipoCosteoDefinicion.add(this.jMenuItemGuardarCambiosTipoCosteoDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCosteoDefinicion.add(this.jmenuDetalleArchivoTipoCosteoDefinicion);		
		this.jmenuBarDetalleTipoCosteoDefinicion.add(this.jmenuDetalleAccionesTipoCosteoDefinicion);		
		this.jmenuBarDetalleTipoCosteoDefinicion.add(this.jmenuDetalleDatosTipoCosteoDefinicion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCosteoDefinicion.add(this.jmenuDetalleTipoCosteoDefinicion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCosteoDefinicion);				
	}
	
	
	public void inicializarElementosCamposTipoCosteoDefinicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCosteoDefinicion = new JLabelMe();
		jLabelIdTipoCosteoDefinicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCosteoDefinicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCosteoDefinicion.setToolTipText(TipoCosteoDefinicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCosteoDefinicion= new GridBagLayout();

		this.jPanelidTipoCosteoDefinicion.setLayout(this.gridaBagLayoutTipoCosteoDefinicion);

		jTextFieldidTipoCosteoDefinicion = new JTextFieldMe();
		jTextFieldidTipoCosteoDefinicion.setText("Id");

		jTextFieldidTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCosteoDefinicion = new JLabelMe();
		this.jLabelcodigoTipoCosteoDefinicion.setText(""+TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCosteoDefinicion.setToolTipText("Codigo");
		this.jLabelcodigoTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCosteoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCosteoDefinicion.setToolTipText(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCosteoDefinicion = new GridBagLayout();
		this.jPanelcodigoTipoCosteoDefinicion.setLayout(this.gridaBagLayoutTipoCosteoDefinicion);


		jTextFieldcodigoTipoCosteoDefinicion= new JTextFieldMe();

		jTextFieldcodigoTipoCosteoDefinicion.setEnabled(false);
		jTextFieldcodigoTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCosteoDefinicionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCosteoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCosteoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCosteoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCosteoDefinicionBusqueda.setText("U");
		this.jButtoncodigoTipoCosteoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCosteoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCosteoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCosteoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCosteoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCosteoDefinicionBusqueda"));

		if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCosteoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCosteoDefinicion = new JLabelMe();
		this.jLabelnombreTipoCosteoDefinicion.setText(""+TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCosteoDefinicion.setToolTipText("Nombre");
		this.jLabelnombreTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCosteoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCosteoDefinicion.setToolTipText(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCosteoDefinicion = new GridBagLayout();
		this.jPanelnombreTipoCosteoDefinicion.setLayout(this.gridaBagLayoutTipoCosteoDefinicion);


		jTextFieldnombreTipoCosteoDefinicion= new JTextFieldMe();

		jTextFieldnombreTipoCosteoDefinicion.setEnabled(false);
		jTextFieldnombreTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoCosteoDefinicionBusqueda= new JButtonMe();
		this.jButtonnombreTipoCosteoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCosteoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCosteoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCosteoDefinicionBusqueda.setText("U");
		this.jButtonnombreTipoCosteoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCosteoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCosteoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoCosteoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoCosteoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCosteoDefinicionBusqueda"));

		if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCosteoDefinicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCosteoDefinicion() {
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
		//this.jInternalFrameDetalleTipoCosteoDefinicion = new TipoCosteoDefinicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Costeo Definicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCosteoDefinicion= new GridBagLayout();
		

		
		String sToolTipTipoCosteoDefinicion="";
		sToolTipTipoCosteoDefinicion=TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCosteoDefinicion+="(Inventario.TipoCosteoDefinicion)";
		}
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCosteoDefinicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCosteoDefinicion = new JButtonMe();
		this.jButtonModificarTipoCosteoDefinicion = new JButtonMe();
        this.jButtonActualizarTipoCosteoDefinicion = new JButtonMe();
        this.jButtonEliminarTipoCosteoDefinicion = new JButtonMe();
        this.jButtonCancelarTipoCosteoDefinicion = new JButtonMe();
        this.jButtonGuardarCambiosTipoCosteoDefinicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion = new JButtonMe();
		this.jButtonCerrarTipoCosteoDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoCosteoDefinicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCosteoDefinicion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCosteoDefinicion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costeo Definicion";
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeo Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCosteoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCosteoDefinicion.setName("jPanelCamposTipoCosteoDefinicion"); 

		this.jPanelCamposOcultosTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCosteoDefinicion.setName("jPanelCamposOcultosTipoCosteoDefinicion"); 

        this.jPanelAccionesTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCosteoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoCosteoDefinicion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCosteoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCosteoDefinicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCosteoDefinicion.setText("Nuevo");
		this.jButtonModificarTipoCosteoDefinicion.setText("Editar");
        this.jButtonActualizarTipoCosteoDefinicion.setText("Actualizar");
        this.jButtonEliminarTipoCosteoDefinicion.setText("Eliminar");
        this.jButtonCancelarTipoCosteoDefinicion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCosteoDefinicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.setText("Guardar");
		this.jButtonCerrarTipoCosteoDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCosteoDefinicion,"nuevo_button","Nuevo",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCosteoDefinicion,"modificar_button","Editar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCosteoDefinicion,"actualizar_button","Actualizar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCosteoDefinicion,"eliminar_button","Eliminar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCosteoDefinicion,"cancelar_button","Cancelar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCosteoDefinicion,"guardarcambios_button","Guardar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCosteoDefinicion,"guardarcambiostabla_button","Guardar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCosteoDefinicion,"cerrar_button","Salir",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCosteoDefinicion.setToolTipText("Nuevo"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCosteoDefinicion.setToolTipText("Editar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCosteoDefinicion.setToolTipText("Actualizar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCosteoDefinicion.setToolTipText("Eliminar)"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCosteoDefinicion.setToolTipText("Cancelar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCosteoDefinicion.setToolTipText("Guardar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.setToolTipText("Guardar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCosteoDefinicion.setToolTipText("Salir"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCosteoDefinicion";
		inputMap = this.jButtonNuevoTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCosteoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCosteoDefinicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCosteoDefinicion";
		inputMap = this.jButtonActualizarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCosteoDefinicion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCosteoDefinicion";
		inputMap = this.jButtonEliminarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCosteoDefinicion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCosteoDefinicion";
		inputMap = this.jButtonCancelarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCosteoDefinicion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCosteoDefinicion";
		inputMap = this.jButtonCerrarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCosteoDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCosteoDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCosteoDefinicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCosteoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCosteoDefinicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCosteoDefinicion.setToolTipText("Nuevo TipoCosteoDefinicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion.setToolTipText("Sin Cerrar Ventana TipoCosteoDefinicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCosteoDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCosteoDefinicion = new JLabelMe();
		
		this.jLabelAccionesTipoCosteoDefinicion.setText("Acciones");		
		this.jLabelAccionesTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCosteoDefinicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCosteoDefinicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCosteoDefinicion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCosteoDefinicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCosteoDefinicion = new GridBagLayout();
		
		this.jPanelCamposTipoCosteoDefinicion.setLayout(gridaBagLayoutCamposTipoCosteoDefinicion);
		this.jPanelCamposOcultosTipoCosteoDefinicion.setLayout(gridaBagLayoutCamposOcultosTipoCosteoDefinicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCosteoDefinicion.add(jLabelIdTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);



	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCosteoDefinicion.add(jTextFieldidTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);


	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCosteoDefinicion.add(jLabelcodigoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 2;
		this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCosteoDefinicion.add(jButtoncodigoTipoCosteoDefinicionBusqueda, this.gridBagConstraintsTipoCosteoDefinicion);
	}

	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCosteoDefinicion.add(jTextFieldcodigoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);


	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCosteoDefinicion.add(jLabelnombreTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 2;
		this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCosteoDefinicion.add(jButtonnombreTipoCosteoDefinicionBusqueda, this.gridBagConstraintsTipoCosteoDefinicion);
	}

	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCosteoDefinicion.add(jTextFieldnombreTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = iYPanelCamposTipoCosteoDefinicion;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = iXPanelCamposTipoCosteoDefinicion++;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosteoDefinicion.add(this.jPanelidTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);



	if(iXPanelCamposTipoCosteoDefinicion % 1==0) {
		iXPanelCamposTipoCosteoDefinicion=0;
		iYPanelCamposTipoCosteoDefinicion++;
	}
	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = iYPanelCamposTipoCosteoDefinicion;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = iXPanelCamposTipoCosteoDefinicion++;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosteoDefinicion.add(this.jPanelcodigoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);



	if(iXPanelCamposTipoCosteoDefinicion % 1==0) {
		iXPanelCamposTipoCosteoDefinicion=0;
		iYPanelCamposTipoCosteoDefinicion++;
	}
	this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosteoDefinicion.gridy = iYPanelCamposTipoCosteoDefinicion;
	this.gridBagConstraintsTipoCosteoDefinicion.gridx = iXPanelCamposTipoCosteoDefinicion++;
	this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosteoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosteoDefinicion.add(this.jPanelnombreTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);



	if(iXPanelCamposTipoCosteoDefinicion % 1==0) {
		iXPanelCamposTipoCosteoDefinicion=0;
		iYPanelCamposTipoCosteoDefinicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCosteoDefinicion= new GridBagLayout();
		this.jPanelAccionesTipoCosteoDefinicion.setLayout(gridaBagLayoutAccionesTipoCosteoDefinicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCosteoDefinicion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCosteoDefinicion.setLayout(gridaBagLayoutAccionesFormularioTipoCosteoDefinicion);
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCosteoDefinicion.add(this.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);

		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCosteoDefinicion.add(this.jCheckBoxPostAccionNuevoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCosteoDefinicion.add(this.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCosteoDefinicion.add(this.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCosteoDefinicion.add(this.jButtonModificarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);							

		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCosteoDefinicion.add(this.jButtonEliminarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
			
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCosteoDefinicion.add(this.jButtonActualizarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);


		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCosteoDefinicion.add(this.jButtonGuardarCambiosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);	
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCosteoDefinicion.add(this.jButtonCancelarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCosteoDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCosteoDefinicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;		
			//this.gridBagConstraintsTipoCosteoDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =0;
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCosteoDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCosteoDefinicion = new TipoCosteoDefinicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Costeo Definicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Costeo Definicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costeo Definicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCosteoDefinicionModel tipocosteodefinicionModel=new TipoCosteoDefinicionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCosteoDefinicionModel.TipoCosteoDefinicionFocusTraversalPolicy tipocosteodefinicionFocusTraversalPolicy = tipocosteodefinicionModel.new TipoCosteoDefinicionFocusTraversalPolicy(this);
			
			//tipocosteodefinicionFocusTraversalPolicy.settipocosteodefinicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocosteodefinicionModel);
			
			
			this.jContentPaneDetalleTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCosteoDefinicion = new GridBagLayout();	
			this.jContentPaneDetalleTipoCosteoDefinicion.setLayout(gridaBagLayoutDetalleTipoCosteoDefinicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCosteoDefinicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCosteoDefinicion.add(jTtoolBarDetalleTipoCosteoDefinicion, gridBagConstraintsTipoCosteoDefinicion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion=   new JScrollPane(jContentPaneDetalleTipoCosteoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
	        
			this.jContentPaneDetalleTipoCosteoDefinicion.add(jPanelCamposTipoCosteoDefinicion, gridBagConstraintsTipoCosteoDefinicion);
			
			
			
			
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
						&& tipocosteodefinicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					
					if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCosteoDefinicion= new GridBagConstraints();
						this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
						this.jContentPaneDetalleTipoCosteoDefinicion.add(this.jTabbedPaneRelacionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCosteoDefinicion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCosteoDefinicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
					this.gridBagConstraintsTipoCosteoDefinicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCosteoDefinicion.add(jPanelCamposOcultosTipoCosteoDefinicion, gridBagConstraintsTipoCosteoDefinicion);
				
					this.jPanelCamposOcultosTipoCosteoDefinicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
	        this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCosteoDefinicion.add(this.jPanelAccionesFormularioTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);							
			
			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
	        this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCosteoDefinicion.add(this.jPanelAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCosteoDefinicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion=   new JScrollPane(this.jPanelCamposTipoCosteoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCosteoDefinicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
			
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
			
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCosteoDefinicion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCosteoDefinicion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDefinicion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.definicionSessionBean=new DefinicionSessionBean();
		this.definicionSessionBean.setConGuardarRelaciones(false);
		this.definicionSessionBean.setEsGuardarRelacionado(true);

		this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.definicionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.definicionSessionBean.getEsGuardarRelacionado()) {

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
				//this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
				//this.jContentPaneDetalleTipoCosteoDefinicion.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCosteoDefinicion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCosteoDefinicion.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCosteoDefinicion.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesTipoCosteoDefinicion.add("Definiciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDefinicionBeanSwingJInternalFrame(List<TipoCosteoDefinicion> tipocosteodefinicions,TipoCosteoDefinicion tipocosteodefinicion,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.tipocosteodefinicionLogic.getConnexion());

					definicionBeanSwingJInternalFrame.settipocosteodefinicionsForeignKey(tipocosteodefinicions);
					definicionBeanSwingJInternalFrame.settipocosteodefinicionForeignKey(tipocosteodefinicion);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoCosteoDefinicion(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidTipoCosteoDefinicionActual(tipocosteodefinicion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCosteoDefinicion(true);
					definicionBeanSwingJInternalFrame.setid_tipo_costeo_definicionFK_IdTipoCosteoDefinicion(tipocosteodefinicion.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCosteoDefinicionForeignKey(tipocosteodefinicion,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCosteoDefinicion");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCosteoDefinicion");
					definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(true);
					definicionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDefinicion("n",definicionBeanSwingJInternalFrame.isGuardarCambiosEnLote, definicionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					definicionBeanSwingJInternalFrame.setAutoscrolls(true);
					definicionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("relacionado");
					} else {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");
					}

					definicionBeanSwingJInternalFrame.getjButtonRecargarInformacionDefinicion().setVisible(false);

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
