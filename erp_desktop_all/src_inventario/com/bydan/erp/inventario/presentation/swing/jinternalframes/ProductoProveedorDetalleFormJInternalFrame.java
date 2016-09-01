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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.ProductoProveedorConstantesFunciones;

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
public class ProductoProveedorDetalleFormJInternalFrame extends ProductoProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoProveedor;
	
	protected JMenuBar jmenuBarDetalleProductoProveedor;
	
	protected JMenu jmenuDetalleProductoProveedor;
	protected JMenu jmenuDetalleArchivoProductoProveedor;
	protected JMenu jmenuDetalleAccionesProductoProveedor;
	protected JMenu jmenuDetalleDatosProductoProveedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProveedor;	
	protected GridBagConstraints gridBagConstraintsProductoProveedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoProveedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoProveedor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ProductoProveedorSessionBean productoproveedorSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public ProductoProveedorLogic productoproveedorLogic;
	
	public JScrollPane jScrollPanelDatosProductoProveedor;
	public JScrollPane jScrollPanelDatosEdicionProductoProveedor;
	public JScrollPane jScrollPanelDatosGeneralProductoProveedor;
	
	protected JPanel jPanelCamposProductoProveedor;    
	protected JPanel jPanelCamposOcultosProductoProveedor;    	
	protected JPanel jPanelAccionesProductoProveedor;
	protected JPanel jPanelAccionesFormularioProductoProveedor;
    
	
	
	protected Integer iXPanelCamposProductoProveedor=0;
	protected Integer iYPanelCamposProductoProveedor=0;
	
	protected Integer iXPanelCamposOcultosProductoProveedor=0;
	protected Integer iYPanelCamposOcultosProductoProveedor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoProveedor;
	public JButton jButtonModificarProductoProveedor;
	public JButton jButtonActualizarProductoProveedor;
    public JButton jButtonEliminarProductoProveedor;
	public JButton jButtonCancelarProductoProveedor;
    public JButton jButtonGuardarCambiosProductoProveedor;
	public JButton jButtonGuardarCambiosTablaProductoProveedor;
	protected JButton jButtonCerrarProductoProveedor;
	
	
	protected JButton jButtonProcesarInformacionProductoProveedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoProveedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoProveedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoProveedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProveedor;
	protected JButton jButtonModificarToolBarProductoProveedor;
	protected JButton jButtonActualizarToolBarProductoProveedor;
    protected JButton jButtonEliminarToolBarProductoProveedor;
	protected JButton jButtonCancelarToolBarProductoProveedor;
    protected JButton jButtonGuardarCambiosToolBarProductoProveedor;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProveedor;
	protected JButton jButtonCerrarToolBarProductoProveedor;
	
	protected JButton jButtonProcesarInformacionToolBarProductoProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProveedor;
	protected JMenuItem jMenuItemModificarProductoProveedor;
	protected JMenuItem jMenuItemActualizarProductoProveedor;
    protected JMenuItem jMenuItemEliminarProductoProveedor;
	protected JMenuItem jMenuItemCancelarProductoProveedor;
    protected JMenuItem jMenuItemGuardarCambiosProductoProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProveedor;
	protected JMenuItem jMenuItemCerrarProductoProveedor;
	protected JMenuItem jMenuItemDetalleCerrarProductoProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProveedor;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProveedor;
	protected JMenuItem jMenuItemMostrarOcultarProductoProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProveedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProveedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoProveedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoProveedor;
	public JLabel jLabelIdProductoProveedor;
	public JLabel jLabelidProductoProveedor;
	public JButton jButtonidProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ultimoProductoProveedor;
	public JLabel jLabelprecio_ultimoProductoProveedor;
	public JTextField jTextFieldprecio_ultimoProductoProveedor;
	public JButton jButtonprecio_ultimoProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelprecio_acuerdoProductoProveedor;
	public JLabel jLabelprecio_acuerdoProductoProveedor;
	public JTextField jTextFieldprecio_acuerdoProductoProveedor;
	public JButton jButtonprecio_acuerdoProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldia_entraProductoProveedor;
	public JLabel jLabeldia_entraProductoProveedor;
	public JTextField jTextFielddia_entraProductoProveedor;
	public JButton jButtondia_entraProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelobservacionProductoProveedor;
	public JLabel jLabelobservacionProductoProveedor;
	public JTextArea jTextAreaobservacionProductoProveedor;
	public JScrollPane jscrollPaneobservacionProductoProveedor;
	public JButton jButtonobservacionProductoProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoProveedor;
	public JLabel jLabelid_empresaProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoProveedor;
	public JButton jButtonid_empresaProductoProveedor= new JButtonMe();
	public JButton jButtonid_empresaProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoProveedor;
	public JLabel jLabelid_sucursalProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoProveedor;
	public JButton jButtonid_sucursalProductoProveedor= new JButtonMe();
	public JButton jButtonid_sucursalProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoProveedor;
	public JLabel jLabelid_bodegaProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoProveedor;
	public JButton jButtonid_bodegaProductoProveedor= new JButtonMe();
	public JButton jButtonid_bodegaProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoProveedor;
	public JLabel jLabelid_productoProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoProveedor;
	public JButton jButtonid_productoProductoProveedor= new JButtonMe();
	public JButton jButtonid_productoProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteProductoProveedor;
	public JLabel jLabelid_clienteProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteProductoProveedor;
	public JButton jButtonid_clienteProductoProveedor= new JButtonMe();
	public JButton jButtonid_clienteProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_clienteProductoProveedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoProveedor;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoProveedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoProveedor=new JPanel();
				this.jPanelAccionesFormularioProductoProveedor=new JPanel();
				this.jmenuBarDetalleProductoProveedor=new JMenuBar();
				this.jTtoolBarDetalleProductoProveedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoProveedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoProveedor() {
		return this.jButtonActualizarToolBarProductoProveedor;
	}
	
	public JButton getjButtonEliminarToolBarProductoProveedor() {
		return this.jButtonEliminarToolBarProductoProveedor;
	}
	
	public JButton getjButtonCancelarToolBarProductoProveedor() {
		return this.jButtonCancelarToolBarProductoProveedor;
	}		
	
	public JButton getjButtonProcesarInformacionProductoProveedor() {
		return this.jButtonProcesarInformacionProductoProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProveedor)	{
		this.jButtonProcesarInformacionProductoProveedor = jButtonProcesarInformacionProductoProveedor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProveedor() {
		return this.jComboBoxTiposAccionesProductoProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProveedor(
			JComboBox jComboBoxTiposRelacionesProductoProveedor) {
		this.jComboBoxTiposRelacionesProductoProveedor = jComboBoxTiposRelacionesProductoProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProveedor(
			JComboBox jComboBoxTiposAccionesProductoProveedor) {
		this.jComboBoxTiposAccionesProductoProveedor = jComboBoxTiposAccionesProductoProveedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoProveedor() {
		return this.jComboBoxTiposAccionesFormularioProductoProveedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoProveedor(
			JComboBox jComboBoxTiposAccionesFormularioProductoProveedor) {
		this.jComboBoxTiposAccionesFormularioProductoProveedor = jComboBoxTiposAccionesFormularioProductoProveedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
		
		this.productoproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoproveedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoProveedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoProveedor=new JButtonMe();
				this.jButtonModificarToolBarProductoProveedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoProveedor,this.jTtoolBarDetalleProductoProveedor,
							"actualizar","actualizar","Actualizar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoProveedor,this.jTtoolBarDetalleProductoProveedor,
							"eliminar","eliminar","Eliminar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoProveedor,this.jTtoolBarDetalleProductoProveedor,
							"cancelar","cancelar","Cancelar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoProveedor,this.jTtoolBarDetalleProductoProveedor,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoProveedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoProveedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoProveedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoProveedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoProveedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoProveedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoProveedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoProveedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoProveedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoProveedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoProveedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoProveedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoProveedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoProveedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoProveedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoProveedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoProveedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoProveedor.add(this.jMenuItemDetalleCerrarProductoProveedor);
		
		this.jmenuDetalleAccionesProductoProveedor.add(this.jMenuItemActualizarProductoProveedor);
		this.jmenuDetalleAccionesProductoProveedor.add(this.jMenuItemEliminarProductoProveedor);
		this.jmenuDetalleAccionesProductoProveedor.add(this.jMenuItemCancelarProductoProveedor);		
		
		//this.jmenuDetalleDatosProductoProveedor.add(this.jMenuItemDetalleAbrirOrderByProductoProveedor);				
		this.jmenuDetalleDatosProductoProveedor.add(this.jMenuItemDetalleMostarOcultarProductoProveedor);				
				
		//this.jmenuDetalleAccionesProductoProveedor.add(this.jMenuItemGuardarCambiosProductoProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoProveedor.add(this.jmenuDetalleArchivoProductoProveedor);		
		this.jmenuBarDetalleProductoProveedor.add(this.jmenuDetalleAccionesProductoProveedor);		
		this.jmenuBarDetalleProductoProveedor.add(this.jmenuDetalleDatosProductoProveedor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoProveedor);				
	}
	
	
	public void inicializarElementosCamposProductoProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoProveedor = new JLabelMe();
		jLabelIdProductoProveedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoProveedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoProveedor= new GridBagLayout();

		this.jPanelidProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);

		jLabelidProductoProveedor = new JLabel();
		jLabelidProductoProveedor.setText("Id");

		jLabelidProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecio_ultimoProductoProveedor = new JLabelMe();
		this.jLabelprecio_ultimoProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO+" : *");
		this.jLabelprecio_ultimoProductoProveedor.setToolTipText("Precio Ultimo");
		this.jLabelprecio_ultimoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_ultimoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_ultimoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ultimoProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ultimoProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ultimoProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelprecio_ultimoProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jTextFieldprecio_ultimoProductoProveedor= new JTextFieldMe();
		jTextFieldprecio_ultimoProductoProveedor.setEnabled(false);
		jTextFieldprecio_ultimoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultimoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ultimoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ultimoProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ultimoProductoProveedor.setText("0.0");

		this.jButtonprecio_ultimoProductoProveedorBusqueda= new JButtonMe();
		this.jButtonprecio_ultimoProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultimoProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ultimoProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ultimoProductoProveedorBusqueda.setText("U");
		this.jButtonprecio_ultimoProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ultimoProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ultimoProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ultimoProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ultimoProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ultimoProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ultimoProductoProveedorBusqueda.setVisible(false);		}


					
		this.jLabelprecio_acuerdoProductoProveedor = new JLabelMe();
		this.jLabelprecio_acuerdoProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO+" : *");
		this.jLabelprecio_acuerdoProductoProveedor.setToolTipText("Precio Acuerdo");
		this.jLabelprecio_acuerdoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_acuerdoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_acuerdoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_acuerdoProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_acuerdoProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_acuerdoProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelprecio_acuerdoProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jTextFieldprecio_acuerdoProductoProveedor= new JTextFieldMe();
		jTextFieldprecio_acuerdoProductoProveedor.setEnabled(false);
		jTextFieldprecio_acuerdoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_acuerdoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_acuerdoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_acuerdoProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_acuerdoProductoProveedor.setText("0.0");

		this.jButtonprecio_acuerdoProductoProveedorBusqueda= new JButtonMe();
		this.jButtonprecio_acuerdoProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_acuerdoProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_acuerdoProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_acuerdoProductoProveedorBusqueda.setText("U");
		this.jButtonprecio_acuerdoProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_acuerdoProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_acuerdoProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_acuerdoProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_acuerdoProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_acuerdoProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_acuerdoProductoProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldia_entraProductoProveedor = new JLabelMe();
		this.jLabeldia_entraProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_DIAENTRA+" : *");
		this.jLabeldia_entraProductoProveedor.setToolTipText("Dia Entra");
		this.jLabeldia_entraProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_entraProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_entraProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_entraProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_entraProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_entraProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPaneldia_entraProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jTextFielddia_entraProductoProveedor= new JTextFieldMe();
		jTextFielddia_entraProductoProveedor.setEnabled(false);
		jTextFielddia_entraProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_entraProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_entraProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_entraProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_entraProductoProveedor.setText("0");

		this.jButtondia_entraProductoProveedorBusqueda= new JButtonMe();
		this.jButtondia_entraProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_entraProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_entraProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_entraProductoProveedorBusqueda.setText("U");
		this.jButtondia_entraProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_entraProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_entraProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_entraProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_entraProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_entraProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_entraProductoProveedorBusqueda.setVisible(false);		}


					
		this.jLabelobservacionProductoProveedor = new JLabelMe();
		this.jLabelobservacionProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionProductoProveedor.setToolTipText("Observacion");
		this.jLabelobservacionProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelobservacionProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jTextAreaobservacionProductoProveedor= new JTextAreaMe();
		jTextAreaobservacionProductoProveedor.setEnabled(false);
		jTextAreaobservacionProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionProductoProveedor.setLineWrap(true);
		jTextAreaobservacionProductoProveedor.setWrapStyleWord(true);
		jTextAreaobservacionProductoProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionProductoProveedor.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionProductoProveedor = new JScrollPane(jTextAreaobservacionProductoProveedor);
		jscrollPaneobservacionProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionProductoProveedorBusqueda= new JButtonMe();
		this.jButtonobservacionProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionProductoProveedorBusqueda.setText("U");
		this.jButtonobservacionProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionProductoProveedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoProveedor = new JLabelMe();
		this.jLabelid_empresaProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoProveedor.setToolTipText("Empresa");
		this.jLabelid_empresaProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelid_empresaProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jComboBoxid_empresaProductoProveedor= new JComboBoxMe();
		jComboBoxid_empresaProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoProveedor.setEnabled(false);

		this.jButtonid_empresaProductoProveedor= new JButtonMe();
		this.jButtonid_empresaProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoProveedor.setText("Buscar");
		this.jButtonid_empresaProductoProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoProveedor"));

		this.jButtonid_empresaProductoProveedorBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoProveedorBusqueda.setText("U");
		this.jButtonid_empresaProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoProveedorUpdate= new JButtonMe();
		this.jButtonid_empresaProductoProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoProveedorUpdate.setText("U");
		this.jButtonid_empresaProductoProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoProveedorUpdate"));



					
		this.jLabelid_sucursalProductoProveedor = new JLabelMe();
		this.jLabelid_sucursalProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoProveedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelid_sucursalProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jComboBoxid_sucursalProductoProveedor= new JComboBoxMe();
		jComboBoxid_sucursalProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoProveedor.setEnabled(false);

		this.jButtonid_sucursalProductoProveedor= new JButtonMe();
		this.jButtonid_sucursalProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoProveedor.setText("Buscar");
		this.jButtonid_sucursalProductoProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoProveedor"));

		this.jButtonid_sucursalProductoProveedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoProveedorBusqueda.setText("U");
		this.jButtonid_sucursalProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoProveedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoProveedorUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoProveedorUpdate.setText("U");
		this.jButtonid_sucursalProductoProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoProveedorUpdate"));



					
		this.jLabelid_bodegaProductoProveedor = new JLabelMe();
		this.jLabelid_bodegaProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoProveedor.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelid_bodegaProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jComboBoxid_bodegaProductoProveedor= new JComboBoxMe();
		jComboBoxid_bodegaProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoProveedor= new JButtonMe();
		this.jButtonid_bodegaProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoProveedor.setText("Buscar");
		this.jButtonid_bodegaProductoProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoProveedor"));

		this.jButtonid_bodegaProductoProveedorBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoProveedorBusqueda.setText("U");
		this.jButtonid_bodegaProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoProveedorBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoProveedorUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoProveedorUpdate.setText("U");
		this.jButtonid_bodegaProductoProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoProveedorUpdate"));



					
		this.jLabelid_productoProductoProveedor = new JLabelMe();
		this.jLabelid_productoProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoProveedor.setToolTipText("Producto");
		this.jLabelid_productoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelid_productoProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jComboBoxid_productoProductoProveedor= new JComboBoxMe();
		jComboBoxid_productoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoProveedor= new JButtonMe();
		this.jButtonid_productoProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoProveedor.setText("Buscar");
		this.jButtonid_productoProductoProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoProveedor"));

		this.jButtonid_productoProductoProveedorBusqueda= new JButtonMe();
		this.jButtonid_productoProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoProveedorBusqueda.setText("U");
		this.jButtonid_productoProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoProveedorBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoProveedorUpdate= new JButtonMe();
		this.jButtonid_productoProductoProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoProveedorUpdate.setText("U");
		this.jButtonid_productoProductoProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoProveedorUpdate"));



					
		this.jLabelid_clienteProductoProveedor = new JLabelMe();
		this.jLabelid_clienteProductoProveedor.setText(""+ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteProductoProveedor.setToolTipText("Cliente");
		this.jLabelid_clienteProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteProductoProveedor.setToolTipText(ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutProductoProveedor = new GridBagLayout();
		this.jPanelid_clienteProductoProveedor.setLayout(this.gridaBagLayoutProductoProveedor);


		jComboBoxid_clienteProductoProveedor= new JComboBoxMe();
		jComboBoxid_clienteProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteProductoProveedor= new JButtonMe();
		this.jButtonid_clienteProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProductoProveedor.setText("Buscar");
		this.jButtonid_clienteProductoProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteProductoProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProductoProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProductoProveedor"));

		this.jButtonid_clienteProductoProveedorBusqueda= new JButtonMe();
		this.jButtonid_clienteProductoProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProductoProveedorBusqueda.setText("U");
		this.jButtonid_clienteProductoProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteProductoProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProductoProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProductoProveedorBusqueda"));

		if(this.productoproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteProductoProveedorBusqueda.setVisible(false);		}

		this.jButtonid_clienteProductoProveedorUpdate= new JButtonMe();
		this.jButtonid_clienteProductoProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProductoProveedorUpdate.setText("U");
		this.jButtonid_clienteProductoProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteProductoProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProductoProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProductoProveedorUpdate"));



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
		//this.jInternalFrameDetalleProductoProveedor = new ProductoProveedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProveedor= new GridBagLayout();
		

		
		String sToolTipProductoProveedor="";
		sToolTipProductoProveedor=ProductoProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProveedor+="(Inventario.ProductoProveedor)";
		}
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProveedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoProveedor = new JButtonMe();
		this.jButtonModificarProductoProveedor = new JButtonMe();
        this.jButtonActualizarProductoProveedor = new JButtonMe();
        this.jButtonEliminarProductoProveedor = new JButtonMe();
        this.jButtonCancelarProductoProveedor = new JButtonMe();
        this.jButtonGuardarCambiosProductoProveedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoProveedor = new JButtonMe();
		this.jButtonCerrarProductoProveedor = new JButtonMe();
		
		this.jScrollPanelDatosProductoProveedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoProveedor = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoProveedor = new JScrollPane();
				
		
		
		this.jPanelCamposProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Proveedor";
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoProveedor.setName("jPanelCamposProductoProveedor"); 

		this.jPanelCamposOcultosProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoProveedor.setName("jPanelCamposOcultosProductoProveedor"); 

        this.jPanelAccionesProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProveedor.setToolTipText("Acciones");
        this.jPanelAccionesProductoProveedor.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoProveedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoProveedor.setText("Nuevo");
		this.jButtonModificarProductoProveedor.setText("Editar");
        this.jButtonActualizarProductoProveedor.setText("Actualizar");
        this.jButtonEliminarProductoProveedor.setText("Eliminar");
        this.jButtonCancelarProductoProveedor.setText("Cancelar");
        this.jButtonGuardarCambiosProductoProveedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoProveedor.setText("Guardar");
		this.jButtonCerrarProductoProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProveedor,"nuevo_button","Nuevo",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoProveedor,"modificar_button","Editar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoProveedor,"actualizar_button","Actualizar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoProveedor,"eliminar_button","Eliminar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoProveedor,"cancelar_button","Cancelar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoProveedor,"guardarcambios_button","Guardar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProveedor,"guardarcambiostabla_button","Guardar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProveedor,"cerrar_button","Salir",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoProveedor.setToolTipText("Nuevo"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoProveedor.setToolTipText("Editar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoProveedor.setToolTipText("Actualizar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoProveedor.setToolTipText("Eliminar)"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoProveedor.setToolTipText("Cancelar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoProveedor.setToolTipText("Guardar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoProveedor.setToolTipText("Guardar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProveedor.setToolTipText("Salir"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProveedor";
		inputMap = this.jButtonNuevoProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProveedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoProveedor";
		inputMap = this.jButtonActualizarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoProveedor"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoProveedor";
		inputMap = this.jButtonEliminarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoProveedor"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoProveedor";
		inputMap = this.jButtonCancelarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoProveedor"));
		
		//CERRAR		
		sMapKey = "CerrarProductoProveedor";
		inputMap = this.jButtonCerrarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProveedor";
		inputMap = this.jButtonGuardarCambiosTablaProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProveedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoProveedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoProveedor.setToolTipText("Nuevo ProductoProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoProveedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoProveedor.setToolTipText("Sin Cerrar Ventana ProductoProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoProveedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoProveedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProveedor.setText("Accion");
		this.jComboBoxTiposAccionesProductoProveedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoProveedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoProveedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoProveedor = new JLabelMe();
		
		this.jLabelAccionesProductoProveedor.setText("Acciones");		
		this.jLabelAccionesProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoProveedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoProveedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoProveedor=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProveedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoProveedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoProveedor = new GridBagLayout();
		
		this.jPanelCamposProductoProveedor.setLayout(gridaBagLayoutCamposProductoProveedor);
		this.jPanelCamposOcultosProductoProveedor.setLayout(gridaBagLayoutCamposOcultosProductoProveedor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoProveedor.add(jLabelIdProductoProveedor, this.gridBagConstraintsProductoProveedor);



	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoProveedor.add(jLabelidProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoProveedor.add(jLabelid_empresaProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoProveedor.add(jButtonid_empresaProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 3;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoProveedor.add(jButtonid_empresaProductoProveedorUpdate, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoProveedor.add(jComboBoxid_empresaProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoProveedor.add(jLabelid_sucursalProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoProveedor.add(jButtonid_sucursalProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 3;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoProveedor.add(jButtonid_sucursalProductoProveedorUpdate, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoProveedor.add(jComboBoxid_sucursalProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoProveedor.add(jLabelid_bodegaProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoProveedor.add(jButtonid_bodegaProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 3;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoProveedor.add(jButtonid_bodegaProductoProveedorUpdate, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoProveedor.add(jComboBoxid_bodegaProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoProveedor.add(jLabelid_productoProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 2;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoProveedor.add(jButtonid_productoProductoProveedor, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 3;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoProveedor.add(jButtonid_productoProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 4;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoProveedor.add(jButtonid_productoProductoProveedorUpdate, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoProveedor.add(jComboBoxid_productoProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteProductoProveedor.add(jLabelid_clienteProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 2;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteProductoProveedor.add(jButtonid_clienteProductoProveedor, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 3;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProductoProveedor.add(jButtonid_clienteProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 4;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProductoProveedor.add(jButtonid_clienteProductoProveedorUpdate, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteProductoProveedor.add(jComboBoxid_clienteProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ultimoProductoProveedor.add(jLabelprecio_ultimoProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ultimoProductoProveedor.add(jButtonprecio_ultimoProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ultimoProductoProveedor.add(jTextFieldprecio_ultimoProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_acuerdoProductoProveedor.add(jLabelprecio_acuerdoProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_acuerdoProductoProveedor.add(jButtonprecio_acuerdoProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_acuerdoProductoProveedor.add(jTextFieldprecio_acuerdoProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_entraProductoProveedor.add(jLabeldia_entraProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_entraProductoProveedor.add(jButtondia_entraProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_entraProductoProveedor.add(jTextFielddia_entraProductoProveedor, this.gridBagConstraintsProductoProveedor);


	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 0;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionProductoProveedor.add(jLabelobservacionProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 2;
		this.gridBagConstraintsProductoProveedor.ipadx = 0;
		this.gridBagConstraintsProductoProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionProductoProveedor.add(jButtonobservacionProductoProveedorBusqueda, this.gridBagConstraintsProductoProveedor);
	}

	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProveedor.gridy = 0;
	this.gridBagConstraintsProductoProveedor.gridx = 1;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionProductoProveedor.add(jscrollPaneobservacionProductoProveedor, this.gridBagConstraintsProductoProveedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelidProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelid_bodegaProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelid_productoProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelid_clienteProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelprecio_ultimoProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelprecio_acuerdoProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPaneldia_entraProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProveedor.add(this.jPanelobservacionProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposProductoProveedor % 1==0) {
		iXPanelCamposProductoProveedor=0;
		iYPanelCamposProductoProveedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposOcultosProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposOcultosProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoProveedor.add(this.jPanelid_empresaProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposOcultosProductoProveedor % 1==0) {
		iXPanelCamposOcultosProductoProveedor=0;
		iYPanelCamposOcultosProductoProveedor++;
	}
	this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProveedor.gridy = iYPanelCamposOcultosProductoProveedor;
	this.gridBagConstraintsProductoProveedor.gridx = iXPanelCamposOcultosProductoProveedor++;
	this.gridBagConstraintsProductoProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoProveedor.add(this.jPanelid_sucursalProductoProveedor, this.gridBagConstraintsProductoProveedor);



	if(iXPanelCamposOcultosProductoProveedor % 1==0) {
		iXPanelCamposOcultosProductoProveedor=0;
		iYPanelCamposOcultosProductoProveedor++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoProveedor= new GridBagLayout();
		this.jPanelAccionesProductoProveedor.setLayout(gridaBagLayoutAccionesProductoProveedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoProveedor= new GridBagLayout();
		this.jPanelAccionesFormularioProductoProveedor.setLayout(gridaBagLayoutAccionesFormularioProductoProveedor);
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProveedor.add(this.jComboBoxTiposAccionesFormularioProductoProveedor, this.gridBagConstraintsProductoProveedor);

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProveedor.add(this.jCheckBoxPostAccionNuevoProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProveedor.add(this.jCheckBoxPostAccionSinCerrarProductoProveedor, this.gridBagConstraintsProductoProveedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProveedor.add(this.jCheckBoxPostAccionSinMensajeProductoProveedor, this.gridBagConstraintsProductoProveedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoProveedor.add(this.jButtonModificarProductoProveedor, this.gridBagConstraintsProductoProveedor);							

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoProveedor.add(this.jButtonEliminarProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = 0;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProveedor.add(this.jButtonActualizarProductoProveedor, this.gridBagConstraintsProductoProveedor);


		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = 0;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProveedor.add(this.jButtonGuardarCambiosProductoProveedor, this.gridBagConstraintsProductoProveedor);	
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = 0;		
		this.gridBagConstraintsProductoProveedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoProveedor.add(this.jButtonCancelarProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProveedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();						
			this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProveedor.gridx = 0;		
			//this.gridBagConstraintsProductoProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProveedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProveedor.gridx =0;
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProveedor, this.gridBagConstraintsProductoProveedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoProveedor = new ProductoProveedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Proveedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Proveedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Proveedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoProveedorModel productoproveedorModel=new ProductoProveedorModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoProveedorModel.ProductoProveedorFocusTraversalPolicy productoproveedorFocusTraversalPolicy = productoproveedorModel.new ProductoProveedorFocusTraversalPolicy(this);
			
			//productoproveedorFocusTraversalPolicy.setproductoproveedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoproveedorModel);
			
			
			this.jContentPaneDetalleProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoProveedor = new GridBagLayout();	
			this.jContentPaneDetalleProductoProveedor.setLayout(gridaBagLayoutDetalleProductoProveedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProveedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
				this.gridBagConstraintsProductoProveedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoProveedor.gridx = 0;
					
				
				this.jContentPaneDetalleProductoProveedor.add(jTtoolBarDetalleProductoProveedor, gridBagConstraintsProductoProveedor);								
				
}
			
			this.jScrollPanelDatosEdicionProductoProveedor=   new JScrollPane(jContentPaneDetalleProductoProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoProveedor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoProveedor.gridx = 0;
	        
			this.jContentPaneDetalleProductoProveedor.add(jPanelCamposProductoProveedor, gridBagConstraintsProductoProveedor);
			
			
			
			
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
						&& productoproveedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoProveedor= new GridBagConstraints();
						this.gridBagConstraintsProductoProveedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoProveedor.gridx = 0;
						this.jContentPaneDetalleProductoProveedor.add(this.jTabbedPaneRelacionesProductoProveedor, this.gridBagConstraintsProductoProveedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoProveedor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoProveedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
					this.gridBagConstraintsProductoProveedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoProveedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoProveedor.gridx = 0;
					
				
					this.jContentPaneDetalleProductoProveedor.add(jPanelCamposOcultosProductoProveedor, gridBagConstraintsProductoProveedor);
				
					this.jPanelCamposOcultosProductoProveedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoProveedor.gridx = 0;
	        this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoProveedor.add(this.jPanelAccionesFormularioProductoProveedor, this.gridBagConstraintsProductoProveedor);							
			
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
	        this.gridBagConstraintsProductoProveedor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoProveedor.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoProveedor.add(this.jPanelAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoProveedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoProveedor=   new JScrollPane(this.jPanelCamposProductoProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoProveedor.gridx = 0;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoProveedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoProveedor, this.gridBagConstraintsProductoProveedor);			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoProveedor;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoProveedor;
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
