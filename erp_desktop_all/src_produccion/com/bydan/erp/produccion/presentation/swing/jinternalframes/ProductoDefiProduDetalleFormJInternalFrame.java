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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProductoDefiProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProductoDefiProduDetalleFormJInternalFrame extends ProductoDefiProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoDefiProdu;
	
	protected JMenuBar jmenuBarDetalleProductoDefiProdu;
	
	protected JMenu jmenuDetalleProductoDefiProdu;
	protected JMenu jmenuDetalleArchivoProductoDefiProdu;
	protected JMenu jmenuDetalleAccionesProductoDefiProdu;
	protected JMenu jmenuDetalleDatosProductoDefiProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoDefiProdu;	
	protected GridBagConstraints gridBagConstraintsProductoDefiProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoDefiProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoDefiProdu;		
	
	
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
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	
	

	public ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFrame=null;
	public ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMano=false;
	public ProductoProduManoSessionBean productoprodumanoSessionBean;

	public ProductoProduMermaBeanSwingJInternalFrame productoprodumermaBeanSwingJInternalFrame=null;
	public ProductoProduMermaBeanSwingJInternalFrame productoprodumermaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMerma=false;
	public ProductoProduMermaSessionBean productoprodumermaSessionBean;

	public ProductoProduGastoBeanSwingJInternalFrame productoprodugastoBeanSwingJInternalFrame=null;
	public ProductoProduGastoBeanSwingJInternalFrame productoprodugastoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduGasto=false;
	public ProductoProduGastoSessionBean productoprodugastoSessionBean;

	public ProductoProduBeanSwingJInternalFrame productoproduBeanSwingJInternalFrame=null;
	public ProductoProduBeanSwingJInternalFrame productoproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProdu=false;
	public ProductoProduSessionBean productoproduSessionBean;

	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMaquina=false;
	public ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoDefiProduLogic productodefiproduLogic;
	
	public JScrollPane jScrollPanelDatosProductoDefiProdu;
	public JScrollPane jScrollPanelDatosEdicionProductoDefiProdu;
	public JScrollPane jScrollPanelDatosGeneralProductoDefiProdu;
	
	protected JPanel jPanelCamposProductoDefiProdu;    
	protected JPanel jPanelCamposOcultosProductoDefiProdu;    	
	protected JPanel jPanelAccionesProductoDefiProdu;
	protected JPanel jPanelAccionesFormularioProductoDefiProdu;
    
	
	
	protected Integer iXPanelCamposProductoDefiProdu=0;
	protected Integer iYPanelCamposProductoDefiProdu=0;
	
	protected Integer iXPanelCamposOcultosProductoDefiProdu=0;
	protected Integer iYPanelCamposOcultosProductoDefiProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoDefiProdu;
	public JButton jButtonModificarProductoDefiProdu;
	public JButton jButtonActualizarProductoDefiProdu;
    public JButton jButtonEliminarProductoDefiProdu;
	public JButton jButtonCancelarProductoDefiProdu;
    public JButton jButtonGuardarCambiosProductoDefiProdu;
	public JButton jButtonGuardarCambiosTablaProductoDefiProdu;
	protected JButton jButtonCerrarProductoDefiProdu;
	
	
	protected JButton jButtonProcesarInformacionProductoDefiProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoDefiProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoDefiProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoDefiProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoDefiProdu;
	protected JButton jButtonModificarToolBarProductoDefiProdu;
	protected JButton jButtonActualizarToolBarProductoDefiProdu;
    protected JButton jButtonEliminarToolBarProductoDefiProdu;
	protected JButton jButtonCancelarToolBarProductoDefiProdu;
    protected JButton jButtonGuardarCambiosToolBarProductoDefiProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoDefiProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoDefiProdu;
	protected JButton jButtonCerrarToolBarProductoDefiProdu;
	
	protected JButton jButtonProcesarInformacionToolBarProductoDefiProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoDefiProdu;
	protected JMenuItem jMenuItemModificarProductoDefiProdu;
	protected JMenuItem jMenuItemActualizarProductoDefiProdu;
    protected JMenuItem jMenuItemEliminarProductoDefiProdu;
	protected JMenuItem jMenuItemCancelarProductoDefiProdu;
    protected JMenuItem jMenuItemGuardarCambiosProductoDefiProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoDefiProdu;
	protected JMenuItem jMenuItemCerrarProductoDefiProdu;
	protected JMenuItem jMenuItemDetalleCerrarProductoDefiProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoDefiProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoDefiProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoDefiProdu;
	protected JMenuItem jMenuItemMostrarOcultarProductoDefiProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoDefiProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoDefiProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoDefiProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoDefiProdu;
	public JLabel jLabelIdProductoDefiProdu;
	public JLabel jLabelidProductoDefiProdu;
	public JButton jButtonidProductoDefiProduBusqueda= new JButtonMe();

	public JPanel jPanelcon_genera_sub_productosProductoDefiProdu;
	public JLabel jLabelcon_genera_sub_productosProductoDefiProdu;
	public JCheckBox jCheckBoxcon_genera_sub_productosProductoDefiProdu;
	public JButton jButtoncon_genera_sub_productosProductoDefiProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoDefiProdu;
	public JLabel jLabeldescripcionProductoDefiProdu;
	public JTextArea jTextAreadescripcionProductoDefiProdu;
	public JScrollPane jscrollPanedescripcionProductoDefiProdu;
	public JButton jButtondescripcionProductoDefiProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoDefiProdu;
	public JLabel jLabelid_empresaProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoDefiProdu;
	public JButton jButtonid_empresaProductoDefiProdu= new JButtonMe();
	public JButton jButtonid_empresaProductoDefiProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoDefiProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoDefiProdu;
	public JLabel jLabelid_sucursalProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoDefiProdu;
	public JButton jButtonid_sucursalProductoDefiProdu= new JButtonMe();
	public JButton jButtonid_sucursalProductoDefiProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoDefiProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoDefiProdu;
	public JLabel jLabelid_bodegaProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoDefiProdu;
	public JButton jButtonid_bodegaProductoDefiProdu= new JButtonMe();
	public JButton jButtonid_bodegaProductoDefiProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoDefiProduBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoDefiProdu;
	public JLabel jLabelid_productoProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoDefiProdu;
	public JButton jButtonid_productoProductoDefiProdu= new JButtonMe();
	public JButton jButtonid_productoProductoDefiProduUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoDefiProduBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoDefiProdu;
	public JLabel jLabelid_unidadProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoDefiProdu;
	public JButton jButtonid_unidadProductoDefiProdu= new JButtonMe();
	public JButton jButtonid_unidadProductoDefiProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoDefiProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoDefiProdu;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoDefiProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoDefiProdu=new JPanel();
				this.jPanelAccionesFormularioProductoDefiProdu=new JPanel();
				this.jmenuBarDetalleProductoDefiProdu=new JMenuBar();
				this.jTtoolBarDetalleProductoDefiProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoDefiProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoDefiProdu() {
		return this.jButtonActualizarToolBarProductoDefiProdu;
	}
	
	public JButton getjButtonEliminarToolBarProductoDefiProdu() {
		return this.jButtonEliminarToolBarProductoDefiProdu;
	}
	
	public JButton getjButtonCancelarToolBarProductoDefiProdu() {
		return this.jButtonCancelarToolBarProductoDefiProdu;
	}		
	
	public JButton getjButtonProcesarInformacionProductoDefiProdu() {
		return this.jButtonProcesarInformacionProductoDefiProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoDefiProdu)	{
		this.jButtonProcesarInformacionProductoDefiProdu = jButtonProcesarInformacionProductoDefiProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoDefiProdu() {
		return this.jComboBoxTiposAccionesProductoDefiProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoDefiProdu(
			JComboBox jComboBoxTiposRelacionesProductoDefiProdu) {
		this.jComboBoxTiposRelacionesProductoDefiProdu = jComboBoxTiposRelacionesProductoDefiProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoDefiProdu(
			JComboBox jComboBoxTiposAccionesProductoDefiProdu) {
		this.jComboBoxTiposAccionesProductoDefiProdu = jComboBoxTiposAccionesProductoDefiProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoDefiProdu() {
		return this.jComboBoxTiposAccionesFormularioProductoDefiProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoDefiProdu(
			JComboBox jComboBoxTiposAccionesFormularioProductoDefiProdu) {
		this.jComboBoxTiposAccionesFormularioProductoDefiProdu = jComboBoxTiposAccionesFormularioProductoDefiProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
		
		this.productodefiproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productodefiproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productodefiproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		//this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		//this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		//this.productoproduSessionBean=new ProductoProduSessionBean();
		//this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoDefiProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Definicion Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoDefiProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoDefiProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoDefiProdu=new JButtonMe();
				this.jButtonModificarToolBarProductoDefiProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoDefiProdu,this.jTtoolBarDetalleProductoDefiProdu,
							"actualizar","actualizar","Actualizar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoDefiProdu,this.jTtoolBarDetalleProductoDefiProdu,
							"eliminar","eliminar","Eliminar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoDefiProdu,this.jTtoolBarDetalleProductoDefiProdu,
							"cancelar","cancelar","Cancelar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoDefiProdu,this.jTtoolBarDetalleProductoDefiProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoDefiProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoDefiProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoDefiProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoDefiProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoDefiProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoDefiProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoDefiProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoDefiProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoDefiProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoDefiProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoDefiProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoDefiProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoDefiProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoDefiProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoDefiProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoDefiProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoDefiProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoDefiProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoDefiProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoDefiProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoDefiProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoDefiProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoDefiProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoDefiProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoDefiProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoDefiProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoDefiProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoDefiProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoDefiProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoDefiProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoDefiProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoDefiProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoDefiProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoDefiProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoDefiProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoDefiProdu.add(this.jMenuItemDetalleCerrarProductoDefiProdu);
		
		this.jmenuDetalleAccionesProductoDefiProdu.add(this.jMenuItemActualizarProductoDefiProdu);
		this.jmenuDetalleAccionesProductoDefiProdu.add(this.jMenuItemEliminarProductoDefiProdu);
		this.jmenuDetalleAccionesProductoDefiProdu.add(this.jMenuItemCancelarProductoDefiProdu);		
		
		//this.jmenuDetalleDatosProductoDefiProdu.add(this.jMenuItemDetalleAbrirOrderByProductoDefiProdu);				
		this.jmenuDetalleDatosProductoDefiProdu.add(this.jMenuItemDetalleMostarOcultarProductoDefiProdu);				
				
		//this.jmenuDetalleAccionesProductoDefiProdu.add(this.jMenuItemGuardarCambiosProductoDefiProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoDefiProdu.add(this.jmenuDetalleArchivoProductoDefiProdu);		
		this.jmenuBarDetalleProductoDefiProdu.add(this.jmenuDetalleAccionesProductoDefiProdu);		
		this.jmenuBarDetalleProductoDefiProdu.add(this.jmenuDetalleDatosProductoDefiProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProductoDefiProdu.add(this.jmenuDetalleProductoDefiProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoDefiProdu);				
	}
	
	
	public void inicializarElementosCamposProductoDefiProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoDefiProdu = new JLabelMe();
		jLabelIdProductoDefiProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoDefiProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoDefiProdu= new GridBagLayout();

		this.jPanelidProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);

		jLabelidProductoDefiProdu = new JLabel();
		jLabelidProductoDefiProdu.setText("Id");

		jLabelidProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_genera_sub_productosProductoDefiProdu = new JLabelMe();
		this.jLabelcon_genera_sub_productosProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS+" : *");
		this.jLabelcon_genera_sub_productosProductoDefiProdu.setToolTipText("Con Genera Sub Productos");
		this.jLabelcon_genera_sub_productosProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_genera_sub_productosProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_genera_sub_productosProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_genera_sub_productosProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_genera_sub_productosProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_genera_sub_productosProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPanelcon_genera_sub_productosProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jCheckBoxcon_genera_sub_productosProductoDefiProdu= new JCheckBoxMe();
		jCheckBoxcon_genera_sub_productosProductoDefiProdu.setEnabled(false);

		jCheckBoxcon_genera_sub_productosProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_genera_sub_productosProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_genera_sub_productosProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_genera_sub_productosProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda= new JButtonMe();
		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setText("U");
		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_genera_sub_productosProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_genera_sub_productosProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_genera_sub_productosProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoDefiProdu = new JLabelMe();
		this.jLabeldescripcionProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoDefiProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPaneldescripcionProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jTextAreadescripcionProductoDefiProdu= new JTextAreaMe();
		jTextAreadescripcionProductoDefiProdu.setEnabled(false);
		jTextAreadescripcionProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoDefiProdu.setLineWrap(true);
		jTextAreadescripcionProductoDefiProdu.setWrapStyleWord(true);
		jTextAreadescripcionProductoDefiProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoDefiProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoDefiProdu = new JScrollPane(jTextAreadescripcionProductoDefiProdu);
		jscrollPanedescripcionProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionProductoDefiProduBusqueda= new JButtonMe();
		this.jButtondescripcionProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoDefiProduBusqueda.setText("U");
		this.jButtondescripcionProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoDefiProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoDefiProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoDefiProdu = new JLabelMe();
		this.jLabelid_empresaProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoDefiProdu.setToolTipText("Empresa");
		this.jLabelid_empresaProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPanelid_empresaProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jComboBoxid_empresaProductoDefiProdu= new JComboBoxMe();
		jComboBoxid_empresaProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoDefiProdu.setEnabled(false);

		this.jButtonid_empresaProductoDefiProdu= new JButtonMe();
		this.jButtonid_empresaProductoDefiProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoDefiProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoDefiProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoDefiProdu.setText("Buscar");
		this.jButtonid_empresaProductoDefiProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoDefiProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoDefiProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoDefiProdu"));

		this.jButtonid_empresaProductoDefiProduBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoDefiProduBusqueda.setText("U");
		this.jButtonid_empresaProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoDefiProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoDefiProduUpdate= new JButtonMe();
		this.jButtonid_empresaProductoDefiProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoDefiProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoDefiProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoDefiProduUpdate.setText("U");
		this.jButtonid_empresaProductoDefiProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoDefiProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoDefiProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoDefiProduUpdate"));



					
		this.jLabelid_sucursalProductoDefiProdu = new JLabelMe();
		this.jLabelid_sucursalProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoDefiProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPanelid_sucursalProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jComboBoxid_sucursalProductoDefiProdu= new JComboBoxMe();
		jComboBoxid_sucursalProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoDefiProdu.setEnabled(false);

		this.jButtonid_sucursalProductoDefiProdu= new JButtonMe();
		this.jButtonid_sucursalProductoDefiProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoDefiProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoDefiProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoDefiProdu.setText("Buscar");
		this.jButtonid_sucursalProductoDefiProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoDefiProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoDefiProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoDefiProdu"));

		this.jButtonid_sucursalProductoDefiProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoDefiProduBusqueda.setText("U");
		this.jButtonid_sucursalProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoDefiProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoDefiProduUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoDefiProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoDefiProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoDefiProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoDefiProduUpdate.setText("U");
		this.jButtonid_sucursalProductoDefiProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoDefiProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoDefiProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoDefiProduUpdate"));



					
		this.jLabelid_bodegaProductoDefiProdu = new JLabelMe();
		this.jLabelid_bodegaProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoDefiProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPanelid_bodegaProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jComboBoxid_bodegaProductoDefiProdu= new JComboBoxMe();
		jComboBoxid_bodegaProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoDefiProdu= new JButtonMe();
		this.jButtonid_bodegaProductoDefiProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoDefiProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoDefiProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoDefiProdu.setText("Buscar");
		this.jButtonid_bodegaProductoDefiProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoDefiProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoDefiProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoDefiProdu"));

		this.jButtonid_bodegaProductoDefiProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoDefiProduBusqueda.setText("U");
		this.jButtonid_bodegaProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoDefiProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoDefiProduUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoDefiProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoDefiProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoDefiProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoDefiProduUpdate.setText("U");
		this.jButtonid_bodegaProductoDefiProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoDefiProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoDefiProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoDefiProduUpdate"));



					
		this.jLabelid_productoProductoDefiProdu = new JLabelMe();
		this.jLabelid_productoProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoDefiProdu.setToolTipText("Producto");
		this.jLabelid_productoProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPanelid_productoProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jComboBoxid_productoProductoDefiProdu= new JComboBoxMe();
		jComboBoxid_productoProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoDefiProdu= new JButtonMe();
		this.jButtonid_productoProductoDefiProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoDefiProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoDefiProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoDefiProdu.setText("Buscar");
		this.jButtonid_productoProductoDefiProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoDefiProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoDefiProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoDefiProdu"));

		this.jButtonid_productoProductoDefiProduBusqueda= new JButtonMe();
		this.jButtonid_productoProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoDefiProduBusqueda.setText("U");
		this.jButtonid_productoProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoDefiProduBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoDefiProduUpdate= new JButtonMe();
		this.jButtonid_productoProductoDefiProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoDefiProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoDefiProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoDefiProduUpdate.setText("U");
		this.jButtonid_productoProductoDefiProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoDefiProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoDefiProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoDefiProduUpdate"));



					
		this.jLabelid_unidadProductoDefiProdu = new JLabelMe();
		this.jLabelid_unidadProductoDefiProdu.setText(""+ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoDefiProdu.setToolTipText("Unad");
		this.jLabelid_unidadProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoDefiProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoDefiProdu.setToolTipText(ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		this.jPanelid_unidadProductoDefiProdu.setLayout(this.gridaBagLayoutProductoDefiProdu);


		jComboBoxid_unidadProductoDefiProdu= new JComboBoxMe();
		jComboBoxid_unidadProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoDefiProdu= new JButtonMe();
		this.jButtonid_unidadProductoDefiProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoDefiProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoDefiProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoDefiProdu.setText("Buscar");
		this.jButtonid_unidadProductoDefiProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoDefiProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoDefiProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoDefiProdu"));

		this.jButtonid_unidadProductoDefiProduBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoDefiProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoDefiProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoDefiProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoDefiProduBusqueda.setText("U");
		this.jButtonid_unidadProductoDefiProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoDefiProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoDefiProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoDefiProduBusqueda"));

		if(this.productodefiproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoDefiProduBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoDefiProduUpdate= new JButtonMe();
		this.jButtonid_unidadProductoDefiProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoDefiProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoDefiProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoDefiProduUpdate.setText("U");
		this.jButtonid_unidadProductoDefiProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoDefiProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoDefiProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoDefiProduUpdate"));



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
		//this.jInternalFrameDetalleProductoDefiProdu = new ProductoDefiProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Definicion Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoDefiProdu= new GridBagLayout();
		

		
		String sToolTipProductoDefiProdu="";
		sToolTipProductoDefiProdu=ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoDefiProdu+="(Produccion.ProductoDefiProdu)";
		}
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoDefiProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoDefiProdu = new JButtonMe();
		this.jButtonModificarProductoDefiProdu = new JButtonMe();
        this.jButtonActualizarProductoDefiProdu = new JButtonMe();
        this.jButtonEliminarProductoDefiProdu = new JButtonMe();
        this.jButtonCancelarProductoDefiProdu = new JButtonMe();
        this.jButtonGuardarCambiosProductoDefiProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoDefiProdu = new JButtonMe();
		this.jButtonCerrarProductoDefiProdu = new JButtonMe();
		
		this.jScrollPanelDatosProductoDefiProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoDefiProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoDefiProdu = new JScrollPane();
				
		
		
		this.jPanelCamposProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Definicion Produccion";
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Definicion Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoDefiProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoDefiProdu.setName("jPanelCamposProductoDefiProdu"); 

		this.jPanelCamposOcultosProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoDefiProdu.setName("jPanelCamposOcultosProductoDefiProdu"); 

        this.jPanelAccionesProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoDefiProdu.setToolTipText("Acciones");
        this.jPanelAccionesProductoDefiProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoDefiProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoDefiProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoDefiProdu.setText("Nuevo");
		this.jButtonModificarProductoDefiProdu.setText("Editar");
        this.jButtonActualizarProductoDefiProdu.setText("Actualizar");
        this.jButtonEliminarProductoDefiProdu.setText("Eliminar");
        this.jButtonCancelarProductoDefiProdu.setText("Cancelar");
        this.jButtonGuardarCambiosProductoDefiProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoDefiProdu.setText("Guardar");
		this.jButtonCerrarProductoDefiProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoDefiProdu,"nuevo_button","Nuevo",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoDefiProdu,"modificar_button","Editar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoDefiProdu,"actualizar_button","Actualizar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoDefiProdu,"eliminar_button","Eliminar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoDefiProdu,"cancelar_button","Cancelar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoDefiProdu,"guardarcambios_button","Guardar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoDefiProdu,"guardarcambiostabla_button","Guardar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoDefiProdu,"cerrar_button","Salir",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoDefiProdu.setToolTipText("Nuevo"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoDefiProdu.setToolTipText("Editar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoDefiProdu.setToolTipText("Actualizar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoDefiProdu.setToolTipText("Eliminar)"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoDefiProdu.setToolTipText("Cancelar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoDefiProdu.setToolTipText("Guardar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoDefiProdu.setToolTipText("Guardar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoDefiProdu.setToolTipText("Salir"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoDefiProdu";
		inputMap = this.jButtonNuevoProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoDefiProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoDefiProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoDefiProdu";
		inputMap = this.jButtonActualizarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoDefiProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoDefiProdu";
		inputMap = this.jButtonEliminarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoDefiProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoDefiProdu";
		inputMap = this.jButtonCancelarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoDefiProdu"));
		
		//CERRAR		
		sMapKey = "CerrarProductoDefiProdu";
		inputMap = this.jButtonCerrarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoDefiProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoDefiProdu";
		inputMap = this.jButtonGuardarCambiosTablaProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoDefiProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoDefiProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoDefiProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoDefiProdu.setToolTipText("Nuevo ProductoDefiProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoDefiProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoDefiProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoDefiProdu.setToolTipText("Sin Cerrar Ventana ProductoDefiProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoDefiProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoDefiProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoDefiProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoDefiProdu.setText("Accion");
		this.jComboBoxTiposAccionesProductoDefiProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoDefiProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoDefiProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoDefiProdu = new JLabelMe();
		
		this.jLabelAccionesProductoDefiProdu.setText("Acciones");		
		this.jLabelAccionesProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoDefiProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoDefiProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoDefiProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoDefiProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoDefiProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoDefiProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoDefiProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoDefiProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoDefiProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoDefiProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoDefiProdu = new GridBagLayout();
		
		this.jPanelCamposProductoDefiProdu.setLayout(gridaBagLayoutCamposProductoDefiProdu);
		this.jPanelCamposOcultosProductoDefiProdu.setLayout(gridaBagLayoutCamposOcultosProductoDefiProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoDefiProdu.add(jLabelIdProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoDefiProdu.add(jLabelidProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoDefiProdu.add(jLabelid_empresaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 2;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoDefiProdu.add(jButtonid_empresaProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 3;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoDefiProdu.add(jButtonid_empresaProductoDefiProduUpdate, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoDefiProdu.add(jComboBoxid_empresaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoDefiProdu.add(jLabelid_sucursalProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 2;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoDefiProdu.add(jButtonid_sucursalProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 3;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoDefiProdu.add(jButtonid_sucursalProductoDefiProduUpdate, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoDefiProdu.add(jComboBoxid_sucursalProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoDefiProdu.add(jLabelid_bodegaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 2;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoDefiProdu.add(jButtonid_bodegaProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 3;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoDefiProdu.add(jButtonid_bodegaProductoDefiProduUpdate, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoDefiProdu.add(jComboBoxid_bodegaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoDefiProdu.add(jLabelid_productoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 2;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoDefiProdu.add(jButtonid_productoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 3;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoDefiProdu.add(jButtonid_productoProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 4;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoDefiProdu.add(jButtonid_productoProductoDefiProduUpdate, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoDefiProdu.add(jComboBoxid_productoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoDefiProdu.add(jLabelid_unidadProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 2;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoDefiProdu.add(jButtonid_unidadProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 3;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoDefiProdu.add(jButtonid_unidadProductoDefiProduUpdate, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoDefiProdu.add(jComboBoxid_unidadProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_genera_sub_productosProductoDefiProdu.add(jLabelcon_genera_sub_productosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 2;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_genera_sub_productosProductoDefiProdu.add(jButtoncon_genera_sub_productosProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_genera_sub_productosProductoDefiProdu.add(jCheckBoxcon_genera_sub_productosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoDefiProdu.add(jLabeldescripcionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 2;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
		this.gridBagConstraintsProductoDefiProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoDefiProdu.add(jButtondescripcionProductoDefiProduBusqueda, this.gridBagConstraintsProductoDefiProdu);
	}

	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoDefiProdu.gridy = 0;
	this.gridBagConstraintsProductoDefiProdu.gridx = 1;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoDefiProdu.add(jscrollPanedescripcionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoDefiProdu.add(this.jPanelidProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposProductoDefiProdu % 1==0) {
		iXPanelCamposProductoDefiProdu=0;
		iYPanelCamposProductoDefiProdu++;
	}
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoDefiProdu.add(this.jPanelid_bodegaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposProductoDefiProdu % 1==0) {
		iXPanelCamposProductoDefiProdu=0;
		iYPanelCamposProductoDefiProdu++;
	}
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoDefiProdu.add(this.jPanelid_productoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposProductoDefiProdu % 1==0) {
		iXPanelCamposProductoDefiProdu=0;
		iYPanelCamposProductoDefiProdu++;
	}
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoDefiProdu.add(this.jPanelid_unidadProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposProductoDefiProdu % 1==0) {
		iXPanelCamposProductoDefiProdu=0;
		iYPanelCamposProductoDefiProdu++;
	}
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoDefiProdu.add(this.jPanelcon_genera_sub_productosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposProductoDefiProdu % 1==0) {
		iXPanelCamposProductoDefiProdu=0;
		iYPanelCamposProductoDefiProdu++;
	}
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoDefiProdu.add(this.jPaneldescripcionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposProductoDefiProdu % 1==0) {
		iXPanelCamposProductoDefiProdu=0;
		iYPanelCamposProductoDefiProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposOcultosProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposOcultosProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoDefiProdu.add(this.jPanelid_empresaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposOcultosProductoDefiProdu % 1==0) {
		iXPanelCamposOcultosProductoDefiProdu=0;
		iYPanelCamposOcultosProductoDefiProdu++;
	}
	this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoDefiProdu.gridy = iYPanelCamposOcultosProductoDefiProdu;
	this.gridBagConstraintsProductoDefiProdu.gridx = iXPanelCamposOcultosProductoDefiProdu++;
	this.gridBagConstraintsProductoDefiProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoDefiProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoDefiProdu.add(this.jPanelid_sucursalProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);



	if(iXPanelCamposOcultosProductoDefiProdu % 1==0) {
		iXPanelCamposOcultosProductoDefiProdu=0;
		iYPanelCamposOcultosProductoDefiProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoDefiProdu= new GridBagLayout();
		this.jPanelAccionesProductoDefiProdu.setLayout(gridaBagLayoutAccionesProductoDefiProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoDefiProdu= new GridBagLayout();
		this.jPanelAccionesFormularioProductoDefiProdu.setLayout(gridaBagLayoutAccionesFormularioProductoDefiProdu);
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoDefiProdu.add(this.jComboBoxTiposAccionesFormularioProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoDefiProdu.add(this.jCheckBoxPostAccionNuevoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoDefiProdu.add(this.jCheckBoxPostAccionSinCerrarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoDefiProdu.add(this.jCheckBoxPostAccionSinMensajeProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoDefiProdu.add(this.jButtonModificarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);							

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoDefiProdu.add(this.jButtonEliminarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
			
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoDefiProdu.add(this.jButtonActualizarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);


		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoDefiProdu.add(this.jButtonGuardarCambiosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);	
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;		
		this.gridBagConstraintsProductoDefiProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoDefiProdu.add(this.jButtonCancelarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoDefiProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();						
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoDefiProdu.gridx = 0;		
			//this.gridBagConstraintsProductoDefiProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoDefiProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoDefiProdu.gridx =0;
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoDefiProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoDefiProdu = new ProductoDefiProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Definicion Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Definicion Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Definicion Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoDefiProduModel productodefiproduModel=new ProductoDefiProduModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoDefiProduModel.ProductoDefiProduFocusTraversalPolicy productodefiproduFocusTraversalPolicy = productodefiproduModel.new ProductoDefiProduFocusTraversalPolicy(this);
			
			//productodefiproduFocusTraversalPolicy.setproductodefiproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productodefiproduModel);
			
			
			this.jContentPaneDetalleProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoDefiProdu = new GridBagLayout();	
			this.jContentPaneDetalleProductoDefiProdu.setLayout(gridaBagLayoutDetalleProductoDefiProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoDefiProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoDefiProdu.gridx = 0;
					
				
				this.jContentPaneDetalleProductoDefiProdu.add(jTtoolBarDetalleProductoDefiProdu, gridBagConstraintsProductoDefiProdu);								
				
}
			
			this.jScrollPanelDatosEdicionProductoDefiProdu=   new JScrollPane(jContentPaneDetalleProductoDefiProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoDefiProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoDefiProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoDefiProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoDefiProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoDefiProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoDefiProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoDefiProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	        
			this.jContentPaneDetalleProductoDefiProdu.add(jPanelCamposProductoDefiProdu, gridBagConstraintsProductoDefiProdu);
			
			
			
			
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
						&& productodefiproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProductoProdu(this.puedeCargarPorParteProductoProdu,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduGasto(this.puedeCargarPorParteProductoProduGasto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMano(this.puedeCargarPorParteProductoProduMano,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(this.puedeCargarPorParteProductoProduMaquina,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMerma(this.puedeCargarPorParteProductoProduMerma,false,-1);
					
					if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoDefiProdu= new GridBagConstraints();
						this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoDefiProdu.gridx = 0;
						this.jContentPaneDetalleProductoDefiProdu.add(this.jTabbedPaneRelacionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoDefiProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProductoProdu(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduGasto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMano(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMerma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoDefiProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
					this.gridBagConstraintsProductoDefiProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoDefiProdu.gridx = 0;
					
				
					this.jContentPaneDetalleProductoDefiProdu.add(jPanelCamposOcultosProductoDefiProdu, gridBagConstraintsProductoDefiProdu);
				
					this.jPanelCamposOcultosProductoDefiProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	        this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoDefiProdu.add(this.jPanelAccionesFormularioProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);							
			
			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
	        this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsProductoDefiProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoDefiProdu.add(this.jPanelAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoDefiProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoDefiProdu=   new JScrollPane(this.jPanelCamposProductoDefiProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoDefiProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoDefiProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoDefiProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoDefiProdu.gridx = 0;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoDefiProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoDefiProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoDefiProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
			
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
			
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoDefiProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoDefiProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProductoProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoproduSessionBean=new ProductoProduSessionBean();
		this.productoproduSessionBean.setConGuardarRelaciones(false);
		this.productoproduSessionBean.setEsGuardarRelacionado(true);

		this.productoproduBeanSwingJInternalFrame=null;//new ProductoProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoproduBeanSwingJInternalFramePopup=new ProductoProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoproduSessionBean.getEsGuardarRelacionado()) {

				ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoproduSessionBean.setEsGuardarRelacionado(true);

				this.productoproduBeanSwingJInternalFrame=new ProductoProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoproduBeanSwingJInternalFrame.setproductoproduSessionBean(this.productoproduSessionBean);

				//this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				//this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProductoDefiProdu.gridx = 0;
				//this.jContentPaneDetalleProductoDefiProdu.add(this.productoproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProductoDefiProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Parte Producciones",this.productoproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProductoDefiProdu.setComponentAt(iIndexTab,this.productoproduBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoproduSessionBean.setEsGuardarRelacionado(false);
				this.productoproduBeanSwingJInternalFrame=null;//new ProductoProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProdu) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Parte Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduGasto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		this.productoprodugastoSessionBean.setConGuardarRelaciones(false);
		this.productoprodugastoSessionBean.setEsGuardarRelacionado(true);

		this.productoprodugastoBeanSwingJInternalFrame=null;//new ProductoProduGastoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodugastoBeanSwingJInternalFramePopup=new ProductoProduGastoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodugastoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {

				ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodugastoSessionBean.setEsGuardarRelacionado(true);

				this.productoprodugastoBeanSwingJInternalFrame=new ProductoProduGastoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodugastoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodugastoBeanSwingJInternalFrame.setproductoprodugastoSessionBean(this.productoprodugastoSessionBean);

				//this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				//this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProductoDefiProdu.gridx = 0;
				//this.jContentPaneDetalleProductoDefiProdu.add(this.productoprodugastoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProductoDefiProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Gasto Producciones",this.productoprodugastoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProductoDefiProdu.setComponentAt(iIndexTab,this.productoprodugastoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodugastoSessionBean.setEsGuardarRelacionado(false);
				this.productoprodugastoBeanSwingJInternalFrame=null;//new ProductoProduGastoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduGasto) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Gasto Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMano(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		this.productoprodumanoSessionBean.setConGuardarRelaciones(false);
		this.productoprodumanoSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumanoBeanSwingJInternalFrame=null;//new ProductoProduManoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumanoBeanSwingJInternalFramePopup=new ProductoProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumanoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {

				ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumanoSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumanoBeanSwingJInternalFrame=new ProductoProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumanoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumanoBeanSwingJInternalFrame.setproductoprodumanoSessionBean(this.productoprodumanoSessionBean);

				//this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				//this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProductoDefiProdu.gridx = 0;
				//this.jContentPaneDetalleProductoDefiProdu.add(this.productoprodumanoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProductoDefiProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Mano De Obra Producciones",this.productoprodumanoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProductoDefiProdu.setComponentAt(iIndexTab,this.productoprodumanoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumanoSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumanoBeanSwingJInternalFrame=null;//new ProductoProduManoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMano) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Mano De Obra Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumaquinaBeanSwingJInternalFrame.setproductoprodumaquinaSessionBean(this.productoprodumaquinaSessionBean);

				//this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				//this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProductoDefiProdu.gridx = 0;
				//this.jContentPaneDetalleProductoDefiProdu.add(this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProductoDefiProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Maquina Producciones",this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProductoDefiProdu.setComponentAt(iIndexTab,this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMaquina) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Maquina Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMerma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		this.productoprodumermaSessionBean.setConGuardarRelaciones(false);
		this.productoprodumermaSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumermaBeanSwingJInternalFrame=null;//new ProductoProduMermaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumermaBeanSwingJInternalFramePopup=new ProductoProduMermaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumermaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {

				ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumermaSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumermaBeanSwingJInternalFrame=new ProductoProduMermaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumermaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumermaBeanSwingJInternalFrame.setproductoprodumermaSessionBean(this.productoprodumermaSessionBean);

				//this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				//this.gridBagConstraintsProductoDefiProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProductoDefiProdu.gridx = 0;
				//this.jContentPaneDetalleProductoDefiProdu.add(this.productoprodumermaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProductoDefiProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Merma Producciones",this.productoprodumermaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProductoDefiProdu.setComponentAt(iIndexTab,this.productoprodumermaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumermaSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumermaBeanSwingJInternalFrame=null;//new ProductoProduMermaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMerma) {
					this.jTabbedPaneRelacionesProductoDefiProdu.add("Producto Merma Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoProduManoBeanSwingJInternalFrame(List<ProductoDefiProdu> productodefiprodus,ProductoDefiProdu productodefiprodu,ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumanoBeanSwingJInternalFrame=new ProductoProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumanoBeanSwingJInternalFrame.getProductoProduManoLogic().setConnexion(this.productodefiproduLogic.getConnexion());

					productoprodumanoBeanSwingJInternalFrame.setproductodefiprodusForeignKey(productodefiprodus);
					productoprodumanoBeanSwingJInternalFrame.setproductodefiproduForeignKey(productodefiprodu);
					productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
					productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setlidProductoDefiProduActual(productodefiprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumanoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMano(productoprodumanoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumanoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoDefiProdu(true);
					productoprodumanoBeanSwingJInternalFrame.setid_producto_defi_produFK_IdProductoDefiProdu(productodefiprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumanoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumanoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoDefiProduForeignKey(productodefiprodu,1,false,true,true);
					productoprodumanoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumanoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProductoDefiProdu");
					productoprodumanoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProductoDefiProdu");
					productoprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMano(true);
					productoprodumanoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMano("n",productoprodumanoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumanoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumanoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumanoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMano("relacionado");
					} else {
						productoprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMano("no_relacionado");
					}

					productoprodumanoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMano().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduMermaBeanSwingJInternalFrame(List<ProductoDefiProdu> productodefiprodus,ProductoDefiProdu productodefiprodu,ProductoProduMermaBeanSwingJInternalFrame productoprodumermaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumermaBeanSwingJInternalFrame=new ProductoProduMermaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumermaBeanSwingJInternalFrame.getProductoProduMermaLogic().setConnexion(this.productodefiproduLogic.getConnexion());

					productoprodumermaBeanSwingJInternalFrame.setproductodefiprodusForeignKey(productodefiprodus);
					productoprodumermaBeanSwingJInternalFrame.setproductodefiproduForeignKey(productodefiprodu);
					productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
					productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.setlidProductoDefiProduActual(productodefiprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumermaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMerma(productoprodumermaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumermaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoDefiProdu(true);
					productoprodumermaBeanSwingJInternalFrame.setid_producto_defi_produFK_IdProductoDefiProdu(productodefiprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumermaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumermaBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoDefiProduForeignKey(productodefiprodu,1,false,true,true);
					productoprodumermaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumermaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProductoDefiProdu");
					productoprodumermaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProductoDefiProdu");
					productoprodumermaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMerma(true);
					productoprodumermaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMerma("n",productoprodumermaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumermaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumermaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumermaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumermaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMerma("relacionado");
					} else {
						productoprodumermaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMerma("no_relacionado");
					}

					productoprodumermaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMerma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduGastoBeanSwingJInternalFrame(List<ProductoDefiProdu> productodefiprodus,ProductoDefiProdu productodefiprodu,ProductoProduGastoBeanSwingJInternalFrame productoprodugastoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodugastoBeanSwingJInternalFrame=new ProductoProduGastoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodugastoBeanSwingJInternalFrame.getProductoProduGastoLogic().setConnexion(this.productodefiproduLogic.getConnexion());

					productoprodugastoBeanSwingJInternalFrame.setproductodefiprodusForeignKey(productodefiprodus);
					productoprodugastoBeanSwingJInternalFrame.setproductodefiproduForeignKey(productodefiprodu);
					productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
					productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.setlidProductoDefiProduActual(productodefiprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodugastoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduGasto(productoprodugastoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodugastoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoDefiProdu(true);
					productoprodugastoBeanSwingJInternalFrame.setid_producto_defi_produFK_IdProductoDefiProdu(productodefiprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodugastoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodugastoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoDefiProduForeignKey(productodefiprodu,1,false,true,true);
					productoprodugastoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodugastoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProductoDefiProdu");
					productoprodugastoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProductoDefiProdu");
					productoprodugastoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduGasto(true);
					productoprodugastoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduGasto("n",productoprodugastoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodugastoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodugastoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodugastoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodugastoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduGasto("relacionado");
					} else {
						productoprodugastoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduGasto("no_relacionado");
					}

					productoprodugastoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduGasto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduBeanSwingJInternalFrame(List<ProductoDefiProdu> productodefiprodus,ProductoDefiProdu productodefiprodu,ProductoProduBeanSwingJInternalFrame productoproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoproduBeanSwingJInternalFrame=new ProductoProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoproduBeanSwingJInternalFrame.getProductoProduLogic().setConnexion(this.productodefiproduLogic.getConnexion());

					productoproduBeanSwingJInternalFrame.setproductodefiprodusForeignKey(productodefiprodus);
					productoproduBeanSwingJInternalFrame.setproductodefiproduForeignKey(productodefiprodu);
					productoproduBeanSwingJInternalFrame.productoproduSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
					productoproduBeanSwingJInternalFrame.productoproduSessionBean.setlidProductoDefiProduActual(productodefiprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoproduBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProdu(productoproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoDefiProdu(true);
					productoproduBeanSwingJInternalFrame.setid_producto_defi_produFK_IdProductoDefiProdu(productodefiprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoproduBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoDefiProduForeignKey(productodefiprodu,1,false,true,true);
					productoproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdProductoDefiProdu");
					productoproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProductoDefiProdu");
					productoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProdu(true);
					productoproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProdu("n",productoproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoproduBeanSwingJInternalFrame.setAutoscrolls(true);
					productoproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoproduBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProdu("relacionado");
					} else {
						productoproduBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProdu("no_relacionado");
					}

					productoproduBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProdu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduMaquinaBeanSwingJInternalFrame(List<ProductoDefiProdu> productodefiprodus,ProductoDefiProdu productodefiprodu,ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumaquinaBeanSwingJInternalFrame.getProductoProduMaquinaLogic().setConnexion(this.productodefiproduLogic.getConnexion());

					productoprodumaquinaBeanSwingJInternalFrame.setproductodefiprodusForeignKey(productodefiprodus);
					productoprodumaquinaBeanSwingJInternalFrame.setproductodefiproduForeignKey(productodefiprodu);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setlidProductoDefiProduActual(productodefiprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMaquina(productoprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoDefiProdu(true);
					productoprodumaquinaBeanSwingJInternalFrame.setid_producto_defi_produFK_IdProductoDefiProdu(productodefiprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoDefiProduForeignKey(productodefiprodu,1,false,true,true);
					productoprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProductoDefiProdu");
					productoprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProductoDefiProdu");
					productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(true);
					productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMaquina("n",productoprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("relacionado");
					} else {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");
					}

					productoprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMaquina().setVisible(false);

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
