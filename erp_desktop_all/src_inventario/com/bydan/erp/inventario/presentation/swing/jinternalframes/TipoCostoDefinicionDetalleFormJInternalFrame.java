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
import com.bydan.erp.inventario.util.TipoCostoDefinicionConstantesFunciones;

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
public class TipoCostoDefinicionDetalleFormJInternalFrame extends TipoCostoDefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCostoDefinicion;
	
	protected JMenuBar jmenuBarDetalleTipoCostoDefinicion;
	
	protected JMenu jmenuDetalleTipoCostoDefinicion;
	protected JMenu jmenuDetalleArchivoTipoCostoDefinicion;
	protected JMenu jmenuDetalleAccionesTipoCostoDefinicion;
	protected JMenu jmenuDetalleDatosTipoCostoDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCostoDefinicion;	
	protected GridBagConstraints gridBagConstraintsTipoCostoDefinicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCostoDefinicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCostoDefinicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean;
	
	

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
		
	
	public TipoCostoDefinicionLogic tipocostodefinicionLogic;
	
	public JScrollPane jScrollPanelDatosTipoCostoDefinicion;
	public JScrollPane jScrollPanelDatosEdicionTipoCostoDefinicion;
	public JScrollPane jScrollPanelDatosGeneralTipoCostoDefinicion;
	
	protected JPanel jPanelCamposTipoCostoDefinicion;    
	protected JPanel jPanelCamposOcultosTipoCostoDefinicion;    	
	protected JPanel jPanelAccionesTipoCostoDefinicion;
	protected JPanel jPanelAccionesFormularioTipoCostoDefinicion;
    
	
	
	protected Integer iXPanelCamposTipoCostoDefinicion=0;
	protected Integer iYPanelCamposTipoCostoDefinicion=0;
	
	protected Integer iXPanelCamposOcultosTipoCostoDefinicion=0;
	protected Integer iYPanelCamposOcultosTipoCostoDefinicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCostoDefinicion;
	public JButton jButtonModificarTipoCostoDefinicion;
	public JButton jButtonActualizarTipoCostoDefinicion;
    public JButton jButtonEliminarTipoCostoDefinicion;
	public JButton jButtonCancelarTipoCostoDefinicion;
    public JButton jButtonGuardarCambiosTipoCostoDefinicion;
	public JButton jButtonGuardarCambiosTablaTipoCostoDefinicion;
	protected JButton jButtonCerrarTipoCostoDefinicion;
	
	
	protected JButton jButtonProcesarInformacionTipoCostoDefinicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCostoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCostoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCostoDefinicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCostoDefinicion;
	protected JButton jButtonModificarToolBarTipoCostoDefinicion;
	protected JButton jButtonActualizarToolBarTipoCostoDefinicion;
    protected JButton jButtonEliminarToolBarTipoCostoDefinicion;
	protected JButton jButtonCancelarToolBarTipoCostoDefinicion;
    protected JButton jButtonGuardarCambiosToolBarTipoCostoDefinicion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCostoDefinicion;
	protected JButton jButtonCerrarToolBarTipoCostoDefinicion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCostoDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCostoDefinicion;
	protected JMenuItem jMenuItemModificarTipoCostoDefinicion;
	protected JMenuItem jMenuItemActualizarTipoCostoDefinicion;
    protected JMenuItem jMenuItemEliminarTipoCostoDefinicion;
	protected JMenuItem jMenuItemCancelarTipoCostoDefinicion;
    protected JMenuItem jMenuItemGuardarCambiosTipoCostoDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCostoDefinicion;
	protected JMenuItem jMenuItemCerrarTipoCostoDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoCostoDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCostoDefinicion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCostoDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCostoDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoCostoDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCostoDefinicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCostoDefinicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCostoDefinicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCostoDefinicion;
	public JLabel jLabelIdTipoCostoDefinicion;
	public JTextFieldMe jTextFieldidTipoCostoDefinicion;
	public JButton jButtonidTipoCostoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCostoDefinicion;
	public JLabel jLabelcodigoTipoCostoDefinicion;
	public JTextField jTextFieldcodigoTipoCostoDefinicion;
	public JButton jButtoncodigoTipoCostoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCostoDefinicion;
	public JLabel jLabelnombreTipoCostoDefinicion;
	public JTextField jTextFieldnombreTipoCostoDefinicion;
	public JButton jButtonnombreTipoCostoDefinicionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCostoDefinicion;
	
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
	
	public TipoCostoDefinicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCostoDefinicion=new JPanel();
				this.jPanelAccionesFormularioTipoCostoDefinicion=new JPanel();
				this.jmenuBarDetalleTipoCostoDefinicion=new JMenuBar();
				this.jTtoolBarDetalleTipoCostoDefinicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCostoDefinicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCostoDefinicion() {
		return this.jButtonActualizarToolBarTipoCostoDefinicion;
	}
	
	public JButton getjButtonEliminarToolBarTipoCostoDefinicion() {
		return this.jButtonEliminarToolBarTipoCostoDefinicion;
	}
	
	public JButton getjButtonCancelarToolBarTipoCostoDefinicion() {
		return this.jButtonCancelarToolBarTipoCostoDefinicion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCostoDefinicion() {
		return this.jButtonProcesarInformacionTipoCostoDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCostoDefinicion)	{
		this.jButtonProcesarInformacionTipoCostoDefinicion = jButtonProcesarInformacionTipoCostoDefinicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCostoDefinicion() {
		return this.jComboBoxTiposAccionesTipoCostoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCostoDefinicion(
			JComboBox jComboBoxTiposRelacionesTipoCostoDefinicion) {
		this.jComboBoxTiposRelacionesTipoCostoDefinicion = jComboBoxTiposRelacionesTipoCostoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCostoDefinicion(
			JComboBox jComboBoxTiposAccionesTipoCostoDefinicion) {
		this.jComboBoxTiposAccionesTipoCostoDefinicion = jComboBoxTiposAccionesTipoCostoDefinicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCostoDefinicion() {
		return this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCostoDefinicion(
			JComboBox jComboBoxTiposAccionesFormularioTipoCostoDefinicion) {
		this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion = jComboBoxTiposAccionesFormularioTipoCostoDefinicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
		
		this.tipocostodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocostodefinicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCostoDefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCostoDefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCostoDefinicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCostoDefinicion=new JButtonMe();
				this.jButtonModificarToolBarTipoCostoDefinicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCostoDefinicion,this.jTtoolBarDetalleTipoCostoDefinicion,
							"actualizar","actualizar","Actualizar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCostoDefinicion,this.jTtoolBarDetalleTipoCostoDefinicion,
							"eliminar","eliminar","Eliminar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCostoDefinicion,this.jTtoolBarDetalleTipoCostoDefinicion,
							"cancelar","cancelar","Cancelar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCostoDefinicion,this.jTtoolBarDetalleTipoCostoDefinicion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCostoDefinicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCostoDefinicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCostoDefinicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCostoDefinicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCostoDefinicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCostoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCostoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCostoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCostoDefinicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCostoDefinicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCostoDefinicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCostoDefinicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCostoDefinicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCostoDefinicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCostoDefinicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCostoDefinicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCostoDefinicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCostoDefinicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCostoDefinicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCostoDefinicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCostoDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCostoDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCostoDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCostoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCostoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCostoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCostoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCostoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCostoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCostoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCostoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCostoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCostoDefinicion.add(this.jMenuItemDetalleCerrarTipoCostoDefinicion);
		
		this.jmenuDetalleAccionesTipoCostoDefinicion.add(this.jMenuItemActualizarTipoCostoDefinicion);
		this.jmenuDetalleAccionesTipoCostoDefinicion.add(this.jMenuItemEliminarTipoCostoDefinicion);
		this.jmenuDetalleAccionesTipoCostoDefinicion.add(this.jMenuItemCancelarTipoCostoDefinicion);		
		
		//this.jmenuDetalleDatosTipoCostoDefinicion.add(this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion);				
		this.jmenuDetalleDatosTipoCostoDefinicion.add(this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion);				
				
		//this.jmenuDetalleAccionesTipoCostoDefinicion.add(this.jMenuItemGuardarCambiosTipoCostoDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCostoDefinicion.add(this.jmenuDetalleArchivoTipoCostoDefinicion);		
		this.jmenuBarDetalleTipoCostoDefinicion.add(this.jmenuDetalleAccionesTipoCostoDefinicion);		
		this.jmenuBarDetalleTipoCostoDefinicion.add(this.jmenuDetalleDatosTipoCostoDefinicion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCostoDefinicion.add(this.jmenuDetalleTipoCostoDefinicion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCostoDefinicion);				
	}
	
	
	public void inicializarElementosCamposTipoCostoDefinicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCostoDefinicion = new JLabelMe();
		jLabelIdTipoCostoDefinicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCostoDefinicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCostoDefinicion.setToolTipText(TipoCostoDefinicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCostoDefinicion= new GridBagLayout();

		this.jPanelidTipoCostoDefinicion.setLayout(this.gridaBagLayoutTipoCostoDefinicion);

		jTextFieldidTipoCostoDefinicion = new JTextFieldMe();
		jTextFieldidTipoCostoDefinicion.setText("Id");

		jTextFieldidTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCostoDefinicion = new JLabelMe();
		this.jLabelcodigoTipoCostoDefinicion.setText(""+TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCostoDefinicion.setToolTipText("Codigo");
		this.jLabelcodigoTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCostoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCostoDefinicion.setToolTipText(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCostoDefinicion = new GridBagLayout();
		this.jPanelcodigoTipoCostoDefinicion.setLayout(this.gridaBagLayoutTipoCostoDefinicion);


		jTextFieldcodigoTipoCostoDefinicion= new JTextFieldMe();

		jTextFieldcodigoTipoCostoDefinicion.setEnabled(false);
		jTextFieldcodigoTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCostoDefinicionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCostoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCostoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCostoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCostoDefinicionBusqueda.setText("U");
		this.jButtoncodigoTipoCostoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCostoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCostoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCostoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCostoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCostoDefinicionBusqueda"));

		if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCostoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCostoDefinicion = new JLabelMe();
		this.jLabelnombreTipoCostoDefinicion.setText(""+TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCostoDefinicion.setToolTipText("Nombre");
		this.jLabelnombreTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCostoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCostoDefinicion.setToolTipText(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCostoDefinicion = new GridBagLayout();
		this.jPanelnombreTipoCostoDefinicion.setLayout(this.gridaBagLayoutTipoCostoDefinicion);


		jTextFieldnombreTipoCostoDefinicion= new JTextFieldMe();

		jTextFieldnombreTipoCostoDefinicion.setEnabled(false);
		jTextFieldnombreTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoCostoDefinicionBusqueda= new JButtonMe();
		this.jButtonnombreTipoCostoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCostoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCostoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCostoDefinicionBusqueda.setText("U");
		this.jButtonnombreTipoCostoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCostoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCostoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoCostoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoCostoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCostoDefinicionBusqueda"));

		if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCostoDefinicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCostoDefinicion() {
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
		//this.jInternalFrameDetalleTipoCostoDefinicion = new TipoCostoDefinicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Costo Definicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCostoDefinicion= new GridBagLayout();
		

		
		String sToolTipTipoCostoDefinicion="";
		sToolTipTipoCostoDefinicion=TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCostoDefinicion+="(Inventario.TipoCostoDefinicion)";
		}
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCostoDefinicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCostoDefinicion = new JButtonMe();
		this.jButtonModificarTipoCostoDefinicion = new JButtonMe();
        this.jButtonActualizarTipoCostoDefinicion = new JButtonMe();
        this.jButtonEliminarTipoCostoDefinicion = new JButtonMe();
        this.jButtonCancelarTipoCostoDefinicion = new JButtonMe();
        this.jButtonGuardarCambiosTipoCostoDefinicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion = new JButtonMe();
		this.jButtonCerrarTipoCostoDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoCostoDefinicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCostoDefinicion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCostoDefinicion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo Definicion";
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCostoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCostoDefinicion.setName("jPanelCamposTipoCostoDefinicion"); 

		this.jPanelCamposOcultosTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCostoDefinicion.setName("jPanelCamposOcultosTipoCostoDefinicion"); 

        this.jPanelAccionesTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCostoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoCostoDefinicion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCostoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCostoDefinicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCostoDefinicion.setText("Nuevo");
		this.jButtonModificarTipoCostoDefinicion.setText("Editar");
        this.jButtonActualizarTipoCostoDefinicion.setText("Actualizar");
        this.jButtonEliminarTipoCostoDefinicion.setText("Eliminar");
        this.jButtonCancelarTipoCostoDefinicion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCostoDefinicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.setText("Guardar");
		this.jButtonCerrarTipoCostoDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCostoDefinicion,"nuevo_button","Nuevo",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCostoDefinicion,"modificar_button","Editar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCostoDefinicion,"actualizar_button","Actualizar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCostoDefinicion,"eliminar_button","Eliminar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCostoDefinicion,"cancelar_button","Cancelar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCostoDefinicion,"guardarcambios_button","Guardar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCostoDefinicion,"guardarcambiostabla_button","Guardar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCostoDefinicion,"cerrar_button","Salir",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCostoDefinicion.setToolTipText("Nuevo"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCostoDefinicion.setToolTipText("Editar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCostoDefinicion.setToolTipText("Actualizar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCostoDefinicion.setToolTipText("Eliminar)"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCostoDefinicion.setToolTipText("Cancelar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCostoDefinicion.setToolTipText("Guardar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.setToolTipText("Guardar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCostoDefinicion.setToolTipText("Salir"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCostoDefinicion";
		inputMap = this.jButtonNuevoTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCostoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCostoDefinicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCostoDefinicion";
		inputMap = this.jButtonActualizarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCostoDefinicion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCostoDefinicion";
		inputMap = this.jButtonEliminarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCostoDefinicion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCostoDefinicion";
		inputMap = this.jButtonCancelarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCostoDefinicion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCostoDefinicion";
		inputMap = this.jButtonCerrarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCostoDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCostoDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCostoDefinicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCostoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCostoDefinicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCostoDefinicion.setToolTipText("Nuevo TipoCostoDefinicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion.setToolTipText("Sin Cerrar Ventana TipoCostoDefinicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCostoDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCostoDefinicion = new JLabelMe();
		
		this.jLabelAccionesTipoCostoDefinicion.setText("Acciones");		
		this.jLabelAccionesTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCostoDefinicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCostoDefinicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCostoDefinicion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCostoDefinicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCostoDefinicion = new GridBagLayout();
		
		this.jPanelCamposTipoCostoDefinicion.setLayout(gridaBagLayoutCamposTipoCostoDefinicion);
		this.jPanelCamposOcultosTipoCostoDefinicion.setLayout(gridaBagLayoutCamposOcultosTipoCostoDefinicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCostoDefinicion.add(jLabelIdTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);



	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCostoDefinicion.add(jTextFieldidTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);


	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCostoDefinicion.add(jLabelcodigoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 2;
		this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
		this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCostoDefinicion.add(jButtoncodigoTipoCostoDefinicionBusqueda, this.gridBagConstraintsTipoCostoDefinicion);
	}

	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCostoDefinicion.add(jTextFieldcodigoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);


	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCostoDefinicion.add(jLabelnombreTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 2;
		this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
		this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCostoDefinicion.add(jButtonnombreTipoCostoDefinicionBusqueda, this.gridBagConstraintsTipoCostoDefinicion);
	}

	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = 1;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCostoDefinicion.add(jTextFieldnombreTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = iYPanelCamposTipoCostoDefinicion;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = iXPanelCamposTipoCostoDefinicion++;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCostoDefinicion.add(this.jPanelidTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);



	if(iXPanelCamposTipoCostoDefinicion % 1==0) {
		iXPanelCamposTipoCostoDefinicion=0;
		iYPanelCamposTipoCostoDefinicion++;
	}
	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = iYPanelCamposTipoCostoDefinicion;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = iXPanelCamposTipoCostoDefinicion++;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCostoDefinicion.add(this.jPanelcodigoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);



	if(iXPanelCamposTipoCostoDefinicion % 1==0) {
		iXPanelCamposTipoCostoDefinicion=0;
		iYPanelCamposTipoCostoDefinicion++;
	}
	this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCostoDefinicion.gridy = iYPanelCamposTipoCostoDefinicion;
	this.gridBagConstraintsTipoCostoDefinicion.gridx = iXPanelCamposTipoCostoDefinicion++;
	this.gridBagConstraintsTipoCostoDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCostoDefinicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCostoDefinicion.add(this.jPanelnombreTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);



	if(iXPanelCamposTipoCostoDefinicion % 1==0) {
		iXPanelCamposTipoCostoDefinicion=0;
		iYPanelCamposTipoCostoDefinicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCostoDefinicion= new GridBagLayout();
		this.jPanelAccionesTipoCostoDefinicion.setLayout(gridaBagLayoutAccionesTipoCostoDefinicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCostoDefinicion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCostoDefinicion.setLayout(gridaBagLayoutAccionesFormularioTipoCostoDefinicion);
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCostoDefinicion.add(this.jComboBoxTiposAccionesFormularioTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);

		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCostoDefinicion.add(this.jCheckBoxPostAccionNuevoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCostoDefinicion.add(this.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCostoDefinicion.add(this.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCostoDefinicion.add(this.jButtonModificarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);							

		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCostoDefinicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCostoDefinicion.add(this.jButtonEliminarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
			
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCostoDefinicion.add(this.jButtonActualizarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);


		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCostoDefinicion.add(this.jButtonGuardarCambiosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);	
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCostoDefinicion.add(this.jButtonCancelarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCostoDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCostoDefinicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;		
			//this.gridBagConstraintsTipoCostoDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCostoDefinicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCostoDefinicion.gridx =0;
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCostoDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCostoDefinicion = new TipoCostoDefinicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Costo Definicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Costo Definicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Definicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCostoDefinicionModel tipocostodefinicionModel=new TipoCostoDefinicionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCostoDefinicionModel.TipoCostoDefinicionFocusTraversalPolicy tipocostodefinicionFocusTraversalPolicy = tipocostodefinicionModel.new TipoCostoDefinicionFocusTraversalPolicy(this);
			
			//tipocostodefinicionFocusTraversalPolicy.settipocostodefinicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocostodefinicionModel);
			
			
			this.jContentPaneDetalleTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCostoDefinicion = new GridBagLayout();	
			this.jContentPaneDetalleTipoCostoDefinicion.setLayout(gridaBagLayoutDetalleTipoCostoDefinicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCostoDefinicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCostoDefinicion.add(jTtoolBarDetalleTipoCostoDefinicion, gridBagConstraintsTipoCostoDefinicion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCostoDefinicion=   new JScrollPane(jContentPaneDetalleTipoCostoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCostoDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
	        
			this.jContentPaneDetalleTipoCostoDefinicion.add(jPanelCamposTipoCostoDefinicion, gridBagConstraintsTipoCostoDefinicion);
			
			
			
			
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
						&& tipocostodefinicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					
					if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCostoDefinicion= new GridBagConstraints();
						this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
						this.jContentPaneDetalleTipoCostoDefinicion.add(this.jTabbedPaneRelacionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCostoDefinicion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCostoDefinicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
					this.gridBagConstraintsTipoCostoDefinicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCostoDefinicion.add(jPanelCamposOcultosTipoCostoDefinicion, gridBagConstraintsTipoCostoDefinicion);
				
					this.jPanelCamposOcultosTipoCostoDefinicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
	        this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCostoDefinicion.add(this.jPanelAccionesFormularioTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);							
			
			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
	        this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCostoDefinicion.add(this.jPanelAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCostoDefinicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCostoDefinicion=   new JScrollPane(this.jPanelCamposTipoCostoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCostoDefinicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
			
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
			
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCostoDefinicion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCostoDefinicion;
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

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
				//this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
				//this.jContentPaneDetalleTipoCostoDefinicion.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCostoDefinicion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCostoDefinicion.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCostoDefinicion.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesTipoCostoDefinicion.add("Definiciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDefinicionBeanSwingJInternalFrame(List<TipoCostoDefinicion> tipocostodefinicions,TipoCostoDefinicion tipocostodefinicion,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.tipocostodefinicionLogic.getConnexion());

					definicionBeanSwingJInternalFrame.settipocostodefinicionsForeignKey(tipocostodefinicions);
					definicionBeanSwingJInternalFrame.settipocostodefinicionForeignKey(tipocostodefinicion);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoCostoDefinicion(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidTipoCostoDefinicionActual(tipocostodefinicion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCostoDefinicion(true);
					definicionBeanSwingJInternalFrame.setid_tipo_costo_definicionFK_IdTipoCostoDefinicion(tipocostodefinicion.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCostoDefinicionForeignKey(tipocostodefinicion,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCostoDefinicion");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCostoDefinicion");
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
