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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.LineaConstantesFunciones;

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
public class LineaDetalleFormJInternalFrame extends LineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLinea;
	
	protected JMenuBar jmenuBarDetalleLinea;
	
	protected JMenu jmenuDetalleLinea;
	protected JMenu jmenuDetalleArchivoLinea;
	protected JMenu jmenuDetalleAccionesLinea;
	protected JMenu jmenuDetalleDatosLinea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLinea;	
	protected GridBagConstraints gridBagConstraintsLinea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LineaBeanSwingJInternalFrameAdditional jInternalFrameDetalleLinea;		
	
	public LineaBeanSwingJInternalFrameTree jInternalFrameTreeLinea;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivellinea="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";
	
	public LineaSessionBean lineaSessionBean;
	
	

	public PresupuestoLineaBeanSwingJInternalFrame presupuestolineaBeanSwingJInternalFrame=null;
	public PresupuestoLineaBeanSwingJInternalFrame presupuestolineaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoLinea=false;
	public PresupuestoLineaSessionBean presupuestolineaSessionBean;

	//public LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=null;
	public LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLinea=false;

	public ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame=null;
	public ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionGrupo=false;
	public ComisionGrupoSessionBean comisiongrupoSessionBean;

	public ProductoPuntoVentaBeanSwingJInternalFrame productopuntoventaBeanSwingJInternalFrame=null;
	public ProductoPuntoVentaBeanSwingJInternalFrame productopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoPuntoVenta=false;
	public ProductoPuntoVentaSessionBean productopuntoventaSessionBean;

	public ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame=null;
	public ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionLinea=false;
	public ComisionLineaSessionBean comisionlineaSessionBean;

	public ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame=null;
	public ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionCate=false;
	public ComisionCateSessionBean comisioncateSessionBean;

	public DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFrame=null;
	public DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePlaneacionCompra=false;
	public DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean;

	public CuentasContablesLineaProductoBeanSwingJInternalFrame cuentascontableslineaproductoBeanSwingJInternalFrame=null;
	public CuentasContablesLineaProductoBeanSwingJInternalFrame cuentascontableslineaproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentasContablesLineaProducto=false;
	public CuentasContablesLineaProductoSessionBean cuentascontableslineaproductoSessionBean;

	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;
	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrecio=false;
	public PrecioSessionBean precioSessionBean;

	public LineaPuntoVentaBeanSwingJInternalFrame lineapuntoventaBeanSwingJInternalFrame=null;
	public LineaPuntoVentaBeanSwingJInternalFrame lineapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLineaPuntoVenta=false;
	public LineaPuntoVentaSessionBean lineapuntoventaSessionBean;

	public DetalleCodigoBarraProductoBeanSwingJInternalFrame detallecodigobarraproductoBeanSwingJInternalFrame=null;
	public DetalleCodigoBarraProductoBeanSwingJInternalFrame detallecodigobarraproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleCodigoBarraProducto=false;
	public DetalleCodigoBarraProductoSessionBean detallecodigobarraproductoSessionBean;

	public PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame=null;
	public PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentasLineas=false;
	public PresupuestoVentasLineasSessionBean presupuestoventaslineasSessionBean;

	public CentroCostoGrupoProductoBeanSwingJInternalFrame centrocostogrupoproductoBeanSwingJInternalFrame=null;
	public CentroCostoGrupoProductoBeanSwingJInternalFrame centrocostogrupoproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCentroCostoGrupoProducto=false;
	public CentroCostoGrupoProductoSessionBean centrocostogrupoproductoSessionBean;

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;

	public ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame=null;
	public ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionMarca=false;
	public ComisionMarcaSessionBean comisionmarcaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public NivelLineaSessionBean nivellineaSessionBean;	
	
	public LineaLogic lineaLogic;
	
	public JScrollPane jScrollPanelDatosLinea;
	public JScrollPane jScrollPanelDatosEdicionLinea;
	public JScrollPane jScrollPanelDatosGeneralLinea;
	
	protected JPanel jPanelCamposLinea;    
	protected JPanel jPanelCamposOcultosLinea;    	
	protected JPanel jPanelAccionesLinea;
	protected JPanel jPanelAccionesFormularioLinea;
    
	
	
	protected Integer iXPanelCamposLinea=0;
	protected Integer iYPanelCamposLinea=0;
	
	protected Integer iXPanelCamposOcultosLinea=0;
	protected Integer iYPanelCamposOcultosLinea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLinea;
	public JButton jButtonModificarLinea;
	public JButton jButtonActualizarLinea;
    public JButton jButtonEliminarLinea;
	public JButton jButtonCancelarLinea;
    public JButton jButtonGuardarCambiosLinea;
	public JButton jButtonGuardarCambiosTablaLinea;
	protected JButton jButtonCerrarLinea;
	
	
	protected JButton jButtonProcesarInformacionLinea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLinea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLinea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLinea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLinea;
	protected JButton jButtonModificarToolBarLinea;
	protected JButton jButtonActualizarToolBarLinea;
    protected JButton jButtonEliminarToolBarLinea;
	protected JButton jButtonCancelarToolBarLinea;
    protected JButton jButtonGuardarCambiosToolBarLinea;
	protected JButton jButtonGuardarCambiosTablaToolBarLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarLinea;
	protected JButton jButtonCerrarToolBarLinea;
	
	protected JButton jButtonProcesarInformacionToolBarLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLinea;
	protected JMenuItem jMenuItemModificarLinea;
	protected JMenuItem jMenuItemActualizarLinea;
    protected JMenuItem jMenuItemEliminarLinea;
	protected JMenuItem jMenuItemCancelarLinea;
    protected JMenuItem jMenuItemGuardarCambiosLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaLinea;
	protected JMenuItem jMenuItemCerrarLinea;
	protected JMenuItem jMenuItemDetalleCerrarLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarLinea;
	
	protected JMenuItem jMenuItemProcesarInformacionLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLinea;
	protected JMenuItem jMenuItemMostrarOcultarLinea;
	
	
	//MENU
	
	protected JButton jButtonArbolLinea;	
	
	protected JLabel jLabelAccionesLinea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLinea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLinea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLinea;
	public JLabel jLabelIdLinea;
	public JLabel jLabelidLinea;
	public JButton jButtonidLineaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoLinea;
	public JLabel jLabelcodigoLinea;
	public JTextField jTextFieldcodigoLinea;
	public JButton jButtoncodigoLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombreLinea;
	public JLabel jLabelnombreLinea;
	public JTextArea jTextAreanombreLinea;
	public JScrollPane jscrollPanenombreLinea;
	public JButton jButtonnombreLineaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionLinea;
	public JLabel jLabeldescripcionLinea;
	public JTextArea jTextAreadescripcionLinea;
	public JScrollPane jscrollPanedescripcionLinea;
	public JButton jButtondescripcionLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaLinea;
	public JLabel jLabelid_empresaLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLinea;
	public JButton jButtonid_empresaLinea= new JButtonMe();
	public JButton jButtonid_empresaLineaUpdate= new JButtonMe();
	public JButton jButtonid_empresaLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_nivel_lineaLinea;
	public JLabel jLabelid_nivel_lineaLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_lineaLinea;
	public JButton jButtonid_nivel_lineaLinea= new JButtonMe();
	public JButton jButtonid_nivel_lineaLineaUpdate= new JButtonMe();
	public JButton jButtonid_nivel_lineaLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaLinea;
	public JLabel jLabelid_lineaLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaLinea;
	public JButton jButtonid_lineaLinea= new JButtonMe();
	public JButton jButtonid_lineaLineaUpdate= new JButtonMe();
	public JButton jButtonid_lineaLineaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaLineaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLinea;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public LineaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLinea=new JPanel();
				this.jPanelAccionesFormularioLinea=new JPanel();
				this.jmenuBarDetalleLinea=new JMenuBar();
				this.jTtoolBarDetalleLinea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LineaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLinea() {
		return this.jButtonActualizarToolBarLinea;
	}
	
	public JButton getjButtonEliminarToolBarLinea() {
		return this.jButtonEliminarToolBarLinea;
	}
	
	public JButton getjButtonCancelarToolBarLinea() {
		return this.jButtonCancelarToolBarLinea;
	}		
	
	public JButton getjButtonProcesarInformacionLinea() {
		return this.jButtonProcesarInformacionLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLinea)	{
		this.jButtonProcesarInformacionLinea = jButtonProcesarInformacionLinea;
	}
	
	
	public JButton getjButtonArbolLinea() {
		return this.jButtonArbolLinea;
	}
	
	public void setjButtonArbol(JButton jButtonArbolLinea)	{
		this.jButtonArbolLinea = jButtonArbolLinea;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLinea() {
		return this.jComboBoxTiposAccionesLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLinea(
			JComboBox jComboBoxTiposRelacionesLinea) {
		this.jComboBoxTiposRelacionesLinea = jComboBoxTiposRelacionesLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLinea(
			JComboBox jComboBoxTiposAccionesLinea) {
		this.jComboBoxTiposAccionesLinea = jComboBoxTiposAccionesLinea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLinea() {
		return this.jComboBoxTiposAccionesFormularioLinea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLinea(
			JComboBox jComboBoxTiposAccionesFormularioLinea) {
		this.jComboBoxTiposAccionesFormularioLinea = jComboBoxTiposAccionesFormularioLinea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.lineaSessionBean=new LineaSessionBean();
		
		this.lineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		//this.lineaSessionBean=new LineaSessionBean();
		//this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		//this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		//this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		//this.comisioncateSessionBean=new ComisionCateSessionBean();
		//this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		//this.cuentascontableslineaproductoSessionBean=new CuentasContablesLineaProductoSessionBean();
		//this.precioSessionBean=new PrecioSessionBean();
		//this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		//this.detallecodigobarraproductoSessionBean=new DetalleCodigoBarraProductoSessionBean();
		//this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		//this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		//this.productoSessionBean=new ProductoSessionBean();
		//this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
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
	
		LineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLinea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLinea=new JButtonMe();
				this.jButtonModificarToolBarLinea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLinea,this.jTtoolBarDetalleLinea,
							"actualizar","actualizar","Actualizar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLinea,this.jTtoolBarDetalleLinea,
							"eliminar","eliminar","Eliminar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLinea,this.jTtoolBarDetalleLinea,
							"cancelar","cancelar","Cancelar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLinea,this.jTtoolBarDetalleLinea,
							"guardarcambios","guardarcambios","Guardar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLinea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLinea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLinea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLinea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLinea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLinea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLinea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLinea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLinea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLinea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLinea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLinea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLinea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLinea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLinea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLinea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLinea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLinea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLinea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLinea.add(this.jMenuItemDetalleCerrarLinea);
		
		this.jmenuDetalleAccionesLinea.add(this.jMenuItemActualizarLinea);
		this.jmenuDetalleAccionesLinea.add(this.jMenuItemEliminarLinea);
		this.jmenuDetalleAccionesLinea.add(this.jMenuItemCancelarLinea);		
		
		//this.jmenuDetalleDatosLinea.add(this.jMenuItemDetalleAbrirOrderByLinea);				
		this.jmenuDetalleDatosLinea.add(this.jMenuItemDetalleMostarOcultarLinea);				
				
		//this.jmenuDetalleAccionesLinea.add(this.jMenuItemGuardarCambiosLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLinea.add(this.jmenuDetalleArchivoLinea);		
		this.jmenuBarDetalleLinea.add(this.jmenuDetalleAccionesLinea);		
		this.jmenuBarDetalleLinea.add(this.jmenuDetalleDatosLinea);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLinea.add(this.jmenuDetalleLinea);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLinea);				
	}
	
	
	public void inicializarElementosCamposLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLinea = new JLabelMe();
		jLabelIdLinea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLinea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLinea.setToolTipText(LineaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLinea= new GridBagLayout();

		this.jPanelidLinea.setLayout(this.gridaBagLayoutLinea);

		jLabelidLinea = new JLabel();
		jLabelidLinea.setText("Id");

		jLabelidLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoLinea = new JLabelMe();
		this.jLabelcodigoLinea.setText(""+LineaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoLinea.setToolTipText("Codigo");
		this.jLabelcodigoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoLinea.setToolTipText(LineaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutLinea = new GridBagLayout();
		this.jPanelcodigoLinea.setLayout(this.gridaBagLayoutLinea);


		jTextFieldcodigoLinea= new JTextFieldMe();

		jTextFieldcodigoLinea.setEnabled(false);
		jTextFieldcodigoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoLineaBusqueda= new JButtonMe();
		this.jButtoncodigoLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoLineaBusqueda.setText("U");
		this.jButtoncodigoLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoLineaBusqueda"));

		if(this.lineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoLineaBusqueda.setVisible(false);		}


					
		this.jLabelnombreLinea = new JLabelMe();
		this.jLabelnombreLinea.setText(""+LineaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreLinea.setToolTipText("Nombre");
		this.jLabelnombreLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreLinea.setToolTipText(LineaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutLinea = new GridBagLayout();
		this.jPanelnombreLinea.setLayout(this.gridaBagLayoutLinea);


		jTextAreanombreLinea= new JTextAreaMe();
		jTextAreanombreLinea.setEnabled(false);
		jTextAreanombreLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLinea.setLineWrap(true);
		jTextAreanombreLinea.setWrapStyleWord(true);
		jTextAreanombreLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreLinea = new JScrollPane(jTextAreanombreLinea);
		jscrollPanenombreLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreLineaBusqueda= new JButtonMe();
		this.jButtonnombreLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreLineaBusqueda.setText("U");
		this.jButtonnombreLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreLineaBusqueda"));

		if(this.lineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreLineaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionLinea = new JLabelMe();
		this.jLabeldescripcionLinea.setText(""+LineaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionLinea.setToolTipText("Descripcion");
		this.jLabeldescripcionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionLinea.setToolTipText(LineaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutLinea = new GridBagLayout();
		this.jPaneldescripcionLinea.setLayout(this.gridaBagLayoutLinea);


		jTextAreadescripcionLinea= new JTextAreaMe();
		jTextAreadescripcionLinea.setEnabled(false);
		jTextAreadescripcionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLinea.setLineWrap(true);
		jTextAreadescripcionLinea.setWrapStyleWord(true);
		jTextAreadescripcionLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionLinea.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionLinea = new JScrollPane(jTextAreadescripcionLinea);
		jscrollPanedescripcionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionLineaBusqueda= new JButtonMe();
		this.jButtondescripcionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionLineaBusqueda.setText("U");
		this.jButtondescripcionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionLineaBusqueda"));

		if(this.lineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionLineaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaLinea = new JLabelMe();
		this.jLabelid_empresaLinea.setText(""+LineaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLinea.setToolTipText("Empresa");
		this.jLabelid_empresaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLinea.setToolTipText(LineaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLinea = new GridBagLayout();
		this.jPanelid_empresaLinea.setLayout(this.gridaBagLayoutLinea);


		jComboBoxid_empresaLinea= new JComboBoxMe();
		jComboBoxid_empresaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLinea.setEnabled(false);

		this.jButtonid_empresaLinea= new JButtonMe();
		this.jButtonid_empresaLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLinea.setText("Buscar");
		this.jButtonid_empresaLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLinea"));

		this.jButtonid_empresaLineaBusqueda= new JButtonMe();
		this.jButtonid_empresaLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaBusqueda.setText("U");
		this.jButtonid_empresaLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaBusqueda"));

		if(this.lineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLineaBusqueda.setVisible(false);		}

		this.jButtonid_empresaLineaUpdate= new JButtonMe();
		this.jButtonid_empresaLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaUpdate.setText("U");
		this.jButtonid_empresaLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaUpdate"));



					
		this.jLabelid_nivel_lineaLinea = new JLabelMe();
		this.jLabelid_nivel_lineaLinea.setText(""+LineaConstantesFunciones.LABEL_IDNIVELLINEA+" : *");
		this.jLabelid_nivel_lineaLinea.setToolTipText("Nivel Linea");
		this.jLabelid_nivel_lineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_lineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_lineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_lineaLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_nivel_lineaLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_nivel_lineaLinea.setToolTipText(LineaConstantesFunciones.LABEL_IDNIVELLINEA);
		this.gridaBagLayoutLinea = new GridBagLayout();
		this.jPanelid_nivel_lineaLinea.setLayout(this.gridaBagLayoutLinea);


		jComboBoxid_nivel_lineaLinea= new JComboBoxMe();
		jComboBoxid_nivel_lineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_lineaLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_nivel_lineaLinea= new JButtonMe();
		this.jButtonid_nivel_lineaLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_lineaLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_lineaLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_lineaLinea.setText("Buscar");
		this.jButtonid_nivel_lineaLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_nivel_lineaLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_lineaLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_nivel_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_lineaLinea"));

		this.jButtonid_nivel_lineaLineaBusqueda= new JButtonMe();
		this.jButtonid_nivel_lineaLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_lineaLineaBusqueda.setText("U");
		this.jButtonid_nivel_lineaLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_nivel_lineaLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_lineaLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_nivel_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_lineaLineaBusqueda"));

		if(this.lineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_nivel_lineaLineaBusqueda.setVisible(false);		}

		this.jButtonid_nivel_lineaLineaUpdate= new JButtonMe();
		this.jButtonid_nivel_lineaLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_lineaLineaUpdate.setText("U");
		this.jButtonid_nivel_lineaLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_nivel_lineaLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_lineaLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_nivel_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_lineaLineaUpdate"));



					
		this.jLabelid_lineaLinea = new JLabelMe();
		this.jLabelid_lineaLinea.setText(""+LineaConstantesFunciones.LABEL_IDLINEA+" :");
		this.jLabelid_lineaLinea.setToolTipText("Linea Padre");
		this.jLabelid_lineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaLinea.setToolTipText(LineaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutLinea = new GridBagLayout();
		this.jPanelid_lineaLinea.setLayout(this.gridaBagLayoutLinea);


		jComboBoxid_lineaLinea= new JComboBoxMe();
		jComboBoxid_lineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaLinea= new JButtonMe();
		this.jButtonid_lineaLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaLinea.setText("Buscar");
		this.jButtonid_lineaLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLinea"));

		this.jButtonid_lineaLineaBusqueda= new JButtonMe();
		this.jButtonid_lineaLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaLineaBusqueda.setText("U");
		this.jButtonid_lineaLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaBusqueda"));

		if(this.lineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaLineaBusqueda.setVisible(false);		}

		this.jButtonid_lineaLineaUpdate= new JButtonMe();
		this.jButtonid_lineaLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaLineaUpdate.setText("U");
		this.jButtonid_lineaLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaUpdate"));


		jButtonid_lineaLineaArbol= new JButtonMe();
		jButtonid_lineaLineaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaLineaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaLineaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaLineaArbol.setText("Arbol");
		jButtonid_lineaLineaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaLineaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaArbol"));



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
		//this.jInternalFrameDetalleLinea = new LineaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Linea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLinea= new GridBagLayout();
		

		
		String sToolTipLinea="";
		sToolTipLinea=LineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLinea+="(Inventario.Linea)";
		}
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipLinea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLinea = new JButtonMe();
		this.jButtonModificarLinea = new JButtonMe();
        this.jButtonActualizarLinea = new JButtonMe();
        this.jButtonEliminarLinea = new JButtonMe();
        this.jButtonCancelarLinea = new JButtonMe();
        this.jButtonGuardarCambiosLinea = new JButtonMe();
		this.jButtonGuardarCambiosTablaLinea = new JButtonMe();
		this.jButtonCerrarLinea = new JButtonMe();
		
		this.jScrollPanelDatosLinea = new JScrollPane();   
        this.jScrollPanelDatosEdicionLinea = new JScrollPane();
		this.jScrollPanelDatosGeneralLinea = new JScrollPane();
				
		
		
		this.jPanelCamposLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Linea";
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLinea.setName("jPanelCamposLinea"); 

		this.jPanelCamposOcultosLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLinea.setName("jPanelCamposOcultosLinea"); 

        this.jPanelAccionesLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLinea.setToolTipText("Acciones");
        this.jPanelAccionesLinea.setName("Acciones"); 

		this.jPanelAccionesFormularioLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLinea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLinea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLinea.setText("Nuevo");
		this.jButtonModificarLinea.setText("Editar");
        this.jButtonActualizarLinea.setText("Actualizar");
        this.jButtonEliminarLinea.setText("Eliminar");
        this.jButtonCancelarLinea.setText("Cancelar");
        this.jButtonGuardarCambiosLinea.setText("Guardar");
		this.jButtonGuardarCambiosTablaLinea.setText("Guardar");
		this.jButtonCerrarLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLinea,"nuevo_button","Nuevo",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLinea,"modificar_button","Editar",this.lineaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLinea,"actualizar_button","Actualizar",this.lineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLinea,"eliminar_button","Eliminar",this.lineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLinea,"cancelar_button","Cancelar",this.lineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLinea,"guardarcambios_button","Guardar",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLinea,"guardarcambiostabla_button","Guardar",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLinea,"cerrar_button","Salir",this.lineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLinea.setToolTipText("Nuevo"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLinea.setToolTipText("Editar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLinea.setToolTipText("Actualizar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLinea.setToolTipText("Eliminar)"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLinea.setToolTipText("Cancelar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLinea.setToolTipText("Guardar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLinea.setToolTipText("Guardar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLinea.setToolTipText("Salir"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLinea";
		inputMap = this.jButtonNuevoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLinea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLinea";
		inputMap = this.jButtonActualizarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLinea"));
		
		//ELIMINAR
		sMapKey = "EliminarLinea";
		inputMap = this.jButtonEliminarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLinea"));
		
		//CANCELAR	
		sMapKey = "CancelarLinea";
		inputMap = this.jButtonCancelarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLinea"));
		
		//CERRAR		
		sMapKey = "CerrarLinea";
		inputMap = this.jButtonCerrarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLinea";
		inputMap = this.jButtonGuardarCambiosTablaLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLinea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLinea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLinea.setToolTipText("Nuevo Linea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLinea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLinea.setToolTipText("Sin Cerrar Ventana Linea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLinea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLinea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLinea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolLinea = new JButtonMe();
		this.jButtonArbolLinea.setText("Arbol");		
		this.jButtonArbolLinea.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLinea.setText("Accion");
		this.jComboBoxTiposAccionesLinea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLinea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLinea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLinea = new JLabelMe();
		
		this.jLabelAccionesLinea.setText("Acciones");		
		this.jLabelAccionesLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLinea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLinea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLinea=new JTabbedPane();
		this.jTabbedPaneRelacionesLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolLinea.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolLinea.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolLinea.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLinea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLinea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLinea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLinea = new GridBagLayout();
		
		this.jPanelCamposLinea.setLayout(gridaBagLayoutCamposLinea);
		this.jPanelCamposOcultosLinea.setLayout(gridaBagLayoutCamposOcultosLinea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLinea.add(jLabelIdLinea, this.gridBagConstraintsLinea);



	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLinea.add(jLabelidLinea, this.gridBagConstraintsLinea);


	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLinea.add(jLabelid_empresaLinea, this.gridBagConstraintsLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 2;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLinea.add(jButtonid_empresaLineaBusqueda, this.gridBagConstraintsLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 3;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLinea.add(jButtonid_empresaLineaUpdate, this.gridBagConstraintsLinea);
	}

	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLinea.add(jComboBoxid_empresaLinea, this.gridBagConstraintsLinea);


	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_nivel_lineaLinea.add(jLabelid_nivel_lineaLinea, this.gridBagConstraintsLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 2;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_lineaLinea.add(jButtonid_nivel_lineaLineaBusqueda, this.gridBagConstraintsLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 3;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_lineaLinea.add(jButtonid_nivel_lineaLineaUpdate, this.gridBagConstraintsLinea);
	}

	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_nivel_lineaLinea.add(jComboBoxid_nivel_lineaLinea, this.gridBagConstraintsLinea);


	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaLinea.add(jLabelid_lineaLinea, this.gridBagConstraintsLinea);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsLinea = new GridBagConstraints();
	//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 2;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_lineaLinea.add(jButtonid_lineaLinea, this.gridBagConstraintsLinea);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsLinea = new GridBagConstraints();
	//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 3;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_lineaLinea.add(jButtonid_lineaLineaArbol, this.gridBagConstraintsLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 4;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaLinea.add(jButtonid_lineaLineaBusqueda, this.gridBagConstraintsLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 5;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaLinea.add(jButtonid_lineaLineaUpdate, this.gridBagConstraintsLinea);
	}

	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaLinea.add(jComboBoxid_lineaLinea, this.gridBagConstraintsLinea);


	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoLinea.add(jLabelcodigoLinea, this.gridBagConstraintsLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 2;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoLinea.add(jButtoncodigoLineaBusqueda, this.gridBagConstraintsLinea);
	}

	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoLinea.add(jTextFieldcodigoLinea, this.gridBagConstraintsLinea);


	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreLinea.add(jLabelnombreLinea, this.gridBagConstraintsLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 2;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreLinea.add(jButtonnombreLineaBusqueda, this.gridBagConstraintsLinea);
	}

	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreLinea.add(jscrollPanenombreLinea, this.gridBagConstraintsLinea);


	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 0;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionLinea.add(jLabeldescripcionLinea, this.gridBagConstraintsLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 2;
		this.gridBagConstraintsLinea.ipadx = 0;
		this.gridBagConstraintsLinea.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionLinea.add(jButtondescripcionLineaBusqueda, this.gridBagConstraintsLinea);
	}

	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLinea.gridy = 0;
	this.gridBagConstraintsLinea.gridx = 1;
	this.gridBagConstraintsLinea.ipadx = 0;
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionLinea.add(jscrollPanedescripcionLinea, this.gridBagConstraintsLinea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLinea.add(this.jPanelidLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposLinea % 1==0) {
		iXPanelCamposLinea=0;
		iYPanelCamposLinea++;
	}
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLinea.add(this.jPanelid_nivel_lineaLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposLinea % 1==0) {
		iXPanelCamposLinea=0;
		iYPanelCamposLinea++;
	}
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLinea.add(this.jPanelid_lineaLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposLinea % 1==0) {
		iXPanelCamposLinea=0;
		iYPanelCamposLinea++;
	}
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLinea.add(this.jPanelcodigoLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposLinea % 1==0) {
		iXPanelCamposLinea=0;
		iYPanelCamposLinea++;
	}
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLinea.add(this.jPanelnombreLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposLinea % 1==0) {
		iXPanelCamposLinea=0;
		iYPanelCamposLinea++;
	}
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLinea.add(this.jPaneldescripcionLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposLinea % 1==0) {
		iXPanelCamposLinea=0;
		iYPanelCamposLinea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLinea = new GridBagConstraints();
	this.gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLinea.gridy = iYPanelCamposOcultosLinea;
	this.gridBagConstraintsLinea.gridx = iXPanelCamposOcultosLinea++;
	this.gridBagConstraintsLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLinea.add(this.jPanelid_empresaLinea, this.gridBagConstraintsLinea);



	if(iXPanelCamposOcultosLinea % 1==0) {
		iXPanelCamposOcultosLinea=0;
		iYPanelCamposOcultosLinea++;
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
			
		GridBagLayout gridaBagLayoutAccionesLinea= new GridBagLayout();
		this.jPanelAccionesLinea.setLayout(gridaBagLayoutAccionesLinea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLinea= new GridBagLayout();
		this.jPanelAccionesFormularioLinea.setLayout(gridaBagLayoutAccionesFormularioLinea);
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLinea.add(this.jComboBoxTiposAccionesFormularioLinea, this.gridBagConstraintsLinea);

		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLinea.add(this.jCheckBoxPostAccionNuevoLinea, this.gridBagConstraintsLinea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.lineaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLinea.add(this.jCheckBoxPostAccionSinCerrarLinea, this.gridBagConstraintsLinea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.lineaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.lineaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLinea.add(this.jCheckBoxPostAccionSinMensajeLinea, this.gridBagConstraintsLinea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = iPosXAccion++;
			
		this.jPanelAccionesLinea.add(this.jButtonModificarLinea, this.gridBagConstraintsLinea);							

		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx =iPosXAccion++;
			
		this.jPanelAccionesLinea.add(this.jButtonEliminarLinea, this.gridBagConstraintsLinea);
		
			
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = 0;		
		this.gridBagConstraintsLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesLinea.add(this.jButtonActualizarLinea, this.gridBagConstraintsLinea);


		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = 0;		
		this.gridBagConstraintsLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesLinea.add(this.jButtonGuardarCambiosLinea, this.gridBagConstraintsLinea);	
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = 0;		
		this.gridBagConstraintsLinea.gridx =iPosXAccion++;
		
		this.jPanelAccionesLinea.add(this.jButtonCancelarLinea, this.gridBagConstraintsLinea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLinea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLinea = new GridBagConstraints();						
			this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLinea.gridx = 0;		
			//this.gridBagConstraintsLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLinea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLinea.gridx =0;
		this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLinea, this.gridBagConstraintsLinea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeLinea = new LineaBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeLinea.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeLinea.setTitle("Linea ARBOL");
		this.jInternalFrameTreeLinea.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeLinea.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeLinea.setResizable(true);
	    this.jInternalFrameTreeLinea.setClosable(true);
	    this.jInternalFrameTreeLinea.setMaximizable(true);
			
			
		//if(LineaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLinea = new LineaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Linea DATOS");
			
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
			
	        //this.setTitle("[FOR] - Linea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LineaModel lineaModel=new LineaModel(this);
			
			//SI USARA CLASE INTERNA
			//LineaModel.LineaFocusTraversalPolicy lineaFocusTraversalPolicy = lineaModel.new LineaFocusTraversalPolicy(this);
			
			//lineaFocusTraversalPolicy.setlineaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(lineaModel);
			
			
			this.jContentPaneDetalleLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLinea = new GridBagLayout();	
			this.jContentPaneDetalleLinea.setLayout(gridaBagLayoutDetalleLinea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLinea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLinea = new GridBagConstraints();
				this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLinea.gridx = 0;
					
				
				this.jContentPaneDetalleLinea.add(jTtoolBarDetalleLinea, gridBagConstraintsLinea);								
				
}
			
			this.jScrollPanelDatosEdicionLinea=   new JScrollPane(jContentPaneDetalleLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLinea.gridx = 0;
	        
			this.jContentPaneDetalleLinea.add(jPanelCamposLinea, gridBagConstraintsLinea);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& lineaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCentroCostoGrupoProducto(this.puedeCargarPorParteCentroCostoGrupoProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionCate(this.puedeCargarPorParteComisionCate,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionGrupo(this.puedeCargarPorParteComisionGrupo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionLinea(this.puedeCargarPorParteComisionLinea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionMarca(this.puedeCargarPorParteComisionMarca,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentasContablesLineaProducto(this.puedeCargarPorParteCuentasContablesLineaProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleCodigoBarraProducto(this.puedeCargarPorParteDetalleCodigoBarraProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(this.puedeCargarPorParteDetallePlaneacionCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLinea(this.puedeCargarPorParteLinea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLineaPuntoVenta(this.puedeCargarPorParteLineaPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(this.puedeCargarPorPartePrecio,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoLinea(this.puedeCargarPorPartePresupuestoLinea,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(this.puedeCargarPorPartePresupuestoVentasLineas,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoPuntoVenta(this.puedeCargarPorParteProductoPuntoVenta,false,-1);
					
					if(this.lineaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLinea= new GridBagConstraints();
						this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLinea.gridx = 0;
						this.jContentPaneDetalleLinea.add(this.jTabbedPaneRelacionesLinea, this.gridBagConstraintsLinea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLinea.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCentroCostoGrupoProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionCate(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionGrupo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionLinea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionMarca(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentasContablesLineaProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleCodigoBarraProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLinea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLineaPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoLinea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLinea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLinea = new GridBagConstraints();
					this.gridBagConstraintsLinea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLinea.gridx = 0;
					
				
					this.jContentPaneDetalleLinea.add(jPanelCamposOcultosLinea, gridBagConstraintsLinea);
				
					this.jPanelCamposOcultosLinea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;//46;		
	        this.gridBagConstraintsLinea.gridx = 0;
	        this.gridBagConstraintsLinea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLinea.add(this.jPanelAccionesFormularioLinea, this.gridBagConstraintsLinea);							
			
			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
	        this.gridBagConstraintsLinea.gridy = iGridyRelaciones;//46;		
	        this.gridBagConstraintsLinea.gridx = 0;
	        
			
			this.jContentPaneDetalleLinea.add(this.jPanelAccionesLinea, this.gridBagConstraintsLinea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLinea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLinea=   new JScrollPane(this.jPanelCamposLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLinea.gridx = 0;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLinea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLinea, this.gridBagConstraintsLinea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLinea, this.gridBagConstraintsLinea);			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLinea, this.gridBagConstraintsLinea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLinea, this.gridBagConstraintsLinea);
			
			
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLinea, this.gridBagConstraintsLinea);
		
			
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLinea, this.gridBagConstraintsLinea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLinea;//jContentPane;
		
		return jScrollPanelDatosEdicionLinea;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCentroCostoGrupoProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(false);
		this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(true);

		this.centrocostogrupoproductoBeanSwingJInternalFrame=null;//new CentroCostoGrupoProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.centrocostogrupoproductoBeanSwingJInternalFramePopup=new CentroCostoGrupoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.centrocostogrupoproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {

				CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(true);

				this.centrocostogrupoproductoBeanSwingJInternalFrame=new CentroCostoGrupoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.centrocostogrupoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.centrocostogrupoproductoBeanSwingJInternalFrame.setcentrocostogrupoproductoSessionBean(this.centrocostogrupoproductoSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.centrocostogrupoproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Centro Costo Grupo Productos",this.centrocostogrupoproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.centrocostogrupoproductoBeanSwingJInternalFrame.getContentPane());
				}

				//CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(false);
				this.centrocostogrupoproductoBeanSwingJInternalFrame=null;//new CentroCostoGrupoProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCentroCostoGrupoProducto) {
					this.jTabbedPaneRelacionesLinea.add("Centro Costo Grupo Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionCate(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisioncateSessionBean=new ComisionCateSessionBean();
		this.comisioncateSessionBean.setConGuardarRelaciones(false);
		this.comisioncateSessionBean.setEsGuardarRelacionado(true);

		this.comisioncateBeanSwingJInternalFrame=null;//new ComisionCateBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisioncateBeanSwingJInternalFramePopup=new ComisionCateBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisioncateBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {

				ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisioncateSessionBean.setEsGuardarRelacionado(true);

				this.comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisioncateBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisioncateBeanSwingJInternalFrame.setcomisioncateSessionBean(this.comisioncateSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.comisioncateBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Comision Cates",this.comisioncateBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.comisioncateBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisioncateSessionBean.setEsGuardarRelacionado(false);
				this.comisioncateBeanSwingJInternalFrame=null;//new ComisionCateBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionCate) {
					this.jTabbedPaneRelacionesLinea.add("Comision Cates",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionGrupo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		this.comisiongrupoSessionBean.setConGuardarRelaciones(false);
		this.comisiongrupoSessionBean.setEsGuardarRelacionado(true);

		this.comisiongrupoBeanSwingJInternalFrame=null;//new ComisionGrupoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisiongrupoBeanSwingJInternalFramePopup=new ComisionGrupoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisiongrupoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {

				ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisiongrupoSessionBean.setEsGuardarRelacionado(true);

				this.comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisiongrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisiongrupoBeanSwingJInternalFrame.setcomisiongrupoSessionBean(this.comisiongrupoSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.comisiongrupoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Comision Grupos",this.comisiongrupoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.comisiongrupoBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
				this.comisiongrupoBeanSwingJInternalFrame=null;//new ComisionGrupoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionGrupo) {
					this.jTabbedPaneRelacionesLinea.add("Comision Grupos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionLinea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		this.comisionlineaSessionBean.setConGuardarRelaciones(false);
		this.comisionlineaSessionBean.setEsGuardarRelacionado(true);

		this.comisionlineaBeanSwingJInternalFrame=null;//new ComisionLineaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionlineaBeanSwingJInternalFramePopup=new ComisionLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionlineaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {

				ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionlineaSessionBean.setEsGuardarRelacionado(true);

				this.comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionlineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionlineaBeanSwingJInternalFrame.setcomisionlineaSessionBean(this.comisionlineaSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.comisionlineaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Comision Lineas",this.comisionlineaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.comisionlineaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionlineaSessionBean.setEsGuardarRelacionado(false);
				this.comisionlineaBeanSwingJInternalFrame=null;//new ComisionLineaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionLinea) {
					this.jTabbedPaneRelacionesLinea.add("Comision Lineas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionMarca(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		this.comisionmarcaSessionBean.setConGuardarRelaciones(false);
		this.comisionmarcaSessionBean.setEsGuardarRelacionado(true);

		this.comisionmarcaBeanSwingJInternalFrame=null;//new ComisionMarcaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionmarcaBeanSwingJInternalFramePopup=new ComisionMarcaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionmarcaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {

				ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionmarcaSessionBean.setEsGuardarRelacionado(true);

				this.comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionmarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionmarcaBeanSwingJInternalFrame.setcomisionmarcaSessionBean(this.comisionmarcaSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.comisionmarcaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Comision Marcas",this.comisionmarcaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.comisionmarcaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
				this.comisionmarcaBeanSwingJInternalFrame=null;//new ComisionMarcaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionMarca) {
					this.jTabbedPaneRelacionesLinea.add("Comision Marcas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCuentasContablesLineaProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentascontableslineaproductoSessionBean=new CuentasContablesLineaProductoSessionBean();
		this.cuentascontableslineaproductoSessionBean.setConGuardarRelaciones(false);
		this.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(true);

		this.cuentascontableslineaproductoBeanSwingJInternalFrame=null;//new CuentasContablesLineaProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentascontableslineaproductoBeanSwingJInternalFramePopup=new CuentasContablesLineaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentascontableslineaproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {

				CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(true);

				this.cuentascontableslineaproductoBeanSwingJInternalFrame=new CuentasContablesLineaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentascontableslineaproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentascontableslineaproductoBeanSwingJInternalFrame.setcuentascontableslineaproductoSessionBean(this.cuentascontableslineaproductoSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.cuentascontableslineaproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Cuentas Contables Linea Productoes",this.cuentascontableslineaproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.cuentascontableslineaproductoBeanSwingJInternalFrame.getContentPane());
				}

				//CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(false);
				this.cuentascontableslineaproductoBeanSwingJInternalFrame=null;//new CuentasContablesLineaProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentasContablesLineaProducto) {
					this.jTabbedPaneRelacionesLinea.add("Cuentas Contables Linea Productoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleCodigoBarraProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallecodigobarraproductoSessionBean=new DetalleCodigoBarraProductoSessionBean();
		this.detallecodigobarraproductoSessionBean.setConGuardarRelaciones(false);
		this.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(true);

		this.detallecodigobarraproductoBeanSwingJInternalFrame=null;//new DetalleCodigoBarraProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallecodigobarraproductoBeanSwingJInternalFramePopup=new DetalleCodigoBarraProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallecodigobarraproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {

				DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(true);

				this.detallecodigobarraproductoBeanSwingJInternalFrame=new DetalleCodigoBarraProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallecodigobarraproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallecodigobarraproductoBeanSwingJInternalFrame.setdetallecodigobarraproductoSessionBean(this.detallecodigobarraproductoSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.detallecodigobarraproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Detalle Codigo Barra Productos",this.detallecodigobarraproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.detallecodigobarraproductoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(false);
				this.detallecodigobarraproductoBeanSwingJInternalFrame=null;//new DetalleCodigoBarraProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleCodigoBarraProducto) {
					this.jTabbedPaneRelacionesLinea.add("Detalle Codigo Barra Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(false);
		this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(true);

		this.detalleplaneacioncompraBeanSwingJInternalFrame=null;//new DetallePlaneacionCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleplaneacioncompraBeanSwingJInternalFramePopup=new DetallePlaneacionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleplaneacioncompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {

				DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(true);

				this.detalleplaneacioncompraBeanSwingJInternalFrame=new DetallePlaneacionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleplaneacioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleplaneacioncompraBeanSwingJInternalFrame.setdetalleplaneacioncompraSessionBean(this.detalleplaneacioncompraSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Detalle Planeacion Compras",this.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(false);
				this.detalleplaneacioncompraBeanSwingJInternalFrame=null;//new DetallePlaneacionCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePlaneacionCompra) {
					this.jTabbedPaneRelacionesLinea.add("Detalle Planeacion Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameLinea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.lineaSessionBean=new LineaSessionBean();
		this.lineaSessionBean.setConGuardarRelaciones(false);
		//this.lineaSessionBean.setEsGuardarRelacionado(true);

		this.lineaBeanSwingJInternalFrame=null;//new LineaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.lineaBeanSwingJInternalFramePopup=new LineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.lineaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				LineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.lineaSessionBean.setEsGuardarRelacionado(true);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.lineaBeanSwingJInternalFrame.setlineaSessionBean(this.lineaSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.lineaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Lineas",this.lineaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.lineaBeanSwingJInternalFrame.getContentPane());
				}

				//LineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.lineaSessionBean.setEsGuardarRelacionado(false);
				this.lineaBeanSwingJInternalFrame=null;//new LineaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLinea) {
					this.jTabbedPaneRelacionesLinea.add("Lineas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameLineaPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		this.lineapuntoventaSessionBean.setConGuardarRelaciones(false);
		this.lineapuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.lineapuntoventaBeanSwingJInternalFrame=null;//new LineaPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.lineapuntoventaBeanSwingJInternalFramePopup=new LineaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.lineapuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {

				LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.lineapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.lineapuntoventaBeanSwingJInternalFrame=new LineaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.lineapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.lineapuntoventaBeanSwingJInternalFrame.setlineapuntoventaSessionBean(this.lineapuntoventaSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.lineapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Linea Punto Ventas",this.lineapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.lineapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.lineapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.lineapuntoventaBeanSwingJInternalFrame=null;//new LineaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLineaPuntoVenta) {
					this.jTabbedPaneRelacionesLinea.add("Linea Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.precioSessionBean=new PrecioSessionBean();
		this.precioSessionBean.setConGuardarRelaciones(false);
		this.precioSessionBean.setEsGuardarRelacionado(true);

		this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.precioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.precioSessionBean.getEsGuardarRelacionado()) {

				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.precioSessionBean.setEsGuardarRelacionado(true);

				this.precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.precioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.precioBeanSwingJInternalFrame.setprecioSessionBean(this.precioSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.precioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Precios",this.precioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.precioBeanSwingJInternalFrame.getContentPane());
				}

				//PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.precioSessionBean.setEsGuardarRelacionado(false);
				this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrecio) {
					this.jTabbedPaneRelacionesLinea.add("Precios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoLinea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		this.presupuestolineaSessionBean.setConGuardarRelaciones(false);
		this.presupuestolineaSessionBean.setEsGuardarRelacionado(true);

		this.presupuestolineaBeanSwingJInternalFrame=null;//new PresupuestoLineaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestolineaBeanSwingJInternalFramePopup=new PresupuestoLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestolineaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {

				PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestolineaSessionBean.setEsGuardarRelacionado(true);

				this.presupuestolineaBeanSwingJInternalFrame=new PresupuestoLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestolineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestolineaBeanSwingJInternalFrame.setpresupuestolineaSessionBean(this.presupuestolineaSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.presupuestolineaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Presupuesto Lineaes",this.presupuestolineaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.presupuestolineaBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestolineaSessionBean.setEsGuardarRelacionado(false);
				this.presupuestolineaBeanSwingJInternalFrame=null;//new PresupuestoLineaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoLinea) {
					this.jTabbedPaneRelacionesLinea.add("Presupuesto Lineaes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		this.presupuestoventaslineasSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventaslineasBeanSwingJInternalFrame=null;//new PresupuestoVentasLineasBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventaslineasBeanSwingJInternalFramePopup=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventaslineasBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventaslineasBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventaslineasBeanSwingJInternalFrame.setpresupuestoventaslineasSessionBean(this.presupuestoventaslineasSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Presupuesto Ventas_lineases",this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventaslineasBeanSwingJInternalFrame=null;//new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentasLineas) {
					this.jTabbedPaneRelacionesLinea.add("Presupuesto Ventas_lineases",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoSessionBean=new ProductoSessionBean();
		this.productoSessionBean.setConGuardarRelaciones(false);
		this.productoSessionBean.setEsGuardarRelacionado(true);

		this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoSessionBean.getEsGuardarRelacionado()) {

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesLinea.add("Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		this.productopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.productopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.productopuntoventaBeanSwingJInternalFrame=null;//new ProductoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productopuntoventaBeanSwingJInternalFramePopup=new ProductoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {

				ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.productopuntoventaBeanSwingJInternalFrame=new ProductoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productopuntoventaBeanSwingJInternalFrame.setproductopuntoventaSessionBean(this.productopuntoventaSessionBean);

				//this.gridBagConstraintsLinea = new GridBagConstraints();
				//this.gridBagConstraintsLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLinea.gridx = 0;
				//this.jContentPaneDetalleLinea.add(this.productopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLinea.add("Producto Punto Ventas",this.productopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLinea.setComponentAt(iIndexTab,this.productopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.productopuntoventaBeanSwingJInternalFrame=null;//new ProductoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoPuntoVenta) {
					this.jTabbedPaneRelacionesLinea.add("Producto Punto Ventas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPresupuestoLineaBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,PresupuestoLineaBeanSwingJInternalFrame presupuestolineaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestolineaBeanSwingJInternalFrame=new PresupuestoLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestolineaBeanSwingJInternalFrame.getPresupuestoLineaLogic().setConnexion(this.lineaLogic.getConnexion());

					presupuestolineaBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					presupuestolineaBeanSwingJInternalFrame.setlineaForeignKey(linea);
					presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestolineaBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoLinea(presupuestolineaBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestolineaBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					presupuestolineaBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						presupuestolineaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestolineaBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					presupuestolineaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestolineaBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					presupuestolineaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					presupuestolineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoLinea(true);
					presupuestolineaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoLinea("n",presupuestolineaBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestolineaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestolineaBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestolineaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestolineaBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoLinea("relacionado");
					} else {
						presupuestolineaBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoLinea("no_relacionado");
					}

					presupuestolineaBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoLinea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarLineaBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.lineaLogic.getConnexion());

					lineaBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					lineaBeanSwingJInternalFrame.setlineaForeignKey(linea);
					lineaBeanSwingJInternalFrame.lineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					lineaBeanSwingJInternalFrame.lineaSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					lineaBeanSwingJInternalFrame.cargarCombosForeignKeyLinea(lineaBeanSwingJInternalFrame.isCargarCombosDependencia);
					lineaBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					lineaBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						lineaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					lineaBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					lineaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					lineaBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					lineaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea(true);
					lineaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLinea("n",lineaBeanSwingJInternalFrame.isGuardarCambiosEnLote, lineaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					lineaBeanSwingJInternalFrame.setAutoscrolls(true);
					lineaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						lineaBeanSwingJInternalFrame.actualizarEstadoPanelsLinea("relacionado");
					} else {
						lineaBeanSwingJInternalFrame.actualizarEstadoPanelsLinea("no_relacionado");
					}

					lineaBeanSwingJInternalFrame.getjButtonRecargarInformacionLinea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionGrupoBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisiongrupoBeanSwingJInternalFrame.getComisionGrupoLogic().setConnexion(this.lineaLogic.getConnexion());

					comisiongrupoBeanSwingJInternalFrame.setlineagruposForeignKey(lineas);
					comisiongrupoBeanSwingJInternalFrame.setlineagrupoForeignKey(linea);
					comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setisBusquedaDesdeForeignKeySesionLineaGrupo(true);
					comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setlidLineaGrupoActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisiongrupoBeanSwingJInternalFrame.cargarCombosForeignKeyComisionGrupo(comisiongrupoBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisiongrupoBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaGrupo(true);
					comisiongrupoBeanSwingJInternalFrame.setid_linea_grupoFK_IdLineaGrupo(linea.getId());

					if(!this.conCargarFormDetalle) {
						comisiongrupoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisiongrupoBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaGrupoForeignKey(linea,1,false,true,true);
					comisiongrupoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisiongrupoBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					comisiongrupoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(true);
					comisiongrupoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionGrupo("n",comisiongrupoBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisiongrupoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisiongrupoBeanSwingJInternalFrame.setAutoscrolls(true);
					comisiongrupoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("relacionado");
					} else {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("no_relacionado");
					}

					comisiongrupoBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionGrupo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoPuntoVentaBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,ProductoPuntoVentaBeanSwingJInternalFrame productopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productopuntoventaBeanSwingJInternalFrame=new ProductoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productopuntoventaBeanSwingJInternalFrame.getProductoPuntoVentaLogic().setConnexion(this.lineaLogic.getConnexion());

					productopuntoventaBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					productopuntoventaBeanSwingJInternalFrame.setlineaForeignKey(linea);
					productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoPuntoVenta(productopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					productopuntoventaBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						productopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					productopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					productopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					productopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoPuntoVenta(true);
					productopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoPuntoVenta("n",productopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					productopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoPuntoVenta("relacionado");
					} else {
						productopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoPuntoVenta("no_relacionado");
					}

					productopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionLineaBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionlineaBeanSwingJInternalFrame.getComisionLineaLogic().setConnexion(this.lineaLogic.getConnexion());

					comisionlineaBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					comisionlineaBeanSwingJInternalFrame.setlineaForeignKey(linea);
					comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionlineaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionLinea(comisionlineaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionlineaBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					comisionlineaBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						comisionlineaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionlineaBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					comisionlineaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionlineaBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					comisionlineaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(true);
					comisionlineaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionLinea("n",comisionlineaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionlineaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionlineaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionlineaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("relacionado");
					} else {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("no_relacionado");
					}

					comisionlineaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionLinea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionCateBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisioncateBeanSwingJInternalFrame.getComisionCateLogic().setConnexion(this.lineaLogic.getConnexion());

					comisioncateBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					comisioncateBeanSwingJInternalFrame.setlineaForeignKey(linea);
					comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisioncateBeanSwingJInternalFrame.cargarCombosForeignKeyComisionCate(comisioncateBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisioncateBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					comisioncateBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						comisioncateBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisioncateBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					comisioncateBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisioncateBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					comisioncateBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(true);
					comisioncateBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionCate("n",comisioncateBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisioncateBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisioncateBeanSwingJInternalFrame.setAutoscrolls(true);
					comisioncateBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("relacionado");
					} else {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("no_relacionado");
					}

					comisioncateBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionCate().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetallePlaneacionCompraBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleplaneacioncompraBeanSwingJInternalFrame=new DetallePlaneacionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleplaneacioncompraBeanSwingJInternalFrame.getDetallePlaneacionCompraLogic().setConnexion(this.lineaLogic.getConnexion());

					detalleplaneacioncompraBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					detalleplaneacioncompraBeanSwingJInternalFrame.setlineaForeignKey(linea);
					detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleplaneacioncompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePlaneacionCompra(detalleplaneacioncompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleplaneacioncompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						detalleplaneacioncompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleplaneacioncompraBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					detalleplaneacioncompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleplaneacioncompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					detalleplaneacioncompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					detalleplaneacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePlaneacionCompra(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n",detalleplaneacioncompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleplaneacioncompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleplaneacioncompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePlaneacionCompra("relacionado");
					} else {
						detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePlaneacionCompra("no_relacionado");
					}

					detalleplaneacioncompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePlaneacionCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCuentasContablesLineaProductoBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,CuentasContablesLineaProductoBeanSwingJInternalFrame cuentascontableslineaproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentascontableslineaproductoBeanSwingJInternalFrame=new CuentasContablesLineaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentascontableslineaproductoBeanSwingJInternalFrame.getCuentasContablesLineaProductoLogic().setConnexion(this.lineaLogic.getConnexion());

					cuentascontableslineaproductoBeanSwingJInternalFrame.setlineacategoriasForeignKey(lineas);
					cuentascontableslineaproductoBeanSwingJInternalFrame.setlineacategoriaForeignKey(linea);
					cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.setisBusquedaDesdeForeignKeySesionLineaCategoria(true);
					cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.setlidLineaCategoriaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentascontableslineaproductoBeanSwingJInternalFrame.cargarCombosForeignKeyCuentasContablesLineaProducto(cuentascontableslineaproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentascontableslineaproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaCategoria(true);
					cuentascontableslineaproductoBeanSwingJInternalFrame.setid_linea_categoriaFK_IdLineaCategoria(linea.getId());

					if(!this.conCargarFormDetalle) {
						cuentascontableslineaproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentascontableslineaproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaCategoriaForeignKey(linea,1,false,true,true);
					cuentascontableslineaproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentascontableslineaproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					cuentascontableslineaproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					cuentascontableslineaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentasContablesLineaProducto(true);
					cuentascontableslineaproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentasContablesLineaProducto("n",cuentascontableslineaproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentascontableslineaproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentascontableslineaproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentascontableslineaproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentascontableslineaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentasContablesLineaProducto("relacionado");
					} else {
						cuentascontableslineaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentasContablesLineaProducto("no_relacionado");
					}

					cuentascontableslineaproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentasContablesLineaProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPrecioBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					precioBeanSwingJInternalFrame.getPrecioLogic().setConnexion(this.lineaLogic.getConnexion());

					precioBeanSwingJInternalFrame.setlineagruposForeignKey(lineas);
					precioBeanSwingJInternalFrame.setlineagrupoForeignKey(linea);
					precioBeanSwingJInternalFrame.precioSessionBean.setisBusquedaDesdeForeignKeySesionLineaGrupo(true);
					precioBeanSwingJInternalFrame.precioSessionBean.setlidLineaGrupoActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					precioBeanSwingJInternalFrame.cargarCombosForeignKeyPrecio(precioBeanSwingJInternalFrame.isCargarCombosDependencia);
					precioBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaGrupo(true);
					precioBeanSwingJInternalFrame.setid_linea_grupoFK_IdLineaGrupo(linea.getId());

					if(!this.conCargarFormDetalle) {
						precioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					precioBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaGrupoForeignKey(linea,1,false,true,true);
					precioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					precioBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					precioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(true);
					precioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrecio("n",precioBeanSwingJInternalFrame.isGuardarCambiosEnLote, precioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					precioBeanSwingJInternalFrame.setAutoscrolls(true);
					precioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("relacionado");
					} else {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");
					}

					precioBeanSwingJInternalFrame.getjButtonRecargarInformacionPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarLineaPuntoVentaBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,LineaPuntoVentaBeanSwingJInternalFrame lineapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//lineapuntoventaBeanSwingJInternalFrame=new LineaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					lineapuntoventaBeanSwingJInternalFrame.getLineaPuntoVentaLogic().setConnexion(this.lineaLogic.getConnexion());

					lineapuntoventaBeanSwingJInternalFrame.setlineamarcasForeignKey(lineas);
					lineapuntoventaBeanSwingJInternalFrame.setlineamarcaForeignKey(linea);
					lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionLineaMarca(true);
					lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.setlidLineaMarcaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					lineapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyLineaPuntoVenta(lineapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					lineapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaMarca(true);
					lineapuntoventaBeanSwingJInternalFrame.setid_linea_marcaFK_IdLineaMarca(linea.getId());

					if(!this.conCargarFormDetalle) {
						lineapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					lineapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaMarcaForeignKey(linea,1,false,true,true);
					lineapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					lineapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					lineapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					lineapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaPuntoVenta(true);
					lineapuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLineaPuntoVenta("n",lineapuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, lineapuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					lineapuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					lineapuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						lineapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaPuntoVenta("relacionado");
					} else {
						lineapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaPuntoVenta("no_relacionado");
					}

					lineapuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionLineaPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleCodigoBarraProductoBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,DetalleCodigoBarraProductoBeanSwingJInternalFrame detallecodigobarraproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallecodigobarraproductoBeanSwingJInternalFrame=new DetalleCodigoBarraProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallecodigobarraproductoBeanSwingJInternalFrame.getDetalleCodigoBarraProductoLogic().setConnexion(this.lineaLogic.getConnexion());

					detallecodigobarraproductoBeanSwingJInternalFrame.setlineamarcasForeignKey(lineas);
					detallecodigobarraproductoBeanSwingJInternalFrame.setlineamarcaForeignKey(linea);
					detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.setisBusquedaDesdeForeignKeySesionLineaMarca(true);
					detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.setlidLineaMarcaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallecodigobarraproductoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleCodigoBarraProducto(detallecodigobarraproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallecodigobarraproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaMarca(true);
					detallecodigobarraproductoBeanSwingJInternalFrame.setid_linea_marcaFK_IdLineaMarca(linea.getId());

					if(!this.conCargarFormDetalle) {
						detallecodigobarraproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallecodigobarraproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaMarcaForeignKey(linea,1,false,true,true);
					detallecodigobarraproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallecodigobarraproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					detallecodigobarraproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					detallecodigobarraproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCodigoBarraProducto(true);
					detallecodigobarraproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleCodigoBarraProducto("n",detallecodigobarraproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallecodigobarraproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallecodigobarraproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					detallecodigobarraproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallecodigobarraproductoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCodigoBarraProducto("relacionado");
					} else {
						detallecodigobarraproductoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCodigoBarraProducto("no_relacionado");
					}

					detallecodigobarraproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleCodigoBarraProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoVentasLineasBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventaslineasBeanSwingJInternalFrame.getPresupuestoVentasLineasLogic().setConnexion(this.lineaLogic.getConnexion());

					presupuestoventaslineasBeanSwingJInternalFrame.setlineamarcasForeignKey(lineas);
					presupuestoventaslineasBeanSwingJInternalFrame.setlineamarcaForeignKey(linea);
					presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setisBusquedaDesdeForeignKeySesionLineaMarca(true);
					presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setlidLineaMarcaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventaslineasBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentasLineas(presupuestoventaslineasBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventaslineasBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaMarca(true);
					presupuestoventaslineasBeanSwingJInternalFrame.setid_linea_marcaFK_IdLineaMarca(linea.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventaslineasBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventaslineasBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaMarcaForeignKey(linea,1,false,true,true);
					presupuestoventaslineasBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventaslineasBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					presupuestoventaslineasBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(true);
					presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentasLineas("n",presupuestoventaslineasBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventaslineasBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventaslineasBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventaslineasBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("relacionado");
					} else {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("no_relacionado");
					}

					presupuestoventaslineasBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentasLineas().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCentroCostoGrupoProductoBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,CentroCostoGrupoProductoBeanSwingJInternalFrame centrocostogrupoproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//centrocostogrupoproductoBeanSwingJInternalFrame=new CentroCostoGrupoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					centrocostogrupoproductoBeanSwingJInternalFrame.getCentroCostoGrupoProductoLogic().setConnexion(this.lineaLogic.getConnexion());

					centrocostogrupoproductoBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					centrocostogrupoproductoBeanSwingJInternalFrame.setlineaForeignKey(linea);
					centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					centrocostogrupoproductoBeanSwingJInternalFrame.cargarCombosForeignKeyCentroCostoGrupoProducto(centrocostogrupoproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					centrocostogrupoproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					centrocostogrupoproductoBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						centrocostogrupoproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					centrocostogrupoproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					centrocostogrupoproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					centrocostogrupoproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					centrocostogrupoproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					centrocostogrupoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCostoGrupoProducto(true);
					centrocostogrupoproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n",centrocostogrupoproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, centrocostogrupoproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					centrocostogrupoproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					centrocostogrupoproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						centrocostogrupoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsCentroCostoGrupoProducto("relacionado");
					} else {
						centrocostogrupoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsCentroCostoGrupoProducto("no_relacionado");
					}

					centrocostogrupoproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionCentroCostoGrupoProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.lineaLogic.getConnexion());

					productoBeanSwingJInternalFrame.setlineasForeignKey(lineas);
					productoBeanSwingJInternalFrame.setlineaForeignKey(linea);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidLineaActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaLinea(true);
					productoBeanSwingJInternalFrame.setid_lineaFK_IdLinea(linea.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaForeignKey(linea,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(true);
					productoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProducto("n",productoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("relacionado");
					} else {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");
					}

					productoBeanSwingJInternalFrame.getjButtonRecargarInformacionProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionMarcaBeanSwingJInternalFrame(List<Linea> lineas,Linea linea,ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionmarcaBeanSwingJInternalFrame.getComisionMarcaLogic().setConnexion(this.lineaLogic.getConnexion());

					comisionmarcaBeanSwingJInternalFrame.setlineagruposForeignKey(lineas);
					comisionmarcaBeanSwingJInternalFrame.setlineagrupoForeignKey(linea);
					comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setisBusquedaDesdeForeignKeySesionLineaGrupo(true);
					comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setlidLineaGrupoActual(linea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionmarcaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionMarca(comisionmarcaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionmarcaBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaGrupo(true);
					comisionmarcaBeanSwingJInternalFrame.setid_linea_grupoFK_IdLineaGrupo(linea.getId());

					if(!this.conCargarFormDetalle) {
						comisionmarcaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionmarcaBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaGrupoForeignKey(linea,1,false,true,true);
					comisionmarcaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionmarcaBeanSwingJInternalFrame.procesarBusqueda("FK_IdLinea");
					comisionmarcaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLinea");
					comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(true);
					comisionmarcaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionMarca("n",comisionmarcaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionmarcaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionmarcaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionmarcaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("relacionado");
					} else {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("no_relacionado");
					}

					comisionmarcaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionMarca().setVisible(false);

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
