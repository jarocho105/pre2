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
import com.bydan.erp.inventario.util.TipoIvaItemConstantesFunciones;

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
public class TipoIvaItemDetalleFormJInternalFrame extends TipoIvaItemBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoIvaItem;
	
	protected JMenuBar jmenuBarDetalleTipoIvaItem;
	
	protected JMenu jmenuDetalleTipoIvaItem;
	protected JMenu jmenuDetalleArchivoTipoIvaItem;
	protected JMenu jmenuDetalleAccionesTipoIvaItem;
	protected JMenu jmenuDetalleDatosTipoIvaItem;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIvaItem;	
	protected GridBagConstraints gridBagConstraintsTipoIvaItem;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoIvaItemBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoIvaItem;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIvaItemSessionBean tipoivaitemSessionBean;
	
	

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
		
	
	public TipoIvaItemLogic tipoivaitemLogic;
	
	public JScrollPane jScrollPanelDatosTipoIvaItem;
	public JScrollPane jScrollPanelDatosEdicionTipoIvaItem;
	public JScrollPane jScrollPanelDatosGeneralTipoIvaItem;
	
	protected JPanel jPanelCamposTipoIvaItem;    
	protected JPanel jPanelCamposOcultosTipoIvaItem;    	
	protected JPanel jPanelAccionesTipoIvaItem;
	protected JPanel jPanelAccionesFormularioTipoIvaItem;
    
	
	
	protected Integer iXPanelCamposTipoIvaItem=0;
	protected Integer iYPanelCamposTipoIvaItem=0;
	
	protected Integer iXPanelCamposOcultosTipoIvaItem=0;
	protected Integer iYPanelCamposOcultosTipoIvaItem=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoIvaItem;
	public JButton jButtonModificarTipoIvaItem;
	public JButton jButtonActualizarTipoIvaItem;
    public JButton jButtonEliminarTipoIvaItem;
	public JButton jButtonCancelarTipoIvaItem;
    public JButton jButtonGuardarCambiosTipoIvaItem;
	public JButton jButtonGuardarCambiosTablaTipoIvaItem;
	protected JButton jButtonCerrarTipoIvaItem;
	
	
	protected JButton jButtonProcesarInformacionTipoIvaItem;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoIvaItem;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoIvaItem;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoIvaItem;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIvaItem;
	protected JButton jButtonModificarToolBarTipoIvaItem;
	protected JButton jButtonActualizarToolBarTipoIvaItem;
    protected JButton jButtonEliminarToolBarTipoIvaItem;
	protected JButton jButtonCancelarToolBarTipoIvaItem;
    protected JButton jButtonGuardarCambiosToolBarTipoIvaItem;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoIvaItem;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIvaItem;
	protected JButton jButtonCerrarToolBarTipoIvaItem;
	
	protected JButton jButtonProcesarInformacionToolBarTipoIvaItem;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIvaItem;
	protected JMenuItem jMenuItemModificarTipoIvaItem;
	protected JMenuItem jMenuItemActualizarTipoIvaItem;
    protected JMenuItem jMenuItemEliminarTipoIvaItem;
	protected JMenuItem jMenuItemCancelarTipoIvaItem;
    protected JMenuItem jMenuItemGuardarCambiosTipoIvaItem;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIvaItem;
	protected JMenuItem jMenuItemCerrarTipoIvaItem;
	protected JMenuItem jMenuItemDetalleCerrarTipoIvaItem;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIvaItem;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoIvaItem;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIvaItem;
	protected JMenuItem jMenuItemMostrarOcultarTipoIvaItem;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIvaItem;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIvaItem;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIvaItem;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoIvaItem;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoIvaItem;
	public JLabel jLabelIdTipoIvaItem;
	public JTextFieldMe jTextFieldidTipoIvaItem;
	public JButton jButtonidTipoIvaItemBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoIvaItem;
	public JLabel jLabelcodigoTipoIvaItem;
	public JTextField jTextFieldcodigoTipoIvaItem;
	public JButton jButtoncodigoTipoIvaItemBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoIvaItem;
	public JLabel jLabelnombreTipoIvaItem;
	public JTextField jTextFieldnombreTipoIvaItem;
	public JButton jButtonnombreTipoIvaItemBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoIvaItem;
	
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
	
	public TipoIvaItemDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoIvaItem=new JPanel();
				this.jPanelAccionesFormularioTipoIvaItem=new JPanel();
				this.jmenuBarDetalleTipoIvaItem=new JMenuBar();
				this.jTtoolBarDetalleTipoIvaItem=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoIvaItemDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoIvaItem() {
		return this.jButtonActualizarToolBarTipoIvaItem;
	}
	
	public JButton getjButtonEliminarToolBarTipoIvaItem() {
		return this.jButtonEliminarToolBarTipoIvaItem;
	}
	
	public JButton getjButtonCancelarToolBarTipoIvaItem() {
		return this.jButtonCancelarToolBarTipoIvaItem;
	}		
	
	public JButton getjButtonProcesarInformacionTipoIvaItem() {
		return this.jButtonProcesarInformacionTipoIvaItem;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIvaItem)	{
		this.jButtonProcesarInformacionTipoIvaItem = jButtonProcesarInformacionTipoIvaItem;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIvaItem() {
		return this.jComboBoxTiposAccionesTipoIvaItem;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIvaItem(
			JComboBox jComboBoxTiposRelacionesTipoIvaItem) {
		this.jComboBoxTiposRelacionesTipoIvaItem = jComboBoxTiposRelacionesTipoIvaItem;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIvaItem(
			JComboBox jComboBoxTiposAccionesTipoIvaItem) {
		this.jComboBoxTiposAccionesTipoIvaItem = jComboBoxTiposAccionesTipoIvaItem;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoIvaItem() {
		return this.jComboBoxTiposAccionesFormularioTipoIvaItem;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoIvaItem(
			JComboBox jComboBoxTiposAccionesFormularioTipoIvaItem) {
		this.jComboBoxTiposAccionesFormularioTipoIvaItem = jComboBoxTiposAccionesFormularioTipoIvaItem;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
		
		this.tipoivaitemSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoivaitemSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoivaitemSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIvaItemJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Iva Item MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoIvaItemJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoIvaItem= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoIvaItem=new JButtonMe();
				this.jButtonModificarToolBarTipoIvaItem=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoIvaItem,this.jTtoolBarDetalleTipoIvaItem,
							"actualizar","actualizar","Actualizar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoIvaItem,this.jTtoolBarDetalleTipoIvaItem,
							"eliminar","eliminar","Eliminar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoIvaItem,this.jTtoolBarDetalleTipoIvaItem,
							"cancelar","cancelar","Cancelar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoIvaItem,this.jTtoolBarDetalleTipoIvaItem,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoIvaItem=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoIvaItem=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoIvaItem=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoIvaItem=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoIvaItem=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIvaItem= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIvaItem.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIvaItem,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoIvaItem= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoIvaItem.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoIvaItem,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoIvaItem= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoIvaItem.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoIvaItem,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoIvaItem= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoIvaItem.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoIvaItem,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoIvaItem= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoIvaItem.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoIvaItem,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoIvaItem= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIvaItem.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIvaItem,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIvaItem= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIvaItem.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIvaItem,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoIvaItem= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoIvaItem.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoIvaItem,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIvaItem= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIvaItem.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIvaItem,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIvaItem= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIvaItem.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIvaItem,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoIvaItem.add(this.jMenuItemDetalleCerrarTipoIvaItem);
		
		this.jmenuDetalleAccionesTipoIvaItem.add(this.jMenuItemActualizarTipoIvaItem);
		this.jmenuDetalleAccionesTipoIvaItem.add(this.jMenuItemEliminarTipoIvaItem);
		this.jmenuDetalleAccionesTipoIvaItem.add(this.jMenuItemCancelarTipoIvaItem);		
		
		//this.jmenuDetalleDatosTipoIvaItem.add(this.jMenuItemDetalleAbrirOrderByTipoIvaItem);				
		this.jmenuDetalleDatosTipoIvaItem.add(this.jMenuItemDetalleMostarOcultarTipoIvaItem);				
				
		//this.jmenuDetalleAccionesTipoIvaItem.add(this.jMenuItemGuardarCambiosTipoIvaItem);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoIvaItem.add(this.jmenuDetalleArchivoTipoIvaItem);		
		this.jmenuBarDetalleTipoIvaItem.add(this.jmenuDetalleAccionesTipoIvaItem);		
		this.jmenuBarDetalleTipoIvaItem.add(this.jmenuDetalleDatosTipoIvaItem);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoIvaItem.add(this.jmenuDetalleTipoIvaItem);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoIvaItem);				
	}
	
	
	public void inicializarElementosCamposTipoIvaItem() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoIvaItem = new JLabelMe();
		jLabelIdTipoIvaItem.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoIvaItem = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoIvaItem.setToolTipText(TipoIvaItemConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoIvaItem= new GridBagLayout();

		this.jPanelidTipoIvaItem.setLayout(this.gridaBagLayoutTipoIvaItem);

		jTextFieldidTipoIvaItem = new JTextFieldMe();
		jTextFieldidTipoIvaItem.setText("Id");

		jTextFieldidTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoIvaItem = new JLabelMe();
		this.jLabelcodigoTipoIvaItem.setText(""+TipoIvaItemConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoIvaItem.setToolTipText("Codigo");
		this.jLabelcodigoTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoIvaItem=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoIvaItem.setToolTipText(TipoIvaItemConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoIvaItem = new GridBagLayout();
		this.jPanelcodigoTipoIvaItem.setLayout(this.gridaBagLayoutTipoIvaItem);


		jTextFieldcodigoTipoIvaItem= new JTextFieldMe();

		jTextFieldcodigoTipoIvaItem.setEnabled(false);
		jTextFieldcodigoTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoIvaItemBusqueda= new JButtonMe();
		this.jButtoncodigoTipoIvaItemBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoIvaItemBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoIvaItemBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoIvaItemBusqueda.setText("U");
		this.jButtoncodigoTipoIvaItemBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoIvaItemBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoIvaItemBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoIvaItem.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoIvaItem.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoIvaItemBusqueda"));

		if(this.tipoivaitemSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoIvaItemBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoIvaItem = new JLabelMe();
		this.jLabelnombreTipoIvaItem.setText(""+TipoIvaItemConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoIvaItem.setToolTipText("Nombre");
		this.jLabelnombreTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoIvaItem=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoIvaItem.setToolTipText(TipoIvaItemConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoIvaItem = new GridBagLayout();
		this.jPanelnombreTipoIvaItem.setLayout(this.gridaBagLayoutTipoIvaItem);


		jTextFieldnombreTipoIvaItem= new JTextFieldMe();

		jTextFieldnombreTipoIvaItem.setEnabled(false);
		jTextFieldnombreTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoIvaItemBusqueda= new JButtonMe();
		this.jButtonnombreTipoIvaItemBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIvaItemBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIvaItemBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoIvaItemBusqueda.setText("U");
		this.jButtonnombreTipoIvaItemBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoIvaItemBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoIvaItemBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoIvaItem.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoIvaItem.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoIvaItemBusqueda"));

		if(this.tipoivaitemSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoIvaItemBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoIvaItem() {
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
		//this.jInternalFrameDetalleTipoIvaItem = new TipoIvaItemBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Iva Item DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIvaItem= new GridBagLayout();
		

		
		String sToolTipTipoIvaItem="";
		sToolTipTipoIvaItem=TipoIvaItemConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIvaItem+="(Inventario.TipoIvaItem)";
		}
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIvaItem+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoIvaItem = new JButtonMe();
		this.jButtonModificarTipoIvaItem = new JButtonMe();
        this.jButtonActualizarTipoIvaItem = new JButtonMe();
        this.jButtonEliminarTipoIvaItem = new JButtonMe();
        this.jButtonCancelarTipoIvaItem = new JButtonMe();
        this.jButtonGuardarCambiosTipoIvaItem = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoIvaItem = new JButtonMe();
		this.jButtonCerrarTipoIvaItem = new JButtonMe();
		
		this.jScrollPanelDatosTipoIvaItem = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoIvaItem = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoIvaItem = new JScrollPane();
				
		
		
		this.jPanelCamposTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Iva Item";
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Iva Itemes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIvaItem.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoIvaItem.setName("jPanelCamposTipoIvaItem"); 

		this.jPanelCamposOcultosTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoIvaItem.setName("jPanelCamposOcultosTipoIvaItem"); 

        this.jPanelAccionesTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIvaItem.setToolTipText("Acciones");
        this.jPanelAccionesTipoIvaItem.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoIvaItem.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoIvaItem.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoIvaItem.setText("Nuevo");
		this.jButtonModificarTipoIvaItem.setText("Editar");
        this.jButtonActualizarTipoIvaItem.setText("Actualizar");
        this.jButtonEliminarTipoIvaItem.setText("Eliminar");
        this.jButtonCancelarTipoIvaItem.setText("Cancelar");
        this.jButtonGuardarCambiosTipoIvaItem.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoIvaItem.setText("Guardar");
		this.jButtonCerrarTipoIvaItem.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIvaItem,"nuevo_button","Nuevo",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoIvaItem,"modificar_button","Editar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoIvaItem,"actualizar_button","Actualizar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoIvaItem,"eliminar_button","Eliminar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoIvaItem,"cancelar_button","Cancelar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoIvaItem,"guardarcambios_button","Guardar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIvaItem,"guardarcambiostabla_button","Guardar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIvaItem,"cerrar_button","Salir",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoIvaItem.setToolTipText("Nuevo"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoIvaItem.setToolTipText("Editar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoIvaItem.setToolTipText("Actualizar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoIvaItem.setToolTipText("Eliminar)"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoIvaItem.setToolTipText("Cancelar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoIvaItem.setToolTipText("Guardar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoIvaItem.setToolTipText("Guardar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIvaItem.setToolTipText("Salir"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIvaItem";
		inputMap = this.jButtonNuevoTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIvaItem.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIvaItem"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoIvaItem";
		inputMap = this.jButtonActualizarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoIvaItem"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoIvaItem";
		inputMap = this.jButtonEliminarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoIvaItem"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoIvaItem";
		inputMap = this.jButtonCancelarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoIvaItem"));
		
		//CERRAR		
		sMapKey = "CerrarTipoIvaItem";
		inputMap = this.jButtonCerrarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIvaItem"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIvaItem";
		inputMap = this.jButtonGuardarCambiosTablaTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIvaItem"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoIvaItem = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoIvaItem.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoIvaItem.setToolTipText("Nuevo TipoIvaItem");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoIvaItem = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoIvaItem.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoIvaItem.setToolTipText("Sin Cerrar Ventana TipoIvaItem");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoIvaItem = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoIvaItem.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoIvaItem.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIvaItem.setText("Accion");
		this.jComboBoxTiposAccionesTipoIvaItem.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoIvaItem.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoIvaItem.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoIvaItem = new JLabelMe();
		
		this.jLabelAccionesTipoIvaItem.setText("Acciones");		
		this.jLabelAccionesTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoIvaItem();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoIvaItem();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoIvaItem=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoIvaItem,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoIvaItem.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIvaItem.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIvaItem.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoIvaItem.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIvaItem.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIvaItem.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoIvaItem = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoIvaItem = new GridBagLayout();
		
		this.jPanelCamposTipoIvaItem.setLayout(gridaBagLayoutCamposTipoIvaItem);
		this.jPanelCamposOcultosTipoIvaItem.setLayout(gridaBagLayoutCamposOcultosTipoIvaItem);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIvaItem.gridy = 0;
	this.gridBagConstraintsTipoIvaItem.gridx = 0;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoIvaItem.add(jLabelIdTipoIvaItem, this.gridBagConstraintsTipoIvaItem);



	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIvaItem.gridy = 0;
	this.gridBagConstraintsTipoIvaItem.gridx = 1;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoIvaItem.add(jTextFieldidTipoIvaItem, this.gridBagConstraintsTipoIvaItem);


	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIvaItem.gridy = 0;
	this.gridBagConstraintsTipoIvaItem.gridx = 0;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoIvaItem.add(jLabelcodigoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		//this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = 0;
		this.gridBagConstraintsTipoIvaItem.gridx = 2;
		this.gridBagConstraintsTipoIvaItem.ipadx = 0;
		this.gridBagConstraintsTipoIvaItem.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoIvaItem.add(jButtoncodigoTipoIvaItemBusqueda, this.gridBagConstraintsTipoIvaItem);
	}

	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIvaItem.gridy = 0;
	this.gridBagConstraintsTipoIvaItem.gridx = 1;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoIvaItem.add(jTextFieldcodigoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);


	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIvaItem.gridy = 0;
	this.gridBagConstraintsTipoIvaItem.gridx = 0;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoIvaItem.add(jLabelnombreTipoIvaItem, this.gridBagConstraintsTipoIvaItem);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		//this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = 0;
		this.gridBagConstraintsTipoIvaItem.gridx = 2;
		this.gridBagConstraintsTipoIvaItem.ipadx = 0;
		this.gridBagConstraintsTipoIvaItem.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoIvaItem.add(jButtonnombreTipoIvaItemBusqueda, this.gridBagConstraintsTipoIvaItem);
	}

	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIvaItem.gridy = 0;
	this.gridBagConstraintsTipoIvaItem.gridx = 1;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoIvaItem.add(jTextFieldnombreTipoIvaItem, this.gridBagConstraintsTipoIvaItem);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIvaItem.gridy = iYPanelCamposTipoIvaItem;
	this.gridBagConstraintsTipoIvaItem.gridx = iXPanelCamposTipoIvaItem++;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIvaItem.add(this.jPanelidTipoIvaItem, this.gridBagConstraintsTipoIvaItem);



	if(iXPanelCamposTipoIvaItem % 1==0) {
		iXPanelCamposTipoIvaItem=0;
		iYPanelCamposTipoIvaItem++;
	}
	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIvaItem.gridy = iYPanelCamposTipoIvaItem;
	this.gridBagConstraintsTipoIvaItem.gridx = iXPanelCamposTipoIvaItem++;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIvaItem.add(this.jPanelcodigoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);



	if(iXPanelCamposTipoIvaItem % 1==0) {
		iXPanelCamposTipoIvaItem=0;
		iYPanelCamposTipoIvaItem++;
	}
	this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIvaItem.gridy = iYPanelCamposTipoIvaItem;
	this.gridBagConstraintsTipoIvaItem.gridx = iXPanelCamposTipoIvaItem++;
	this.gridBagConstraintsTipoIvaItem.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIvaItem.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIvaItem.add(this.jPanelnombreTipoIvaItem, this.gridBagConstraintsTipoIvaItem);



	if(iXPanelCamposTipoIvaItem % 1==0) {
		iXPanelCamposTipoIvaItem=0;
		iYPanelCamposTipoIvaItem++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoIvaItem= new GridBagLayout();
		this.jPanelAccionesTipoIvaItem.setLayout(gridaBagLayoutAccionesTipoIvaItem);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoIvaItem= new GridBagLayout();
		this.jPanelAccionesFormularioTipoIvaItem.setLayout(gridaBagLayoutAccionesFormularioTipoIvaItem);
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIvaItem.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIvaItem.add(this.jComboBoxTiposAccionesFormularioTipoIvaItem, this.gridBagConstraintsTipoIvaItem);

		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIvaItem.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIvaItem.add(this.jCheckBoxPostAccionNuevoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIvaItem.add(this.jCheckBoxPostAccionSinCerrarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIvaItem.add(this.jCheckBoxPostAccionSinMensajeTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = 0;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoIvaItem.add(this.jButtonModificarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);							

		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = 0;
		this.gridBagConstraintsTipoIvaItem.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoIvaItem.add(this.jButtonEliminarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
			
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = 0;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIvaItem.add(this.jButtonActualizarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);


		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = 0;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIvaItem.add(this.jButtonGuardarCambiosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);	
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = 0;		
		this.gridBagConstraintsTipoIvaItem.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoIvaItem.add(this.jButtonCancelarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIvaItem = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIvaItem);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();						
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIvaItem.gridx = 0;		
			//this.gridBagConstraintsTipoIvaItem.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIvaItem.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIvaItem.gridx =0;
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIvaItem.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoIvaItem = new TipoIvaItemBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Iva Item DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Iva Item DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Iva Item Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoIvaItemModel tipoivaitemModel=new TipoIvaItemModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoIvaItemModel.TipoIvaItemFocusTraversalPolicy tipoivaitemFocusTraversalPolicy = tipoivaitemModel.new TipoIvaItemFocusTraversalPolicy(this);
			
			//tipoivaitemFocusTraversalPolicy.settipoivaitemJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoivaitemModel);
			
			
			this.jContentPaneDetalleTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoIvaItem = new GridBagLayout();	
			this.jContentPaneDetalleTipoIvaItem.setLayout(gridaBagLayoutDetalleTipoIvaItem);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIvaItem = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
				this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoIvaItem.gridx = 0;
					
				
				this.jContentPaneDetalleTipoIvaItem.add(jTtoolBarDetalleTipoIvaItem, gridBagConstraintsTipoIvaItem);								
				
}
			
			this.jScrollPanelDatosEdicionTipoIvaItem=   new JScrollPane(jContentPaneDetalleTipoIvaItem,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIvaItem.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIvaItem.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIvaItem.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoIvaItem=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIvaItem.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIvaItem.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIvaItem.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoIvaItem.gridx = 0;
	        
			this.jContentPaneDetalleTipoIvaItem.add(jPanelCamposTipoIvaItem, gridBagConstraintsTipoIvaItem);
			
			
			
			
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
						&& tipoivaitemSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					
					if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoIvaItem= new GridBagConstraints();
						this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoIvaItem.gridx = 0;
						this.jContentPaneDetalleTipoIvaItem.add(this.jTabbedPaneRelacionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoIvaItem.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoIvaItem.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
					this.gridBagConstraintsTipoIvaItem.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoIvaItem.gridx = 0;
					
				
					this.jContentPaneDetalleTipoIvaItem.add(jPanelCamposOcultosTipoIvaItem, gridBagConstraintsTipoIvaItem);
				
					this.jPanelCamposOcultosTipoIvaItem.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoIvaItem.gridx = 0;
	        this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoIvaItem.add(this.jPanelAccionesFormularioTipoIvaItem, this.gridBagConstraintsTipoIvaItem);							
			
			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
	        this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoIvaItem.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoIvaItem.add(this.jPanelAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoIvaItem);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoIvaItem=   new JScrollPane(this.jPanelCamposTipoIvaItem,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIvaItem.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIvaItem.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIvaItem.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoIvaItem.gridx = 0;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoIvaItem.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIvaItem.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIvaItem.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
			
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
			
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoIvaItem;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoIvaItem;
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

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
				//this.gridBagConstraintsTipoIvaItem.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIvaItem.gridx = 0;
				//this.jContentPaneDetalleTipoIvaItem.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIvaItem);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIvaItem.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIvaItem.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesTipoIvaItem.add("Definiciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDefinicionBeanSwingJInternalFrame(List<TipoIvaItem> tipoivaitems,TipoIvaItem tipoivaitem,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.tipoivaitemLogic.getConnexion());

					definicionBeanSwingJInternalFrame.settipoivaitemsForeignKey(tipoivaitems);
					definicionBeanSwingJInternalFrame.settipoivaitemForeignKey(tipoivaitem);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoIvaItem(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidTipoIvaItemActual(tipoivaitem.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIvaItem(true);
					definicionBeanSwingJInternalFrame.setid_tipo_iva_itemFK_IdTipoIvaItem(tipoivaitem.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIvaItemForeignKey(tipoivaitem,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIvaItem");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIvaItem");
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
