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
import com.bydan.erp.inventario.util.ProveedorProductoConstantesFunciones;

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
public class ProveedorProductoDetalleFormJInternalFrame extends ProveedorProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProveedorProducto;
	
	protected JMenuBar jmenuBarDetalleProveedorProducto;
	
	protected JMenu jmenuDetalleProveedorProducto;
	protected JMenu jmenuDetalleArchivoProveedorProducto;
	protected JMenu jmenuDetalleAccionesProveedorProducto;
	protected JMenu jmenuDetalleDatosProveedorProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProveedorProducto;	
	protected GridBagConstraints gridBagConstraintsProveedorProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProveedorProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProveedorProducto;		
	
	
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
	
	public ProveedorProductoSessionBean proveedorproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public ProveedorProductoLogic proveedorproductoLogic;
	
	public JScrollPane jScrollPanelDatosProveedorProducto;
	public JScrollPane jScrollPanelDatosEdicionProveedorProducto;
	public JScrollPane jScrollPanelDatosGeneralProveedorProducto;
	
	protected JPanel jPanelCamposProveedorProducto;    
	protected JPanel jPanelCamposOcultosProveedorProducto;    	
	protected JPanel jPanelAccionesProveedorProducto;
	protected JPanel jPanelAccionesFormularioProveedorProducto;
    
	
	
	protected Integer iXPanelCamposProveedorProducto=0;
	protected Integer iYPanelCamposProveedorProducto=0;
	
	protected Integer iXPanelCamposOcultosProveedorProducto=0;
	protected Integer iYPanelCamposOcultosProveedorProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProveedorProducto;
	public JButton jButtonModificarProveedorProducto;
	public JButton jButtonActualizarProveedorProducto;
    public JButton jButtonEliminarProveedorProducto;
	public JButton jButtonCancelarProveedorProducto;
    public JButton jButtonGuardarCambiosProveedorProducto;
	public JButton jButtonGuardarCambiosTablaProveedorProducto;
	protected JButton jButtonCerrarProveedorProducto;
	
	
	protected JButton jButtonProcesarInformacionProveedorProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProveedorProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProveedorProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProveedorProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProveedorProducto;
	protected JButton jButtonModificarToolBarProveedorProducto;
	protected JButton jButtonActualizarToolBarProveedorProducto;
    protected JButton jButtonEliminarToolBarProveedorProducto;
	protected JButton jButtonCancelarToolBarProveedorProducto;
    protected JButton jButtonGuardarCambiosToolBarProveedorProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarProveedorProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarProveedorProducto;
	protected JButton jButtonCerrarToolBarProveedorProducto;
	
	protected JButton jButtonProcesarInformacionToolBarProveedorProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProveedorProducto;
	protected JMenuItem jMenuItemModificarProveedorProducto;
	protected JMenuItem jMenuItemActualizarProveedorProducto;
    protected JMenuItem jMenuItemEliminarProveedorProducto;
	protected JMenuItem jMenuItemCancelarProveedorProducto;
    protected JMenuItem jMenuItemGuardarCambiosProveedorProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProveedorProducto;
	protected JMenuItem jMenuItemCerrarProveedorProducto;
	protected JMenuItem jMenuItemDetalleCerrarProveedorProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProveedorProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionProveedorProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProveedorProducto;
	protected JMenuItem jMenuItemMostrarOcultarProveedorProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProveedorProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProveedorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProveedorProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProveedorProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProveedorProducto;
	public JLabel jLabelIdProveedorProducto;
	public JLabel jLabelidProveedorProducto;
	public JButton jButtonidProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPanelultimo_precioProveedorProducto;
	public JLabel jLabelultimo_precioProveedorProducto;
	public JTextField jTextFieldultimo_precioProveedorProducto;
	public JButton jButtonultimo_precioProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPanelprecio_pactadoProveedorProducto;
	public JLabel jLabelprecio_pactadoProveedorProducto;
	public JTextField jTextFieldprecio_pactadoProveedorProducto;
	public JButton jButtonprecio_pactadoProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPaneldias_entregaProveedorProducto;
	public JLabel jLabeldias_entregaProveedorProducto;
	public JTextField jTextFielddias_entregaProveedorProducto;
	public JButton jButtondias_entregaProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProveedorProducto;
	public JLabel jLabeldescripcionProveedorProducto;
	public JTextArea jTextAreadescripcionProveedorProducto;
	public JScrollPane jscrollPanedescripcionProveedorProducto;
	public JButton jButtondescripcionProveedorProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProveedorProducto;
	public JLabel jLabelid_empresaProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProveedorProducto;
	public JButton jButtonid_empresaProveedorProducto= new JButtonMe();
	public JButton jButtonid_empresaProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProveedorProducto;
	public JLabel jLabelid_sucursalProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProveedorProducto;
	public JButton jButtonid_sucursalProveedorProducto= new JButtonMe();
	public JButton jButtonid_sucursalProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProveedorProducto;
	public JLabel jLabelid_bodegaProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProveedorProducto;
	public JButton jButtonid_bodegaProveedorProducto= new JButtonMe();
	public JButton jButtonid_bodegaProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProveedorProducto;
	public JLabel jLabelid_productoProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProveedorProducto;
	public JButton jButtonid_productoProveedorProducto= new JButtonMe();
	public JButton jButtonid_productoProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoProveedorProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteProveedorProducto;
	public JLabel jLabelid_clienteProveedorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteProveedorProducto;
	public JButton jButtonid_clienteProveedorProducto= new JButtonMe();
	public JButton jButtonid_clienteProveedorProductoUpdate= new JButtonMe();
	public JButton jButtonid_clienteProveedorProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProveedorProducto;
	
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
	
	public ProveedorProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProveedorProducto=new JPanel();
				this.jPanelAccionesFormularioProveedorProducto=new JPanel();
				this.jmenuBarDetalleProveedorProducto=new JMenuBar();
				this.jTtoolBarDetalleProveedorProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProveedorProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProveedorProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProveedorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProveedorProducto() {
		return this.jButtonActualizarToolBarProveedorProducto;
	}
	
	public JButton getjButtonEliminarToolBarProveedorProducto() {
		return this.jButtonEliminarToolBarProveedorProducto;
	}
	
	public JButton getjButtonCancelarToolBarProveedorProducto() {
		return this.jButtonCancelarToolBarProveedorProducto;
	}		
	
	public JButton getjButtonProcesarInformacionProveedorProducto() {
		return this.jButtonProcesarInformacionProveedorProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProveedorProducto)	{
		this.jButtonProcesarInformacionProveedorProducto = jButtonProcesarInformacionProveedorProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProveedorProducto() {
		return this.jComboBoxTiposAccionesProveedorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProveedorProducto(
			JComboBox jComboBoxTiposRelacionesProveedorProducto) {
		this.jComboBoxTiposRelacionesProveedorProducto = jComboBoxTiposRelacionesProveedorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProveedorProducto(
			JComboBox jComboBoxTiposAccionesProveedorProducto) {
		this.jComboBoxTiposAccionesProveedorProducto = jComboBoxTiposAccionesProveedorProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProveedorProducto() {
		return this.jComboBoxTiposAccionesFormularioProveedorProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProveedorProducto(
			JComboBox jComboBoxTiposAccionesFormularioProveedorProducto) {
		this.jComboBoxTiposAccionesFormularioProveedorProducto = jComboBoxTiposAccionesFormularioProveedorProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		
		this.proveedorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.proveedorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.proveedorproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProveedorProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
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
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProveedorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProveedorProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProveedorProducto=new JButtonMe();
				this.jButtonModificarToolBarProveedorProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProveedorProducto,this.jTtoolBarDetalleProveedorProducto,
							"actualizar","actualizar","Actualizar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProveedorProducto,this.jTtoolBarDetalleProveedorProducto,
							"eliminar","eliminar","Eliminar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProveedorProducto,this.jTtoolBarDetalleProveedorProducto,
							"cancelar","cancelar","Cancelar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProveedorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProveedorProducto,this.jTtoolBarDetalleProveedorProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProveedorProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProveedorProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProveedorProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProveedorProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProveedorProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProveedorProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProveedorProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProveedorProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProveedorProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProveedorProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProveedorProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProveedorProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProveedorProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProveedorProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProveedorProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProveedorProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProveedorProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProveedorProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProveedorProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProveedorProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProveedorProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProveedorProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProveedorProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProveedorProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProveedorProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProveedorProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProveedorProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProveedorProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProveedorProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProveedorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProveedorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProveedorProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProveedorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProveedorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProveedorProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProveedorProducto.add(this.jMenuItemDetalleCerrarProveedorProducto);
		
		this.jmenuDetalleAccionesProveedorProducto.add(this.jMenuItemActualizarProveedorProducto);
		this.jmenuDetalleAccionesProveedorProducto.add(this.jMenuItemEliminarProveedorProducto);
		this.jmenuDetalleAccionesProveedorProducto.add(this.jMenuItemCancelarProveedorProducto);		
		
		//this.jmenuDetalleDatosProveedorProducto.add(this.jMenuItemDetalleAbrirOrderByProveedorProducto);				
		this.jmenuDetalleDatosProveedorProducto.add(this.jMenuItemDetalleMostarOcultarProveedorProducto);				
				
		//this.jmenuDetalleAccionesProveedorProducto.add(this.jMenuItemGuardarCambiosProveedorProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProveedorProducto.add(this.jmenuDetalleArchivoProveedorProducto);		
		this.jmenuBarDetalleProveedorProducto.add(this.jmenuDetalleAccionesProveedorProducto);		
		this.jmenuBarDetalleProveedorProducto.add(this.jmenuDetalleDatosProveedorProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProveedorProducto);				
	}
	
	
	public void inicializarElementosCamposProveedorProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProveedorProducto = new JLabelMe();
		jLabelIdProveedorProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProveedorProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProveedorProducto= new GridBagLayout();

		this.jPanelidProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);

		jLabelidProveedorProducto = new JLabel();
		jLabelidProveedorProducto.setText("Id");

		jLabelidProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelultimo_precioProveedorProducto = new JLabelMe();
		this.jLabelultimo_precioProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO+" : *");
		this.jLabelultimo_precioProveedorProducto.setToolTipText("Ultimo Precio");
		this.jLabelultimo_precioProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_precioProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_precioProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_precioProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_precioProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_precioProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelultimo_precioProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jTextFieldultimo_precioProveedorProducto= new JTextFieldMe();
		jTextFieldultimo_precioProveedorProducto.setEnabled(false);
		jTextFieldultimo_precioProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_precioProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_precioProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_precioProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_precioProveedorProducto.setText("0.0");

		this.jButtonultimo_precioProveedorProductoBusqueda= new JButtonMe();
		this.jButtonultimo_precioProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_precioProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_precioProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_precioProveedorProductoBusqueda.setText("U");
		this.jButtonultimo_precioProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_precioProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_precioProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_precioProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_precioProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_precioProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_precioProveedorProductoBusqueda.setVisible(false);		}


					
		this.jLabelprecio_pactadoProveedorProducto = new JLabelMe();
		this.jLabelprecio_pactadoProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO+" : *");
		this.jLabelprecio_pactadoProveedorProducto.setToolTipText("Precio Pactado");
		this.jLabelprecio_pactadoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_pactadoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_pactadoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_pactadoProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_pactadoProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_pactadoProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelprecio_pactadoProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jTextFieldprecio_pactadoProveedorProducto= new JTextFieldMe();
		jTextFieldprecio_pactadoProveedorProducto.setEnabled(false);
		jTextFieldprecio_pactadoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_pactadoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_pactadoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_pactadoProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_pactadoProveedorProducto.setText("0.0");

		this.jButtonprecio_pactadoProveedorProductoBusqueda= new JButtonMe();
		this.jButtonprecio_pactadoProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_pactadoProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_pactadoProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_pactadoProveedorProductoBusqueda.setText("U");
		this.jButtonprecio_pactadoProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_pactadoProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_pactadoProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_pactadoProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_pactadoProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_pactadoProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_pactadoProveedorProductoBusqueda.setVisible(false);		}


					
		this.jLabeldias_entregaProveedorProducto = new JLabelMe();
		this.jLabeldias_entregaProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA+" : *");
		this.jLabeldias_entregaProveedorProducto.setToolTipText("Dias Entrega");
		this.jLabeldias_entregaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_entregaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_entregaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_entregaProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_entregaProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_entregaProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPaneldias_entregaProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jTextFielddias_entregaProveedorProducto= new JTextFieldMe();
		jTextFielddias_entregaProveedorProducto.setEnabled(false);
		jTextFielddias_entregaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_entregaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_entregaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_entregaProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_entregaProveedorProducto.setText("0");

		this.jButtondias_entregaProveedorProductoBusqueda= new JButtonMe();
		this.jButtondias_entregaProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_entregaProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_entregaProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_entregaProveedorProductoBusqueda.setText("U");
		this.jButtondias_entregaProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_entregaProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_entregaProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_entregaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_entregaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_entregaProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_entregaProveedorProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProveedorProducto = new JLabelMe();
		this.jLabeldescripcionProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProveedorProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPaneldescripcionProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jTextAreadescripcionProveedorProducto= new JTextAreaMe();
		jTextAreadescripcionProveedorProducto.setEnabled(false);
		jTextAreadescripcionProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProveedorProducto.setLineWrap(true);
		jTextAreadescripcionProveedorProducto.setWrapStyleWord(true);
		jTextAreadescripcionProveedorProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProveedorProducto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProveedorProducto = new JScrollPane(jTextAreadescripcionProveedorProducto);
		jscrollPanedescripcionProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionProveedorProductoBusqueda= new JButtonMe();
		this.jButtondescripcionProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProveedorProductoBusqueda.setText("U");
		this.jButtondescripcionProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProveedorProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProveedorProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProveedorProducto = new JLabelMe();
		this.jLabelid_empresaProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProveedorProducto.setToolTipText("Empresa");
		this.jLabelid_empresaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelid_empresaProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jComboBoxid_empresaProveedorProducto= new JComboBoxMe();
		jComboBoxid_empresaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProveedorProducto.setEnabled(false);

		this.jButtonid_empresaProveedorProducto= new JButtonMe();
		this.jButtonid_empresaProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProveedorProducto.setText("Buscar");
		this.jButtonid_empresaProveedorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProveedorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProveedorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProveedorProducto"));

		this.jButtonid_empresaProveedorProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProveedorProductoBusqueda.setText("U");
		this.jButtonid_empresaProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProveedorProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaProveedorProductoUpdate= new JButtonMe();
		this.jButtonid_empresaProveedorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProveedorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProveedorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProveedorProductoUpdate.setText("U");
		this.jButtonid_empresaProveedorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProveedorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProveedorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProveedorProductoUpdate"));



					
		this.jLabelid_sucursalProveedorProducto = new JLabelMe();
		this.jLabelid_sucursalProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProveedorProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelid_sucursalProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jComboBoxid_sucursalProveedorProducto= new JComboBoxMe();
		jComboBoxid_sucursalProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProveedorProducto.setEnabled(false);

		this.jButtonid_sucursalProveedorProducto= new JButtonMe();
		this.jButtonid_sucursalProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProveedorProducto.setText("Buscar");
		this.jButtonid_sucursalProveedorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProveedorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProveedorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProveedorProducto"));

		this.jButtonid_sucursalProveedorProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProveedorProductoBusqueda.setText("U");
		this.jButtonid_sucursalProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProveedorProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProveedorProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalProveedorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProveedorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProveedorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProveedorProductoUpdate.setText("U");
		this.jButtonid_sucursalProveedorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProveedorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProveedorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProveedorProductoUpdate"));



					
		this.jLabelid_bodegaProveedorProducto = new JLabelMe();
		this.jLabelid_bodegaProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProveedorProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelid_bodegaProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jComboBoxid_bodegaProveedorProducto= new JComboBoxMe();
		jComboBoxid_bodegaProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProveedorProducto= new JButtonMe();
		this.jButtonid_bodegaProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProveedorProducto.setText("Buscar");
		this.jButtonid_bodegaProveedorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProveedorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProveedorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProveedorProducto"));

		this.jButtonid_bodegaProveedorProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProveedorProductoBusqueda.setText("U");
		this.jButtonid_bodegaProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProveedorProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProveedorProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaProveedorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProveedorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProveedorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProveedorProductoUpdate.setText("U");
		this.jButtonid_bodegaProveedorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProveedorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProveedorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProveedorProductoUpdate"));



					
		this.jLabelid_productoProveedorProducto = new JLabelMe();
		this.jLabelid_productoProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProveedorProducto.setToolTipText("Producto");
		this.jLabelid_productoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelid_productoProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jComboBoxid_productoProveedorProducto= new JComboBoxMe();
		jComboBoxid_productoProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProveedorProducto= new JButtonMe();
		this.jButtonid_productoProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProveedorProducto.setText("Buscar");
		this.jButtonid_productoProveedorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProveedorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProveedorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProveedorProducto"));

		this.jButtonid_productoProveedorProductoBusqueda= new JButtonMe();
		this.jButtonid_productoProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProveedorProductoBusqueda.setText("U");
		this.jButtonid_productoProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProveedorProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoProveedorProductoUpdate= new JButtonMe();
		this.jButtonid_productoProveedorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProveedorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProveedorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProveedorProductoUpdate.setText("U");
		this.jButtonid_productoProveedorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProveedorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProveedorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProveedorProductoUpdate"));



					
		this.jLabelid_clienteProveedorProducto = new JLabelMe();
		this.jLabelid_clienteProveedorProducto.setText(""+ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteProveedorProducto.setToolTipText("Cliente");
		this.jLabelid_clienteProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteProveedorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteProveedorProducto.setToolTipText(ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutProveedorProducto = new GridBagLayout();
		this.jPanelid_clienteProveedorProducto.setLayout(this.gridaBagLayoutProveedorProducto);


		jComboBoxid_clienteProveedorProducto= new JComboBoxMe();
		jComboBoxid_clienteProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteProveedorProducto= new JButtonMe();
		this.jButtonid_clienteProveedorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProveedorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProveedorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProveedorProducto.setText("Buscar");
		this.jButtonid_clienteProveedorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteProveedorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProveedorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProveedorProducto"));

		this.jButtonid_clienteProveedorProductoBusqueda= new JButtonMe();
		this.jButtonid_clienteProveedorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProveedorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProveedorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProveedorProductoBusqueda.setText("U");
		this.jButtonid_clienteProveedorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteProveedorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProveedorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProveedorProductoBusqueda"));

		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteProveedorProductoBusqueda.setVisible(false);		}

		this.jButtonid_clienteProveedorProductoUpdate= new JButtonMe();
		this.jButtonid_clienteProveedorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProveedorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProveedorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProveedorProductoUpdate.setText("U");
		this.jButtonid_clienteProveedorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteProveedorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProveedorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProveedorProductoUpdate"));



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
		//this.jInternalFrameDetalleProveedorProducto = new ProveedorProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProveedorProducto= new GridBagLayout();
		

		
		String sToolTipProveedorProducto="";
		sToolTipProveedorProducto=ProveedorProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProveedorProducto+="(Inventario.ProveedorProducto)";
		}
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProveedorProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProveedorProducto = new JButtonMe();
		this.jButtonModificarProveedorProducto = new JButtonMe();
        this.jButtonActualizarProveedorProducto = new JButtonMe();
        this.jButtonEliminarProveedorProducto = new JButtonMe();
        this.jButtonCancelarProveedorProducto = new JButtonMe();
        this.jButtonGuardarCambiosProveedorProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaProveedorProducto = new JButtonMe();
		this.jButtonCerrarProveedorProducto = new JButtonMe();
		
		this.jScrollPanelDatosProveedorProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionProveedorProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralProveedorProducto = new JScrollPane();
				
		
		
		this.jPanelCamposProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Proveedor";
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosProveedorProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProveedorProducto.setName("jPanelCamposProveedorProducto"); 

		this.jPanelCamposOcultosProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProveedorProducto.setName("jPanelCamposOcultosProveedorProducto"); 

        this.jPanelAccionesProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProveedorProducto.setToolTipText("Acciones");
        this.jPanelAccionesProveedorProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProveedorProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProveedorProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProveedorProducto.setText("Nuevo");
		this.jButtonModificarProveedorProducto.setText("Editar");
        this.jButtonActualizarProveedorProducto.setText("Actualizar");
        this.jButtonEliminarProveedorProducto.setText("Eliminar");
        this.jButtonCancelarProveedorProducto.setText("Cancelar");
        this.jButtonGuardarCambiosProveedorProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaProveedorProducto.setText("Guardar");
		this.jButtonCerrarProveedorProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProveedorProducto,"nuevo_button","Nuevo",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProveedorProducto,"modificar_button","Editar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProveedorProducto,"actualizar_button","Actualizar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProveedorProducto,"eliminar_button","Eliminar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProveedorProducto,"cancelar_button","Cancelar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProveedorProducto,"guardarcambios_button","Guardar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProveedorProducto,"guardarcambiostabla_button","Guardar",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProveedorProducto,"cerrar_button","Salir",this.proveedorproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProveedorProducto.setToolTipText("Nuevo"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProveedorProducto.setToolTipText("Editar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProveedorProducto.setToolTipText("Actualizar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProveedorProducto.setToolTipText("Eliminar)"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProveedorProducto.setToolTipText("Cancelar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProveedorProducto.setToolTipText("Guardar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProveedorProducto.setToolTipText("Guardar"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProveedorProducto.setToolTipText("Salir"+" "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProveedorProducto";
		inputMap = this.jButtonNuevoProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProveedorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProveedorProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProveedorProducto";
		inputMap = this.jButtonActualizarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProveedorProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarProveedorProducto";
		inputMap = this.jButtonEliminarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProveedorProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarProveedorProducto";
		inputMap = this.jButtonCancelarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProveedorProducto"));
		
		//CERRAR		
		sMapKey = "CerrarProveedorProducto";
		inputMap = this.jButtonCerrarProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProveedorProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProveedorProducto";
		inputMap = this.jButtonGuardarCambiosTablaProveedorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProveedorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProveedorProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProveedorProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProveedorProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProveedorProducto.setToolTipText("Nuevo ProveedorProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProveedorProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProveedorProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProveedorProducto.setToolTipText("Sin Cerrar Ventana ProveedorProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProveedorProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProveedorProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProveedorProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProveedorProducto.setText("Accion");
		this.jComboBoxTiposAccionesProveedorProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProveedorProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProveedorProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProveedorProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProveedorProducto = new JLabelMe();
		
		this.jLabelAccionesProveedorProducto.setText("Acciones");		
		this.jLabelAccionesProveedorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProveedorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProveedorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProveedorProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProveedorProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProveedorProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesProveedorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProveedorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProveedorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProveedorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProveedorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProveedorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProveedorProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProveedorProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProveedorProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProveedorProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProveedorProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProveedorProducto = new GridBagLayout();
		
		this.jPanelCamposProveedorProducto.setLayout(gridaBagLayoutCamposProveedorProducto);
		this.jPanelCamposOcultosProveedorProducto.setLayout(gridaBagLayoutCamposOcultosProveedorProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProveedorProducto.add(jLabelIdProveedorProducto, this.gridBagConstraintsProveedorProducto);



	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProveedorProducto.add(jLabelidProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProveedorProducto.add(jLabelid_empresaProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProveedorProducto.add(jButtonid_empresaProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 3;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProveedorProducto.add(jButtonid_empresaProveedorProductoUpdate, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProveedorProducto.add(jComboBoxid_empresaProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProveedorProducto.add(jLabelid_sucursalProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProveedorProducto.add(jButtonid_sucursalProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 3;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProveedorProducto.add(jButtonid_sucursalProveedorProductoUpdate, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProveedorProducto.add(jComboBoxid_sucursalProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProveedorProducto.add(jLabelid_bodegaProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProveedorProducto.add(jButtonid_bodegaProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 3;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProveedorProducto.add(jButtonid_bodegaProveedorProductoUpdate, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProveedorProducto.add(jComboBoxid_bodegaProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProveedorProducto.add(jLabelid_productoProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 2;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProveedorProducto.add(jButtonid_productoProveedorProducto, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 3;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProveedorProducto.add(jButtonid_productoProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 4;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProveedorProducto.add(jButtonid_productoProveedorProductoUpdate, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProveedorProducto.add(jComboBoxid_productoProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteProveedorProducto.add(jLabelid_clienteProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 2;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteProveedorProducto.add(jButtonid_clienteProveedorProducto, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 3;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProveedorProducto.add(jButtonid_clienteProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 4;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProveedorProducto.add(jButtonid_clienteProveedorProductoUpdate, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteProveedorProducto.add(jComboBoxid_clienteProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelultimo_precioProveedorProducto.add(jLabelultimo_precioProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_precioProveedorProducto.add(jButtonultimo_precioProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelultimo_precioProveedorProducto.add(jTextFieldultimo_precioProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_pactadoProveedorProducto.add(jLabelprecio_pactadoProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_pactadoProveedorProducto.add(jButtonprecio_pactadoProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_pactadoProveedorProducto.add(jTextFieldprecio_pactadoProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_entregaProveedorProducto.add(jLabeldias_entregaProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_entregaProveedorProducto.add(jButtondias_entregaProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_entregaProveedorProducto.add(jTextFielddias_entregaProveedorProducto, this.gridBagConstraintsProveedorProducto);


	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 0;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProveedorProducto.add(jLabeldescripcionProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		//this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = 2;
		this.gridBagConstraintsProveedorProducto.ipadx = 0;
		this.gridBagConstraintsProveedorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProveedorProducto.add(jButtondescripcionProveedorProductoBusqueda, this.gridBagConstraintsProveedorProducto);
	}

	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProveedorProducto.gridy = 0;
	this.gridBagConstraintsProveedorProducto.gridx = 1;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProveedorProducto.add(jscrollPanedescripcionProveedorProducto, this.gridBagConstraintsProveedorProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPanelidProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPanelid_bodegaProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPanelid_productoProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPanelid_clienteProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPanelultimo_precioProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPanelprecio_pactadoProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPaneldias_entregaProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProveedorProducto.add(this.jPaneldescripcionProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposProveedorProducto % 1==0) {
		iXPanelCamposProveedorProducto=0;
		iYPanelCamposProveedorProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposOcultosProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposOcultosProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProveedorProducto.add(this.jPanelid_empresaProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposOcultosProveedorProducto % 1==0) {
		iXPanelCamposOcultosProveedorProducto=0;
		iYPanelCamposOcultosProveedorProducto++;
	}
	this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProveedorProducto.gridy = iYPanelCamposOcultosProveedorProducto;
	this.gridBagConstraintsProveedorProducto.gridx = iXPanelCamposOcultosProveedorProducto++;
	this.gridBagConstraintsProveedorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProveedorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProveedorProducto.add(this.jPanelid_sucursalProveedorProducto, this.gridBagConstraintsProveedorProducto);



	if(iXPanelCamposOcultosProveedorProducto % 1==0) {
		iXPanelCamposOcultosProveedorProducto=0;
		iYPanelCamposOcultosProveedorProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesProveedorProducto= new GridBagLayout();
		this.jPanelAccionesProveedorProducto.setLayout(gridaBagLayoutAccionesProveedorProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProveedorProducto= new GridBagLayout();
		this.jPanelAccionesFormularioProveedorProducto.setLayout(gridaBagLayoutAccionesFormularioProveedorProducto);
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProveedorProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProveedorProducto.add(this.jComboBoxTiposAccionesFormularioProveedorProducto, this.gridBagConstraintsProveedorProducto);

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProveedorProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProveedorProducto.add(this.jCheckBoxPostAccionNuevoProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProveedorProducto.add(this.jCheckBoxPostAccionSinCerrarProveedorProducto, this.gridBagConstraintsProveedorProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProveedorProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProveedorProducto.add(this.jCheckBoxPostAccionSinMensajeProveedorProducto, this.gridBagConstraintsProveedorProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesProveedorProducto.add(this.jButtonModificarProveedorProducto, this.gridBagConstraintsProveedorProducto);							

		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProveedorProducto.gridy = 0;
		this.gridBagConstraintsProveedorProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesProveedorProducto.add(this.jButtonEliminarProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = 0;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProveedorProducto.add(this.jButtonActualizarProveedorProducto, this.gridBagConstraintsProveedorProducto);


		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = 0;		
		this.gridBagConstraintsProveedorProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProveedorProducto.add(this.jButtonGuardarCambiosProveedorProducto, this.gridBagConstraintsProveedorProducto);	
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = 0;		
		this.gridBagConstraintsProveedorProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesProveedorProducto.add(this.jButtonCancelarProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProveedorProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProveedorProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();						
			this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProveedorProducto.gridx = 0;		
			//this.gridBagConstraintsProveedorProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProveedorProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProveedorProducto.gridx =0;
		this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProveedorProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProveedorProducto, this.gridBagConstraintsProveedorProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProveedorProducto = new ProveedorProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Proveedor DATOS");
			
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
		    
			ProveedorProductoModel proveedorproductoModel=new ProveedorProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProveedorProductoModel.ProveedorProductoFocusTraversalPolicy proveedorproductoFocusTraversalPolicy = proveedorproductoModel.new ProveedorProductoFocusTraversalPolicy(this);
			
			//proveedorproductoFocusTraversalPolicy.setproveedorproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(proveedorproductoModel);
			
			
			this.jContentPaneDetalleProveedorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProveedorProducto = new GridBagLayout();	
			this.jContentPaneDetalleProveedorProducto.setLayout(gridaBagLayoutDetalleProveedorProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProveedorProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
				this.gridBagConstraintsProveedorProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProveedorProducto.gridx = 0;
					
				
				this.jContentPaneDetalleProveedorProducto.add(jTtoolBarDetalleProveedorProducto, gridBagConstraintsProveedorProducto);								
				
}
			
			this.jScrollPanelDatosEdicionProveedorProducto=   new JScrollPane(jContentPaneDetalleProveedorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProveedorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProveedorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProveedorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProveedorProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProveedorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProveedorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProveedorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProveedorProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProveedorProducto.gridx = 0;
	        
			this.jContentPaneDetalleProveedorProducto.add(jPanelCamposProveedorProducto, gridBagConstraintsProveedorProducto);
			
			
			
			
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
						&& proveedorproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProveedorProducto= new GridBagConstraints();
						this.gridBagConstraintsProveedorProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProveedorProducto.gridx = 0;
						this.jContentPaneDetalleProveedorProducto.add(this.jTabbedPaneRelacionesProveedorProducto, this.gridBagConstraintsProveedorProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProveedorProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProveedorProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
					this.gridBagConstraintsProveedorProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProveedorProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProveedorProducto.gridx = 0;
					
				
					this.jContentPaneDetalleProveedorProducto.add(jPanelCamposOcultosProveedorProducto, gridBagConstraintsProveedorProducto);
				
					this.jPanelCamposOcultosProveedorProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProveedorProducto.gridx = 0;
	        this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProveedorProducto.add(this.jPanelAccionesFormularioProveedorProducto, this.gridBagConstraintsProveedorProducto);							
			
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
	        this.gridBagConstraintsProveedorProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProveedorProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleProveedorProducto.add(this.jPanelAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProveedorProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProveedorProducto=   new JScrollPane(this.jPanelCamposProveedorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProveedorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProveedorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProveedorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProveedorProducto.gridx = 0;
			this.gridBagConstraintsProveedorProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProveedorProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProveedorProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProveedorProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProveedorProducto, this.gridBagConstraintsProveedorProducto);			
			
			this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
			this.gridBagConstraintsProveedorProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProveedorProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProveedorProducto, this.gridBagConstraintsProveedorProducto);
			
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProveedorProducto, this.gridBagConstraintsProveedorProducto);
		
			
		this.gridBagConstraintsProveedorProducto = new GridBagConstraints();
		this.gridBagConstraintsProveedorProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProveedorProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProveedorProducto, this.gridBagConstraintsProveedorProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProveedorProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionProveedorProducto;
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
