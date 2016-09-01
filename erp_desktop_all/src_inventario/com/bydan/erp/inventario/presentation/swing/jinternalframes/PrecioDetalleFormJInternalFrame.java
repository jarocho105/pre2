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
import com.bydan.erp.inventario.util.PrecioConstantesFunciones;

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
public class PrecioDetalleFormJInternalFrame extends PrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePrecio;
	
	protected JMenuBar jmenuBarDetallePrecio;
	
	protected JMenu jmenuDetallePrecio;
	protected JMenu jmenuDetalleArchivoPrecio;
	protected JMenu jmenuDetalleAccionesPrecio;
	protected JMenu jmenuDetalleDatosPrecio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPrecio;	
	protected GridBagConstraints gridBagConstraintsPrecio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PrecioBeanSwingJInternalFrameAdditional jInternalFrameDetallePrecio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rangounidadventa="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected EstadoPrecioBeanSwingJInternalFrame estadoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoprecio="";
	
	public PrecioSessionBean precioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public RangoUnidadVentaSessionBean rangounidadventaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public EstadoPrecioSessionBean estadoprecioSessionBean;	
	
	public PrecioLogic precioLogic;
	
	public JScrollPane jScrollPanelDatosPrecio;
	public JScrollPane jScrollPanelDatosEdicionPrecio;
	public JScrollPane jScrollPanelDatosGeneralPrecio;
	
	protected JPanel jPanelCamposPrecio;    
	protected JPanel jPanelCamposOcultosPrecio;    	
	protected JPanel jPanelAccionesPrecio;
	protected JPanel jPanelAccionesFormularioPrecio;
    
	
	
	protected Integer iXPanelCamposPrecio=0;
	protected Integer iYPanelCamposPrecio=0;
	
	protected Integer iXPanelCamposOcultosPrecio=0;
	protected Integer iYPanelCamposOcultosPrecio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPrecio;
	public JButton jButtonModificarPrecio;
	public JButton jButtonActualizarPrecio;
    public JButton jButtonEliminarPrecio;
	public JButton jButtonCancelarPrecio;
    public JButton jButtonGuardarCambiosPrecio;
	public JButton jButtonGuardarCambiosTablaPrecio;
	protected JButton jButtonCerrarPrecio;
	
	
	protected JButton jButtonProcesarInformacionPrecio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPrecio;
	protected JCheckBox jCheckBoxPostAccionSinMensajePrecio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPrecio;
	protected JButton jButtonModificarToolBarPrecio;
	protected JButton jButtonActualizarToolBarPrecio;
    protected JButton jButtonEliminarToolBarPrecio;
	protected JButton jButtonCancelarToolBarPrecio;
    protected JButton jButtonGuardarCambiosToolBarPrecio;
	protected JButton jButtonGuardarCambiosTablaToolBarPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarPrecio;
	protected JButton jButtonCerrarToolBarPrecio;
	
	protected JButton jButtonProcesarInformacionToolBarPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPrecio;
	protected JMenuItem jMenuItemModificarPrecio;
	protected JMenuItem jMenuItemActualizarPrecio;
    protected JMenuItem jMenuItemEliminarPrecio;
	protected JMenuItem jMenuItemCancelarPrecio;
    protected JMenuItem jMenuItemGuardarCambiosPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaPrecio;
	protected JMenuItem jMenuItemCerrarPrecio;
	protected JMenuItem jMenuItemDetalleCerrarPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarPrecio;
	
	protected JMenuItem jMenuItemProcesarInformacionPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPrecio;
	protected JMenuItem jMenuItemMostrarOcultarPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPrecio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPrecio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPrecio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPrecio;
	public JLabel jLabelIdPrecio;
	public JLabel jLabelidPrecio;
	public JButton jButtonidPrecioBusqueda= new JButtonMe();

	public JPanel jPanelprecioPrecio;
	public JLabel jLabelprecioPrecio;
	public JTextField jTextFieldprecioPrecio;
	public JButton jButtonprecioPrecioBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoPrecio;
	public JLabel jLabeldescuentoPrecio;
	public JTextField jTextFielddescuentoPrecio;
	public JButton jButtondescuentoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelprecio_minimoPrecio;
	public JLabel jLabelprecio_minimoPrecio;
	public JTextField jTextFieldprecio_minimoPrecio;
	public JButton jButtonprecio_minimoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelcon_impuestoPrecio;
	public JLabel jLabelcon_impuestoPrecio;
	public JCheckBox jCheckBoxcon_impuestoPrecio;
	public JButton jButtoncon_impuestoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPrecio;
	public JLabel jLabelid_empresaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPrecio;
	public JButton jButtonid_empresaPrecio= new JButtonMe();
	public JButton jButtonid_empresaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_empresaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPrecio;
	public JLabel jLabelid_sucursalPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPrecio;
	public JButton jButtonid_sucursalPrecio= new JButtonMe();
	public JButton jButtonid_sucursalPrecioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaPrecio;
	public JLabel jLabelid_bodegaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaPrecio;
	public JButton jButtonid_bodegaPrecio= new JButtonMe();
	public JButton jButtonid_bodegaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPrecio;
	public JLabel jLabelid_productoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPrecio;
	public JButton jButtonid_productoPrecio= new JButtonMe();
	public JButton jButtonid_productoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_productoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaPrecio;
	public JLabel jLabelid_lineaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaPrecio;
	public JButton jButtonid_lineaPrecio= new JButtonMe();
	public JButton jButtonid_lineaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_lineaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_lineaPrecioArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoPrecio;
	public JLabel jLabelid_linea_grupoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoPrecio;
	public JButton jButtonid_linea_grupoPrecio= new JButtonMe();
	public JButton jButtonid_linea_grupoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoPrecioArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaPrecio;
	public JLabel jLabelid_linea_categoriaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaPrecio;
	public JButton jButtonid_linea_categoriaPrecio= new JButtonMe();
	public JButton jButtonid_linea_categoriaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaPrecioArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaPrecio;
	public JLabel jLabelid_linea_marcaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaPrecio;
	public JButton jButtonid_linea_marcaPrecio= new JButtonMe();
	public JButton jButtonid_linea_marcaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaPrecioArbol= new JButtonMe();

	public JPanel jPanelid_rango_unidad_ventaPrecio;
	public JLabel jLabelid_rango_unidad_ventaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rango_unidad_ventaPrecio;
	public JButton jButtonid_rango_unidad_ventaPrecio= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioPrecio;
	public JLabel jLabelid_tipo_precioPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioPrecio;
	public JButton jButtonid_tipo_precioPrecio= new JButtonMe();
	public JButton jButtonid_tipo_precioPrecioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_precioPrecio;
	public JLabel jLabelid_estado_precioPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_precioPrecio;
	public JButton jButtonid_estado_precioPrecio= new JButtonMe();
	public JButton jButtonid_estado_precioPrecioUpdate= new JButtonMe();
	public JButton jButtonid_estado_precioPrecioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPrecio;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PrecioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPrecio=new JPanel();
				this.jPanelAccionesFormularioPrecio=new JPanel();
				this.jmenuBarDetallePrecio=new JMenuBar();
				this.jTtoolBarDetallePrecio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PrecioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPrecio() {
		return this.jButtonActualizarToolBarPrecio;
	}
	
	public JButton getjButtonEliminarToolBarPrecio() {
		return this.jButtonEliminarToolBarPrecio;
	}
	
	public JButton getjButtonCancelarToolBarPrecio() {
		return this.jButtonCancelarToolBarPrecio;
	}		
	
	public JButton getjButtonProcesarInformacionPrecio() {
		return this.jButtonProcesarInformacionPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPrecio)	{
		this.jButtonProcesarInformacionPrecio = jButtonProcesarInformacionPrecio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPrecio() {
		return this.jComboBoxTiposAccionesPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPrecio(
			JComboBox jComboBoxTiposRelacionesPrecio) {
		this.jComboBoxTiposRelacionesPrecio = jComboBoxTiposRelacionesPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPrecio(
			JComboBox jComboBoxTiposAccionesPrecio) {
		this.jComboBoxTiposAccionesPrecio = jComboBoxTiposAccionesPrecio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPrecio() {
		return this.jComboBoxTiposAccionesFormularioPrecio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPrecio(
			JComboBox jComboBoxTiposAccionesFormularioPrecio) {
		this.jComboBoxTiposAccionesFormularioPrecio = jComboBoxTiposAccionesFormularioPrecio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.precioSessionBean=new PrecioSessionBean();
		
		this.precioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.precioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.precioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Precio MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
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
	
		PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePrecio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPrecio=new JButtonMe();
				this.jButtonModificarToolBarPrecio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPrecio,this.jTtoolBarDetallePrecio,
							"actualizar","actualizar","Actualizar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPrecio,this.jTtoolBarDetallePrecio,
							"eliminar","eliminar","Eliminar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPrecio,this.jTtoolBarDetallePrecio,
							"cancelar","cancelar","Cancelar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPrecio,this.jTtoolBarDetallePrecio,
							"guardarcambios","guardarcambios","Guardar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePrecio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePrecio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPrecio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPrecio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPrecio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPrecio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPrecio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPrecio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPrecio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPrecio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPrecio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPrecio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPrecio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPrecio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPrecio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPrecio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPrecio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPrecio.add(this.jMenuItemDetalleCerrarPrecio);
		
		this.jmenuDetalleAccionesPrecio.add(this.jMenuItemActualizarPrecio);
		this.jmenuDetalleAccionesPrecio.add(this.jMenuItemEliminarPrecio);
		this.jmenuDetalleAccionesPrecio.add(this.jMenuItemCancelarPrecio);		
		
		//this.jmenuDetalleDatosPrecio.add(this.jMenuItemDetalleAbrirOrderByPrecio);				
		this.jmenuDetalleDatosPrecio.add(this.jMenuItemDetalleMostarOcultarPrecio);				
				
		//this.jmenuDetalleAccionesPrecio.add(this.jMenuItemGuardarCambiosPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePrecio.add(this.jmenuDetalleArchivoPrecio);		
		this.jmenuBarDetallePrecio.add(this.jmenuDetalleAccionesPrecio);		
		this.jmenuBarDetallePrecio.add(this.jmenuDetalleDatosPrecio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePrecio);				
	}
	
	
	public void inicializarElementosCamposPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPrecio = new JLabelMe();
		jLabelIdPrecio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPrecio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPrecio= new GridBagLayout();

		this.jPanelidPrecio.setLayout(this.gridaBagLayoutPrecio);

		jLabelidPrecio = new JLabel();
		jLabelidPrecio.setText("Id");

		jLabelidPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecioPrecio = new JLabelMe();
		this.jLabelprecioPrecio.setText(""+PrecioConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioPrecio.setToolTipText("Precio");
		this.jLabelprecioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelprecioPrecio.setLayout(this.gridaBagLayoutPrecio);


		jTextFieldprecioPrecio= new JTextFieldMe();
		jTextFieldprecioPrecio.setEnabled(false);
		jTextFieldprecioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioPrecio.setText("0.0");

		this.jButtonprecioPrecioBusqueda= new JButtonMe();
		this.jButtonprecioPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioPrecioBusqueda.setText("U");
		this.jButtonprecioPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioPrecioBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoPrecio = new JLabelMe();
		this.jLabeldescuentoPrecio.setText(""+PrecioConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoPrecio.setToolTipText("Descuento");
		this.jLabeldescuentoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPaneldescuentoPrecio.setLayout(this.gridaBagLayoutPrecio);


		jTextFielddescuentoPrecio= new JTextFieldMe();
		jTextFielddescuentoPrecio.setEnabled(false);
		jTextFielddescuentoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoPrecio.setText("0.0");

		this.jButtondescuentoPrecioBusqueda= new JButtonMe();
		this.jButtondescuentoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoPrecioBusqueda.setText("U");
		this.jButtondescuentoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelprecio_minimoPrecio = new JLabelMe();
		this.jLabelprecio_minimoPrecio.setText(""+PrecioConstantesFunciones.LABEL_PRECIOMINIMO+" : *");
		this.jLabelprecio_minimoPrecio.setToolTipText("Precio Minimo");
		this.jLabelprecio_minimoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_minimoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_minimoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_minimoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_minimoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_minimoPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_PRECIOMINIMO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelprecio_minimoPrecio.setLayout(this.gridaBagLayoutPrecio);


		jTextFieldprecio_minimoPrecio= new JTextFieldMe();
		jTextFieldprecio_minimoPrecio.setEnabled(false);
		jTextFieldprecio_minimoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_minimoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_minimoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_minimoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_minimoPrecio.setText("0.0");

		this.jButtonprecio_minimoPrecioBusqueda= new JButtonMe();
		this.jButtonprecio_minimoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_minimoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_minimoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_minimoPrecioBusqueda.setText("U");
		this.jButtonprecio_minimoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_minimoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_minimoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_minimoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_minimoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_minimoPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_minimoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelcon_impuestoPrecio = new JLabelMe();
		this.jLabelcon_impuestoPrecio.setText(""+PrecioConstantesFunciones.LABEL_CONIMPUESTO+" : *");
		this.jLabelcon_impuestoPrecio.setToolTipText("Con Impuesto");
		this.jLabelcon_impuestoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impuestoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impuestoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_impuestoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_impuestoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_impuestoPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_CONIMPUESTO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelcon_impuestoPrecio.setLayout(this.gridaBagLayoutPrecio);


		jCheckBoxcon_impuestoPrecio= new JCheckBoxMe();
		jCheckBoxcon_impuestoPrecio.setEnabled(false);

		jCheckBoxcon_impuestoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impuestoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impuestoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_impuestoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_impuestoPrecioBusqueda= new JButtonMe();
		this.jButtoncon_impuestoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impuestoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impuestoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_impuestoPrecioBusqueda.setText("U");
		this.jButtoncon_impuestoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_impuestoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_impuestoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_impuestoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_impuestoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_impuestoPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_impuestoPrecioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPrecio = new JLabelMe();
		this.jLabelid_empresaPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPrecio.setToolTipText("Empresa");
		this.jLabelid_empresaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_empresaPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_empresaPrecio= new JComboBoxMe();
		jComboBoxid_empresaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPrecio.setEnabled(false);

		this.jButtonid_empresaPrecio= new JButtonMe();
		this.jButtonid_empresaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrecio.setText("Buscar");
		this.jButtonid_empresaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrecio"));

		this.jButtonid_empresaPrecioBusqueda= new JButtonMe();
		this.jButtonid_empresaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPrecioBusqueda.setText("U");
		this.jButtonid_empresaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_empresaPrecioUpdate= new JButtonMe();
		this.jButtonid_empresaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPrecioUpdate.setText("U");
		this.jButtonid_empresaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrecioUpdate"));



					
		this.jLabelid_sucursalPrecio = new JLabelMe();
		this.jLabelid_sucursalPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPrecio.setToolTipText("Sucursal");
		this.jLabelid_sucursalPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_sucursalPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_sucursalPrecio= new JComboBoxMe();
		jComboBoxid_sucursalPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPrecio.setEnabled(false);

		this.jButtonid_sucursalPrecio= new JButtonMe();
		this.jButtonid_sucursalPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPrecio.setText("Buscar");
		this.jButtonid_sucursalPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPrecio"));

		this.jButtonid_sucursalPrecioBusqueda= new JButtonMe();
		this.jButtonid_sucursalPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPrecioBusqueda.setText("U");
		this.jButtonid_sucursalPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPrecioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPrecioUpdate= new JButtonMe();
		this.jButtonid_sucursalPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPrecioUpdate.setText("U");
		this.jButtonid_sucursalPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPrecioUpdate"));



					
		this.jLabelid_bodegaPrecio = new JLabelMe();
		this.jLabelid_bodegaPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaPrecio.setToolTipText("Bodega");
		this.jLabelid_bodegaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_bodegaPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_bodegaPrecio= new JComboBoxMe();
		jComboBoxid_bodegaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaPrecio= new JButtonMe();
		this.jButtonid_bodegaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPrecio.setText("Buscar");
		this.jButtonid_bodegaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPrecio"));

		this.jButtonid_bodegaPrecioBusqueda= new JButtonMe();
		this.jButtonid_bodegaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPrecioBusqueda.setText("U");
		this.jButtonid_bodegaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_bodegaPrecioUpdate= new JButtonMe();
		this.jButtonid_bodegaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPrecioUpdate.setText("U");
		this.jButtonid_bodegaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPrecioUpdate"));



					
		this.jLabelid_productoPrecio = new JLabelMe();
		this.jLabelid_productoPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPrecio.setToolTipText("Producto");
		this.jLabelid_productoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_productoPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_productoPrecio= new JComboBoxMe();
		jComboBoxid_productoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPrecio= new JButtonMe();
		this.jButtonid_productoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPrecio.setText("Buscar");
		this.jButtonid_productoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPrecio"));

		this.jButtonid_productoPrecioBusqueda= new JButtonMe();
		this.jButtonid_productoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPrecioBusqueda.setText("U");
		this.jButtonid_productoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_productoPrecioUpdate= new JButtonMe();
		this.jButtonid_productoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPrecioUpdate.setText("U");
		this.jButtonid_productoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPrecioUpdate"));



					
		this.jLabelid_lineaPrecio = new JLabelMe();
		this.jLabelid_lineaPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaPrecio.setToolTipText("Linea");
		this.jLabelid_lineaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_lineaPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_lineaPrecio= new JComboBoxMe();
		jComboBoxid_lineaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_lineaPrecio.setEnabled(false);

		this.jButtonid_lineaPrecio= new JButtonMe();
		this.jButtonid_lineaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPrecio.setText("Buscar");
		this.jButtonid_lineaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPrecio"));

		this.jButtonid_lineaPrecioBusqueda= new JButtonMe();
		this.jButtonid_lineaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPrecioBusqueda.setText("U");
		this.jButtonid_lineaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_lineaPrecioUpdate= new JButtonMe();
		this.jButtonid_lineaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPrecioUpdate.setText("U");
		this.jButtonid_lineaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPrecioUpdate"));


		jButtonid_lineaPrecioArbol= new JButtonMe();
		jButtonid_lineaPrecioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPrecioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPrecioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPrecioArbol.setText("Arbol");
		jButtonid_lineaPrecioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaPrecioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPrecioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPrecioArbol"));



					
		this.jLabelid_linea_grupoPrecio = new JLabelMe();
		this.jLabelid_linea_grupoPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoPrecio.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_linea_grupoPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_linea_grupoPrecio= new JComboBoxMe();
		jComboBoxid_linea_grupoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_linea_grupoPrecio.setEnabled(false);

		this.jButtonid_linea_grupoPrecio= new JButtonMe();
		this.jButtonid_linea_grupoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPrecio.setText("Buscar");
		this.jButtonid_linea_grupoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPrecio"));

		this.jButtonid_linea_grupoPrecioBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPrecioBusqueda.setText("U");
		this.jButtonid_linea_grupoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoPrecioUpdate= new JButtonMe();
		this.jButtonid_linea_grupoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPrecioUpdate.setText("U");
		this.jButtonid_linea_grupoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPrecioUpdate"));


		jButtonid_linea_grupoPrecioArbol= new JButtonMe();
		jButtonid_linea_grupoPrecioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoPrecioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoPrecioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoPrecioArbol.setText("Arbol");
		jButtonid_linea_grupoPrecioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoPrecioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPrecioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPrecioArbol"));



					
		this.jLabelid_linea_categoriaPrecio = new JLabelMe();
		this.jLabelid_linea_categoriaPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaPrecio.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_linea_categoriaPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_linea_categoriaPrecio= new JComboBoxMe();
		jComboBoxid_linea_categoriaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_linea_categoriaPrecio.setEnabled(false);

		this.jButtonid_linea_categoriaPrecio= new JButtonMe();
		this.jButtonid_linea_categoriaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPrecio.setText("Buscar");
		this.jButtonid_linea_categoriaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPrecio"));

		this.jButtonid_linea_categoriaPrecioBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPrecioBusqueda.setText("U");
		this.jButtonid_linea_categoriaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaPrecioUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPrecioUpdate.setText("U");
		this.jButtonid_linea_categoriaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPrecioUpdate"));


		jButtonid_linea_categoriaPrecioArbol= new JButtonMe();
		jButtonid_linea_categoriaPrecioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaPrecioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaPrecioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaPrecioArbol.setText("Arbol");
		jButtonid_linea_categoriaPrecioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaPrecioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPrecioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPrecioArbol"));



					
		this.jLabelid_linea_marcaPrecio = new JLabelMe();
		this.jLabelid_linea_marcaPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaPrecio.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_linea_marcaPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_linea_marcaPrecio= new JComboBoxMe();
		jComboBoxid_linea_marcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_linea_marcaPrecio.setEnabled(false);

		this.jButtonid_linea_marcaPrecio= new JButtonMe();
		this.jButtonid_linea_marcaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPrecio.setText("Buscar");
		this.jButtonid_linea_marcaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPrecio"));

		this.jButtonid_linea_marcaPrecioBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPrecioBusqueda.setText("U");
		this.jButtonid_linea_marcaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaPrecioUpdate= new JButtonMe();
		this.jButtonid_linea_marcaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPrecioUpdate.setText("U");
		this.jButtonid_linea_marcaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPrecioUpdate"));


		jButtonid_linea_marcaPrecioArbol= new JButtonMe();
		jButtonid_linea_marcaPrecioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaPrecioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaPrecioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaPrecioArbol.setText("Arbol");
		jButtonid_linea_marcaPrecioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaPrecioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPrecioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPrecioArbol"));



					
		this.jLabelid_rango_unidad_ventaPrecio = new JLabelMe();
		this.jLabelid_rango_unidad_ventaPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA+" : *");
		this.jLabelid_rango_unidad_ventaPrecio.setToolTipText("Rango Unidad Venta");
		this.jLabelid_rango_unidad_ventaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_rango_unidad_ventaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_rango_unidad_ventaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rango_unidad_ventaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rango_unidad_ventaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rango_unidad_ventaPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_rango_unidad_ventaPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_rango_unidad_ventaPrecio= new JComboBoxMe();
		jComboBoxid_rango_unidad_ventaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rango_unidad_ventaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rango_unidad_ventaPrecio= new JButtonMe();
		this.jButtonid_rango_unidad_ventaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rango_unidad_ventaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rango_unidad_ventaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rango_unidad_ventaPrecio.setText("Buscar");
		this.jButtonid_rango_unidad_ventaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rango_unidad_ventaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rango_unidad_ventaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rango_unidad_ventaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rango_unidad_ventaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rango_unidad_ventaPrecio"));

		this.jButtonid_rango_unidad_ventaPrecioBusqueda= new JButtonMe();
		this.jButtonid_rango_unidad_ventaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rango_unidad_ventaPrecioBusqueda.setText("U");
		this.jButtonid_rango_unidad_ventaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rango_unidad_ventaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rango_unidad_ventaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rango_unidad_ventaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rango_unidad_ventaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rango_unidad_ventaPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rango_unidad_ventaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_rango_unidad_ventaPrecioUpdate= new JButtonMe();
		this.jButtonid_rango_unidad_ventaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rango_unidad_ventaPrecioUpdate.setText("U");
		this.jButtonid_rango_unidad_ventaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rango_unidad_ventaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rango_unidad_ventaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rango_unidad_ventaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rango_unidad_ventaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rango_unidad_ventaPrecioUpdate"));



					
		this.jLabelid_tipo_precioPrecio = new JLabelMe();
		this.jLabelid_tipo_precioPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioPrecio.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_tipo_precioPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_tipo_precioPrecio= new JComboBoxMe();
		jComboBoxid_tipo_precioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioPrecio= new JButtonMe();
		this.jButtonid_tipo_precioPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPrecio.setText("Buscar");
		this.jButtonid_tipo_precioPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPrecio"));

		this.jButtonid_tipo_precioPrecioBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPrecioBusqueda.setText("U");
		this.jButtonid_tipo_precioPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioPrecioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioPrecioUpdate= new JButtonMe();
		this.jButtonid_tipo_precioPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPrecioUpdate.setText("U");
		this.jButtonid_tipo_precioPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPrecioUpdate"));



					
		this.jLabelid_estado_precioPrecio = new JLabelMe();
		this.jLabelid_estado_precioPrecio.setText(""+PrecioConstantesFunciones.LABEL_IDESTADOPRECIO+" : *");
		this.jLabelid_estado_precioPrecio.setToolTipText("Estado");
		this.jLabelid_estado_precioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_precioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_precioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_precioPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_precioPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_precioPrecio.setToolTipText(PrecioConstantesFunciones.LABEL_IDESTADOPRECIO);
		this.gridaBagLayoutPrecio = new GridBagLayout();
		this.jPanelid_estado_precioPrecio.setLayout(this.gridaBagLayoutPrecio);


		jComboBoxid_estado_precioPrecio= new JComboBoxMe();
		jComboBoxid_estado_precioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_precioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_precioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_precioPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_precioPrecio= new JButtonMe();
		this.jButtonid_estado_precioPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_precioPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_precioPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_precioPrecio.setText("Buscar");
		this.jButtonid_estado_precioPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_precioPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_precioPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_precioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_precioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_precioPrecio"));

		this.jButtonid_estado_precioPrecioBusqueda= new JButtonMe();
		this.jButtonid_estado_precioPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_precioPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_precioPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_precioPrecioBusqueda.setText("U");
		this.jButtonid_estado_precioPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_precioPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_precioPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_precioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_precioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_precioPrecioBusqueda"));

		if(this.precioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_precioPrecioBusqueda.setVisible(false);		}

		this.jButtonid_estado_precioPrecioUpdate= new JButtonMe();
		this.jButtonid_estado_precioPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_precioPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_precioPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_precioPrecioUpdate.setText("U");
		this.jButtonid_estado_precioPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_precioPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_precioPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_precioPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_precioPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_precioPrecioUpdate"));



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
		//this.jInternalFrameDetallePrecio = new PrecioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Precio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPrecio= new GridBagLayout();
		

		
		String sToolTipPrecio="";
		sToolTipPrecio=PrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPrecio+="(Inventario.Precio)";
		}
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			sToolTipPrecio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPrecio = new JButtonMe();
		this.jButtonModificarPrecio = new JButtonMe();
        this.jButtonActualizarPrecio = new JButtonMe();
        this.jButtonEliminarPrecio = new JButtonMe();
        this.jButtonCancelarPrecio = new JButtonMe();
        this.jButtonGuardarCambiosPrecio = new JButtonMe();
		this.jButtonGuardarCambiosTablaPrecio = new JButtonMe();
		this.jButtonCerrarPrecio = new JButtonMe();
		
		this.jScrollPanelDatosPrecio = new JScrollPane();   
        this.jScrollPanelDatosEdicionPrecio = new JScrollPane();
		this.jScrollPanelDatosGeneralPrecio = new JScrollPane();
				
		
		
		this.jPanelCamposPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Precio";
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios" + this.sPath));
		} else {
			this.jScrollPanelDatosPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPrecio.setName("jPanelCamposPrecio"); 

		this.jPanelCamposOcultosPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPrecio.setName("jPanelCamposOcultosPrecio"); 

        this.jPanelAccionesPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPrecio.setToolTipText("Acciones");
        this.jPanelAccionesPrecio.setName("Acciones"); 

		this.jPanelAccionesFormularioPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPrecio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPrecio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPrecio.setText("Nuevo");
		this.jButtonModificarPrecio.setText("Editar");
        this.jButtonActualizarPrecio.setText("Actualizar");
        this.jButtonEliminarPrecio.setText("Eliminar");
        this.jButtonCancelarPrecio.setText("Cancelar");
        this.jButtonGuardarCambiosPrecio.setText("Guardar");
		this.jButtonGuardarCambiosTablaPrecio.setText("Guardar");
		this.jButtonCerrarPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPrecio,"nuevo_button","Nuevo",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPrecio,"modificar_button","Editar",this.precioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPrecio,"actualizar_button","Actualizar",this.precioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPrecio,"eliminar_button","Eliminar",this.precioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPrecio,"cancelar_button","Cancelar",this.precioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPrecio,"guardarcambios_button","Guardar",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPrecio,"guardarcambiostabla_button","Guardar",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPrecio,"cerrar_button","Salir",this.precioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPrecio.setToolTipText("Nuevo"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPrecio.setToolTipText("Editar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPrecio.setToolTipText("Actualizar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPrecio.setToolTipText("Eliminar)"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPrecio.setToolTipText("Cancelar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPrecio.setToolTipText("Guardar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPrecio.setToolTipText("Guardar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPrecio.setToolTipText("Salir"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPrecio";
		inputMap = this.jButtonNuevoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPrecio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPrecio";
		inputMap = this.jButtonActualizarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPrecio"));
		
		//ELIMINAR
		sMapKey = "EliminarPrecio";
		inputMap = this.jButtonEliminarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPrecio"));
		
		//CANCELAR	
		sMapKey = "CancelarPrecio";
		inputMap = this.jButtonCancelarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPrecio"));
		
		//CERRAR		
		sMapKey = "CerrarPrecio";
		inputMap = this.jButtonCerrarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPrecio";
		inputMap = this.jButtonGuardarCambiosTablaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPrecio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPrecio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPrecio.setToolTipText("Nuevo Precio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPrecio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPrecio.setToolTipText("Sin Cerrar Ventana Precio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePrecio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePrecio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePrecio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPrecio.setText("Accion");
		this.jComboBoxTiposAccionesPrecio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPrecio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPrecio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPrecio = new JLabelMe();
		
		this.jLabelAccionesPrecio.setText("Acciones");		
		this.jLabelAccionesPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPrecio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPrecio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPrecio=new JTabbedPane();
		this.jTabbedPaneRelacionesPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPrecio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPrecio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPrecio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPrecio = new GridBagLayout();
		
		this.jPanelCamposPrecio.setLayout(gridaBagLayoutCamposPrecio);
		this.jPanelCamposOcultosPrecio.setLayout(gridaBagLayoutCamposOcultosPrecio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPrecio.add(jLabelIdPrecio, this.gridBagConstraintsPrecio);



	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPrecio.add(jLabelidPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPrecio.add(jLabelid_empresaPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPrecio.add(jButtonid_empresaPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPrecio.add(jButtonid_empresaPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPrecio.add(jComboBoxid_empresaPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPrecio.add(jLabelid_sucursalPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPrecio.add(jButtonid_sucursalPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPrecio.add(jButtonid_sucursalPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPrecio.add(jComboBoxid_sucursalPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaPrecio.add(jLabelid_bodegaPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPrecio.add(jButtonid_bodegaPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPrecio.add(jButtonid_bodegaPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaPrecio.add(jComboBoxid_bodegaPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPrecio.add(jLabelid_productoPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 2;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoPrecio.add(jButtonid_productoPrecio, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPrecio.add(jButtonid_productoPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 4;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPrecio.add(jButtonid_productoPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPrecio.add(jComboBoxid_productoPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaPrecio.add(jLabelid_lineaPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPrecio.add(jButtonid_lineaPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPrecio.add(jButtonid_lineaPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaPrecio.add(jComboBoxid_lineaPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoPrecio.add(jLabelid_linea_grupoPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPrecio.add(jButtonid_linea_grupoPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPrecio.add(jButtonid_linea_grupoPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoPrecio.add(jComboBoxid_linea_grupoPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaPrecio.add(jLabelid_linea_categoriaPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPrecio.add(jButtonid_linea_categoriaPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPrecio.add(jButtonid_linea_categoriaPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaPrecio.add(jComboBoxid_linea_categoriaPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaPrecio.add(jLabelid_linea_marcaPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPrecio.add(jButtonid_linea_marcaPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPrecio.add(jButtonid_linea_marcaPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaPrecio.add(jComboBoxid_linea_marcaPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rango_unidad_ventaPrecio.add(jLabelid_rango_unidad_ventaPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rango_unidad_ventaPrecio.add(jButtonid_rango_unidad_ventaPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rango_unidad_ventaPrecio.add(jButtonid_rango_unidad_ventaPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rango_unidad_ventaPrecio.add(jComboBoxid_rango_unidad_ventaPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioPrecio.add(jLabelid_tipo_precioPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPrecio.add(jButtonid_tipo_precioPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPrecio.add(jButtonid_tipo_precioPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioPrecio.add(jComboBoxid_tipo_precioPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioPrecio.add(jLabelprecioPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioPrecio.add(jButtonprecioPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioPrecio.add(jTextFieldprecioPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoPrecio.add(jLabeldescuentoPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoPrecio.add(jButtondescuentoPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoPrecio.add(jTextFielddescuentoPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_minimoPrecio.add(jLabelprecio_minimoPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_minimoPrecio.add(jButtonprecio_minimoPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_minimoPrecio.add(jTextFieldprecio_minimoPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_impuestoPrecio.add(jLabelcon_impuestoPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_impuestoPrecio.add(jButtoncon_impuestoPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_impuestoPrecio.add(jCheckBoxcon_impuestoPrecio, this.gridBagConstraintsPrecio);


	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 0;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_precioPrecio.add(jLabelid_estado_precioPrecio, this.gridBagConstraintsPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 2;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_precioPrecio.add(jButtonid_estado_precioPrecioBusqueda, this.gridBagConstraintsPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 3;
		this.gridBagConstraintsPrecio.ipadx = 0;
		this.gridBagConstraintsPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_precioPrecio.add(jButtonid_estado_precioPrecioUpdate, this.gridBagConstraintsPrecio);
	}

	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrecio.gridy = 0;
	this.gridBagConstraintsPrecio.gridx = 1;
	this.gridBagConstraintsPrecio.ipadx = 0;
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_precioPrecio.add(jComboBoxid_estado_precioPrecio, this.gridBagConstraintsPrecio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelidPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_bodegaPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_productoPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_lineaPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_linea_grupoPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_linea_categoriaPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_linea_marcaPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_rango_unidad_ventaPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_tipo_precioPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelprecioPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPaneldescuentoPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelprecio_minimoPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelcon_impuestoPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrecio.add(this.jPanelid_estado_precioPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposPrecio % 1==0) {
		iXPanelCamposPrecio=0;
		iYPanelCamposPrecio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposOcultosPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposOcultosPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPrecio.add(this.jPanelid_empresaPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposOcultosPrecio % 1==0) {
		iXPanelCamposOcultosPrecio=0;
		iYPanelCamposOcultosPrecio++;
	}
	this.gridBagConstraintsPrecio = new GridBagConstraints();
	this.gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrecio.gridy = iYPanelCamposOcultosPrecio;
	this.gridBagConstraintsPrecio.gridx = iXPanelCamposOcultosPrecio++;
	this.gridBagConstraintsPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPrecio.add(this.jPanelid_sucursalPrecio, this.gridBagConstraintsPrecio);



	if(iXPanelCamposOcultosPrecio % 1==0) {
		iXPanelCamposOcultosPrecio=0;
		iYPanelCamposOcultosPrecio++;
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
			
		GridBagLayout gridaBagLayoutAccionesPrecio= new GridBagLayout();
		this.jPanelAccionesPrecio.setLayout(gridaBagLayoutAccionesPrecio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPrecio= new GridBagLayout();
		this.jPanelAccionesFormularioPrecio.setLayout(gridaBagLayoutAccionesFormularioPrecio);
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPrecio.add(this.jComboBoxTiposAccionesFormularioPrecio, this.gridBagConstraintsPrecio);

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPrecio.add(this.jCheckBoxPostAccionNuevoPrecio, this.gridBagConstraintsPrecio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.precioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPrecio.add(this.jCheckBoxPostAccionSinCerrarPrecio, this.gridBagConstraintsPrecio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.precioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.precioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPrecio.add(this.jCheckBoxPostAccionSinMensajePrecio, this.gridBagConstraintsPrecio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = iPosXAccion++;
			
		this.jPanelAccionesPrecio.add(this.jButtonModificarPrecio, this.gridBagConstraintsPrecio);							

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx =iPosXAccion++;
			
		this.jPanelAccionesPrecio.add(this.jButtonEliminarPrecio, this.gridBagConstraintsPrecio);
		
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = 0;		
		this.gridBagConstraintsPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesPrecio.add(this.jButtonActualizarPrecio, this.gridBagConstraintsPrecio);


		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = 0;		
		this.gridBagConstraintsPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesPrecio.add(this.jButtonGuardarCambiosPrecio, this.gridBagConstraintsPrecio);	
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = 0;		
		this.gridBagConstraintsPrecio.gridx =iPosXAccion++;
		
		this.jPanelAccionesPrecio.add(this.jButtonCancelarPrecio, this.gridBagConstraintsPrecio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPrecio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.precioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPrecio = new GridBagConstraints();						
			this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrecio.gridx = 0;		
			//this.gridBagConstraintsPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPrecio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPrecio.gridx =0;
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPrecio, this.gridBagConstraintsPrecio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PrecioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePrecio = new PrecioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Precio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Precio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Precio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PrecioModel precioModel=new PrecioModel(this);
			
			//SI USARA CLASE INTERNA
			//PrecioModel.PrecioFocusTraversalPolicy precioFocusTraversalPolicy = precioModel.new PrecioFocusTraversalPolicy(this);
			
			//precioFocusTraversalPolicy.setprecioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(precioModel);
			
			
			this.jContentPaneDetallePrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePrecio = new GridBagLayout();	
			this.jContentPaneDetallePrecio.setLayout(gridaBagLayoutDetallePrecio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPrecio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPrecio = new GridBagConstraints();
				this.gridBagConstraintsPrecio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPrecio.gridx = 0;
					
				
				this.jContentPaneDetallePrecio.add(jTtoolBarDetallePrecio, gridBagConstraintsPrecio);								
				
}
			
			this.jScrollPanelDatosEdicionPrecio=   new JScrollPane(jContentPaneDetallePrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPrecio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPrecio.gridx = 0;
	        
			this.jContentPaneDetallePrecio.add(jPanelCamposPrecio, gridBagConstraintsPrecio);
			
			
			
			
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
						&& precioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.precioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPrecio= new GridBagConstraints();
						this.gridBagConstraintsPrecio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPrecio.gridx = 0;
						this.jContentPaneDetallePrecio.add(this.jTabbedPaneRelacionesPrecio, this.gridBagConstraintsPrecio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPrecio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPrecio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPrecio = new GridBagConstraints();
					this.gridBagConstraintsPrecio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPrecio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPrecio.gridx = 0;
					
				
					this.jContentPaneDetallePrecio.add(jPanelCamposOcultosPrecio, gridBagConstraintsPrecio);
				
					this.jPanelCamposOcultosPrecio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPrecio.gridx = 0;
	        this.gridBagConstraintsPrecio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePrecio.add(this.jPanelAccionesFormularioPrecio, this.gridBagConstraintsPrecio);							
			
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
	        this.gridBagConstraintsPrecio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPrecio.gridx = 0;
	        
			
			this.jContentPaneDetallePrecio.add(this.jPanelAccionesPrecio, this.gridBagConstraintsPrecio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPrecio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPrecio=   new JScrollPane(this.jPanelCamposPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPrecio.gridx = 0;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPrecio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPrecio, this.gridBagConstraintsPrecio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPrecio, this.gridBagConstraintsPrecio);			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPrecio, this.gridBagConstraintsPrecio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPrecio, this.gridBagConstraintsPrecio);
			
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPrecio, this.gridBagConstraintsPrecio);
		
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPrecio, this.gridBagConstraintsPrecio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPrecio;//jContentPane;
		
		return jScrollPanelDatosEdicionPrecio;
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
