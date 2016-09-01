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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ProductosConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ProductosDetalleFormJInternalFrame extends ProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductos;
	
	protected JMenuBar jmenuBarDetalleProductos;
	
	protected JMenu jmenuDetalleProductos;
	protected JMenu jmenuDetalleArchivoProductos;
	protected JMenu jmenuDetalleAccionesProductos;
	protected JMenu jmenuDetalleDatosProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductos;	
	protected GridBagConstraints gridBagConstraintsProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductosSessionBean productosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductosLogic productosLogic;
	
	public JScrollPane jScrollPanelDatosProductos;
	public JScrollPane jScrollPanelDatosEdicionProductos;
	public JScrollPane jScrollPanelDatosGeneralProductos;
	
	protected JPanel jPanelCamposProductos;    
	protected JPanel jPanelCamposOcultosProductos;    	
	protected JPanel jPanelAccionesProductos;
	protected JPanel jPanelAccionesFormularioProductos;
    
	
	
	protected Integer iXPanelCamposProductos=0;
	protected Integer iYPanelCamposProductos=0;
	
	protected Integer iXPanelCamposOcultosProductos=0;
	protected Integer iYPanelCamposOcultosProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductos;
	public JButton jButtonModificarProductos;
	public JButton jButtonActualizarProductos;
    public JButton jButtonEliminarProductos;
	public JButton jButtonCancelarProductos;
    public JButton jButtonGuardarCambiosProductos;
	public JButton jButtonGuardarCambiosTablaProductos;
	protected JButton jButtonCerrarProductos;
	
	
	protected JButton jButtonProcesarInformacionProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductos;
	protected JButton jButtonModificarToolBarProductos;
	protected JButton jButtonActualizarToolBarProductos;
    protected JButton jButtonEliminarToolBarProductos;
	protected JButton jButtonCancelarToolBarProductos;
    protected JButton jButtonGuardarCambiosToolBarProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductos;
	protected JButton jButtonCerrarToolBarProductos;
	
	protected JButton jButtonProcesarInformacionToolBarProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductos;
	protected JMenuItem jMenuItemModificarProductos;
	protected JMenuItem jMenuItemActualizarProductos;
    protected JMenuItem jMenuItemEliminarProductos;
	protected JMenuItem jMenuItemCancelarProductos;
    protected JMenuItem jMenuItemGuardarCambiosProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductos;
	protected JMenuItem jMenuItemCerrarProductos;
	protected JMenuItem jMenuItemDetalleCerrarProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductos;
	protected JMenuItem jMenuItemMostrarOcultarProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductos;
	public JLabel jLabelIdProductos;
	public JLabel jLabelidProductos;
	public JButton jButtonidProductosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioProductos;
	public JLabel jLabelfecha_inicioProductos;
	//public JFormattedTextField jDateChooserfecha_inicioProductos;

	public JDateChooser jDateChooserfecha_inicioProductos;
	public JButton jButtonfecha_inicioProductosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finProductos;
	public JLabel jLabelfecha_finProductos;
	//public JFormattedTextField jDateChooserfecha_finProductos;

	public JDateChooser jDateChooserfecha_finProductos;
	public JButton jButtonfecha_finProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProductos;
	public JLabel jLabelnombre_productoProductos;
	public JTextArea jTextAreanombre_productoProductos;
	public JScrollPane jscrollPanenombre_productoProductos;
	public JButton jButtonnombre_productoProductosBusqueda= new JButtonMe();

	public JPanel jPanelfechaProductos;
	public JLabel jLabelfechaProductos;
	//public JFormattedTextField jDateChooserfechaProductos;

	public JDateChooser jDateChooserfechaProductos;
	public JButton jButtonfechaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductos;
	public JLabel jLabelcantidadProductos;
	public JTextField jTextFieldcantidadProductos;
	public JButton jButtoncantidadProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductos;
	public JLabel jLabelid_empresaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductos;
	public JButton jButtonid_empresaProductos= new JButtonMe();
	public JButton jButtonid_empresaProductosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductos;
	public JLabel jLabelid_sucursalProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductos;
	public JButton jButtonid_sucursalProductos= new JButtonMe();
	public JButton jButtonid_sucursalProductosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductos;
	public JLabel jLabelid_productoProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductos;
	public JButton jButtonid_productoProductos= new JButtonMe();
	public JButton jButtonid_productoProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductos;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductos=new JPanel();
				this.jPanelAccionesFormularioProductos=new JPanel();
				this.jmenuBarDetalleProductos=new JMenuBar();
				this.jTtoolBarDetalleProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductos() {
		return this.jButtonActualizarToolBarProductos;
	}
	
	public JButton getjButtonEliminarToolBarProductos() {
		return this.jButtonEliminarToolBarProductos;
	}
	
	public JButton getjButtonCancelarToolBarProductos() {
		return this.jButtonCancelarToolBarProductos;
	}		
	
	public JButton getjButtonProcesarInformacionProductos() {
		return this.jButtonProcesarInformacionProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductos)	{
		this.jButtonProcesarInformacionProductos = jButtonProcesarInformacionProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductos() {
		return this.jComboBoxTiposAccionesProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductos(
			JComboBox jComboBoxTiposRelacionesProductos) {
		this.jComboBoxTiposRelacionesProductos = jComboBoxTiposRelacionesProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductos(
			JComboBox jComboBoxTiposAccionesProductos) {
		this.jComboBoxTiposAccionesProductos = jComboBoxTiposAccionesProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductos() {
		return this.jComboBoxTiposAccionesFormularioProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductos(
			JComboBox jComboBoxTiposAccionesFormularioProductos) {
		this.jComboBoxTiposAccionesFormularioProductos = jComboBoxTiposAccionesFormularioProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosSessionBean=new ProductosSessionBean();
		
		this.productosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductos=new JButtonMe();
				this.jButtonModificarToolBarProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductos,this.jTtoolBarDetalleProductos,
							"actualizar","actualizar","Actualizar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductos,this.jTtoolBarDetalleProductos,
							"eliminar","eliminar","Eliminar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductos,this.jTtoolBarDetalleProductos,
							"cancelar","cancelar","Cancelar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductos,this.jTtoolBarDetalleProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductos.add(this.jMenuItemDetalleCerrarProductos);
		
		this.jmenuDetalleAccionesProductos.add(this.jMenuItemActualizarProductos);
		this.jmenuDetalleAccionesProductos.add(this.jMenuItemEliminarProductos);
		this.jmenuDetalleAccionesProductos.add(this.jMenuItemCancelarProductos);		
		
		//this.jmenuDetalleDatosProductos.add(this.jMenuItemDetalleAbrirOrderByProductos);				
		this.jmenuDetalleDatosProductos.add(this.jMenuItemDetalleMostarOcultarProductos);				
				
		//this.jmenuDetalleAccionesProductos.add(this.jMenuItemGuardarCambiosProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductos.add(this.jmenuDetalleArchivoProductos);		
		this.jmenuBarDetalleProductos.add(this.jmenuDetalleAccionesProductos);		
		this.jmenuBarDetalleProductos.add(this.jmenuDetalleDatosProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductos);				
	}
	
	
	public void inicializarElementosCamposProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductos = new JLabelMe();
		jLabelIdProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductos.setToolTipText(ProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductos= new GridBagLayout();

		this.jPanelidProductos.setLayout(this.gridaBagLayoutProductos);

		jLabelidProductos = new JLabel();
		jLabelidProductos.setText("Id");

		jLabelidProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioProductos = new JLabelMe();
		this.jLabelfecha_inicioProductos.setText(""+ProductosConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioProductos.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioProductos.setToolTipText(ProductosConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelfecha_inicioProductos.setLayout(this.gridaBagLayoutProductos);


		//jFormattedTextFieldfecha_inicioProductos= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioProductos= new JDateChooser();
		jDateChooserfecha_inicioProductos.setEnabled(false);
		jDateChooserfecha_inicioProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioProductos.setDate(new Date());
		jDateChooserfecha_inicioProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioProductosBusqueda= new JButtonMe();
		this.jButtonfecha_inicioProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioProductosBusqueda.setText("U");
		this.jButtonfecha_inicioProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioProductosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finProductos = new JLabelMe();
		this.jLabelfecha_finProductos.setText(""+ProductosConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finProductos.setToolTipText("Fecha Fin");
		this.jLabelfecha_finProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finProductos.setToolTipText(ProductosConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelfecha_finProductos.setLayout(this.gridaBagLayoutProductos);


		//jFormattedTextFieldfecha_finProductos= new JFormattedTextFieldMe();

		jDateChooserfecha_finProductos= new JDateChooser();
		jDateChooserfecha_finProductos.setEnabled(false);
		jDateChooserfecha_finProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finProductos.setDate(new Date());
		jDateChooserfecha_finProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finProductosBusqueda= new JButtonMe();
		this.jButtonfecha_finProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finProductosBusqueda.setText("U");
		this.jButtonfecha_finProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProductos = new JLabelMe();
		this.jLabelnombre_productoProductos.setText(""+ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProductos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProductos.setToolTipText(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelnombre_productoProductos.setLayout(this.gridaBagLayoutProductos);


		jTextAreanombre_productoProductos= new JTextAreaMe();
		jTextAreanombre_productoProductos.setEnabled(false);
		jTextAreanombre_productoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProductos.setLineWrap(true);
		jTextAreanombre_productoProductos.setWrapStyleWord(true);
		jTextAreanombre_productoProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProductos = new JScrollPane(jTextAreanombre_productoProductos);
		jscrollPanenombre_productoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProductosBusqueda= new JButtonMe();
		this.jButtonnombre_productoProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProductosBusqueda.setText("U");
		this.jButtonnombre_productoProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProductosBusqueda.setVisible(false);		}


					
		this.jLabelfechaProductos = new JLabelMe();
		this.jLabelfechaProductos.setText(""+ProductosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProductos.setToolTipText("Fecha");
		this.jLabelfechaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProductos.setToolTipText(ProductosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelfechaProductos.setLayout(this.gridaBagLayoutProductos);


		//jFormattedTextFieldfechaProductos= new JFormattedTextFieldMe();

		jDateChooserfechaProductos= new JDateChooser();
		jDateChooserfechaProductos.setEnabled(false);
		jDateChooserfechaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProductos.setDate(new Date());
		jDateChooserfechaProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProductosBusqueda= new JButtonMe();
		this.jButtonfechaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProductosBusqueda.setText("U");
		this.jButtonfechaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProductos = new JLabelMe();
		this.jLabelcantidadProductos.setText(""+ProductosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductos.setToolTipText("Cantad");
		this.jLabelcantidadProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductos.setToolTipText(ProductosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelcantidadProductos.setLayout(this.gridaBagLayoutProductos);


		jTextFieldcantidadProductos= new JTextFieldMe();
		jTextFieldcantidadProductos.setEnabled(false);
		jTextFieldcantidadProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductos.setText("0");

		this.jButtoncantidadProductosBusqueda= new JButtonMe();
		this.jButtoncantidadProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductosBusqueda.setText("U");
		this.jButtoncantidadProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductos = new JLabelMe();
		this.jLabelid_empresaProductos.setText(""+ProductosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductos.setToolTipText("Empresa");
		this.jLabelid_empresaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductos.setToolTipText(ProductosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelid_empresaProductos.setLayout(this.gridaBagLayoutProductos);


		jComboBoxid_empresaProductos= new JComboBoxMe();
		jComboBoxid_empresaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductos.setEnabled(false);

		this.jButtonid_empresaProductos= new JButtonMe();
		this.jButtonid_empresaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductos.setText("Buscar");
		this.jButtonid_empresaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductos"));

		this.jButtonid_empresaProductosBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosBusqueda.setText("U");
		this.jButtonid_empresaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosUpdate= new JButtonMe();
		this.jButtonid_empresaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosUpdate.setText("U");
		this.jButtonid_empresaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosUpdate"));



					
		this.jLabelid_sucursalProductos = new JLabelMe();
		this.jLabelid_sucursalProductos.setText(""+ProductosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductos.setToolTipText(ProductosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelid_sucursalProductos.setLayout(this.gridaBagLayoutProductos);


		jComboBoxid_sucursalProductos= new JComboBoxMe();
		jComboBoxid_sucursalProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductos.setEnabled(false);

		this.jButtonid_sucursalProductos= new JButtonMe();
		this.jButtonid_sucursalProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductos.setText("Buscar");
		this.jButtonid_sucursalProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductos"));

		this.jButtonid_sucursalProductosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosBusqueda.setText("U");
		this.jButtonid_sucursalProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosUpdate.setText("U");
		this.jButtonid_sucursalProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosUpdate"));



					
		this.jLabelid_productoProductos = new JLabelMe();
		this.jLabelid_productoProductos.setText(""+ProductosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductos.setToolTipText("Producto");
		this.jLabelid_productoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductos.setToolTipText(ProductosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductos = new GridBagLayout();
		this.jPanelid_productoProductos.setLayout(this.gridaBagLayoutProductos);


		jComboBoxid_productoProductos= new JComboBoxMe();
		jComboBoxid_productoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_productoProductos.setEnabled(false);

		this.jButtonid_productoProductos= new JButtonMe();
		this.jButtonid_productoProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductos.setText("Buscar");
		this.jButtonid_productoProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductos"));

		this.jButtonid_productoProductosBusqueda= new JButtonMe();
		this.jButtonid_productoProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosBusqueda.setText("U");
		this.jButtonid_productoProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosBusqueda"));

		if(this.productosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductosBusqueda.setVisible(false);		}

		this.jButtonid_productoProductosUpdate= new JButtonMe();
		this.jButtonid_productoProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductosUpdate.setText("U");
		this.jButtonid_productoProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductosUpdate"));



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
		//this.jInternalFrameDetalleProductos = new ProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductos= new GridBagLayout();
		

		
		String sToolTipProductos="";
		sToolTipProductos=ProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductos+="(PuntoVenta.Productos)";
		}
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductos = new JButtonMe();
		this.jButtonModificarProductos = new JButtonMe();
        this.jButtonActualizarProductos = new JButtonMe();
        this.jButtonEliminarProductos = new JButtonMe();
        this.jButtonCancelarProductos = new JButtonMe();
        this.jButtonGuardarCambiosProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductos = new JButtonMe();
		this.jButtonCerrarProductos = new JButtonMe();
		
		this.jScrollPanelDatosProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralProductos = new JScrollPane();
				
		
		
		this.jPanelCamposProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos";
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductos.setName("jPanelCamposProductos"); 

		this.jPanelCamposOcultosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductos.setName("jPanelCamposOcultosProductos"); 

        this.jPanelAccionesProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductos.setToolTipText("Acciones");
        this.jPanelAccionesProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductos.setText("Nuevo");
		this.jButtonModificarProductos.setText("Editar");
        this.jButtonActualizarProductos.setText("Actualizar");
        this.jButtonEliminarProductos.setText("Eliminar");
        this.jButtonCancelarProductos.setText("Cancelar");
        this.jButtonGuardarCambiosProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductos.setText("Guardar");
		this.jButtonCerrarProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductos,"nuevo_button","Nuevo",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductos,"modificar_button","Editar",this.productosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductos,"actualizar_button","Actualizar",this.productosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductos,"eliminar_button","Eliminar",this.productosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductos,"cancelar_button","Cancelar",this.productosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductos,"guardarcambios_button","Guardar",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductos,"guardarcambiostabla_button","Guardar",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductos,"cerrar_button","Salir",this.productosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductos.setToolTipText("Nuevo"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductos.setToolTipText("Editar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductos.setToolTipText("Actualizar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductos.setToolTipText("Eliminar)"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductos.setToolTipText("Cancelar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductos.setToolTipText("Guardar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductos.setToolTipText("Guardar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductos.setToolTipText("Salir"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductos";
		inputMap = this.jButtonNuevoProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductos";
		inputMap = this.jButtonActualizarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarProductos";
		inputMap = this.jButtonEliminarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarProductos";
		inputMap = this.jButtonCancelarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductos"));
		
		//CERRAR		
		sMapKey = "CerrarProductos";
		inputMap = this.jButtonCerrarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductos";
		inputMap = this.jButtonGuardarCambiosTablaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductos.setToolTipText("Nuevo Productos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductos.setToolTipText("Sin Cerrar Ventana Productos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductos.setText("Accion");
		this.jComboBoxTiposAccionesProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductos = new JLabelMe();
		
		this.jLabelAccionesProductos.setText("Acciones");		
		this.jLabelAccionesProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductos = new GridBagLayout();
		
		this.jPanelCamposProductos.setLayout(gridaBagLayoutCamposProductos);
		this.jPanelCamposOcultosProductos.setLayout(gridaBagLayoutCamposOcultosProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductos.add(jLabelIdProductos, this.gridBagConstraintsProductos);



	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductos.add(jLabelidProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductos.add(jLabelid_empresaProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductos.add(jButtonid_empresaProductosBusqueda, this.gridBagConstraintsProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 3;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductos.add(jButtonid_empresaProductosUpdate, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductos.add(jComboBoxid_empresaProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductos.add(jLabelid_sucursalProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductos.add(jButtonid_sucursalProductosBusqueda, this.gridBagConstraintsProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 3;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductos.add(jButtonid_sucursalProductosUpdate, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductos.add(jComboBoxid_sucursalProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductos.add(jLabelid_productoProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductos.add(jButtonid_productoProductosBusqueda, this.gridBagConstraintsProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 3;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductos.add(jButtonid_productoProductosUpdate, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductos.add(jComboBoxid_productoProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioProductos.add(jLabelfecha_inicioProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioProductos.add(jButtonfecha_inicioProductosBusqueda, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioProductos.add(jDateChooserfecha_inicioProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finProductos.add(jLabelfecha_finProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finProductos.add(jButtonfecha_finProductosBusqueda, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finProductos.add(jDateChooserfecha_finProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProductos.add(jLabelnombre_productoProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProductos.add(jButtonnombre_productoProductosBusqueda, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProductos.add(jscrollPanenombre_productoProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProductos.add(jLabelfechaProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProductos.add(jButtonfechaProductosBusqueda, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProductos.add(jDateChooserfechaProductos, this.gridBagConstraintsProductos);


	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 0;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductos.add(jLabelcantidadProductos, this.gridBagConstraintsProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 2;
		this.gridBagConstraintsProductos.ipadx = 0;
		this.gridBagConstraintsProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductos.add(jButtoncantidadProductosBusqueda, this.gridBagConstraintsProductos);
	}

	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductos.gridy = 0;
	this.gridBagConstraintsProductos.gridx = 1;
	this.gridBagConstraintsProductos.ipadx = 0;
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductos.add(jTextFieldcantidadProductos, this.gridBagConstraintsProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductos.add(this.jPanelidProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposProductos % 1==0) {
		iXPanelCamposProductos=0;
		iYPanelCamposProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductos.add(this.jPanelfecha_inicioProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposProductos % 1==0) {
		iXPanelCamposProductos=0;
		iYPanelCamposProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductos.add(this.jPanelfecha_finProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposProductos % 1==0) {
		iXPanelCamposProductos=0;
		iYPanelCamposProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductos.add(this.jPanelnombre_productoProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposProductos % 1==0) {
		iXPanelCamposProductos=0;
		iYPanelCamposProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductos.add(this.jPanelfechaProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposProductos % 1==0) {
		iXPanelCamposProductos=0;
		iYPanelCamposProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductos.add(this.jPanelcantidadProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposProductos % 1==0) {
		iXPanelCamposProductos=0;
		iYPanelCamposProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposOcultosProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposOcultosProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductos.add(this.jPanelid_empresaProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposOcultosProductos % 1==0) {
		iXPanelCamposOcultosProductos=0;
		iYPanelCamposOcultosProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposOcultosProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposOcultosProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductos.add(this.jPanelid_sucursalProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposOcultosProductos % 1==0) {
		iXPanelCamposOcultosProductos=0;
		iYPanelCamposOcultosProductos++;
	}
	this.gridBagConstraintsProductos = new GridBagConstraints();
	this.gridBagConstraintsProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductos.gridy = iYPanelCamposOcultosProductos;
	this.gridBagConstraintsProductos.gridx = iXPanelCamposOcultosProductos++;
	this.gridBagConstraintsProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductos.add(this.jPanelid_productoProductos, this.gridBagConstraintsProductos);



	if(iXPanelCamposOcultosProductos % 1==0) {
		iXPanelCamposOcultosProductos=0;
		iYPanelCamposOcultosProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductos= new GridBagLayout();
		this.jPanelAccionesProductos.setLayout(gridaBagLayoutAccionesProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductos= new GridBagLayout();
		this.jPanelAccionesFormularioProductos.setLayout(gridaBagLayoutAccionesFormularioProductos);
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductos.add(this.jComboBoxTiposAccionesFormularioProductos, this.gridBagConstraintsProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductos.add(this.jButtonModificarProductos, this.gridBagConstraintsProductos);							

		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductos.add(this.jButtonEliminarProductos, this.gridBagConstraintsProductos);
		
			
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = 0;		
		this.gridBagConstraintsProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductos.add(this.jButtonActualizarProductos, this.gridBagConstraintsProductos);


		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = 0;		
		this.gridBagConstraintsProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductos.add(this.jButtonGuardarCambiosProductos, this.gridBagConstraintsProductos);	
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = 0;		
		this.gridBagConstraintsProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductos.add(this.jButtonCancelarProductos, this.gridBagConstraintsProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductos = new GridBagConstraints();						
			this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductos.gridx = 0;		
			//this.gridBagConstraintsProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductos.gridx =0;
		this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductos, this.gridBagConstraintsProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductos = new ProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosModel productosModel=new ProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosModel.ProductosFocusTraversalPolicy productosFocusTraversalPolicy = productosModel.new ProductosFocusTraversalPolicy(this);
			
			//productosFocusTraversalPolicy.setproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosModel);
			
			
			this.jContentPaneDetalleProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductos = new GridBagLayout();	
			this.jContentPaneDetalleProductos.setLayout(gridaBagLayoutDetalleProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductos = new GridBagConstraints();
				this.gridBagConstraintsProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductos.gridx = 0;
					
				
				this.jContentPaneDetalleProductos.add(jTtoolBarDetalleProductos, gridBagConstraintsProductos);								
				
}
			
			this.jScrollPanelDatosEdicionProductos=   new JScrollPane(jContentPaneDetalleProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductos.gridx = 0;
	        
			this.jContentPaneDetalleProductos.add(jPanelCamposProductos, gridBagConstraintsProductos);
			
			
			
			
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
						//&& productosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductos= new GridBagConstraints();
						this.gridBagConstraintsProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductos.gridx = 0;
						this.jContentPaneDetalleProductos.add(this.jTabbedPaneRelacionesProductos, this.gridBagConstraintsProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductos = new GridBagConstraints();
					this.gridBagConstraintsProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductos.gridx = 0;
					
				
					this.jContentPaneDetalleProductos.add(jPanelCamposOcultosProductos, gridBagConstraintsProductos);
				
					this.jPanelCamposOcultosProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductos.gridx = 0;
	        this.gridBagConstraintsProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductos.add(this.jPanelAccionesFormularioProductos, this.gridBagConstraintsProductos);							
			
			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
	        this.gridBagConstraintsProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleProductos.add(this.jPanelAccionesProductos, this.gridBagConstraintsProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductos=   new JScrollPane(this.jPanelCamposProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductos.gridx = 0;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductos, this.gridBagConstraintsProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductos, this.gridBagConstraintsProductos);			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductos, this.gridBagConstraintsProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductos, this.gridBagConstraintsProductos);
			
			
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductos, this.gridBagConstraintsProductos);
		
			
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductos, this.gridBagConstraintsProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionProductos;
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
