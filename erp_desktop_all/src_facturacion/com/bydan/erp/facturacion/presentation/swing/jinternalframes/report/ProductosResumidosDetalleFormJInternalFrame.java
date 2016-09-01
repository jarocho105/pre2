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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProductosResumidosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProductosResumidosDetalleFormJInternalFrame extends ProductosResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosResumidos;
	
	protected JMenuBar jmenuBarDetalleProductosResumidos;
	
	protected JMenu jmenuDetalleProductosResumidos;
	protected JMenu jmenuDetalleArchivoProductosResumidos;
	protected JMenu jmenuDetalleAccionesProductosResumidos;
	protected JMenu jmenuDetalleDatosProductosResumidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosResumidos;	
	protected GridBagConstraints gridBagConstraintsProductosResumidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosResumidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosResumidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ProductosResumidosSessionBean productosresumidosSessionBean;
	
	
	
	
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public ProductosResumidosLogic productosresumidosLogic;
	
	public JScrollPane jScrollPanelDatosProductosResumidos;
	public JScrollPane jScrollPanelDatosEdicionProductosResumidos;
	public JScrollPane jScrollPanelDatosGeneralProductosResumidos;
	
	protected JPanel jPanelCamposProductosResumidos;    
	protected JPanel jPanelCamposOcultosProductosResumidos;    	
	protected JPanel jPanelAccionesProductosResumidos;
	protected JPanel jPanelAccionesFormularioProductosResumidos;
    
	
	
	protected Integer iXPanelCamposProductosResumidos=0;
	protected Integer iYPanelCamposProductosResumidos=0;
	
	protected Integer iXPanelCamposOcultosProductosResumidos=0;
	protected Integer iYPanelCamposOcultosProductosResumidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosResumidos;
	public JButton jButtonModificarProductosResumidos;
	public JButton jButtonActualizarProductosResumidos;
    public JButton jButtonEliminarProductosResumidos;
	public JButton jButtonCancelarProductosResumidos;
    public JButton jButtonGuardarCambiosProductosResumidos;
	public JButton jButtonGuardarCambiosTablaProductosResumidos;
	protected JButton jButtonCerrarProductosResumidos;
	
	
	protected JButton jButtonProcesarInformacionProductosResumidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosResumidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosResumidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosResumidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosResumidos;
	protected JButton jButtonModificarToolBarProductosResumidos;
	protected JButton jButtonActualizarToolBarProductosResumidos;
    protected JButton jButtonEliminarToolBarProductosResumidos;
	protected JButton jButtonCancelarToolBarProductosResumidos;
    protected JButton jButtonGuardarCambiosToolBarProductosResumidos;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosResumidos;
	protected JButton jButtonCerrarToolBarProductosResumidos;
	
	protected JButton jButtonProcesarInformacionToolBarProductosResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosResumidos;
	protected JMenuItem jMenuItemModificarProductosResumidos;
	protected JMenuItem jMenuItemActualizarProductosResumidos;
    protected JMenuItem jMenuItemEliminarProductosResumidos;
	protected JMenuItem jMenuItemCancelarProductosResumidos;
    protected JMenuItem jMenuItemGuardarCambiosProductosResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosResumidos;
	protected JMenuItem jMenuItemCerrarProductosResumidos;
	protected JMenuItem jMenuItemDetalleCerrarProductosResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosResumidos;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosResumidos;
	protected JMenuItem jMenuItemMostrarOcultarProductosResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosResumidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosResumidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosResumidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosResumidos;
	public JLabel jLabelIdProductosResumidos;
	public JLabel jLabelidProductosResumidos;
	public JButton jButtonidProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeProductosResumidos;
	public JLabel jLabelfecha_emision_desdeProductosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeProductosResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeProductosResumidos;
	public JButton jButtonfecha_emision_desdeProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaProductosResumidos;
	public JLabel jLabelfecha_emision_hastaProductosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaProductosResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaProductosResumidos;
	public JButton jButtonfecha_emision_hastaProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosResumidos;
	public JLabel jLabelnombre_unidadProductosResumidos;
	public JTextField jTextFieldnombre_unidadProductosResumidos;
	public JButton jButtonnombre_unidadProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProductosResumidos;
	public JLabel jLabelnombre_productoProductosResumidos;
	public JTextArea jTextAreanombre_productoProductosResumidos;
	public JScrollPane jscrollPanenombre_productoProductosResumidos;
	public JButton jButtonnombre_productoProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductosResumidos;
	public JLabel jLabelcantidadProductosResumidos;
	public JTextField jTextFieldcantidadProductosResumidos;
	public JButton jButtoncantidadProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelmontoProductosResumidos;
	public JLabel jLabelmontoProductosResumidos;
	public JTextField jTextFieldmontoProductosResumidos;
	public JButton jButtonmontoProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoProductosResumidos;
	public JLabel jLabelcodigo_productoProductosResumidos;
	public JTextField jTextFieldcodigo_productoProductosResumidos;
	public JButton jButtoncodigo_productoProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltipoProductosResumidos;
	public JLabel jLabeltipoProductosResumidos;
	public JTextField jTextFieldtipoProductosResumidos;
	public JButton jButtontipoProductosResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoProductosResumidos;
	public JLabel jLabelid_productoProductosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductosResumidos;
	public JButton jButtonid_productoProductosResumidos= new JButtonMe();
	public JButton jButtonid_productoProductosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_productoProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaProductosResumidos;
	public JLabel jLabelid_empresaProductosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosResumidos;
	public JButton jButtonid_empresaProductosResumidos= new JButtonMe();
	public JButton jButtonid_empresaProductosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosResumidos;
	public JLabel jLabelid_sucursalProductosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosResumidos;
	public JButton jButtonid_sucursalProductosResumidos= new JButtonMe();
	public JButton jButtonid_sucursalProductosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosResumidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosResumidos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosResumidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosResumidos=new JPanel();
				this.jPanelAccionesFormularioProductosResumidos=new JPanel();
				this.jmenuBarDetalleProductosResumidos=new JMenuBar();
				this.jTtoolBarDetalleProductosResumidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosResumidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosResumidos() {
		return this.jButtonActualizarToolBarProductosResumidos;
	}
	
	public JButton getjButtonEliminarToolBarProductosResumidos() {
		return this.jButtonEliminarToolBarProductosResumidos;
	}
	
	public JButton getjButtonCancelarToolBarProductosResumidos() {
		return this.jButtonCancelarToolBarProductosResumidos;
	}		
	
	public JButton getjButtonProcesarInformacionProductosResumidos() {
		return this.jButtonProcesarInformacionProductosResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosResumidos)	{
		this.jButtonProcesarInformacionProductosResumidos = jButtonProcesarInformacionProductosResumidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosResumidos() {
		return this.jComboBoxTiposAccionesProductosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosResumidos(
			JComboBox jComboBoxTiposRelacionesProductosResumidos) {
		this.jComboBoxTiposRelacionesProductosResumidos = jComboBoxTiposRelacionesProductosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosResumidos(
			JComboBox jComboBoxTiposAccionesProductosResumidos) {
		this.jComboBoxTiposAccionesProductosResumidos = jComboBoxTiposAccionesProductosResumidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosResumidos() {
		return this.jComboBoxTiposAccionesFormularioProductosResumidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosResumidos(
			JComboBox jComboBoxTiposAccionesFormularioProductosResumidos) {
		this.jComboBoxTiposAccionesFormularioProductosResumidos = jComboBoxTiposAccionesFormularioProductosResumidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
		
		this.productosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosresumidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosResumidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosResumidos=new JButtonMe();
				this.jButtonModificarToolBarProductosResumidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosResumidos,this.jTtoolBarDetalleProductosResumidos,
							"actualizar","actualizar","Actualizar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosResumidos,this.jTtoolBarDetalleProductosResumidos,
							"eliminar","eliminar","Eliminar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosResumidos,this.jTtoolBarDetalleProductosResumidos,
							"cancelar","cancelar","Cancelar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosResumidos,this.jTtoolBarDetalleProductosResumidos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosResumidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosResumidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosResumidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosResumidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosResumidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosResumidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosResumidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosResumidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosResumidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosResumidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosResumidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosResumidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosResumidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosResumidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosResumidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosResumidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosResumidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosResumidos.add(this.jMenuItemDetalleCerrarProductosResumidos);
		
		this.jmenuDetalleAccionesProductosResumidos.add(this.jMenuItemActualizarProductosResumidos);
		this.jmenuDetalleAccionesProductosResumidos.add(this.jMenuItemEliminarProductosResumidos);
		this.jmenuDetalleAccionesProductosResumidos.add(this.jMenuItemCancelarProductosResumidos);		
		
		//this.jmenuDetalleDatosProductosResumidos.add(this.jMenuItemDetalleAbrirOrderByProductosResumidos);				
		this.jmenuDetalleDatosProductosResumidos.add(this.jMenuItemDetalleMostarOcultarProductosResumidos);				
				
		//this.jmenuDetalleAccionesProductosResumidos.add(this.jMenuItemGuardarCambiosProductosResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosResumidos.add(this.jmenuDetalleArchivoProductosResumidos);		
		this.jmenuBarDetalleProductosResumidos.add(this.jmenuDetalleAccionesProductosResumidos);		
		this.jmenuBarDetalleProductosResumidos.add(this.jmenuDetalleDatosProductosResumidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosResumidos);				
	}
	
	
	public void inicializarElementosCamposProductosResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosResumidos = new JLabelMe();
		jLabelIdProductosResumidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosResumidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosResumidos= new GridBagLayout();

		this.jPanelidProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);

		jLabelidProductosResumidos = new JLabel();
		jLabelidProductosResumidos.setText("Id");

		jLabelidProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeProductosResumidos = new JLabelMe();
		this.jLabelfecha_emision_desdeProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeProductosResumidos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelfecha_emision_desdeProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		//jFormattedTextFieldfecha_emision_desdeProductosResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeProductosResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeProductosResumidos.setEnabled(false);
		jDateChooserfecha_emision_desdeProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeProductosResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeProductosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeProductosResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeProductosResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaProductosResumidos = new JLabelMe();
		this.jLabelfecha_emision_hastaProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaProductosResumidos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelfecha_emision_hastaProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		//jFormattedTextFieldfecha_emision_hastaProductosResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaProductosResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaProductosResumidos.setEnabled(false);
		jDateChooserfecha_emision_hastaProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaProductosResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaProductosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaProductosResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaProductosResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosResumidos = new JLabelMe();
		this.jLabelnombre_unidadProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosResumidos.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelnombre_unidadProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jTextFieldnombre_unidadProductosResumidos= new JTextFieldMe();

		jTextFieldnombre_unidadProductosResumidos.setEnabled(false);
		jTextFieldnombre_unidadProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosResumidosBusqueda.setText("U");
		this.jButtonnombre_unidadProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProductosResumidos = new JLabelMe();
		this.jLabelnombre_productoProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProductosResumidos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelnombre_productoProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jTextAreanombre_productoProductosResumidos= new JTextAreaMe();
		jTextAreanombre_productoProductosResumidos.setEnabled(false);
		jTextAreanombre_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosResumidos.setLineWrap(true);
		jTextAreanombre_productoProductosResumidos.setWrapStyleWord(true);
		jTextAreanombre_productoProductosResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProductosResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProductosResumidos = new JScrollPane(jTextAreanombre_productoProductosResumidos);
		jscrollPanenombre_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProductosResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_productoProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProductosResumidosBusqueda.setText("U");
		this.jButtonnombre_productoProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProductosResumidos = new JLabelMe();
		this.jLabelcantidadProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductosResumidos.setToolTipText("Cantad");
		this.jLabelcantidadProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelcantidadProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jTextFieldcantidadProductosResumidos= new JTextFieldMe();
		jTextFieldcantidadProductosResumidos.setEnabled(false);
		jTextFieldcantidadProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductosResumidos.setText("0");

		this.jButtoncantidadProductosResumidosBusqueda= new JButtonMe();
		this.jButtoncantidadProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductosResumidosBusqueda.setText("U");
		this.jButtoncantidadProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelmontoProductosResumidos = new JLabelMe();
		this.jLabelmontoProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoProductosResumidos.setToolTipText("Monto");
		this.jLabelmontoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelmontoProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jTextFieldmontoProductosResumidos= new JTextFieldMe();
		jTextFieldmontoProductosResumidos.setEnabled(false);
		jTextFieldmontoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoProductosResumidos.setText("0.0");

		this.jButtonmontoProductosResumidosBusqueda= new JButtonMe();
		this.jButtonmontoProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoProductosResumidosBusqueda.setText("U");
		this.jButtonmontoProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoProductosResumidos = new JLabelMe();
		this.jLabelcodigo_productoProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoProductosResumidos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelcodigo_productoProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jTextFieldcodigo_productoProductosResumidos= new JTextFieldMe();

		jTextFieldcodigo_productoProductosResumidos.setEnabled(false);
		jTextFieldcodigo_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoProductosResumidosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoProductosResumidosBusqueda.setText("U");
		this.jButtoncodigo_productoProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoProductosResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltipoProductosResumidos = new JLabelMe();
		this.jLabeltipoProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoProductosResumidos.setToolTipText("Tipo");
		this.jLabeltipoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPaneltipoProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jTextFieldtipoProductosResumidos= new JTextFieldMe();

		jTextFieldtipoProductosResumidos.setEnabled(false);
		jTextFieldtipoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoProductosResumidosBusqueda= new JButtonMe();
		this.jButtontipoProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoProductosResumidosBusqueda.setText("U");
		this.jButtontipoProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoProductosResumidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_productoProductosResumidos = new JLabelMe();
		this.jLabelid_productoProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductosResumidos.setToolTipText("Producto");
		this.jLabelid_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelid_productoProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jComboBoxid_productoProductosResumidos= new JComboBoxMe();
		jComboBoxid_productoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductosResumidos= new JButtonMe();
		this.jButtonid_productoProductosResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosResumidos.setText("Buscar");
		this.jButtonid_productoProductosResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductosResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosResumidos"));

		this.jButtonid_productoProductosResumidosBusqueda= new JButtonMe();
		this.jButtonid_productoProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosResumidosBusqueda.setText("U");
		this.jButtonid_productoProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductosResumidosBusqueda.setVisible(false);		}

		this.jButtonid_productoProductosResumidosUpdate= new JButtonMe();
		this.jButtonid_productoProductosResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosResumidosUpdate.setText("U");
		this.jButtonid_productoProductosResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductosResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosResumidosUpdate"));



					
		this.jLabelid_empresaProductosResumidos = new JLabelMe();
		this.jLabelid_empresaProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosResumidos.setToolTipText("Empresa");
		this.jLabelid_empresaProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelid_empresaProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jComboBoxid_empresaProductosResumidos= new JComboBoxMe();
		jComboBoxid_empresaProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosResumidos.setEnabled(false);

		this.jButtonid_empresaProductosResumidos= new JButtonMe();
		this.jButtonid_empresaProductosResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosResumidos.setText("Buscar");
		this.jButtonid_empresaProductosResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosResumidos"));

		this.jButtonid_empresaProductosResumidosBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosResumidosBusqueda.setText("U");
		this.jButtonid_empresaProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosResumidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosResumidosUpdate= new JButtonMe();
		this.jButtonid_empresaProductosResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosResumidosUpdate.setText("U");
		this.jButtonid_empresaProductosResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosResumidosUpdate"));



					
		this.jLabelid_sucursalProductosResumidos = new JLabelMe();
		this.jLabelid_sucursalProductosResumidos.setText(""+ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosResumidos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosResumidos.setToolTipText(ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosResumidos = new GridBagLayout();
		this.jPanelid_sucursalProductosResumidos.setLayout(this.gridaBagLayoutProductosResumidos);


		jComboBoxid_sucursalProductosResumidos= new JComboBoxMe();
		jComboBoxid_sucursalProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosResumidos.setEnabled(false);

		this.jButtonid_sucursalProductosResumidos= new JButtonMe();
		this.jButtonid_sucursalProductosResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosResumidos.setText("Buscar");
		this.jButtonid_sucursalProductosResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosResumidos"));

		this.jButtonid_sucursalProductosResumidosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosResumidosBusqueda.setText("U");
		this.jButtonid_sucursalProductosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosResumidosBusqueda"));

		if(this.productosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosResumidosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosResumidosUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosResumidosUpdate.setText("U");
		this.jButtonid_sucursalProductosResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosResumidosUpdate"));



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
		//this.jInternalFrameDetalleProductosResumidos = new ProductosResumidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Resumidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosResumidos= new GridBagLayout();
		

		
		String sToolTipProductosResumidos="";
		sToolTipProductosResumidos=ProductosResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosResumidos+="(Facturacion.ProductosResumidos)";
		}
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosResumidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosResumidos = new JButtonMe();
		this.jButtonModificarProductosResumidos = new JButtonMe();
        this.jButtonActualizarProductosResumidos = new JButtonMe();
        this.jButtonEliminarProductosResumidos = new JButtonMe();
        this.jButtonCancelarProductosResumidos = new JButtonMe();
        this.jButtonGuardarCambiosProductosResumidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosResumidos = new JButtonMe();
		this.jButtonCerrarProductosResumidos = new JButtonMe();
		
		this.jScrollPanelDatosProductosResumidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosResumidos = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosResumidos = new JScrollPane();
				
		
		
		this.jPanelCamposProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Resumidos";
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosResumidos.setName("jPanelCamposProductosResumidos"); 

		this.jPanelCamposOcultosProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosResumidos.setName("jPanelCamposOcultosProductosResumidos"); 

        this.jPanelAccionesProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosResumidos.setToolTipText("Acciones");
        this.jPanelAccionesProductosResumidos.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosResumidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosResumidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosResumidos.setText("Nuevo");
		this.jButtonModificarProductosResumidos.setText("Editar");
        this.jButtonActualizarProductosResumidos.setText("Actualizar");
        this.jButtonEliminarProductosResumidos.setText("Eliminar");
        this.jButtonCancelarProductosResumidos.setText("Cancelar");
        this.jButtonGuardarCambiosProductosResumidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosResumidos.setText("Guardar");
		this.jButtonCerrarProductosResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosResumidos,"nuevo_button","Nuevo",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosResumidos,"modificar_button","Editar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosResumidos,"actualizar_button","Actualizar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosResumidos,"eliminar_button","Eliminar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosResumidos,"cancelar_button","Cancelar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosResumidos,"guardarcambios_button","Guardar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosResumidos,"guardarcambiostabla_button","Guardar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosResumidos,"cerrar_button","Salir",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosResumidos.setToolTipText("Nuevo"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosResumidos.setToolTipText("Editar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosResumidos.setToolTipText("Actualizar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosResumidos.setToolTipText("Eliminar)"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosResumidos.setToolTipText("Cancelar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosResumidos.setToolTipText("Guardar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosResumidos.setToolTipText("Guardar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosResumidos.setToolTipText("Salir"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosResumidos";
		inputMap = this.jButtonNuevoProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosResumidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosResumidos";
		inputMap = this.jButtonActualizarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosResumidos"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosResumidos";
		inputMap = this.jButtonEliminarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosResumidos"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosResumidos";
		inputMap = this.jButtonCancelarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosResumidos"));
		
		//CERRAR		
		sMapKey = "CerrarProductosResumidos";
		inputMap = this.jButtonCerrarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosResumidos";
		inputMap = this.jButtonGuardarCambiosTablaProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosResumidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosResumidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosResumidos.setToolTipText("Nuevo ProductosResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosResumidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosResumidos.setToolTipText("Sin Cerrar Ventana ProductosResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosResumidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosResumidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosResumidos.setText("Accion");
		this.jComboBoxTiposAccionesProductosResumidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosResumidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosResumidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosResumidos = new JLabelMe();
		
		this.jLabelAccionesProductosResumidos.setText("Acciones");		
		this.jLabelAccionesProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosResumidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosResumidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosResumidos=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosResumidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosResumidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosResumidos = new GridBagLayout();
		
		this.jPanelCamposProductosResumidos.setLayout(gridaBagLayoutCamposProductosResumidos);
		this.jPanelCamposOcultosProductosResumidos.setLayout(gridaBagLayoutCamposOcultosProductosResumidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosResumidos.add(jLabelIdProductosResumidos, this.gridBagConstraintsProductosResumidos);



	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosResumidos.add(jLabelidProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductosResumidos.add(jLabelid_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductosResumidos.add(jButtonid_productoProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 3;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductosResumidos.add(jButtonid_productoProductosResumidosUpdate, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductosResumidos.add(jComboBoxid_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosResumidos.add(jLabelid_empresaProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosResumidos.add(jButtonid_empresaProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 3;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosResumidos.add(jButtonid_empresaProductosResumidosUpdate, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosResumidos.add(jComboBoxid_empresaProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosResumidos.add(jLabelid_sucursalProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosResumidos.add(jButtonid_sucursalProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 3;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosResumidos.add(jButtonid_sucursalProductosResumidosUpdate, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosResumidos.add(jComboBoxid_sucursalProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeProductosResumidos.add(jLabelfecha_emision_desdeProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeProductosResumidos.add(jButtonfecha_emision_desdeProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeProductosResumidos.add(jDateChooserfecha_emision_desdeProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaProductosResumidos.add(jLabelfecha_emision_hastaProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaProductosResumidos.add(jButtonfecha_emision_hastaProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaProductosResumidos.add(jDateChooserfecha_emision_hastaProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosResumidos.add(jLabelnombre_unidadProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosResumidos.add(jButtonnombre_unidadProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosResumidos.add(jTextFieldnombre_unidadProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProductosResumidos.add(jLabelnombre_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProductosResumidos.add(jButtonnombre_productoProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProductosResumidos.add(jscrollPanenombre_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductosResumidos.add(jLabelcantidadProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductosResumidos.add(jButtoncantidadProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductosResumidos.add(jTextFieldcantidadProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoProductosResumidos.add(jLabelmontoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoProductosResumidos.add(jButtonmontoProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoProductosResumidos.add(jTextFieldmontoProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoProductosResumidos.add(jLabelcodigo_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoProductosResumidos.add(jButtoncodigo_productoProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoProductosResumidos.add(jTextFieldcodigo_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);


	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 0;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoProductosResumidos.add(jLabeltipoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 2;
		this.gridBagConstraintsProductosResumidos.ipadx = 0;
		this.gridBagConstraintsProductosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoProductosResumidos.add(jButtontipoProductosResumidosBusqueda, this.gridBagConstraintsProductosResumidos);
	}

	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosResumidos.gridy = 0;
	this.gridBagConstraintsProductosResumidos.gridx = 1;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoProductosResumidos.add(jTextFieldtipoProductosResumidos, this.gridBagConstraintsProductosResumidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelidProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelid_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelfecha_emision_desdeProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelfecha_emision_hastaProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelnombre_unidadProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelnombre_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelcantidadProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelmontoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPanelcodigo_productoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosResumidos.add(this.jPaneltipoProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposProductosResumidos % 1==0) {
		iXPanelCamposProductosResumidos=0;
		iYPanelCamposProductosResumidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposOcultosProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposOcultosProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosResumidos.add(this.jPanelid_empresaProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposOcultosProductosResumidos % 1==0) {
		iXPanelCamposOcultosProductosResumidos=0;
		iYPanelCamposOcultosProductosResumidos++;
	}
	this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosResumidos.gridy = iYPanelCamposOcultosProductosResumidos;
	this.gridBagConstraintsProductosResumidos.gridx = iXPanelCamposOcultosProductosResumidos++;
	this.gridBagConstraintsProductosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosResumidos.add(this.jPanelid_sucursalProductosResumidos, this.gridBagConstraintsProductosResumidos);



	if(iXPanelCamposOcultosProductosResumidos % 1==0) {
		iXPanelCamposOcultosProductosResumidos=0;
		iYPanelCamposOcultosProductosResumidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosResumidos= new GridBagLayout();
		this.jPanelAccionesProductosResumidos.setLayout(gridaBagLayoutAccionesProductosResumidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosResumidos= new GridBagLayout();
		this.jPanelAccionesFormularioProductosResumidos.setLayout(gridaBagLayoutAccionesFormularioProductosResumidos);
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosResumidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosResumidos.add(this.jComboBoxTiposAccionesFormularioProductosResumidos, this.gridBagConstraintsProductosResumidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosResumidos.add(this.jButtonModificarProductosResumidos, this.gridBagConstraintsProductosResumidos);							

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosResumidos.add(this.jButtonEliminarProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = 0;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosResumidos.add(this.jButtonActualizarProductosResumidos, this.gridBagConstraintsProductosResumidos);


		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = 0;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosResumidos.add(this.jButtonGuardarCambiosProductosResumidos, this.gridBagConstraintsProductosResumidos);	
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = 0;		
		this.gridBagConstraintsProductosResumidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosResumidos.add(this.jButtonCancelarProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosResumidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();						
			this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosResumidos.gridx = 0;		
			//this.gridBagConstraintsProductosResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosResumidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosResumidos.gridx =0;
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosResumidos, this.gridBagConstraintsProductosResumidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosResumidos = new ProductosResumidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Resumidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Resumidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Resumidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosResumidosModel productosresumidosModel=new ProductosResumidosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosResumidosModel.ProductosResumidosFocusTraversalPolicy productosresumidosFocusTraversalPolicy = productosresumidosModel.new ProductosResumidosFocusTraversalPolicy(this);
			
			//productosresumidosFocusTraversalPolicy.setproductosresumidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosresumidosModel);
			
			
			this.jContentPaneDetalleProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosResumidos = new GridBagLayout();	
			this.jContentPaneDetalleProductosResumidos.setLayout(gridaBagLayoutDetalleProductosResumidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosResumidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
				this.gridBagConstraintsProductosResumidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosResumidos.gridx = 0;
					
				
				this.jContentPaneDetalleProductosResumidos.add(jTtoolBarDetalleProductosResumidos, gridBagConstraintsProductosResumidos);								
				
}
			
			this.jScrollPanelDatosEdicionProductosResumidos=   new JScrollPane(jContentPaneDetalleProductosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosResumidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosResumidos.gridx = 0;
	        
			this.jContentPaneDetalleProductosResumidos.add(jPanelCamposProductosResumidos, gridBagConstraintsProductosResumidos);
			
			
			
			
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
						//&& productosresumidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosResumidos= new GridBagConstraints();
						this.gridBagConstraintsProductosResumidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosResumidos.gridx = 0;
						this.jContentPaneDetalleProductosResumidos.add(this.jTabbedPaneRelacionesProductosResumidos, this.gridBagConstraintsProductosResumidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosResumidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosResumidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
					this.gridBagConstraintsProductosResumidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosResumidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosResumidos.gridx = 0;
					
				
					this.jContentPaneDetalleProductosResumidos.add(jPanelCamposOcultosProductosResumidos, gridBagConstraintsProductosResumidos);
				
					this.jPanelCamposOcultosProductosResumidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosResumidos.gridx = 0;
	        this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosResumidos.add(this.jPanelAccionesFormularioProductosResumidos, this.gridBagConstraintsProductosResumidos);							
			
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
	        this.gridBagConstraintsProductosResumidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosResumidos.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosResumidos.add(this.jPanelAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosResumidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosResumidos=   new JScrollPane(this.jPanelCamposProductosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosResumidos.gridx = 0;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosResumidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosResumidos, this.gridBagConstraintsProductosResumidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosResumidos, this.gridBagConstraintsProductosResumidos);			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosResumidos, this.gridBagConstraintsProductosResumidos);
			
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosResumidos;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosResumidos;
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
