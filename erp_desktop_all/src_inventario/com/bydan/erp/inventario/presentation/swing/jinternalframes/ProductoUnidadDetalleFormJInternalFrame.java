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
import com.bydan.erp.inventario.util.ProductoUnidadConstantesFunciones;

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
public class ProductoUnidadDetalleFormJInternalFrame extends ProductoUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoUnidad;
	
	protected JMenuBar jmenuBarDetalleProductoUnidad;
	
	protected JMenu jmenuDetalleProductoUnidad;
	protected JMenu jmenuDetalleArchivoProductoUnidad;
	protected JMenu jmenuDetalleAccionesProductoUnidad;
	protected JMenu jmenuDetalleDatosProductoUnidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoUnidad;	
	protected GridBagConstraints gridBagConstraintsProductoUnidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoUnidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoUnidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoUnidadSessionBean productounidadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoUnidadLogic productounidadLogic;
	
	public JScrollPane jScrollPanelDatosProductoUnidad;
	public JScrollPane jScrollPanelDatosEdicionProductoUnidad;
	public JScrollPane jScrollPanelDatosGeneralProductoUnidad;
	
	protected JPanel jPanelCamposProductoUnidad;    
	protected JPanel jPanelCamposOcultosProductoUnidad;    	
	protected JPanel jPanelAccionesProductoUnidad;
	protected JPanel jPanelAccionesFormularioProductoUnidad;
    
	
	
	protected Integer iXPanelCamposProductoUnidad=0;
	protected Integer iYPanelCamposProductoUnidad=0;
	
	protected Integer iXPanelCamposOcultosProductoUnidad=0;
	protected Integer iYPanelCamposOcultosProductoUnidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoUnidad;
	public JButton jButtonModificarProductoUnidad;
	public JButton jButtonActualizarProductoUnidad;
    public JButton jButtonEliminarProductoUnidad;
	public JButton jButtonCancelarProductoUnidad;
    public JButton jButtonGuardarCambiosProductoUnidad;
	public JButton jButtonGuardarCambiosTablaProductoUnidad;
	protected JButton jButtonCerrarProductoUnidad;
	
	
	protected JButton jButtonProcesarInformacionProductoUnidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoUnidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoUnidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoUnidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoUnidad;
	protected JButton jButtonModificarToolBarProductoUnidad;
	protected JButton jButtonActualizarToolBarProductoUnidad;
    protected JButton jButtonEliminarToolBarProductoUnidad;
	protected JButton jButtonCancelarToolBarProductoUnidad;
    protected JButton jButtonGuardarCambiosToolBarProductoUnidad;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoUnidad;
	protected JButton jButtonCerrarToolBarProductoUnidad;
	
	protected JButton jButtonProcesarInformacionToolBarProductoUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoUnidad;
	protected JMenuItem jMenuItemModificarProductoUnidad;
	protected JMenuItem jMenuItemActualizarProductoUnidad;
    protected JMenuItem jMenuItemEliminarProductoUnidad;
	protected JMenuItem jMenuItemCancelarProductoUnidad;
    protected JMenuItem jMenuItemGuardarCambiosProductoUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoUnidad;
	protected JMenuItem jMenuItemCerrarProductoUnidad;
	protected JMenuItem jMenuItemDetalleCerrarProductoUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoUnidad;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoUnidad;
	protected JMenuItem jMenuItemMostrarOcultarProductoUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoUnidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoUnidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoUnidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoUnidad;
	public JLabel jLabelIdProductoUnidad;
	public JLabel jLabelidProductoUnidad;
	public JButton jButtonidProductoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelvalor_unidadProductoUnidad;
	public JLabel jLabelvalor_unidadProductoUnidad;
	public JTextField jTextFieldvalor_unidadProductoUnidad;
	public JButton jButtonvalor_unidadProductoUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoUnidad;
	public JLabel jLabelid_empresaProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoUnidad;
	public JButton jButtonid_empresaProductoUnidad= new JButtonMe();
	public JButton jButtonid_empresaProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoUnidad;
	public JLabel jLabelid_sucursalProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoUnidad;
	public JButton jButtonid_sucursalProductoUnidad= new JButtonMe();
	public JButton jButtonid_sucursalProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoUnidad;
	public JLabel jLabelid_bodegaProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoUnidad;
	public JButton jButtonid_bodegaProductoUnidad= new JButtonMe();
	public JButton jButtonid_bodegaProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoUnidad;
	public JLabel jLabelid_productoProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoUnidad;
	public JButton jButtonid_productoProductoUnidad= new JButtonMe();
	public JButton jButtonid_productoProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoUnidad;
	public JLabel jLabelid_unidadProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoUnidad;
	public JButton jButtonid_unidadProductoUnidad= new JButtonMe();
	public JButton jButtonid_unidadProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoUnidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoUnidad;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoUnidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoUnidad=new JPanel();
				this.jPanelAccionesFormularioProductoUnidad=new JPanel();
				this.jmenuBarDetalleProductoUnidad=new JMenuBar();
				this.jTtoolBarDetalleProductoUnidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoUnidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoUnidad() {
		return this.jButtonActualizarToolBarProductoUnidad;
	}
	
	public JButton getjButtonEliminarToolBarProductoUnidad() {
		return this.jButtonEliminarToolBarProductoUnidad;
	}
	
	public JButton getjButtonCancelarToolBarProductoUnidad() {
		return this.jButtonCancelarToolBarProductoUnidad;
	}		
	
	public JButton getjButtonProcesarInformacionProductoUnidad() {
		return this.jButtonProcesarInformacionProductoUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoUnidad)	{
		this.jButtonProcesarInformacionProductoUnidad = jButtonProcesarInformacionProductoUnidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoUnidad() {
		return this.jComboBoxTiposAccionesProductoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoUnidad(
			JComboBox jComboBoxTiposRelacionesProductoUnidad) {
		this.jComboBoxTiposRelacionesProductoUnidad = jComboBoxTiposRelacionesProductoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoUnidad(
			JComboBox jComboBoxTiposAccionesProductoUnidad) {
		this.jComboBoxTiposAccionesProductoUnidad = jComboBoxTiposAccionesProductoUnidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoUnidad() {
		return this.jComboBoxTiposAccionesFormularioProductoUnidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoUnidad(
			JComboBox jComboBoxTiposAccionesFormularioProductoUnidad) {
		this.jComboBoxTiposAccionesFormularioProductoUnidad = jComboBoxTiposAccionesFormularioProductoUnidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productounidadSessionBean=new ProductoUnidadSessionBean();
		
		this.productounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productounidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoUnidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoUnidad=new JButtonMe();
				this.jButtonModificarToolBarProductoUnidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoUnidad,this.jTtoolBarDetalleProductoUnidad,
							"actualizar","actualizar","Actualizar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoUnidad,this.jTtoolBarDetalleProductoUnidad,
							"eliminar","eliminar","Eliminar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoUnidad,this.jTtoolBarDetalleProductoUnidad,
							"cancelar","cancelar","Cancelar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoUnidad,this.jTtoolBarDetalleProductoUnidad,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoUnidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoUnidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoUnidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoUnidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoUnidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoUnidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoUnidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoUnidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoUnidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoUnidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoUnidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoUnidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoUnidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoUnidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoUnidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoUnidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoUnidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoUnidad.add(this.jMenuItemDetalleCerrarProductoUnidad);
		
		this.jmenuDetalleAccionesProductoUnidad.add(this.jMenuItemActualizarProductoUnidad);
		this.jmenuDetalleAccionesProductoUnidad.add(this.jMenuItemEliminarProductoUnidad);
		this.jmenuDetalleAccionesProductoUnidad.add(this.jMenuItemCancelarProductoUnidad);		
		
		//this.jmenuDetalleDatosProductoUnidad.add(this.jMenuItemDetalleAbrirOrderByProductoUnidad);				
		this.jmenuDetalleDatosProductoUnidad.add(this.jMenuItemDetalleMostarOcultarProductoUnidad);				
				
		//this.jmenuDetalleAccionesProductoUnidad.add(this.jMenuItemGuardarCambiosProductoUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoUnidad.add(this.jmenuDetalleArchivoProductoUnidad);		
		this.jmenuBarDetalleProductoUnidad.add(this.jmenuDetalleAccionesProductoUnidad);		
		this.jmenuBarDetalleProductoUnidad.add(this.jmenuDetalleDatosProductoUnidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoUnidad);				
	}
	
	
	public void inicializarElementosCamposProductoUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoUnidad = new JLabelMe();
		jLabelIdProductoUnidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoUnidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoUnidad= new GridBagLayout();

		this.jPanelidProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);

		jLabelidProductoUnidad = new JLabel();
		jLabelidProductoUnidad.setText("Id");

		jLabelidProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_unidadProductoUnidad = new JLabelMe();
		this.jLabelvalor_unidadProductoUnidad.setText(""+ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD+" : *");
		this.jLabelvalor_unidadProductoUnidad.setToolTipText("Valor Unidad");
		this.jLabelvalor_unidadProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_unidadProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_unidadProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_unidadProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_unidadProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_unidadProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD);
		this.gridaBagLayoutProductoUnidad = new GridBagLayout();
		this.jPanelvalor_unidadProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);


		jTextFieldvalor_unidadProductoUnidad= new JTextFieldMe();
		jTextFieldvalor_unidadProductoUnidad.setEnabled(false);
		jTextFieldvalor_unidadProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_unidadProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_unidadProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_unidadProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_unidadProductoUnidad.setText("0.0");

		this.jButtonvalor_unidadProductoUnidadBusqueda= new JButtonMe();
		this.jButtonvalor_unidadProductoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_unidadProductoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_unidadProductoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_unidadProductoUnidadBusqueda.setText("U");
		this.jButtonvalor_unidadProductoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_unidadProductoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_unidadProductoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_unidadProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_unidadProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_unidadProductoUnidadBusqueda"));

		if(this.productounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_unidadProductoUnidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoUnidad = new JLabelMe();
		this.jLabelid_empresaProductoUnidad.setText(""+ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoUnidad.setToolTipText("Empresa");
		this.jLabelid_empresaProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoUnidad = new GridBagLayout();
		this.jPanelid_empresaProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);


		jComboBoxid_empresaProductoUnidad= new JComboBoxMe();
		jComboBoxid_empresaProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoUnidad.setEnabled(false);

		this.jButtonid_empresaProductoUnidad= new JButtonMe();
		this.jButtonid_empresaProductoUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoUnidad.setText("Buscar");
		this.jButtonid_empresaProductoUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoUnidad"));

		this.jButtonid_empresaProductoUnidadBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoUnidadBusqueda.setText("U");
		this.jButtonid_empresaProductoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoUnidadBusqueda"));

		if(this.productounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoUnidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoUnidadUpdate= new JButtonMe();
		this.jButtonid_empresaProductoUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoUnidadUpdate.setText("U");
		this.jButtonid_empresaProductoUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoUnidadUpdate"));



					
		this.jLabelid_sucursalProductoUnidad = new JLabelMe();
		this.jLabelid_sucursalProductoUnidad.setText(""+ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoUnidad.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoUnidad = new GridBagLayout();
		this.jPanelid_sucursalProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);


		jComboBoxid_sucursalProductoUnidad= new JComboBoxMe();
		jComboBoxid_sucursalProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoUnidad.setEnabled(false);

		this.jButtonid_sucursalProductoUnidad= new JButtonMe();
		this.jButtonid_sucursalProductoUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoUnidad.setText("Buscar");
		this.jButtonid_sucursalProductoUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoUnidad"));

		this.jButtonid_sucursalProductoUnidadBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoUnidadBusqueda.setText("U");
		this.jButtonid_sucursalProductoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoUnidadBusqueda"));

		if(this.productounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoUnidadBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoUnidadUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoUnidadUpdate.setText("U");
		this.jButtonid_sucursalProductoUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoUnidadUpdate"));



					
		this.jLabelid_bodegaProductoUnidad = new JLabelMe();
		this.jLabelid_bodegaProductoUnidad.setText(""+ProductoUnidadConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoUnidad.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoUnidad = new GridBagLayout();
		this.jPanelid_bodegaProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);


		jComboBoxid_bodegaProductoUnidad= new JComboBoxMe();
		jComboBoxid_bodegaProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoUnidad= new JButtonMe();
		this.jButtonid_bodegaProductoUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoUnidad.setText("Buscar");
		this.jButtonid_bodegaProductoUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoUnidad"));

		this.jButtonid_bodegaProductoUnidadBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoUnidadBusqueda.setText("U");
		this.jButtonid_bodegaProductoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoUnidadBusqueda"));

		if(this.productounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoUnidadBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoUnidadUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoUnidadUpdate.setText("U");
		this.jButtonid_bodegaProductoUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoUnidadUpdate"));



					
		this.jLabelid_productoProductoUnidad = new JLabelMe();
		this.jLabelid_productoProductoUnidad.setText(""+ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoUnidad.setToolTipText("Producto");
		this.jLabelid_productoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoUnidad = new GridBagLayout();
		this.jPanelid_productoProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);


		jComboBoxid_productoProductoUnidad= new JComboBoxMe();
		jComboBoxid_productoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoUnidad= new JButtonMe();
		this.jButtonid_productoProductoUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoUnidad.setText("Buscar");
		this.jButtonid_productoProductoUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoUnidad"));

		this.jButtonid_productoProductoUnidadBusqueda= new JButtonMe();
		this.jButtonid_productoProductoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoUnidadBusqueda.setText("U");
		this.jButtonid_productoProductoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoUnidadBusqueda"));

		if(this.productounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoUnidadBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoUnidadUpdate= new JButtonMe();
		this.jButtonid_productoProductoUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoUnidadUpdate.setText("U");
		this.jButtonid_productoProductoUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoUnidadUpdate"));



					
		this.jLabelid_unidadProductoUnidad = new JLabelMe();
		this.jLabelid_unidadProductoUnidad.setText(""+ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoUnidad.setToolTipText("Unad");
		this.jLabelid_unidadProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoUnidad.setToolTipText(ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoUnidad = new GridBagLayout();
		this.jPanelid_unidadProductoUnidad.setLayout(this.gridaBagLayoutProductoUnidad);


		jComboBoxid_unidadProductoUnidad= new JComboBoxMe();
		jComboBoxid_unidadProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoUnidad= new JButtonMe();
		this.jButtonid_unidadProductoUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoUnidad.setText("Buscar");
		this.jButtonid_unidadProductoUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoUnidad"));

		this.jButtonid_unidadProductoUnidadBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoUnidadBusqueda.setText("U");
		this.jButtonid_unidadProductoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoUnidadBusqueda"));

		if(this.productounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoUnidadBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoUnidadUpdate= new JButtonMe();
		this.jButtonid_unidadProductoUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoUnidadUpdate.setText("U");
		this.jButtonid_unidadProductoUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoUnidadUpdate"));



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
		//this.jInternalFrameDetalleProductoUnidad = new ProductoUnidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Unidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoUnidad= new GridBagLayout();
		

		
		String sToolTipProductoUnidad="";
		sToolTipProductoUnidad=ProductoUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoUnidad+="(Inventario.ProductoUnidad)";
		}
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoUnidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoUnidad = new JButtonMe();
		this.jButtonModificarProductoUnidad = new JButtonMe();
        this.jButtonActualizarProductoUnidad = new JButtonMe();
        this.jButtonEliminarProductoUnidad = new JButtonMe();
        this.jButtonCancelarProductoUnidad = new JButtonMe();
        this.jButtonGuardarCambiosProductoUnidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoUnidad = new JButtonMe();
		this.jButtonCerrarProductoUnidad = new JButtonMe();
		
		this.jScrollPanelDatosProductoUnidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoUnidad = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoUnidad = new JScrollPane();
				
		
		
		this.jPanelCamposProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Unidad";
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Unidads" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoUnidad.setName("jPanelCamposProductoUnidad"); 

		this.jPanelCamposOcultosProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoUnidad.setName("jPanelCamposOcultosProductoUnidad"); 

        this.jPanelAccionesProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoUnidad.setToolTipText("Acciones");
        this.jPanelAccionesProductoUnidad.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoUnidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoUnidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoUnidad.setText("Nuevo");
		this.jButtonModificarProductoUnidad.setText("Editar");
        this.jButtonActualizarProductoUnidad.setText("Actualizar");
        this.jButtonEliminarProductoUnidad.setText("Eliminar");
        this.jButtonCancelarProductoUnidad.setText("Cancelar");
        this.jButtonGuardarCambiosProductoUnidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoUnidad.setText("Guardar");
		this.jButtonCerrarProductoUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoUnidad,"nuevo_button","Nuevo",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoUnidad,"modificar_button","Editar",this.productounidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoUnidad,"actualizar_button","Actualizar",this.productounidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoUnidad,"eliminar_button","Eliminar",this.productounidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoUnidad,"cancelar_button","Cancelar",this.productounidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoUnidad,"guardarcambios_button","Guardar",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoUnidad,"guardarcambiostabla_button","Guardar",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoUnidad,"cerrar_button","Salir",this.productounidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoUnidad.setToolTipText("Nuevo"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoUnidad.setToolTipText("Editar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoUnidad.setToolTipText("Actualizar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoUnidad.setToolTipText("Eliminar)"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoUnidad.setToolTipText("Cancelar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoUnidad.setToolTipText("Guardar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoUnidad.setToolTipText("Guardar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoUnidad.setToolTipText("Salir"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoUnidad";
		inputMap = this.jButtonNuevoProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoUnidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoUnidad";
		inputMap = this.jButtonActualizarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoUnidad"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoUnidad";
		inputMap = this.jButtonEliminarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoUnidad"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoUnidad";
		inputMap = this.jButtonCancelarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoUnidad"));
		
		//CERRAR		
		sMapKey = "CerrarProductoUnidad";
		inputMap = this.jButtonCerrarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoUnidad";
		inputMap = this.jButtonGuardarCambiosTablaProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoUnidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoUnidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoUnidad.setToolTipText("Nuevo ProductoUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoUnidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoUnidad.setToolTipText("Sin Cerrar Ventana ProductoUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoUnidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoUnidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoUnidad.setText("Accion");
		this.jComboBoxTiposAccionesProductoUnidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoUnidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoUnidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoUnidad = new JLabelMe();
		
		this.jLabelAccionesProductoUnidad.setText("Acciones");		
		this.jLabelAccionesProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoUnidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoUnidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoUnidad=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoUnidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoUnidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoUnidad = new GridBagLayout();
		
		this.jPanelCamposProductoUnidad.setLayout(gridaBagLayoutCamposProductoUnidad);
		this.jPanelCamposOcultosProductoUnidad.setLayout(gridaBagLayoutCamposOcultosProductoUnidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoUnidad.add(jLabelIdProductoUnidad, this.gridBagConstraintsProductoUnidad);



	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoUnidad.add(jLabelidProductoUnidad, this.gridBagConstraintsProductoUnidad);


	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoUnidad.add(jLabelid_empresaProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 2;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoUnidad.add(jButtonid_empresaProductoUnidadBusqueda, this.gridBagConstraintsProductoUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 3;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoUnidad.add(jButtonid_empresaProductoUnidadUpdate, this.gridBagConstraintsProductoUnidad);
	}

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoUnidad.add(jComboBoxid_empresaProductoUnidad, this.gridBagConstraintsProductoUnidad);


	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoUnidad.add(jLabelid_sucursalProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 2;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoUnidad.add(jButtonid_sucursalProductoUnidadBusqueda, this.gridBagConstraintsProductoUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 3;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoUnidad.add(jButtonid_sucursalProductoUnidadUpdate, this.gridBagConstraintsProductoUnidad);
	}

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoUnidad.add(jComboBoxid_sucursalProductoUnidad, this.gridBagConstraintsProductoUnidad);


	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoUnidad.add(jLabelid_bodegaProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 2;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoUnidad.add(jButtonid_bodegaProductoUnidadBusqueda, this.gridBagConstraintsProductoUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 3;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoUnidad.add(jButtonid_bodegaProductoUnidadUpdate, this.gridBagConstraintsProductoUnidad);
	}

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoUnidad.add(jComboBoxid_bodegaProductoUnidad, this.gridBagConstraintsProductoUnidad);


	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoUnidad.add(jLabelid_productoProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 2;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoUnidad.add(jButtonid_productoProductoUnidad, this.gridBagConstraintsProductoUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 3;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoUnidad.add(jButtonid_productoProductoUnidadBusqueda, this.gridBagConstraintsProductoUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 4;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoUnidad.add(jButtonid_productoProductoUnidadUpdate, this.gridBagConstraintsProductoUnidad);
	}

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoUnidad.add(jComboBoxid_productoProductoUnidad, this.gridBagConstraintsProductoUnidad);


	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoUnidad.add(jLabelid_unidadProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 2;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoUnidad.add(jButtonid_unidadProductoUnidadBusqueda, this.gridBagConstraintsProductoUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 3;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoUnidad.add(jButtonid_unidadProductoUnidadUpdate, this.gridBagConstraintsProductoUnidad);
	}

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoUnidad.add(jComboBoxid_unidadProductoUnidad, this.gridBagConstraintsProductoUnidad);


	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 0;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_unidadProductoUnidad.add(jLabelvalor_unidadProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 2;
		this.gridBagConstraintsProductoUnidad.ipadx = 0;
		this.gridBagConstraintsProductoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_unidadProductoUnidad.add(jButtonvalor_unidadProductoUnidadBusqueda, this.gridBagConstraintsProductoUnidad);
	}

	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoUnidad.gridy = 0;
	this.gridBagConstraintsProductoUnidad.gridx = 1;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_unidadProductoUnidad.add(jTextFieldvalor_unidadProductoUnidad, this.gridBagConstraintsProductoUnidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoUnidad.add(this.jPanelidProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposProductoUnidad % 1==0) {
		iXPanelCamposProductoUnidad=0;
		iYPanelCamposProductoUnidad++;
	}
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoUnidad.add(this.jPanelid_bodegaProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposProductoUnidad % 1==0) {
		iXPanelCamposProductoUnidad=0;
		iYPanelCamposProductoUnidad++;
	}
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoUnidad.add(this.jPanelid_productoProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposProductoUnidad % 1==0) {
		iXPanelCamposProductoUnidad=0;
		iYPanelCamposProductoUnidad++;
	}
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoUnidad.add(this.jPanelid_unidadProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposProductoUnidad % 1==0) {
		iXPanelCamposProductoUnidad=0;
		iYPanelCamposProductoUnidad++;
	}
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoUnidad.add(this.jPanelvalor_unidadProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposProductoUnidad % 1==0) {
		iXPanelCamposProductoUnidad=0;
		iYPanelCamposProductoUnidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposOcultosProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposOcultosProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoUnidad.add(this.jPanelid_empresaProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposOcultosProductoUnidad % 1==0) {
		iXPanelCamposOcultosProductoUnidad=0;
		iYPanelCamposOcultosProductoUnidad++;
	}
	this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoUnidad.gridy = iYPanelCamposOcultosProductoUnidad;
	this.gridBagConstraintsProductoUnidad.gridx = iXPanelCamposOcultosProductoUnidad++;
	this.gridBagConstraintsProductoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoUnidad.add(this.jPanelid_sucursalProductoUnidad, this.gridBagConstraintsProductoUnidad);



	if(iXPanelCamposOcultosProductoUnidad % 1==0) {
		iXPanelCamposOcultosProductoUnidad=0;
		iYPanelCamposOcultosProductoUnidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoUnidad= new GridBagLayout();
		this.jPanelAccionesProductoUnidad.setLayout(gridaBagLayoutAccionesProductoUnidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoUnidad= new GridBagLayout();
		this.jPanelAccionesFormularioProductoUnidad.setLayout(gridaBagLayoutAccionesFormularioProductoUnidad);
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoUnidad.add(this.jComboBoxTiposAccionesFormularioProductoUnidad, this.gridBagConstraintsProductoUnidad);

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoUnidad.add(this.jCheckBoxPostAccionNuevoProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoUnidad.add(this.jCheckBoxPostAccionSinCerrarProductoUnidad, this.gridBagConstraintsProductoUnidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoUnidad.add(this.jCheckBoxPostAccionSinMensajeProductoUnidad, this.gridBagConstraintsProductoUnidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoUnidad.add(this.jButtonModificarProductoUnidad, this.gridBagConstraintsProductoUnidad);							

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoUnidad.add(this.jButtonEliminarProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = 0;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoUnidad.add(this.jButtonActualizarProductoUnidad, this.gridBagConstraintsProductoUnidad);


		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = 0;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoUnidad.add(this.jButtonGuardarCambiosProductoUnidad, this.gridBagConstraintsProductoUnidad);	
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = 0;		
		this.gridBagConstraintsProductoUnidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoUnidad.add(this.jButtonCancelarProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoUnidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();						
			this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoUnidad.gridx = 0;		
			//this.gridBagConstraintsProductoUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoUnidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoUnidad.gridx =0;
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoUnidad, this.gridBagConstraintsProductoUnidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoUnidad = new ProductoUnidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Unidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Unidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Unidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoUnidadModel productounidadModel=new ProductoUnidadModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoUnidadModel.ProductoUnidadFocusTraversalPolicy productounidadFocusTraversalPolicy = productounidadModel.new ProductoUnidadFocusTraversalPolicy(this);
			
			//productounidadFocusTraversalPolicy.setproductounidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productounidadModel);
			
			
			this.jContentPaneDetalleProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoUnidad = new GridBagLayout();	
			this.jContentPaneDetalleProductoUnidad.setLayout(gridaBagLayoutDetalleProductoUnidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoUnidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
				this.gridBagConstraintsProductoUnidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoUnidad.gridx = 0;
					
				
				this.jContentPaneDetalleProductoUnidad.add(jTtoolBarDetalleProductoUnidad, gridBagConstraintsProductoUnidad);								
				
}
			
			this.jScrollPanelDatosEdicionProductoUnidad=   new JScrollPane(jContentPaneDetalleProductoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoUnidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoUnidad.gridx = 0;
	        
			this.jContentPaneDetalleProductoUnidad.add(jPanelCamposProductoUnidad, gridBagConstraintsProductoUnidad);
			
			
			
			
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
						&& productounidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productounidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoUnidad= new GridBagConstraints();
						this.gridBagConstraintsProductoUnidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoUnidad.gridx = 0;
						this.jContentPaneDetalleProductoUnidad.add(this.jTabbedPaneRelacionesProductoUnidad, this.gridBagConstraintsProductoUnidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoUnidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoUnidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
					this.gridBagConstraintsProductoUnidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoUnidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoUnidad.gridx = 0;
					
				
					this.jContentPaneDetalleProductoUnidad.add(jPanelCamposOcultosProductoUnidad, gridBagConstraintsProductoUnidad);
				
					this.jPanelCamposOcultosProductoUnidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoUnidad.gridx = 0;
	        this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoUnidad.add(this.jPanelAccionesFormularioProductoUnidad, this.gridBagConstraintsProductoUnidad);							
			
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
	        this.gridBagConstraintsProductoUnidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoUnidad.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoUnidad.add(this.jPanelAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoUnidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoUnidad=   new JScrollPane(this.jPanelCamposProductoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoUnidad.gridx = 0;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoUnidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoUnidad, this.gridBagConstraintsProductoUnidad);			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoUnidad;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoUnidad;
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
