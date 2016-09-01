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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProductosBodegasConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProductosBodegasDetalleFormJInternalFrame extends ProductosBodegasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductosBodegas;
	
	protected JMenuBar jmenuBarDetalleProductosBodegas;
	
	protected JMenu jmenuDetalleProductosBodegas;
	protected JMenu jmenuDetalleArchivoProductosBodegas;
	protected JMenu jmenuDetalleAccionesProductosBodegas;
	protected JMenu jmenuDetalleDatosProductosBodegas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosBodegas;	
	protected GridBagConstraints gridBagConstraintsProductosBodegas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductosBodegasBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductosBodegas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProductosBodegasSessionBean productosbodegasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProductosBodegasLogic productosbodegasLogic;
	
	public JScrollPane jScrollPanelDatosProductosBodegas;
	public JScrollPane jScrollPanelDatosEdicionProductosBodegas;
	public JScrollPane jScrollPanelDatosGeneralProductosBodegas;
	
	protected JPanel jPanelCamposProductosBodegas;    
	protected JPanel jPanelCamposOcultosProductosBodegas;    	
	protected JPanel jPanelAccionesProductosBodegas;
	protected JPanel jPanelAccionesFormularioProductosBodegas;
    
	
	
	protected Integer iXPanelCamposProductosBodegas=0;
	protected Integer iYPanelCamposProductosBodegas=0;
	
	protected Integer iXPanelCamposOcultosProductosBodegas=0;
	protected Integer iYPanelCamposOcultosProductosBodegas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductosBodegas;
	public JButton jButtonModificarProductosBodegas;
	public JButton jButtonActualizarProductosBodegas;
    public JButton jButtonEliminarProductosBodegas;
	public JButton jButtonCancelarProductosBodegas;
    public JButton jButtonGuardarCambiosProductosBodegas;
	public JButton jButtonGuardarCambiosTablaProductosBodegas;
	protected JButton jButtonCerrarProductosBodegas;
	
	
	protected JButton jButtonProcesarInformacionProductosBodegas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductosBodegas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductosBodegas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductosBodegas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosBodegas;
	protected JButton jButtonModificarToolBarProductosBodegas;
	protected JButton jButtonActualizarToolBarProductosBodegas;
    protected JButton jButtonEliminarToolBarProductosBodegas;
	protected JButton jButtonCancelarToolBarProductosBodegas;
    protected JButton jButtonGuardarCambiosToolBarProductosBodegas;
	protected JButton jButtonGuardarCambiosTablaToolBarProductosBodegas;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosBodegas;
	protected JButton jButtonCerrarToolBarProductosBodegas;
	
	protected JButton jButtonProcesarInformacionToolBarProductosBodegas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosBodegas;
	protected JMenuItem jMenuItemModificarProductosBodegas;
	protected JMenuItem jMenuItemActualizarProductosBodegas;
    protected JMenuItem jMenuItemEliminarProductosBodegas;
	protected JMenuItem jMenuItemCancelarProductosBodegas;
    protected JMenuItem jMenuItemGuardarCambiosProductosBodegas;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosBodegas;
	protected JMenuItem jMenuItemCerrarProductosBodegas;
	protected JMenuItem jMenuItemDetalleCerrarProductosBodegas;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosBodegas;
	
	protected JMenuItem jMenuItemProcesarInformacionProductosBodegas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosBodegas;
	protected JMenuItem jMenuItemMostrarOcultarProductosBodegas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosBodegas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosBodegas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductosBodegas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductosBodegas;
	public JLabel jLabelIdProductosBodegas;
	public JLabel jLabelidProductosBodegas;
	public JButton jButtonidProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalProductosBodegas;
	public JLabel jLabelnombre_sucursalProductosBodegas;
	public JTextArea jTextAreanombre_sucursalProductosBodegas;
	public JScrollPane jscrollPanenombre_sucursalProductosBodegas;
	public JButton jButtonnombre_sucursalProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaProductosBodegas;
	public JLabel jLabelnombre_lineaProductosBodegas;
	public JTextArea jTextAreanombre_lineaProductosBodegas;
	public JScrollPane jscrollPanenombre_lineaProductosBodegas;
	public JButton jButtonnombre_lineaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoProductosBodegas;
	public JLabel jLabelnombre_linea_grupoProductosBodegas;
	public JTextArea jTextAreanombre_linea_grupoProductosBodegas;
	public JScrollPane jscrollPanenombre_linea_grupoProductosBodegas;
	public JButton jButtonnombre_linea_grupoProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaProductosBodegas;
	public JLabel jLabelnombre_linea_categoriaProductosBodegas;
	public JTextArea jTextAreanombre_linea_categoriaProductosBodegas;
	public JScrollPane jscrollPanenombre_linea_categoriaProductosBodegas;
	public JButton jButtonnombre_linea_categoriaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaProductosBodegas;
	public JLabel jLabelnombre_linea_marcaProductosBodegas;
	public JTextArea jTextAreanombre_linea_marcaProductosBodegas;
	public JScrollPane jscrollPanenombre_linea_marcaProductosBodegas;
	public JButton jButtonnombre_linea_marcaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProductosBodegas;
	public JLabel jLabelcodigoProductosBodegas;
	public JTextField jTextFieldcodigoProductosBodegas;
	public JButton jButtoncodigoProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombreProductosBodegas;
	public JLabel jLabelnombreProductosBodegas;
	public JTextArea jTextAreanombreProductosBodegas;
	public JScrollPane jscrollPanenombreProductosBodegas;
	public JButton jButtonnombreProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaProductosBodegas;
	public JLabel jLabelnombre_bodegaProductosBodegas;
	public JTextArea jTextAreanombre_bodegaProductosBodegas;
	public JScrollPane jscrollPanenombre_bodegaProductosBodegas;
	public JButton jButtonnombre_bodegaProductosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductosBodegas;
	public JLabel jLabelid_empresaProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductosBodegas;
	public JButton jButtonid_empresaProductosBodegas= new JButtonMe();
	public JButton jButtonid_empresaProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductosBodegas;
	public JLabel jLabelid_sucursalProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductosBodegas;
	public JButton jButtonid_sucursalProductosBodegas= new JButtonMe();
	public JButton jButtonid_sucursalProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductosBodegas;
	public JLabel jLabelid_bodegaProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductosBodegas;
	public JButton jButtonid_bodegaProductosBodegas= new JButtonMe();
	public JButton jButtonid_bodegaProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProductosBodegas;
	public JLabel jLabelid_lineaProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProductosBodegas;
	public JButton jButtonid_lineaProductosBodegas= new JButtonMe();
	public JButton jButtonid_lineaProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProductosBodegas;
	public JLabel jLabelid_linea_grupoProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProductosBodegas;
	public JButton jButtonid_linea_grupoProductosBodegas= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProductosBodegas;
	public JLabel jLabelid_linea_categoriaProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProductosBodegas;
	public JButton jButtonid_linea_categoriaProductosBodegas= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProductosBodegas;
	public JLabel jLabelid_linea_marcaProductosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProductosBodegas;
	public JButton jButtonid_linea_marcaProductosBodegas= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductosBodegasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductosBodegas;
	
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
	
	public ProductosBodegasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductosBodegas=new JPanel();
				this.jPanelAccionesFormularioProductosBodegas=new JPanel();
				this.jmenuBarDetalleProductosBodegas=new JMenuBar();
				this.jTtoolBarDetalleProductosBodegas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductosBodegasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosBodegasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductosBodegas() {
		return this.jButtonActualizarToolBarProductosBodegas;
	}
	
	public JButton getjButtonEliminarToolBarProductosBodegas() {
		return this.jButtonEliminarToolBarProductosBodegas;
	}
	
	public JButton getjButtonCancelarToolBarProductosBodegas() {
		return this.jButtonCancelarToolBarProductosBodegas;
	}		
	
	public JButton getjButtonProcesarInformacionProductosBodegas() {
		return this.jButtonProcesarInformacionProductosBodegas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosBodegas)	{
		this.jButtonProcesarInformacionProductosBodegas = jButtonProcesarInformacionProductosBodegas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosBodegas() {
		return this.jComboBoxTiposAccionesProductosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosBodegas(
			JComboBox jComboBoxTiposRelacionesProductosBodegas) {
		this.jComboBoxTiposRelacionesProductosBodegas = jComboBoxTiposRelacionesProductosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosBodegas(
			JComboBox jComboBoxTiposAccionesProductosBodegas) {
		this.jComboBoxTiposAccionesProductosBodegas = jComboBoxTiposAccionesProductosBodegas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductosBodegas() {
		return this.jComboBoxTiposAccionesFormularioProductosBodegas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductosBodegas(
			JComboBox jComboBoxTiposAccionesFormularioProductosBodegas) {
		this.jComboBoxTiposAccionesFormularioProductosBodegas = jComboBoxTiposAccionesFormularioProductosBodegas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
		
		this.productosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosbodegasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosBodegasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Bodegas MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductosBodegasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductosBodegas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductosBodegas=new JButtonMe();
				this.jButtonModificarToolBarProductosBodegas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductosBodegas,this.jTtoolBarDetalleProductosBodegas,
							"actualizar","actualizar","Actualizar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductosBodegas,this.jTtoolBarDetalleProductosBodegas,
							"eliminar","eliminar","Eliminar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductosBodegas,this.jTtoolBarDetalleProductosBodegas,
							"cancelar","cancelar","Cancelar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductosBodegas,this.jTtoolBarDetalleProductosBodegas,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductosBodegas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductosBodegas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductosBodegas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductosBodegas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductosBodegas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosBodegas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosBodegas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosBodegas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductosBodegas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductosBodegas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductosBodegas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductosBodegas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductosBodegas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductosBodegas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductosBodegas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductosBodegas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductosBodegas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductosBodegas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductosBodegas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductosBodegas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductosBodegas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosBodegas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosBodegas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosBodegas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosBodegas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosBodegas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductosBodegas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductosBodegas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductosBodegas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductosBodegas.add(this.jMenuItemDetalleCerrarProductosBodegas);
		
		this.jmenuDetalleAccionesProductosBodegas.add(this.jMenuItemActualizarProductosBodegas);
		this.jmenuDetalleAccionesProductosBodegas.add(this.jMenuItemEliminarProductosBodegas);
		this.jmenuDetalleAccionesProductosBodegas.add(this.jMenuItemCancelarProductosBodegas);		
		
		//this.jmenuDetalleDatosProductosBodegas.add(this.jMenuItemDetalleAbrirOrderByProductosBodegas);				
		this.jmenuDetalleDatosProductosBodegas.add(this.jMenuItemDetalleMostarOcultarProductosBodegas);				
				
		//this.jmenuDetalleAccionesProductosBodegas.add(this.jMenuItemGuardarCambiosProductosBodegas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductosBodegas.add(this.jmenuDetalleArchivoProductosBodegas);		
		this.jmenuBarDetalleProductosBodegas.add(this.jmenuDetalleAccionesProductosBodegas);		
		this.jmenuBarDetalleProductosBodegas.add(this.jmenuDetalleDatosProductosBodegas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductosBodegas);				
	}
	
	
	public void inicializarElementosCamposProductosBodegas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductosBodegas = new JLabelMe();
		jLabelIdProductosBodegas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductosBodegas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductosBodegas= new GridBagLayout();

		this.jPanelidProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);

		jLabelidProductosBodegas = new JLabel();
		jLabelidProductosBodegas.setText("Id");

		jLabelidProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sucursalProductosBodegas = new JLabelMe();
		this.jLabelnombre_sucursalProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalProductosBodegas.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombre_sucursalProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombre_sucursalProductosBodegas= new JTextAreaMe();
		jTextAreanombre_sucursalProductosBodegas.setEnabled(false);
		jTextAreanombre_sucursalProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProductosBodegas.setLineWrap(true);
		jTextAreanombre_sucursalProductosBodegas.setWrapStyleWord(true);
		jTextAreanombre_sucursalProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalProductosBodegas = new JScrollPane(jTextAreanombre_sucursalProductosBodegas);
		jscrollPanenombre_sucursalProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalProductosBodegasBusqueda.setText("U");
		this.jButtonnombre_sucursalProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaProductosBodegas = new JLabelMe();
		this.jLabelnombre_lineaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaProductosBodegas.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombre_lineaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombre_lineaProductosBodegas= new JTextAreaMe();
		jTextAreanombre_lineaProductosBodegas.setEnabled(false);
		jTextAreanombre_lineaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaProductosBodegas.setLineWrap(true);
		jTextAreanombre_lineaProductosBodegas.setWrapStyleWord(true);
		jTextAreanombre_lineaProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaProductosBodegas = new JScrollPane(jTextAreanombre_lineaProductosBodegas);
		jscrollPanenombre_lineaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_lineaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaProductosBodegasBusqueda.setText("U");
		this.jButtonnombre_lineaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoProductosBodegas = new JLabelMe();
		this.jLabelnombre_linea_grupoProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoProductosBodegas.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombre_linea_grupoProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombre_linea_grupoProductosBodegas= new JTextAreaMe();
		jTextAreanombre_linea_grupoProductosBodegas.setEnabled(false);
		jTextAreanombre_linea_grupoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoProductosBodegas.setLineWrap(true);
		jTextAreanombre_linea_grupoProductosBodegas.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoProductosBodegas = new JScrollPane(jTextAreanombre_linea_grupoProductosBodegas);
		jscrollPanenombre_linea_grupoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_grupoProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setText("U");
		this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaProductosBodegas = new JLabelMe();
		this.jLabelnombre_linea_categoriaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaProductosBodegas.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombre_linea_categoriaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombre_linea_categoriaProductosBodegas= new JTextAreaMe();
		jTextAreanombre_linea_categoriaProductosBodegas.setEnabled(false);
		jTextAreanombre_linea_categoriaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaProductosBodegas.setLineWrap(true);
		jTextAreanombre_linea_categoriaProductosBodegas.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaProductosBodegas = new JScrollPane(jTextAreanombre_linea_categoriaProductosBodegas);
		jscrollPanenombre_linea_categoriaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaProductosBodegas = new JLabelMe();
		this.jLabelnombre_linea_marcaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaProductosBodegas.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombre_linea_marcaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombre_linea_marcaProductosBodegas= new JTextAreaMe();
		jTextAreanombre_linea_marcaProductosBodegas.setEnabled(false);
		jTextAreanombre_linea_marcaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaProductosBodegas.setLineWrap(true);
		jTextAreanombre_linea_marcaProductosBodegas.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaProductosBodegas = new JScrollPane(jTextAreanombre_linea_marcaProductosBodegas);
		jscrollPanenombre_linea_marcaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_marcaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setText("U");
		this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProductosBodegas = new JLabelMe();
		this.jLabelcodigoProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProductosBodegas.setToolTipText("Codigo");
		this.jLabelcodigoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelcodigoProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextFieldcodigoProductosBodegas= new JTextFieldMe();

		jTextFieldcodigoProductosBodegas.setEnabled(false);
		jTextFieldcodigoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProductosBodegasBusqueda= new JButtonMe();
		this.jButtoncodigoProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProductosBodegasBusqueda.setText("U");
		this.jButtoncodigoProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombreProductosBodegas = new JLabelMe();
		this.jLabelnombreProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProductosBodegas.setToolTipText("Nombre");
		this.jLabelnombreProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombreProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombreProductosBodegas= new JTextAreaMe();
		jTextAreanombreProductosBodegas.setEnabled(false);
		jTextAreanombreProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProductosBodegas.setLineWrap(true);
		jTextAreanombreProductosBodegas.setWrapStyleWord(true);
		jTextAreanombreProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProductosBodegas = new JScrollPane(jTextAreanombreProductosBodegas);
		jscrollPanenombreProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombreProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProductosBodegasBusqueda.setText("U");
		this.jButtonnombreProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProductosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaProductosBodegas = new JLabelMe();
		this.jLabelnombre_bodegaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaProductosBodegas.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelnombre_bodegaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jTextAreanombre_bodegaProductosBodegas= new JTextAreaMe();
		jTextAreanombre_bodegaProductosBodegas.setEnabled(false);
		jTextAreanombre_bodegaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProductosBodegas.setLineWrap(true);
		jTextAreanombre_bodegaProductosBodegas.setWrapStyleWord(true);
		jTextAreanombre_bodegaProductosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaProductosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaProductosBodegas = new JScrollPane(jTextAreanombre_bodegaProductosBodegas);
		jscrollPanenombre_bodegaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaProductosBodegasBusqueda.setText("U");
		this.jButtonnombre_bodegaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaProductosBodegasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductosBodegas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductosBodegas = new JLabelMe();
		this.jLabelid_empresaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductosBodegas.setToolTipText("Empresa");
		this.jLabelid_empresaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_empresaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_empresaProductosBodegas= new JComboBoxMe();
		jComboBoxid_empresaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductosBodegas.setEnabled(false);

		this.jButtonid_empresaProductosBodegas= new JButtonMe();
		this.jButtonid_empresaProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductosBodegas.setText("Buscar");
		this.jButtonid_empresaProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosBodegas"));

		this.jButtonid_empresaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_empresaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosBodegasBusqueda.setText("U");
		this.jButtonid_empresaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_empresaProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductosBodegasUpdate.setText("U");
		this.jButtonid_empresaProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductosBodegasUpdate"));



					
		this.jLabelid_sucursalProductosBodegas = new JLabelMe();
		this.jLabelid_sucursalProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductosBodegas.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_sucursalProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_sucursalProductosBodegas= new JComboBoxMe();
		jComboBoxid_sucursalProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductosBodegas.setEnabled(false);

		this.jButtonid_sucursalProductosBodegas= new JButtonMe();
		this.jButtonid_sucursalProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductosBodegas.setText("Buscar");
		this.jButtonid_sucursalProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosBodegas"));

		this.jButtonid_sucursalProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosBodegasBusqueda.setText("U");
		this.jButtonid_sucursalProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_sucursalProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductosBodegasUpdate.setText("U");
		this.jButtonid_sucursalProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductosBodegasUpdate"));



					
		this.jLabelid_bodegaProductosBodegas = new JLabelMe();
		this.jLabelid_bodegaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductosBodegas.setToolTipText("Bodega");
		this.jLabelid_bodegaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_bodegaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_bodegaProductosBodegas= new JComboBoxMe();
		jComboBoxid_bodegaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductosBodegas= new JButtonMe();
		this.jButtonid_bodegaProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductosBodegas.setText("Buscar");
		this.jButtonid_bodegaProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosBodegas"));

		this.jButtonid_bodegaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosBodegasBusqueda.setText("U");
		this.jButtonid_bodegaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_bodegaProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductosBodegasUpdate.setText("U");
		this.jButtonid_bodegaProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductosBodegasUpdate"));



					
		this.jLabelid_lineaProductosBodegas = new JLabelMe();
		this.jLabelid_lineaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProductosBodegas.setToolTipText("Linea");
		this.jLabelid_lineaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_lineaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_lineaProductosBodegas= new JComboBoxMe();
		jComboBoxid_lineaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProductosBodegas= new JButtonMe();
		this.jButtonid_lineaProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProductosBodegas.setText("Buscar");
		this.jButtonid_lineaProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosBodegas"));

		this.jButtonid_lineaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_lineaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosBodegasBusqueda.setText("U");
		this.jButtonid_lineaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_lineaProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductosBodegasUpdate.setText("U");
		this.jButtonid_lineaProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductosBodegasUpdate"));



					
		this.jLabelid_linea_grupoProductosBodegas = new JLabelMe();
		this.jLabelid_linea_grupoProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProductosBodegas.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_linea_grupoProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_linea_grupoProductosBodegas= new JComboBoxMe();
		jComboBoxid_linea_grupoProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProductosBodegas= new JButtonMe();
		this.jButtonid_linea_grupoProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProductosBodegas.setText("Buscar");
		this.jButtonid_linea_grupoProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosBodegas"));

		this.jButtonid_linea_grupoProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosBodegasBusqueda.setText("U");
		this.jButtonid_linea_grupoProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductosBodegasUpdate.setText("U");
		this.jButtonid_linea_grupoProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductosBodegasUpdate"));



					
		this.jLabelid_linea_categoriaProductosBodegas = new JLabelMe();
		this.jLabelid_linea_categoriaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProductosBodegas.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_linea_categoriaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_linea_categoriaProductosBodegas= new JComboBoxMe();
		jComboBoxid_linea_categoriaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProductosBodegas= new JButtonMe();
		this.jButtonid_linea_categoriaProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProductosBodegas.setText("Buscar");
		this.jButtonid_linea_categoriaProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosBodegas"));

		this.jButtonid_linea_categoriaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosBodegasBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductosBodegasUpdate.setText("U");
		this.jButtonid_linea_categoriaProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductosBodegasUpdate"));



					
		this.jLabelid_linea_marcaProductosBodegas = new JLabelMe();
		this.jLabelid_linea_marcaProductosBodegas.setText(""+ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProductosBodegas.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProductosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProductosBodegas.setToolTipText(ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProductosBodegas = new GridBagLayout();
		this.jPanelid_linea_marcaProductosBodegas.setLayout(this.gridaBagLayoutProductosBodegas);


		jComboBoxid_linea_marcaProductosBodegas= new JComboBoxMe();
		jComboBoxid_linea_marcaProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProductosBodegas= new JButtonMe();
		this.jButtonid_linea_marcaProductosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProductosBodegas.setText("Buscar");
		this.jButtonid_linea_marcaProductosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProductosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosBodegas"));

		this.jButtonid_linea_marcaProductosBodegasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosBodegasBusqueda.setText("U");
		this.jButtonid_linea_marcaProductosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosBodegasBusqueda"));

		if(this.productosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductosBodegasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductosBodegasUpdate.setText("U");
		this.jButtonid_linea_marcaProductosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductosBodegasUpdate"));



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
		//this.jInternalFrameDetalleProductosBodegas = new ProductosBodegasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Productos Bodegas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosBodegas= new GridBagLayout();
		

		
		String sToolTipProductosBodegas="";
		sToolTipProductosBodegas=ProductosBodegasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosBodegas+="(Inventario.ProductosBodegas)";
		}
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosBodegas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductosBodegas = new JButtonMe();
		this.jButtonModificarProductosBodegas = new JButtonMe();
        this.jButtonActualizarProductosBodegas = new JButtonMe();
        this.jButtonEliminarProductosBodegas = new JButtonMe();
        this.jButtonCancelarProductosBodegas = new JButtonMe();
        this.jButtonGuardarCambiosProductosBodegas = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductosBodegas = new JButtonMe();
		this.jButtonCerrarProductosBodegas = new JButtonMe();
		
		this.jScrollPanelDatosProductosBodegas = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductosBodegas = new JScrollPane();
		this.jScrollPanelDatosGeneralProductosBodegas = new JScrollPane();
				
		
		
		this.jPanelCamposProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Bodegas";
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Bodegases" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosBodegas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductosBodegas.setName("jPanelCamposProductosBodegas"); 

		this.jPanelCamposOcultosProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductosBodegas.setName("jPanelCamposOcultosProductosBodegas"); 

        this.jPanelAccionesProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosBodegas.setToolTipText("Acciones");
        this.jPanelAccionesProductosBodegas.setName("Acciones"); 

		this.jPanelAccionesFormularioProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductosBodegas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductosBodegas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductosBodegas.setText("Nuevo");
		this.jButtonModificarProductosBodegas.setText("Editar");
        this.jButtonActualizarProductosBodegas.setText("Actualizar");
        this.jButtonEliminarProductosBodegas.setText("Eliminar");
        this.jButtonCancelarProductosBodegas.setText("Cancelar");
        this.jButtonGuardarCambiosProductosBodegas.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductosBodegas.setText("Guardar");
		this.jButtonCerrarProductosBodegas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosBodegas,"nuevo_button","Nuevo",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductosBodegas,"modificar_button","Editar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductosBodegas,"actualizar_button","Actualizar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductosBodegas,"eliminar_button","Eliminar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductosBodegas,"cancelar_button","Cancelar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductosBodegas,"guardarcambios_button","Guardar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosBodegas,"guardarcambiostabla_button","Guardar",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosBodegas,"cerrar_button","Salir",this.productosbodegasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductosBodegas.setToolTipText("Nuevo"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductosBodegas.setToolTipText("Editar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductosBodegas.setToolTipText("Actualizar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductosBodegas.setToolTipText("Eliminar)"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductosBodegas.setToolTipText("Cancelar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductosBodegas.setToolTipText("Guardar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductosBodegas.setToolTipText("Guardar"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosBodegas.setToolTipText("Salir"+" "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosBodegas";
		inputMap = this.jButtonNuevoProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosBodegas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductosBodegas";
		inputMap = this.jButtonActualizarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductosBodegas"));
		
		//ELIMINAR
		sMapKey = "EliminarProductosBodegas";
		inputMap = this.jButtonEliminarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductosBodegas"));
		
		//CANCELAR	
		sMapKey = "CancelarProductosBodegas";
		inputMap = this.jButtonCancelarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductosBodegas"));
		
		//CERRAR		
		sMapKey = "CerrarProductosBodegas";
		inputMap = this.jButtonCerrarProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosBodegas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosBodegas";
		inputMap = this.jButtonGuardarCambiosTablaProductosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosBodegas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductosBodegas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductosBodegas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductosBodegas.setToolTipText("Nuevo ProductosBodegas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductosBodegas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductosBodegas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductosBodegas.setToolTipText("Sin Cerrar Ventana ProductosBodegas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductosBodegas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductosBodegas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductosBodegas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosBodegas.setText("Accion");
		this.jComboBoxTiposAccionesProductosBodegas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductosBodegas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductosBodegas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductosBodegas = new JLabelMe();
		
		this.jLabelAccionesProductosBodegas.setText("Acciones");		
		this.jLabelAccionesProductosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductosBodegas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductosBodegas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductosBodegas=new JTabbedPane();
		this.jTabbedPaneRelacionesProductosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductosBodegas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosBodegas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductosBodegas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductosBodegas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductosBodegas = new GridBagLayout();
		
		this.jPanelCamposProductosBodegas.setLayout(gridaBagLayoutCamposProductosBodegas);
		this.jPanelCamposOcultosProductosBodegas.setLayout(gridaBagLayoutCamposOcultosProductosBodegas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductosBodegas.add(jLabelIdProductosBodegas, this.gridBagConstraintsProductosBodegas);



	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductosBodegas.add(jLabelidProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductosBodegas.add(jLabelid_empresaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosBodegas.add(jButtonid_empresaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductosBodegas.add(jButtonid_empresaProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductosBodegas.add(jComboBoxid_empresaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductosBodegas.add(jLabelid_sucursalProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosBodegas.add(jButtonid_sucursalProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductosBodegas.add(jButtonid_sucursalProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductosBodegas.add(jComboBoxid_sucursalProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductosBodegas.add(jLabelid_bodegaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosBodegas.add(jButtonid_bodegaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductosBodegas.add(jButtonid_bodegaProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductosBodegas.add(jComboBoxid_bodegaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProductosBodegas.add(jLabelid_lineaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosBodegas.add(jButtonid_lineaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProductosBodegas.add(jButtonid_lineaProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProductosBodegas.add(jComboBoxid_lineaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProductosBodegas.add(jLabelid_linea_grupoProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosBodegas.add(jButtonid_linea_grupoProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProductosBodegas.add(jButtonid_linea_grupoProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProductosBodegas.add(jComboBoxid_linea_grupoProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProductosBodegas.add(jLabelid_linea_categoriaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosBodegas.add(jButtonid_linea_categoriaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProductosBodegas.add(jButtonid_linea_categoriaProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProductosBodegas.add(jComboBoxid_linea_categoriaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProductosBodegas.add(jLabelid_linea_marcaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosBodegas.add(jButtonid_linea_marcaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 3;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProductosBodegas.add(jButtonid_linea_marcaProductosBodegasUpdate, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProductosBodegas.add(jComboBoxid_linea_marcaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalProductosBodegas.add(jLabelnombre_sucursalProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalProductosBodegas.add(jButtonnombre_sucursalProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalProductosBodegas.add(jscrollPanenombre_sucursalProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaProductosBodegas.add(jLabelnombre_lineaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaProductosBodegas.add(jButtonnombre_lineaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaProductosBodegas.add(jscrollPanenombre_lineaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoProductosBodegas.add(jLabelnombre_linea_grupoProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoProductosBodegas.add(jButtonnombre_linea_grupoProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoProductosBodegas.add(jscrollPanenombre_linea_grupoProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaProductosBodegas.add(jLabelnombre_linea_categoriaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaProductosBodegas.add(jButtonnombre_linea_categoriaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaProductosBodegas.add(jscrollPanenombre_linea_categoriaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaProductosBodegas.add(jLabelnombre_linea_marcaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaProductosBodegas.add(jButtonnombre_linea_marcaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaProductosBodegas.add(jscrollPanenombre_linea_marcaProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProductosBodegas.add(jLabelcodigoProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProductosBodegas.add(jButtoncodigoProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProductosBodegas.add(jTextFieldcodigoProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProductosBodegas.add(jLabelnombreProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProductosBodegas.add(jButtonnombreProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProductosBodegas.add(jscrollPanenombreProductosBodegas, this.gridBagConstraintsProductosBodegas);


	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 0;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaProductosBodegas.add(jLabelnombre_bodegaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = 2;
		this.gridBagConstraintsProductosBodegas.ipadx = 0;
		this.gridBagConstraintsProductosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaProductosBodegas.add(jButtonnombre_bodegaProductosBodegasBusqueda, this.gridBagConstraintsProductosBodegas);
	}

	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductosBodegas.gridy = 0;
	this.gridBagConstraintsProductosBodegas.gridx = 1;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaProductosBodegas.add(jscrollPanenombre_bodegaProductosBodegas, this.gridBagConstraintsProductosBodegas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelidProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelid_bodegaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelid_lineaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelid_linea_grupoProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelid_linea_categoriaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelid_linea_marcaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombre_sucursalProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombre_lineaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombre_linea_grupoProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombre_linea_categoriaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombre_linea_marcaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelcodigoProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombreProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductosBodegas.add(this.jPanelnombre_bodegaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposProductosBodegas % 2==0) {
		iXPanelCamposProductosBodegas=0;
		iYPanelCamposProductosBodegas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposOcultosProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposOcultosProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosBodegas.add(this.jPanelid_empresaProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposOcultosProductosBodegas % 2==0) {
		iXPanelCamposOcultosProductosBodegas=0;
		iYPanelCamposOcultosProductosBodegas++;
	}
	this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductosBodegas.gridy = iYPanelCamposOcultosProductosBodegas;
	this.gridBagConstraintsProductosBodegas.gridx = iXPanelCamposOcultosProductosBodegas++;
	this.gridBagConstraintsProductosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductosBodegas.add(this.jPanelid_sucursalProductosBodegas, this.gridBagConstraintsProductosBodegas);



	if(iXPanelCamposOcultosProductosBodegas % 2==0) {
		iXPanelCamposOcultosProductosBodegas=0;
		iYPanelCamposOcultosProductosBodegas++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductosBodegas= new GridBagLayout();
		this.jPanelAccionesProductosBodegas.setLayout(gridaBagLayoutAccionesProductosBodegas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductosBodegas= new GridBagLayout();
		this.jPanelAccionesFormularioProductosBodegas.setLayout(gridaBagLayoutAccionesFormularioProductosBodegas);
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductosBodegas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductosBodegas.add(this.jComboBoxTiposAccionesFormularioProductosBodegas, this.gridBagConstraintsProductosBodegas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductosBodegas.add(this.jButtonModificarProductosBodegas, this.gridBagConstraintsProductosBodegas);							

		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosBodegas.gridy = 0;
		this.gridBagConstraintsProductosBodegas.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductosBodegas.add(this.jButtonEliminarProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
			
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = 0;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosBodegas.add(this.jButtonActualizarProductosBodegas, this.gridBagConstraintsProductosBodegas);


		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = 0;		
		this.gridBagConstraintsProductosBodegas.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductosBodegas.add(this.jButtonGuardarCambiosProductosBodegas, this.gridBagConstraintsProductosBodegas);	
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = 0;		
		this.gridBagConstraintsProductosBodegas.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductosBodegas.add(this.jButtonCancelarProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosBodegas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosBodegas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();						
			this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosBodegas.gridx = 0;		
			//this.gridBagConstraintsProductosBodegas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosBodegas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosBodegas.gridx =0;
		this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosBodegas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosBodegas, this.gridBagConstraintsProductosBodegas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductosBodegas = new ProductosBodegasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Productos Bodegas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Productos Bodegas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Bodegas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductosBodegasModel productosbodegasModel=new ProductosBodegasModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductosBodegasModel.ProductosBodegasFocusTraversalPolicy productosbodegasFocusTraversalPolicy = productosbodegasModel.new ProductosBodegasFocusTraversalPolicy(this);
			
			//productosbodegasFocusTraversalPolicy.setproductosbodegasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productosbodegasModel);
			
			
			this.jContentPaneDetalleProductosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductosBodegas = new GridBagLayout();	
			this.jContentPaneDetalleProductosBodegas.setLayout(gridaBagLayoutDetalleProductosBodegas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosBodegas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
				this.gridBagConstraintsProductosBodegas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductosBodegas.gridx = 0;
					
				
				this.jContentPaneDetalleProductosBodegas.add(jTtoolBarDetalleProductosBodegas, gridBagConstraintsProductosBodegas);								
				
}
			
			this.jScrollPanelDatosEdicionProductosBodegas=   new JScrollPane(jContentPaneDetalleProductosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductosBodegas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductosBodegas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductosBodegas.gridx = 0;
	        
			this.jContentPaneDetalleProductosBodegas.add(jPanelCamposProductosBodegas, gridBagConstraintsProductosBodegas);
			
			
			
			
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
						//&& productosbodegasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductosBodegas= new GridBagConstraints();
						this.gridBagConstraintsProductosBodegas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductosBodegas.gridx = 0;
						this.jContentPaneDetalleProductosBodegas.add(this.jTabbedPaneRelacionesProductosBodegas, this.gridBagConstraintsProductosBodegas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductosBodegas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductosBodegas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
					this.gridBagConstraintsProductosBodegas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductosBodegas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductosBodegas.gridx = 0;
					
				
					this.jContentPaneDetalleProductosBodegas.add(jPanelCamposOcultosProductosBodegas, gridBagConstraintsProductosBodegas);
				
					this.jPanelCamposOcultosProductosBodegas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductosBodegas.gridx = 0;
	        this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductosBodegas.add(this.jPanelAccionesFormularioProductosBodegas, this.gridBagConstraintsProductosBodegas);							
			
			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
	        this.gridBagConstraintsProductosBodegas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductosBodegas.gridx = 0;
	        
			
			this.jContentPaneDetalleProductosBodegas.add(this.jPanelAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductosBodegas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductosBodegas=   new JScrollPane(this.jPanelCamposProductosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductosBodegas.gridx = 0;
			this.gridBagConstraintsProductosBodegas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductosBodegas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductosBodegas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductosBodegas, this.gridBagConstraintsProductosBodegas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosBodegas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductosBodegas, this.gridBagConstraintsProductosBodegas);			
			
			this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
			this.gridBagConstraintsProductosBodegas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductosBodegas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosBodegas, this.gridBagConstraintsProductosBodegas);
			
			
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosBodegas, this.gridBagConstraintsProductosBodegas);
		
			
		this.gridBagConstraintsProductosBodegas = new GridBagConstraints();
		this.gridBagConstraintsProductosBodegas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosBodegas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosBodegas, this.gridBagConstraintsProductosBodegas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductosBodegas;//jContentPane;
		
		return jScrollPanelDatosEdicionProductosBodegas;
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
