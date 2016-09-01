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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoGlobalClienteConstantesFunciones;

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
public class TipoGlobalClienteDetalleFormJInternalFrame extends TipoGlobalClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGlobalCliente;
	
	protected JMenuBar jmenuBarDetalleTipoGlobalCliente;
	
	protected JMenu jmenuDetalleTipoGlobalCliente;
	protected JMenu jmenuDetalleArchivoTipoGlobalCliente;
	protected JMenu jmenuDetalleAccionesTipoGlobalCliente;
	protected JMenu jmenuDetalleDatosTipoGlobalCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGlobalCliente;	
	protected GridBagConstraints gridBagConstraintsTipoGlobalCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGlobalClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGlobalCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGlobalClienteSessionBean tipoglobalclienteSessionBean;
	
	

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
		
	
	public TipoGlobalClienteLogic tipoglobalclienteLogic;
	
	public JScrollPane jScrollPanelDatosTipoGlobalCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoGlobalCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoGlobalCliente;
	
	protected JPanel jPanelCamposTipoGlobalCliente;    
	protected JPanel jPanelCamposOcultosTipoGlobalCliente;    	
	protected JPanel jPanelAccionesTipoGlobalCliente;
	protected JPanel jPanelAccionesFormularioTipoGlobalCliente;
    
	
	
	protected Integer iXPanelCamposTipoGlobalCliente=0;
	protected Integer iYPanelCamposTipoGlobalCliente=0;
	
	protected Integer iXPanelCamposOcultosTipoGlobalCliente=0;
	protected Integer iYPanelCamposOcultosTipoGlobalCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGlobalCliente;
	public JButton jButtonModificarTipoGlobalCliente;
	public JButton jButtonActualizarTipoGlobalCliente;
    public JButton jButtonEliminarTipoGlobalCliente;
	public JButton jButtonCancelarTipoGlobalCliente;
    public JButton jButtonGuardarCambiosTipoGlobalCliente;
	public JButton jButtonGuardarCambiosTablaTipoGlobalCliente;
	protected JButton jButtonCerrarTipoGlobalCliente;
	
	
	protected JButton jButtonProcesarInformacionTipoGlobalCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGlobalCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGlobalCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGlobalCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGlobalCliente;
	protected JButton jButtonModificarToolBarTipoGlobalCliente;
	protected JButton jButtonActualizarToolBarTipoGlobalCliente;
    protected JButton jButtonEliminarToolBarTipoGlobalCliente;
	protected JButton jButtonCancelarToolBarTipoGlobalCliente;
    protected JButton jButtonGuardarCambiosToolBarTipoGlobalCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGlobalCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGlobalCliente;
	protected JButton jButtonCerrarToolBarTipoGlobalCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGlobalCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGlobalCliente;
	protected JMenuItem jMenuItemModificarTipoGlobalCliente;
	protected JMenuItem jMenuItemActualizarTipoGlobalCliente;
    protected JMenuItem jMenuItemEliminarTipoGlobalCliente;
	protected JMenuItem jMenuItemCancelarTipoGlobalCliente;
    protected JMenuItem jMenuItemGuardarCambiosTipoGlobalCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGlobalCliente;
	protected JMenuItem jMenuItemCerrarTipoGlobalCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoGlobalCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGlobalCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGlobalCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGlobalCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoGlobalCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGlobalCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGlobalCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGlobalCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGlobalCliente;
	public JLabel jLabelIdTipoGlobalCliente;
	public JTextFieldMe jTextFieldidTipoGlobalCliente;
	public JButton jButtonidTipoGlobalClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoGlobalCliente;
	public JLabel jLabelcodigoTipoGlobalCliente;
	public JTextField jTextFieldcodigoTipoGlobalCliente;
	public JButton jButtoncodigoTipoGlobalClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGlobalCliente;
	public JLabel jLabelnombreTipoGlobalCliente;
	public JTextField jTextFieldnombreTipoGlobalCliente;
	public JButton jButtonnombreTipoGlobalClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGlobalCliente;
	
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
	
	public TipoGlobalClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGlobalCliente=new JPanel();
				this.jPanelAccionesFormularioTipoGlobalCliente=new JPanel();
				this.jmenuBarDetalleTipoGlobalCliente=new JMenuBar();
				this.jTtoolBarDetalleTipoGlobalCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGlobalClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGlobalCliente() {
		return this.jButtonActualizarToolBarTipoGlobalCliente;
	}
	
	public JButton getjButtonEliminarToolBarTipoGlobalCliente() {
		return this.jButtonEliminarToolBarTipoGlobalCliente;
	}
	
	public JButton getjButtonCancelarToolBarTipoGlobalCliente() {
		return this.jButtonCancelarToolBarTipoGlobalCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGlobalCliente() {
		return this.jButtonProcesarInformacionTipoGlobalCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGlobalCliente)	{
		this.jButtonProcesarInformacionTipoGlobalCliente = jButtonProcesarInformacionTipoGlobalCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGlobalCliente() {
		return this.jComboBoxTiposAccionesTipoGlobalCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGlobalCliente(
			JComboBox jComboBoxTiposRelacionesTipoGlobalCliente) {
		this.jComboBoxTiposRelacionesTipoGlobalCliente = jComboBoxTiposRelacionesTipoGlobalCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGlobalCliente(
			JComboBox jComboBoxTiposAccionesTipoGlobalCliente) {
		this.jComboBoxTiposAccionesTipoGlobalCliente = jComboBoxTiposAccionesTipoGlobalCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGlobalCliente() {
		return this.jComboBoxTiposAccionesFormularioTipoGlobalCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGlobalCliente(
			JComboBox jComboBoxTiposAccionesFormularioTipoGlobalCliente) {
		this.jComboBoxTiposAccionesFormularioTipoGlobalCliente = jComboBoxTiposAccionesFormularioTipoGlobalCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
		
		this.tipoglobalclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoglobalclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoglobalclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGlobalClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Global Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGlobalClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGlobalCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGlobalCliente=new JButtonMe();
				this.jButtonModificarToolBarTipoGlobalCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGlobalCliente,this.jTtoolBarDetalleTipoGlobalCliente,
							"actualizar","actualizar","Actualizar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGlobalCliente,this.jTtoolBarDetalleTipoGlobalCliente,
							"eliminar","eliminar","Eliminar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGlobalCliente,this.jTtoolBarDetalleTipoGlobalCliente,
							"cancelar","cancelar","Cancelar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGlobalCliente,this.jTtoolBarDetalleTipoGlobalCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGlobalCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGlobalCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGlobalCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGlobalCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGlobalCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGlobalCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGlobalCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGlobalCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGlobalCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGlobalCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGlobalCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGlobalCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGlobalCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGlobalCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGlobalCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGlobalCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGlobalCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGlobalCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGlobalCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGlobalCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGlobalCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGlobalCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGlobalCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGlobalCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGlobalCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGlobalCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGlobalCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGlobalCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGlobalCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGlobalCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGlobalCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGlobalCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGlobalCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGlobalCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGlobalCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGlobalCliente.add(this.jMenuItemDetalleCerrarTipoGlobalCliente);
		
		this.jmenuDetalleAccionesTipoGlobalCliente.add(this.jMenuItemActualizarTipoGlobalCliente);
		this.jmenuDetalleAccionesTipoGlobalCliente.add(this.jMenuItemEliminarTipoGlobalCliente);
		this.jmenuDetalleAccionesTipoGlobalCliente.add(this.jMenuItemCancelarTipoGlobalCliente);		
		
		//this.jmenuDetalleDatosTipoGlobalCliente.add(this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente);				
		this.jmenuDetalleDatosTipoGlobalCliente.add(this.jMenuItemDetalleMostarOcultarTipoGlobalCliente);				
				
		//this.jmenuDetalleAccionesTipoGlobalCliente.add(this.jMenuItemGuardarCambiosTipoGlobalCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGlobalCliente.add(this.jmenuDetalleArchivoTipoGlobalCliente);		
		this.jmenuBarDetalleTipoGlobalCliente.add(this.jmenuDetalleAccionesTipoGlobalCliente);		
		this.jmenuBarDetalleTipoGlobalCliente.add(this.jmenuDetalleDatosTipoGlobalCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoGlobalCliente.add(this.jmenuDetalleTipoGlobalCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGlobalCliente);				
	}
	
	
	public void inicializarElementosCamposTipoGlobalCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGlobalCliente = new JLabelMe();
		jLabelIdTipoGlobalCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGlobalCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGlobalCliente.setToolTipText(TipoGlobalClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGlobalCliente= new GridBagLayout();

		this.jPanelidTipoGlobalCliente.setLayout(this.gridaBagLayoutTipoGlobalCliente);

		jTextFieldidTipoGlobalCliente = new JTextFieldMe();
		jTextFieldidTipoGlobalCliente.setText("Id");

		jTextFieldidTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoGlobalCliente = new JLabelMe();
		this.jLabelcodigoTipoGlobalCliente.setText(""+TipoGlobalClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoGlobalCliente.setToolTipText("Codigo");
		this.jLabelcodigoTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoGlobalCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoGlobalCliente.setToolTipText(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoGlobalCliente = new GridBagLayout();
		this.jPanelcodigoTipoGlobalCliente.setLayout(this.gridaBagLayoutTipoGlobalCliente);


		jTextFieldcodigoTipoGlobalCliente= new JTextFieldMe();

		jTextFieldcodigoTipoGlobalCliente.setEnabled(false);
		jTextFieldcodigoTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoGlobalClienteBusqueda= new JButtonMe();
		this.jButtoncodigoTipoGlobalClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGlobalClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGlobalClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoGlobalClienteBusqueda.setText("U");
		this.jButtoncodigoTipoGlobalClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoGlobalClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoGlobalClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoGlobalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoGlobalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoGlobalClienteBusqueda"));

		if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoGlobalClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoGlobalCliente = new JLabelMe();
		this.jLabelnombreTipoGlobalCliente.setText(""+TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGlobalCliente.setToolTipText("Nombre");
		this.jLabelnombreTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGlobalCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGlobalCliente.setToolTipText(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGlobalCliente = new GridBagLayout();
		this.jPanelnombreTipoGlobalCliente.setLayout(this.gridaBagLayoutTipoGlobalCliente);


		jTextFieldnombreTipoGlobalCliente= new JTextFieldMe();

		jTextFieldnombreTipoGlobalCliente.setEnabled(false);
		jTextFieldnombreTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoGlobalClienteBusqueda= new JButtonMe();
		this.jButtonnombreTipoGlobalClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGlobalClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGlobalClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGlobalClienteBusqueda.setText("U");
		this.jButtonnombreTipoGlobalClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGlobalClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGlobalClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoGlobalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoGlobalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGlobalClienteBusqueda"));

		if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGlobalClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGlobalCliente() {
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
		//this.jInternalFrameDetalleTipoGlobalCliente = new TipoGlobalClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Global Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGlobalCliente= new GridBagLayout();
		

		
		String sToolTipTipoGlobalCliente="";
		sToolTipTipoGlobalCliente=TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGlobalCliente+="(Cartera.TipoGlobalCliente)";
		}
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGlobalCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGlobalCliente = new JButtonMe();
		this.jButtonModificarTipoGlobalCliente = new JButtonMe();
        this.jButtonActualizarTipoGlobalCliente = new JButtonMe();
        this.jButtonEliminarTipoGlobalCliente = new JButtonMe();
        this.jButtonCancelarTipoGlobalCliente = new JButtonMe();
        this.jButtonGuardarCambiosTipoGlobalCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGlobalCliente = new JButtonMe();
		this.jButtonCerrarTipoGlobalCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoGlobalCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGlobalCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGlobalCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Global Cliente";
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Global Clientees" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGlobalCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGlobalCliente.setName("jPanelCamposTipoGlobalCliente"); 

		this.jPanelCamposOcultosTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGlobalCliente.setName("jPanelCamposOcultosTipoGlobalCliente"); 

        this.jPanelAccionesTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGlobalCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoGlobalCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGlobalCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGlobalCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGlobalCliente.setText("Nuevo");
		this.jButtonModificarTipoGlobalCliente.setText("Editar");
        this.jButtonActualizarTipoGlobalCliente.setText("Actualizar");
        this.jButtonEliminarTipoGlobalCliente.setText("Eliminar");
        this.jButtonCancelarTipoGlobalCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGlobalCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.setText("Guardar");
		this.jButtonCerrarTipoGlobalCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGlobalCliente,"nuevo_button","Nuevo",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGlobalCliente,"modificar_button","Editar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGlobalCliente,"actualizar_button","Actualizar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGlobalCliente,"eliminar_button","Eliminar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGlobalCliente,"cancelar_button","Cancelar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGlobalCliente,"guardarcambios_button","Guardar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGlobalCliente,"guardarcambiostabla_button","Guardar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGlobalCliente,"cerrar_button","Salir",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGlobalCliente.setToolTipText("Nuevo"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGlobalCliente.setToolTipText("Editar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGlobalCliente.setToolTipText("Actualizar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGlobalCliente.setToolTipText("Eliminar)"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGlobalCliente.setToolTipText("Cancelar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGlobalCliente.setToolTipText("Guardar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.setToolTipText("Guardar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGlobalCliente.setToolTipText("Salir"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGlobalCliente";
		inputMap = this.jButtonNuevoTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGlobalCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGlobalCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGlobalCliente";
		inputMap = this.jButtonActualizarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGlobalCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGlobalCliente";
		inputMap = this.jButtonEliminarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGlobalCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGlobalCliente";
		inputMap = this.jButtonCancelarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGlobalCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGlobalCliente";
		inputMap = this.jButtonCerrarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGlobalCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGlobalCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGlobalCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGlobalCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGlobalCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGlobalCliente.setToolTipText("Nuevo TipoGlobalCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGlobalCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGlobalCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGlobalCliente.setToolTipText("Sin Cerrar Ventana TipoGlobalCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGlobalCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGlobalCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGlobalCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGlobalCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoGlobalCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGlobalCliente = new JLabelMe();
		
		this.jLabelAccionesTipoGlobalCliente.setText("Acciones");		
		this.jLabelAccionesTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGlobalCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGlobalCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGlobalCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGlobalCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGlobalCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGlobalCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGlobalCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGlobalCliente = new GridBagLayout();
		
		this.jPanelCamposTipoGlobalCliente.setLayout(gridaBagLayoutCamposTipoGlobalCliente);
		this.jPanelCamposOcultosTipoGlobalCliente.setLayout(gridaBagLayoutCamposOcultosTipoGlobalCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
	this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGlobalCliente.add(jLabelIdTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);



	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
	this.gridBagConstraintsTipoGlobalCliente.gridx = 1;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGlobalCliente.add(jTextFieldidTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);


	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
	this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoGlobalCliente.add(jLabelcodigoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
		this.gridBagConstraintsTipoGlobalCliente.gridx = 2;
		this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
		this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoGlobalCliente.add(jButtoncodigoTipoGlobalClienteBusqueda, this.gridBagConstraintsTipoGlobalCliente);
	}

	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
	this.gridBagConstraintsTipoGlobalCliente.gridx = 1;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoGlobalCliente.add(jTextFieldcodigoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);


	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
	this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGlobalCliente.add(jLabelnombreTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
		this.gridBagConstraintsTipoGlobalCliente.gridx = 2;
		this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
		this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGlobalCliente.add(jButtonnombreTipoGlobalClienteBusqueda, this.gridBagConstraintsTipoGlobalCliente);
	}

	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
	this.gridBagConstraintsTipoGlobalCliente.gridx = 1;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGlobalCliente.add(jTextFieldnombreTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGlobalCliente.gridy = iYPanelCamposTipoGlobalCliente;
	this.gridBagConstraintsTipoGlobalCliente.gridx = iXPanelCamposTipoGlobalCliente++;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGlobalCliente.add(this.jPanelidTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);



	if(iXPanelCamposTipoGlobalCliente % 1==0) {
		iXPanelCamposTipoGlobalCliente=0;
		iYPanelCamposTipoGlobalCliente++;
	}
	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGlobalCliente.gridy = iYPanelCamposTipoGlobalCliente;
	this.gridBagConstraintsTipoGlobalCliente.gridx = iXPanelCamposTipoGlobalCliente++;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGlobalCliente.add(this.jPanelcodigoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);



	if(iXPanelCamposTipoGlobalCliente % 1==0) {
		iXPanelCamposTipoGlobalCliente=0;
		iYPanelCamposTipoGlobalCliente++;
	}
	this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGlobalCliente.gridy = iYPanelCamposTipoGlobalCliente;
	this.gridBagConstraintsTipoGlobalCliente.gridx = iXPanelCamposTipoGlobalCliente++;
	this.gridBagConstraintsTipoGlobalCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGlobalCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGlobalCliente.add(this.jPanelnombreTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);



	if(iXPanelCamposTipoGlobalCliente % 1==0) {
		iXPanelCamposTipoGlobalCliente=0;
		iYPanelCamposTipoGlobalCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGlobalCliente= new GridBagLayout();
		this.jPanelAccionesTipoGlobalCliente.setLayout(gridaBagLayoutAccionesTipoGlobalCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGlobalCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGlobalCliente.setLayout(gridaBagLayoutAccionesFormularioTipoGlobalCliente);
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGlobalCliente.add(this.jComboBoxTiposAccionesFormularioTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);

		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGlobalCliente.add(this.jCheckBoxPostAccionNuevoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGlobalCliente.add(this.jCheckBoxPostAccionSinCerrarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGlobalCliente.add(this.jCheckBoxPostAccionSinMensajeTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGlobalCliente.add(this.jButtonModificarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);							

		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
		this.gridBagConstraintsTipoGlobalCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGlobalCliente.add(this.jButtonEliminarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
			
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGlobalCliente.add(this.jButtonActualizarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);


		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGlobalCliente.add(this.jButtonGuardarCambiosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);	
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;		
		this.gridBagConstraintsTipoGlobalCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGlobalCliente.add(this.jButtonCancelarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGlobalCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGlobalCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGlobalCliente.gridx = 0;		
			//this.gridBagConstraintsTipoGlobalCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGlobalCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGlobalCliente.gridx =0;
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGlobalCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGlobalCliente = new TipoGlobalClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Global Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Global Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Global Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGlobalClienteModel tipoglobalclienteModel=new TipoGlobalClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGlobalClienteModel.TipoGlobalClienteFocusTraversalPolicy tipoglobalclienteFocusTraversalPolicy = tipoglobalclienteModel.new TipoGlobalClienteFocusTraversalPolicy(this);
			
			//tipoglobalclienteFocusTraversalPolicy.settipoglobalclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoglobalclienteModel);
			
			
			this.jContentPaneDetalleTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGlobalCliente = new GridBagLayout();	
			this.jContentPaneDetalleTipoGlobalCliente.setLayout(gridaBagLayoutDetalleTipoGlobalCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGlobalCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGlobalCliente.add(jTtoolBarDetalleTipoGlobalCliente, gridBagConstraintsTipoGlobalCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGlobalCliente=   new JScrollPane(jContentPaneDetalleTipoGlobalCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGlobalCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGlobalCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGlobalCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGlobalCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGlobalCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGlobalCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGlobalCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
	        
			this.jContentPaneDetalleTipoGlobalCliente.add(jPanelCamposTipoGlobalCliente, gridBagConstraintsTipoGlobalCliente);
			
			
			
			
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
						&& tipoglobalclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					
					if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGlobalCliente= new GridBagConstraints();
						this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
						this.jContentPaneDetalleTipoGlobalCliente.add(this.jTabbedPaneRelacionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGlobalCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGlobalCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
					this.gridBagConstraintsTipoGlobalCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGlobalCliente.add(jPanelCamposOcultosTipoGlobalCliente, gridBagConstraintsTipoGlobalCliente);
				
					this.jPanelCamposOcultosTipoGlobalCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
	        this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGlobalCliente.add(this.jPanelAccionesFormularioTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);							
			
			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
	        this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGlobalCliente.add(this.jPanelAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGlobalCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGlobalCliente=   new JScrollPane(this.jPanelCamposTipoGlobalCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGlobalCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGlobalCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGlobalCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGlobalCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
			
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
			
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGlobalCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGlobalCliente;
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

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
				//this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
				//this.jContentPaneDetalleTipoGlobalCliente.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGlobalCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGlobalCliente.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGlobalCliente.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesTipoGlobalCliente.add("Definiciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDefinicionBeanSwingJInternalFrame(List<TipoGlobalCliente> tipoglobalclientes,TipoGlobalCliente tipoglobalcliente,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.tipoglobalclienteLogic.getConnexion());

					definicionBeanSwingJInternalFrame.settipoglobalclientesForeignKey(tipoglobalclientes);
					definicionBeanSwingJInternalFrame.settipoglobalclienteForeignKey(tipoglobalcliente);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoGlobalCliente(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidTipoGlobalClienteActual(tipoglobalcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGlobalCliente(true);
					definicionBeanSwingJInternalFrame.setid_tipo_global_clienteFK_IdTipoGlobalCliente(tipoglobalcliente.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGlobalClienteForeignKey(tipoglobalcliente,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGlobalCliente");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGlobalCliente");
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
