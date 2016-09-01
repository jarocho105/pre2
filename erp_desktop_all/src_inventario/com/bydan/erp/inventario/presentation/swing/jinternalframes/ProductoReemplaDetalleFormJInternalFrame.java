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
import com.bydan.erp.inventario.util.ProductoReemplaConstantesFunciones;

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
public class ProductoReemplaDetalleFormJInternalFrame extends ProductoReemplaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoReempla;
	
	protected JMenuBar jmenuBarDetalleProductoReempla;
	
	protected JMenu jmenuDetalleProductoReempla;
	protected JMenu jmenuDetalleArchivoProductoReempla;
	protected JMenu jmenuDetalleAccionesProductoReempla;
	protected JMenu jmenuDetalleDatosProductoReempla;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoReempla;	
	protected GridBagConstraints gridBagConstraintsProductoReempla;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoReemplaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoReempla;		
	
	public ProductoReemplaBeanSwingJInternalFrameTree jInternalFrameTreeProductoReempla;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productoreempla="";
	
	public ProductoReemplaSessionBean productoreemplaSessionBean;
	
	

	//public ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame=null;
	public ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoReempla=false;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductoReemplaLogic productoreemplaLogic;
	
	public JScrollPane jScrollPanelDatosProductoReempla;
	public JScrollPane jScrollPanelDatosEdicionProductoReempla;
	public JScrollPane jScrollPanelDatosGeneralProductoReempla;
	
	protected JPanel jPanelCamposProductoReempla;    
	protected JPanel jPanelCamposOcultosProductoReempla;    	
	protected JPanel jPanelAccionesProductoReempla;
	protected JPanel jPanelAccionesFormularioProductoReempla;
    
	
	
	protected Integer iXPanelCamposProductoReempla=0;
	protected Integer iYPanelCamposProductoReempla=0;
	
	protected Integer iXPanelCamposOcultosProductoReempla=0;
	protected Integer iYPanelCamposOcultosProductoReempla=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoReempla;
	public JButton jButtonModificarProductoReempla;
	public JButton jButtonActualizarProductoReempla;
    public JButton jButtonEliminarProductoReempla;
	public JButton jButtonCancelarProductoReempla;
    public JButton jButtonGuardarCambiosProductoReempla;
	public JButton jButtonGuardarCambiosTablaProductoReempla;
	protected JButton jButtonCerrarProductoReempla;
	
	
	protected JButton jButtonProcesarInformacionProductoReempla;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoReempla;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoReempla;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoReempla;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoReempla;
	protected JButton jButtonModificarToolBarProductoReempla;
	protected JButton jButtonActualizarToolBarProductoReempla;
    protected JButton jButtonEliminarToolBarProductoReempla;
	protected JButton jButtonCancelarToolBarProductoReempla;
    protected JButton jButtonGuardarCambiosToolBarProductoReempla;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoReempla;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoReempla;
	protected JButton jButtonCerrarToolBarProductoReempla;
	
	protected JButton jButtonProcesarInformacionToolBarProductoReempla;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoReempla;
	protected JMenuItem jMenuItemModificarProductoReempla;
	protected JMenuItem jMenuItemActualizarProductoReempla;
    protected JMenuItem jMenuItemEliminarProductoReempla;
	protected JMenuItem jMenuItemCancelarProductoReempla;
    protected JMenuItem jMenuItemGuardarCambiosProductoReempla;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoReempla;
	protected JMenuItem jMenuItemCerrarProductoReempla;
	protected JMenuItem jMenuItemDetalleCerrarProductoReempla;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoReempla;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoReempla;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoReempla;
	protected JMenuItem jMenuItemMostrarOcultarProductoReempla;
	
	
	//MENU
	
	protected JButton jButtonArbolProductoReempla;	
	
	protected JLabel jLabelAccionesProductoReempla;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoReempla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoReempla;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoReempla;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoReempla;
	public JLabel jLabelIdProductoReempla;
	public JLabel jLabelidProductoReempla;
	public JButton jButtonidProductoReemplaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoReempla;
	public JLabel jLabeldescripcionProductoReempla;
	public JTextArea jTextAreadescripcionProductoReempla;
	public JScrollPane jscrollPanedescripcionProductoReempla;
	public JButton jButtondescripcionProductoReemplaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoReempla;
	public JLabel jLabelid_empresaProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoReempla;
	public JButton jButtonid_empresaProductoReempla= new JButtonMe();
	public JButton jButtonid_empresaProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoReemplaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoReempla;
	public JLabel jLabelid_sucursalProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoReempla;
	public JButton jButtonid_sucursalProductoReempla= new JButtonMe();
	public JButton jButtonid_sucursalProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoReemplaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoReempla;
	public JLabel jLabelid_bodegaProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoReempla;
	public JButton jButtonid_bodegaProductoReempla= new JButtonMe();
	public JButton jButtonid_bodegaProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoReemplaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoReempla;
	public JLabel jLabelid_productoProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoReempla;
	public JButton jButtonid_productoProductoReempla= new JButtonMe();
	public JButton jButtonid_productoProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoReemplaBusqueda= new JButtonMe();

	public JPanel jPanelid_producto_reemplaProductoReempla;
	public JLabel jLabelid_producto_reemplaProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_reemplaProductoReempla;
	public JButton jButtonid_producto_reemplaProductoReempla= new JButtonMe();
	public JButton jButtonid_producto_reemplaProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_producto_reemplaProductoReemplaBusqueda= new JButtonMe();
	public JButton jButtonid_producto_reemplaProductoReemplaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoReempla;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoReemplaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoReempla=new JPanel();
				this.jPanelAccionesFormularioProductoReempla=new JPanel();
				this.jmenuBarDetalleProductoReempla=new JMenuBar();
				this.jTtoolBarDetalleProductoReempla=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoReemplaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoReempla() {
		return this.jButtonActualizarToolBarProductoReempla;
	}
	
	public JButton getjButtonEliminarToolBarProductoReempla() {
		return this.jButtonEliminarToolBarProductoReempla;
	}
	
	public JButton getjButtonCancelarToolBarProductoReempla() {
		return this.jButtonCancelarToolBarProductoReempla;
	}		
	
	public JButton getjButtonProcesarInformacionProductoReempla() {
		return this.jButtonProcesarInformacionProductoReempla;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoReempla)	{
		this.jButtonProcesarInformacionProductoReempla = jButtonProcesarInformacionProductoReempla;
	}
	
	
	public JButton getjButtonArbolProductoReempla() {
		return this.jButtonArbolProductoReempla;
	}
	
	public void setjButtonArbol(JButton jButtonArbolProductoReempla)	{
		this.jButtonArbolProductoReempla = jButtonArbolProductoReempla;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoReempla() {
		return this.jComboBoxTiposAccionesProductoReempla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoReempla(
			JComboBox jComboBoxTiposRelacionesProductoReempla) {
		this.jComboBoxTiposRelacionesProductoReempla = jComboBoxTiposRelacionesProductoReempla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoReempla(
			JComboBox jComboBoxTiposAccionesProductoReempla) {
		this.jComboBoxTiposAccionesProductoReempla = jComboBoxTiposAccionesProductoReempla;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoReempla() {
		return this.jComboBoxTiposAccionesFormularioProductoReempla;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoReempla(
			JComboBox jComboBoxTiposAccionesFormularioProductoReempla) {
		this.jComboBoxTiposAccionesFormularioProductoReempla = jComboBoxTiposAccionesFormularioProductoReempla;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		
		this.productoreemplaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoreemplaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoreemplaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoReemplaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Reemplazo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoReempla= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoReempla=new JButtonMe();
				this.jButtonModificarToolBarProductoReempla=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoReempla,this.jTtoolBarDetalleProductoReempla,
							"actualizar","actualizar","Actualizar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoReempla,this.jTtoolBarDetalleProductoReempla,
							"eliminar","eliminar","Eliminar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoReempla,this.jTtoolBarDetalleProductoReempla,
							"cancelar","cancelar","Cancelar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoReempla,this.jTtoolBarDetalleProductoReempla,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoReempla=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoReempla=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoReempla=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoReempla=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoReempla=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoReempla= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoReempla.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoReempla,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoReempla= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoReempla.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoReempla,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoReempla= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoReempla.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoReempla,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoReempla= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoReempla.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoReempla,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoReempla= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoReempla.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoReempla,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoReempla= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoReempla.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoReempla,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoReempla= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoReempla.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoReempla,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoReempla= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoReempla.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoReempla,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoReempla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoReempla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoReempla,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoReempla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoReempla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoReempla,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoReempla.add(this.jMenuItemDetalleCerrarProductoReempla);
		
		this.jmenuDetalleAccionesProductoReempla.add(this.jMenuItemActualizarProductoReempla);
		this.jmenuDetalleAccionesProductoReempla.add(this.jMenuItemEliminarProductoReempla);
		this.jmenuDetalleAccionesProductoReempla.add(this.jMenuItemCancelarProductoReempla);		
		
		//this.jmenuDetalleDatosProductoReempla.add(this.jMenuItemDetalleAbrirOrderByProductoReempla);				
		this.jmenuDetalleDatosProductoReempla.add(this.jMenuItemDetalleMostarOcultarProductoReempla);				
				
		//this.jmenuDetalleAccionesProductoReempla.add(this.jMenuItemGuardarCambiosProductoReempla);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoReempla.add(this.jmenuDetalleArchivoProductoReempla);		
		this.jmenuBarDetalleProductoReempla.add(this.jmenuDetalleAccionesProductoReempla);		
		this.jmenuBarDetalleProductoReempla.add(this.jmenuDetalleDatosProductoReempla);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProductoReempla.add(this.jmenuDetalleProductoReempla);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoReempla);				
	}
	
	
	public void inicializarElementosCamposProductoReempla() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoReempla = new JLabelMe();
		jLabelIdProductoReempla.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoReempla = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoReempla= new GridBagLayout();

		this.jPanelidProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);

		jLabelidProductoReempla = new JLabel();
		jLabelidProductoReempla.setText("Id");

		jLabelidProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionProductoReempla = new JLabelMe();
		this.jLabeldescripcionProductoReempla.setText(""+ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoReempla.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoReempla = new GridBagLayout();
		this.jPaneldescripcionProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);


		jTextAreadescripcionProductoReempla= new JTextAreaMe();
		jTextAreadescripcionProductoReempla.setEnabled(false);
		jTextAreadescripcionProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoReempla.setLineWrap(true);
		jTextAreadescripcionProductoReempla.setWrapStyleWord(true);
		jTextAreadescripcionProductoReempla.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoReempla.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoReempla = new JScrollPane(jTextAreadescripcionProductoReempla);
		jscrollPanedescripcionProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoReemplaBusqueda= new JButtonMe();
		this.jButtondescripcionProductoReemplaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoReemplaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoReemplaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoReemplaBusqueda.setText("U");
		this.jButtondescripcionProductoReemplaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoReemplaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoReemplaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoReemplaBusqueda"));

		if(this.productoreemplaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoReemplaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoReempla() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoReempla = new JLabelMe();
		this.jLabelid_empresaProductoReempla.setText(""+ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoReempla.setToolTipText("Empresa");
		this.jLabelid_empresaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoReempla = new GridBagLayout();
		this.jPanelid_empresaProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);


		jComboBoxid_empresaProductoReempla= new JComboBoxMe();
		jComboBoxid_empresaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoReempla.setEnabled(false);

		this.jButtonid_empresaProductoReempla= new JButtonMe();
		this.jButtonid_empresaProductoReempla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoReempla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoReempla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoReempla.setText("Buscar");
		this.jButtonid_empresaProductoReempla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoReempla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoReempla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoReempla"));

		this.jButtonid_empresaProductoReemplaBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoReemplaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoReemplaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoReemplaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoReemplaBusqueda.setText("U");
		this.jButtonid_empresaProductoReemplaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoReemplaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoReemplaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoReemplaBusqueda"));

		if(this.productoreemplaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoReemplaBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoReemplaUpdate= new JButtonMe();
		this.jButtonid_empresaProductoReemplaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoReemplaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoReemplaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoReemplaUpdate.setText("U");
		this.jButtonid_empresaProductoReemplaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoReemplaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoReemplaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoReemplaUpdate"));



					
		this.jLabelid_sucursalProductoReempla = new JLabelMe();
		this.jLabelid_sucursalProductoReempla.setText(""+ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoReempla.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoReempla = new GridBagLayout();
		this.jPanelid_sucursalProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);


		jComboBoxid_sucursalProductoReempla= new JComboBoxMe();
		jComboBoxid_sucursalProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoReempla.setEnabled(false);

		this.jButtonid_sucursalProductoReempla= new JButtonMe();
		this.jButtonid_sucursalProductoReempla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoReempla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoReempla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoReempla.setText("Buscar");
		this.jButtonid_sucursalProductoReempla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoReempla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoReempla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoReempla"));

		this.jButtonid_sucursalProductoReemplaBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoReemplaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoReemplaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoReemplaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoReemplaBusqueda.setText("U");
		this.jButtonid_sucursalProductoReemplaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoReemplaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoReemplaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoReemplaBusqueda"));

		if(this.productoreemplaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoReemplaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoReemplaUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoReemplaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoReemplaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoReemplaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoReemplaUpdate.setText("U");
		this.jButtonid_sucursalProductoReemplaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoReemplaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoReemplaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoReemplaUpdate"));



					
		this.jLabelid_bodegaProductoReempla = new JLabelMe();
		this.jLabelid_bodegaProductoReempla.setText(""+ProductoReemplaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoReempla.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoReempla = new GridBagLayout();
		this.jPanelid_bodegaProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);


		jComboBoxid_bodegaProductoReempla= new JComboBoxMe();
		jComboBoxid_bodegaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoReempla= new JButtonMe();
		this.jButtonid_bodegaProductoReempla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoReempla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoReempla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoReempla.setText("Buscar");
		this.jButtonid_bodegaProductoReempla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoReempla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoReempla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoReempla"));

		this.jButtonid_bodegaProductoReemplaBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoReemplaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoReemplaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoReemplaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoReemplaBusqueda.setText("U");
		this.jButtonid_bodegaProductoReemplaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoReemplaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoReemplaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoReemplaBusqueda"));

		if(this.productoreemplaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoReemplaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoReemplaUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoReemplaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoReemplaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoReemplaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoReemplaUpdate.setText("U");
		this.jButtonid_bodegaProductoReemplaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoReemplaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoReemplaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoReemplaUpdate"));



					
		this.jLabelid_productoProductoReempla = new JLabelMe();
		this.jLabelid_productoProductoReempla.setText(""+ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoReempla.setToolTipText("Producto");
		this.jLabelid_productoProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoReempla = new GridBagLayout();
		this.jPanelid_productoProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);


		jComboBoxid_productoProductoReempla= new JComboBoxMe();
		jComboBoxid_productoProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoReempla= new JButtonMe();
		this.jButtonid_productoProductoReempla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoReempla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoReempla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoReempla.setText("Buscar");
		this.jButtonid_productoProductoReempla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoReempla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoReempla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoReempla"));

		this.jButtonid_productoProductoReemplaBusqueda= new JButtonMe();
		this.jButtonid_productoProductoReemplaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoReemplaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoReemplaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoReemplaBusqueda.setText("U");
		this.jButtonid_productoProductoReemplaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoReemplaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoReemplaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoReemplaBusqueda"));

		if(this.productoreemplaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoReemplaBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoReemplaUpdate= new JButtonMe();
		this.jButtonid_productoProductoReemplaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoReemplaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoReemplaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoReemplaUpdate.setText("U");
		this.jButtonid_productoProductoReemplaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoReemplaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoReemplaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoReemplaUpdate"));



					
		this.jLabelid_producto_reemplaProductoReempla = new JLabelMe();
		this.jLabelid_producto_reemplaProductoReempla.setText(""+ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA+" : *");
		this.jLabelid_producto_reemplaProductoReempla.setToolTipText("Producto Reempla");
		this.jLabelid_producto_reemplaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_reemplaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_reemplaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_reemplaProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_reemplaProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_reemplaProductoReempla.setToolTipText(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA);
		this.gridaBagLayoutProductoReempla = new GridBagLayout();
		this.jPanelid_producto_reemplaProductoReempla.setLayout(this.gridaBagLayoutProductoReempla);


		jComboBoxid_producto_reemplaProductoReempla= new JComboBoxMe();
		jComboBoxid_producto_reemplaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_reemplaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_reemplaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_reemplaProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_reemplaProductoReempla= new JButtonMe();
		this.jButtonid_producto_reemplaProductoReempla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_reemplaProductoReempla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_reemplaProductoReempla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_reemplaProductoReempla.setText("Buscar");
		this.jButtonid_producto_reemplaProductoReempla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_reemplaProductoReempla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_reemplaProductoReempla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_reemplaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_reemplaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_reemplaProductoReempla"));

		this.jButtonid_producto_reemplaProductoReemplaBusqueda= new JButtonMe();
		this.jButtonid_producto_reemplaProductoReemplaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_reemplaProductoReemplaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_reemplaProductoReemplaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_reemplaProductoReemplaBusqueda.setText("U");
		this.jButtonid_producto_reemplaProductoReemplaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_reemplaProductoReemplaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_reemplaProductoReemplaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_reemplaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_reemplaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_reemplaProductoReemplaBusqueda"));

		if(this.productoreemplaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_reemplaProductoReemplaBusqueda.setVisible(false);		}

		this.jButtonid_producto_reemplaProductoReemplaUpdate= new JButtonMe();
		this.jButtonid_producto_reemplaProductoReemplaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_reemplaProductoReemplaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_reemplaProductoReemplaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_reemplaProductoReemplaUpdate.setText("U");
		this.jButtonid_producto_reemplaProductoReemplaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_reemplaProductoReemplaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_reemplaProductoReemplaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_reemplaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_reemplaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_reemplaProductoReemplaUpdate"));


		jButtonid_producto_reemplaProductoReemplaArbol= new JButtonMe();
		jButtonid_producto_reemplaProductoReemplaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_producto_reemplaProductoReemplaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_producto_reemplaProductoReemplaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_producto_reemplaProductoReemplaArbol.setText("Arbol");
		jButtonid_producto_reemplaProductoReemplaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_producto_reemplaProductoReemplaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_reemplaProductoReemplaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_producto_reemplaProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_reemplaProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_reemplaProductoReemplaArbol"));



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
		//this.jInternalFrameDetalleProductoReempla = new ProductoReemplaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Reemplazo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoReempla= new GridBagLayout();
		

		
		String sToolTipProductoReempla="";
		sToolTipProductoReempla=ProductoReemplaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoReempla+="(Inventario.ProductoReempla)";
		}
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoReempla+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoReempla = new JButtonMe();
		this.jButtonModificarProductoReempla = new JButtonMe();
        this.jButtonActualizarProductoReempla = new JButtonMe();
        this.jButtonEliminarProductoReempla = new JButtonMe();
        this.jButtonCancelarProductoReempla = new JButtonMe();
        this.jButtonGuardarCambiosProductoReempla = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoReempla = new JButtonMe();
		this.jButtonCerrarProductoReempla = new JButtonMe();
		
		this.jScrollPanelDatosProductoReempla = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoReempla = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoReempla = new JScrollPane();
				
		
		
		this.jPanelCamposProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Reemplazo";
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reemplazos" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoReempla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoReempla.setName("jPanelCamposProductoReempla"); 

		this.jPanelCamposOcultosProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoReempla.setName("jPanelCamposOcultosProductoReempla"); 

        this.jPanelAccionesProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoReempla.setToolTipText("Acciones");
        this.jPanelAccionesProductoReempla.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoReempla.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoReempla.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoReempla.setText("Nuevo");
		this.jButtonModificarProductoReempla.setText("Editar");
        this.jButtonActualizarProductoReempla.setText("Actualizar");
        this.jButtonEliminarProductoReempla.setText("Eliminar");
        this.jButtonCancelarProductoReempla.setText("Cancelar");
        this.jButtonGuardarCambiosProductoReempla.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoReempla.setText("Guardar");
		this.jButtonCerrarProductoReempla.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoReempla,"nuevo_button","Nuevo",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoReempla,"modificar_button","Editar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoReempla,"actualizar_button","Actualizar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoReempla,"eliminar_button","Eliminar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoReempla,"cancelar_button","Cancelar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoReempla,"guardarcambios_button","Guardar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoReempla,"guardarcambiostabla_button","Guardar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoReempla,"cerrar_button","Salir",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoReempla.setToolTipText("Nuevo"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoReempla.setToolTipText("Editar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoReempla.setToolTipText("Actualizar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoReempla.setToolTipText("Eliminar)"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoReempla.setToolTipText("Cancelar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoReempla.setToolTipText("Guardar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoReempla.setToolTipText("Guardar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoReempla.setToolTipText("Salir"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoReempla";
		inputMap = this.jButtonNuevoProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoReempla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoReempla"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoReempla";
		inputMap = this.jButtonActualizarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoReempla"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoReempla";
		inputMap = this.jButtonEliminarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoReempla"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoReempla";
		inputMap = this.jButtonCancelarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoReempla"));
		
		//CERRAR		
		sMapKey = "CerrarProductoReempla";
		inputMap = this.jButtonCerrarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoReempla"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoReempla";
		inputMap = this.jButtonGuardarCambiosTablaProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoReempla"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoReempla = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoReempla.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoReempla.setToolTipText("Nuevo ProductoReempla");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoReempla = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoReempla.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoReempla.setToolTipText("Sin Cerrar Ventana ProductoReempla");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoReempla = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoReempla.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoReempla.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolProductoReempla = new JButtonMe();
		this.jButtonArbolProductoReempla.setText("Arbol");		
		this.jButtonArbolProductoReempla.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoReempla.setText("Accion");
		this.jComboBoxTiposAccionesProductoReempla.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoReempla.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoReempla.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoReempla = new JLabelMe();
		
		this.jLabelAccionesProductoReempla.setText("Acciones");		
		this.jLabelAccionesProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoReempla();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoReempla();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoReempla=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoReempla,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolProductoReempla.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolProductoReempla.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolProductoReempla.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesProductoReempla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoReempla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoReempla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoReempla.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoReempla.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoReempla.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoReempla = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoReempla = new GridBagLayout();
		
		this.jPanelCamposProductoReempla.setLayout(gridaBagLayoutCamposProductoReempla);
		this.jPanelCamposOcultosProductoReempla.setLayout(gridaBagLayoutCamposOcultosProductoReempla);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoReempla.add(jLabelIdProductoReempla, this.gridBagConstraintsProductoReempla);



	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoReempla.add(jLabelidProductoReempla, this.gridBagConstraintsProductoReempla);


	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoReempla.add(jLabelid_empresaProductoReempla, this.gridBagConstraintsProductoReempla);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 2;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoReempla.add(jButtonid_empresaProductoReemplaBusqueda, this.gridBagConstraintsProductoReempla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 3;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoReempla.add(jButtonid_empresaProductoReemplaUpdate, this.gridBagConstraintsProductoReempla);
	}

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoReempla.add(jComboBoxid_empresaProductoReempla, this.gridBagConstraintsProductoReempla);


	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoReempla.add(jLabelid_sucursalProductoReempla, this.gridBagConstraintsProductoReempla);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 2;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoReempla.add(jButtonid_sucursalProductoReemplaBusqueda, this.gridBagConstraintsProductoReempla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 3;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoReempla.add(jButtonid_sucursalProductoReemplaUpdate, this.gridBagConstraintsProductoReempla);
	}

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoReempla.add(jComboBoxid_sucursalProductoReempla, this.gridBagConstraintsProductoReempla);


	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoReempla.add(jLabelid_bodegaProductoReempla, this.gridBagConstraintsProductoReempla);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 2;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoReempla.add(jButtonid_bodegaProductoReemplaBusqueda, this.gridBagConstraintsProductoReempla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 3;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoReempla.add(jButtonid_bodegaProductoReemplaUpdate, this.gridBagConstraintsProductoReempla);
	}

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoReempla.add(jComboBoxid_bodegaProductoReempla, this.gridBagConstraintsProductoReempla);


	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoReempla.add(jLabelid_productoProductoReempla, this.gridBagConstraintsProductoReempla);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 2;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoReempla.add(jButtonid_productoProductoReempla, this.gridBagConstraintsProductoReempla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 3;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoReempla.add(jButtonid_productoProductoReemplaBusqueda, this.gridBagConstraintsProductoReempla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 4;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoReempla.add(jButtonid_productoProductoReemplaUpdate, this.gridBagConstraintsProductoReempla);
	}

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoReempla.add(jComboBoxid_productoProductoReempla, this.gridBagConstraintsProductoReempla);


	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_reemplaProductoReempla.add(jLabelid_producto_reemplaProductoReempla, this.gridBagConstraintsProductoReempla);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 2;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_reemplaProductoReempla.add(jButtonid_producto_reemplaProductoReemplaBusqueda, this.gridBagConstraintsProductoReempla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 3;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_reemplaProductoReempla.add(jButtonid_producto_reemplaProductoReemplaUpdate, this.gridBagConstraintsProductoReempla);
	}

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_reemplaProductoReempla.add(jComboBoxid_producto_reemplaProductoReempla, this.gridBagConstraintsProductoReempla);


	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 0;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoReempla.add(jLabeldescripcionProductoReempla, this.gridBagConstraintsProductoReempla);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 2;
		this.gridBagConstraintsProductoReempla.ipadx = 0;
		this.gridBagConstraintsProductoReempla.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoReempla.add(jButtondescripcionProductoReemplaBusqueda, this.gridBagConstraintsProductoReempla);
	}

	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoReempla.gridy = 0;
	this.gridBagConstraintsProductoReempla.gridx = 1;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoReempla.add(jscrollPanedescripcionProductoReempla, this.gridBagConstraintsProductoReempla);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoReempla.add(this.jPanelidProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposProductoReempla % 1==0) {
		iXPanelCamposProductoReempla=0;
		iYPanelCamposProductoReempla++;
	}
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoReempla.add(this.jPanelid_bodegaProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposProductoReempla % 1==0) {
		iXPanelCamposProductoReempla=0;
		iYPanelCamposProductoReempla++;
	}
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoReempla.add(this.jPanelid_productoProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposProductoReempla % 1==0) {
		iXPanelCamposProductoReempla=0;
		iYPanelCamposProductoReempla++;
	}
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoReempla.add(this.jPanelid_producto_reemplaProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposProductoReempla % 1==0) {
		iXPanelCamposProductoReempla=0;
		iYPanelCamposProductoReempla++;
	}
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoReempla.add(this.jPaneldescripcionProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposProductoReempla % 1==0) {
		iXPanelCamposProductoReempla=0;
		iYPanelCamposProductoReempla++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposOcultosProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposOcultosProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoReempla.add(this.jPanelid_empresaProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposOcultosProductoReempla % 1==0) {
		iXPanelCamposOcultosProductoReempla=0;
		iYPanelCamposOcultosProductoReempla++;
	}
	this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoReempla.gridy = iYPanelCamposOcultosProductoReempla;
	this.gridBagConstraintsProductoReempla.gridx = iXPanelCamposOcultosProductoReempla++;
	this.gridBagConstraintsProductoReempla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoReempla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoReempla.add(this.jPanelid_sucursalProductoReempla, this.gridBagConstraintsProductoReempla);



	if(iXPanelCamposOcultosProductoReempla % 1==0) {
		iXPanelCamposOcultosProductoReempla=0;
		iYPanelCamposOcultosProductoReempla++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoReempla= new GridBagLayout();
		this.jPanelAccionesProductoReempla.setLayout(gridaBagLayoutAccionesProductoReempla);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoReempla= new GridBagLayout();
		this.jPanelAccionesFormularioProductoReempla.setLayout(gridaBagLayoutAccionesFormularioProductoReempla);
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoReempla.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoReempla.add(this.jComboBoxTiposAccionesFormularioProductoReempla, this.gridBagConstraintsProductoReempla);

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoReempla.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoReempla.add(this.jCheckBoxPostAccionNuevoProductoReempla, this.gridBagConstraintsProductoReempla);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoReempla.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoReempla.add(this.jCheckBoxPostAccionSinCerrarProductoReempla, this.gridBagConstraintsProductoReempla);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoReempla.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoReempla.add(this.jCheckBoxPostAccionSinMensajeProductoReempla, this.gridBagConstraintsProductoReempla);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoReempla.add(this.jButtonModificarProductoReempla, this.gridBagConstraintsProductoReempla);							

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoReempla.add(this.jButtonEliminarProductoReempla, this.gridBagConstraintsProductoReempla);
		
			
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = 0;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoReempla.add(this.jButtonActualizarProductoReempla, this.gridBagConstraintsProductoReempla);


		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = 0;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoReempla.add(this.jButtonGuardarCambiosProductoReempla, this.gridBagConstraintsProductoReempla);	
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = 0;		
		this.gridBagConstraintsProductoReempla.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoReempla.add(this.jButtonCancelarProductoReempla, this.gridBagConstraintsProductoReempla);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoReempla = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoReempla);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();						
			this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoReempla.gridx = 0;		
			//this.gridBagConstraintsProductoReempla.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoReempla.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoReempla.gridx =0;
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoReempla.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoReempla, this.gridBagConstraintsProductoReempla);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeProductoReempla = new ProductoReemplaBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeProductoReempla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeProductoReempla.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeProductoReempla.setTitle("Reemplazo ARBOL");
		this.jInternalFrameTreeProductoReempla.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Reemplazo Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeProductoReempla.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeProductoReempla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeProductoReempla.setResizable(true);
	    this.jInternalFrameTreeProductoReempla.setClosable(true);
	    this.jInternalFrameTreeProductoReempla.setMaximizable(true);
			
			
		//if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoReempla = new ProductoReemplaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Reemplazo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Reemplazo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Reemplazo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoReemplaModel productoreemplaModel=new ProductoReemplaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoReemplaModel.ProductoReemplaFocusTraversalPolicy productoreemplaFocusTraversalPolicy = productoreemplaModel.new ProductoReemplaFocusTraversalPolicy(this);
			
			//productoreemplaFocusTraversalPolicy.setproductoreemplaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoreemplaModel);
			
			
			this.jContentPaneDetalleProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoReempla = new GridBagLayout();	
			this.jContentPaneDetalleProductoReempla.setLayout(gridaBagLayoutDetalleProductoReempla);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoReempla = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoReempla = new GridBagConstraints();
				this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoReempla.gridx = 0;
					
				
				this.jContentPaneDetalleProductoReempla.add(jTtoolBarDetalleProductoReempla, gridBagConstraintsProductoReempla);								
				
}
			
			this.jScrollPanelDatosEdicionProductoReempla=   new JScrollPane(jContentPaneDetalleProductoReempla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoReempla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoReempla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoReempla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoReempla=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoReempla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoReempla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoReempla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoReempla.gridx = 0;
	        
			this.jContentPaneDetalleProductoReempla.add(jPanelCamposProductoReempla, gridBagConstraintsProductoReempla);
			
			
			
			
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
						&& productoreemplaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProductoReempla(this.puedeCargarPorParteProductoReempla,false,-1);
					
					if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoReempla= new GridBagConstraints();
						this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoReempla.gridx = 0;
						this.jContentPaneDetalleProductoReempla.add(this.jTabbedPaneRelacionesProductoReempla, this.gridBagConstraintsProductoReempla);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoReempla.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProductoReempla(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoReempla.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoReempla = new GridBagConstraints();
					this.gridBagConstraintsProductoReempla.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoReempla.gridx = 0;
					
				
					this.jContentPaneDetalleProductoReempla.add(jPanelCamposOcultosProductoReempla, gridBagConstraintsProductoReempla);
				
					this.jPanelCamposOcultosProductoReempla.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsProductoReempla.gridx = 0;
	        this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoReempla.add(this.jPanelAccionesFormularioProductoReempla, this.gridBagConstraintsProductoReempla);							
			
			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
	        this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsProductoReempla.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoReempla.add(this.jPanelAccionesProductoReempla, this.gridBagConstraintsProductoReempla);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoReempla);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoReempla=   new JScrollPane(this.jPanelCamposProductoReempla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoReempla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoReempla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoReempla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoReempla.gridx = 0;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoReempla.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoReempla, this.gridBagConstraintsProductoReempla);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoReempla.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoReempla, this.gridBagConstraintsProductoReempla);			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoReempla.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoReempla, this.gridBagConstraintsProductoReempla);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoReempla, this.gridBagConstraintsProductoReempla);
			
			
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoReempla, this.gridBagConstraintsProductoReempla);
		
			
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoReempla, this.gridBagConstraintsProductoReempla);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoReempla;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoReempla;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProductoReempla(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		this.productoreemplaSessionBean.setConGuardarRelaciones(false);
		//this.productoreemplaSessionBean.setEsGuardarRelacionado(true);

		this.productoreemplaBeanSwingJInternalFrame=null;//new ProductoReemplaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoreemplaBeanSwingJInternalFramePopup=new ProductoReemplaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoreemplaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoreemplaSessionBean.setEsGuardarRelacionado(true);

				this.productoreemplaBeanSwingJInternalFrame=new ProductoReemplaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoreemplaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoreemplaBeanSwingJInternalFrame.setproductoreemplaSessionBean(this.productoreemplaSessionBean);

				//this.gridBagConstraintsProductoReempla = new GridBagConstraints();
				//this.gridBagConstraintsProductoReempla.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProductoReempla.gridx = 0;
				//this.jContentPaneDetalleProductoReempla.add(this.productoreemplaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProductoReempla);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProductoReempla.add("Reemplazos",this.productoreemplaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProductoReempla.setComponentAt(iIndexTab,this.productoreemplaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoreemplaSessionBean.setEsGuardarRelacionado(false);
				this.productoreemplaBeanSwingJInternalFrame=null;//new ProductoReemplaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoReempla) {
					this.jTabbedPaneRelacionesProductoReempla.add("Reemplazos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoReemplaBeanSwingJInternalFrame(List<ProductoReempla> productoreemplas,ProductoReempla productoreempla,ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoreemplaBeanSwingJInternalFrame=new ProductoReemplaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoreemplaBeanSwingJInternalFrame.getProductoReemplaLogic().setConnexion(this.productoreemplaLogic.getConnexion());

					productoreemplaBeanSwingJInternalFrame.setproductoreemplasForeignKey(productoreemplas);
					productoreemplaBeanSwingJInternalFrame.setproductoreemplaForeignKey(productoreempla);
					productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setisBusquedaDesdeForeignKeySesionProductoReempla(true);
					productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setlidProductoReemplaActual(productoreempla.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoreemplaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoReempla(productoreemplaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoreemplaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoReempla(true);
					productoreemplaBeanSwingJInternalFrame.setid_producto_reemplaFK_IdProductoReempla(productoreempla.getId());

					if(!this.conCargarFormDetalle) {
						productoreemplaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoreemplaBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoReemplaForeignKey(productoreempla,1,false,true,true);
					productoreemplaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoreemplaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProductoReempla");
					productoreemplaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProductoReempla");
					productoreemplaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoReempla(true);
					productoreemplaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoReempla("n",productoreemplaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoreemplaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoreemplaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoreemplaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoreemplaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoReempla("relacionado");
					} else {
						productoreemplaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoReempla("no_relacionado");
					}

					productoreemplaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoReempla().setVisible(false);

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
