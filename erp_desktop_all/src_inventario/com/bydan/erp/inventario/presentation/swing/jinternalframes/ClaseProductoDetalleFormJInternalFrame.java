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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.ClaseProductoConstantesFunciones;

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
public class ClaseProductoDetalleFormJInternalFrame extends ClaseProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleClaseProducto;
	
	protected JMenuBar jmenuBarDetalleClaseProducto;
	
	protected JMenu jmenuDetalleClaseProducto;
	protected JMenu jmenuDetalleArchivoClaseProducto;
	protected JMenu jmenuDetalleAccionesClaseProducto;
	protected JMenu jmenuDetalleDatosClaseProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClaseProducto;	
	protected GridBagConstraints gridBagConstraintsClaseProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClaseProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleClaseProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public ClaseProductoSessionBean claseproductoSessionBean;
	
	

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;	
	
	public ClaseProductoLogic claseproductoLogic;
	
	public JScrollPane jScrollPanelDatosClaseProducto;
	public JScrollPane jScrollPanelDatosEdicionClaseProducto;
	public JScrollPane jScrollPanelDatosGeneralClaseProducto;
	
	protected JPanel jPanelCamposClaseProducto;    
	protected JPanel jPanelCamposOcultosClaseProducto;    	
	protected JPanel jPanelAccionesClaseProducto;
	protected JPanel jPanelAccionesFormularioClaseProducto;
    
	
	
	protected Integer iXPanelCamposClaseProducto=0;
	protected Integer iYPanelCamposClaseProducto=0;
	
	protected Integer iXPanelCamposOcultosClaseProducto=0;
	protected Integer iYPanelCamposOcultosClaseProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoClaseProducto;
	public JButton jButtonModificarClaseProducto;
	public JButton jButtonActualizarClaseProducto;
    public JButton jButtonEliminarClaseProducto;
	public JButton jButtonCancelarClaseProducto;
    public JButton jButtonGuardarCambiosClaseProducto;
	public JButton jButtonGuardarCambiosTablaClaseProducto;
	protected JButton jButtonCerrarClaseProducto;
	
	
	protected JButton jButtonProcesarInformacionClaseProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoClaseProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarClaseProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeClaseProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClaseProducto;
	protected JButton jButtonModificarToolBarClaseProducto;
	protected JButton jButtonActualizarToolBarClaseProducto;
    protected JButton jButtonEliminarToolBarClaseProducto;
	protected JButton jButtonCancelarToolBarClaseProducto;
    protected JButton jButtonGuardarCambiosToolBarClaseProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarClaseProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarClaseProducto;
	protected JButton jButtonCerrarToolBarClaseProducto;
	
	protected JButton jButtonProcesarInformacionToolBarClaseProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClaseProducto;
	protected JMenuItem jMenuItemModificarClaseProducto;
	protected JMenuItem jMenuItemActualizarClaseProducto;
    protected JMenuItem jMenuItemEliminarClaseProducto;
	protected JMenuItem jMenuItemCancelarClaseProducto;
    protected JMenuItem jMenuItemGuardarCambiosClaseProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaClaseProducto;
	protected JMenuItem jMenuItemCerrarClaseProducto;
	protected JMenuItem jMenuItemDetalleCerrarClaseProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarClaseProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionClaseProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClaseProducto;
	protected JMenuItem jMenuItemMostrarOcultarClaseProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClaseProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClaseProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClaseProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioClaseProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidClaseProducto;
	public JLabel jLabelIdClaseProducto;
	public JLabel jLabelidClaseProducto;
	public JButton jButtonidClaseProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoClaseProducto;
	public JLabel jLabelcodigoClaseProducto;
	public JTextField jTextFieldcodigoClaseProducto;
	public JButton jButtoncodigoClaseProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreClaseProducto;
	public JLabel jLabelnombreClaseProducto;
	public JTextArea jTextAreanombreClaseProducto;
	public JScrollPane jscrollPanenombreClaseProducto;
	public JButton jButtonnombreClaseProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaClaseProducto;
	public JLabel jLabelid_empresaClaseProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaClaseProducto;
	public JButton jButtonid_empresaClaseProducto= new JButtonMe();
	public JButton jButtonid_empresaClaseProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaClaseProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoClaseProducto;
	public JLabel jLabelid_tipo_productoClaseProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoClaseProducto;
	public JButton jButtonid_tipo_productoClaseProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoClaseProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoClaseProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesClaseProducto;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ClaseProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposClaseProducto=new JPanel();
				this.jPanelAccionesFormularioClaseProducto=new JPanel();
				this.jmenuBarDetalleClaseProducto=new JMenuBar();
				this.jTtoolBarDetalleClaseProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClaseProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClaseProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarClaseProducto() {
		return this.jButtonActualizarToolBarClaseProducto;
	}
	
	public JButton getjButtonEliminarToolBarClaseProducto() {
		return this.jButtonEliminarToolBarClaseProducto;
	}
	
	public JButton getjButtonCancelarToolBarClaseProducto() {
		return this.jButtonCancelarToolBarClaseProducto;
	}		
	
	public JButton getjButtonProcesarInformacionClaseProducto() {
		return this.jButtonProcesarInformacionClaseProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClaseProducto)	{
		this.jButtonProcesarInformacionClaseProducto = jButtonProcesarInformacionClaseProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClaseProducto() {
		return this.jComboBoxTiposAccionesClaseProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClaseProducto(
			JComboBox jComboBoxTiposRelacionesClaseProducto) {
		this.jComboBoxTiposRelacionesClaseProducto = jComboBoxTiposRelacionesClaseProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClaseProducto(
			JComboBox jComboBoxTiposAccionesClaseProducto) {
		this.jComboBoxTiposAccionesClaseProducto = jComboBoxTiposAccionesClaseProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioClaseProducto() {
		return this.jComboBoxTiposAccionesFormularioClaseProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioClaseProducto(
			JComboBox jComboBoxTiposAccionesFormularioClaseProducto) {
		this.jComboBoxTiposAccionesFormularioClaseProducto = jComboBoxTiposAccionesFormularioClaseProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.claseproductoSessionBean=new ClaseProductoSessionBean();
		
		this.claseproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.claseproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.claseproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClaseProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Clase Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleClaseProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarClaseProducto=new JButtonMe();
				this.jButtonModificarToolBarClaseProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarClaseProducto,this.jTtoolBarDetalleClaseProducto,
							"actualizar","actualizar","Actualizar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarClaseProducto,this.jTtoolBarDetalleClaseProducto,
							"eliminar","eliminar","Eliminar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarClaseProducto,this.jTtoolBarDetalleClaseProducto,
							"cancelar","cancelar","Cancelar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarClaseProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarClaseProducto,this.jTtoolBarDetalleClaseProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleClaseProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleClaseProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoClaseProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesClaseProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosClaseProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClaseProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClaseProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClaseProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarClaseProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarClaseProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarClaseProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarClaseProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarClaseProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarClaseProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarClaseProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarClaseProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarClaseProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarClaseProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarClaseProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarClaseProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosClaseProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClaseProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClaseProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClaseProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClaseProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClaseProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarClaseProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarClaseProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarClaseProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClaseProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClaseProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClaseProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClaseProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClaseProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClaseProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoClaseProducto.add(this.jMenuItemDetalleCerrarClaseProducto);
		
		this.jmenuDetalleAccionesClaseProducto.add(this.jMenuItemActualizarClaseProducto);
		this.jmenuDetalleAccionesClaseProducto.add(this.jMenuItemEliminarClaseProducto);
		this.jmenuDetalleAccionesClaseProducto.add(this.jMenuItemCancelarClaseProducto);		
		
		//this.jmenuDetalleDatosClaseProducto.add(this.jMenuItemDetalleAbrirOrderByClaseProducto);				
		this.jmenuDetalleDatosClaseProducto.add(this.jMenuItemDetalleMostarOcultarClaseProducto);				
				
		//this.jmenuDetalleAccionesClaseProducto.add(this.jMenuItemGuardarCambiosClaseProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleClaseProducto.add(this.jmenuDetalleArchivoClaseProducto);		
		this.jmenuBarDetalleClaseProducto.add(this.jmenuDetalleAccionesClaseProducto);		
		this.jmenuBarDetalleClaseProducto.add(this.jmenuDetalleDatosClaseProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleClaseProducto.add(this.jmenuDetalleClaseProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleClaseProducto);				
	}
	
	
	public void inicializarElementosCamposClaseProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdClaseProducto = new JLabelMe();
		jLabelIdClaseProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidClaseProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidClaseProducto.setToolTipText(ClaseProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutClaseProducto= new GridBagLayout();

		this.jPanelidClaseProducto.setLayout(this.gridaBagLayoutClaseProducto);

		jLabelidClaseProducto = new JLabel();
		jLabelidClaseProducto.setText("Id");

		jLabelidClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoClaseProducto = new JLabelMe();
		this.jLabelcodigoClaseProducto.setText(""+ClaseProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoClaseProducto.setToolTipText("Codigo");
		this.jLabelcodigoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoClaseProducto.setToolTipText(ClaseProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutClaseProducto = new GridBagLayout();
		this.jPanelcodigoClaseProducto.setLayout(this.gridaBagLayoutClaseProducto);


		jTextFieldcodigoClaseProducto= new JTextFieldMe();

		jTextFieldcodigoClaseProducto.setEnabled(false);
		jTextFieldcodigoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoClaseProductoBusqueda= new JButtonMe();
		this.jButtoncodigoClaseProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoClaseProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoClaseProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoClaseProductoBusqueda.setText("U");
		this.jButtoncodigoClaseProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoClaseProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoClaseProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoClaseProductoBusqueda"));

		if(this.claseproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoClaseProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreClaseProducto = new JLabelMe();
		this.jLabelnombreClaseProducto.setText(""+ClaseProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreClaseProducto.setToolTipText("Nombre");
		this.jLabelnombreClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreClaseProducto.setToolTipText(ClaseProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutClaseProducto = new GridBagLayout();
		this.jPanelnombreClaseProducto.setLayout(this.gridaBagLayoutClaseProducto);


		jTextAreanombreClaseProducto= new JTextAreaMe();
		jTextAreanombreClaseProducto.setEnabled(false);
		jTextAreanombreClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreClaseProducto.setLineWrap(true);
		jTextAreanombreClaseProducto.setWrapStyleWord(true);
		jTextAreanombreClaseProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreClaseProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreClaseProducto = new JScrollPane(jTextAreanombreClaseProducto);
		jscrollPanenombreClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreClaseProductoBusqueda= new JButtonMe();
		this.jButtonnombreClaseProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClaseProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClaseProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreClaseProductoBusqueda.setText("U");
		this.jButtonnombreClaseProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreClaseProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreClaseProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreClaseProductoBusqueda"));

		if(this.claseproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreClaseProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysClaseProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaClaseProducto = new JLabelMe();
		this.jLabelid_empresaClaseProducto.setText(""+ClaseProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaClaseProducto.setToolTipText("Empresa");
		this.jLabelid_empresaClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaClaseProducto.setToolTipText(ClaseProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutClaseProducto = new GridBagLayout();
		this.jPanelid_empresaClaseProducto.setLayout(this.gridaBagLayoutClaseProducto);


		jComboBoxid_empresaClaseProducto= new JComboBoxMe();
		jComboBoxid_empresaClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaClaseProducto.setEnabled(false);

		this.jButtonid_empresaClaseProducto= new JButtonMe();
		this.jButtonid_empresaClaseProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClaseProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClaseProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClaseProducto.setText("Buscar");
		this.jButtonid_empresaClaseProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaClaseProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClaseProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClaseProducto"));

		this.jButtonid_empresaClaseProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaClaseProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClaseProductoBusqueda.setText("U");
		this.jButtonid_empresaClaseProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaClaseProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClaseProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClaseProductoBusqueda"));

		if(this.claseproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaClaseProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaClaseProductoUpdate= new JButtonMe();
		this.jButtonid_empresaClaseProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClaseProductoUpdate.setText("U");
		this.jButtonid_empresaClaseProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaClaseProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClaseProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClaseProductoUpdate"));



					
		this.jLabelid_tipo_productoClaseProducto = new JLabelMe();
		this.jLabelid_tipo_productoClaseProducto.setText(""+ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoClaseProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoClaseProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoClaseProducto.setToolTipText(ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutClaseProducto = new GridBagLayout();
		this.jPanelid_tipo_productoClaseProducto.setLayout(this.gridaBagLayoutClaseProducto);


		jComboBoxid_tipo_productoClaseProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoClaseProducto= new JButtonMe();
		this.jButtonid_tipo_productoClaseProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoClaseProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoClaseProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoClaseProducto.setText("Buscar");
		this.jButtonid_tipo_productoClaseProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoClaseProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoClaseProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoClaseProducto"));

		this.jButtonid_tipo_productoClaseProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoClaseProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoClaseProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoClaseProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoClaseProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoClaseProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoClaseProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoClaseProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoClaseProductoBusqueda"));

		if(this.claseproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoClaseProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoClaseProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoClaseProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoClaseProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoClaseProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoClaseProductoUpdate.setText("U");
		this.jButtonid_tipo_productoClaseProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoClaseProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoClaseProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoClaseProductoUpdate"));



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
		//this.jInternalFrameDetalleClaseProducto = new ClaseProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Clase Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClaseProducto= new GridBagLayout();
		

		
		String sToolTipClaseProducto="";
		sToolTipClaseProducto=ClaseProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClaseProducto+="(Inventario.ClaseProducto)";
		}
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipClaseProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoClaseProducto = new JButtonMe();
		this.jButtonModificarClaseProducto = new JButtonMe();
        this.jButtonActualizarClaseProducto = new JButtonMe();
        this.jButtonEliminarClaseProducto = new JButtonMe();
        this.jButtonCancelarClaseProducto = new JButtonMe();
        this.jButtonGuardarCambiosClaseProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaClaseProducto = new JButtonMe();
		this.jButtonCerrarClaseProducto = new JButtonMe();
		
		this.jScrollPanelDatosClaseProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionClaseProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralClaseProducto = new JScrollPane();
				
		
		
		this.jPanelCamposClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Clase Producto";
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosClaseProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposClaseProducto.setName("jPanelCamposClaseProducto"); 

		this.jPanelCamposOcultosClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosClaseProducto.setName("jPanelCamposOcultosClaseProducto"); 

        this.jPanelAccionesClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClaseProducto.setToolTipText("Acciones");
        this.jPanelAccionesClaseProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioClaseProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioClaseProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoClaseProducto.setText("Nuevo");
		this.jButtonModificarClaseProducto.setText("Editar");
        this.jButtonActualizarClaseProducto.setText("Actualizar");
        this.jButtonEliminarClaseProducto.setText("Eliminar");
        this.jButtonCancelarClaseProducto.setText("Cancelar");
        this.jButtonGuardarCambiosClaseProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaClaseProducto.setText("Guardar");
		this.jButtonCerrarClaseProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClaseProducto,"nuevo_button","Nuevo",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarClaseProducto,"modificar_button","Editar",this.claseproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarClaseProducto,"actualizar_button","Actualizar",this.claseproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarClaseProducto,"eliminar_button","Eliminar",this.claseproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarClaseProducto,"cancelar_button","Cancelar",this.claseproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosClaseProducto,"guardarcambios_button","Guardar",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClaseProducto,"guardarcambiostabla_button","Guardar",this.claseproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClaseProducto,"cerrar_button","Salir",this.claseproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoClaseProducto.setToolTipText("Nuevo"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarClaseProducto.setToolTipText("Editar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarClaseProducto.setToolTipText("Actualizar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarClaseProducto.setToolTipText("Eliminar)"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarClaseProducto.setToolTipText("Cancelar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosClaseProducto.setToolTipText("Guardar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaClaseProducto.setToolTipText("Guardar"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClaseProducto.setToolTipText("Salir"+" "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClaseProducto";
		inputMap = this.jButtonNuevoClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClaseProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClaseProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarClaseProducto";
		inputMap = this.jButtonActualizarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarClaseProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarClaseProducto";
		inputMap = this.jButtonEliminarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarClaseProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarClaseProducto";
		inputMap = this.jButtonCancelarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarClaseProducto"));
		
		//CERRAR		
		sMapKey = "CerrarClaseProducto";
		inputMap = this.jButtonCerrarClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClaseProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClaseProducto";
		inputMap = this.jButtonGuardarCambiosTablaClaseProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClaseProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClaseProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoClaseProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoClaseProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoClaseProducto.setToolTipText("Nuevo ClaseProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarClaseProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarClaseProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarClaseProducto.setToolTipText("Sin Cerrar Ventana ClaseProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeClaseProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeClaseProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeClaseProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClaseProducto.setText("Accion");
		this.jComboBoxTiposAccionesClaseProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioClaseProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioClaseProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioClaseProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesClaseProducto = new JLabelMe();
		
		this.jLabelAccionesClaseProducto.setText("Acciones");		
		this.jLabelAccionesClaseProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposClaseProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysClaseProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesClaseProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesClaseProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesClaseProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesClaseProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClaseProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioClaseProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClaseProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClaseProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioClaseProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposClaseProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosClaseProducto = new GridBagLayout();
		
		this.jPanelCamposClaseProducto.setLayout(gridaBagLayoutCamposClaseProducto);
		this.jPanelCamposOcultosClaseProducto.setLayout(gridaBagLayoutCamposOcultosClaseProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 0;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidClaseProducto.add(jLabelIdClaseProducto, this.gridBagConstraintsClaseProducto);



	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 1;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidClaseProducto.add(jLabelidClaseProducto, this.gridBagConstraintsClaseProducto);


	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 0;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaClaseProducto.add(jLabelid_empresaClaseProducto, this.gridBagConstraintsClaseProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 2;
		this.gridBagConstraintsClaseProducto.ipadx = 0;
		this.gridBagConstraintsClaseProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClaseProducto.add(jButtonid_empresaClaseProductoBusqueda, this.gridBagConstraintsClaseProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 3;
		this.gridBagConstraintsClaseProducto.ipadx = 0;
		this.gridBagConstraintsClaseProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClaseProducto.add(jButtonid_empresaClaseProductoUpdate, this.gridBagConstraintsClaseProducto);
	}

	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 1;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaClaseProducto.add(jComboBoxid_empresaClaseProducto, this.gridBagConstraintsClaseProducto);


	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 0;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoClaseProducto.add(jLabelid_tipo_productoClaseProducto, this.gridBagConstraintsClaseProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 2;
		this.gridBagConstraintsClaseProducto.ipadx = 0;
		this.gridBagConstraintsClaseProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoClaseProducto.add(jButtonid_tipo_productoClaseProductoBusqueda, this.gridBagConstraintsClaseProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 3;
		this.gridBagConstraintsClaseProducto.ipadx = 0;
		this.gridBagConstraintsClaseProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoClaseProducto.add(jButtonid_tipo_productoClaseProductoUpdate, this.gridBagConstraintsClaseProducto);
	}

	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 1;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoClaseProducto.add(jComboBoxid_tipo_productoClaseProducto, this.gridBagConstraintsClaseProducto);


	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 0;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoClaseProducto.add(jLabelcodigoClaseProducto, this.gridBagConstraintsClaseProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 2;
		this.gridBagConstraintsClaseProducto.ipadx = 0;
		this.gridBagConstraintsClaseProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoClaseProducto.add(jButtoncodigoClaseProductoBusqueda, this.gridBagConstraintsClaseProducto);
	}

	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 1;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoClaseProducto.add(jTextFieldcodigoClaseProducto, this.gridBagConstraintsClaseProducto);


	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 0;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreClaseProducto.add(jLabelnombreClaseProducto, this.gridBagConstraintsClaseProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		//this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = 2;
		this.gridBagConstraintsClaseProducto.ipadx = 0;
		this.gridBagConstraintsClaseProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreClaseProducto.add(jButtonnombreClaseProductoBusqueda, this.gridBagConstraintsClaseProducto);
	}

	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseProducto.gridy = 0;
	this.gridBagConstraintsClaseProducto.gridx = 1;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreClaseProducto.add(jscrollPanenombreClaseProducto, this.gridBagConstraintsClaseProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseProducto.gridy = iYPanelCamposClaseProducto;
	this.gridBagConstraintsClaseProducto.gridx = iXPanelCamposClaseProducto++;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseProducto.add(this.jPanelidClaseProducto, this.gridBagConstraintsClaseProducto);



	if(iXPanelCamposClaseProducto % 1==0) {
		iXPanelCamposClaseProducto=0;
		iYPanelCamposClaseProducto++;
	}
	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseProducto.gridy = iYPanelCamposClaseProducto;
	this.gridBagConstraintsClaseProducto.gridx = iXPanelCamposClaseProducto++;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseProducto.add(this.jPanelid_tipo_productoClaseProducto, this.gridBagConstraintsClaseProducto);



	if(iXPanelCamposClaseProducto % 1==0) {
		iXPanelCamposClaseProducto=0;
		iYPanelCamposClaseProducto++;
	}
	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseProducto.gridy = iYPanelCamposClaseProducto;
	this.gridBagConstraintsClaseProducto.gridx = iXPanelCamposClaseProducto++;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseProducto.add(this.jPanelcodigoClaseProducto, this.gridBagConstraintsClaseProducto);



	if(iXPanelCamposClaseProducto % 1==0) {
		iXPanelCamposClaseProducto=0;
		iYPanelCamposClaseProducto++;
	}
	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseProducto.gridy = iYPanelCamposClaseProducto;
	this.gridBagConstraintsClaseProducto.gridx = iXPanelCamposClaseProducto++;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseProducto.add(this.jPanelnombreClaseProducto, this.gridBagConstraintsClaseProducto);



	if(iXPanelCamposClaseProducto % 1==0) {
		iXPanelCamposClaseProducto=0;
		iYPanelCamposClaseProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseProducto.gridy = iYPanelCamposOcultosClaseProducto;
	this.gridBagConstraintsClaseProducto.gridx = iXPanelCamposOcultosClaseProducto++;
	this.gridBagConstraintsClaseProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosClaseProducto.add(this.jPanelid_empresaClaseProducto, this.gridBagConstraintsClaseProducto);



	if(iXPanelCamposOcultosClaseProducto % 1==0) {
		iXPanelCamposOcultosClaseProducto=0;
		iYPanelCamposOcultosClaseProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesClaseProducto= new GridBagLayout();
		this.jPanelAccionesClaseProducto.setLayout(gridaBagLayoutAccionesClaseProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioClaseProducto= new GridBagLayout();
		this.jPanelAccionesFormularioClaseProducto.setLayout(gridaBagLayoutAccionesFormularioClaseProducto);
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClaseProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClaseProducto.add(this.jComboBoxTiposAccionesFormularioClaseProducto, this.gridBagConstraintsClaseProducto);

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClaseProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClaseProducto.add(this.jCheckBoxPostAccionNuevoClaseProducto, this.gridBagConstraintsClaseProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClaseProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClaseProducto.add(this.jCheckBoxPostAccionSinCerrarClaseProducto, this.gridBagConstraintsClaseProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClaseProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClaseProducto.add(this.jCheckBoxPostAccionSinMensajeClaseProducto, this.gridBagConstraintsClaseProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesClaseProducto.add(this.jButtonModificarClaseProducto, this.gridBagConstraintsClaseProducto);							

		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseProducto.gridy = 0;
		this.gridBagConstraintsClaseProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesClaseProducto.add(this.jButtonEliminarClaseProducto, this.gridBagConstraintsClaseProducto);
		
			
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = 0;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesClaseProducto.add(this.jButtonActualizarClaseProducto, this.gridBagConstraintsClaseProducto);


		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = 0;		
		this.gridBagConstraintsClaseProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesClaseProducto.add(this.jButtonGuardarCambiosClaseProducto, this.gridBagConstraintsClaseProducto);	
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = 0;		
		this.gridBagConstraintsClaseProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesClaseProducto.add(this.jButtonCancelarClaseProducto, this.gridBagConstraintsClaseProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClaseProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClaseProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();						
			this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClaseProducto.gridx = 0;		
			//this.gridBagConstraintsClaseProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClaseProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClaseProducto.gridx =0;
		this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClaseProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClaseProducto, this.gridBagConstraintsClaseProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleClaseProducto = new ClaseProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Clase Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Clase Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Clase Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClaseProductoModel claseproductoModel=new ClaseProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//ClaseProductoModel.ClaseProductoFocusTraversalPolicy claseproductoFocusTraversalPolicy = claseproductoModel.new ClaseProductoFocusTraversalPolicy(this);
			
			//claseproductoFocusTraversalPolicy.setclaseproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(claseproductoModel);
			
			
			this.jContentPaneDetalleClaseProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleClaseProducto = new GridBagLayout();	
			this.jContentPaneDetalleClaseProducto.setLayout(gridaBagLayoutDetalleClaseProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClaseProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsClaseProducto = new GridBagConstraints();
				this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsClaseProducto.gridx = 0;
					
				
				this.jContentPaneDetalleClaseProducto.add(jTtoolBarDetalleClaseProducto, gridBagConstraintsClaseProducto);								
				
}
			
			this.jScrollPanelDatosEdicionClaseProducto=   new JScrollPane(jContentPaneDetalleClaseProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClaseProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralClaseProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClaseProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsClaseProducto.gridx = 0;
	        
			this.jContentPaneDetalleClaseProducto.add(jPanelCamposClaseProducto, gridBagConstraintsClaseProducto);
			
			
			
			
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
						&& claseproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsClaseProducto= new GridBagConstraints();
						this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsClaseProducto.gridx = 0;
						this.jContentPaneDetalleClaseProducto.add(this.jTabbedPaneRelacionesClaseProducto, this.gridBagConstraintsClaseProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesClaseProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosClaseProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsClaseProducto = new GridBagConstraints();
					this.gridBagConstraintsClaseProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsClaseProducto.gridx = 0;
					
				
					this.jContentPaneDetalleClaseProducto.add(jPanelCamposOcultosClaseProducto, gridBagConstraintsClaseProducto);
				
					this.jPanelCamposOcultosClaseProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsClaseProducto.gridx = 0;
	        this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleClaseProducto.add(this.jPanelAccionesFormularioClaseProducto, this.gridBagConstraintsClaseProducto);							
			
			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
	        this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsClaseProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleClaseProducto.add(this.jPanelAccionesClaseProducto, this.gridBagConstraintsClaseProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionClaseProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionClaseProducto=   new JScrollPane(this.jPanelCamposClaseProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClaseProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsClaseProducto.gridx = 0;
			this.gridBagConstraintsClaseProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsClaseProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsClaseProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionClaseProducto, this.gridBagConstraintsClaseProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClaseProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioClaseProducto, this.gridBagConstraintsClaseProducto);			
			
			this.gridBagConstraintsClaseProducto = new GridBagConstraints();
			this.gridBagConstraintsClaseProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClaseProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesClaseProducto, this.gridBagConstraintsClaseProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClaseProducto, this.gridBagConstraintsClaseProducto);
			
			
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClaseProducto, this.gridBagConstraintsClaseProducto);
		
			
		this.gridBagConstraintsClaseProducto = new GridBagConstraints();
		this.gridBagConstraintsClaseProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClaseProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClaseProducto, this.gridBagConstraintsClaseProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralClaseProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionClaseProducto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsClaseProducto = new GridBagConstraints();
				//this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsClaseProducto.gridx = 0;
				//this.jContentPaneDetalleClaseProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsClaseProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesClaseProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesClaseProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesClaseProducto.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoSessionBean=new ProductoSessionBean();
		this.productoSessionBean.setConGuardarRelaciones(false);
		this.productoSessionBean.setEsGuardarRelacionado(true);

		this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoSessionBean.getEsGuardarRelacionado()) {

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsClaseProducto = new GridBagConstraints();
				//this.gridBagConstraintsClaseProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsClaseProducto.gridx = 0;
				//this.jContentPaneDetalleClaseProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsClaseProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesClaseProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesClaseProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesClaseProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<ClaseProducto> claseproductos,ClaseProducto claseproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.claseproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.setclaseproductosForeignKey(claseproductos);
					productoBeanSwingJInternalFrame.setclaseproductoForeignKey(claseproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionClaseProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidClaseProductoActual(claseproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaClaseProducto(true);
					productoBeanSwingJInternalFrame.setid_clase_productoFK_IdClaseProducto(claseproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameClaseProductoForeignKey(claseproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdClaseProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdClaseProducto");
					productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(true);
					productoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProducto("n",productoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("relacionado");
					} else {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");
					}

					productoBeanSwingJInternalFrame.getjButtonRecargarInformacionProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<ClaseProducto> claseproductos,ClaseProducto claseproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.claseproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setclaseproductosForeignKey(claseproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setclaseproductoForeignKey(claseproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionClaseProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidClaseProductoActual(claseproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaClaseProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_clase_productoFK_IdClaseProducto(claseproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameClaseProductoForeignKey(claseproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdClaseProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdClaseProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

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
