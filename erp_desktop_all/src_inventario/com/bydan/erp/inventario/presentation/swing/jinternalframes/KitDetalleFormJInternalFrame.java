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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.KitConstantesFunciones;

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
public class KitDetalleFormJInternalFrame extends KitBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleKit;
	
	protected JMenuBar jmenuBarDetalleKit;
	
	protected JMenu jmenuDetalleKit;
	protected JMenu jmenuDetalleArchivoKit;
	protected JMenu jmenuDetalleAccionesKit;
	protected JMenu jmenuDetalleDatosKit;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutKit;	
	protected GridBagConstraints gridBagConstraintsKit;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected KitBeanSwingJInternalFrameAdditional jInternalFrameDetalleKit;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public KitSessionBean kitSessionBean;
	
	

	public CompoKitBeanSwingJInternalFrame compokitBeanSwingJInternalFrame=null;
	public CompoKitBeanSwingJInternalFrame compokitBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCompoKit=false;
	public CompoKitSessionBean compokitSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public KitLogic kitLogic;
	
	public JScrollPane jScrollPanelDatosKit;
	public JScrollPane jScrollPanelDatosEdicionKit;
	public JScrollPane jScrollPanelDatosGeneralKit;
	
	protected JPanel jPanelCamposKit;    
	protected JPanel jPanelCamposOcultosKit;    	
	protected JPanel jPanelAccionesKit;
	protected JPanel jPanelAccionesFormularioKit;
    
	
	
	protected Integer iXPanelCamposKit=0;
	protected Integer iYPanelCamposKit=0;
	
	protected Integer iXPanelCamposOcultosKit=0;
	protected Integer iYPanelCamposOcultosKit=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoKit;
	public JButton jButtonModificarKit;
	public JButton jButtonActualizarKit;
    public JButton jButtonEliminarKit;
	public JButton jButtonCancelarKit;
    public JButton jButtonGuardarCambiosKit;
	public JButton jButtonGuardarCambiosTablaKit;
	protected JButton jButtonCerrarKit;
	
	
	protected JButton jButtonProcesarInformacionKit;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoKit;
	protected JCheckBox jCheckBoxPostAccionSinCerrarKit;
	protected JCheckBox jCheckBoxPostAccionSinMensajeKit;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarKit;
	protected JButton jButtonModificarToolBarKit;
	protected JButton jButtonActualizarToolBarKit;
    protected JButton jButtonEliminarToolBarKit;
	protected JButton jButtonCancelarToolBarKit;
    protected JButton jButtonGuardarCambiosToolBarKit;
	protected JButton jButtonGuardarCambiosTablaToolBarKit;
	protected JButton jButtonMostrarOcultarTablaToolBarKit;
	protected JButton jButtonCerrarToolBarKit;
	
	protected JButton jButtonProcesarInformacionToolBarKit;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoKit;
	protected JMenuItem jMenuItemModificarKit;
	protected JMenuItem jMenuItemActualizarKit;
    protected JMenuItem jMenuItemEliminarKit;
	protected JMenuItem jMenuItemCancelarKit;
    protected JMenuItem jMenuItemGuardarCambiosKit;
	protected JMenuItem jMenuItemGuardarCambiosTablaKit;
	protected JMenuItem jMenuItemCerrarKit;
	protected JMenuItem jMenuItemDetalleCerrarKit;
	protected JMenuItem jMenuItemDetalleMostarOcultarKit;
	
	protected JMenuItem jMenuItemProcesarInformacionKit;
	protected JMenuItem jMenuItemNuevoGuardarCambiosKit;
	protected JMenuItem jMenuItemMostrarOcultarKit;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesKit;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesKit;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioKit;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidKit;
	public JLabel jLabelIdKit;
	public JLabel jLabelidKit;
	public JButton jButtonidKitBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionKit;
	public JLabel jLabeldescripcionKit;
	public JTextArea jTextAreadescripcionKit;
	public JScrollPane jscrollPanedescripcionKit;
	public JButton jButtondescripcionKitBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaKit;
	public JLabel jLabelid_empresaKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaKit;
	public JButton jButtonid_empresaKit= new JButtonMe();
	public JButton jButtonid_empresaKitUpdate= new JButtonMe();
	public JButton jButtonid_empresaKitBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalKit;
	public JLabel jLabelid_sucursalKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalKit;
	public JButton jButtonid_sucursalKit= new JButtonMe();
	public JButton jButtonid_sucursalKitUpdate= new JButtonMe();
	public JButton jButtonid_sucursalKitBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesKit;
	
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
	
	public KitDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposKit=new JPanel();
				this.jPanelAccionesFormularioKit=new JPanel();
				this.jmenuBarDetalleKit=new JMenuBar();
				this.jTtoolBarDetalleKit=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public KitDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarKit() {
		return this.jButtonActualizarToolBarKit;
	}
	
	public JButton getjButtonEliminarToolBarKit() {
		return this.jButtonEliminarToolBarKit;
	}
	
	public JButton getjButtonCancelarToolBarKit() {
		return this.jButtonCancelarToolBarKit;
	}		
	
	public JButton getjButtonProcesarInformacionKit() {
		return this.jButtonProcesarInformacionKit;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionKit)	{
		this.jButtonProcesarInformacionKit = jButtonProcesarInformacionKit;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesKit() {
		return this.jComboBoxTiposAccionesKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesKit(
			JComboBox jComboBoxTiposRelacionesKit) {
		this.jComboBoxTiposRelacionesKit = jComboBoxTiposRelacionesKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesKit(
			JComboBox jComboBoxTiposAccionesKit) {
		this.jComboBoxTiposAccionesKit = jComboBoxTiposAccionesKit;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioKit() {
		return this.jComboBoxTiposAccionesFormularioKit;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioKit(
			JComboBox jComboBoxTiposAccionesFormularioKit) {
		this.jComboBoxTiposAccionesFormularioKit = jComboBoxTiposAccionesFormularioKit;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.kitSessionBean=new KitSessionBean();
		
		this.kitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.kitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.kitSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.compokitSessionBean=new CompoKitSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		KitJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		KitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		KitJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Kit MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
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
	
		KitJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleKit= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarKit=new JButtonMe();
				this.jButtonModificarToolBarKit=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarKit,this.jTtoolBarDetalleKit,
							"actualizar","actualizar","Actualizar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarKit,this.jTtoolBarDetalleKit,
							"eliminar","eliminar","Eliminar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarKit,this.jTtoolBarDetalleKit,
							"cancelar","cancelar","Cancelar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarKit,this.jTtoolBarDetalleKit,
							"guardarcambios","guardarcambios","Guardar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarKit,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarKit,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarKit,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleKit=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleKit=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoKit=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesKit=new JMenuMe("Acciones");
		this.jmenuDetalleDatosKit=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoKit= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoKit.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoKit,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarKit= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarKit.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarKit,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarKit= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarKit.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarKit,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarKit= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarKit.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarKit,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarKit= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarKit.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarKit,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosKit= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosKit.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosKit,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarKit= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarKit.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarKit,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarKit= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarKit.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarKit,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarKit,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarKit,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarKit, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoKit.add(this.jMenuItemDetalleCerrarKit);
		
		this.jmenuDetalleAccionesKit.add(this.jMenuItemActualizarKit);
		this.jmenuDetalleAccionesKit.add(this.jMenuItemEliminarKit);
		this.jmenuDetalleAccionesKit.add(this.jMenuItemCancelarKit);		
		
		//this.jmenuDetalleDatosKit.add(this.jMenuItemDetalleAbrirOrderByKit);				
		this.jmenuDetalleDatosKit.add(this.jMenuItemDetalleMostarOcultarKit);				
				
		//this.jmenuDetalleAccionesKit.add(this.jMenuItemGuardarCambiosKit);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosKit, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleKit.add(this.jmenuDetalleArchivoKit);		
		this.jmenuBarDetalleKit.add(this.jmenuDetalleAccionesKit);		
		this.jmenuBarDetalleKit.add(this.jmenuDetalleDatosKit);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleKit, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleKit.add(this.jmenuDetalleKit);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleKit);				
	}
	
	
	public void inicializarElementosCamposKit() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdKit = new JLabelMe();
		jLabelIdKit.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdKit,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidKit = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidKit.setToolTipText(KitConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutKit= new GridBagLayout();

		this.jPanelidKit.setLayout(this.gridaBagLayoutKit);

		jLabelidKit = new JLabel();
		jLabelidKit.setText("Id");

		jLabelidKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionKit = new JLabelMe();
		this.jLabeldescripcionKit.setText(""+KitConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionKit.setToolTipText("Descripcion");
		this.jLabeldescripcionKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionKit.setToolTipText(KitConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutKit = new GridBagLayout();
		this.jPaneldescripcionKit.setLayout(this.gridaBagLayoutKit);


		jTextAreadescripcionKit= new JTextAreaMe();
		jTextAreadescripcionKit.setEnabled(false);
		jTextAreadescripcionKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionKit.setLineWrap(true);
		jTextAreadescripcionKit.setWrapStyleWord(true);
		jTextAreadescripcionKit.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionKit.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionKit,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionKit = new JScrollPane(jTextAreadescripcionKit);
		jscrollPanedescripcionKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionKitBusqueda= new JButtonMe();
		this.jButtondescripcionKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionKitBusqueda.setText("U");
		this.jButtondescripcionKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionKitBusqueda"));

		if(this.kitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionKitBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysKit() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaKit = new JLabelMe();
		this.jLabelid_empresaKit.setText(""+KitConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaKit.setToolTipText("Empresa");
		this.jLabelid_empresaKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaKit.setToolTipText(KitConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutKit = new GridBagLayout();
		this.jPanelid_empresaKit.setLayout(this.gridaBagLayoutKit);


		jComboBoxid_empresaKit= new JComboBoxMe();
		jComboBoxid_empresaKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaKit,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaKit.setEnabled(false);

		this.jButtonid_empresaKit= new JButtonMe();
		this.jButtonid_empresaKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaKit.setText("Buscar");
		this.jButtonid_empresaKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaKit"));

		this.jButtonid_empresaKitBusqueda= new JButtonMe();
		this.jButtonid_empresaKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaKitBusqueda.setText("U");
		this.jButtonid_empresaKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaKitBusqueda"));

		if(this.kitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaKitBusqueda.setVisible(false);		}

		this.jButtonid_empresaKitUpdate= new JButtonMe();
		this.jButtonid_empresaKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaKitUpdate.setText("U");
		this.jButtonid_empresaKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaKitUpdate"));



					
		this.jLabelid_sucursalKit = new JLabelMe();
		this.jLabelid_sucursalKit.setText(""+KitConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalKit.setToolTipText("Sucursal");
		this.jLabelid_sucursalKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalKit.setToolTipText(KitConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutKit = new GridBagLayout();
		this.jPanelid_sucursalKit.setLayout(this.gridaBagLayoutKit);


		jComboBoxid_sucursalKit= new JComboBoxMe();
		jComboBoxid_sucursalKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalKit,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalKit.setEnabled(false);

		this.jButtonid_sucursalKit= new JButtonMe();
		this.jButtonid_sucursalKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalKit.setText("Buscar");
		this.jButtonid_sucursalKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalKit"));

		this.jButtonid_sucursalKitBusqueda= new JButtonMe();
		this.jButtonid_sucursalKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalKitBusqueda.setText("U");
		this.jButtonid_sucursalKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalKitBusqueda"));

		if(this.kitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalKitBusqueda.setVisible(false);		}

		this.jButtonid_sucursalKitUpdate= new JButtonMe();
		this.jButtonid_sucursalKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalKitUpdate.setText("U");
		this.jButtonid_sucursalKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalKitUpdate"));



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
		//this.jInternalFrameDetalleKit = new KitBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Kit DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutKit= new GridBagLayout();
		

		
		String sToolTipKit="";
		sToolTipKit=KitConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipKit+="(Inventario.Kit)";
		}
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			sToolTipKit+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoKit = new JButtonMe();
		this.jButtonModificarKit = new JButtonMe();
        this.jButtonActualizarKit = new JButtonMe();
        this.jButtonEliminarKit = new JButtonMe();
        this.jButtonCancelarKit = new JButtonMe();
        this.jButtonGuardarCambiosKit = new JButtonMe();
		this.jButtonGuardarCambiosTablaKit = new JButtonMe();
		this.jButtonCerrarKit = new JButtonMe();
		
		this.jScrollPanelDatosKit = new JScrollPane();   
        this.jScrollPanelDatosEdicionKit = new JScrollPane();
		this.jScrollPanelDatosGeneralKit = new JScrollPane();
				
		
		
		this.jPanelCamposKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Kit";
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Kites" + this.sPath));
		} else {
			this.jScrollPanelDatosKit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposKit.setName("jPanelCamposKit"); 

		this.jPanelCamposOcultosKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosKit.setName("jPanelCamposOcultosKit"); 

        this.jPanelAccionesKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesKit.setToolTipText("Acciones");
        this.jPanelAccionesKit.setName("Acciones"); 

		this.jPanelAccionesFormularioKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioKit.setToolTipText("Acciones");
        this.jPanelAccionesFormularioKit.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosKit, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposKit, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosKit, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioKit, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoKit.setText("Nuevo");
		this.jButtonModificarKit.setText("Editar");
        this.jButtonActualizarKit.setText("Actualizar");
        this.jButtonEliminarKit.setText("Eliminar");
        this.jButtonCancelarKit.setText("Cancelar");
        this.jButtonGuardarCambiosKit.setText("Guardar");
		this.jButtonGuardarCambiosTablaKit.setText("Guardar");
		this.jButtonCerrarKit.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoKit,"nuevo_button","Nuevo",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarKit,"modificar_button","Editar",this.kitSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarKit,"actualizar_button","Actualizar",this.kitSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarKit,"eliminar_button","Eliminar",this.kitSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarKit,"cancelar_button","Cancelar",this.kitSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosKit,"guardarcambios_button","Guardar",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaKit,"guardarcambiostabla_button","Guardar",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarKit,"cerrar_button","Salir",this.kitSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarKit, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoKit.setToolTipText("Nuevo"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarKit.setToolTipText("Editar"+" "+KitConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarKit.setToolTipText("Actualizar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarKit.setToolTipText("Eliminar)"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarKit.setToolTipText("Cancelar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosKit.setToolTipText("Guardar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaKit.setToolTipText("Guardar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarKit.setToolTipText("Salir"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoKit";
		inputMap = this.jButtonNuevoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoKit"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarKit";
		inputMap = this.jButtonActualizarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarKit"));
		
		//ELIMINAR
		sMapKey = "EliminarKit";
		inputMap = this.jButtonEliminarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarKit"));
		
		//CANCELAR	
		sMapKey = "CancelarKit";
		inputMap = this.jButtonCancelarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarKit"));
		
		//CERRAR		
		sMapKey = "CerrarKit";
		inputMap = this.jButtonCerrarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarKit"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaKit";
		inputMap = this.jButtonGuardarCambiosTablaKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaKit"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoKit = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoKit.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoKit.setToolTipText("Nuevo Kit");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoKit, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarKit = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarKit.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarKit.setToolTipText("Sin Cerrar Ventana Kit");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarKit, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeKit = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeKit.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeKit.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeKit, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesKit = new JComboBoxMe();
		//this.jComboBoxTiposAccionesKit.setText("Accion");
		this.jComboBoxTiposAccionesKit.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioKit = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioKit.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioKit.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesKit = new JLabelMe();
		
		this.jLabelAccionesKit.setText("Acciones");		
		this.jLabelAccionesKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposKit();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysKit();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesKit=new JTabbedPane();
		this.jTabbedPaneRelacionesKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesKit,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioKit.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioKit.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioKit.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioKit, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposKit = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosKit = new GridBagLayout();
		
		this.jPanelCamposKit.setLayout(gridaBagLayoutCamposKit);
		this.jPanelCamposOcultosKit.setLayout(gridaBagLayoutCamposOcultosKit);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 0;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidKit.add(jLabelIdKit, this.gridBagConstraintsKit);



	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 1;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidKit.add(jLabelidKit, this.gridBagConstraintsKit);


	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 0;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaKit.add(jLabelid_empresaKit, this.gridBagConstraintsKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsKit = new GridBagConstraints();
		//this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = 2;
		this.gridBagConstraintsKit.ipadx = 0;
		this.gridBagConstraintsKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaKit.add(jButtonid_empresaKitBusqueda, this.gridBagConstraintsKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsKit = new GridBagConstraints();
		//this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = 3;
		this.gridBagConstraintsKit.ipadx = 0;
		this.gridBagConstraintsKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaKit.add(jButtonid_empresaKitUpdate, this.gridBagConstraintsKit);
	}

	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 1;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaKit.add(jComboBoxid_empresaKit, this.gridBagConstraintsKit);


	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 0;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalKit.add(jLabelid_sucursalKit, this.gridBagConstraintsKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsKit = new GridBagConstraints();
		//this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = 2;
		this.gridBagConstraintsKit.ipadx = 0;
		this.gridBagConstraintsKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalKit.add(jButtonid_sucursalKitBusqueda, this.gridBagConstraintsKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsKit = new GridBagConstraints();
		//this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = 3;
		this.gridBagConstraintsKit.ipadx = 0;
		this.gridBagConstraintsKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalKit.add(jButtonid_sucursalKitUpdate, this.gridBagConstraintsKit);
	}

	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 1;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalKit.add(jComboBoxid_sucursalKit, this.gridBagConstraintsKit);


	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 0;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionKit.add(jLabeldescripcionKit, this.gridBagConstraintsKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsKit = new GridBagConstraints();
		//this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = 2;
		this.gridBagConstraintsKit.ipadx = 0;
		this.gridBagConstraintsKit.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionKit.add(jButtondescripcionKitBusqueda, this.gridBagConstraintsKit);
	}

	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsKit.gridy = 0;
	this.gridBagConstraintsKit.gridx = 1;
	this.gridBagConstraintsKit.ipadx = 0;
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionKit.add(jscrollPanedescripcionKit, this.gridBagConstraintsKit);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsKit.gridy = iYPanelCamposKit;
	this.gridBagConstraintsKit.gridx = iXPanelCamposKit++;
	this.gridBagConstraintsKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposKit.add(this.jPanelidKit, this.gridBagConstraintsKit);



	if(iXPanelCamposKit % 1==0) {
		iXPanelCamposKit=0;
		iYPanelCamposKit++;
	}
	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsKit.gridy = iYPanelCamposKit;
	this.gridBagConstraintsKit.gridx = iXPanelCamposKit++;
	this.gridBagConstraintsKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposKit.add(this.jPaneldescripcionKit, this.gridBagConstraintsKit);



	if(iXPanelCamposKit % 1==0) {
		iXPanelCamposKit=0;
		iYPanelCamposKit++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsKit.gridy = iYPanelCamposOcultosKit;
	this.gridBagConstraintsKit.gridx = iXPanelCamposOcultosKit++;
	this.gridBagConstraintsKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosKit.add(this.jPanelid_empresaKit, this.gridBagConstraintsKit);



	if(iXPanelCamposOcultosKit % 1==0) {
		iXPanelCamposOcultosKit=0;
		iYPanelCamposOcultosKit++;
	}
	this.gridBagConstraintsKit = new GridBagConstraints();
	this.gridBagConstraintsKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsKit.gridy = iYPanelCamposOcultosKit;
	this.gridBagConstraintsKit.gridx = iXPanelCamposOcultosKit++;
	this.gridBagConstraintsKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosKit.add(this.jPanelid_sucursalKit, this.gridBagConstraintsKit);



	if(iXPanelCamposOcultosKit % 1==0) {
		iXPanelCamposOcultosKit=0;
		iYPanelCamposOcultosKit++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesKit= new GridBagLayout();
		this.jPanelAccionesKit.setLayout(gridaBagLayoutAccionesKit);
		
		GridBagLayout gridaBagLayoutAccionesFormularioKit= new GridBagLayout();
		this.jPanelAccionesFormularioKit.setLayout(gridaBagLayoutAccionesFormularioKit);
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsKit.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioKit.add(this.jComboBoxTiposAccionesFormularioKit, this.gridBagConstraintsKit);

		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsKit.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioKit.add(this.jCheckBoxPostAccionNuevoKit, this.gridBagConstraintsKit);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.kitSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsKit.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioKit.add(this.jCheckBoxPostAccionSinCerrarKit, this.gridBagConstraintsKit);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.kitSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.kitSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsKit.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioKit.add(this.jCheckBoxPostAccionSinMensajeKit, this.gridBagConstraintsKit);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = iPosXAccion++;
			
		this.jPanelAccionesKit.add(this.jButtonModificarKit, this.gridBagConstraintsKit);							

		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx =iPosXAccion++;
			
		this.jPanelAccionesKit.add(this.jButtonEliminarKit, this.gridBagConstraintsKit);
		
			
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = 0;		
		this.gridBagConstraintsKit.gridx = iPosXAccion++;
		
		this.jPanelAccionesKit.add(this.jButtonActualizarKit, this.gridBagConstraintsKit);


		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = 0;		
		this.gridBagConstraintsKit.gridx = iPosXAccion++;
		
		this.jPanelAccionesKit.add(this.jButtonGuardarCambiosKit, this.gridBagConstraintsKit);	
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = 0;		
		this.gridBagConstraintsKit.gridx =iPosXAccion++;
		
		this.jPanelAccionesKit.add(this.jButtonCancelarKit, this.gridBagConstraintsKit);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutKit = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutKit);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.kitSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsKit = new GridBagConstraints();						
			this.gridBagConstraintsKit.gridy = iGridyPrincipal++;
			this.gridBagConstraintsKit.gridx = 0;		
			//this.gridBagConstraintsKit.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsKit.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy =iGridyPrincipal++;
		this.gridBagConstraintsKit.gridx =0;
		this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsKit.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosKit, this.gridBagConstraintsKit);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(KitJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleKit = new KitBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Kit DATOS");
			
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
			
	        //this.setTitle("[FOR] - Kit DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Kit Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			KitModel kitModel=new KitModel(this);
			
			//SI USARA CLASE INTERNA
			//KitModel.KitFocusTraversalPolicy kitFocusTraversalPolicy = kitModel.new KitFocusTraversalPolicy(this);
			
			//kitFocusTraversalPolicy.setkitJInternalFrame(this);
			
			this.setFocusTraversalPolicy(kitModel);
			
			
			this.jContentPaneDetalleKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleKit = new GridBagLayout();	
			this.jContentPaneDetalleKit.setLayout(gridaBagLayoutDetalleKit);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosKit = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsKit = new GridBagConstraints();
				this.gridBagConstraintsKit.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsKit.gridx = 0;
					
				
				this.jContentPaneDetalleKit.add(jTtoolBarDetalleKit, gridBagConstraintsKit);								
				
}
			
			this.jScrollPanelDatosEdicionKit=   new JScrollPane(jContentPaneDetalleKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralKit=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			
			
	        this.gridBagConstraintsKit.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsKit.gridx = 0;
	        
			this.jContentPaneDetalleKit.add(jPanelCamposKit, gridBagConstraintsKit);
			
			
			
			
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
						&& kitSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCompoKit(this.puedeCargarPorParteCompoKit,false,-1);
					
					if(this.kitSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsKit= new GridBagConstraints();
						this.gridBagConstraintsKit.gridy = iGridyRelaciones++;
						this.gridBagConstraintsKit.gridx = 0;
						this.jContentPaneDetalleKit.add(this.jTabbedPaneRelacionesKit, this.gridBagConstraintsKit);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesKit.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCompoKit(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosKit.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsKit = new GridBagConstraints();
					this.gridBagConstraintsKit.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsKit.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsKit.gridx = 0;
					
				
					this.jContentPaneDetalleKit.add(jPanelCamposOcultosKit, gridBagConstraintsKit);
				
					this.jPanelCamposOcultosKit.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsKit.gridx = 0;
	        this.gridBagConstraintsKit.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleKit.add(this.jPanelAccionesFormularioKit, this.gridBagConstraintsKit);							
			
			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
	        this.gridBagConstraintsKit.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsKit.gridx = 0;
	        
			
			this.jContentPaneDetalleKit.add(this.jPanelAccionesKit, this.gridBagConstraintsKit);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionKit);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionKit=   new JScrollPane(this.jPanelCamposKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsKit.gridx = 0;
			this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsKit.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionKit, this.gridBagConstraintsKit);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsKit.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioKit, this.gridBagConstraintsKit);			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsKit.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesKit, this.gridBagConstraintsKit);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposKit, this.gridBagConstraintsKit);
			
			
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosKit, this.gridBagConstraintsKit);
		
			
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesKit, this.gridBagConstraintsKit);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralKit;//jContentPane;
		
		return jScrollPanelDatosEdicionKit;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCompoKit(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.compokitSessionBean=new CompoKitSessionBean();
		this.compokitSessionBean.setConGuardarRelaciones(false);
		this.compokitSessionBean.setEsGuardarRelacionado(true);

		this.compokitBeanSwingJInternalFrame=null;//new CompoKitBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.compokitBeanSwingJInternalFramePopup=new CompoKitBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.compokitBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.compokitSessionBean.getEsGuardarRelacionado()) {

				CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL=KitJInternalFrame.STIPO_TAMANIO_GENERAL;
				CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=KitJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.compokitSessionBean.setEsGuardarRelacionado(true);

				this.compokitBeanSwingJInternalFrame=new CompoKitBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.compokitBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.compokitBeanSwingJInternalFrame.setcompokitSessionBean(this.compokitSessionBean);

				//this.gridBagConstraintsKit = new GridBagConstraints();
				//this.gridBagConstraintsKit.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsKit.gridx = 0;
				//this.jContentPaneDetalleKit.add(this.compokitBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsKit);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesKit.add("Compo Kites",this.compokitBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesKit.setComponentAt(iIndexTab,this.compokitBeanSwingJInternalFrame.getContentPane());
				}

				//CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.compokitSessionBean.setEsGuardarRelacionado(false);
				this.compokitBeanSwingJInternalFrame=null;//new CompoKitBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.compokitSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCompoKit) {
					this.jTabbedPaneRelacionesKit.add("Compo Kites",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCompoKitBeanSwingJInternalFrame(List<Kit> kits,Kit kit,CompoKitBeanSwingJInternalFrame compokitBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//compokitBeanSwingJInternalFrame=new CompoKitBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					compokitBeanSwingJInternalFrame.getCompoKitLogic().setConnexion(this.kitLogic.getConnexion());

					compokitBeanSwingJInternalFrame.setkitsForeignKey(kits);
					compokitBeanSwingJInternalFrame.setkitForeignKey(kit);
					compokitBeanSwingJInternalFrame.compokitSessionBean.setisBusquedaDesdeForeignKeySesionKit(true);
					compokitBeanSwingJInternalFrame.compokitSessionBean.setlidKitActual(kit.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					compokitBeanSwingJInternalFrame.cargarCombosForeignKeyCompoKit(compokitBeanSwingJInternalFrame.isCargarCombosDependencia);
					compokitBeanSwingJInternalFrame.setVisibilidadBusquedasParaKit(true);
					compokitBeanSwingJInternalFrame.setid_kitFK_IdKit(kit.getId());

					if(!this.conCargarFormDetalle) {
						compokitBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					compokitBeanSwingJInternalFrame.setSelectedItemCombosFrameKitForeignKey(kit,1,false,true,true);
					compokitBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					compokitBeanSwingJInternalFrame.procesarBusqueda("FK_IdKit");
					compokitBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdKit");
					compokitBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompoKit(true);
					compokitBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCompoKit("n",compokitBeanSwingJInternalFrame.isGuardarCambiosEnLote, compokitBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					compokitBeanSwingJInternalFrame.setAutoscrolls(true);
					compokitBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						compokitBeanSwingJInternalFrame.actualizarEstadoPanelsCompoKit("relacionado");
					} else {
						compokitBeanSwingJInternalFrame.actualizarEstadoPanelsCompoKit("no_relacionado");
					}

					compokitBeanSwingJInternalFrame.getjButtonRecargarInformacionCompoKit().setVisible(false);

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
