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
import com.bydan.erp.inventario.util.ProductoImpuestoConstantesFunciones;

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
public class ProductoImpuestoDetalleFormJInternalFrame extends ProductoImpuestoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoImpuesto;
	
	protected JMenuBar jmenuBarDetalleProductoImpuesto;
	
	protected JMenu jmenuDetalleProductoImpuesto;
	protected JMenu jmenuDetalleArchivoProductoImpuesto;
	protected JMenu jmenuDetalleAccionesProductoImpuesto;
	protected JMenu jmenuDetalleDatosProductoImpuesto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoImpuesto;	
	protected GridBagConstraints gridBagConstraintsProductoImpuesto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoImpuestoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoImpuesto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_impuestoinven="";
	
	public ProductoImpuestoSessionBean productoimpuestoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ImpuestoInvenSessionBean impuestoinvenSessionBean;	
	
	public ProductoImpuestoLogic productoimpuestoLogic;
	
	public JScrollPane jScrollPanelDatosProductoImpuesto;
	public JScrollPane jScrollPanelDatosEdicionProductoImpuesto;
	public JScrollPane jScrollPanelDatosGeneralProductoImpuesto;
	
	protected JPanel jPanelCamposProductoImpuesto;    
	protected JPanel jPanelCamposOcultosProductoImpuesto;    	
	protected JPanel jPanelAccionesProductoImpuesto;
	protected JPanel jPanelAccionesFormularioProductoImpuesto;
    
	
	
	protected Integer iXPanelCamposProductoImpuesto=0;
	protected Integer iYPanelCamposProductoImpuesto=0;
	
	protected Integer iXPanelCamposOcultosProductoImpuesto=0;
	protected Integer iYPanelCamposOcultosProductoImpuesto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoImpuesto;
	public JButton jButtonModificarProductoImpuesto;
	public JButton jButtonActualizarProductoImpuesto;
    public JButton jButtonEliminarProductoImpuesto;
	public JButton jButtonCancelarProductoImpuesto;
    public JButton jButtonGuardarCambiosProductoImpuesto;
	public JButton jButtonGuardarCambiosTablaProductoImpuesto;
	protected JButton jButtonCerrarProductoImpuesto;
	
	
	protected JButton jButtonProcesarInformacionProductoImpuesto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoImpuesto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoImpuesto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoImpuesto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoImpuesto;
	protected JButton jButtonModificarToolBarProductoImpuesto;
	protected JButton jButtonActualizarToolBarProductoImpuesto;
    protected JButton jButtonEliminarToolBarProductoImpuesto;
	protected JButton jButtonCancelarToolBarProductoImpuesto;
    protected JButton jButtonGuardarCambiosToolBarProductoImpuesto;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoImpuesto;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoImpuesto;
	protected JButton jButtonCerrarToolBarProductoImpuesto;
	
	protected JButton jButtonProcesarInformacionToolBarProductoImpuesto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoImpuesto;
	protected JMenuItem jMenuItemModificarProductoImpuesto;
	protected JMenuItem jMenuItemActualizarProductoImpuesto;
    protected JMenuItem jMenuItemEliminarProductoImpuesto;
	protected JMenuItem jMenuItemCancelarProductoImpuesto;
    protected JMenuItem jMenuItemGuardarCambiosProductoImpuesto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoImpuesto;
	protected JMenuItem jMenuItemCerrarProductoImpuesto;
	protected JMenuItem jMenuItemDetalleCerrarProductoImpuesto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoImpuesto;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoImpuesto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoImpuesto;
	protected JMenuItem jMenuItemMostrarOcultarProductoImpuesto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoImpuesto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoImpuesto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoImpuesto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoImpuesto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoImpuesto;
	public JLabel jLabelIdProductoImpuesto;
	public JLabel jLabelidProductoImpuesto;
	public JButton jButtonidProductoImpuestoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeProductoImpuesto;
	public JLabel jLabelporcentajeProductoImpuesto;
	public JTextField jTextFieldporcentajeProductoImpuesto;
	public JButton jButtonporcentajeProductoImpuestoBusqueda= new JButtonMe();

	public JPanel jPanelvalorProductoImpuesto;
	public JLabel jLabelvalorProductoImpuesto;
	public JTextField jTextFieldvalorProductoImpuesto;
	public JButton jButtonvalorProductoImpuestoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoImpuesto;
	public JLabel jLabelid_empresaProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoImpuesto;
	public JButton jButtonid_empresaProductoImpuesto= new JButtonMe();
	public JButton jButtonid_empresaProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoImpuestoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoImpuesto;
	public JLabel jLabelid_sucursalProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoImpuesto;
	public JButton jButtonid_sucursalProductoImpuesto= new JButtonMe();
	public JButton jButtonid_sucursalProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoImpuestoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoImpuesto;
	public JLabel jLabelid_bodegaProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoImpuesto;
	public JButton jButtonid_bodegaProductoImpuesto= new JButtonMe();
	public JButton jButtonid_bodegaProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoImpuestoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoImpuesto;
	public JLabel jLabelid_productoProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoImpuesto;
	public JButton jButtonid_productoProductoImpuesto= new JButtonMe();
	public JButton jButtonid_productoProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoImpuestoBusqueda= new JButtonMe();

	public JPanel jPanelid_impuesto_invenProductoImpuesto;
	public JLabel jLabelid_impuesto_invenProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_impuesto_invenProductoImpuesto;
	public JButton jButtonid_impuesto_invenProductoImpuesto= new JButtonMe();
	public JButton jButtonid_impuesto_invenProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_impuesto_invenProductoImpuestoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoImpuesto;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoImpuestoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoImpuesto=new JPanel();
				this.jPanelAccionesFormularioProductoImpuesto=new JPanel();
				this.jmenuBarDetalleProductoImpuesto=new JMenuBar();
				this.jTtoolBarDetalleProductoImpuesto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoImpuestoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoImpuesto() {
		return this.jButtonActualizarToolBarProductoImpuesto;
	}
	
	public JButton getjButtonEliminarToolBarProductoImpuesto() {
		return this.jButtonEliminarToolBarProductoImpuesto;
	}
	
	public JButton getjButtonCancelarToolBarProductoImpuesto() {
		return this.jButtonCancelarToolBarProductoImpuesto;
	}		
	
	public JButton getjButtonProcesarInformacionProductoImpuesto() {
		return this.jButtonProcesarInformacionProductoImpuesto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoImpuesto)	{
		this.jButtonProcesarInformacionProductoImpuesto = jButtonProcesarInformacionProductoImpuesto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoImpuesto() {
		return this.jComboBoxTiposAccionesProductoImpuesto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoImpuesto(
			JComboBox jComboBoxTiposRelacionesProductoImpuesto) {
		this.jComboBoxTiposRelacionesProductoImpuesto = jComboBoxTiposRelacionesProductoImpuesto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoImpuesto(
			JComboBox jComboBoxTiposAccionesProductoImpuesto) {
		this.jComboBoxTiposAccionesProductoImpuesto = jComboBoxTiposAccionesProductoImpuesto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoImpuesto() {
		return this.jComboBoxTiposAccionesFormularioProductoImpuesto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoImpuesto(
			JComboBox jComboBoxTiposAccionesFormularioProductoImpuesto) {
		this.jComboBoxTiposAccionesFormularioProductoImpuesto = jComboBoxTiposAccionesFormularioProductoImpuesto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		
		this.productoimpuestoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoimpuestoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoimpuestoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoImpuestoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Impuesto MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoImpuesto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoImpuesto=new JButtonMe();
				this.jButtonModificarToolBarProductoImpuesto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoImpuesto,this.jTtoolBarDetalleProductoImpuesto,
							"actualizar","actualizar","Actualizar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoImpuesto,this.jTtoolBarDetalleProductoImpuesto,
							"eliminar","eliminar","Eliminar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoImpuesto,this.jTtoolBarDetalleProductoImpuesto,
							"cancelar","cancelar","Cancelar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoImpuesto,this.jTtoolBarDetalleProductoImpuesto,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoImpuesto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoImpuesto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoImpuesto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoImpuesto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoImpuesto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoImpuesto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoImpuesto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoImpuesto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoImpuesto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoImpuesto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoImpuesto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoImpuesto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoImpuesto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoImpuesto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoImpuesto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoImpuesto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoImpuesto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoImpuesto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoImpuesto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoImpuesto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoImpuesto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoImpuesto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoImpuesto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoImpuesto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoImpuesto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoImpuesto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoImpuesto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoImpuesto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoImpuesto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoImpuesto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoImpuesto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoImpuesto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoImpuesto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoImpuesto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoImpuesto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoImpuesto.add(this.jMenuItemDetalleCerrarProductoImpuesto);
		
		this.jmenuDetalleAccionesProductoImpuesto.add(this.jMenuItemActualizarProductoImpuesto);
		this.jmenuDetalleAccionesProductoImpuesto.add(this.jMenuItemEliminarProductoImpuesto);
		this.jmenuDetalleAccionesProductoImpuesto.add(this.jMenuItemCancelarProductoImpuesto);		
		
		//this.jmenuDetalleDatosProductoImpuesto.add(this.jMenuItemDetalleAbrirOrderByProductoImpuesto);				
		this.jmenuDetalleDatosProductoImpuesto.add(this.jMenuItemDetalleMostarOcultarProductoImpuesto);				
				
		//this.jmenuDetalleAccionesProductoImpuesto.add(this.jMenuItemGuardarCambiosProductoImpuesto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoImpuesto.add(this.jmenuDetalleArchivoProductoImpuesto);		
		this.jmenuBarDetalleProductoImpuesto.add(this.jmenuDetalleAccionesProductoImpuesto);		
		this.jmenuBarDetalleProductoImpuesto.add(this.jmenuDetalleDatosProductoImpuesto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoImpuesto);				
	}
	
	
	public void inicializarElementosCamposProductoImpuesto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoImpuesto = new JLabelMe();
		jLabelIdProductoImpuesto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoImpuesto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoImpuesto= new GridBagLayout();

		this.jPanelidProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);

		jLabelidProductoImpuesto = new JLabel();
		jLabelidProductoImpuesto.setText("Id");

		jLabelidProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeProductoImpuesto = new JLabelMe();
		this.jLabelporcentajeProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeProductoImpuesto.setToolTipText("Porcentaje");
		this.jLabelporcentajeProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelporcentajeProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jTextFieldporcentajeProductoImpuesto= new JTextFieldMe();
		jTextFieldporcentajeProductoImpuesto.setEnabled(false);
		jTextFieldporcentajeProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeProductoImpuesto.setText("0.0");

		this.jButtonporcentajeProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonporcentajeProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeProductoImpuestoBusqueda.setText("U");
		this.jButtonporcentajeProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeProductoImpuestoBusqueda.setVisible(false);		}


					
		this.jLabelvalorProductoImpuesto = new JLabelMe();
		this.jLabelvalorProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorProductoImpuesto.setToolTipText("Valor");
		this.jLabelvalorProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelvalorProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jTextFieldvalorProductoImpuesto= new JTextFieldMe();
		jTextFieldvalorProductoImpuesto.setEnabled(false);
		jTextFieldvalorProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorProductoImpuesto.setText("0.0");

		this.jButtonvalorProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonvalorProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorProductoImpuestoBusqueda.setText("U");
		this.jButtonvalorProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorProductoImpuestoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoImpuesto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoImpuesto = new JLabelMe();
		this.jLabelid_empresaProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoImpuesto.setToolTipText("Empresa");
		this.jLabelid_empresaProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelid_empresaProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jComboBoxid_empresaProductoImpuesto= new JComboBoxMe();
		jComboBoxid_empresaProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoImpuesto.setEnabled(false);

		this.jButtonid_empresaProductoImpuesto= new JButtonMe();
		this.jButtonid_empresaProductoImpuesto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoImpuesto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoImpuesto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoImpuesto.setText("Buscar");
		this.jButtonid_empresaProductoImpuesto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoImpuesto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoImpuesto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoImpuesto"));

		this.jButtonid_empresaProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoImpuestoBusqueda.setText("U");
		this.jButtonid_empresaProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoImpuestoBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoImpuestoUpdate= new JButtonMe();
		this.jButtonid_empresaProductoImpuestoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoImpuestoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoImpuestoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoImpuestoUpdate.setText("U");
		this.jButtonid_empresaProductoImpuestoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoImpuestoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoImpuestoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoImpuestoUpdate"));



					
		this.jLabelid_sucursalProductoImpuesto = new JLabelMe();
		this.jLabelid_sucursalProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoImpuesto.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelid_sucursalProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jComboBoxid_sucursalProductoImpuesto= new JComboBoxMe();
		jComboBoxid_sucursalProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoImpuesto.setEnabled(false);

		this.jButtonid_sucursalProductoImpuesto= new JButtonMe();
		this.jButtonid_sucursalProductoImpuesto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoImpuesto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoImpuesto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoImpuesto.setText("Buscar");
		this.jButtonid_sucursalProductoImpuesto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoImpuesto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoImpuesto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoImpuesto"));

		this.jButtonid_sucursalProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoImpuestoBusqueda.setText("U");
		this.jButtonid_sucursalProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoImpuestoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoImpuestoUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoImpuestoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoImpuestoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoImpuestoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoImpuestoUpdate.setText("U");
		this.jButtonid_sucursalProductoImpuestoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoImpuestoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoImpuestoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoImpuestoUpdate"));



					
		this.jLabelid_bodegaProductoImpuesto = new JLabelMe();
		this.jLabelid_bodegaProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoImpuesto.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelid_bodegaProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jComboBoxid_bodegaProductoImpuesto= new JComboBoxMe();
		jComboBoxid_bodegaProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoImpuesto= new JButtonMe();
		this.jButtonid_bodegaProductoImpuesto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoImpuesto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoImpuesto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoImpuesto.setText("Buscar");
		this.jButtonid_bodegaProductoImpuesto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoImpuesto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoImpuesto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoImpuesto"));

		this.jButtonid_bodegaProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoImpuestoBusqueda.setText("U");
		this.jButtonid_bodegaProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoImpuestoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoImpuestoUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoImpuestoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoImpuestoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoImpuestoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoImpuestoUpdate.setText("U");
		this.jButtonid_bodegaProductoImpuestoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoImpuestoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoImpuestoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoImpuestoUpdate"));



					
		this.jLabelid_productoProductoImpuesto = new JLabelMe();
		this.jLabelid_productoProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoImpuesto.setToolTipText("Producto");
		this.jLabelid_productoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelid_productoProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jComboBoxid_productoProductoImpuesto= new JComboBoxMe();
		jComboBoxid_productoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoImpuesto= new JButtonMe();
		this.jButtonid_productoProductoImpuesto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoImpuesto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoImpuesto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoImpuesto.setText("Buscar");
		this.jButtonid_productoProductoImpuesto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoImpuesto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoImpuesto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoImpuesto"));

		this.jButtonid_productoProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonid_productoProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoImpuestoBusqueda.setText("U");
		this.jButtonid_productoProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoImpuestoBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoImpuestoUpdate= new JButtonMe();
		this.jButtonid_productoProductoImpuestoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoImpuestoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoImpuestoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoImpuestoUpdate.setText("U");
		this.jButtonid_productoProductoImpuestoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoImpuestoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoImpuestoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoImpuestoUpdate"));



					
		this.jLabelid_impuesto_invenProductoImpuesto = new JLabelMe();
		this.jLabelid_impuesto_invenProductoImpuesto.setText(""+ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN+" : *");
		this.jLabelid_impuesto_invenProductoImpuesto.setToolTipText("Impuesto Inven");
		this.jLabelid_impuesto_invenProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_impuesto_invenProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_impuesto_invenProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_impuesto_invenProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_impuesto_invenProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_impuesto_invenProductoImpuesto.setToolTipText(ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN);
		this.gridaBagLayoutProductoImpuesto = new GridBagLayout();
		this.jPanelid_impuesto_invenProductoImpuesto.setLayout(this.gridaBagLayoutProductoImpuesto);


		jComboBoxid_impuesto_invenProductoImpuesto= new JComboBoxMe();
		jComboBoxid_impuesto_invenProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_impuesto_invenProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_impuesto_invenProductoImpuesto= new JButtonMe();
		this.jButtonid_impuesto_invenProductoImpuesto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_impuesto_invenProductoImpuesto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_impuesto_invenProductoImpuesto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_impuesto_invenProductoImpuesto.setText("Buscar");
		this.jButtonid_impuesto_invenProductoImpuesto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_impuesto_invenProductoImpuesto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_impuesto_invenProductoImpuesto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_impuesto_invenProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_impuesto_invenProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_impuesto_invenProductoImpuesto"));

		this.jButtonid_impuesto_invenProductoImpuestoBusqueda= new JButtonMe();
		this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setText("U");
		this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_impuesto_invenProductoImpuestoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_impuesto_invenProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_impuesto_invenProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_impuesto_invenProductoImpuestoBusqueda"));

		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_impuesto_invenProductoImpuestoBusqueda.setVisible(false);		}

		this.jButtonid_impuesto_invenProductoImpuestoUpdate= new JButtonMe();
		this.jButtonid_impuesto_invenProductoImpuestoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenProductoImpuestoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenProductoImpuestoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_impuesto_invenProductoImpuestoUpdate.setText("U");
		this.jButtonid_impuesto_invenProductoImpuestoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_impuesto_invenProductoImpuestoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_impuesto_invenProductoImpuestoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_impuesto_invenProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_impuesto_invenProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_impuesto_invenProductoImpuestoUpdate"));



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
		//this.jInternalFrameDetalleProductoImpuesto = new ProductoImpuestoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Impuesto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoImpuesto= new GridBagLayout();
		

		
		String sToolTipProductoImpuesto="";
		sToolTipProductoImpuesto=ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoImpuesto+="(Inventario.ProductoImpuesto)";
		}
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoImpuesto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoImpuesto = new JButtonMe();
		this.jButtonModificarProductoImpuesto = new JButtonMe();
        this.jButtonActualizarProductoImpuesto = new JButtonMe();
        this.jButtonEliminarProductoImpuesto = new JButtonMe();
        this.jButtonCancelarProductoImpuesto = new JButtonMe();
        this.jButtonGuardarCambiosProductoImpuesto = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoImpuesto = new JButtonMe();
		this.jButtonCerrarProductoImpuesto = new JButtonMe();
		
		this.jScrollPanelDatosProductoImpuesto = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoImpuesto = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoImpuesto = new JScrollPane();
				
		
		
		this.jPanelCamposProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Impuesto";
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Impuestos" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoImpuesto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoImpuesto.setName("jPanelCamposProductoImpuesto"); 

		this.jPanelCamposOcultosProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoImpuesto.setName("jPanelCamposOcultosProductoImpuesto"); 

        this.jPanelAccionesProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoImpuesto.setToolTipText("Acciones");
        this.jPanelAccionesProductoImpuesto.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoImpuesto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoImpuesto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoImpuesto.setText("Nuevo");
		this.jButtonModificarProductoImpuesto.setText("Editar");
        this.jButtonActualizarProductoImpuesto.setText("Actualizar");
        this.jButtonEliminarProductoImpuesto.setText("Eliminar");
        this.jButtonCancelarProductoImpuesto.setText("Cancelar");
        this.jButtonGuardarCambiosProductoImpuesto.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoImpuesto.setText("Guardar");
		this.jButtonCerrarProductoImpuesto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoImpuesto,"nuevo_button","Nuevo",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoImpuesto,"modificar_button","Editar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoImpuesto,"actualizar_button","Actualizar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoImpuesto,"eliminar_button","Eliminar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoImpuesto,"cancelar_button","Cancelar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoImpuesto,"guardarcambios_button","Guardar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoImpuesto,"guardarcambiostabla_button","Guardar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoImpuesto,"cerrar_button","Salir",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoImpuesto.setToolTipText("Nuevo"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoImpuesto.setToolTipText("Editar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoImpuesto.setToolTipText("Actualizar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoImpuesto.setToolTipText("Eliminar)"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoImpuesto.setToolTipText("Cancelar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoImpuesto.setToolTipText("Guardar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoImpuesto.setToolTipText("Guardar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoImpuesto.setToolTipText("Salir"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoImpuesto";
		inputMap = this.jButtonNuevoProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoImpuesto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoImpuesto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoImpuesto";
		inputMap = this.jButtonActualizarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoImpuesto"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoImpuesto";
		inputMap = this.jButtonEliminarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoImpuesto"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoImpuesto";
		inputMap = this.jButtonCancelarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoImpuesto"));
		
		//CERRAR		
		sMapKey = "CerrarProductoImpuesto";
		inputMap = this.jButtonCerrarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoImpuesto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoImpuesto";
		inputMap = this.jButtonGuardarCambiosTablaProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoImpuesto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoImpuesto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoImpuesto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoImpuesto.setToolTipText("Nuevo ProductoImpuesto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoImpuesto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoImpuesto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoImpuesto.setToolTipText("Sin Cerrar Ventana ProductoImpuesto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoImpuesto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoImpuesto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoImpuesto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoImpuesto.setText("Accion");
		this.jComboBoxTiposAccionesProductoImpuesto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoImpuesto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoImpuesto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoImpuesto = new JLabelMe();
		
		this.jLabelAccionesProductoImpuesto.setText("Acciones");		
		this.jLabelAccionesProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoImpuesto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoImpuesto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoImpuesto=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoImpuesto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoImpuesto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoImpuesto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoImpuesto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoImpuesto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoImpuesto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoImpuesto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoImpuesto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoImpuesto = new GridBagLayout();
		
		this.jPanelCamposProductoImpuesto.setLayout(gridaBagLayoutCamposProductoImpuesto);
		this.jPanelCamposOcultosProductoImpuesto.setLayout(gridaBagLayoutCamposOcultosProductoImpuesto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoImpuesto.add(jLabelIdProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoImpuesto.add(jLabelidProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoImpuesto.add(jLabelid_empresaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 2;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoImpuesto.add(jButtonid_empresaProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 3;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoImpuesto.add(jButtonid_empresaProductoImpuestoUpdate, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoImpuesto.add(jComboBoxid_empresaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoImpuesto.add(jLabelid_sucursalProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 2;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoImpuesto.add(jButtonid_sucursalProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 3;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoImpuesto.add(jButtonid_sucursalProductoImpuestoUpdate, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoImpuesto.add(jComboBoxid_sucursalProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoImpuesto.add(jLabelid_bodegaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 2;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoImpuesto.add(jButtonid_bodegaProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 3;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoImpuesto.add(jButtonid_bodegaProductoImpuestoUpdate, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoImpuesto.add(jComboBoxid_bodegaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoImpuesto.add(jLabelid_productoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 2;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoImpuesto.add(jButtonid_productoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 3;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoImpuesto.add(jButtonid_productoProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 4;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoImpuesto.add(jButtonid_productoProductoImpuestoUpdate, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoImpuesto.add(jComboBoxid_productoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_impuesto_invenProductoImpuesto.add(jLabelid_impuesto_invenProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 2;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_impuesto_invenProductoImpuesto.add(jButtonid_impuesto_invenProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 3;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_impuesto_invenProductoImpuesto.add(jButtonid_impuesto_invenProductoImpuestoUpdate, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_impuesto_invenProductoImpuesto.add(jComboBoxid_impuesto_invenProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeProductoImpuesto.add(jLabelporcentajeProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 2;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeProductoImpuesto.add(jButtonporcentajeProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeProductoImpuesto.add(jTextFieldporcentajeProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 0;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorProductoImpuesto.add(jLabelvalorProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 2;
		this.gridBagConstraintsProductoImpuesto.ipadx = 0;
		this.gridBagConstraintsProductoImpuesto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorProductoImpuesto.add(jButtonvalorProductoImpuestoBusqueda, this.gridBagConstraintsProductoImpuesto);
	}

	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoImpuesto.gridy = 0;
	this.gridBagConstraintsProductoImpuesto.gridx = 1;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorProductoImpuesto.add(jTextFieldvalorProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoImpuesto.add(this.jPanelidProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposProductoImpuesto % 1==0) {
		iXPanelCamposProductoImpuesto=0;
		iYPanelCamposProductoImpuesto++;
	}
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoImpuesto.add(this.jPanelid_bodegaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposProductoImpuesto % 1==0) {
		iXPanelCamposProductoImpuesto=0;
		iYPanelCamposProductoImpuesto++;
	}
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoImpuesto.add(this.jPanelid_productoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposProductoImpuesto % 1==0) {
		iXPanelCamposProductoImpuesto=0;
		iYPanelCamposProductoImpuesto++;
	}
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoImpuesto.add(this.jPanelid_impuesto_invenProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposProductoImpuesto % 1==0) {
		iXPanelCamposProductoImpuesto=0;
		iYPanelCamposProductoImpuesto++;
	}
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoImpuesto.add(this.jPanelporcentajeProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposProductoImpuesto % 1==0) {
		iXPanelCamposProductoImpuesto=0;
		iYPanelCamposProductoImpuesto++;
	}
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoImpuesto.add(this.jPanelvalorProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposProductoImpuesto % 1==0) {
		iXPanelCamposProductoImpuesto=0;
		iYPanelCamposProductoImpuesto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposOcultosProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposOcultosProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoImpuesto.add(this.jPanelid_empresaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposOcultosProductoImpuesto % 1==0) {
		iXPanelCamposOcultosProductoImpuesto=0;
		iYPanelCamposOcultosProductoImpuesto++;
	}
	this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoImpuesto.gridy = iYPanelCamposOcultosProductoImpuesto;
	this.gridBagConstraintsProductoImpuesto.gridx = iXPanelCamposOcultosProductoImpuesto++;
	this.gridBagConstraintsProductoImpuesto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoImpuesto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoImpuesto.add(this.jPanelid_sucursalProductoImpuesto, this.gridBagConstraintsProductoImpuesto);



	if(iXPanelCamposOcultosProductoImpuesto % 1==0) {
		iXPanelCamposOcultosProductoImpuesto=0;
		iYPanelCamposOcultosProductoImpuesto++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoImpuesto= new GridBagLayout();
		this.jPanelAccionesProductoImpuesto.setLayout(gridaBagLayoutAccionesProductoImpuesto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoImpuesto= new GridBagLayout();
		this.jPanelAccionesFormularioProductoImpuesto.setLayout(gridaBagLayoutAccionesFormularioProductoImpuesto);
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoImpuesto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoImpuesto.add(this.jComboBoxTiposAccionesFormularioProductoImpuesto, this.gridBagConstraintsProductoImpuesto);

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoImpuesto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoImpuesto.add(this.jCheckBoxPostAccionNuevoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoImpuesto.add(this.jCheckBoxPostAccionSinCerrarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoImpuesto.add(this.jCheckBoxPostAccionSinMensajeProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoImpuesto.add(this.jButtonModificarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);							

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoImpuesto.add(this.jButtonEliminarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = 0;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoImpuesto.add(this.jButtonActualizarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = 0;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoImpuesto.add(this.jButtonGuardarCambiosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);	
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = 0;		
		this.gridBagConstraintsProductoImpuesto.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoImpuesto.add(this.jButtonCancelarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoImpuesto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoImpuesto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();						
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoImpuesto.gridx = 0;		
			//this.gridBagConstraintsProductoImpuesto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoImpuesto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoImpuesto.gridx =0;
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoImpuesto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoImpuesto = new ProductoImpuestoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Impuesto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Impuesto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Impuesto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoImpuestoModel productoimpuestoModel=new ProductoImpuestoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoImpuestoModel.ProductoImpuestoFocusTraversalPolicy productoimpuestoFocusTraversalPolicy = productoimpuestoModel.new ProductoImpuestoFocusTraversalPolicy(this);
			
			//productoimpuestoFocusTraversalPolicy.setproductoimpuestoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoimpuestoModel);
			
			
			this.jContentPaneDetalleProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoImpuesto = new GridBagLayout();	
			this.jContentPaneDetalleProductoImpuesto.setLayout(gridaBagLayoutDetalleProductoImpuesto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoImpuesto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
				this.gridBagConstraintsProductoImpuesto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoImpuesto.gridx = 0;
					
				
				this.jContentPaneDetalleProductoImpuesto.add(jTtoolBarDetalleProductoImpuesto, gridBagConstraintsProductoImpuesto);								
				
}
			
			this.jScrollPanelDatosEdicionProductoImpuesto=   new JScrollPane(jContentPaneDetalleProductoImpuesto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoImpuesto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoImpuesto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoImpuesto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoImpuesto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoImpuesto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoImpuesto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoImpuesto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoImpuesto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoImpuesto.gridx = 0;
	        
			this.jContentPaneDetalleProductoImpuesto.add(jPanelCamposProductoImpuesto, gridBagConstraintsProductoImpuesto);
			
			
			
			
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
						&& productoimpuestoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoImpuesto= new GridBagConstraints();
						this.gridBagConstraintsProductoImpuesto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoImpuesto.gridx = 0;
						this.jContentPaneDetalleProductoImpuesto.add(this.jTabbedPaneRelacionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoImpuesto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoImpuesto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
					this.gridBagConstraintsProductoImpuesto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoImpuesto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoImpuesto.gridx = 0;
					
				
					this.jContentPaneDetalleProductoImpuesto.add(jPanelCamposOcultosProductoImpuesto, gridBagConstraintsProductoImpuesto);
				
					this.jPanelCamposOcultosProductoImpuesto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoImpuesto.gridx = 0;
	        this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoImpuesto.add(this.jPanelAccionesFormularioProductoImpuesto, this.gridBagConstraintsProductoImpuesto);							
			
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
	        this.gridBagConstraintsProductoImpuesto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoImpuesto.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoImpuesto.add(this.jPanelAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoImpuesto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoImpuesto=   new JScrollPane(this.jPanelCamposProductoImpuesto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoImpuesto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoImpuesto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoImpuesto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoImpuesto.gridx = 0;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoImpuesto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoImpuesto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoImpuesto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoImpuesto;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoImpuesto;
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
