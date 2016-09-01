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
import com.bydan.erp.inventario.util.ProductoPromocionConstantesFunciones;

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
public class ProductoPromocionDetalleFormJInternalFrame extends ProductoPromocionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoPromocion;
	
	protected JMenuBar jmenuBarDetalleProductoPromocion;
	
	protected JMenu jmenuDetalleProductoPromocion;
	protected JMenu jmenuDetalleArchivoProductoPromocion;
	protected JMenu jmenuDetalleAccionesProductoPromocion;
	protected JMenu jmenuDetalleDatosProductoPromocion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoPromocion;	
	protected GridBagConstraints gridBagConstraintsProductoPromocion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoPromocionBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoPromocion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected BodegaBeanSwingJInternalFrame bodegarelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegarelacion="";

	protected ProductoBeanSwingJInternalFrame productorelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productorelacion="";
	
	public ProductoPromocionSessionBean productopromocionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public BodegaSessionBean bodegarelacionSessionBean;
	public ProductoSessionBean productorelacionSessionBean;	
	
	public ProductoPromocionLogic productopromocionLogic;
	
	public JScrollPane jScrollPanelDatosProductoPromocion;
	public JScrollPane jScrollPanelDatosEdicionProductoPromocion;
	public JScrollPane jScrollPanelDatosGeneralProductoPromocion;
	
	protected JPanel jPanelCamposProductoPromocion;    
	protected JPanel jPanelCamposOcultosProductoPromocion;    	
	protected JPanel jPanelAccionesProductoPromocion;
	protected JPanel jPanelAccionesFormularioProductoPromocion;
    
	
	
	protected Integer iXPanelCamposProductoPromocion=0;
	protected Integer iYPanelCamposProductoPromocion=0;
	
	protected Integer iXPanelCamposOcultosProductoPromocion=0;
	protected Integer iYPanelCamposOcultosProductoPromocion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoPromocion;
	public JButton jButtonModificarProductoPromocion;
	public JButton jButtonActualizarProductoPromocion;
    public JButton jButtonEliminarProductoPromocion;
	public JButton jButtonCancelarProductoPromocion;
    public JButton jButtonGuardarCambiosProductoPromocion;
	public JButton jButtonGuardarCambiosTablaProductoPromocion;
	protected JButton jButtonCerrarProductoPromocion;
	
	
	protected JButton jButtonProcesarInformacionProductoPromocion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoPromocion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoPromocion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoPromocion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoPromocion;
	protected JButton jButtonModificarToolBarProductoPromocion;
	protected JButton jButtonActualizarToolBarProductoPromocion;
    protected JButton jButtonEliminarToolBarProductoPromocion;
	protected JButton jButtonCancelarToolBarProductoPromocion;
    protected JButton jButtonGuardarCambiosToolBarProductoPromocion;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoPromocion;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoPromocion;
	protected JButton jButtonCerrarToolBarProductoPromocion;
	
	protected JButton jButtonProcesarInformacionToolBarProductoPromocion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoPromocion;
	protected JMenuItem jMenuItemModificarProductoPromocion;
	protected JMenuItem jMenuItemActualizarProductoPromocion;
    protected JMenuItem jMenuItemEliminarProductoPromocion;
	protected JMenuItem jMenuItemCancelarProductoPromocion;
    protected JMenuItem jMenuItemGuardarCambiosProductoPromocion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoPromocion;
	protected JMenuItem jMenuItemCerrarProductoPromocion;
	protected JMenuItem jMenuItemDetalleCerrarProductoPromocion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoPromocion;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoPromocion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoPromocion;
	protected JMenuItem jMenuItemMostrarOcultarProductoPromocion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoPromocion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoPromocion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoPromocion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoPromocion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoPromocion;
	public JLabel jLabelIdProductoPromocion;
	public JLabel jLabelidProductoPromocion;
	public JButton jButtonidProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoPromocion;
	public JLabel jLabelcantidadProductoPromocion;
	public JTextField jTextFieldcantidadProductoPromocion;
	public JButton jButtoncantidadProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelprecioProductoPromocion;
	public JLabel jLabelprecioProductoPromocion;
	public JTextField jTextFieldprecioProductoPromocion;
	public JButton jButtonprecioProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeProductoPromocion;
	public JLabel jLabelporcentajeProductoPromocion;
	public JTextField jTextFieldporcentajeProductoPromocion;
	public JButton jButtonporcentajeProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoPromocion;
	public JLabel jLabeldescripcionProductoPromocion;
	public JTextArea jTextAreadescripcionProductoPromocion;
	public JScrollPane jscrollPanedescripcionProductoPromocion;
	public JButton jButtondescripcionProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion2ProductoPromocion;
	public JLabel jLabeldescripcion2ProductoPromocion;
	public JTextArea jTextAreadescripcion2ProductoPromocion;
	public JScrollPane jscrollPanedescripcion2ProductoPromocion;
	public JButton jButtondescripcion2ProductoPromocionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoPromocion;
	public JLabel jLabelid_empresaProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoPromocion;
	public JButton jButtonid_empresaProductoPromocion= new JButtonMe();
	public JButton jButtonid_empresaProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoPromocion;
	public JLabel jLabelid_sucursalProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoPromocion;
	public JButton jButtonid_sucursalProductoPromocion= new JButtonMe();
	public JButton jButtonid_sucursalProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoPromocion;
	public JLabel jLabelid_bodegaProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoPromocion;
	public JButton jButtonid_bodegaProductoPromocion= new JButtonMe();
	public JButton jButtonid_bodegaProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoPromocion;
	public JLabel jLabelid_productoProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoPromocion;
	public JButton jButtonid_productoProductoPromocion= new JButtonMe();
	public JButton jButtonid_productoProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_relacionProductoPromocion;
	public JLabel jLabelid_bodega_relacionProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_relacionProductoPromocion;
	public JButton jButtonid_bodega_relacionProductoPromocion= new JButtonMe();
	public JButton jButtonid_bodega_relacionProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_bodega_relacionProductoPromocionBusqueda= new JButtonMe();

	public JPanel jPanelid_producto_relacionProductoPromocion;
	public JLabel jLabelid_producto_relacionProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_relacionProductoPromocion;
	public JButton jButtonid_producto_relacionProductoPromocion= new JButtonMe();
	public JButton jButtonid_producto_relacionProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_producto_relacionProductoPromocionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoPromocion;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoPromocionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoPromocion=new JPanel();
				this.jPanelAccionesFormularioProductoPromocion=new JPanel();
				this.jmenuBarDetalleProductoPromocion=new JMenuBar();
				this.jTtoolBarDetalleProductoPromocion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoPromocionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoPromocion() {
		return this.jButtonActualizarToolBarProductoPromocion;
	}
	
	public JButton getjButtonEliminarToolBarProductoPromocion() {
		return this.jButtonEliminarToolBarProductoPromocion;
	}
	
	public JButton getjButtonCancelarToolBarProductoPromocion() {
		return this.jButtonCancelarToolBarProductoPromocion;
	}		
	
	public JButton getjButtonProcesarInformacionProductoPromocion() {
		return this.jButtonProcesarInformacionProductoPromocion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoPromocion)	{
		this.jButtonProcesarInformacionProductoPromocion = jButtonProcesarInformacionProductoPromocion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoPromocion() {
		return this.jComboBoxTiposAccionesProductoPromocion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoPromocion(
			JComboBox jComboBoxTiposRelacionesProductoPromocion) {
		this.jComboBoxTiposRelacionesProductoPromocion = jComboBoxTiposRelacionesProductoPromocion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoPromocion(
			JComboBox jComboBoxTiposAccionesProductoPromocion) {
		this.jComboBoxTiposAccionesProductoPromocion = jComboBoxTiposAccionesProductoPromocion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoPromocion() {
		return this.jComboBoxTiposAccionesFormularioProductoPromocion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoPromocion(
			JComboBox jComboBoxTiposAccionesFormularioProductoPromocion) {
		this.jComboBoxTiposAccionesFormularioProductoPromocion = jComboBoxTiposAccionesFormularioProductoPromocion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productopromocionSessionBean=new ProductoPromocionSessionBean();
		
		this.productopromocionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productopromocionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productopromocionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoPromocionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Promocion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoPromocionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoPromocion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoPromocion=new JButtonMe();
				this.jButtonModificarToolBarProductoPromocion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoPromocion,this.jTtoolBarDetalleProductoPromocion,
							"actualizar","actualizar","Actualizar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoPromocion,this.jTtoolBarDetalleProductoPromocion,
							"eliminar","eliminar","Eliminar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoPromocion,this.jTtoolBarDetalleProductoPromocion,
							"cancelar","cancelar","Cancelar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoPromocion,this.jTtoolBarDetalleProductoPromocion,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoPromocion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoPromocion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoPromocion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoPromocion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoPromocion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoPromocion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoPromocion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoPromocion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoPromocion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoPromocion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoPromocion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoPromocion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoPromocion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoPromocion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoPromocion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoPromocion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoPromocion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoPromocion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoPromocion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoPromocion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoPromocion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoPromocion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoPromocion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoPromocion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoPromocion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoPromocion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoPromocion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoPromocion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoPromocion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoPromocion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoPromocion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoPromocion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoPromocion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoPromocion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoPromocion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoPromocion.add(this.jMenuItemDetalleCerrarProductoPromocion);
		
		this.jmenuDetalleAccionesProductoPromocion.add(this.jMenuItemActualizarProductoPromocion);
		this.jmenuDetalleAccionesProductoPromocion.add(this.jMenuItemEliminarProductoPromocion);
		this.jmenuDetalleAccionesProductoPromocion.add(this.jMenuItemCancelarProductoPromocion);		
		
		//this.jmenuDetalleDatosProductoPromocion.add(this.jMenuItemDetalleAbrirOrderByProductoPromocion);				
		this.jmenuDetalleDatosProductoPromocion.add(this.jMenuItemDetalleMostarOcultarProductoPromocion);				
				
		//this.jmenuDetalleAccionesProductoPromocion.add(this.jMenuItemGuardarCambiosProductoPromocion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoPromocion.add(this.jmenuDetalleArchivoProductoPromocion);		
		this.jmenuBarDetalleProductoPromocion.add(this.jmenuDetalleAccionesProductoPromocion);		
		this.jmenuBarDetalleProductoPromocion.add(this.jmenuDetalleDatosProductoPromocion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoPromocion);				
	}
	
	
	public void inicializarElementosCamposProductoPromocion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoPromocion = new JLabelMe();
		jLabelIdProductoPromocion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoPromocion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoPromocion= new GridBagLayout();

		this.jPanelidProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);

		jLabelidProductoPromocion = new JLabel();
		jLabelidProductoPromocion.setText("Id");

		jLabelidProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoPromocion = new JLabelMe();
		this.jLabelcantidadProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoPromocion.setToolTipText("Cantidad");
		this.jLabelcantidadProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelcantidadProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jTextFieldcantidadProductoPromocion= new JTextFieldMe();
		jTextFieldcantidadProductoPromocion.setEnabled(false);
		jTextFieldcantidadProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoPromocion.setText("0.0");

		this.jButtoncantidadProductoPromocionBusqueda= new JButtonMe();
		this.jButtoncantidadProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoPromocionBusqueda.setText("U");
		this.jButtoncantidadProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoPromocionBusqueda.setVisible(false);		}


					
		this.jLabelprecioProductoPromocion = new JLabelMe();
		this.jLabelprecioProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProductoPromocion.setToolTipText("Precio");
		this.jLabelprecioProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelprecioProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jTextFieldprecioProductoPromocion= new JTextFieldMe();
		jTextFieldprecioProductoPromocion.setEnabled(false);
		jTextFieldprecioProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProductoPromocion.setText("0.0");

		this.jButtonprecioProductoPromocionBusqueda= new JButtonMe();
		this.jButtonprecioProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProductoPromocionBusqueda.setText("U");
		this.jButtonprecioProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProductoPromocionBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeProductoPromocion = new JLabelMe();
		this.jLabelporcentajeProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeProductoPromocion.setToolTipText("Porcentaje");
		this.jLabelporcentajeProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelporcentajeProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jTextFieldporcentajeProductoPromocion= new JTextFieldMe();
		jTextFieldporcentajeProductoPromocion.setEnabled(false);
		jTextFieldporcentajeProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeProductoPromocion.setText("0.0");

		this.jButtonporcentajeProductoPromocionBusqueda= new JButtonMe();
		this.jButtonporcentajeProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeProductoPromocionBusqueda.setText("U");
		this.jButtonporcentajeProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeProductoPromocionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoPromocion = new JLabelMe();
		this.jLabeldescripcionProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoPromocion.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPaneldescripcionProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jTextAreadescripcionProductoPromocion= new JTextAreaMe();
		jTextAreadescripcionProductoPromocion.setEnabled(false);
		jTextAreadescripcionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoPromocion.setLineWrap(true);
		jTextAreadescripcionProductoPromocion.setWrapStyleWord(true);
		jTextAreadescripcionProductoPromocion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoPromocion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoPromocion = new JScrollPane(jTextAreadescripcionProductoPromocion);
		jscrollPanedescripcionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoPromocionBusqueda= new JButtonMe();
		this.jButtondescripcionProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoPromocionBusqueda.setText("U");
		this.jButtondescripcionProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoPromocionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion2ProductoPromocion = new JLabelMe();
		this.jLabeldescripcion2ProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2+" : *");
		this.jLabeldescripcion2ProductoPromocion.setToolTipText("Descripcion2");
		this.jLabeldescripcion2ProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2ProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2ProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion2ProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion2ProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion2ProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPaneldescripcion2ProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jTextAreadescripcion2ProductoPromocion= new JTextAreaMe();
		jTextAreadescripcion2ProductoPromocion.setEnabled(false);
		jTextAreadescripcion2ProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2ProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2ProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2ProductoPromocion.setLineWrap(true);
		jTextAreadescripcion2ProductoPromocion.setWrapStyleWord(true);
		jTextAreadescripcion2ProductoPromocion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion2ProductoPromocion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion2ProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion2ProductoPromocion = new JScrollPane(jTextAreadescripcion2ProductoPromocion);
		jscrollPanedescripcion2ProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcion2ProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcion2ProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcion2ProductoPromocionBusqueda= new JButtonMe();
		this.jButtondescripcion2ProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2ProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2ProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion2ProductoPromocionBusqueda.setText("U");
		this.jButtondescripcion2ProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion2ProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion2ProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion2ProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion2ProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion2ProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion2ProductoPromocionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoPromocion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoPromocion = new JLabelMe();
		this.jLabelid_empresaProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoPromocion.setToolTipText("Empresa");
		this.jLabelid_empresaProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelid_empresaProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jComboBoxid_empresaProductoPromocion= new JComboBoxMe();
		jComboBoxid_empresaProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoPromocion.setEnabled(false);

		this.jButtonid_empresaProductoPromocion= new JButtonMe();
		this.jButtonid_empresaProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoPromocion.setText("Buscar");
		this.jButtonid_empresaProductoPromocion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoPromocion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoPromocion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoPromocion"));

		this.jButtonid_empresaProductoPromocionBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoPromocionBusqueda.setText("U");
		this.jButtonid_empresaProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoPromocionBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoPromocionUpdate= new JButtonMe();
		this.jButtonid_empresaProductoPromocionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoPromocionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoPromocionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoPromocionUpdate.setText("U");
		this.jButtonid_empresaProductoPromocionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoPromocionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoPromocionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoPromocionUpdate"));



					
		this.jLabelid_sucursalProductoPromocion = new JLabelMe();
		this.jLabelid_sucursalProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoPromocion.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelid_sucursalProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jComboBoxid_sucursalProductoPromocion= new JComboBoxMe();
		jComboBoxid_sucursalProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoPromocion.setEnabled(false);

		this.jButtonid_sucursalProductoPromocion= new JButtonMe();
		this.jButtonid_sucursalProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoPromocion.setText("Buscar");
		this.jButtonid_sucursalProductoPromocion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoPromocion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoPromocion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoPromocion"));

		this.jButtonid_sucursalProductoPromocionBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoPromocionBusqueda.setText("U");
		this.jButtonid_sucursalProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoPromocionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoPromocionUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoPromocionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoPromocionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoPromocionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoPromocionUpdate.setText("U");
		this.jButtonid_sucursalProductoPromocionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoPromocionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoPromocionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoPromocionUpdate"));



					
		this.jLabelid_bodegaProductoPromocion = new JLabelMe();
		this.jLabelid_bodegaProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoPromocion.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelid_bodegaProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jComboBoxid_bodegaProductoPromocion= new JComboBoxMe();
		jComboBoxid_bodegaProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoPromocion= new JButtonMe();
		this.jButtonid_bodegaProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoPromocion.setText("Buscar");
		this.jButtonid_bodegaProductoPromocion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoPromocion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoPromocion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoPromocion"));

		this.jButtonid_bodegaProductoPromocionBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoPromocionBusqueda.setText("U");
		this.jButtonid_bodegaProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoPromocionBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoPromocionUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoPromocionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoPromocionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoPromocionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoPromocionUpdate.setText("U");
		this.jButtonid_bodegaProductoPromocionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoPromocionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoPromocionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoPromocionUpdate"));



					
		this.jLabelid_productoProductoPromocion = new JLabelMe();
		this.jLabelid_productoProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoPromocion.setToolTipText("Producto");
		this.jLabelid_productoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelid_productoProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jComboBoxid_productoProductoPromocion= new JComboBoxMe();
		jComboBoxid_productoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoPromocion= new JButtonMe();
		this.jButtonid_productoProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoPromocion.setText("Buscar");
		this.jButtonid_productoProductoPromocion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoPromocion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoPromocion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoPromocion"));

		this.jButtonid_productoProductoPromocionBusqueda= new JButtonMe();
		this.jButtonid_productoProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoPromocionBusqueda.setText("U");
		this.jButtonid_productoProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoPromocionBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoPromocionUpdate= new JButtonMe();
		this.jButtonid_productoProductoPromocionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPromocionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPromocionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoPromocionUpdate.setText("U");
		this.jButtonid_productoProductoPromocionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoPromocionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoPromocionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoPromocionUpdate"));



					
		this.jLabelid_bodega_relacionProductoPromocion = new JLabelMe();
		this.jLabelid_bodega_relacionProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION+" : *");
		this.jLabelid_bodega_relacionProductoPromocion.setToolTipText("Bodega Relacion");
		this.jLabelid_bodega_relacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_bodega_relacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_bodega_relacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_relacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_relacionProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_relacionProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelid_bodega_relacionProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jComboBoxid_bodega_relacionProductoPromocion= new JComboBoxMe();
		jComboBoxid_bodega_relacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_relacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_relacionProductoPromocion= new JButtonMe();
		this.jButtonid_bodega_relacionProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_relacionProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_relacionProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_relacionProductoPromocion.setText("Buscar");
		this.jButtonid_bodega_relacionProductoPromocion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_relacionProductoPromocion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_relacionProductoPromocion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_relacionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_relacionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_relacionProductoPromocion"));

		this.jButtonid_bodega_relacionProductoPromocionBusqueda= new JButtonMe();
		this.jButtonid_bodega_relacionProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_relacionProductoPromocionBusqueda.setText("U");
		this.jButtonid_bodega_relacionProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_relacionProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_relacionProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_relacionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_relacionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_relacionProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_relacionProductoPromocionBusqueda.setVisible(false);		}

		this.jButtonid_bodega_relacionProductoPromocionUpdate= new JButtonMe();
		this.jButtonid_bodega_relacionProductoPromocionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionProductoPromocionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionProductoPromocionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_relacionProductoPromocionUpdate.setText("U");
		this.jButtonid_bodega_relacionProductoPromocionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_relacionProductoPromocionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_relacionProductoPromocionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_relacionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_relacionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_relacionProductoPromocionUpdate"));



					
		this.jLabelid_producto_relacionProductoPromocion = new JLabelMe();
		this.jLabelid_producto_relacionProductoPromocion.setText(""+ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION+" : *");
		this.jLabelid_producto_relacionProductoPromocion.setToolTipText("Producto Relacion");
		this.jLabelid_producto_relacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_relacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_relacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_relacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_relacionProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_relacionProductoPromocion.setToolTipText(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION);
		this.gridaBagLayoutProductoPromocion = new GridBagLayout();
		this.jPanelid_producto_relacionProductoPromocion.setLayout(this.gridaBagLayoutProductoPromocion);


		jComboBoxid_producto_relacionProductoPromocion= new JComboBoxMe();
		jComboBoxid_producto_relacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_relacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_relacionProductoPromocion= new JButtonMe();
		this.jButtonid_producto_relacionProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_relacionProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_relacionProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_relacionProductoPromocion.setText("Buscar");
		this.jButtonid_producto_relacionProductoPromocion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_relacionProductoPromocion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_relacionProductoPromocion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_relacionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_relacionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_relacionProductoPromocion"));

		this.jButtonid_producto_relacionProductoPromocionBusqueda= new JButtonMe();
		this.jButtonid_producto_relacionProductoPromocionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionProductoPromocionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionProductoPromocionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_relacionProductoPromocionBusqueda.setText("U");
		this.jButtonid_producto_relacionProductoPromocionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_relacionProductoPromocionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_relacionProductoPromocionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_relacionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_relacionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_relacionProductoPromocionBusqueda"));

		if(this.productopromocionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_relacionProductoPromocionBusqueda.setVisible(false);		}

		this.jButtonid_producto_relacionProductoPromocionUpdate= new JButtonMe();
		this.jButtonid_producto_relacionProductoPromocionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionProductoPromocionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionProductoPromocionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_relacionProductoPromocionUpdate.setText("U");
		this.jButtonid_producto_relacionProductoPromocionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_relacionProductoPromocionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_relacionProductoPromocionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_relacionProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_relacionProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_relacionProductoPromocionUpdate"));



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
		//this.jInternalFrameDetalleProductoPromocion = new ProductoPromocionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Promocion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoPromocion= new GridBagLayout();
		

		
		String sToolTipProductoPromocion="";
		sToolTipProductoPromocion=ProductoPromocionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoPromocion+="(Inventario.ProductoPromocion)";
		}
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoPromocion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoPromocion = new JButtonMe();
		this.jButtonModificarProductoPromocion = new JButtonMe();
        this.jButtonActualizarProductoPromocion = new JButtonMe();
        this.jButtonEliminarProductoPromocion = new JButtonMe();
        this.jButtonCancelarProductoPromocion = new JButtonMe();
        this.jButtonGuardarCambiosProductoPromocion = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoPromocion = new JButtonMe();
		this.jButtonCerrarProductoPromocion = new JButtonMe();
		
		this.jScrollPanelDatosProductoPromocion = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoPromocion = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoPromocion = new JScrollPane();
				
		
		
		this.jPanelCamposProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Promocion";
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Promocions" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoPromocion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoPromocion.setName("jPanelCamposProductoPromocion"); 

		this.jPanelCamposOcultosProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoPromocion.setName("jPanelCamposOcultosProductoPromocion"); 

        this.jPanelAccionesProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoPromocion.setToolTipText("Acciones");
        this.jPanelAccionesProductoPromocion.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoPromocion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoPromocion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoPromocion.setText("Nuevo");
		this.jButtonModificarProductoPromocion.setText("Editar");
        this.jButtonActualizarProductoPromocion.setText("Actualizar");
        this.jButtonEliminarProductoPromocion.setText("Eliminar");
        this.jButtonCancelarProductoPromocion.setText("Cancelar");
        this.jButtonGuardarCambiosProductoPromocion.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoPromocion.setText("Guardar");
		this.jButtonCerrarProductoPromocion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoPromocion,"nuevo_button","Nuevo",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoPromocion,"modificar_button","Editar",this.productopromocionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoPromocion,"actualizar_button","Actualizar",this.productopromocionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoPromocion,"eliminar_button","Eliminar",this.productopromocionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoPromocion,"cancelar_button","Cancelar",this.productopromocionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoPromocion,"guardarcambios_button","Guardar",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoPromocion,"guardarcambiostabla_button","Guardar",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoPromocion,"cerrar_button","Salir",this.productopromocionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoPromocion.setToolTipText("Nuevo"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoPromocion.setToolTipText("Editar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoPromocion.setToolTipText("Actualizar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoPromocion.setToolTipText("Eliminar)"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoPromocion.setToolTipText("Cancelar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoPromocion.setToolTipText("Guardar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoPromocion.setToolTipText("Guardar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoPromocion.setToolTipText("Salir"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoPromocion";
		inputMap = this.jButtonNuevoProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoPromocion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoPromocion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoPromocion";
		inputMap = this.jButtonActualizarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoPromocion"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoPromocion";
		inputMap = this.jButtonEliminarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoPromocion"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoPromocion";
		inputMap = this.jButtonCancelarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoPromocion"));
		
		//CERRAR		
		sMapKey = "CerrarProductoPromocion";
		inputMap = this.jButtonCerrarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoPromocion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoPromocion";
		inputMap = this.jButtonGuardarCambiosTablaProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoPromocion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoPromocion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoPromocion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoPromocion.setToolTipText("Nuevo ProductoPromocion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoPromocion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoPromocion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoPromocion.setToolTipText("Sin Cerrar Ventana ProductoPromocion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoPromocion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoPromocion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoPromocion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoPromocion.setText("Accion");
		this.jComboBoxTiposAccionesProductoPromocion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoPromocion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoPromocion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoPromocion = new JLabelMe();
		
		this.jLabelAccionesProductoPromocion.setText("Acciones");		
		this.jLabelAccionesProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoPromocion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoPromocion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoPromocion=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoPromocion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoPromocion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPromocion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPromocion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoPromocion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoPromocion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoPromocion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoPromocion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoPromocion = new GridBagLayout();
		
		this.jPanelCamposProductoPromocion.setLayout(gridaBagLayoutCamposProductoPromocion);
		this.jPanelCamposOcultosProductoPromocion.setLayout(gridaBagLayoutCamposOcultosProductoPromocion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoPromocion.add(jLabelIdProductoPromocion, this.gridBagConstraintsProductoPromocion);



	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoPromocion.add(jLabelidProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoPromocion.add(jLabelid_empresaProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoPromocion.add(jButtonid_empresaProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 3;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoPromocion.add(jButtonid_empresaProductoPromocionUpdate, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoPromocion.add(jComboBoxid_empresaProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoPromocion.add(jLabelid_sucursalProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoPromocion.add(jButtonid_sucursalProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 3;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoPromocion.add(jButtonid_sucursalProductoPromocionUpdate, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoPromocion.add(jComboBoxid_sucursalProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoPromocion.add(jLabelid_bodegaProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoPromocion.add(jButtonid_bodegaProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 3;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoPromocion.add(jButtonid_bodegaProductoPromocionUpdate, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoPromocion.add(jComboBoxid_bodegaProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoPromocion.add(jLabelid_productoProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 2;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoPromocion.add(jButtonid_productoProductoPromocion, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 3;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoPromocion.add(jButtonid_productoProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 4;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoPromocion.add(jButtonid_productoProductoPromocionUpdate, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoPromocion.add(jComboBoxid_productoProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_relacionProductoPromocion.add(jLabelid_bodega_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_relacionProductoPromocion.add(jButtonid_bodega_relacionProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 3;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_relacionProductoPromocion.add(jButtonid_bodega_relacionProductoPromocionUpdate, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_relacionProductoPromocion.add(jComboBoxid_bodega_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_relacionProductoPromocion.add(jLabelid_producto_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 2;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_producto_relacionProductoPromocion.add(jButtonid_producto_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 3;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_relacionProductoPromocion.add(jButtonid_producto_relacionProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 4;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_relacionProductoPromocion.add(jButtonid_producto_relacionProductoPromocionUpdate, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_relacionProductoPromocion.add(jComboBoxid_producto_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoPromocion.add(jLabelcantidadProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoPromocion.add(jButtoncantidadProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoPromocion.add(jTextFieldcantidadProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProductoPromocion.add(jLabelprecioProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProductoPromocion.add(jButtonprecioProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProductoPromocion.add(jTextFieldprecioProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeProductoPromocion.add(jLabelporcentajeProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeProductoPromocion.add(jButtonporcentajeProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeProductoPromocion.add(jTextFieldporcentajeProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoPromocion.add(jLabeldescripcionProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoPromocion.add(jButtondescripcionProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoPromocion.add(jscrollPanedescripcionProductoPromocion, this.gridBagConstraintsProductoPromocion);


	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 0;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion2ProductoPromocion.add(jLabeldescripcion2ProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 2;
		this.gridBagConstraintsProductoPromocion.ipadx = 0;
		this.gridBagConstraintsProductoPromocion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion2ProductoPromocion.add(jButtondescripcion2ProductoPromocionBusqueda, this.gridBagConstraintsProductoPromocion);
	}

	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPromocion.gridy = 0;
	this.gridBagConstraintsProductoPromocion.gridx = 1;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion2ProductoPromocion.add(jscrollPanedescripcion2ProductoPromocion, this.gridBagConstraintsProductoPromocion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelidProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelid_bodegaProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelid_productoProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelid_bodega_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelid_producto_relacionProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelcantidadProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelprecioProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPanelporcentajeProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPaneldescripcionProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPromocion.add(this.jPaneldescripcion2ProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposProductoPromocion % 1==0) {
		iXPanelCamposProductoPromocion=0;
		iYPanelCamposProductoPromocion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposOcultosProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposOcultosProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoPromocion.add(this.jPanelid_empresaProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposOcultosProductoPromocion % 1==0) {
		iXPanelCamposOcultosProductoPromocion=0;
		iYPanelCamposOcultosProductoPromocion++;
	}
	this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPromocion.gridy = iYPanelCamposOcultosProductoPromocion;
	this.gridBagConstraintsProductoPromocion.gridx = iXPanelCamposOcultosProductoPromocion++;
	this.gridBagConstraintsProductoPromocion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPromocion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoPromocion.add(this.jPanelid_sucursalProductoPromocion, this.gridBagConstraintsProductoPromocion);



	if(iXPanelCamposOcultosProductoPromocion % 1==0) {
		iXPanelCamposOcultosProductoPromocion=0;
		iYPanelCamposOcultosProductoPromocion++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoPromocion= new GridBagLayout();
		this.jPanelAccionesProductoPromocion.setLayout(gridaBagLayoutAccionesProductoPromocion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoPromocion= new GridBagLayout();
		this.jPanelAccionesFormularioProductoPromocion.setLayout(gridaBagLayoutAccionesFormularioProductoPromocion);
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoPromocion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoPromocion.add(this.jComboBoxTiposAccionesFormularioProductoPromocion, this.gridBagConstraintsProductoPromocion);

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoPromocion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoPromocion.add(this.jCheckBoxPostAccionNuevoProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoPromocion.add(this.jCheckBoxPostAccionSinCerrarProductoPromocion, this.gridBagConstraintsProductoPromocion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoPromocion.add(this.jCheckBoxPostAccionSinMensajeProductoPromocion, this.gridBagConstraintsProductoPromocion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoPromocion.add(this.jButtonModificarProductoPromocion, this.gridBagConstraintsProductoPromocion);							

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoPromocion.add(this.jButtonEliminarProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = 0;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoPromocion.add(this.jButtonActualizarProductoPromocion, this.gridBagConstraintsProductoPromocion);


		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = 0;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoPromocion.add(this.jButtonGuardarCambiosProductoPromocion, this.gridBagConstraintsProductoPromocion);	
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = 0;		
		this.gridBagConstraintsProductoPromocion.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoPromocion.add(this.jButtonCancelarProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoPromocion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoPromocion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();						
			this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoPromocion.gridx = 0;		
			//this.gridBagConstraintsProductoPromocion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoPromocion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoPromocion.gridx =0;
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoPromocion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoPromocion, this.gridBagConstraintsProductoPromocion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoPromocion = new ProductoPromocionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Promocion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Promocion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Promocion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoPromocionModel productopromocionModel=new ProductoPromocionModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoPromocionModel.ProductoPromocionFocusTraversalPolicy productopromocionFocusTraversalPolicy = productopromocionModel.new ProductoPromocionFocusTraversalPolicy(this);
			
			//productopromocionFocusTraversalPolicy.setproductopromocionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productopromocionModel);
			
			
			this.jContentPaneDetalleProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoPromocion = new GridBagLayout();	
			this.jContentPaneDetalleProductoPromocion.setLayout(gridaBagLayoutDetalleProductoPromocion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoPromocion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
				this.gridBagConstraintsProductoPromocion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoPromocion.gridx = 0;
					
				
				this.jContentPaneDetalleProductoPromocion.add(jTtoolBarDetalleProductoPromocion, gridBagConstraintsProductoPromocion);								
				
}
			
			this.jScrollPanelDatosEdicionProductoPromocion=   new JScrollPane(jContentPaneDetalleProductoPromocion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoPromocion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPromocion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPromocion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoPromocion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoPromocion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPromocion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPromocion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoPromocion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoPromocion.gridx = 0;
	        
			this.jContentPaneDetalleProductoPromocion.add(jPanelCamposProductoPromocion, gridBagConstraintsProductoPromocion);
			
			
			
			
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
						&& productopromocionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoPromocion= new GridBagConstraints();
						this.gridBagConstraintsProductoPromocion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoPromocion.gridx = 0;
						this.jContentPaneDetalleProductoPromocion.add(this.jTabbedPaneRelacionesProductoPromocion, this.gridBagConstraintsProductoPromocion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoPromocion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoPromocion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
					this.gridBagConstraintsProductoPromocion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoPromocion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoPromocion.gridx = 0;
					
				
					this.jContentPaneDetalleProductoPromocion.add(jPanelCamposOcultosProductoPromocion, gridBagConstraintsProductoPromocion);
				
					this.jPanelCamposOcultosProductoPromocion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoPromocion.gridx = 0;
	        this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoPromocion.add(this.jPanelAccionesFormularioProductoPromocion, this.gridBagConstraintsProductoPromocion);							
			
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
	        this.gridBagConstraintsProductoPromocion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoPromocion.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoPromocion.add(this.jPanelAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoPromocion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoPromocion=   new JScrollPane(this.jPanelCamposProductoPromocion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoPromocion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPromocion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPromocion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoPromocion.gridx = 0;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoPromocion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoPromocion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoPromocion, this.gridBagConstraintsProductoPromocion);			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoPromocion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoPromocion;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoPromocion;
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
