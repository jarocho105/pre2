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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.report.ProductosMarcasConstantesFunciones;

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
public class ProductosMarcasDetalleFormJInternalFrame extends ProductosMarcasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosMarcas;
	
	protected JMenuBar jmenuBarDetalleProductosMarcas;
	
	protected JMenu jmenuDetalleProductosMarcas;
	protected JMenu jmenuDetalleArchivoProductosMarcas;
	protected JMenu jmenuDetalleAccionesProductosMarcas;
	protected JMenu jmenuDetalleDatosProductosMarcas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosMarcas;	
	protected GridBagConstraints gridBagConstraintsProductosMarcas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosMarcasBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosMarcas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductosMarcasSessionBean productosmarcasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductosMarcasLogic productosmarcasLogic;
	
	public JScrollPane jScrollPanelDatosProductosMarcas;
	public JScrollPane jScrollPanelDatosEdicionProductosMarcas;
	public JScrollPane jScrollPanelDatosGeneralProductosMarcas;
	
	protected JPanel jPanelCamposProductosMarcas;    
	protected JPanel jPanelCamposOcultosProductosMarcas;    	
	protected JPanel jPanelAccionesProductosMarcas;
	protected JPanel jPanelAccionesFormularioProductosMarcas;
    
	
	
	protected Integer iXPanelCamposProductosMarcas=0;
	protected Integer iYPanelCamposProductosMarcas=0;
	
	protected Integer iXPanelCamposOcultosProductosMarcas=0;
	protected Integer iYPanelCamposOcultosProductosMarcas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosMarcas;
	public JButton jButtonModificarProductosMarcas;
	public JButton jButtonActualizarProductosMarcas;
    public JButton jButtonEliminarProductosMarcas;
	public JButton jButtonCancelarProductosMarcas;
    public JButton jButtonGuardarCambiosProductosMarcas;
	public JButton jButtonGuardarCambiosTablaProductosMarcas;
	protected JButton jButtonCerrarProductosMarcas;
	
	
	protected JButton jButtonProcesarInformacionProductosMarcas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosMarcas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosMarcas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosMarcas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosMarcas;
	protected JButton jButtonModificarToolBarProductosMarcas;
	protected JButton jButtonActualizarToolBarProductosMarcas;
    protected JButton jButtonEliminarToolBarProductosMarcas;
	protected JButton jButtonCancelarToolBarProductosMarcas;
    protected JButton jButtonGuardarCambiosToolBarProductosMarcas;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosMarcas;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosMarcas;
	protected JButton jButtonCerrarToolBarProductosMarcas;
	
	protected JButton jButtonProcesarInformacionToolBarProductosMarcas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosMarcas;
	protected JMenuItem jMenuItemModificarProductosMarcas;
	protected JMenuItem jMenuItemActualizarProductosMarcas;
    protected JMenuItem jMenuItemEliminarProductosMarcas;
	protected JMenuItem jMenuItemCancelarProductosMarcas;
    protected JMenuItem jMenuItemGuardarCambiosProductosMarcas;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosMarcas;
	protected JMenuItem jMenuItemCerrarProductosMarcas;
	protected JMenuItem jMenuItemDetalleCerrarProductosMarcas;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosMarcas;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosMarcas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosMarcas;
	protected JMenuItem jMenuItemMostrarOcultarProductosMarcas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosMarcas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosMarcas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosMarcas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosMarcas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosMarcas;
	public JLabel jLabelIdProductosMarcas;
	public JLabel jLabelidProductosMarcas;
	public JButton jButtonidProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeProductosMarcas;
	public JLabel jLabelfecha_emision_desdeProductosMarcas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeProductosMarcas;

	public JDateChooser jDateChooserfecha_emision_desdeProductosMarcas;
	public JButton jButtonfecha_emision_desdeProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaProductosMarcas;
	public JLabel jLabelfecha_emision_hastaProductosMarcas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaProductosMarcas;

	public JDateChooser jDateChooserfecha_emision_hastaProductosMarcas;
	public JButton jButtonfecha_emision_hastaProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProductosMarcas;
	public JLabel jLabelnombre_unidadProductosMarcas;
	public JTextField jTextFieldnombre_unidadProductosMarcas;
	public JButton jButtonnombre_unidadProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProductosMarcas;
	public JLabel jLabelnombre_productoProductosMarcas;
	public JTextArea jTextAreanombre_productoProductosMarcas;
	public JScrollPane jscrollPanenombre_productoProductosMarcas;
	public JButton jButtonnombre_productoProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaProductosMarcas;
	public JLabel jLabelnombre_lineaProductosMarcas;
	public JTextField jTextFieldnombre_lineaProductosMarcas;
	public JButton jButtonnombre_lineaProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoProductosMarcas;
	public JLabel jLabelnombre_linea_grupoProductosMarcas;
	public JTextField jTextFieldnombre_linea_grupoProductosMarcas;
	public JButton jButtonnombre_linea_grupoProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaProductosMarcas;
	public JLabel jLabelnombre_linea_categoriaProductosMarcas;
	public JTextField jTextFieldnombre_linea_categoriaProductosMarcas;
	public JButton jButtonnombre_linea_categoriaProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaProductosMarcas;
	public JLabel jLabelnombre_linea_marcaProductosMarcas;
	public JTextField jTextFieldnombre_linea_marcaProductosMarcas;
	public JButton jButtonnombre_linea_marcaProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductosMarcas;
	public JLabel jLabelcantidadProductosMarcas;
	public JTextField jTextFieldcantidadProductosMarcas;
	public JButton jButtoncantidadProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelmontoProductosMarcas;
	public JLabel jLabelmontoProductosMarcas;
	public JTextField jTextFieldmontoProductosMarcas;
	public JButton jButtonmontoProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoProductosMarcas;
	public JLabel jLabelcodigo_productoProductosMarcas;
	public JTextField jTextFieldcodigo_productoProductosMarcas;
	public JButton jButtoncodigo_productoProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPaneltipoProductosMarcas;
	public JLabel jLabeltipoProductosMarcas;
	public JTextField jTextFieldtipoProductosMarcas;
	public JButton jButtontipoProductosMarcasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosMarcas;
	public JLabel jLabelid_empresaProductosMarcas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosMarcas;
	public JButton jButtonid_empresaProductosMarcas= new JButtonMe();
	public JButton jButtonid_empresaProductosMarcasUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosMarcas;
	public JLabel jLabelid_sucursalProductosMarcas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosMarcas;
	public JButton jButtonid_sucursalProductosMarcas= new JButtonMe();
	public JButton jButtonid_sucursalProductosMarcasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosMarcasBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductosMarcas;
	public JLabel jLabelid_productoProductosMarcas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductosMarcas;
	public JButton jButtonid_productoProductosMarcas= new JButtonMe();
	public JButton jButtonid_productoProductosMarcasUpdate= new JButtonMe();
	public JButton jButtonid_productoProductosMarcasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosMarcas;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosMarcasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosMarcas=new JPanel();
				this.jPanelAccionesFormularioProductosMarcas=new JPanel();
				this.jmenuBarDetalleProductosMarcas=new JMenuBar();
				this.jTtoolBarDetalleProductosMarcas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosMarcasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosMarcas() {
		return this.jButtonActualizarToolBarProductosMarcas;
	}
	
	public JButton getjButtonEliminarToolBarProductosMarcas() {
		return this.jButtonEliminarToolBarProductosMarcas;
	}
	
	public JButton getjButtonCancelarToolBarProductosMarcas() {
		return this.jButtonCancelarToolBarProductosMarcas;
	}		
	
	public JButton getjButtonProcesarInformacionProductosMarcas() {
		return this.jButtonProcesarInformacionProductosMarcas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosMarcas)	{
		this.jButtonProcesarInformacionProductosMarcas = jButtonProcesarInformacionProductosMarcas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosMarcas() {
		return this.jComboBoxTiposAccionesProductosMarcas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosMarcas(
			JComboBox jComboBoxTiposRelacionesProductosMarcas) {
		this.jComboBoxTiposRelacionesProductosMarcas = jComboBoxTiposRelacionesProductosMarcas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosMarcas(
			JComboBox jComboBoxTiposAccionesProductosMarcas) {
		this.jComboBoxTiposAccionesProductosMarcas = jComboBoxTiposAccionesProductosMarcas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosMarcas() {
		return this.jComboBoxTiposAccionesFormularioProductosMarcas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosMarcas(
			JComboBox jComboBoxTiposAccionesFormularioProductosMarcas) {
		this.jComboBoxTiposAccionesFormularioProductosMarcas = jComboBoxTiposAccionesFormularioProductosMarcas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
		
		this.productosmarcasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosmarcasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosmarcasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosMarcasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosMarcasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosMarcasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Marcas MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosMarcasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosMarcas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosMarcas=new JButtonMe();
				this.jButtonModificarToolBarProductosMarcas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosMarcas,this.jTtoolBarDetalleProductosMarcas,
							"actualizar","actualizar","Actualizar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosMarcas,this.jTtoolBarDetalleProductosMarcas,
							"eliminar","eliminar","Eliminar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosMarcas,this.jTtoolBarDetalleProductosMarcas,
							"cancelar","cancelar","Cancelar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosMarcas,this.jTtoolBarDetalleProductosMarcas,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosMarcas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosMarcas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosMarcas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosMarcas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosMarcas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosMarcas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosMarcas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosMarcas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosMarcas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosMarcas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosMarcas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosMarcas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosMarcas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosMarcas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosMarcas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosMarcas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosMarcas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosMarcas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosMarcas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosMarcas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosMarcas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosMarcas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosMarcas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosMarcas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosMarcas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosMarcas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosMarcas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosMarcas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosMarcas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosMarcas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosMarcas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosMarcas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosMarcas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosMarcas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosMarcas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosMarcas.add(this.jMenuItemDetalleCerrarProductosMarcas);
		
		this.jmenuDetalleAccionesProductosMarcas.add(this.jMenuItemActualizarProductosMarcas);
		this.jmenuDetalleAccionesProductosMarcas.add(this.jMenuItemEliminarProductosMarcas);
		this.jmenuDetalleAccionesProductosMarcas.add(this.jMenuItemCancelarProductosMarcas);		
		
		//this.jmenuDetalleDatosProductosMarcas.add(this.jMenuItemDetalleAbrirOrderByProductosMarcas);				
		this.jmenuDetalleDatosProductosMarcas.add(this.jMenuItemDetalleMostarOcultarProductosMarcas);				
				
		//this.jmenuDetalleAccionesProductosMarcas.add(this.jMenuItemGuardarCambiosProductosMarcas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosMarcas.add(this.jmenuDetalleArchivoProductosMarcas);		
		this.jmenuBarDetalleProductosMarcas.add(this.jmenuDetalleAccionesProductosMarcas);		
		this.jmenuBarDetalleProductosMarcas.add(this.jmenuDetalleDatosProductosMarcas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosMarcas);				
	}
	
	
	public void inicializarElementosCamposProductosMarcas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosMarcas = new JLabelMe();
		jLabelIdProductosMarcas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosMarcas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosMarcas= new GridBagLayout();

		this.jPanelidProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);

		jLabelidProductosMarcas = new JLabel();
		jLabelidProductosMarcas.setText("Id");

		jLabelidProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeProductosMarcas = new JLabelMe();
		this.jLabelfecha_emision_desdeProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeProductosMarcas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelfecha_emision_desdeProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		//jFormattedTextFieldfecha_emision_desdeProductosMarcas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeProductosMarcas= new JDateChooser();
		jDateChooserfecha_emision_desdeProductosMarcas.setEnabled(false);
		jDateChooserfecha_emision_desdeProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeProductosMarcas.setDate(new Date());
		jDateChooserfecha_emision_desdeProductosMarcas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeProductosMarcas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeProductosMarcasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaProductosMarcas = new JLabelMe();
		this.jLabelfecha_emision_hastaProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaProductosMarcas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelfecha_emision_hastaProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		//jFormattedTextFieldfecha_emision_hastaProductosMarcas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaProductosMarcas= new JDateChooser();
		jDateChooserfecha_emision_hastaProductosMarcas.setEnabled(false);
		jDateChooserfecha_emision_hastaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaProductosMarcas.setDate(new Date());
		jDateChooserfecha_emision_hastaProductosMarcas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaProductosMarcas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaProductosMarcasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProductosMarcas = new JLabelMe();
		this.jLabelnombre_unidadProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProductosMarcas.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelnombre_unidadProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldnombre_unidadProductosMarcas= new JTextFieldMe();

		jTextFieldnombre_unidadProductosMarcas.setEnabled(false);
		jTextFieldnombre_unidadProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProductosMarcasBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProductosMarcasBusqueda.setText("U");
		this.jButtonnombre_unidadProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProductosMarcas = new JLabelMe();
		this.jLabelnombre_productoProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProductosMarcas.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelnombre_productoProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextAreanombre_productoProductosMarcas= new JTextAreaMe();
		jTextAreanombre_productoProductosMarcas.setEnabled(false);
		jTextAreanombre_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductosMarcas.setLineWrap(true);
		jTextAreanombre_productoProductosMarcas.setWrapStyleWord(true);
		jTextAreanombre_productoProductosMarcas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProductosMarcas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProductosMarcas = new JScrollPane(jTextAreanombre_productoProductosMarcas);
		jscrollPanenombre_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProductosMarcasBusqueda= new JButtonMe();
		this.jButtonnombre_productoProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProductosMarcasBusqueda.setText("U");
		this.jButtonnombre_productoProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaProductosMarcas = new JLabelMe();
		this.jLabelnombre_lineaProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaProductosMarcas.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelnombre_lineaProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldnombre_lineaProductosMarcas= new JTextFieldMe();

		jTextFieldnombre_lineaProductosMarcas.setEnabled(false);
		jTextFieldnombre_lineaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_lineaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_lineaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_lineaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_lineaProductosMarcasBusqueda= new JButtonMe();
		this.jButtonnombre_lineaProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaProductosMarcasBusqueda.setText("U");
		this.jButtonnombre_lineaProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_lineaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_lineaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoProductosMarcas = new JLabelMe();
		this.jLabelnombre_linea_grupoProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoProductosMarcas.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelnombre_linea_grupoProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldnombre_linea_grupoProductosMarcas= new JTextFieldMe();

		jTextFieldnombre_linea_grupoProductosMarcas.setEnabled(false);
		jTextFieldnombre_linea_grupoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_linea_grupoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_linea_grupoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_linea_grupoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_linea_grupoProductosMarcasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setText("U");
		this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_linea_grupoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_linea_grupoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaProductosMarcas = new JLabelMe();
		this.jLabelnombre_linea_categoriaProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaProductosMarcas.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelnombre_linea_categoriaProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldnombre_linea_categoriaProductosMarcas= new JTextFieldMe();

		jTextFieldnombre_linea_categoriaProductosMarcas.setEnabled(false);
		jTextFieldnombre_linea_categoriaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_linea_categoriaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_linea_categoriaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_linea_categoriaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_linea_categoriaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_linea_categoriaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaProductosMarcas = new JLabelMe();
		this.jLabelnombre_linea_marcaProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaProductosMarcas.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelnombre_linea_marcaProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldnombre_linea_marcaProductosMarcas= new JTextFieldMe();

		jTextFieldnombre_linea_marcaProductosMarcas.setEnabled(false);
		jTextFieldnombre_linea_marcaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_linea_marcaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_linea_marcaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_linea_marcaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_linea_marcaProductosMarcasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setText("U");
		this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_linea_marcaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_linea_marcaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProductosMarcas = new JLabelMe();
		this.jLabelcantidadProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductosMarcas.setToolTipText("Cantad");
		this.jLabelcantidadProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelcantidadProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldcantidadProductosMarcas= new JTextFieldMe();
		jTextFieldcantidadProductosMarcas.setEnabled(false);
		jTextFieldcantidadProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductosMarcas.setText("0");

		this.jButtoncantidadProductosMarcasBusqueda= new JButtonMe();
		this.jButtoncantidadProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductosMarcasBusqueda.setText("U");
		this.jButtoncantidadProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelmontoProductosMarcas = new JLabelMe();
		this.jLabelmontoProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoProductosMarcas.setToolTipText("Monto");
		this.jLabelmontoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelmontoProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldmontoProductosMarcas= new JTextFieldMe();
		jTextFieldmontoProductosMarcas.setEnabled(false);
		jTextFieldmontoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoProductosMarcas.setText("0.0");

		this.jButtonmontoProductosMarcasBusqueda= new JButtonMe();
		this.jButtonmontoProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoProductosMarcasBusqueda.setText("U");
		this.jButtonmontoProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoProductosMarcas = new JLabelMe();
		this.jLabelcodigo_productoProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoProductosMarcas.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelcodigo_productoProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldcodigo_productoProductosMarcas= new JTextFieldMe();

		jTextFieldcodigo_productoProductosMarcas.setEnabled(false);
		jTextFieldcodigo_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoProductosMarcasBusqueda= new JButtonMe();
		this.jButtoncodigo_productoProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoProductosMarcasBusqueda.setText("U");
		this.jButtoncodigo_productoProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoProductosMarcasBusqueda.setVisible(false);		}


					
		this.jLabeltipoProductosMarcas = new JLabelMe();
		this.jLabeltipoProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoProductosMarcas.setToolTipText("Tipo");
		this.jLabeltipoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPaneltipoProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jTextFieldtipoProductosMarcas= new JTextFieldMe();

		jTextFieldtipoProductosMarcas.setEnabled(false);
		jTextFieldtipoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoProductosMarcasBusqueda= new JButtonMe();
		this.jButtontipoProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoProductosMarcasBusqueda.setText("U");
		this.jButtontipoProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoProductosMarcasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosMarcas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosMarcas = new JLabelMe();
		this.jLabelid_empresaProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosMarcas.setToolTipText("Empresa");
		this.jLabelid_empresaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelid_empresaProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jComboBoxid_empresaProductosMarcas= new JComboBoxMe();
		jComboBoxid_empresaProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosMarcas.setEnabled(false);

		this.jButtonid_empresaProductosMarcas= new JButtonMe();
		this.jButtonid_empresaProductosMarcas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosMarcas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosMarcas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosMarcas.setText("Buscar");
		this.jButtonid_empresaProductosMarcas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosMarcas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosMarcas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosMarcas"));

		this.jButtonid_empresaProductosMarcasBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosMarcasBusqueda.setText("U");
		this.jButtonid_empresaProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosMarcasBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosMarcasUpdate= new JButtonMe();
		this.jButtonid_empresaProductosMarcasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosMarcasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosMarcasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosMarcasUpdate.setText("U");
		this.jButtonid_empresaProductosMarcasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosMarcasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosMarcasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosMarcasUpdate"));



					
		this.jLabelid_sucursalProductosMarcas = new JLabelMe();
		this.jLabelid_sucursalProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosMarcas.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelid_sucursalProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jComboBoxid_sucursalProductosMarcas= new JComboBoxMe();
		jComboBoxid_sucursalProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosMarcas.setEnabled(false);

		this.jButtonid_sucursalProductosMarcas= new JButtonMe();
		this.jButtonid_sucursalProductosMarcas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosMarcas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosMarcas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosMarcas.setText("Buscar");
		this.jButtonid_sucursalProductosMarcas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosMarcas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosMarcas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosMarcas"));

		this.jButtonid_sucursalProductosMarcasBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosMarcasBusqueda.setText("U");
		this.jButtonid_sucursalProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosMarcasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosMarcasUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosMarcasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosMarcasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosMarcasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosMarcasUpdate.setText("U");
		this.jButtonid_sucursalProductosMarcasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosMarcasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosMarcasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosMarcasUpdate"));



					
		this.jLabelid_productoProductosMarcas = new JLabelMe();
		this.jLabelid_productoProductosMarcas.setText(""+ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductosMarcas.setToolTipText("Producto");
		this.jLabelid_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductosMarcas.setToolTipText(ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductosMarcas = new GridBagLayout();
		this.jPanelid_productoProductosMarcas.setLayout(this.gridaBagLayoutProductosMarcas);


		jComboBoxid_productoProductosMarcas= new JComboBoxMe();
		jComboBoxid_productoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductosMarcas= new JButtonMe();
		this.jButtonid_productoProductosMarcas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosMarcas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosMarcas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductosMarcas.setText("Buscar");
		this.jButtonid_productoProductosMarcas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductosMarcas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosMarcas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosMarcas"));

		this.jButtonid_productoProductosMarcasBusqueda= new JButtonMe();
		this.jButtonid_productoProductosMarcasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosMarcasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosMarcasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosMarcasBusqueda.setText("U");
		this.jButtonid_productoProductosMarcasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductosMarcasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosMarcasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosMarcasBusqueda"));

		if(this.productosmarcasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductosMarcasBusqueda.setVisible(false);		}

		this.jButtonid_productoProductosMarcasUpdate= new JButtonMe();
		this.jButtonid_productoProductosMarcasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosMarcasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosMarcasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosMarcasUpdate.setText("U");
		this.jButtonid_productoProductosMarcasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductosMarcasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosMarcasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosMarcasUpdate"));



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
		//this.jInternalFrameDetalleProductosMarcas = new ProductosMarcasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Marcas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosMarcas= new GridBagLayout();
		

		
		String sToolTipProductosMarcas="";
		sToolTipProductosMarcas=ProductosMarcasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosMarcas+="(Facturacion.ProductosMarcas)";
		}
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosMarcas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosMarcas = new JButtonMe();
		this.jButtonModificarProductosMarcas = new JButtonMe();
        this.jButtonActualizarProductosMarcas = new JButtonMe();
        this.jButtonEliminarProductosMarcas = new JButtonMe();
        this.jButtonCancelarProductosMarcas = new JButtonMe();
        this.jButtonGuardarCambiosProductosMarcas = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosMarcas = new JButtonMe();
		this.jButtonCerrarProductosMarcas = new JButtonMe();
		
		this.jScrollPanelDatosProductosMarcas = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosMarcas = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosMarcas = new JScrollPane();
				
		
		
		this.jPanelCamposProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Marcas";
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Marcases" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosMarcas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosMarcas.setName("jPanelCamposProductosMarcas"); 

		this.jPanelCamposOcultosProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosMarcas.setName("jPanelCamposOcultosProductosMarcas"); 

        this.jPanelAccionesProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosMarcas.setToolTipText("Acciones");
        this.jPanelAccionesProductosMarcas.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosMarcas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosMarcas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosMarcas.setText("Nuevo");
		this.jButtonModificarProductosMarcas.setText("Editar");
        this.jButtonActualizarProductosMarcas.setText("Actualizar");
        this.jButtonEliminarProductosMarcas.setText("Eliminar");
        this.jButtonCancelarProductosMarcas.setText("Cancelar");
        this.jButtonGuardarCambiosProductosMarcas.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosMarcas.setText("Guardar");
		this.jButtonCerrarProductosMarcas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosMarcas,"nuevo_button","Nuevo",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosMarcas,"modificar_button","Editar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosMarcas,"actualizar_button","Actualizar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosMarcas,"eliminar_button","Eliminar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosMarcas,"cancelar_button","Cancelar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosMarcas,"guardarcambios_button","Guardar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosMarcas,"guardarcambiostabla_button","Guardar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosMarcas,"cerrar_button","Salir",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosMarcas.setToolTipText("Nuevo"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosMarcas.setToolTipText("Editar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosMarcas.setToolTipText("Actualizar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosMarcas.setToolTipText("Eliminar)"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosMarcas.setToolTipText("Cancelar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosMarcas.setToolTipText("Guardar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosMarcas.setToolTipText("Guardar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosMarcas.setToolTipText("Salir"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosMarcas";
		inputMap = this.jButtonNuevoProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosMarcas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosMarcas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosMarcas";
		inputMap = this.jButtonActualizarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosMarcas"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosMarcas";
		inputMap = this.jButtonEliminarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosMarcas"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosMarcas";
		inputMap = this.jButtonCancelarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosMarcas"));
		
		//CERRAR		
		sMapKey = "CerrarProductosMarcas";
		inputMap = this.jButtonCerrarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosMarcas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosMarcas";
		inputMap = this.jButtonGuardarCambiosTablaProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosMarcas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosMarcas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosMarcas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosMarcas.setToolTipText("Nuevo ProductosMarcas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosMarcas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosMarcas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosMarcas.setToolTipText("Sin Cerrar Ventana ProductosMarcas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosMarcas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosMarcas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosMarcas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosMarcas.setText("Accion");
		this.jComboBoxTiposAccionesProductosMarcas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosMarcas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosMarcas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosMarcas = new JLabelMe();
		
		this.jLabelAccionesProductosMarcas.setText("Acciones");		
		this.jLabelAccionesProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosMarcas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosMarcas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosMarcas=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosMarcas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosMarcas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosMarcas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosMarcas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosMarcas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosMarcas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosMarcas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosMarcas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosMarcas = new GridBagLayout();
		
		this.jPanelCamposProductosMarcas.setLayout(gridaBagLayoutCamposProductosMarcas);
		this.jPanelCamposOcultosProductosMarcas.setLayout(gridaBagLayoutCamposOcultosProductosMarcas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosMarcas.add(jLabelIdProductosMarcas, this.gridBagConstraintsProductosMarcas);



	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosMarcas.add(jLabelidProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosMarcas.add(jLabelid_empresaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosMarcas.add(jButtonid_empresaProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 3;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosMarcas.add(jButtonid_empresaProductosMarcasUpdate, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosMarcas.add(jComboBoxid_empresaProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosMarcas.add(jLabelid_sucursalProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosMarcas.add(jButtonid_sucursalProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 3;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosMarcas.add(jButtonid_sucursalProductosMarcasUpdate, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosMarcas.add(jComboBoxid_sucursalProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductosMarcas.add(jLabelid_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductosMarcas.add(jButtonid_productoProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 3;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductosMarcas.add(jButtonid_productoProductosMarcasUpdate, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductosMarcas.add(jComboBoxid_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeProductosMarcas.add(jLabelfecha_emision_desdeProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeProductosMarcas.add(jButtonfecha_emision_desdeProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeProductosMarcas.add(jDateChooserfecha_emision_desdeProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaProductosMarcas.add(jLabelfecha_emision_hastaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaProductosMarcas.add(jButtonfecha_emision_hastaProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaProductosMarcas.add(jDateChooserfecha_emision_hastaProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProductosMarcas.add(jLabelnombre_unidadProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProductosMarcas.add(jButtonnombre_unidadProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProductosMarcas.add(jTextFieldnombre_unidadProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProductosMarcas.add(jLabelnombre_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProductosMarcas.add(jButtonnombre_productoProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProductosMarcas.add(jscrollPanenombre_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaProductosMarcas.add(jLabelnombre_lineaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaProductosMarcas.add(jButtonnombre_lineaProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaProductosMarcas.add(jTextFieldnombre_lineaProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoProductosMarcas.add(jLabelnombre_linea_grupoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoProductosMarcas.add(jButtonnombre_linea_grupoProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoProductosMarcas.add(jTextFieldnombre_linea_grupoProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaProductosMarcas.add(jLabelnombre_linea_categoriaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaProductosMarcas.add(jButtonnombre_linea_categoriaProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaProductosMarcas.add(jTextFieldnombre_linea_categoriaProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaProductosMarcas.add(jLabelnombre_linea_marcaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaProductosMarcas.add(jButtonnombre_linea_marcaProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaProductosMarcas.add(jTextFieldnombre_linea_marcaProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductosMarcas.add(jLabelcantidadProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductosMarcas.add(jButtoncantidadProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductosMarcas.add(jTextFieldcantidadProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoProductosMarcas.add(jLabelmontoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoProductosMarcas.add(jButtonmontoProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoProductosMarcas.add(jTextFieldmontoProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoProductosMarcas.add(jLabelcodigo_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoProductosMarcas.add(jButtoncodigo_productoProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoProductosMarcas.add(jTextFieldcodigo_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);


	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 0;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoProductosMarcas.add(jLabeltipoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 2;
		this.gridBagConstraintsProductosMarcas.ipadx = 0;
		this.gridBagConstraintsProductosMarcas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoProductosMarcas.add(jButtontipoProductosMarcasBusqueda, this.gridBagConstraintsProductosMarcas);
	}

	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosMarcas.gridy = 0;
	this.gridBagConstraintsProductosMarcas.gridx = 1;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoProductosMarcas.add(jTextFieldtipoProductosMarcas, this.gridBagConstraintsProductosMarcas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelidProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelid_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelfecha_emision_desdeProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelfecha_emision_hastaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelnombre_unidadProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelnombre_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelnombre_lineaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelnombre_linea_grupoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelnombre_linea_categoriaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelnombre_linea_marcaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelcantidadProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelmontoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPanelcodigo_productoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosMarcas.add(this.jPaneltipoProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposProductosMarcas % 2==0) {
		iXPanelCamposProductosMarcas=0;
		iYPanelCamposProductosMarcas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposOcultosProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposOcultosProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosMarcas.add(this.jPanelid_empresaProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposOcultosProductosMarcas % 2==0) {
		iXPanelCamposOcultosProductosMarcas=0;
		iYPanelCamposOcultosProductosMarcas++;
	}
	this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosMarcas.gridy = iYPanelCamposOcultosProductosMarcas;
	this.gridBagConstraintsProductosMarcas.gridx = iXPanelCamposOcultosProductosMarcas++;
	this.gridBagConstraintsProductosMarcas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosMarcas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosMarcas.add(this.jPanelid_sucursalProductosMarcas, this.gridBagConstraintsProductosMarcas);



	if(iXPanelCamposOcultosProductosMarcas % 2==0) {
		iXPanelCamposOcultosProductosMarcas=0;
		iYPanelCamposOcultosProductosMarcas++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosMarcas= new GridBagLayout();
		this.jPanelAccionesProductosMarcas.setLayout(gridaBagLayoutAccionesProductosMarcas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosMarcas= new GridBagLayout();
		this.jPanelAccionesFormularioProductosMarcas.setLayout(gridaBagLayoutAccionesFormularioProductosMarcas);
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosMarcas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosMarcas.add(this.jComboBoxTiposAccionesFormularioProductosMarcas, this.gridBagConstraintsProductosMarcas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosMarcas.add(this.jButtonModificarProductosMarcas, this.gridBagConstraintsProductosMarcas);							

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosMarcas.add(this.jButtonEliminarProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = 0;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosMarcas.add(this.jButtonActualizarProductosMarcas, this.gridBagConstraintsProductosMarcas);


		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = 0;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosMarcas.add(this.jButtonGuardarCambiosProductosMarcas, this.gridBagConstraintsProductosMarcas);	
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = 0;		
		this.gridBagConstraintsProductosMarcas.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosMarcas.add(this.jButtonCancelarProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosMarcas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosMarcas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();						
			this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosMarcas.gridx = 0;		
			//this.gridBagConstraintsProductosMarcas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosMarcas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosMarcas.gridx =0;
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosMarcas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosMarcas, this.gridBagConstraintsProductosMarcas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosMarcas = new ProductosMarcasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Marcas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Marcas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Marcas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosMarcasModel productosmarcasModel=new ProductosMarcasModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosMarcasModel.ProductosMarcasFocusTraversalPolicy productosmarcasFocusTraversalPolicy = productosmarcasModel.new ProductosMarcasFocusTraversalPolicy(this);
			
			//productosmarcasFocusTraversalPolicy.setproductosmarcasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosmarcasModel);
			
			
			this.jContentPaneDetalleProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosMarcas = new GridBagLayout();	
			this.jContentPaneDetalleProductosMarcas.setLayout(gridaBagLayoutDetalleProductosMarcas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosMarcas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
				this.gridBagConstraintsProductosMarcas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosMarcas.gridx = 0;
					
				
				this.jContentPaneDetalleProductosMarcas.add(jTtoolBarDetalleProductosMarcas, gridBagConstraintsProductosMarcas);								
				
}
			
			this.jScrollPanelDatosEdicionProductosMarcas=   new JScrollPane(jContentPaneDetalleProductosMarcas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosMarcas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosMarcas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosMarcas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosMarcas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosMarcas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosMarcas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosMarcas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosMarcas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosMarcas.gridx = 0;
	        
			this.jContentPaneDetalleProductosMarcas.add(jPanelCamposProductosMarcas, gridBagConstraintsProductosMarcas);
			
			
			
			
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
						//&& productosmarcasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosMarcas= new GridBagConstraints();
						this.gridBagConstraintsProductosMarcas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosMarcas.gridx = 0;
						this.jContentPaneDetalleProductosMarcas.add(this.jTabbedPaneRelacionesProductosMarcas, this.gridBagConstraintsProductosMarcas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosMarcas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosMarcas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
					this.gridBagConstraintsProductosMarcas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosMarcas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosMarcas.gridx = 0;
					
				
					this.jContentPaneDetalleProductosMarcas.add(jPanelCamposOcultosProductosMarcas, gridBagConstraintsProductosMarcas);
				
					this.jPanelCamposOcultosProductosMarcas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosMarcas.gridx = 0;
	        this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosMarcas.add(this.jPanelAccionesFormularioProductosMarcas, this.gridBagConstraintsProductosMarcas);							
			
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
	        this.gridBagConstraintsProductosMarcas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosMarcas.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosMarcas.add(this.jPanelAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosMarcas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosMarcas=   new JScrollPane(this.jPanelCamposProductosMarcas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosMarcas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosMarcas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosMarcas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosMarcas.gridx = 0;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosMarcas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosMarcas, this.gridBagConstraintsProductosMarcas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosMarcas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosMarcas, this.gridBagConstraintsProductosMarcas);			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosMarcas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosMarcas, this.gridBagConstraintsProductosMarcas);
			
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosMarcas;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosMarcas;
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
