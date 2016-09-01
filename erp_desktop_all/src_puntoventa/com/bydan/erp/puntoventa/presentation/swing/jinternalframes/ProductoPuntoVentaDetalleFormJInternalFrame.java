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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.ProductoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class ProductoPuntoVentaDetalleFormJInternalFrame extends ProductoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleProductoPuntoVenta;
	
	protected JMenu jmenuDetalleProductoPuntoVenta;
	protected JMenu jmenuDetalleArchivoProductoPuntoVenta;
	protected JMenu jmenuDetalleAccionesProductoPuntoVenta;
	protected JMenu jmenuDetalleDatosProductoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsProductoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoPuntoVentaSessionBean productopuntoventaSessionBean;
	
	
	
	
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductoPuntoVentaLogic productopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosProductoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionProductoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralProductoPuntoVenta;
	
	protected JPanel jPanelCamposProductoPuntoVenta;    
	protected JPanel jPanelCamposOcultosProductoPuntoVenta;    	
	protected JPanel jPanelAccionesProductoPuntoVenta;
	protected JPanel jPanelAccionesFormularioProductoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposProductoPuntoVenta=0;
	protected Integer iYPanelCamposProductoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosProductoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosProductoPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoPuntoVenta;
	public JButton jButtonModificarProductoPuntoVenta;
	public JButton jButtonActualizarProductoPuntoVenta;
    public JButton jButtonEliminarProductoPuntoVenta;
	public JButton jButtonCancelarProductoPuntoVenta;
    public JButton jButtonGuardarCambiosProductoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaProductoPuntoVenta;
	protected JButton jButtonCerrarProductoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionProductoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoPuntoVenta;
	protected JButton jButtonModificarToolBarProductoPuntoVenta;
	protected JButton jButtonActualizarToolBarProductoPuntoVenta;
    protected JButton jButtonEliminarToolBarProductoPuntoVenta;
	protected JButton jButtonCancelarToolBarProductoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarProductoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoPuntoVenta;
	protected JButton jButtonCerrarToolBarProductoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarProductoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoPuntoVenta;
	protected JMenuItem jMenuItemModificarProductoPuntoVenta;
	protected JMenuItem jMenuItemActualizarProductoPuntoVenta;
    protected JMenuItem jMenuItemEliminarProductoPuntoVenta;
	protected JMenuItem jMenuItemCancelarProductoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosProductoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoPuntoVenta;
	protected JMenuItem jMenuItemCerrarProductoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarProductoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarProductoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoPuntoVenta;
	public JLabel jLabelIdProductoPuntoVenta;
	public JLabel jLabelidProductoPuntoVenta;
	public JButton jButtonidProductoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoProductoPuntoVenta;
	public JLabel jLabelesta_activoProductoPuntoVenta;
	public JCheckBox jCheckBoxesta_activoProductoPuntoVenta;
	public JButton jButtonesta_activoProductoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaProductoPuntoVenta;
	public JLabel jLabelid_lineaProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductoPuntoVenta;
	public JButton jButtonid_lineaProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_lineaProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaProductoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductoPuntoVenta;
	public JLabel jLabelid_linea_grupoProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductoPuntoVenta;
	public JButton jButtonid_linea_grupoProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_grupoProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoProductoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductoPuntoVenta;
	public JLabel jLabelid_linea_categoriaProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductoPuntoVenta;
	public JButton jButtonid_linea_categoriaProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductoPuntoVenta;
	public JLabel jLabelid_linea_marcaProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductoPuntoVenta;
	public JButton jButtonid_linea_marcaProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_marcaProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaProductoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_productoProductoPuntoVenta;
	public JLabel jLabelid_productoProductoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoPuntoVenta;
	public JButton jButtonid_productoProductoPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoProductoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoPuntoVenta;
	
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
	
	public ProductoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioProductoPuntoVenta=new JPanel();
				this.jmenuBarDetalleProductoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleProductoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoPuntoVenta() {
		return this.jButtonActualizarToolBarProductoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarProductoPuntoVenta() {
		return this.jButtonEliminarToolBarProductoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarProductoPuntoVenta() {
		return this.jButtonCancelarToolBarProductoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionProductoPuntoVenta() {
		return this.jButtonProcesarInformacionProductoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoPuntoVenta)	{
		this.jButtonProcesarInformacionProductoPuntoVenta = jButtonProcesarInformacionProductoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoPuntoVenta() {
		return this.jComboBoxTiposAccionesProductoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesProductoPuntoVenta) {
		this.jComboBoxTiposRelacionesProductoPuntoVenta = jComboBoxTiposRelacionesProductoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoPuntoVenta(
			JComboBox jComboBoxTiposAccionesProductoPuntoVenta) {
		this.jComboBoxTiposAccionesProductoPuntoVenta = jComboBoxTiposAccionesProductoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioProductoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioProductoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioProductoPuntoVenta = jComboBoxTiposAccionesFormularioProductoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		
		this.productopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarProductoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoPuntoVenta,this.jTtoolBarDetalleProductoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoPuntoVenta,this.jTtoolBarDetalleProductoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoPuntoVenta,this.jTtoolBarDetalleProductoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoPuntoVenta,this.jTtoolBarDetalleProductoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoPuntoVenta.add(this.jMenuItemDetalleCerrarProductoPuntoVenta);
		
		this.jmenuDetalleAccionesProductoPuntoVenta.add(this.jMenuItemActualizarProductoPuntoVenta);
		this.jmenuDetalleAccionesProductoPuntoVenta.add(this.jMenuItemEliminarProductoPuntoVenta);
		this.jmenuDetalleAccionesProductoPuntoVenta.add(this.jMenuItemCancelarProductoPuntoVenta);		
		
		//this.jmenuDetalleDatosProductoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta);				
		this.jmenuDetalleDatosProductoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarProductoPuntoVenta);				
				
		//this.jmenuDetalleAccionesProductoPuntoVenta.add(this.jMenuItemGuardarCambiosProductoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoPuntoVenta.add(this.jmenuDetalleArchivoProductoPuntoVenta);		
		this.jmenuBarDetalleProductoPuntoVenta.add(this.jmenuDetalleAccionesProductoPuntoVenta);		
		this.jmenuBarDetalleProductoPuntoVenta.add(this.jmenuDetalleDatosProductoPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposProductoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoPuntoVenta = new JLabelMe();
		jLabelIdProductoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoPuntoVenta= new GridBagLayout();

		this.jPanelidProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);

		jLabelidProductoPuntoVenta = new JLabel();
		jLabelidProductoPuntoVenta.setText("Id");

		jLabelidProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelesta_activoProductoPuntoVenta = new JLabelMe();
		this.jLabelesta_activoProductoPuntoVenta.setText(""+ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoProductoPuntoVenta.setToolTipText("Esta Activo");
		this.jLabelesta_activoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		this.jPanelesta_activoProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);


		jCheckBoxesta_activoProductoPuntoVenta= new JCheckBoxMe();
		jCheckBoxesta_activoProductoPuntoVenta.setEnabled(false);

		jCheckBoxesta_activoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoProductoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonesta_activoProductoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoProductoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoProductoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoProductoPuntoVentaBusqueda.setText("U");
		this.jButtonesta_activoProductoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoProductoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoProductoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoProductoPuntoVentaBusqueda"));

		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoProductoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_lineaProductoPuntoVenta = new JLabelMe();
		this.jLabelid_lineaProductoPuntoVenta.setText(""+ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductoPuntoVenta.setToolTipText("Linea");
		this.jLabelid_lineaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		this.jPanelid_lineaProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);


		jComboBoxid_lineaProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_lineaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductoPuntoVenta= new JButtonMe();
		this.jButtonid_lineaProductoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductoPuntoVenta.setText("Buscar");
		this.jButtonid_lineaProductoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoPuntoVenta"));

		this.jButtonid_lineaProductoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_lineaProductoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductoPuntoVentaBusqueda.setText("U");
		this.jButtonid_lineaProductoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoPuntoVentaBusqueda"));

		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_lineaProductoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductoPuntoVentaUpdate.setText("U");
		this.jButtonid_lineaProductoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoPuntoVentaUpdate"));


		jButtonid_lineaProductoPuntoVentaArbol= new JButtonMe();
		jButtonid_lineaProductoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaProductoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaProductoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaProductoPuntoVentaArbol.setText("Arbol");
		jButtonid_lineaProductoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaProductoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoPuntoVentaArbol"));



					
		this.jLabelid_linea_grupoProductoPuntoVenta = new JLabelMe();
		this.jLabelid_linea_grupoProductoPuntoVenta.setText(""+ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO+" :");
		this.jLabelid_linea_grupoProductoPuntoVenta.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		this.jPanelid_linea_grupoProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);


		jComboBoxid_linea_grupoProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_grupoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductoPuntoVenta= new JButtonMe();
		this.jButtonid_linea_grupoProductoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductoPuntoVenta.setText("Buscar");
		this.jButtonid_linea_grupoProductoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoPuntoVenta"));

		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setText("U");
		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoPuntoVentaBusqueda"));

		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductoPuntoVentaUpdate.setText("U");
		this.jButtonid_linea_grupoProductoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoPuntoVentaUpdate"));


		jButtonid_linea_grupoProductoPuntoVentaArbol= new JButtonMe();
		jButtonid_linea_grupoProductoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoProductoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoProductoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoProductoPuntoVentaArbol.setText("Arbol");
		jButtonid_linea_grupoProductoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoProductoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoPuntoVentaArbol"));



					
		this.jLabelid_linea_categoriaProductoPuntoVenta = new JLabelMe();
		this.jLabelid_linea_categoriaProductoPuntoVenta.setText(""+ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA+" :");
		this.jLabelid_linea_categoriaProductoPuntoVenta.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		this.jPanelid_linea_categoriaProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);


		jComboBoxid_linea_categoriaProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductoPuntoVenta= new JButtonMe();
		this.jButtonid_linea_categoriaProductoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductoPuntoVenta.setText("Buscar");
		this.jButtonid_linea_categoriaProductoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoPuntoVenta"));

		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoPuntoVentaBusqueda"));

		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductoPuntoVentaUpdate.setText("U");
		this.jButtonid_linea_categoriaProductoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoPuntoVentaUpdate"));


		jButtonid_linea_categoriaProductoPuntoVentaArbol= new JButtonMe();
		jButtonid_linea_categoriaProductoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaProductoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaProductoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaProductoPuntoVentaArbol.setText("Arbol");
		jButtonid_linea_categoriaProductoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaProductoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoPuntoVentaArbol"));



					
		this.jLabelid_linea_marcaProductoPuntoVenta = new JLabelMe();
		this.jLabelid_linea_marcaProductoPuntoVenta.setText(""+ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA+" :");
		this.jLabelid_linea_marcaProductoPuntoVenta.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		this.jPanelid_linea_marcaProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);


		jComboBoxid_linea_marcaProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_marcaProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductoPuntoVenta= new JButtonMe();
		this.jButtonid_linea_marcaProductoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductoPuntoVenta.setText("Buscar");
		this.jButtonid_linea_marcaProductoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoPuntoVenta"));

		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setText("U");
		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoPuntoVentaBusqueda"));

		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductoPuntoVentaUpdate.setText("U");
		this.jButtonid_linea_marcaProductoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoPuntoVentaUpdate"));


		jButtonid_linea_marcaProductoPuntoVentaArbol= new JButtonMe();
		jButtonid_linea_marcaProductoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaProductoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaProductoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaProductoPuntoVentaArbol.setText("Arbol");
		jButtonid_linea_marcaProductoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaProductoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoPuntoVentaArbol"));



					
		this.jLabelid_productoProductoPuntoVenta = new JLabelMe();
		this.jLabelid_productoProductoPuntoVenta.setText(""+ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoPuntoVenta.setToolTipText("Producto");
		this.jLabelid_productoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoPuntoVenta.setToolTipText(ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		this.jPanelid_productoProductoPuntoVenta.setLayout(this.gridaBagLayoutProductoPuntoVenta);


		jComboBoxid_productoProductoPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoPuntoVenta= new JButtonMe();
		this.jButtonid_productoProductoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoPuntoVenta.setText("Buscar");
		this.jButtonid_productoProductoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoPuntoVenta"));

		this.jButtonid_productoProductoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_productoProductoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoPuntoVentaBusqueda.setText("U");
		this.jButtonid_productoProductoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoPuntoVentaBusqueda"));

		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_productoProductoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoPuntoVentaUpdate.setText("U");
		this.jButtonid_productoProductoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleProductoPuntoVenta = new ProductoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipProductoPuntoVenta="";
		sToolTipProductoPuntoVenta=ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoPuntoVenta+="(PuntoVenta.ProductoPuntoVenta)";
		}
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoPuntoVenta = new JButtonMe();
		this.jButtonModificarProductoPuntoVenta = new JButtonMe();
        this.jButtonActualizarProductoPuntoVenta = new JButtonMe();
        this.jButtonEliminarProductoPuntoVenta = new JButtonMe();
        this.jButtonCancelarProductoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosProductoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoPuntoVenta = new JButtonMe();
		this.jButtonCerrarProductoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosProductoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Punto Venta";
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoPuntoVenta.setName("jPanelCamposProductoPuntoVenta"); 

		this.jPanelCamposOcultosProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoPuntoVenta.setName("jPanelCamposOcultosProductoPuntoVenta"); 

        this.jPanelAccionesProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesProductoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoPuntoVenta.setText("Nuevo");
		this.jButtonModificarProductoPuntoVenta.setText("Editar");
        this.jButtonActualizarProductoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarProductoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarProductoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosProductoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.setText("Guardar");
		this.jButtonCerrarProductoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoPuntoVenta,"nuevo_button","Nuevo",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoPuntoVenta,"modificar_button","Editar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoPuntoVenta,"actualizar_button","Actualizar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoPuntoVenta,"eliminar_button","Eliminar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoPuntoVenta,"cancelar_button","Cancelar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoPuntoVenta,"guardarcambios_button","Guardar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoPuntoVenta,"guardarcambiostabla_button","Guardar",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoPuntoVenta,"cerrar_button","Salir",this.productopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoPuntoVenta.setToolTipText("Nuevo"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoPuntoVenta.setToolTipText("Editar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoPuntoVenta.setToolTipText("Actualizar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoPuntoVenta.setToolTipText("Eliminar)"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoPuntoVenta.setToolTipText("Cancelar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoPuntoVenta.setToolTipText("Guardar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.setToolTipText("Guardar"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoPuntoVenta.setToolTipText("Salir"+" "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoPuntoVenta";
		inputMap = this.jButtonNuevoProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoPuntoVenta";
		inputMap = this.jButtonActualizarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoPuntoVenta";
		inputMap = this.jButtonEliminarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoPuntoVenta";
		inputMap = this.jButtonCancelarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarProductoPuntoVenta";
		inputMap = this.jButtonCerrarProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaProductoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoPuntoVenta.setToolTipText("Nuevo ProductoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoPuntoVenta.setToolTipText("Sin Cerrar Ventana ProductoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesProductoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesProductoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesProductoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposProductoPuntoVenta.setLayout(gridaBagLayoutCamposProductoPuntoVenta);
		this.jPanelCamposOcultosProductoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosProductoPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoPuntoVenta.add(jLabelIdProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoPuntoVenta.add(jLabelidProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductoPuntoVenta.add(jLabelid_lineaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 2;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductoPuntoVenta.add(jButtonid_lineaProductoPuntoVentaBusqueda, this.gridBagConstraintsProductoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 3;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductoPuntoVenta.add(jButtonid_lineaProductoPuntoVentaUpdate, this.gridBagConstraintsProductoPuntoVenta);
	}

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductoPuntoVenta.add(jComboBoxid_lineaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductoPuntoVenta.add(jLabelid_linea_grupoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 2;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductoPuntoVenta.add(jButtonid_linea_grupoProductoPuntoVentaBusqueda, this.gridBagConstraintsProductoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 3;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductoPuntoVenta.add(jButtonid_linea_grupoProductoPuntoVentaUpdate, this.gridBagConstraintsProductoPuntoVenta);
	}

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductoPuntoVenta.add(jComboBoxid_linea_grupoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductoPuntoVenta.add(jLabelid_linea_categoriaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 2;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductoPuntoVenta.add(jButtonid_linea_categoriaProductoPuntoVentaBusqueda, this.gridBagConstraintsProductoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 3;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductoPuntoVenta.add(jButtonid_linea_categoriaProductoPuntoVentaUpdate, this.gridBagConstraintsProductoPuntoVenta);
	}

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductoPuntoVenta.add(jComboBoxid_linea_categoriaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductoPuntoVenta.add(jLabelid_linea_marcaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 2;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductoPuntoVenta.add(jButtonid_linea_marcaProductoPuntoVentaBusqueda, this.gridBagConstraintsProductoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 3;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductoPuntoVenta.add(jButtonid_linea_marcaProductoPuntoVentaUpdate, this.gridBagConstraintsProductoPuntoVenta);
	}

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductoPuntoVenta.add(jComboBoxid_linea_marcaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoPuntoVenta.add(jLabelid_productoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 2;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoPuntoVenta.add(jButtonid_productoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 3;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoPuntoVenta.add(jButtonid_productoProductoPuntoVentaBusqueda, this.gridBagConstraintsProductoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 4;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoPuntoVenta.add(jButtonid_productoProductoPuntoVentaUpdate, this.gridBagConstraintsProductoPuntoVenta);
	}

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoPuntoVenta.add(jComboBoxid_productoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoProductoPuntoVenta.add(jLabelesta_activoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = 2;
		this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoProductoPuntoVenta.add(jButtonesta_activoProductoPuntoVentaBusqueda, this.gridBagConstraintsProductoPuntoVenta);
	}

	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
	this.gridBagConstraintsProductoPuntoVenta.gridx = 1;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoProductoPuntoVenta.add(jCheckBoxesta_activoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelidProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
	}
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelid_lineaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
	}
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelid_linea_grupoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
	}
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelid_linea_categoriaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
	}
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelid_linea_marcaProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
	}
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelid_productoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
	}
	this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoPuntoVenta.gridy = iYPanelCamposProductoPuntoVenta;
	this.gridBagConstraintsProductoPuntoVenta.gridx = iXPanelCamposProductoPuntoVenta++;
	this.gridBagConstraintsProductoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoPuntoVenta.add(this.jPanelesta_activoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);



	if(iXPanelCamposProductoPuntoVenta % 1==0) {
		iXPanelCamposProductoPuntoVenta=0;
		iYPanelCamposProductoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesProductoPuntoVenta.setLayout(gridaBagLayoutAccionesProductoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioProductoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioProductoPuntoVenta);
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoPuntoVenta.add(this.jCheckBoxPostAccionNuevoProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoPuntoVenta.add(this.jButtonModificarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);							

		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;
		this.gridBagConstraintsProductoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoPuntoVenta.add(this.jButtonEliminarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
			
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoPuntoVenta.add(this.jButtonActualizarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);


		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoPuntoVenta.add(this.jButtonGuardarCambiosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);	
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsProductoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoPuntoVenta.add(this.jButtonCancelarProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsProductoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoPuntoVenta.gridx =0;
		this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoPuntoVenta = new ProductoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoPuntoVentaModel productopuntoventaModel=new ProductoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoPuntoVentaModel.ProductoPuntoVentaFocusTraversalPolicy productopuntoventaFocusTraversalPolicy = productopuntoventaModel.new ProductoPuntoVentaFocusTraversalPolicy(this);
			
			//productopuntoventaFocusTraversalPolicy.setproductopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productopuntoventaModel);
			
			
			this.jContentPaneDetalleProductoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleProductoPuntoVenta.setLayout(gridaBagLayoutDetalleProductoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleProductoPuntoVenta.add(jTtoolBarDetalleProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionProductoPuntoVenta=   new JScrollPane(jContentPaneDetalleProductoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleProductoPuntoVenta.add(jPanelCamposProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);
			
			
			
			
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
						&& productopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleProductoPuntoVenta.add(this.jTabbedPaneRelacionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsProductoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleProductoPuntoVenta.add(jPanelCamposOcultosProductoPuntoVenta, gridBagConstraintsProductoPuntoVenta);
				
					this.jPanelCamposOcultosProductoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoPuntoVenta.add(this.jPanelAccionesFormularioProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);							
			
			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoPuntoVenta.add(this.jPanelAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoPuntoVenta=   new JScrollPane(this.jPanelCamposProductoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
			this.gridBagConstraintsProductoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);			
			
			this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsProductoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
			
			
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		
			
		this.gridBagConstraintsProductoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsProductoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoPuntoVenta, this.gridBagConstraintsProductoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoPuntoVenta;
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
